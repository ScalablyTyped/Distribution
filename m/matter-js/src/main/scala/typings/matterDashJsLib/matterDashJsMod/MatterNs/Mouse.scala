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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("absolute")(absolute)
    __obj.updateDynamic("button")(button)
    __obj.updateDynamic("element")(element)
    __obj.updateDynamic("mousedownPosition")(mousedownPosition)
    __obj.updateDynamic("mouseupPosition")(mouseupPosition)
    __obj.updateDynamic("offset")(offset)
    __obj.updateDynamic("pixelRatio")(pixelRatio)
    __obj.updateDynamic("position")(position)
    __obj.updateDynamic("scale")(scale)
    __obj.updateDynamic("wheelDelta")(wheelDelta)
    __obj.asInstanceOf[Mouse]
  }
}

