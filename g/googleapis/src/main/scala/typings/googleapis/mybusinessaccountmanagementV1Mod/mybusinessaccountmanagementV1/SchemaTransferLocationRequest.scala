package typings.googleapis.mybusinessaccountmanagementV1Mod.mybusinessaccountmanagementV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaTransferLocationRequest extends StObject {
  
  /**
    * Required. Name of the account resource to transfer the location to (for example, "accounts/{account\}").
    */
  var destinationAccount: js.UndefOr[String | Null] = js.undefined
}
object SchemaTransferLocationRequest {
  
  inline def apply(): SchemaTransferLocationRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTransferLocationRequest]
  }
  
  extension [Self <: SchemaTransferLocationRequest](x: Self) {
    
    inline def setDestinationAccount(value: String): Self = StObject.set(x, "destinationAccount", value.asInstanceOf[js.Any])
    
    inline def setDestinationAccountNull: Self = StObject.set(x, "destinationAccount", null)
    
    inline def setDestinationAccountUndefined: Self = StObject.set(x, "destinationAccount", js.undefined)
  }
}
