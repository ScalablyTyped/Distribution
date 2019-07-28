package typings.jsfl

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// if FlashElement.elementType == 'instance'
trait FlashBitmapInstance extends js.Object {
  var hPixels: Double
  var vPixels: Double
  def getBits(): _FlashBitmap
  def setBits(bitmap: _FlashBitmap): Unit
}

object FlashBitmapInstance {
  @scala.inline
  def apply(getBits: () => _FlashBitmap, hPixels: Double, setBits: _FlashBitmap => Unit, vPixels: Double): FlashBitmapInstance = {
    val __obj = js.Dynamic.literal(getBits = js.Any.fromFunction0(getBits), hPixels = hPixels, setBits = js.Any.fromFunction1(setBits), vPixels = vPixels)
  
    __obj.asInstanceOf[FlashBitmapInstance]
  }
}

