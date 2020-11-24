package typings.maximMazurokGapiClientAssuredworkloads.gapi.client.assuredworkloads

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudAssuredworkloadsV1CreateWorkloadOperationMetadata extends js.Object {
  
  /** Optional. Compliance controls that should be applied to the resources managed by the workload. */
  var complianceRegime: js.UndefOr[String] = js.native
  
  /** Optional. Time when the operation was created. */
  var createTime: js.UndefOr[String] = js.native
  
  /** Optional. The display name of the workload. */
  var displayName: js.UndefOr[String] = js.native
  
  /** Optional. The parent of the workload. */
  var parent: js.UndefOr[String] = js.native
}
object GoogleCloudAssuredworkloadsV1CreateWorkloadOperationMetadata {
  
  @scala.inline
  def apply(): GoogleCloudAssuredworkloadsV1CreateWorkloadOperationMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudAssuredworkloadsV1CreateWorkloadOperationMetadata]
  }
  
  @scala.inline
  implicit class GoogleCloudAssuredworkloadsV1CreateWorkloadOperationMetadataOps[Self <: GoogleCloudAssuredworkloadsV1CreateWorkloadOperationMetadata] (val x: Self) extends AnyVal {
    
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
    def setComplianceRegime(value: String): Self = this.set("complianceRegime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteComplianceRegime: Self = this.set("complianceRegime", js.undefined)
    
    @scala.inline
    def setCreateTime(value: String): Self = this.set("createTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreateTime: Self = this.set("createTime", js.undefined)
    
    @scala.inline
    def setDisplayName(value: String): Self = this.set("displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisplayName: Self = this.set("displayName", js.undefined)
    
    @scala.inline
    def setParent(value: String): Self = this.set("parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParent: Self = this.set("parent", js.undefined)
  }
}
