package typings.googleapis.iamV1Mod.iamV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a service account key.  A service account has two sets of
  * key-pairs: user-managed, and system-managed.  User-managed key-pairs can be
  * created and deleted by users.  Users are responsible for rotating these
  * keys periodically to ensure security of their service accounts.  Users
  * retain the private key of these key-pairs, and Google retains ONLY the
  * public key.  System-managed keys are automatically rotated by Google, and
  * are used for signing for a maximum of two weeks. The rotation process is
  * probabilistic, and usage of the new key will gradually ramp up and down
  * over the key&#39;s lifetime. We recommend caching the public key set for a
  * service account for no more than 24 hours to ensure you have access to the
  * latest keys.  Public keys for all service accounts are also published at
  * the OAuth2 Service Account API.
  */
@js.native
trait SchemaServiceAccountKey extends StObject {
  
  /**
    * Specifies the algorithm (and possibly key size) for the key.
    */
  var keyAlgorithm: js.UndefOr[String] = js.native
  
  /**
    * The resource name of the service account key in the following format
    * `projects/{PROJECT_ID}/serviceAccounts/{ACCOUNT}/keys/{key}`.
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * The private key data. Only provided in `CreateServiceAccountKey`
    * responses. Make sure to keep the private key data secure because it
    * allows for the assertion of the service account identity. When base64
    * decoded, the private key data can be used to authenticate with Google API
    * client libraries and with &lt;a
    * href=&quot;/sdk/gcloud/reference/auth/activate-service-account&quot;&gt;gcloud
    * auth activate-service-account&lt;/a&gt;.
    */
  var privateKeyData: js.UndefOr[String] = js.native
  
  /**
    * The output format for the private key. Only provided in
    * `CreateServiceAccountKey` responses, not in `GetServiceAccountKey` or
    * `ListServiceAccountKey` responses.  Google never exposes system-managed
    * private keys, and never retains user-managed private keys.
    */
  var privateKeyType: js.UndefOr[String] = js.native
  
  /**
    * The public key data. Only provided in `GetServiceAccountKey` responses.
    */
  var publicKeyData: js.UndefOr[String] = js.native
  
  /**
    * The key can be used after this timestamp.
    */
  var validAfterTime: js.UndefOr[String] = js.native
  
  /**
    * The key can be used before this timestamp.
    */
  var validBeforeTime: js.UndefOr[String] = js.native
}
object SchemaServiceAccountKey {
  
  @scala.inline
  def apply(): SchemaServiceAccountKey = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaServiceAccountKey]
  }
  
  @scala.inline
  implicit class SchemaServiceAccountKeyMutableBuilder[Self <: SchemaServiceAccountKey] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKeyAlgorithm(value: String): Self = StObject.set(x, "keyAlgorithm", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyAlgorithmUndefined: Self = StObject.set(x, "keyAlgorithm", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setPrivateKeyData(value: String): Self = StObject.set(x, "privateKeyData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrivateKeyDataUndefined: Self = StObject.set(x, "privateKeyData", js.undefined)
    
    @scala.inline
    def setPrivateKeyType(value: String): Self = StObject.set(x, "privateKeyType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrivateKeyTypeUndefined: Self = StObject.set(x, "privateKeyType", js.undefined)
    
    @scala.inline
    def setPublicKeyData(value: String): Self = StObject.set(x, "publicKeyData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPublicKeyDataUndefined: Self = StObject.set(x, "publicKeyData", js.undefined)
    
    @scala.inline
    def setValidAfterTime(value: String): Self = StObject.set(x, "validAfterTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValidAfterTimeUndefined: Self = StObject.set(x, "validAfterTime", js.undefined)
    
    @scala.inline
    def setValidBeforeTime(value: String): Self = StObject.set(x, "validBeforeTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValidBeforeTimeUndefined: Self = StObject.set(x, "validBeforeTime", js.undefined)
  }
}
