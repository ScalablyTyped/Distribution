package typings.googleapis.containerV1beta1Mod.containerV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * GetJSONWebKeysResponse is a valid JSON Web Key Set as specififed in rfc
  * 7517
  */
trait SchemaGetJSONWebKeysResponse extends StObject {
  
  /**
    * The public component of the keys used by the cluster to sign token
    * requests.
    */
  var keys: js.UndefOr[js.Array[SchemaJwk]] = js.undefined
}
object SchemaGetJSONWebKeysResponse {
  
  inline def apply(): SchemaGetJSONWebKeysResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGetJSONWebKeysResponse]
  }
  
  extension [Self <: SchemaGetJSONWebKeysResponse](x: Self) {
    
    inline def setKeys(value: js.Array[SchemaJwk]): Self = StObject.set(x, "keys", value.asInstanceOf[js.Any])
    
    inline def setKeysUndefined: Self = StObject.set(x, "keys", js.undefined)
    
    inline def setKeysVarargs(value: SchemaJwk*): Self = StObject.set(x, "keys", js.Array(value :_*))
  }
}
