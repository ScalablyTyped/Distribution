package typings.maximMazurokGapiClientDialogflow.gapi.client.dialogflow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudDialogflowV2MessageAnnotation extends StObject {
  
  /** Indicates whether the text message contains entities. */
  var containEntities: js.UndefOr[Boolean] = js.undefined
  
  /** The collection of annotated message parts ordered by their position in the message. You can recover the annotated message by concatenating [AnnotatedMessagePart.text]. */
  var parts: js.UndefOr[js.Array[GoogleCloudDialogflowV2AnnotatedMessagePart]] = js.undefined
}
object GoogleCloudDialogflowV2MessageAnnotation {
  
  inline def apply(): GoogleCloudDialogflowV2MessageAnnotation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDialogflowV2MessageAnnotation]
  }
  
  extension [Self <: GoogleCloudDialogflowV2MessageAnnotation](x: Self) {
    
    inline def setContainEntities(value: Boolean): Self = StObject.set(x, "containEntities", value.asInstanceOf[js.Any])
    
    inline def setContainEntitiesUndefined: Self = StObject.set(x, "containEntities", js.undefined)
    
    inline def setParts(value: js.Array[GoogleCloudDialogflowV2AnnotatedMessagePart]): Self = StObject.set(x, "parts", value.asInstanceOf[js.Any])
    
    inline def setPartsUndefined: Self = StObject.set(x, "parts", js.undefined)
    
    inline def setPartsVarargs(value: GoogleCloudDialogflowV2AnnotatedMessagePart*): Self = StObject.set(x, "parts", js.Array(value*))
  }
}
