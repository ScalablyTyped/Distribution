package typings.maximMazurokGapiClientDialogflow.gapi.client.dialogflow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudDialogflowV2IntentMessageBrowseCarouselCardBrowseCarouselCardItemOpenUrlAction extends StObject {
  
  /** Required. URL */
  var url: js.UndefOr[String] = js.undefined
  
  /** Optional. Specifies the type of viewer that is used when opening the URL. Defaults to opening via web browser. */
  var urlTypeHint: js.UndefOr[String] = js.undefined
}
object GoogleCloudDialogflowV2IntentMessageBrowseCarouselCardBrowseCarouselCardItemOpenUrlAction {
  
  inline def apply(): GoogleCloudDialogflowV2IntentMessageBrowseCarouselCardBrowseCarouselCardItemOpenUrlAction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDialogflowV2IntentMessageBrowseCarouselCardBrowseCarouselCardItemOpenUrlAction]
  }
  
  extension [Self <: GoogleCloudDialogflowV2IntentMessageBrowseCarouselCardBrowseCarouselCardItemOpenUrlAction](x: Self) {
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlTypeHint(value: String): Self = StObject.set(x, "urlTypeHint", value.asInstanceOf[js.Any])
    
    inline def setUrlTypeHintUndefined: Self = StObject.set(x, "urlTypeHint", js.undefined)
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
