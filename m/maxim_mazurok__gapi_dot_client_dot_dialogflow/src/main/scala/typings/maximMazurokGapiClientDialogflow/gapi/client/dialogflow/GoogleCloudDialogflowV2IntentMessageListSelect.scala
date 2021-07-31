package typings.maximMazurokGapiClientDialogflow.gapi.client.dialogflow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudDialogflowV2IntentMessageListSelect extends StObject {
  
  /** Required. List items. */
  var items: js.UndefOr[js.Array[GoogleCloudDialogflowV2IntentMessageListSelectItem]] = js.undefined
  
  /** Optional. Subtitle of the list. */
  var subtitle: js.UndefOr[String] = js.undefined
  
  /** Optional. The overall title of the list. */
  var title: js.UndefOr[String] = js.undefined
}
object GoogleCloudDialogflowV2IntentMessageListSelect {
  
  @scala.inline
  def apply(): GoogleCloudDialogflowV2IntentMessageListSelect = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDialogflowV2IntentMessageListSelect]
  }
  
  @scala.inline
  implicit class GoogleCloudDialogflowV2IntentMessageListSelectMutableBuilder[Self <: GoogleCloudDialogflowV2IntentMessageListSelect] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setItems(value: js.Array[GoogleCloudDialogflowV2IntentMessageListSelectItem]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    @scala.inline
    def setItemsVarargs(value: GoogleCloudDialogflowV2IntentMessageListSelectItem*): Self = StObject.set(x, "items", js.Array(value :_*))
    
    @scala.inline
    def setSubtitle(value: String): Self = StObject.set(x, "subtitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubtitleUndefined: Self = StObject.set(x, "subtitle", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
