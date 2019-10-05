package typings.leafletDashAreaselect.leafletMod

import typings.leaflet.leafletMod.LatLngBounds
import typings.leaflet.leafletMod.Map
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AreaSelect extends js.Object {
  def addTo(map: Map): Map
  def getBounds(): LatLngBounds
  def remove(): Unit
  def setDimensions(dim: Dimension): Unit
}

object AreaSelect {
  @scala.inline
  def apply(
    addTo: Map => Map,
    getBounds: () => LatLngBounds,
    remove: () => Unit,
    setDimensions: Dimension => Unit
  ): AreaSelect = {
    val __obj = js.Dynamic.literal(addTo = js.Any.fromFunction1(addTo), getBounds = js.Any.fromFunction0(getBounds), remove = js.Any.fromFunction0(remove), setDimensions = js.Any.fromFunction1(setDimensions))
  
    __obj.asInstanceOf[AreaSelect]
  }
}

@JSImport("leaflet", "areaSelect")
@js.native
object areaSelect extends js.Object {
  def apply(box: AreaSelectOptions): AreaSelect = js.native
}

