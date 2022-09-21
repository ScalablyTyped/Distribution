package typings.googleapis.secretmanagerV1beta1Mod.secretmanagerV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaAccessSecretVersionResponse extends StObject {
  
  /**
    * The resource name of the SecretVersion in the format `projects/x/secrets/x/versions/x`.
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Secret payload
    */
  var payload: js.UndefOr[SchemaSecretPayload] = js.undefined
}
object SchemaAccessSecretVersionResponse {
  
  inline def apply(): SchemaAccessSecretVersionResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAccessSecretVersionResponse]
  }
  
  extension [Self <: SchemaAccessSecretVersionResponse](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setPayload(value: SchemaSecretPayload): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
    
    inline def setPayloadUndefined: Self = StObject.set(x, "payload", js.undefined)
  }
}
