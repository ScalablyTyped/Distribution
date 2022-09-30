package typings.jestTypes.anon

import typings.jestTypes.jestTypesStrings.finish_describe_definition
import typings.jestTypes.mod.BlockMode
import typings.jestTypes.mod.BlockName2
import typings.jestTypes.mod.SyncEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BlockName
  extends StObject
     with SyncEvent {
  
  var blockName: BlockName2
  
  var mode: BlockMode
  
  var name: finish_describe_definition
}
object BlockName {
  
  inline def apply(blockName: BlockName2, mode: BlockMode): BlockName = {
    val __obj = js.Dynamic.literal(blockName = blockName.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any], name = "finish_describe_definition")
    __obj.asInstanceOf[BlockName]
  }
  
  extension [Self <: BlockName](x: Self) {
    
    inline def setBlockName(value: BlockName2): Self = StObject.set(x, "blockName", value.asInstanceOf[js.Any])
    
    inline def setMode(value: BlockMode): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    inline def setName(value: finish_describe_definition): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
