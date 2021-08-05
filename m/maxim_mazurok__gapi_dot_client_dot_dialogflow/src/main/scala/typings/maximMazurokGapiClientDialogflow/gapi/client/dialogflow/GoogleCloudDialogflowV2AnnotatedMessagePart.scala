package typings.maximMazurokGapiClientDialogflow.gapi.client.dialogflow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudDialogflowV2AnnotatedMessagePart extends StObject {
  
  /**
    * The [Dialogflow system entity type](https://cloud.google.com/dialogflow/docs/reference/system-entities) of this message part. If this is empty, Dialogflow could not annotate the
    * phrase part with a system entity.
    */
  var entityType: js.UndefOr[String] = js.undefined
  
  /**
    * The [Dialogflow system entity formatted value ](https://cloud.google.com/dialogflow/docs/reference/system-entities) of this message part. For example for a system entity of type
    * `@sys.unit-currency`, this may contain: { "amount": 5, "currency": "USD" }
    */
  var formattedValue: js.UndefOr[js.Any] = js.undefined
  
  /** A part of a message possibly annotated with an entity. */
  var text: js.UndefOr[String] = js.undefined
}
object GoogleCloudDialogflowV2AnnotatedMessagePart {
  
  inline def apply(): GoogleCloudDialogflowV2AnnotatedMessagePart = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDialogflowV2AnnotatedMessagePart]
  }
  
  extension [Self <: GoogleCloudDialogflowV2AnnotatedMessagePart](x: Self) {
    
    inline def setEntityType(value: String): Self = StObject.set(x, "entityType", value.asInstanceOf[js.Any])
    
    inline def setEntityTypeUndefined: Self = StObject.set(x, "entityType", js.undefined)
    
    inline def setFormattedValue(value: js.Any): Self = StObject.set(x, "formattedValue", value.asInstanceOf[js.Any])
    
    inline def setFormattedValueUndefined: Self = StObject.set(x, "formattedValue", js.undefined)
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
  }
}
