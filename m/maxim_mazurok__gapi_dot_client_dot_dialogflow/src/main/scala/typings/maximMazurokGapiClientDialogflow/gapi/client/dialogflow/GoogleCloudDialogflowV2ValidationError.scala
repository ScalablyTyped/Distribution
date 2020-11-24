package typings.maximMazurokGapiClientDialogflow.gapi.client.dialogflow

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudDialogflowV2ValidationError extends js.Object {
  
  /**
    * The names of the entries that the error is associated with. Format: - "projects//agent", if the error is associated with the entire agent. - "projects//agent/intents/", if the error
    * is associated with certain intents. - "projects//agent/intents//trainingPhrases/", if the error is associated with certain intent training phrases. -
    * "projects//agent/intents//parameters/", if the error is associated with certain intent parameters. - "projects//agent/entities/", if the error is associated with certain entities.
    */
  var entries: js.UndefOr[js.Array[String]] = js.native
  
  /** The detailed error messsage. */
  var errorMessage: js.UndefOr[String] = js.native
  
  /** The severity of the error. */
  var severity: js.UndefOr[String] = js.native
}
object GoogleCloudDialogflowV2ValidationError {
  
  @scala.inline
  def apply(): GoogleCloudDialogflowV2ValidationError = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDialogflowV2ValidationError]
  }
  
  @scala.inline
  implicit class GoogleCloudDialogflowV2ValidationErrorOps[Self <: GoogleCloudDialogflowV2ValidationError] (val x: Self) extends AnyVal {
    
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
    def setEntriesVarargs(value: String*): Self = this.set("entries", js.Array(value :_*))
    
    @scala.inline
    def setEntries(value: js.Array[String]): Self = this.set("entries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEntries: Self = this.set("entries", js.undefined)
    
    @scala.inline
    def setErrorMessage(value: String): Self = this.set("errorMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteErrorMessage: Self = this.set("errorMessage", js.undefined)
    
    @scala.inline
    def setSeverity(value: String): Self = this.set("severity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSeverity: Self = this.set("severity", js.undefined)
  }
}
