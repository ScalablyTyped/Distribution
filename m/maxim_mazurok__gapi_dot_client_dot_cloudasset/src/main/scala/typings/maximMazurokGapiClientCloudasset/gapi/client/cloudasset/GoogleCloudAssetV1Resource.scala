package typings.maximMazurokGapiClientCloudasset.gapi.client.cloudasset

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudAssetV1Resource extends js.Object {
  
  /** The analysis state of this resource. */
  var analysisState: js.UndefOr[IamPolicyAnalysisState] = js.native
  
  /** The [full resource name](https://cloud.google.com/asset-inventory/docs/resource-name-format) */
  var fullResourceName: js.UndefOr[String] = js.native
}
object GoogleCloudAssetV1Resource {
  
  @scala.inline
  def apply(): GoogleCloudAssetV1Resource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudAssetV1Resource]
  }
  
  @scala.inline
  implicit class GoogleCloudAssetV1ResourceOps[Self <: GoogleCloudAssetV1Resource] (val x: Self) extends AnyVal {
    
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
    def setFullResourceName(value: String): Self = this.set("fullResourceName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFullResourceName: Self = this.set("fullResourceName", js.undefined)
  }
}
