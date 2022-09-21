package typings.googleapis.dialogflowV3Mod.dialogflowV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDialogflowV2beta1MessageAnnotation extends StObject {
  
  /**
    * Required. Indicates whether the text message contains entities.
    */
  var containEntities: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Optional. The collection of annotated message parts ordered by their position in the message. You can recover the annotated message by concatenating [AnnotatedMessagePart.text].
    */
  var parts: js.UndefOr[js.Array[SchemaGoogleCloudDialogflowV2beta1AnnotatedMessagePart]] = js.undefined
}
object SchemaGoogleCloudDialogflowV2beta1MessageAnnotation {
  
  inline def apply(): SchemaGoogleCloudDialogflowV2beta1MessageAnnotation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDialogflowV2beta1MessageAnnotation]
  }
  
  extension [Self <: SchemaGoogleCloudDialogflowV2beta1MessageAnnotation](x: Self) {
    
    inline def setContainEntities(value: Boolean): Self = StObject.set(x, "containEntities", value.asInstanceOf[js.Any])
    
    inline def setContainEntitiesNull: Self = StObject.set(x, "containEntities", null)
    
    inline def setContainEntitiesUndefined: Self = StObject.set(x, "containEntities", js.undefined)
    
    inline def setParts(value: js.Array[SchemaGoogleCloudDialogflowV2beta1AnnotatedMessagePart]): Self = StObject.set(x, "parts", value.asInstanceOf[js.Any])
    
    inline def setPartsUndefined: Self = StObject.set(x, "parts", js.undefined)
    
    inline def setPartsVarargs(value: SchemaGoogleCloudDialogflowV2beta1AnnotatedMessagePart*): Self = StObject.set(x, "parts", js.Array(value*))
  }
}
