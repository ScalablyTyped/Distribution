package typings.googleapis.v13Mod.adexchangebuyerV13

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaBillingInfo extends StObject {
  
  /**
    * Account id.
    */
  var accountId: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Account name.
    */
  var accountName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * A list of adgroup IDs associated with this particular account. These IDs may show up as part of a realtime bidding BidRequest, which indicates a bid request for this account.
    */
  var billingId: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * Resource type.
    */
  var kind: js.UndefOr[String | Null] = js.undefined
}
object SchemaBillingInfo {
  
  inline def apply(): SchemaBillingInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBillingInfo]
  }
  
  extension [Self <: SchemaBillingInfo](x: Self) {
    
    inline def setAccountId(value: Double): Self = StObject.set(x, "accountId", value.asInstanceOf[js.Any])
    
    inline def setAccountIdNull: Self = StObject.set(x, "accountId", null)
    
    inline def setAccountIdUndefined: Self = StObject.set(x, "accountId", js.undefined)
    
    inline def setAccountName(value: String): Self = StObject.set(x, "accountName", value.asInstanceOf[js.Any])
    
    inline def setAccountNameNull: Self = StObject.set(x, "accountName", null)
    
    inline def setAccountNameUndefined: Self = StObject.set(x, "accountName", js.undefined)
    
    inline def setBillingId(value: js.Array[String]): Self = StObject.set(x, "billingId", value.asInstanceOf[js.Any])
    
    inline def setBillingIdNull: Self = StObject.set(x, "billingId", null)
    
    inline def setBillingIdUndefined: Self = StObject.set(x, "billingId", js.undefined)
    
    inline def setBillingIdVarargs(value: String*): Self = StObject.set(x, "billingId", js.Array(value*))
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindNull: Self = StObject.set(x, "kind", null)
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
  }
}
