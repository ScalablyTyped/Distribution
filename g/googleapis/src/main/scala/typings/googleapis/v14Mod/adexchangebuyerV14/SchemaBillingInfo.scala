package typings.googleapis.v14Mod.adexchangebuyerV14

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The configuration data for an Ad Exchange billing info.
  */
trait SchemaBillingInfo extends StObject {
  
  /**
    * Account id.
    */
  var accountId: js.UndefOr[Double] = js.undefined
  
  /**
    * Account name.
    */
  var accountName: js.UndefOr[String] = js.undefined
  
  /**
    * A list of adgroup IDs associated with this particular account. These IDs
    * may show up as part of a realtime bidding BidRequest, which indicates a
    * bid request for this account.
    */
  var billingId: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Resource type.
    */
  var kind: js.UndefOr[String] = js.undefined
}
object SchemaBillingInfo {
  
  inline def apply(): SchemaBillingInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBillingInfo]
  }
  
  extension [Self <: SchemaBillingInfo](x: Self) {
    
    inline def setAccountId(value: Double): Self = StObject.set(x, "accountId", value.asInstanceOf[js.Any])
    
    inline def setAccountIdUndefined: Self = StObject.set(x, "accountId", js.undefined)
    
    inline def setAccountName(value: String): Self = StObject.set(x, "accountName", value.asInstanceOf[js.Any])
    
    inline def setAccountNameUndefined: Self = StObject.set(x, "accountName", js.undefined)
    
    inline def setBillingId(value: js.Array[String]): Self = StObject.set(x, "billingId", value.asInstanceOf[js.Any])
    
    inline def setBillingIdUndefined: Self = StObject.set(x, "billingId", js.undefined)
    
    inline def setBillingIdVarargs(value: String*): Self = StObject.set(x, "billingId", js.Array(value :_*))
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
  }
}
