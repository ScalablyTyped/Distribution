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
  
  @scala.inline
  def apply(): GoogleCloudDialogflowV2beta1IntentMessageMediaContent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDialogflowV2beta1IntentMessageMediaContent]
  }
  
  @scala.inline
  implicit class GoogleCloudDialogflowV2beta1IntentMessageMediaContentMutableBuilder[Self <: GoogleCloudDialogflowV2beta1IntentMessageMediaContent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMediaObjects(value: js.Array[GoogleCloudDialogflowV2beta1IntentMessageMediaContentResponseMediaObject]): Self = StObject.set(x, "mediaObjects", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMediaObjectsUndefined: Self = StObject.set(x, "mediaObjects", js.undefined)
    
    @scala.inline
    def setMediaObjectsVarargs(value: GoogleCloudDialogflowV2beta1IntentMessageMediaContentResponseMediaObject*): Self = StObject.set(x, "mediaObjects", js.Array(value :_*))
    
    @scala.inline
    def setMediaType(value: String): Self = StObject.set(x, "mediaType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMediaTypeUndefined: Self = StObject.set(x, "mediaType", js.undefined)
  }
}
