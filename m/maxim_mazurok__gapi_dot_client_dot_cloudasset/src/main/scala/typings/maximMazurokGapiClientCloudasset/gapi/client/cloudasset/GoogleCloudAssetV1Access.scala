package typings.maximMazurokGapiClientCloudasset.gapi.client.cloudasset

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudAssetV1Access extends js.Object {
  
  /** The analysis state of this access. */
  var analysisState: js.UndefOr[IamPolicyAnalysisState] = js.native
  
  /** The permission. */
  var permission: js.UndefOr[String] = js.native
  
  /** The role. */
  var role: js.UndefOr[String] = js.native
}
object GoogleCloudAssetV1Access {
  
  @scala.inline
  def apply(): GoogleCloudAssetV1Access = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudAssetV1Access]
  }
  
  @scala.inline
  implicit class GoogleCloudAssetV1AccessOps[Self <: GoogleCloudAssetV1Access] (val x: Self) extends AnyVal {
    
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
    def setPermission(value: String): Self = this.set("permission", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePermission: Self = this.set("permission", js.undefined)
    
    @scala.inline
    def setRole(value: String): Self = this.set("role", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRole: Self = this.set("role", js.undefined)
  }
}
