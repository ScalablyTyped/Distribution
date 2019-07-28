package typings.leafletDashLabel.leafletMod

import typings.leaflet.leafletMod.LatLng
import typings.leaflet.leafletMod.Map
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped any */ trait Label extends js.Object {
  def close(): Unit
  def onAdd(map: Map): Unit
  def onRemove(map: Map): Unit
  def setContent(content: String): Label
  def setLatLng(latlng: LatLng): Label
  def setOpacity(opacity: Double): Unit
  def updateZIndex(zIndex: Double): Unit
}

object Label {
  @scala.inline
  def apply(
    close: () => Unit,
    onAdd: Map => Unit,
    onRemove: Map => Unit,
    setContent: String => Label,
    setLatLng: LatLng => Label,
    setOpacity: Double => Unit,
    updateZIndex: Double => Unit
  ): Label = {
    val __obj = js.Dynamic.literal(close = js.Any.fromFunction0(close), onAdd = js.Any.fromFunction1(onAdd), onRemove = js.Any.fromFunction1(onRemove), setContent = js.Any.fromFunction1(setContent), setLatLng = js.Any.fromFunction1(setLatLng), setOpacity = js.Any.fromFunction1(setOpacity), updateZIndex = js.Any.fromFunction1(updateZIndex))
  
    __obj.asInstanceOf[Label]
  }
}

