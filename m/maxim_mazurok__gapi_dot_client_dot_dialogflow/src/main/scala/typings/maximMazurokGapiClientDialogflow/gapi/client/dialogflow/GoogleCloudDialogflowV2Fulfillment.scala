package typings.maximMazurokGapiClientDialogflow.gapi.client.dialogflow

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudDialogflowV2Fulfillment extends js.Object {
  
  /** Optional. The human-readable name of the fulfillment, unique within the agent. */
  var displayName: js.UndefOr[String] = js.native
  
  /** Optional. Whether fulfillment is enabled. */
  var enabled: js.UndefOr[Boolean] = js.native
  
  /** Optional. The field defines whether the fulfillment is enabled for certain features. */
  var features: js.UndefOr[js.Array[GoogleCloudDialogflowV2FulfillmentFeature]] = js.native
  
  /** Configuration for a generic web service. */
  var genericWebService: js.UndefOr[GoogleCloudDialogflowV2FulfillmentGenericWebService] = js.native
  
  /** Required. The unique identifier of the fulfillment. Format: `projects//agent/fulfillment`. */
  var name: js.UndefOr[String] = js.native
}
object GoogleCloudDialogflowV2Fulfillment {
  
  @scala.inline
  def apply(): GoogleCloudDialogflowV2Fulfillment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDialogflowV2Fulfillment]
  }
  
  @scala.inline
  implicit class GoogleCloudDialogflowV2FulfillmentOps[Self <: GoogleCloudDialogflowV2Fulfillment] (val x: Self) extends AnyVal {
    
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
    def setDisplayName(value: String): Self = this.set("displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisplayName: Self = this.set("displayName", js.undefined)
    
    @scala.inline
    def setEnabled(value: Boolean): Self = this.set("enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnabled: Self = this.set("enabled", js.undefined)
    
    @scala.inline
    def setFeaturesVarargs(value: GoogleCloudDialogflowV2FulfillmentFeature*): Self = this.set("features", js.Array(value :_*))
    
    @scala.inline
    def setFeatures(value: js.Array[GoogleCloudDialogflowV2FulfillmentFeature]): Self = this.set("features", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFeatures: Self = this.set("features", js.undefined)
    
    @scala.inline
    def setGenericWebService(value: GoogleCloudDialogflowV2FulfillmentGenericWebService): Self = this.set("genericWebService", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGenericWebService: Self = this.set("genericWebService", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
  }
}
