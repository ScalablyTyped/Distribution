package typings.jestTypes.anon

import typings.jestTypes.circusMod.Event
import typings.jestTypes.jestTypesStrings.run_describe_finish
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeBlockDescribeBlock extends Event {
  var describeBlock: typings.jestTypes.circusMod.DescribeBlock
  var name: run_describe_finish
}

object DescribeBlockDescribeBlock {
  @scala.inline
  def apply(describeBlock: typings.jestTypes.circusMod.DescribeBlock, name: run_describe_finish): DescribeBlockDescribeBlock = {
    val __obj = js.Dynamic.literal(describeBlock = describeBlock.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeBlockDescribeBlock]
  }
}

