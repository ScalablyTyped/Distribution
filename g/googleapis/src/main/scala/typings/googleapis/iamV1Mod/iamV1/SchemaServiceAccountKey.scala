package typings.googleapis.iamV1Mod.iamV1

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
trait SchemaServiceAccountKey extends js.Object {
  
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
  implicit class SchemaServiceAccountKeyOps[Self <: SchemaServiceAccountKey] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setKeyAlgorithm(value: String): Self = this.set("keyAlgorithm", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKeyAlgorithm: Self = this.set("keyAlgorithm", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setPrivateKeyData(value: String): Self = this.set("privateKeyData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrivateKeyData: Self = this.set("privateKeyData", js.undefined)
    
    @scala.inline
    def setPrivateKeyType(value: String): Self = this.set("privateKeyType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrivateKeyType: Self = this.set("privateKeyType", js.undefined)
    
    @scala.inline
    def setPublicKeyData(value: String): Self = this.set("publicKeyData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePublicKeyData: Self = this.set("publicKeyData", js.undefined)
    
    @scala.inline
    def setValidAfterTime(value: String): Self = this.set("validAfterTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValidAfterTime: Self = this.set("validAfterTime", js.undefined)
    
    @scala.inline
    def setValidBeforeTime(value: String): Self = this.set("validBeforeTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValidBeforeTime: Self = this.set("validBeforeTime", js.undefined)
  }
}
