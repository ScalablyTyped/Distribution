package typings.jestTypes

import typings.jestTypes.circusMod.DescribeBlock
import typings.jestTypes.circusMod.Event
import typings.jestTypes.circusMod.Hook
import typings.jestTypes.circusMod.TestEntry
import typings.jestTypes.jestTypesStrings.hook_success
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDescribeBlock extends Event {
  var describeBlock: js.UndefOr[DescribeBlock] = js.undefined
  var hook: Hook
  var name: hook_success
  var test: js.UndefOr[TestEntry] = js.undefined
}

object AnonDescribeBlock {
  @scala.inline
  def apply(hook: Hook, name: hook_success, describeBlock: DescribeBlock = null, test: TestEntry = null): AnonDescribeBlock = {
    val __obj = js.Dynamic.literal(hook = hook.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (describeBlock != null) __obj.updateDynamic("describeBlock")(describeBlock.asInstanceOf[js.Any])
    if (test != null) __obj.updateDynamic("test")(test.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDescribeBlock]
  }
}

