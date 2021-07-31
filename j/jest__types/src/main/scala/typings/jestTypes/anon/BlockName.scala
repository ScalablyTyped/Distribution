package typings.jestTypes.anon

import typings.jestTypes.circusMod.BlockMode
import typings.jestTypes.circusMod.SyncEvent
import typings.jestTypes.jestTypesStrings.finish_describe_definition
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BlockName
  extends StObject
     with SyncEvent {
  
  var blockName: typings.jestTypes.circusMod.BlockName
  
  var mode: BlockMode
  
  var name: finish_describe_definition
}
object BlockName {
  
  @scala.inline
  def apply(blockName: typings.jestTypes.circusMod.BlockName, mode: BlockMode): BlockName = {
    val __obj = js.Dynamic.literal(blockName = blockName.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any], name = "finish_describe_definition")
    __obj.asInstanceOf[BlockName]
  }
  
  @scala.inline
  implicit class BlockNameMutableBuilder[Self <: BlockName] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBlockName(value: typings.jestTypes.circusMod.BlockName): Self = StObject.set(x, "blockName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMode(value: BlockMode): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: finish_describe_definition): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
