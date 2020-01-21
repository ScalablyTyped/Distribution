package typings.leafletAreaselect.mod

import typings.leaflet.mod.LatLngBounds_
import typings.leaflet.mod.Map_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AreaSelect_ extends js.Object {
  def addTo(map: Map_): Map_
  def getBounds(): LatLngBounds_
  def remove(): Unit
  def setDimensions(dim: Dimension): Unit
}

object AreaSelect_ {
  @scala.inline
  def apply(
    addTo: Map_ => Map_,
    getBounds: () => LatLngBounds_,
    remove: () => Unit,
    setDimensions: Dimension => Unit
  ): AreaSelect_ = {
    val __obj = js.Dynamic.literal(addTo = js.Any.fromFunction1(addTo), getBounds = js.Any.fromFunction0(getBounds), remove = js.Any.fromFunction0(remove), setDimensions = js.Any.fromFunction1(setDimensions))
  
    __obj.asInstanceOf[AreaSelect_]
  }
}

