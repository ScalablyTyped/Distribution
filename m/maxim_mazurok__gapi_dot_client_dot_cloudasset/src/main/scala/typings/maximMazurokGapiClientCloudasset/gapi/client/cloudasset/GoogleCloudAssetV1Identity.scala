package typings.maximMazurokGapiClientCloudasset.gapi.client.cloudasset

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudAssetV1Identity extends js.Object {
  
  /** The analysis state of this identity. */
  var analysisState: js.UndefOr[IamPolicyAnalysisState] = js.native
  
  /**
    * The identity name in any form of members appear in [IAM policy binding](https://cloud.google.com/iam/reference/rest/v1/Binding), such as: - user:foo@google.com -
    * group:group1@google.com - serviceAccount:s1@prj1.iam.gserviceaccount.com - projectOwner:some_project_id - domain:google.com - allUsers - etc.
    */
  var name: js.UndefOr[String] = js.native
}
object GoogleCloudAssetV1Identity {
  
  @scala.inline
  def apply(): GoogleCloudAssetV1Identity = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudAssetV1Identity]
  }
  
  @scala.inline
  implicit class GoogleCloudAssetV1IdentityOps[Self <: GoogleCloudAssetV1Identity] (val x: Self) extends AnyVal {
    
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
    def setAnalysisState(value: IamPolicyAnalysisState): Self = this.set("analysisState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnalysisState: Self = this.set("analysisState", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
  }
}
