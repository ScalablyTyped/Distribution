package typings.googleapis.v3beta1Mod.dialogflowV3beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDialogflowV2IntentMessageBrowseCarouselCardBrowseCarouselCardItem extends StObject {
  
  /**
    * Optional. Description of the carousel item. Maximum of four lines of text.
    */
  var description: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Optional. Text that appears at the bottom of the Browse Carousel Card. Maximum of one line of text.
    */
  var footer: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Optional. Hero image for the carousel item.
    */
  var image: js.UndefOr[SchemaGoogleCloudDialogflowV2IntentMessageImage] = js.undefined
  
  /**
    * Required. Action to present to the user.
    */
  var openUriAction: js.UndefOr[
    SchemaGoogleCloudDialogflowV2IntentMessageBrowseCarouselCardBrowseCarouselCardItemOpenUrlAction
  ] = js.undefined
  
  /**
    * Required. Title of the carousel item. Maximum of two lines of text.
    */
  var title: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudDialogflowV2IntentMessageBrowseCarouselCardBrowseCarouselCardItem {
  
  inline def apply(): SchemaGoogleCloudDialogflowV2IntentMessageBrowseCarouselCardBrowseCarouselCardItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDialogflowV2IntentMessageBrowseCarouselCardBrowseCarouselCardItem]
  }
  
  extension [Self <: SchemaGoogleCloudDialogflowV2IntentMessageBrowseCarouselCardBrowseCarouselCardItem](x: Self) {
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionNull: Self = StObject.set(x, "description", null)
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setFooter(value: String): Self = StObject.set(x, "footer", value.asInstanceOf[js.Any])
    
    inline def setFooterNull: Self = StObject.set(x, "footer", null)
    
    inline def setFooterUndefined: Self = StObject.set(x, "footer", js.undefined)
    
    inline def setImage(value: SchemaGoogleCloudDialogflowV2IntentMessageImage): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
    
    inline def setImageUndefined: Self = StObject.set(x, "image", js.undefined)
    
    inline def setOpenUriAction(
      value: SchemaGoogleCloudDialogflowV2IntentMessageBrowseCarouselCardBrowseCarouselCardItemOpenUrlAction
    ): Self = StObject.set(x, "openUriAction", value.asInstanceOf[js.Any])
    
    inline def setOpenUriActionUndefined: Self = StObject.set(x, "openUriAction", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleNull: Self = StObject.set(x, "title", null)
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
