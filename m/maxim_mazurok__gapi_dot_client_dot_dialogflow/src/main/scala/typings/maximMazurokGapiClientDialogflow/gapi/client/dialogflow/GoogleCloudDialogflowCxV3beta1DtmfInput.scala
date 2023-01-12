package typings.maximMazurokGapiClientDialogflow.gapi.client.dialogflow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudDialogflowCxV3beta1DtmfInput extends StObject {
  
  /** The dtmf digits. */
  var digits: js.UndefOr[String] = js.undefined
  
  /** The finish digit (if any). */
  var finishDigit: js.UndefOr[String] = js.undefined
}
object GoogleCloudDialogflowCxV3beta1DtmfInput {
  
  inline def apply(): GoogleCloudDialogflowCxV3beta1DtmfInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDialogflowCxV3beta1DtmfInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GoogleCloudDialogflowCxV3beta1DtmfInput] (val x: Self) extends AnyVal {
    
    inline def setDigits(value: String): Self = StObject.set(x, "digits", value.asInstanceOf[js.Any])
    
    inline def setDigitsUndefined: Self = StObject.set(x, "digits", js.undefined)
    
    inline def setFinishDigit(value: String): Self = StObject.set(x, "finishDigit", value.asInstanceOf[js.Any])
    
    inline def setFinishDigitUndefined: Self = StObject.set(x, "finishDigit", js.undefined)
  }
}
