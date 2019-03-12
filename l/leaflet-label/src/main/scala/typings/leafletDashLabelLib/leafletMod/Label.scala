package typings
package leafletDashLabelLib.leafletMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped any */ trait Label extends js.Object {
  def close(): scala.Unit
  def onAdd(map: leafletLib.leafletMod.Map): scala.Unit
  def onRemove(map: leafletLib.leafletMod.Map): scala.Unit
  def setContent(content: java.lang.String): Label
  def setLatLng(latlng: leafletLib.leafletMod.LatLng): Label
  def setOpacity(opacity: scala.Double): scala.Unit
  def updateZIndex(zIndex: scala.Double): scala.Unit
}

object Label {
  @scala.inline
  def apply(
    close: () => scala.Unit,
    onAdd: leafletLib.leafletMod.Map => scala.Unit,
    onRemove: leafletLib.leafletMod.Map => scala.Unit,
    setContent: java.lang.String => Label,
    setLatLng: leafletLib.leafletMod.LatLng => Label,
    setOpacity: scala.Double => scala.Unit,
    updateZIndex: scala.Double => scala.Unit
  ): Label = {
    val __obj = js.Dynamic.literal(close = js.Any.fromFunction0(close), onAdd = js.Any.fromFunction1(onAdd), onRemove = js.Any.fromFunction1(onRemove), setContent = js.Any.fromFunction1(setContent), setLatLng = js.Any.fromFunction1(setLatLng), setOpacity = js.Any.fromFunction1(setOpacity), updateZIndex = js.Any.fromFunction1(updateZIndex))
  
    __obj.asInstanceOf[Label]
  }
}

