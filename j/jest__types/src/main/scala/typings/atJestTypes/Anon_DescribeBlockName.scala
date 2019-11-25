package typings.atJestTypes

import typings.atJestTypes.atJestTypesStrings.run_describe_start
import typings.atJestTypes.buildCircusMod.DescribeBlock
import typings.atJestTypes.buildCircusMod.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DescribeBlockName extends Event {
  var describeBlock: DescribeBlock
  var name: run_describe_start
}

object Anon_DescribeBlockName {
  @scala.inline
  def apply(describeBlock: DescribeBlock, name: run_describe_start): Anon_DescribeBlockName = {
    val __obj = js.Dynamic.literal(describeBlock = describeBlock.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_DescribeBlockName]
  }
}

