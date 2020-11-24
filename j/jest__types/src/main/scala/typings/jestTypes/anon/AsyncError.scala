package typings.jestTypes.anon

import typings.jestTypes.circusMod.BlockMode
import typings.jestTypes.circusMod.SyncEvent
import typings.jestTypes.jestTypesStrings.start_describe_definition
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AsyncError extends SyncEvent {
  
  var asyncError: typings.std.Error = js.native
  
  var blockName: typings.jestTypes.circusMod.BlockName = js.native
  
  var mode: BlockMode = js.native
  
  var name: start_describe_definition = js.native
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
  
  @scala.inline
  implicit class AsyncErrorOps[Self <: AsyncError] (val x: Self) extends AnyVal {
    
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
    def setAsyncError(value: typings.std.Error): Self = this.set("asyncError", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBlockName(value: typings.jestTypes.circusMod.BlockName): Self = this.set("blockName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMode(value: BlockMode): Self = this.set("mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: start_describe_definition): Self = this.set("name", value.asInstanceOf[js.Any])
  }
}
