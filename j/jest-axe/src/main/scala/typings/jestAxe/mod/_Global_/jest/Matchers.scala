package typings.jestAxe.mod._Global_.jest

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Matchers[R, T] extends js.Object {
  def toHaveNoViolations(): R
}

object Matchers {
  @scala.inline
  def apply[R, T](toHaveNoViolations: () => R): Matchers[R, T] = {
    val __obj = js.Dynamic.literal(toHaveNoViolations = js.Any.fromFunction0(toHaveNoViolations))
    __obj.asInstanceOf[Matchers[R, T]]
  }
}

