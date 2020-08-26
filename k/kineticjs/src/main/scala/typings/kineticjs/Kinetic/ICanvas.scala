package typings.kineticjs.Kinetic

import typings.std.HTMLCanvasElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ICanvas extends js.Object {
  var _canvas: HTMLCanvasElement = js.native
  var height: Double = js.native
  var width: Double = js.native
  def getPixelRatio(): Double = js.native
  def setPixelRatio(pixelRatio: Double): js.Any = js.native
}

object ICanvas {
  @scala.inline
  def apply(
    _canvas: HTMLCanvasElement,
    getPixelRatio: () => Double,
    height: Double,
    setPixelRatio: Double => js.Any,
    width: Double
  ): ICanvas = {
    val __obj = js.Dynamic.literal(_canvas = _canvas.asInstanceOf[js.Any], getPixelRatio = js.Any.fromFunction0(getPixelRatio), height = height.asInstanceOf[js.Any], setPixelRatio = js.Any.fromFunction1(setPixelRatio), width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICanvas]
  }
  @scala.inline
  implicit class ICanvasOps[Self <: ICanvas] (val x: Self) extends AnyVal {
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
    def set_canvas(value: HTMLCanvasElement): Self = this.set("_canvas", value.asInstanceOf[js.Any])
    @scala.inline
    def setGetPixelRatio(value: () => Double): Self = this.set("getPixelRatio", js.Any.fromFunction0(value))
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def setSetPixelRatio(value: Double => js.Any): Self = this.set("setPixelRatio", js.Any.fromFunction1(value))
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
  }
  
}

