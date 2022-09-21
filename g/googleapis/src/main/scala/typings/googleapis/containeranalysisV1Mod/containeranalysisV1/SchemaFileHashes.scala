package typings.googleapis.containeranalysisV1Mod.containeranalysisV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaFileHashes extends StObject {
  
  /**
    * Required. Collection of file hashes.
    */
  var fileHash: js.UndefOr[js.Array[SchemaHash]] = js.undefined
}
object SchemaFileHashes {
  
  inline def apply(): SchemaFileHashes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaFileHashes]
  }
  
  extension [Self <: SchemaFileHashes](x: Self) {
    
    inline def setFileHash(value: js.Array[SchemaHash]): Self = StObject.set(x, "fileHash", value.asInstanceOf[js.Any])
    
    inline def setFileHashUndefined: Self = StObject.set(x, "fileHash", js.undefined)
    
    inline def setFileHashVarargs(value: SchemaHash*): Self = StObject.set(x, "fileHash", js.Array(value*))
  }
}
