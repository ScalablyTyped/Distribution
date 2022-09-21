package typings.googleapis.secretmanagerV1Mod.secretmanagerV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaDisableSecretVersionRequest extends StObject {
  
  /**
    * Optional. Etag of the SecretVersion. The request succeeds if it matches the etag of the currently stored secret version object. If the etag is omitted, the request succeeds.
    */
  var etag: js.UndefOr[String | Null] = js.undefined
}
object SchemaDisableSecretVersionRequest {
  
  inline def apply(): SchemaDisableSecretVersionRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDisableSecretVersionRequest]
  }
  
  extension [Self <: SchemaDisableSecretVersionRequest](x: Self) {
    
    inline def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
    
    inline def setEtagNull: Self = StObject.set(x, "etag", null)
    
    inline def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
  }
}
