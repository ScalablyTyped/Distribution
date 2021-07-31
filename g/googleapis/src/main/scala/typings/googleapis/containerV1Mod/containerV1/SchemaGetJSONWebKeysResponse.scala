package typings.googleapis.containerV1Mod.containerV1

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
  
  @scala.inline
  def apply(): SchemaGetJSONWebKeysResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGetJSONWebKeysResponse]
  }
  
  @scala.inline
  implicit class SchemaGetJSONWebKeysResponseMutableBuilder[Self <: SchemaGetJSONWebKeysResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKeys(value: js.Array[SchemaJwk]): Self = StObject.set(x, "keys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeysUndefined: Self = StObject.set(x, "keys", js.undefined)
    
    @scala.inline
    def setKeysVarargs(value: SchemaJwk*): Self = StObject.set(x, "keys", js.Array(value :_*))
  }
}
