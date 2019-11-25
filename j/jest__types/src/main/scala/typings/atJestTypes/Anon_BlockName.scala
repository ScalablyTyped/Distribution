package typings.atJestTypes

import typings.atJestTypes.atJestTypesStrings.finish_describe_definition
import typings.atJestTypes.buildCircusMod.BlockMode
import typings.atJestTypes.buildCircusMod.BlockName
import typings.atJestTypes.buildCircusMod.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BlockName extends Event {
  var blockName: BlockName
  var mode: BlockMode
  var name: finish_describe_definition
}

object Anon_BlockName {
  @scala.inline
  def apply(blockName: BlockName, mode: BlockMode, name: finish_describe_definition): Anon_BlockName = {
    val __obj = js.Dynamic.literal(blockName = blockName.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_BlockName]
  }
}

