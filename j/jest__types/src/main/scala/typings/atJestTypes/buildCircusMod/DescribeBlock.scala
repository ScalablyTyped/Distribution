package typings.atJestTypes.buildCircusMod

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
    val __obj = js.Dynamic.literal(children = children, hooks = hooks, mode = mode.asInstanceOf[js.Any], name = name, tests = tests)
    if (parent != null) __obj.updateDynamic("parent")(parent)
    __obj.asInstanceOf[DescribeBlock]
  }
}

