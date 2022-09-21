package typings.googleapis.iamV1Mod.iamV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaServiceAccountKey extends StObject {
  
  /**
    * The key status.
    */
  var disabled: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Specifies the algorithm (and possibly key size) for the key.
    */
  var keyAlgorithm: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The key origin.
    */
  var keyOrigin: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The key type.
    */
  var keyType: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The resource name of the service account key in the following format `projects/{PROJECT_ID\}/serviceAccounts/{ACCOUNT\}/keys/{key\}`.
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The private key data. Only provided in `CreateServiceAccountKey` responses. Make sure to keep the private key data secure because it allows for the assertion of the service account identity. When base64 decoded, the private key data can be used to authenticate with Google API client libraries and with gcloud auth activate-service-account.
    */
  var privateKeyData: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The output format for the private key. Only provided in `CreateServiceAccountKey` responses, not in `GetServiceAccountKey` or `ListServiceAccountKey` responses. Google never exposes system-managed private keys, and never retains user-managed private keys.
    */
  var privateKeyType: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The public key data. Only provided in `GetServiceAccountKey` responses.
    */
  var publicKeyData: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The key can be used after this timestamp.
    */
  var validAfterTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The key can be used before this timestamp. For system-managed key pairs, this timestamp is the end time for the private key signing operation. The public key could still be used for verification for a few hours after this time.
    */
  var validBeforeTime: js.UndefOr[String | Null] = js.undefined
}
object SchemaServiceAccountKey {
  
  inline def apply(): SchemaServiceAccountKey = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaServiceAccountKey]
  }
  
  extension [Self <: SchemaServiceAccountKey](x: Self) {
    
    inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    inline def setDisabledNull: Self = StObject.set(x, "disabled", null)
    
    inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    inline def setKeyAlgorithm(value: String): Self = StObject.set(x, "keyAlgorithm", value.asInstanceOf[js.Any])
    
    inline def setKeyAlgorithmNull: Self = StObject.set(x, "keyAlgorithm", null)
    
    inline def setKeyAlgorithmUndefined: Self = StObject.set(x, "keyAlgorithm", js.undefined)
    
    inline def setKeyOrigin(value: String): Self = StObject.set(x, "keyOrigin", value.asInstanceOf[js.Any])
    
    inline def setKeyOriginNull: Self = StObject.set(x, "keyOrigin", null)
    
    inline def setKeyOriginUndefined: Self = StObject.set(x, "keyOrigin", js.undefined)
    
    inline def setKeyType(value: String): Self = StObject.set(x, "keyType", value.asInstanceOf[js.Any])
    
    inline def setKeyTypeNull: Self = StObject.set(x, "keyType", null)
    
    inline def setKeyTypeUndefined: Self = StObject.set(x, "keyType", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setPrivateKeyData(value: String): Self = StObject.set(x, "privateKeyData", value.asInstanceOf[js.Any])
    
    inline def setPrivateKeyDataNull: Self = StObject.set(x, "privateKeyData", null)
    
    inline def setPrivateKeyDataUndefined: Self = StObject.set(x, "privateKeyData", js.undefined)
    
    inline def setPrivateKeyType(value: String): Self = StObject.set(x, "privateKeyType", value.asInstanceOf[js.Any])
    
    inline def setPrivateKeyTypeNull: Self = StObject.set(x, "privateKeyType", null)
    
    inline def setPrivateKeyTypeUndefined: Self = StObject.set(x, "privateKeyType", js.undefined)
    
    inline def setPublicKeyData(value: String): Self = StObject.set(x, "publicKeyData", value.asInstanceOf[js.Any])
    
    inline def setPublicKeyDataNull: Self = StObject.set(x, "publicKeyData", null)
    
    inline def setPublicKeyDataUndefined: Self = StObject.set(x, "publicKeyData", js.undefined)
    
    inline def setValidAfterTime(value: String): Self = StObject.set(x, "validAfterTime", value.asInstanceOf[js.Any])
    
    inline def setValidAfterTimeNull: Self = StObject.set(x, "validAfterTime", null)
    
    inline def setValidAfterTimeUndefined: Self = StObject.set(x, "validAfterTime", js.undefined)
    
    inline def setValidBeforeTime(value: String): Self = StObject.set(x, "validBeforeTime", value.asInstanceOf[js.Any])
    
    inline def setValidBeforeTimeNull: Self = StObject.set(x, "validBeforeTime", null)
    
    inline def setValidBeforeTimeUndefined: Self = StObject.set(x, "validBeforeTime", js.undefined)
  }
}
