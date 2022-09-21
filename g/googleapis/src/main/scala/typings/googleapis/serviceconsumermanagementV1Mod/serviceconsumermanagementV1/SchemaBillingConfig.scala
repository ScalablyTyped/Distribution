package typings.googleapis.serviceconsumermanagementV1Mod.serviceconsumermanagementV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaBillingConfig extends StObject {
  
  /**
    * Name of the billing account. For example `billingAccounts/012345-567890-ABCDEF`.
    */
  var billingAccount: js.UndefOr[String | Null] = js.undefined
}
object SchemaBillingConfig {
  
  inline def apply(): SchemaBillingConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBillingConfig]
  }
  
  extension [Self <: SchemaBillingConfig](x: Self) {
    
    inline def setBillingAccount(value: String): Self = StObject.set(x, "billingAccount", value.asInstanceOf[js.Any])
    
    inline def setBillingAccountNull: Self = StObject.set(x, "billingAccount", null)
    
    inline def setBillingAccountUndefined: Self = StObject.set(x, "billingAccount", js.undefined)
  }
}
