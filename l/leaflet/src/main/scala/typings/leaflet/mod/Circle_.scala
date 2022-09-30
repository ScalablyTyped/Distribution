package typings.leaflet.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("leaflet", "Circle")
@js.native
open class Circle_[P] protected () extends CircleMarker_[P] {
  def this(latlng: LatLngExpression) = this()
  def this(latlng: LatLngExpression, options: CircleOptions) = this()
  def this(latlng: LatLngExpression, radius: Double) = this()
  def this(latlng: LatLngExpression, radius: Double, options: CircleOptions) = this()
  
  def getBounds(): LatLngBounds_ = js.native
}
