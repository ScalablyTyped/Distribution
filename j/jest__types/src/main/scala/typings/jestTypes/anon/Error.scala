package typings.jestTypes.anon

import typings.jestTypes.circusMod.Event
import typings.jestTypes.circusMod.Exception
import typings.jestTypes.circusMod.TestEntry
import typings.jestTypes.jestTypesStrings.hook_failure
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Error extends Event {
  var describeBlock: js.UndefOr[typings.jestTypes.circusMod.DescribeBlock] = js.undefined
  var error: String | Exception
  var hook: typings.jestTypes.circusMod.Hook
  var name: hook_failure
  var test: js.UndefOr[TestEntry] = js.undefined
}

object Error {
  @scala.inline
  def apply(
    error: String | Exception,
    hook: typings.jestTypes.circusMod.Hook,
    name: hook_failure,
    describeBlock: typings.jestTypes.circusMod.DescribeBlock = null,
    test: TestEntry = null
  ): Error = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], hook = hook.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (describeBlock != null) __obj.updateDynamic("describeBlock")(describeBlock.asInstanceOf[js.Any])
    if (test != null) __obj.updateDynamic("test")(test.asInstanceOf[js.Any])
    __obj.asInstanceOf[Error]
  }
}

