package typings.jestTypes.anon

import typings.jestTypes.circusMod.BlockMode
import typings.jestTypes.circusMod.Event
import typings.jestTypes.jestTypesStrings.start_describe_definition
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AsyncError extends Event {
  var asyncError: typings.std.Error
  var blockName: typings.jestTypes.circusMod.BlockName
  var mode: BlockMode
  var name: start_describe_definition
}

object AsyncError {
  @scala.inline
  def apply(
    asyncError: typings.std.Error,
    blockName: typings.jestTypes.circusMod.BlockName,
    mode: BlockMode,
    name: start_describe_definition
  ): AsyncError = {
    val __obj = js.Dynamic.literal(asyncError = asyncError.asInstanceOf[js.Any], blockName = blockName.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[AsyncError]
  }
}

