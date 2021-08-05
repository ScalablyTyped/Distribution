package typings.googleapis.v1beta3Mod.datastoreV1beta3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The request for Datastore.Lookup.
  */
trait SchemaLookupRequest extends StObject {
  
  /**
    * Keys of entities to look up.
    */
  var keys: js.UndefOr[js.Array[SchemaKey]] = js.undefined
  
  /**
    * The options for this lookup request.
    */
  var readOptions: js.UndefOr[SchemaReadOptions] = js.undefined
}
object SchemaLookupRequest {
  
  inline def apply(): SchemaLookupRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaLookupRequest]
  }
  
  extension [Self <: SchemaLookupRequest](x: Self) {
    
    inline def setKeys(value: js.Array[SchemaKey]): Self = StObject.set(x, "keys", value.asInstanceOf[js.Any])
    
    inline def setKeysUndefined: Self = StObject.set(x, "keys", js.undefined)
    
    inline def setKeysVarargs(value: SchemaKey*): Self = StObject.set(x, "keys", js.Array(value :_*))
    
    inline def setReadOptions(value: SchemaReadOptions): Self = StObject.set(x, "readOptions", value.asInstanceOf[js.Any])
    
    inline def setReadOptionsUndefined: Self = StObject.set(x, "readOptions", js.undefined)
  }
}
