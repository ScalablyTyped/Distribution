package typings.googleapis.iamV1Mod.iamV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The service account keys list response.
  */
@js.native
trait SchemaListServiceAccountKeysResponse extends StObject {
  
  /**
    * The public keys for the service account.
    */
  var keys: js.UndefOr[js.Array[SchemaServiceAccountKey]] = js.native
}
object SchemaListServiceAccountKeysResponse {
  
  @scala.inline
  def apply(): SchemaListServiceAccountKeysResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListServiceAccountKeysResponse]
  }
  
  @scala.inline
  implicit class SchemaListServiceAccountKeysResponseMutableBuilder[Self <: SchemaListServiceAccountKeysResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKeys(value: js.Array[SchemaServiceAccountKey]): Self = StObject.set(x, "keys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeysUndefined: Self = StObject.set(x, "keys", js.undefined)
    
    @scala.inline
    def setKeysVarargs(value: SchemaServiceAccountKey*): Self = StObject.set(x, "keys", js.Array(value :_*))
  }
}
