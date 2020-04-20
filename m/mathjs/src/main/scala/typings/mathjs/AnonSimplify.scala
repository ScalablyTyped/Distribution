package typings.mathjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonSimplify extends js.Object {
  var simplify: Boolean
}

object AnonSimplify {
  @scala.inline
  def apply(simplify: Boolean): AnonSimplify = {
    val __obj = js.Dynamic.literal(simplify = simplify.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonSimplify]
  }
}

