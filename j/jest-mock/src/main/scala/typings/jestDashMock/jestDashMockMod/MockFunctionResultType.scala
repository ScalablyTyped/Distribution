package typings.jestDashMock.jestDashMockMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Possible types of a MockFunctionResult.
  * 'return': The call completed by returning normally.
  * 'throw': The call completed by throwing a value.
  * 'incomplete': The call has not completed yet. This is possible if you read
  *               the  mock function result from within the mock function itself
  *               (or a function called by the mock function).
  */
/* Rewritten from type alias, can be one of: 
  - typings.jestDashMock.jestDashMockStrings.`return`
  - typings.jestDashMock.jestDashMockStrings.`throw`
  - typings.jestDashMock.jestDashMockStrings.incomplete
*/
trait MockFunctionResultType extends js.Object

object MockFunctionResultType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def incomplete: typings.jestDashMock.jestDashMockStrings.incomplete = this.cast("incomplete")
  @scala.inline
  def `return`: typings.jestDashMock.jestDashMockStrings.`return` = this.cast("return")
  @scala.inline
  def `throw`: typings.jestDashMock.jestDashMockStrings.`throw` = this.cast("throw")
}

