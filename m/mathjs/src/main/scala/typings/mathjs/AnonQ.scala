package typings.mathjs

import typings.mathjs.mod.MathArray
import typings.mathjs.mod.Matrix
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonQ extends js.Object {
  var Q: MathArray | Matrix
  var R: MathArray | Matrix
}

object AnonQ {
  @scala.inline
  def apply(Q: MathArray | Matrix, R: MathArray | Matrix): AnonQ = {
    val __obj = js.Dynamic.literal(Q = Q.asInstanceOf[js.Any], R = R.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonQ]
  }
}

