package typings.jsfl

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// if FlashElement.elementType == 'instance'
trait FlashBitmapInstance extends js.Object {
  var hPixels: Double
  var vPixels: Double
  def getBits(): FlashBitmap
  def setBits(bitmap: FlashBitmap): Unit
}

object FlashBitmapInstance {
  @scala.inline
  def apply(getBits: () => FlashBitmap, hPixels: Double, setBits: FlashBitmap => Unit, vPixels: Double): FlashBitmapInstance = {
    val __obj = js.Dynamic.literal(getBits = js.Any.fromFunction0(getBits), hPixels = hPixels.asInstanceOf[js.Any], setBits = js.Any.fromFunction1(setBits), vPixels = vPixels.asInstanceOf[js.Any])
    __obj.asInstanceOf[FlashBitmapInstance]
  }
}

