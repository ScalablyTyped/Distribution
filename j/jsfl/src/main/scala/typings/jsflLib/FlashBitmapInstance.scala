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

