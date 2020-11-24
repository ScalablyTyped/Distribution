package typings.mapboxMapboxSdk.directionsMod

import typings.geojson.mod.LineString
import typings.geojson.mod.MultiLineString
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Route extends js.Object {
  
  /**
    * Float indicating the distance traveled in meters.
    */
  var distance: Double = js.native
  
  /**
    * Float indicating the estimated travel time in seconds.
    */
  var duration: Double = js.native
  
  /**
    * Depending on the geometries parameter this is a GeoJSON LineString or a Polyline string.
    * Depending on the overview parameter this is the complete route geometry (full), a simplified geometry
    * to the zoom level at which the route can be displayed in full (simplified), or is not included (false)
    */
  var geometry: LineString | MultiLineString = js.native
  
  /**
    * Array of RouteLeg objects.
    */
  var legs: js.Array[Leg] = js.native
  
  /**
    * String of the locale used for voice instructions. Defaults to en, and can be any accepted instruction language.
    */
  var voiceLocale: js.UndefOr[String] = js.native
  
  /**
    * Float indicating the weight in units described by weight_name
    */
  var weight: Double = js.native
  
  /**
    * String indicating which weight was used. The default is routability which is duration-based,
    * with additional penalties for less desirable maneuvers.
    */
  var weight_name: String = js.native
}
object Route {
  
  @scala.inline
  def apply(
    distance: Double,
    duration: Double,
    geometry: LineString | MultiLineString,
    legs: js.Array[Leg],
    weight: Double,
    weight_name: String
  ): Route = {
    val __obj = js.Dynamic.literal(distance = distance.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], geometry = geometry.asInstanceOf[js.Any], legs = legs.asInstanceOf[js.Any], weight = weight.asInstanceOf[js.Any], weight_name = weight_name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Route]
  }
  
  @scala.inline
  implicit class RouteOps[Self <: Route] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDistance(value: Double): Self = this.set("distance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDuration(value: Double): Self = this.set("duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGeometry(value: LineString | MultiLineString): Self = this.set("geometry", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLegsVarargs(value: Leg*): Self = this.set("legs", js.Array(value :_*))
    
    @scala.inline
    def setLegs(value: js.Array[Leg]): Self = this.set("legs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWeight(value: Double): Self = this.set("weight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWeight_name(value: String): Self = this.set("weight_name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVoiceLocale(value: String): Self = this.set("voiceLocale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVoiceLocale: Self = this.set("voiceLocale", js.undefined)
  }
}
