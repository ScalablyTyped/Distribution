package typings.jestTypes

import typings.jestTypes.circusMod.DescribeBlock
import typings.jestTypes.circusMod.Event
import typings.jestTypes.jestTypesStrings.run_describe_finish
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDescribeBlockDescribeBlock extends Event {
  var describeBlock: DescribeBlock
  var name: run_describe_finish
}

object AnonDescribeBlockDescribeBlock {
  @scala.inline
  def apply(describeBlock: DescribeBlock, name: run_describe_finish): AnonDescribeBlockDescribeBlock = {
    val __obj = js.Dynamic.literal(describeBlock = describeBlock.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonDescribeBlockDescribeBlock]
  }
}

