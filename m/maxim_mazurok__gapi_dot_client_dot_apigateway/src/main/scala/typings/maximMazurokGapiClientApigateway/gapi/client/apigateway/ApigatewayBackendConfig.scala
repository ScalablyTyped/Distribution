package typings.maximMazurokGapiClientApigateway.gapi.client.apigateway

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ApigatewayBackendConfig extends js.Object {
  
  /**
    * Google Cloud IAM service account used to sign OIDC tokens for backends that have authentication configured (https: //cloud.google.com/service-infrastructur //
    * e/docs/service-management/reference/rest/v1/services.configs#backend). This may either be the Service Account's email (i.e. "{ACCOUNT_ID}@{PROJECT}.iam.gserviceaccount.com") or its
    * full resource name (i.e. "projects/{PROJECT}/accounts/{UNIQUE_ID}"). This is most often used when the backend is a GCP resource such as a Cloud Run Service or an IAP-secured
    * service. Note that this token is always sent as an authorization header bearer token. The audience of the OIDC token is configured in the associated Service Config in the
    * BackendRule option (https: //github.com/googleapis/googleapis/blob/ // master/google/api/backend.proto#L125).
    */
  var googleServiceAccount: js.UndefOr[String] = js.native
}
object ApigatewayBackendConfig {
  
  @scala.inline
  def apply(): ApigatewayBackendConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ApigatewayBackendConfig]
  }
  
  @scala.inline
  implicit class ApigatewayBackendConfigOps[Self <: ApigatewayBackendConfig] (val x: Self) extends AnyVal {
    
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
    def setGoogleServiceAccount(value: String): Self = this.set("googleServiceAccount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGoogleServiceAccount: Self = this.set("googleServiceAccount", js.undefined)
  }
}
