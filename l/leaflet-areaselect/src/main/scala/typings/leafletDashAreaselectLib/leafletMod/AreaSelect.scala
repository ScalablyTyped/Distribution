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
    addTo: js.Function1[leafletLib.leafletMod.Map, leafletLib.leafletMod.Map],
    getBounds: js.Function0[leafletLib.leafletMod.LatLngBounds],
    remove: js.Function0[scala.Unit],
    setDimensions: js.Function1[Dimension, scala.Unit]
  ): AreaSelect = {
    val __obj = js.Dynamic.literal(addTo = addTo, getBounds = getBounds, remove = remove, setDimensions = setDimensions)
  
    __obj.asInstanceOf[AreaSelect]
  }
}

