package typings.jsfl

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Context extends js.Object {
  var elements: js.Array[FlashElement]
  var frame: FlashFrame
  var keyframes: js.Array[FlashFrame]
  var layer: FlashLayer
  def goto(): js.Any
  def setLayer(index: Double): js.Any
  def update(): js.Any
}

object Context {
  @scala.inline
  def apply(
    elements: js.Array[FlashElement],
    frame: FlashFrame,
    goto: () => js.Any,
    keyframes: js.Array[FlashFrame],
    layer: FlashLayer,
    setLayer: Double => js.Any,
    update: () => js.Any
  ): Context = {
    val __obj = js.Dynamic.literal(elements = elements.asInstanceOf[js.Any], frame = frame.asInstanceOf[js.Any], goto = js.Any.fromFunction0(goto), keyframes = keyframes.asInstanceOf[js.Any], layer = layer.asInstanceOf[js.Any], setLayer = js.Any.fromFunction1(setLayer), update = js.Any.fromFunction0(update))
    __obj.asInstanceOf[Context]
  }
}

