package typings
package leafletDashAreaselectLib.leafletMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AreaSelect extends js.Object {
  def addTo(map: leafletLib.leafletMod.Map): leafletLib.leafletMod.Map
  def getBounds(): leafletLib.leafletMod.LatLngBounds
  def remove(): scala.Unit
  def setDimensions(dim: Dimension): scala.Unit
}

object AreaSelect {
  @scala.inline
  def apply(
    addTo: leafletLib.leafletMod.Map => leafletLib.leafletMod.Map,
    getBounds: () => leafletLib.leafletMod.LatLngBounds,
    remove: () => scala.Unit,
    setDimensions: Dimension => scala.Unit
  ): AreaSelect = {
    val __obj = js.Dynamic.literal(addTo = js.Any.fromFunction1(addTo), getBounds = js.Any.fromFunction0(getBounds), remove = js.Any.fromFunction0(remove), setDimensions = js.Any.fromFunction1(setDimensions))
  
    __obj.asInstanceOf[AreaSelect]
  }
}

