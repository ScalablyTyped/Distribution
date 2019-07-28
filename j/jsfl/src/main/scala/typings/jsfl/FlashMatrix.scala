package typings.jsfl

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FlashMatrix extends js.Object {
  var a: Double
  var b: Double
  var c: Double
  var d: Double
  var tx: Double
  var ty: Double
}

object FlashMatrix {
  @scala.inline
  def apply(a: Double, b: Double, c: Double, d: Double, tx: Double, ty: Double): FlashMatrix = {
    val __obj = js.Dynamic.literal(a = a, b = b, c = c, d = d, tx = tx, ty = ty)
  
    __obj.asInstanceOf[FlashMatrix]
  }
}

