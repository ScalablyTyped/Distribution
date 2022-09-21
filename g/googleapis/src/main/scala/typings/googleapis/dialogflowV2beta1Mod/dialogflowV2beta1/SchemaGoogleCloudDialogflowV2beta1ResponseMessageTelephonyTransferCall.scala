package typings.googleapis.dialogflowV2beta1Mod.dialogflowV2beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDialogflowV2beta1ResponseMessageTelephonyTransferCall extends StObject {
  
  /**
    * Transfer the call to a phone number in [E.164 format](https://en.wikipedia.org/wiki/E.164).
    */
  var phoneNumber: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Transfer the call to a SIP endpoint.
    */
  var sipUri: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudDialogflowV2beta1ResponseMessageTelephonyTransferCall {
  
  inline def apply(): SchemaGoogleCloudDialogflowV2beta1ResponseMessageTelephonyTransferCall = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDialogflowV2beta1ResponseMessageTelephonyTransferCall]
  }
  
  extension [Self <: SchemaGoogleCloudDialogflowV2beta1ResponseMessageTelephonyTransferCall](x: Self) {
    
    inline def setPhoneNumber(value: String): Self = StObject.set(x, "phoneNumber", value.asInstanceOf[js.Any])
    
    inline def setPhoneNumberNull: Self = StObject.set(x, "phoneNumber", null)
    
    inline def setPhoneNumberUndefined: Self = StObject.set(x, "phoneNumber", js.undefined)
    
    inline def setSipUri(value: String): Self = StObject.set(x, "sipUri", value.asInstanceOf[js.Any])
    
    inline def setSipUriNull: Self = StObject.set(x, "sipUri", null)
    
    inline def setSipUriUndefined: Self = StObject.set(x, "sipUri", js.undefined)
  }
}
