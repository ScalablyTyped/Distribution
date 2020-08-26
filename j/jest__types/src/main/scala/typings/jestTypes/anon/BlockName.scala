package typings.jestTypes.anon

import typings.jestTypes.circusMod.BlockMode
import typings.jestTypes.circusMod.Event
import typings.jestTypes.jestTypesStrings.finish_describe_definition
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BlockName extends Event {
  var blockName: typings.jestTypes.circusMod.BlockName = js.native
  var mode: BlockMode = js.native
  var name: finish_describe_definition = js.native
}

object BlockName {
  @scala.inline
  def apply(
    blockName: typings.jestTypes.circusMod.BlockName,
    mode: BlockMode,
    name: finish_describe_definition
  ): BlockName = {
    val __obj = js.Dynamic.literal(blockName = blockName.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[BlockName]
  }
  @scala.inline
  implicit class BlockNameOps[Self <: BlockName] (val x: Self) extends AnyVal {
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
    def setBlockName(value: typings.jestTypes.circusMod.BlockName): Self = this.set("blockName", value.asInstanceOf[js.Any])
    @scala.inline
    def setMode(value: BlockMode): Self = this.set("mode", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: finish_describe_definition): Self = this.set("name", value.asInstanceOf[js.Any])
  }
  
}

