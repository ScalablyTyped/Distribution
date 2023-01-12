package typings.maximMazurokGapiClientDialogflow.gapi.client.dialogflow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudDialogflowCxV3EntityTypeExcludedPhrase extends StObject {
  
  /** Required. The word or phrase to be excluded. */
  var value: js.UndefOr[String] = js.undefined
}
object GoogleCloudDialogflowCxV3EntityTypeExcludedPhrase {
  
  inline def apply(): GoogleCloudDialogflowCxV3EntityTypeExcludedPhrase = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDialogflowCxV3EntityTypeExcludedPhrase]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GoogleCloudDialogflowCxV3EntityTypeExcludedPhrase] (val x: Self) extends AnyVal {
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
