package typings.maximMazurokGapiClientDialogflow.gapi.client.dialogflow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudDialogflowV2beta1IntentMessageBrowseCarouselCardBrowseCarouselCardItem extends StObject {
  
  /** Optional. Description of the carousel item. Maximum of four lines of text. */
  var description: js.UndefOr[String] = js.undefined
  
  /** Optional. Text that appears at the bottom of the Browse Carousel Card. Maximum of one line of text. */
  var footer: js.UndefOr[String] = js.undefined
  
  /** Optional. Hero image for the carousel item. */
  var image: js.UndefOr[GoogleCloudDialogflowV2beta1IntentMessageImage] = js.undefined
  
  /** Required. Action to present to the user. */
  var openUriAction: js.UndefOr[
    GoogleCloudDialogflowV2beta1IntentMessageBrowseCarouselCardBrowseCarouselCardItemOpenUrlAction
  ] = js.undefined
  
  /** Required. Title of the carousel item. Maximum of two lines of text. */
  var title: js.UndefOr[String] = js.undefined
}
object GoogleCloudDialogflowV2beta1IntentMessageBrowseCarouselCardBrowseCarouselCardItem {
  
  @scala.inline
  def apply(): GoogleCloudDialogflowV2beta1IntentMessageBrowseCarouselCardBrowseCarouselCardItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDialogflowV2beta1IntentMessageBrowseCarouselCardBrowseCarouselCardItem]
  }
  
  @scala.inline
  implicit class GoogleCloudDialogflowV2beta1IntentMessageBrowseCarouselCardBrowseCarouselCardItemMutableBuilder[Self <: GoogleCloudDialogflowV2beta1IntentMessageBrowseCarouselCardBrowseCarouselCardItem] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setFooter(value: String): Self = StObject.set(x, "footer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFooterUndefined: Self = StObject.set(x, "footer", js.undefined)
    
    @scala.inline
    def setImage(value: GoogleCloudDialogflowV2beta1IntentMessageImage): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImageUndefined: Self = StObject.set(x, "image", js.undefined)
    
    @scala.inline
    def setOpenUriAction(
      value: GoogleCloudDialogflowV2beta1IntentMessageBrowseCarouselCardBrowseCarouselCardItemOpenUrlAction
    ): Self = StObject.set(x, "openUriAction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpenUriActionUndefined: Self = StObject.set(x, "openUriAction", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
