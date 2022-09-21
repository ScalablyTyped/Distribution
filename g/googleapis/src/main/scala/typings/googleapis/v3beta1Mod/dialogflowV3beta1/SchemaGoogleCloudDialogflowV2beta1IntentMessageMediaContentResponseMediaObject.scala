package typings.googleapis.v3beta1Mod.dialogflowV3beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDialogflowV2beta1IntentMessageMediaContentResponseMediaObject extends StObject {
  
  /**
    * Required. Url where the media is stored.
    */
  var contentUrl: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Optional. Description of media card.
    */
  var description: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Optional. Icon to display above media content.
    */
  var icon: js.UndefOr[SchemaGoogleCloudDialogflowV2beta1IntentMessageImage] = js.undefined
  
  /**
    * Optional. Image to display above media content.
    */
  var largeImage: js.UndefOr[SchemaGoogleCloudDialogflowV2beta1IntentMessageImage] = js.undefined
  
  /**
    * Required. Name of media card.
    */
  var name: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudDialogflowV2beta1IntentMessageMediaContentResponseMediaObject {
  
  inline def apply(): SchemaGoogleCloudDialogflowV2beta1IntentMessageMediaContentResponseMediaObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDialogflowV2beta1IntentMessageMediaContentResponseMediaObject]
  }
  
  extension [Self <: SchemaGoogleCloudDialogflowV2beta1IntentMessageMediaContentResponseMediaObject](x: Self) {
    
    inline def setContentUrl(value: String): Self = StObject.set(x, "contentUrl", value.asInstanceOf[js.Any])
    
    inline def setContentUrlNull: Self = StObject.set(x, "contentUrl", null)
    
    inline def setContentUrlUndefined: Self = StObject.set(x, "contentUrl", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionNull: Self = StObject.set(x, "description", null)
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setIcon(value: SchemaGoogleCloudDialogflowV2beta1IntentMessageImage): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
    
    inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
    
    inline def setLargeImage(value: SchemaGoogleCloudDialogflowV2beta1IntentMessageImage): Self = StObject.set(x, "largeImage", value.asInstanceOf[js.Any])
    
    inline def setLargeImageUndefined: Self = StObject.set(x, "largeImage", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
