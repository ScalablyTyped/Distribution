package typings.jestTypes.anon

import typings.jestTypes.circusMod.BlockMode
import typings.jestTypes.circusMod.Event
import typings.jestTypes.jestTypesStrings.finish_describe_definition
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BlockName extends Event {
  var blockName: typings.jestTypes.circusMod.BlockName
  var mode: BlockMode
  var name: finish_describe_definition
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
}

