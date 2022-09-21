package typings.googleapis.testingV1Mod.testingV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaDeviceIpBlockCatalog extends StObject {
  
  /**
    * The device IP blocks used by Firebase Test Lab
    */
  var ipBlocks: js.UndefOr[js.Array[SchemaDeviceIpBlock]] = js.undefined
}
object SchemaDeviceIpBlockCatalog {
  
  inline def apply(): SchemaDeviceIpBlockCatalog = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDeviceIpBlockCatalog]
  }
  
  extension [Self <: SchemaDeviceIpBlockCatalog](x: Self) {
    
    inline def setIpBlocks(value: js.Array[SchemaDeviceIpBlock]): Self = StObject.set(x, "ipBlocks", value.asInstanceOf[js.Any])
    
    inline def setIpBlocksUndefined: Self = StObject.set(x, "ipBlocks", js.undefined)
    
    inline def setIpBlocksVarargs(value: SchemaDeviceIpBlock*): Self = StObject.set(x, "ipBlocks", js.Array(value*))
  }
}
