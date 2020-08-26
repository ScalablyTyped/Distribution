package typings.jsfl

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// if FlashElement.elementType == 'instance'
@js.native
trait FlashBitmapInstance extends js.Object {
  var hPixels: Double = js.native
  var vPixels: Double = js.native
  def getBits(): FlashBitmap = js.native
  def setBits(bitmap: FlashBitmap): Unit = js.native
}

object FlashBitmapInstance {
  @scala.inline
  def apply(getBits: () => FlashBitmap, hPixels: Double, setBits: FlashBitmap => Unit, vPixels: Double): FlashBitmapInstance = {
    val __obj = js.Dynamic.literal(getBits = js.Any.fromFunction0(getBits), hPixels = hPixels.asInstanceOf[js.Any], setBits = js.Any.fromFunction1(setBits), vPixels = vPixels.asInstanceOf[js.Any])
    __obj.asInstanceOf[FlashBitmapInstance]
  }
  @scala.inline
  implicit class FlashBitmapInstanceOps[Self <: FlashBitmapInstance] (val x: Self) extends AnyVal {
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
    def setGetBits(value: () => FlashBitmap): Self = this.set("getBits", js.Any.fromFunction0(value))
    @scala.inline
    def setHPixels(value: Double): Self = this.set("hPixels", value.asInstanceOf[js.Any])
    @scala.inline
    def setSetBits(value: FlashBitmap => Unit): Self = this.set("setBits", js.Any.fromFunction1(value))
    @scala.inline
    def setVPixels(value: Double): Self = this.set("vPixels", value.asInstanceOf[js.Any])
  }
  
}

