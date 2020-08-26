package typings.jestTypes.anon

import typings.jestTypes.circusMod.Event
import typings.jestTypes.jestTypesStrings.run_describe_start
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeBlockName extends Event {
  var describeBlock: typings.jestTypes.circusMod.DescribeBlock = js.native
  var name: run_describe_start = js.native
}

object DescribeBlockName {
  @scala.inline
  def apply(describeBlock: typings.jestTypes.circusMod.DescribeBlock, name: run_describe_start): DescribeBlockName = {
    val __obj = js.Dynamic.literal(describeBlock = describeBlock.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeBlockName]
  }
  @scala.inline
  implicit class DescribeBlockNameOps[Self <: DescribeBlockName] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDescribeBlock(value: typings.jestTypes.circusMod.DescribeBlock): Self = this.set("describeBlock", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: run_describe_start): Self = this.set("name", value.asInstanceOf[js.Any])
  }
  
}

