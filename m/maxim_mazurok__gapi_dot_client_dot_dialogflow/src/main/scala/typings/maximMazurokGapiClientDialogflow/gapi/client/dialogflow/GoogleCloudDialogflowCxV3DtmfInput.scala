package typings.maximMazurokGapiClientDialogflow.gapi.client.dialogflow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudDialogflowCxV3DtmfInput extends StObject {
  
  /** The dtmf digits. */
  var digits: js.UndefOr[String] = js.undefined
  
  /** The finish digit (if any). */
  var finishDigit: js.UndefOr[String] = js.undefined
}
object GoogleCloudDialogflowCxV3DtmfInput {
  
  inline def apply(): GoogleCloudDialogflowCxV3DtmfInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDialogflowCxV3DtmfInput]
  }
  
  extension [Self <: GoogleCloudDialogflowCxV3DtmfInput](x: Self) {
    
    inline def setDigits(value: String): Self = StObject.set(x, "digits", value.asInstanceOf[js.Any])
    
    inline def setDigitsUndefined: Self = StObject.set(x, "digits", js.undefined)
    
    inline def setFinishDigit(value: String): Self = StObject.set(x, "finishDigit", value.asInstanceOf[js.Any])
    
    inline def setFinishDigitUndefined: Self = StObject.set(x, "finishDigit", js.undefined)
  }
}
