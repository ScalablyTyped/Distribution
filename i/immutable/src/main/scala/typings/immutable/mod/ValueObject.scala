package typings.immutable.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ValueObject extends js.Object {
  /**
    * True if this and the other Collection have value equality, as defined
    * by `Immutable.is()`.
    *
    * Note: This is equivalent to `Immutable.is(this, other)`, but provided to
    * allow for chained expressions.
    */
  def equals(other: js.Any): Boolean
}

object ValueObject {
  @scala.inline
  def apply(equals: js.Any => Boolean): ValueObject = {
    val __obj = js.Dynamic.literal(equals = js.Any.fromFunction1(equals))
    __obj.asInstanceOf[ValueObject]
  }
}

