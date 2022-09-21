package typings.googleapis.v1beta3Mod.datastoreV1beta3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaAllocateIdsRequest extends StObject {
  
  /**
    * Required. A list of keys with incomplete key paths for which to allocate IDs. No key may be reserved/read-only.
    */
  var keys: js.UndefOr[js.Array[SchemaKey]] = js.undefined
}
object SchemaAllocateIdsRequest {
  
  inline def apply(): SchemaAllocateIdsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAllocateIdsRequest]
  }
  
  extension [Self <: SchemaAllocateIdsRequest](x: Self) {
    
    inline def setKeys(value: js.Array[SchemaKey]): Self = StObject.set(x, "keys", value.asInstanceOf[js.Any])
    
    inline def setKeysUndefined: Self = StObject.set(x, "keys", js.undefined)
    
    inline def setKeysVarargs(value: SchemaKey*): Self = StObject.set(x, "keys", js.Array(value*))
  }
}
