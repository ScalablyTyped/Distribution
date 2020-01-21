package typings.jestTypes

import typings.jestTypes.circusMod.BlockMode
import typings.jestTypes.circusMod.BlockName
import typings.jestTypes.circusMod.Event
import typings.jestTypes.jestTypesStrings.start_describe_definition
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAsyncError extends Event {
  var asyncError: Error
  var blockName: BlockName
  var mode: BlockMode
  var name: start_describe_definition
}

object AnonAsyncError {
  @scala.inline
  def apply(asyncError: Error, blockName: BlockName, mode: BlockMode, name: start_describe_definition): AnonAsyncError = {
    val __obj = js.Dynamic.literal(asyncError = asyncError.asInstanceOf[js.Any], blockName = blockName.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonAsyncError]
  }
}

