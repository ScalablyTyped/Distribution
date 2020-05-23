package typings.mathjs.anon

import typings.mathjs.mod.MathArray
import typings.mathjs.mod.Matrix
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Q extends js.Object {
  var Q: MathArray | Matrix
  var R: MathArray | Matrix
}

object Q {
  @scala.inline
  def apply(Q: MathArray | Matrix, R: MathArray | Matrix): Q = {
    val __obj = js.Dynamic.literal(Q = Q.asInstanceOf[js.Any], R = R.asInstanceOf[js.Any])
    __obj.asInstanceOf[Q]
  }
}

