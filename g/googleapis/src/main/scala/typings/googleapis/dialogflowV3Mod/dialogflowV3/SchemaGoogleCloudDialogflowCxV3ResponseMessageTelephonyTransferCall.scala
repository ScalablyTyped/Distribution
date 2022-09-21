package typings.googleapis.dialogflowV3Mod.dialogflowV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDialogflowCxV3ResponseMessageTelephonyTransferCall extends StObject {
  
  /**
    * Transfer the call to a phone number in [E.164 format](https://en.wikipedia.org/wiki/E.164).
    */
  var phoneNumber: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudDialogflowCxV3ResponseMessageTelephonyTransferCall {
  
  inline def apply(): SchemaGoogleCloudDialogflowCxV3ResponseMessageTelephonyTransferCall = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDialogflowCxV3ResponseMessageTelephonyTransferCall]
  }
  
  extension [Self <: SchemaGoogleCloudDialogflowCxV3ResponseMessageTelephonyTransferCall](x: Self) {
    
    inline def setPhoneNumber(value: String): Self = StObject.set(x, "phoneNumber", value.asInstanceOf[js.Any])
    
    inline def setPhoneNumberNull: Self = StObject.set(x, "phoneNumber", null)
    
    inline def setPhoneNumberUndefined: Self = StObject.set(x, "phoneNumber", js.undefined)
  }
}
