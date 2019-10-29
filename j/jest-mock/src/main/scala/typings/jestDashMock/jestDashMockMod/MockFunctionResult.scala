package typings.jestDashMock.jestDashMockMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents the result of a single call to a mock function.
  */
trait MockFunctionResult extends js.Object {
  /**
    * Indicates how the call completed.
    */
  var `type`: MockFunctionResultType
  /**
    * The value that was either thrown or returned by the function.
    * Undefined when type === 'incomplete'.
    */
  var value: js.Any
}

object MockFunctionResult {
  @scala.inline
  def apply(`type`: MockFunctionResultType, value: js.Any): MockFunctionResult = {
    val __obj = js.Dynamic.literal(value = value)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[MockFunctionResult]
  }
}

