package typings.maximMazurokGapiClientDialogflow.gapi.client.dialogflow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudDialogflowV2beta1IntentMessageListSelectItem extends StObject {
  
  /** Optional. The main text describing the item. */
  var description: js.UndefOr[String] = js.undefined
  
  /** Optional. The image to display. */
  var image: js.UndefOr[GoogleCloudDialogflowV2beta1IntentMessageImage] = js.undefined
  
  /** Required. Additional information about this option. */
  var info: js.UndefOr[GoogleCloudDialogflowV2beta1IntentMessageSelectItemInfo] = js.undefined
  
  /** Required. The title of the list item. */
  var title: js.UndefOr[String] = js.undefined
}
object GoogleCloudDialogflowV2beta1IntentMessageListSelectItem {
  
  @scala.inline
  def apply(): GoogleCloudDialogflowV2beta1IntentMessageListSelectItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDialogflowV2beta1IntentMessageListSelectItem]
  }
  
  @scala.inline
  implicit class GoogleCloudDialogflowV2beta1IntentMessageListSelectItemMutableBuilder[Self <: GoogleCloudDialogflowV2beta1IntentMessageListSelectItem] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setImage(value: GoogleCloudDialogflowV2beta1IntentMessageImage): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImageUndefined: Self = StObject.set(x, "image", js.undefined)
    
    @scala.inline
    def setInfo(value: GoogleCloudDialogflowV2beta1IntentMessageSelectItemInfo): Self = StObject.set(x, "info", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInfoUndefined: Self = StObject.set(x, "info", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
