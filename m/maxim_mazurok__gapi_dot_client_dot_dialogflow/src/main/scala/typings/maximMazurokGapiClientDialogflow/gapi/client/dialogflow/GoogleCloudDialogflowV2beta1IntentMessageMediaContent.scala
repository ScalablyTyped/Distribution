package typings.maximMazurokGapiClientDialogflow.gapi.client.dialogflow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudDialogflowV2beta1IntentMessageMediaContent extends StObject {
  
  /** Required. List of media objects. */
  var mediaObjects: js.UndefOr[
    js.Array[GoogleCloudDialogflowV2beta1IntentMessageMediaContentResponseMediaObject]
  ] = js.undefined
  
  /** Optional. What type of media is the content (ie "audio"). */
  var mediaType: js.UndefOr[String] = js.undefined
}
object GoogleCloudDialogflowV2beta1IntentMessageMediaContent {
  
  inline def apply(): GoogleCloudDialogflowV2beta1IntentMessageMediaContent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDialogflowV2beta1IntentMessageMediaContent]
  }
  
  extension [Self <: GoogleCloudDialogflowV2beta1IntentMessageMediaContent](x: Self) {
    
    inline def setMediaObjects(value: js.Array[GoogleCloudDialogflowV2beta1IntentMessageMediaContentResponseMediaObject]): Self = StObject.set(x, "mediaObjects", value.asInstanceOf[js.Any])
    
    inline def setMediaObjectsUndefined: Self = StObject.set(x, "mediaObjects", js.undefined)
    
    inline def setMediaObjectsVarargs(value: GoogleCloudDialogflowV2beta1IntentMessageMediaContentResponseMediaObject*): Self = StObject.set(x, "mediaObjects", js.Array(value :_*))
    
    inline def setMediaType(value: String): Self = StObject.set(x, "mediaType", value.asInstanceOf[js.Any])
    
    inline def setMediaTypeUndefined: Self = StObject.set(x, "mediaType", js.undefined)
  }
}
