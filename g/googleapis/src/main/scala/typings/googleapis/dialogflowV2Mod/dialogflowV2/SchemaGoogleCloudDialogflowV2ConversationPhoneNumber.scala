package typings.googleapis.dialogflowV2Mod.dialogflowV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDialogflowV2ConversationPhoneNumber extends StObject {
  
  /**
    * Output only. The phone number to connect to this conversation.
    */
  var phoneNumber: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudDialogflowV2ConversationPhoneNumber {
  
  inline def apply(): SchemaGoogleCloudDialogflowV2ConversationPhoneNumber = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDialogflowV2ConversationPhoneNumber]
  }
  
  extension [Self <: SchemaGoogleCloudDialogflowV2ConversationPhoneNumber](x: Self) {
    
    inline def setPhoneNumber(value: String): Self = StObject.set(x, "phoneNumber", value.asInstanceOf[js.Any])
    
    inline def setPhoneNumberNull: Self = StObject.set(x, "phoneNumber", null)
    
    inline def setPhoneNumberUndefined: Self = StObject.set(x, "phoneNumber", js.undefined)
  }
}
