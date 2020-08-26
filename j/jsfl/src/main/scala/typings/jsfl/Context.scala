package typings.jsfl

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Context extends js.Object {
  var elements: js.Array[FlashElement] = js.native
  var frame: FlashFrame = js.native
  var keyframes: js.Array[FlashFrame] = js.native
  var layer: FlashLayer = js.native
  def goto(): js.Any = js.native
  def setLayer(index: Double): js.Any = js.native
  def update(): js.Any = js.native
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
  @scala.inline
  implicit class ContextOps[Self <: Context] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setElementsVarargs(value: FlashElement*): Self = this.set("elements", js.Array(value :_*))
    @scala.inline
    def setElements(value: js.Array[FlashElement]): Self = this.set("elements", value.asInstanceOf[js.Any])
    @scala.inline
    def setFrame(value: FlashFrame): Self = this.set("frame", value.asInstanceOf[js.Any])
    @scala.inline
    def setGoto(value: () => js.Any): Self = this.set("goto", js.Any.fromFunction0(value))
    @scala.inline
    def setKeyframesVarargs(value: FlashFrame*): Self = this.set("keyframes", js.Array(value :_*))
    @scala.inline
    def setKeyframes(value: js.Array[FlashFrame]): Self = this.set("keyframes", value.asInstanceOf[js.Any])
    @scala.inline
    def setLayer(value: FlashLayer): Self = this.set("layer", value.asInstanceOf[js.Any])
    @scala.inline
    def setSetLayer(value: Double => js.Any): Self = this.set("setLayer", js.Any.fromFunction1(value))
    @scala.inline
    def setUpdate(value: () => js.Any): Self = this.set("update", js.Any.fromFunction0(value))
  }
  
}

