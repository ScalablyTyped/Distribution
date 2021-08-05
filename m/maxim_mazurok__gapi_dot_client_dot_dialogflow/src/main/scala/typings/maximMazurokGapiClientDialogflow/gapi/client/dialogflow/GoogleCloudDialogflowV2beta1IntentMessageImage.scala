package typings.maximMazurokGapiClientDialogflow.gapi.client.dialogflow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudDialogflowV2beta1IntentMessageImage extends StObject {
  
  /** A text description of the image to be used for accessibility, e.g., screen readers. Required if image_uri is set for CarouselSelect. */
  var accessibilityText: js.UndefOr[String] = js.undefined
  
  /** Optional. The public URI to an image file. */
  var imageUri: js.UndefOr[String] = js.undefined
}
object GoogleCloudDialogflowV2beta1IntentMessageImage {
  
  inline def apply(): GoogleCloudDialogflowV2beta1IntentMessageImage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDialogflowV2beta1IntentMessageImage]
  }
  
  extension [Self <: GoogleCloudDialogflowV2beta1IntentMessageImage](x: Self) {
    
    inline def setAccessibilityText(value: String): Self = StObject.set(x, "accessibilityText", value.asInstanceOf[js.Any])
    
    inline def setAccessibilityTextUndefined: Self = StObject.set(x, "accessibilityText", js.undefined)
    
    inline def setImageUri(value: String): Self = StObject.set(x, "imageUri", value.asInstanceOf[js.Any])
    
    inline def setImageUriUndefined: Self = StObject.set(x, "imageUri", js.undefined)
  }
}
