package typings.googleapis.dialogflowV2beta1Mod.dialogflowV2beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDialogflowV2IntentMessageMediaContent extends StObject {
  
  /**
    * Required. List of media objects.
    */
  var mediaObjects: js.UndefOr[
    js.Array[SchemaGoogleCloudDialogflowV2IntentMessageMediaContentResponseMediaObject]
  ] = js.undefined
  
  /**
    * Optional. What type of media is the content (ie "audio").
    */
  var mediaType: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudDialogflowV2IntentMessageMediaContent {
  
  inline def apply(): SchemaGoogleCloudDialogflowV2IntentMessageMediaContent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDialogflowV2IntentMessageMediaContent]
  }
  
  extension [Self <: SchemaGoogleCloudDialogflowV2IntentMessageMediaContent](x: Self) {
    
    inline def setMediaObjects(value: js.Array[SchemaGoogleCloudDialogflowV2IntentMessageMediaContentResponseMediaObject]): Self = StObject.set(x, "mediaObjects", value.asInstanceOf[js.Any])
    
    inline def setMediaObjectsUndefined: Self = StObject.set(x, "mediaObjects", js.undefined)
    
    inline def setMediaObjectsVarargs(value: SchemaGoogleCloudDialogflowV2IntentMessageMediaContentResponseMediaObject*): Self = StObject.set(x, "mediaObjects", js.Array(value*))
    
    inline def setMediaType(value: String): Self = StObject.set(x, "mediaType", value.asInstanceOf[js.Any])
    
    inline def setMediaTypeNull: Self = StObject.set(x, "mediaType", null)
    
    inline def setMediaTypeUndefined: Self = StObject.set(x, "mediaType", js.undefined)
  }
}
