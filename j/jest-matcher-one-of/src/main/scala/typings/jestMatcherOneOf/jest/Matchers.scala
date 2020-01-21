package typings.jestMatcherOneOf.jest

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Matchers[R, T] extends js.Object {
  def toBeOneOf(expected: js.Array[_]): R
}

object Matchers {
  @scala.inline
  def apply[R, T](toBeOneOf: js.Array[_] => R): Matchers[R, T] = {
    val __obj = js.Dynamic.literal(toBeOneOf = js.Any.fromFunction1(toBeOneOf))
  
    __obj.asInstanceOf[Matchers[R, T]]
  }
}

