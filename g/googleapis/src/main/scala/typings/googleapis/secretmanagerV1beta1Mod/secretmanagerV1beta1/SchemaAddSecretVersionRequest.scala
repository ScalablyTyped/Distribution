package typings.googleapis.secretmanagerV1beta1Mod.secretmanagerV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaAddSecretVersionRequest extends StObject {
  
  /**
    * Required. The secret payload of the SecretVersion.
    */
  var payload: js.UndefOr[SchemaSecretPayload] = js.undefined
}
object SchemaAddSecretVersionRequest {
  
  inline def apply(): SchemaAddSecretVersionRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAddSecretVersionRequest]
  }
  
  extension [Self <: SchemaAddSecretVersionRequest](x: Self) {
    
    inline def setPayload(value: SchemaSecretPayload): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
    
    inline def setPayloadUndefined: Self = StObject.set(x, "payload", js.undefined)
  }
}
