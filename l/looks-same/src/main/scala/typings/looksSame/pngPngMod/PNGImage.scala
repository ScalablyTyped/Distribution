package typings.looksSame.pngPngMod

import typings.looksSame.anon.B
import typings.looksSame.anon.Y
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PNGImage extends js.Object {
  var _png: js.Any = js.native
  def _getIdx(x: js.Any, y: js.Any): Double = js.native
  def createBuffer(callback: js.Any): Unit = js.native
  def getActualCoord(x: Double, y: Double): Y = js.native
  def getPixel(x: js.Any, y: js.Any): B = js.native
  def height: Double = js.native
  def save(path: js.Any, callback: js.Any): Unit = js.native
  def setPixel(x: js.Any, y: js.Any, color: js.Any): Unit = js.native
  def width: Double = js.native
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
  @scala.inline
  implicit class PNGImageOps[Self <: PNGImage] (val x: Self) extends AnyVal {
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
    def set_getIdx(value: (js.Any, js.Any) => Double): Self = this.set("_getIdx", js.Any.fromFunction2(value))
    @scala.inline
    def set_png(value: js.Any): Self = this.set("_png", value.asInstanceOf[js.Any])
    @scala.inline
    def setCreateBuffer(value: js.Any => Unit): Self = this.set("createBuffer", js.Any.fromFunction1(value))
    @scala.inline
    def setGetActualCoord(value: (Double, Double) => Y): Self = this.set("getActualCoord", js.Any.fromFunction2(value))
    @scala.inline
    def setGetPixel(value: (js.Any, js.Any) => B): Self = this.set("getPixel", js.Any.fromFunction2(value))
    @scala.inline
    def setHeight(value: () => Double): Self = this.set("height", js.Any.fromFunction0(value))
    @scala.inline
    def setSave(value: (js.Any, js.Any) => Unit): Self = this.set("save", js.Any.fromFunction2(value))
    @scala.inline
    def setSetPixel(value: (js.Any, js.Any, js.Any) => Unit): Self = this.set("setPixel", js.Any.fromFunction3(value))
    @scala.inline
    def setWidth(value: () => Double): Self = this.set("width", js.Any.fromFunction0(value))
  }
  
}

