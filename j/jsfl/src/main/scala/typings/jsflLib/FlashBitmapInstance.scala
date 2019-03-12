package typings
package jsflLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// if FlashElement.elementType == 'instance'
trait FlashBitmapInstance extends js.Object {
  var hPixels: scala.Double
  var vPixels: scala.Double
  def getBits(): _FlashBitmap
  def setBits(bitmap: _FlashBitmap): scala.Unit
}

object FlashBitmapInstance {
  @scala.inline
  def apply(
    getBits: () => _FlashBitmap,
    hPixels: scala.Double,
    setBits: _FlashBitmap => scala.Unit,
    vPixels: scala.Double
  ): FlashBitmapInstance = {
    val __obj = js.Dynamic.literal(getBits = js.Any.fromFunction0(getBits), hPixels = hPixels, setBits = js.Any.fromFunction1(setBits), vPixels = vPixels)
  
    __obj.asInstanceOf[FlashBitmapInstance]
  }
}

