package typings.maximMazurokGapiClientDialogflow.gapi.client.dialogflow

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudDialogflowV2AnnotatedMessagePart extends js.Object {
  
  /**
    * The [Dialogflow system entity type](https://cloud.google.com/dialogflow/docs/reference/system-entities) of this message part. If this is empty, Dialogflow could not annotate the
    * phrase part with a system entity.
    */
  var entityType: js.UndefOr[String] = js.native
  
  /**
    * The [Dialogflow system entity formatted value ](https://cloud.google.com/dialogflow/docs/reference/system-entities) of this message part. For example for a system entity of type
    * `@sys.unit-currency`, this may contain: { "amount": 5, "currency": "USD" }
    */
  var formattedValue: js.UndefOr[js.Any] = js.native
  
  /** A part of a message possibly annotated with an entity. */
  var text: js.UndefOr[String] = js.native
}
object GoogleCloudDialogflowV2AnnotatedMessagePart {
  
  @scala.inline
  def apply(): GoogleCloudDialogflowV2AnnotatedMessagePart = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDialogflowV2AnnotatedMessagePart]
  }
  
  @scala.inline
  implicit class GoogleCloudDialogflowV2AnnotatedMessagePartOps[Self <: GoogleCloudDialogflowV2AnnotatedMessagePart] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setEntityType(value: String): Self = this.set("entityType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEntityType: Self = this.set("entityType", js.undefined)
    
    @scala.inline
    def setFormattedValue(value: js.Any): Self = this.set("formattedValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFormattedValue: Self = this.set("formattedValue", js.undefined)
    
    @scala.inline
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteText: Self = this.set("text", js.undefined)
  }
}
