package typings.googleapis.iamcredentialsV1Mod.iamcredentialsV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaSignBlobRequest extends StObject {
  
  /**
    * The sequence of service accounts in a delegation chain. Each service
    * account must be granted the `roles/iam.serviceAccountTokenCreator` role
    * on its next service account in the chain. The last service account in the
    * chain must be granted the `roles/iam.serviceAccountTokenCreator` role on
    * the service account that is specified in the `name` field of the request.
    * The delegates must have the following format:
    * `projects/-/serviceAccounts/{ACCOUNT_EMAIL_OR_UNIQUEID}`. The `-`
    * wildcard character is required; replacing it with a project ID is
    * invalid.
    */
  var delegates: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * The bytes to sign.
    */
  var payload: js.UndefOr[String] = js.native
}
object SchemaSignBlobRequest {
  
  @scala.inline
  def apply(): SchemaSignBlobRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSignBlobRequest]
  }
  
  @scala.inline
  implicit class SchemaSignBlobRequestMutableBuilder[Self <: SchemaSignBlobRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDelegates(value: js.Array[String]): Self = StObject.set(x, "delegates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDelegatesUndefined: Self = StObject.set(x, "delegates", js.undefined)
    
    @scala.inline
    def setDelegatesVarargs(value: String*): Self = StObject.set(x, "delegates", js.Array(value :_*))
    
    @scala.inline
    def setPayload(value: String): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPayloadUndefined: Self = StObject.set(x, "payload", js.undefined)
  }
}
