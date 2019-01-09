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

