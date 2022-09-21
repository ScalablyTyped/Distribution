package typings.googleapis.firebaseappcheckV1betaMod.firebaseappcheckV1beta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleFirebaseAppcheckV1betaDeviceCheckConfig extends StObject {
  
  /**
    * Required. The key identifier of a private key enabled with DeviceCheck, created in your Apple Developer account.
    */
  var keyId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Required. The relative resource name of the DeviceCheck configuration object, in the format: ``` projects/{project_number\}/apps/{app_id\}/deviceCheckConfig ```
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Required. Input only. The contents of the private key (`.p8`) file associated with the key specified by `key_id`. For security reasons, this field will never be populated in any response.
    */
  var privateKey: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. Whether the `private_key` field was previously set. Since we will never return the `private_key` field, this field is the only way to find out whether it was previously set.
    */
  var privateKeySet: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Specifies the duration for which App Check tokens exchanged from DeviceCheck tokens will be valid. If unset, a default value of 1 hour is assumed. Must be between 30 minutes and 7 days, inclusive.
    */
  var tokenTtl: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleFirebaseAppcheckV1betaDeviceCheckConfig {
  
  inline def apply(): SchemaGoogleFirebaseAppcheckV1betaDeviceCheckConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleFirebaseAppcheckV1betaDeviceCheckConfig]
  }
  
  extension [Self <: SchemaGoogleFirebaseAppcheckV1betaDeviceCheckConfig](x: Self) {
    
    inline def setKeyId(value: String): Self = StObject.set(x, "keyId", value.asInstanceOf[js.Any])
    
    inline def setKeyIdNull: Self = StObject.set(x, "keyId", null)
    
    inline def setKeyIdUndefined: Self = StObject.set(x, "keyId", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setPrivateKey(value: String): Self = StObject.set(x, "privateKey", value.asInstanceOf[js.Any])
    
    inline def setPrivateKeyNull: Self = StObject.set(x, "privateKey", null)
    
    inline def setPrivateKeySet(value: Boolean): Self = StObject.set(x, "privateKeySet", value.asInstanceOf[js.Any])
    
    inline def setPrivateKeySetNull: Self = StObject.set(x, "privateKeySet", null)
    
    inline def setPrivateKeySetUndefined: Self = StObject.set(x, "privateKeySet", js.undefined)
    
    inline def setPrivateKeyUndefined: Self = StObject.set(x, "privateKey", js.undefined)
    
    inline def setTokenTtl(value: String): Self = StObject.set(x, "tokenTtl", value.asInstanceOf[js.Any])
    
    inline def setTokenTtlNull: Self = StObject.set(x, "tokenTtl", null)
    
    inline def setTokenTtlUndefined: Self = StObject.set(x, "tokenTtl", js.undefined)
  }
}
