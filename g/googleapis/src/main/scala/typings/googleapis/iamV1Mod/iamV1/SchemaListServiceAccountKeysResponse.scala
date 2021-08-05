package typings.googleapis.iamV1Mod.iamV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The service account keys list response.
  */
trait SchemaListServiceAccountKeysResponse extends StObject {
  
  /**
    * The public keys for the service account.
    */
  var keys: js.UndefOr[js.Array[SchemaServiceAccountKey]] = js.undefined
}
object SchemaListServiceAccountKeysResponse {
  
  inline def apply(): SchemaListServiceAccountKeysResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListServiceAccountKeysResponse]
  }
  
  extension [Self <: SchemaListServiceAccountKeysResponse](x: Self) {
    
    inline def setKeys(value: js.Array[SchemaServiceAccountKey]): Self = StObject.set(x, "keys", value.asInstanceOf[js.Any])
    
    inline def setKeysUndefined: Self = StObject.set(x, "keys", js.undefined)
    
    inline def setKeysVarargs(value: SchemaServiceAccountKey*): Self = StObject.set(x, "keys", js.Array(value :_*))
  }
}
