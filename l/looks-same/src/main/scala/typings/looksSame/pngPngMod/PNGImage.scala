package typings.looksSame.pngPngMod

import typings.looksSame.anon.B
import typings.looksSame.anon.Y
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PNGImage extends js.Object {
  var _png: js.Any
  def _getIdx(x: js.Any, y: js.Any): Double
  def createBuffer(callback: js.Any): Unit
  def getActualCoord(x: Double, y: Double): Y
  def getPixel(x: js.Any, y: js.Any): B
  def height: Double
  def save(path: js.Any, callback: js.Any): Unit
  def setPixel(x: js.Any, y: js.Any, color: js.Any): Unit
  def width: Double
}

object PNGImage {
  @scala.inline
  def apply(
    _getIdx: (js.Any, js.Any) => Double,
    _png: js.Any,
    createBuffer: js.Any => Unit,
    getActualCoord: (Double, Double) => Y,
    getPixel: (js.Any, js.Any) => B,
    height: () => Double,
    save: (js.Any, js.Any) => Unit,
    setPixel: (js.Any, js.Any, js.Any) => Unit,
    width: () => Double
  ): PNGImage = {
    val __obj = js.Dynamic.literal(_getIdx = js.Any.fromFunction2(_getIdx), _png = _png.asInstanceOf[js.Any], createBuffer = js.Any.fromFunction1(createBuffer), getActualCoord = js.Any.fromFunction2(getActualCoord), getPixel = js.Any.fromFunction2(getPixel), height = js.Any.fromFunction0(height), save = js.Any.fromFunction2(save), setPixel = js.Any.fromFunction3(setPixel), width = js.Any.fromFunction0(width))
    __obj.asInstanceOf[PNGImage]
  }
}

