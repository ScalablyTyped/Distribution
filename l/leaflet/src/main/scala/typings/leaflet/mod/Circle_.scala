package typings.leaflet.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("leaflet", "Circle")
@js.native
class Circle_[P] protected () extends CircleMarker_[P] {
  def this(latlng: LatLngExpression) = this()
  def this(latlng: LatLngExpression, options: CircleMarkerOptions) = this()
  def this(latlng: LatLngExpression, radius: Double) = this()
  def this(latlng: LatLngExpression, radius: Double, options: CircleMarkerOptions) = this()
  
  // deprecated!
  def getBounds(): LatLngBounds_ = js.native
}
