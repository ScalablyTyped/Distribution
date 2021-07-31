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
  
  @scala.inline
  def apply(): GoogleCloudDialogflowV2AnnotatedMessagePart = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDialogflowV2AnnotatedMessagePart]
  }
  
  @scala.inline
  implicit class GoogleCloudDialogflowV2AnnotatedMessagePartMutableBuilder[Self <: GoogleCloudDialogflowV2AnnotatedMessagePart] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEntityType(value: String): Self = StObject.set(x, "entityType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEntityTypeUndefined: Self = StObject.set(x, "entityType", js.undefined)
    
    @scala.inline
    def setFormattedValue(value: js.Any): Self = StObject.set(x, "formattedValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormattedValueUndefined: Self = StObject.set(x, "formattedValue", js.undefined)
    
    @scala.inline
    def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
  }
}
