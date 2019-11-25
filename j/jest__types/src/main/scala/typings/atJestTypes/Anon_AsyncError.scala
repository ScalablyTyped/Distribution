package typings.atJestTypes

import typings.atJestTypes.atJestTypesStrings.start_describe_definition
import typings.atJestTypes.buildCircusMod.BlockMode
import typings.atJestTypes.buildCircusMod.BlockName
import typings.atJestTypes.buildCircusMod.Event
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AsyncError extends Event {
  var asyncError: Error
  var blockName: BlockName
  var mode: BlockMode
  var name: start_describe_definition
}

object Anon_AsyncError {
  @scala.inline
  def apply(asyncError: Error, blockName: BlockName, mode: BlockMode, name: start_describe_definition): Anon_AsyncError = {
    val __obj = js.Dynamic.literal(asyncError = asyncError.asInstanceOf[js.Any], blockName = blockName.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_AsyncError]
  }
}

