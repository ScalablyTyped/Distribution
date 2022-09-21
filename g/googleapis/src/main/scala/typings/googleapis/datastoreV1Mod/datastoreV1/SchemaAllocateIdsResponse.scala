package typings.googleapis.datastoreV1Mod.datastoreV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaAllocateIdsResponse extends StObject {
  
  /**
    * The keys specified in the request (in the same order), each with its key path completed with a newly allocated ID.
    */
  var keys: js.UndefOr[js.Array[SchemaKey]] = js.undefined
}
object SchemaAllocateIdsResponse {
  
  inline def apply(): SchemaAllocateIdsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAllocateIdsResponse]
  }
  
  extension [Self <: SchemaAllocateIdsResponse](x: Self) {
    
    inline def setKeys(value: js.Array[SchemaKey]): Self = StObject.set(x, "keys", value.asInstanceOf[js.Any])
    
    inline def setKeysUndefined: Self = StObject.set(x, "keys", js.undefined)
    
    inline def setKeysVarargs(value: SchemaKey*): Self = StObject.set(x, "keys", js.Array(value*))
  }
}
