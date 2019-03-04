package typings
package matterDashJsLib.matterDashJsMod.MatterNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Mouse extends js.Object {
  var absolute: IMousePoint
  var button: scala.Double
  var element: stdLib.HTMLElement
  var mousedownPosition: IMousePoint
  var mouseupPosition: IMousePoint
  var offset: IMousePoint
  var pixelRatio: scala.Double
  var position: IMousePoint
  var scale: IMousePoint
  var wheelDelta: scala.Double
}

object Mouse {
  @scala.inline
  def apply(
    absolute: IMousePoint,
    button: scala.Double,
    element: stdLib.HTMLElement,
    mousedownPosition: IMousePoint,
    mouseupPosition: IMousePoint,
    offset: IMousePoint,
    pixelRatio: scala.Double,
    position: IMousePoint,
    scale: IMousePoint,
    wheelDelta: scala.Double
  ): Mouse = {
    val __obj = js.Dynamic.literal(absolute = absolute, button = button, element = element, mousedownPosition = mousedownPosition, mouseupPosition = mouseupPosition, offset = offset, pixelRatio = pixelRatio, position = position, scale = scale, wheelDelta = wheelDelta)
  
    __obj.asInstanceOf[Mouse]
  }
}

