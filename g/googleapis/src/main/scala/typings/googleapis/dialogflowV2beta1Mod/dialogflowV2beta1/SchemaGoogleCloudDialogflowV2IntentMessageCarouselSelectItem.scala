package typings.googleapis.dialogflowV2beta1Mod.dialogflowV2beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An item in the carousel.
  */
trait SchemaGoogleCloudDialogflowV2IntentMessageCarouselSelectItem extends StObject {
  
  /**
    * Optional. The body text of the card.
    */
  var description: js.UndefOr[String] = js.undefined
  
  /**
    * Optional. The image to display.
    */
  var image: js.UndefOr[SchemaGoogleCloudDialogflowV2IntentMessageImage] = js.undefined
  
  /**
    * Required. Additional info about the option item.
    */
  var info: js.UndefOr[SchemaGoogleCloudDialogflowV2IntentMessageSelectItemInfo] = js.undefined
  
  /**
    * Required. Title of the carousel item.
    */
  var title: js.UndefOr[String] = js.undefined
}
object SchemaGoogleCloudDialogflowV2IntentMessageCarouselSelectItem {
  
  inline def apply(): SchemaGoogleCloudDialogflowV2IntentMessageCarouselSelectItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDialogflowV2IntentMessageCarouselSelectItem]
  }
  
  extension [Self <: SchemaGoogleCloudDialogflowV2IntentMessageCarouselSelectItem](x: Self) {
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setImage(value: SchemaGoogleCloudDialogflowV2IntentMessageImage): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
    
    inline def setImageUndefined: Self = StObject.set(x, "image", js.undefined)
    
    inline def setInfo(value: SchemaGoogleCloudDialogflowV2IntentMessageSelectItemInfo): Self = StObject.set(x, "info", value.asInstanceOf[js.Any])
    
    inline def setInfoUndefined: Self = StObject.set(x, "info", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
