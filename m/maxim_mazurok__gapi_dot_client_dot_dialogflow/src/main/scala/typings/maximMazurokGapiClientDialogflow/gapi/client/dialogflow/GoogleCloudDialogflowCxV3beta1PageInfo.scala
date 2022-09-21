package typings.maximMazurokGapiClientDialogflow.gapi.client.dialogflow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudDialogflowCxV3beta1PageInfo extends StObject {
  
  /** Always present for WebhookRequest. Ignored for WebhookResponse. The unique identifier of the current page. Format: `projects//locations//agents//flows//pages/`. */
  var currentPage: js.UndefOr[String] = js.undefined
  
  /** Always present for WebhookRequest. Ignored for WebhookResponse. The display name of the current page. */
  var displayName: js.UndefOr[String] = js.undefined
  
  /** Optional for both WebhookRequest and WebhookResponse. Information about the form. */
  var formInfo: js.UndefOr[GoogleCloudDialogflowCxV3beta1PageInfoFormInfo] = js.undefined
}
object GoogleCloudDialogflowCxV3beta1PageInfo {
  
  inline def apply(): GoogleCloudDialogflowCxV3beta1PageInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDialogflowCxV3beta1PageInfo]
  }
  
  extension [Self <: GoogleCloudDialogflowCxV3beta1PageInfo](x: Self) {
    
    inline def setCurrentPage(value: String): Self = StObject.set(x, "currentPage", value.asInstanceOf[js.Any])
    
    inline def setCurrentPageUndefined: Self = StObject.set(x, "currentPage", js.undefined)
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setFormInfo(value: GoogleCloudDialogflowCxV3beta1PageInfoFormInfo): Self = StObject.set(x, "formInfo", value.asInstanceOf[js.Any])
    
    inline def setFormInfoUndefined: Self = StObject.set(x, "formInfo", js.undefined)
  }
}
