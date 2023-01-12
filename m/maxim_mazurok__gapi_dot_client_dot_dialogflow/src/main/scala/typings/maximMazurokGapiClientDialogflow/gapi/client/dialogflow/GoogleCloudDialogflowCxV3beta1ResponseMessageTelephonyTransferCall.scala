package typings.maximMazurokGapiClientDialogflow.gapi.client.dialogflow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudDialogflowCxV3beta1ResponseMessageTelephonyTransferCall extends StObject {
  
  /** Transfer the call to a phone number in [E.164 format](https://en.wikipedia.org/wiki/E.164). */
  var phoneNumber: js.UndefOr[String] = js.undefined
}
object GoogleCloudDialogflowCxV3beta1ResponseMessageTelephonyTransferCall {
  
  inline def apply(): GoogleCloudDialogflowCxV3beta1ResponseMessageTelephonyTransferCall = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDialogflowCxV3beta1ResponseMessageTelephonyTransferCall]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GoogleCloudDialogflowCxV3beta1ResponseMessageTelephonyTransferCall] (val x: Self) extends AnyVal {
    
    inline def setPhoneNumber(value: String): Self = StObject.set(x, "phoneNumber", value.asInstanceOf[js.Any])
    
    inline def setPhoneNumberUndefined: Self = StObject.set(x, "phoneNumber", js.undefined)
  }
}
