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
    getPixelRatio: js.Function0[scala.Double],
    height: scala.Double,
    setPixelRatio: js.Function1[scala.Double, js.Any],
    width: scala.Double
  ): ICanvas = {
    val __obj = js.Dynamic.literal(_canvas = _canvas, getPixelRatio = getPixelRatio, height = height, setPixelRatio = setPixelRatio, width = width)
  
    __obj.asInstanceOf[ICanvas]
  }
}

