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
    close: js.Function0[scala.Unit],
    onAdd: js.Function1[leafletLib.leafletMod.Map, scala.Unit],
    onRemove: js.Function1[leafletLib.leafletMod.Map, scala.Unit],
    setContent: js.Function1[java.lang.String, Label],
    setLatLng: js.Function1[leafletLib.leafletMod.LatLng, Label],
    setOpacity: js.Function1[scala.Double, scala.Unit],
    updateZIndex: js.Function1[scala.Double, scala.Unit]
  ): Label = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("close")(close)
    __obj.updateDynamic("onAdd")(onAdd)
    __obj.updateDynamic("onRemove")(onRemove)
    __obj.updateDynamic("setContent")(setContent)
    __obj.updateDynamic("setLatLng")(setLatLng)
    __obj.updateDynamic("setOpacity")(setOpacity)
    __obj.updateDynamic("updateZIndex")(updateZIndex)
    __obj.asInstanceOf[Label]
  }
}

