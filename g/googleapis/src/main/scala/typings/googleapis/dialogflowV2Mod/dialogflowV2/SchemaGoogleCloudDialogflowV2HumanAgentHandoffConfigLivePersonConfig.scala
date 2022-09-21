package typings.googleapis.dialogflowV2Mod.dialogflowV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDialogflowV2HumanAgentHandoffConfigLivePersonConfig extends StObject {
  
  /**
    * Required. Account number of the LivePerson account to connect. This is the account number you input at the login page.
    */
  var accountNumber: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudDialogflowV2HumanAgentHandoffConfigLivePersonConfig {
  
  inline def apply(): SchemaGoogleCloudDialogflowV2HumanAgentHandoffConfigLivePersonConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDialogflowV2HumanAgentHandoffConfigLivePersonConfig]
  }
  
  extension [Self <: SchemaGoogleCloudDialogflowV2HumanAgentHandoffConfigLivePersonConfig](x: Self) {
    
    inline def setAccountNumber(value: String): Self = StObject.set(x, "accountNumber", value.asInstanceOf[js.Any])
    
    inline def setAccountNumberNull: Self = StObject.set(x, "accountNumber", null)
    
    inline def setAccountNumberUndefined: Self = StObject.set(x, "accountNumber", js.undefined)
  }
}
