package typings.identiconJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PNGlib extends js.Object {
  var depth: Double = js.native
  var height: Double = js.native
  var width: Double = js.native
  /**
    * Returns the image as a base64 encoded string.
    */
  def getBase64(): String = js.native
  /**
    * Returns the png as a string.
    */
  def getDump(): String = js.native
  /**
    * Returns the index of a given pixel in the image data array.
    * @param x The given x coordinate of the pixel.
    * @param y The given y coordinate of the pixel.
    */
  def index(x: Double, y: Double): Double = js.native
}

object PNGlib {
  @scala.inline
  def apply(
    depth: Double,
    getBase64: () => String,
    getDump: () => String,
    height: Double,
    index: (Double, Double) => Double,
    width: Double
  ): PNGlib = {
    val __obj = js.Dynamic.literal(depth = depth.asInstanceOf[js.Any], getBase64 = js.Any.fromFunction0(getBase64), getDump = js.Any.fromFunction0(getDump), height = height.asInstanceOf[js.Any], index = js.Any.fromFunction2(index), width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[PNGlib]
  }
  @scala.inline
  implicit class PNGlibOps[Self <: PNGlib] (val x: Self) extends AnyVal {
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
    def setDepth(value: Double): Self = this.set("depth", value.asInstanceOf[js.Any])
    @scala.inline
    def setGetBase64(value: () => String): Self = this.set("getBase64", js.Any.fromFunction0(value))
    @scala.inline
    def setGetDump(value: () => String): Self = this.set("getDump", js.Any.fromFunction0(value))
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def setIndex(value: (Double, Double) => Double): Self = this.set("index", js.Any.fromFunction2(value))
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
  }
  
}

