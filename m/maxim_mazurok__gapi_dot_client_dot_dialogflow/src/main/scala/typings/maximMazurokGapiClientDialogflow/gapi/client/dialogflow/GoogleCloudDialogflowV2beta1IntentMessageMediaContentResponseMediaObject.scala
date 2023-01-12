package typings.maximMazurokGapiClientDialogflow.gapi.client.dialogflow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudDialogflowV2beta1IntentMessageMediaContentResponseMediaObject extends StObject {
  
  /** Required. Url where the media is stored. */
  var contentUrl: js.UndefOr[String] = js.undefined
  
  /** Optional. Description of media card. */
  var description: js.UndefOr[String] = js.undefined
  
  /** Optional. Icon to display above media content. */
  var icon: js.UndefOr[GoogleCloudDialogflowV2beta1IntentMessageImage] = js.undefined
  
  /** Optional. Image to display above media content. */
  var largeImage: js.UndefOr[GoogleCloudDialogflowV2beta1IntentMessageImage] = js.undefined
  
  /** Required. Name of media card. */
  var name: js.UndefOr[String] = js.undefined
}
object GoogleCloudDialogflowV2beta1IntentMessageMediaContentResponseMediaObject {
  
  inline def apply(): GoogleCloudDialogflowV2beta1IntentMessageMediaContentResponseMediaObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDialogflowV2beta1IntentMessageMediaContentResponseMediaObject]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GoogleCloudDialogflowV2beta1IntentMessageMediaContentResponseMediaObject] (val x: Self) extends AnyVal {
    
    inline def setContentUrl(value: String): Self = StObject.set(x, "contentUrl", value.asInstanceOf[js.Any])
    
    inline def setContentUrlUndefined: Self = StObject.set(x, "contentUrl", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setIcon(value: GoogleCloudDialogflowV2beta1IntentMessageImage): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
    
    inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
    
    inline def setLargeImage(value: GoogleCloudDialogflowV2beta1IntentMessageImage): Self = StObject.set(x, "largeImage", value.asInstanceOf[js.Any])
    
    inline def setLargeImageUndefined: Self = StObject.set(x, "largeImage", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
