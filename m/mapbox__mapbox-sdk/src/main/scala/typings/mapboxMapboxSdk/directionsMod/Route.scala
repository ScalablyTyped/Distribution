package typings.mapboxMapboxSdk.directionsMod

import typings.geojson.mod.LineString
import typings.geojson.mod.MultiLineString
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Route extends StObject {
  
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
  implicit class RouteMutableBuilder[Self <: Route] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDistance(value: Double): Self = StObject.set(x, "distance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGeometry(value: LineString | MultiLineString): Self = StObject.set(x, "geometry", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLegs(value: js.Array[Leg]): Self = StObject.set(x, "legs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLegsVarargs(value: Leg*): Self = StObject.set(x, "legs", js.Array(value :_*))
    
    @scala.inline
    def setVoiceLocale(value: String): Self = StObject.set(x, "voiceLocale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVoiceLocaleUndefined: Self = StObject.set(x, "voiceLocale", js.undefined)
    
    @scala.inline
    def setWeight(value: Double): Self = StObject.set(x, "weight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWeight_name(value: String): Self = StObject.set(x, "weight_name", value.asInstanceOf[js.Any])
  }
}
