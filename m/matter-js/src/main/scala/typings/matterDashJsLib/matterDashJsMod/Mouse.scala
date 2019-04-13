package typings
package matterDashJsLib.matterDashJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("matter-js", "Mouse")
@js.native
class Mouse () extends js.Object {
  var absolute: IMousePoint = js.native
  var button: scala.Double = js.native
  var element: stdLib.HTMLElement = js.native
  var mousedownPosition: IMousePoint = js.native
  var mouseupPosition: IMousePoint = js.native
  var offset: IMousePoint = js.native
  var pixelRatio: scala.Double = js.native
  var position: IMousePoint = js.native
  var scale: IMousePoint = js.native
  var wheelDelta: scala.Double = js.native
}

/* static members */
@JSImport("matter-js", "Mouse")
@js.native
object Mouse extends js.Object {
  def clearSourceEvents(mouse: matterDashJsLib.matterDashJsMod.Mouse): scala.Unit = js.native
  def create(element: stdLib.HTMLElement): matterDashJsLib.matterDashJsMod.Mouse = js.native
  def setElement(mouse: matterDashJsLib.matterDashJsMod.Mouse, element: stdLib.HTMLElement): scala.Unit = js.native
  def setOffset(mouse: matterDashJsLib.matterDashJsMod.Mouse, offset: matterDashJsLib.matterDashJsMod.Vector): scala.Unit = js.native
  def setScale(mouse: matterDashJsLib.matterDashJsMod.Mouse, scale: matterDashJsLib.matterDashJsMod.Vector): scala.Unit = js.native
}

