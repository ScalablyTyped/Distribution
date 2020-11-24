package typings.maximMazurokGapiClientDialogflow.gapi.client.dialogflow

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudDialogflowV2MessageAnnotation extends js.Object {
  
  /** Indicates whether the text message contains entities. */
  var containEntities: js.UndefOr[Boolean] = js.native
  
  /** The collection of annotated message parts ordered by their position in the message. You can recover the annotated message by concatenating [AnnotatedMessagePart.text]. */
  var parts: js.UndefOr[js.Array[GoogleCloudDialogflowV2AnnotatedMessagePart]] = js.native
}
object GoogleCloudDialogflowV2MessageAnnotation {
  
  @scala.inline
  def apply(): GoogleCloudDialogflowV2MessageAnnotation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDialogflowV2MessageAnnotation]
  }
  
  @scala.inline
  implicit class GoogleCloudDialogflowV2MessageAnnotationOps[Self <: GoogleCloudDialogflowV2MessageAnnotation] (val x: Self) extends AnyVal {
    
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
    def setContainEntities(value: Boolean): Self = this.set("containEntities", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContainEntities: Self = this.set("containEntities", js.undefined)
    
    @scala.inline
    def setPartsVarargs(value: GoogleCloudDialogflowV2AnnotatedMessagePart*): Self = this.set("parts", js.Array(value :_*))
    
    @scala.inline
    def setParts(value: js.Array[GoogleCloudDialogflowV2AnnotatedMessagePart]): Self = this.set("parts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParts: Self = this.set("parts", js.undefined)
  }
}
