package typings.maximMazurokGapiClientDialogflow.gapi.client.dialogflow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudDialogflowV2beta1MessageAnnotation extends StObject {
  
  /** Required. Indicates whether the text message contains entities. */
  var containEntities: js.UndefOr[Boolean] = js.undefined
  
  /** Optional. The collection of annotated message parts ordered by their position in the message. You can recover the annotated message by concatenating [AnnotatedMessagePart.text]. */
  var parts: js.UndefOr[js.Array[GoogleCloudDialogflowV2beta1AnnotatedMessagePart]] = js.undefined
}
object GoogleCloudDialogflowV2beta1MessageAnnotation {
  
  inline def apply(): GoogleCloudDialogflowV2beta1MessageAnnotation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDialogflowV2beta1MessageAnnotation]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GoogleCloudDialogflowV2beta1MessageAnnotation] (val x: Self) extends AnyVal {
    
    inline def setContainEntities(value: Boolean): Self = StObject.set(x, "containEntities", value.asInstanceOf[js.Any])
    
    inline def setContainEntitiesUndefined: Self = StObject.set(x, "containEntities", js.undefined)
    
    inline def setParts(value: js.Array[GoogleCloudDialogflowV2beta1AnnotatedMessagePart]): Self = StObject.set(x, "parts", value.asInstanceOf[js.Any])
    
    inline def setPartsUndefined: Self = StObject.set(x, "parts", js.undefined)
    
    inline def setPartsVarargs(value: GoogleCloudDialogflowV2beta1AnnotatedMessagePart*): Self = StObject.set(x, "parts", js.Array(value*))
  }
}
