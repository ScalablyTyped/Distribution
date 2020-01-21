package typings.jestTypes.circusMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeBlock extends js.Object {
  var children: js.Array[DescribeBlock]
  var hooks: js.Array[Hook]
  var mode: BlockMode
  var name: BlockName
  var parent: js.UndefOr[DescribeBlock] = js.undefined
  var tests: js.Array[TestEntry]
}

object DescribeBlock {
  @scala.inline
  def apply(
    children: js.Array[DescribeBlock],
    hooks: js.Array[Hook],
    mode: BlockMode,
    name: BlockName,
    tests: js.Array[TestEntry],
    parent: DescribeBlock = null
  ): DescribeBlock = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], hooks = hooks.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], tests = tests.asInstanceOf[js.Any])
    if (parent != null) __obj.updateDynamic("parent")(parent.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeBlock]
  }
}

