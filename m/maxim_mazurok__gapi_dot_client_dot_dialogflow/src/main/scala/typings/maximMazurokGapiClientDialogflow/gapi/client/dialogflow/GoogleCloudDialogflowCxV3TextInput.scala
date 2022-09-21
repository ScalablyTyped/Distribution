package typings.maximMazurokGapiClientDialogflow.gapi.client.dialogflow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudDialogflowCxV3TextInput extends StObject {
  
  /** Required. The UTF-8 encoded natural language text to be processed. Text length must not exceed 256 characters. */
  var text: js.UndefOr[String] = js.undefined
}
object GoogleCloudDialogflowCxV3TextInput {
  
  inline def apply(): GoogleCloudDialogflowCxV3TextInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDialogflowCxV3TextInput]
  }
  
  extension [Self <: GoogleCloudDialogflowCxV3TextInput](x: Self) {
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
  }
}
