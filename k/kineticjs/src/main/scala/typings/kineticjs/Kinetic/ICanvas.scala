package typings.kineticjs.Kinetic

import typings.std.HTMLCanvasElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICanvas extends js.Object {
  var _canvas: HTMLCanvasElement
  var height: Double
  var width: Double
  def getPixelRatio(): Double
  def setPixelRatio(pixelRatio: Double): js.Any
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
    val __obj = js.Dynamic.literal(_canvas = _canvas, getPixelRatio = js.Any.fromFunction0(getPixelRatio), height = height, setPixelRatio = js.Any.fromFunction1(setPixelRatio), width = width)
  
    __obj.asInstanceOf[ICanvas]
  }
}

