package typings.maximMazurokGapiClientDialogflow.gapi.client.dialogflow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudDialogflowV2ValidationError extends StObject {
  
  /**
    * The names of the entries that the error is associated with. Format: - "projects//agent", if the error is associated with the entire agent. - "projects//agent/intents/", if the error
    * is associated with certain intents. - "projects//agent/intents//trainingPhrases/", if the error is associated with certain intent training phrases. -
    * "projects//agent/intents//parameters/", if the error is associated with certain intent parameters. - "projects//agent/entities/", if the error is associated with certain entities.
    */
  var entries: js.UndefOr[js.Array[String]] = js.undefined
  
  /** The detailed error messsage. */
  var errorMessage: js.UndefOr[String] = js.undefined
  
  /** The severity of the error. */
  var severity: js.UndefOr[String] = js.undefined
}
object GoogleCloudDialogflowV2ValidationError {
  
  @scala.inline
  def apply(): GoogleCloudDialogflowV2ValidationError = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDialogflowV2ValidationError]
  }
  
  @scala.inline
  implicit class GoogleCloudDialogflowV2ValidationErrorMutableBuilder[Self <: GoogleCloudDialogflowV2ValidationError] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEntries(value: js.Array[String]): Self = StObject.set(x, "entries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEntriesUndefined: Self = StObject.set(x, "entries", js.undefined)
    
    @scala.inline
    def setEntriesVarargs(value: String*): Self = StObject.set(x, "entries", js.Array(value :_*))
    
    @scala.inline
    def setErrorMessage(value: String): Self = StObject.set(x, "errorMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorMessageUndefined: Self = StObject.set(x, "errorMessage", js.undefined)
    
    @scala.inline
    def setSeverity(value: String): Self = StObject.set(x, "severity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSeverityUndefined: Self = StObject.set(x, "severity", js.undefined)
  }
}
