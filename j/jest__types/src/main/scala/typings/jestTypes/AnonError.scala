package typings.jestTypes

import typings.jestTypes.circusMod.DescribeBlock
import typings.jestTypes.circusMod.Event
import typings.jestTypes.circusMod.Exception
import typings.jestTypes.circusMod.Hook
import typings.jestTypes.circusMod.TestEntry
import typings.jestTypes.jestTypesStrings.hook_failure
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonError extends Event {
  var describeBlock: js.UndefOr[DescribeBlock] = js.undefined
  var error: String | Exception
  var hook: Hook
  var name: hook_failure
  var test: js.UndefOr[TestEntry] = js.undefined
}

object AnonError {
  @scala.inline
  def apply(
    error: String | Exception,
    hook: Hook,
    name: hook_failure,
    describeBlock: DescribeBlock = null,
    test: TestEntry = null
  ): AnonError = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], hook = hook.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (describeBlock != null) __obj.updateDynamic("describeBlock")(describeBlock.asInstanceOf[js.Any])
    if (test != null) __obj.updateDynamic("test")(test.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonError]
  }
}

