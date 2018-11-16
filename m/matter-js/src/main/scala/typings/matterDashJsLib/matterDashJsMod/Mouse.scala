package typings
package matterDashJsLib.matterDashJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("matter-js", "Mouse")
@js.native
class Mouse ()
  extends matterDashJsLib.matterDashJsMod.MatterNs.Mouse {
  /* CompleteClass */
  override var absolute: matterDashJsLib.matterDashJsMod.MatterNs.IMousePoint = js.native
  /* CompleteClass */
  override var button: scala.Double = js.native
  /* CompleteClass */
  override var element: stdLib.HTMLElement = js.native
  /* CompleteClass */
  override var mousedownPosition: matterDashJsLib.matterDashJsMod.MatterNs.IMousePoint = js.native
  /* CompleteClass */
  override var mouseupPosition: matterDashJsLib.matterDashJsMod.MatterNs.IMousePoint = js.native
  /* CompleteClass */
  override var offset: matterDashJsLib.matterDashJsMod.MatterNs.IMousePoint = js.native
  /* CompleteClass */
  override var pixelRatio: scala.Double = js.native
  /* CompleteClass */
  override var position: matterDashJsLib.matterDashJsMod.MatterNs.IMousePoint = js.native
  /* CompleteClass */
  override var scale: matterDashJsLib.matterDashJsMod.MatterNs.IMousePoint = js.native
  /* CompleteClass */
  override var wheelDelta: scala.Double = js.native
}

@JSImport("matter-js", "Mouse")
@js.native
object Mouse extends js.Object {
  def clearSourceEvents(mouse: matterDashJsLib.matterDashJsMod.MatterNs.Mouse): scala.Unit = js.native
  def create(element: stdLib.HTMLElement): matterDashJsLib.matterDashJsMod.MatterNs.Mouse = js.native
  def setElement(mouse: matterDashJsLib.matterDashJsMod.MatterNs.Mouse, element: stdLib.HTMLElement): scala.Unit = js.native
  def setOffset(
    mouse: matterDashJsLib.matterDashJsMod.MatterNs.Mouse,
    offset: matterDashJsLib.matterDashJsMod.MatterNs.Vector
  ): scala.Unit = js.native
  def setScale(
    mouse: matterDashJsLib.matterDashJsMod.MatterNs.Mouse,
    scale: matterDashJsLib.matterDashJsMod.MatterNs.Vector
  ): scala.Unit = js.native
}

