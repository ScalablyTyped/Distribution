package typings.jestDashAxe.jestDashAxeMod._Global_.jest

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Matchers[R] extends js.Object {
  def toHaveNoViolations(): R
}

object Matchers {
  @scala.inline
  def apply[R](toHaveNoViolations: () => R): Matchers[R] = {
    val __obj = js.Dynamic.literal(toHaveNoViolations = js.Any.fromFunction0(toHaveNoViolations))
  
    __obj.asInstanceOf[Matchers[R]]
  }
}

