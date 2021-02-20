package typings.jestTypes.anon

import typings.jestTypes.circusMod.BlockMode
import typings.jestTypes.circusMod.SyncEvent
import typings.jestTypes.jestTypesStrings.start_describe_definition
import org.scalablytyped.runtime.StObject
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
  implicit class AsyncErrorMutableBuilder[Self <: AsyncError] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAsyncError(value: typings.std.Error): Self = StObject.set(x, "asyncError", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBlockName(value: typings.jestTypes.circusMod.BlockName): Self = StObject.set(x, "blockName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMode(value: BlockMode): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: start_describe_definition): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
