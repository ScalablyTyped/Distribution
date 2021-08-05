package typings.jestTypes.anon

import typings.jestTypes.circusMod.BlockMode
import typings.jestTypes.circusMod.SyncEvent
import typings.jestTypes.jestTypesStrings.start_describe_definition
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AsyncError
  extends StObject
     with SyncEvent {
  
  var asyncError: typings.std.Error
  
  var blockName: typings.jestTypes.circusMod.BlockName
  
  var mode: BlockMode
  
  var name: start_describe_definition
}
object AsyncError {
  
  inline def apply(asyncError: typings.std.Error, blockName: typings.jestTypes.circusMod.BlockName, mode: BlockMode): AsyncError = {
    val __obj = js.Dynamic.literal(asyncError = asyncError.asInstanceOf[js.Any], blockName = blockName.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any], name = "start_describe_definition")
    __obj.asInstanceOf[AsyncError]
  }
  
  extension [Self <: AsyncError](x: Self) {
    
    inline def setAsyncError(value: typings.std.Error): Self = StObject.set(x, "asyncError", value.asInstanceOf[js.Any])
    
    inline def setBlockName(value: typings.jestTypes.circusMod.BlockName): Self = StObject.set(x, "blockName", value.asInstanceOf[js.Any])
    
    inline def setMode(value: BlockMode): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    inline def setName(value: start_describe_definition): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
