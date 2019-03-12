package typings
package kineticjsLib.KineticNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICanvas extends js.Object {
  var _canvas: stdLib.HTMLCanvasElement
  var height: scala.Double
  var width: scala.Double
  def getPixelRatio(): scala.Double
  def setPixelRatio(pixelRatio: scala.Double): js.Any
}

object ICanvas {
  @scala.inline
  def apply(
    _canvas: stdLib.HTMLCanvasElement,
    getPixelRatio: () => scala.Double,
    height: scala.Double,
    setPixelRatio: scala.Double => js.Any,
    width: scala.Double
  ): ICanvas = {
    val __obj = js.Dynamic.literal(_canvas = _canvas, getPixelRatio = js.Any.fromFunction0(getPixelRatio), height = height, setPixelRatio = js.Any.fromFunction1(setPixelRatio), width = width)
  
    __obj.asInstanceOf[ICanvas]
  }
}

