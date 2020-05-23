package typings.jestTypes.anon

import typings.jestTypes.circusMod.Event
import typings.jestTypes.circusMod.TestEntry
import typings.jestTypes.jestTypesStrings.hook_success
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeBlock extends Event {
  var describeBlock: js.UndefOr[typings.jestTypes.circusMod.DescribeBlock] = js.undefined
  var hook: typings.jestTypes.circusMod.Hook
  var name: hook_success
  var test: js.UndefOr[TestEntry] = js.undefined
}

object DescribeBlock {
  @scala.inline
  def apply(
    hook: typings.jestTypes.circusMod.Hook,
    name: hook_success,
    describeBlock: typings.jestTypes.circusMod.DescribeBlock = null,
    test: TestEntry = null
  ): DescribeBlock = {
    val __obj = js.Dynamic.literal(hook = hook.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (describeBlock != null) __obj.updateDynamic("describeBlock")(describeBlock.asInstanceOf[js.Any])
    if (test != null) __obj.updateDynamic("test")(test.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeBlock]
  }
}

