package typings.googleapis.dialogflowV2beta1Mod.dialogflowV2beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An item in the list.
  */
trait SchemaGoogleCloudDialogflowV2IntentMessageListSelectItem extends StObject {
  
  /**
    * Optional. The main text describing the item.
    */
  var description: js.UndefOr[String] = js.undefined
  
  /**
    * Optional. The image to display.
    */
  var image: js.UndefOr[SchemaGoogleCloudDialogflowV2IntentMessageImage] = js.undefined
  
  /**
    * Required. Additional information about this option.
    */
  var info: js.UndefOr[SchemaGoogleCloudDialogflowV2IntentMessageSelectItemInfo] = js.undefined
  
  /**
    * Required. The title of the list item.
    */
  var title: js.UndefOr[String] = js.undefined
}
object SchemaGoogleCloudDialogflowV2IntentMessageListSelectItem {
  
  inline def apply(): SchemaGoogleCloudDialogflowV2IntentMessageListSelectItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDialogflowV2IntentMessageListSelectItem]
  }
  
  extension [Self <: SchemaGoogleCloudDialogflowV2IntentMessageListSelectItem](x: Self) {
    
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
