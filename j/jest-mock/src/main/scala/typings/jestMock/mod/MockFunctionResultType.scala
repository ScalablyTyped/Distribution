package typings.jestMock.mod

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
  - typings.jestMock.jestMockStrings.`return`
  - typings.jestMock.jestMockStrings.`throw`
  - typings.jestMock.jestMockStrings.incomplete
*/
trait MockFunctionResultType extends js.Object

object MockFunctionResultType {
  @scala.inline
  def incomplete: typings.jestMock.jestMockStrings.incomplete = "incomplete".asInstanceOf[typings.jestMock.jestMockStrings.incomplete]
  @scala.inline
  def `return`: typings.jestMock.jestMockStrings.`return` = "return".asInstanceOf[typings.jestMock.jestMockStrings.`return`]
  @scala.inline
  def `throw`: typings.jestMock.jestMockStrings.`throw` = "throw".asInstanceOf[typings.jestMock.jestMockStrings.`throw`]
}

