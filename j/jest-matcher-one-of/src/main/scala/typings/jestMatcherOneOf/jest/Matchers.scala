package typings.jestMatcherOneOf.jest

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Matchers[R, T] extends js.Object {
  def toBeOneOf(expected: js.Array[_]): R = js.native
}

object Matchers {
  @scala.inline
  def apply[R, T](toBeOneOf: js.Array[_] => R): Matchers[R, T] = {
    val __obj = js.Dynamic.literal(toBeOneOf = js.Any.fromFunction1(toBeOneOf))
    __obj.asInstanceOf[Matchers[R, T]]
  }
  @scala.inline
  implicit class MatchersOps[Self <: Matchers[_, _], R, T] (val x: Self with (Matchers[R, T])) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setToBeOneOf(value: js.Array[_] => R): Self = this.set("toBeOneOf", js.Any.fromFunction1(value))
  }
  
}

