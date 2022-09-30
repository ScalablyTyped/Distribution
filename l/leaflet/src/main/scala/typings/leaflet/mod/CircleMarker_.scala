package typings.leaflet.mod

import typings.geojson.mod.Feature
import typings.geojson.mod.Point
import typings.leaflet.leafletBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("leaflet", "CircleMarker")
@js.native
open class CircleMarker_[P] protected () extends Path {
  def this(latlng: LatLngExpression) = this()
  def this(latlng: LatLngExpression, options: CircleMarkerOptions) = this()
  
  var feature: js.UndefOr[Feature[Point, P]] = js.native
  
  def getLatLng(): LatLng_ = js.native
  
  def getRadius(): Double = js.native
  
  @JSName("options")
  var options_CircleMarker_ : CircleMarkerOptions = js.native
  
  def setLatLng(latLng: LatLngExpression): this.type = js.native
  
  def setRadius(radius: Double): this.type = js.native
  
  def setStyle(options: CircleMarkerOptions): this.type = js.native
  
  def toGeoJSON(): Feature[Point, P] = js.native
  def toGeoJSON(precision: Double): Feature[Point, P] = js.native
  @JSName("toGeoJSON")
  def toGeoJSON_false(precision: `false`): Feature[Point, P] = js.native
}
