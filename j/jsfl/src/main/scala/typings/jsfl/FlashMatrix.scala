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
    val __obj = js.Dynamic.literal(a = a.asInstanceOf[js.Any], b = b.asInstanceOf[js.Any], c = c.asInstanceOf[js.Any], d = d.asInstanceOf[js.Any], tx = tx.asInstanceOf[js.Any], ty = ty.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[FlashMatrix]
  }
}

