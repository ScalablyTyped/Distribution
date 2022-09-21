package typings.googleapis.serviceconsumermanagementV1beta1Mod.serviceconsumermanagementV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaV1beta1GenerateServiceAccountResponse extends StObject {
  
  /**
    * ServiceAccount that was created or retrieved.
    */
  var account: js.UndefOr[SchemaV1beta1ServiceAccount] = js.undefined
}
object SchemaV1beta1GenerateServiceAccountResponse {
  
  inline def apply(): SchemaV1beta1GenerateServiceAccountResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaV1beta1GenerateServiceAccountResponse]
  }
  
  extension [Self <: SchemaV1beta1GenerateServiceAccountResponse](x: Self) {
    
    inline def setAccount(value: SchemaV1beta1ServiceAccount): Self = StObject.set(x, "account", value.asInstanceOf[js.Any])
    
    inline def setAccountUndefined: Self = StObject.set(x, "account", js.undefined)
  }
}
