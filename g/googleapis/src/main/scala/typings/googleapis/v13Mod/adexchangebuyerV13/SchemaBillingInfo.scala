package typings.googleapis.v13Mod.adexchangebuyerV13

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The configuration data for an Ad Exchange billing info.
  */
@js.native
trait SchemaBillingInfo extends StObject {
  
  /**
    * Account id.
    */
  var accountId: js.UndefOr[Double] = js.native
  
  /**
    * Account name.
    */
  var accountName: js.UndefOr[String] = js.native
  
  /**
    * A list of adgroup IDs associated with this particular account. These IDs
    * may show up as part of a realtime bidding BidRequest, which indicates a
    * bid request for this account.
    */
  var billingId: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * Resource type.
    */
  var kind: js.UndefOr[String] = js.native
}
object SchemaBillingInfo {
  
  @scala.inline
  def apply(): SchemaBillingInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBillingInfo]
  }
  
  @scala.inline
  implicit class SchemaBillingInfoMutableBuilder[Self <: SchemaBillingInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccountId(value: Double): Self = StObject.set(x, "accountId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccountIdUndefined: Self = StObject.set(x, "accountId", js.undefined)
    
    @scala.inline
    def setAccountName(value: String): Self = StObject.set(x, "accountName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccountNameUndefined: Self = StObject.set(x, "accountName", js.undefined)
    
    @scala.inline
    def setBillingId(value: js.Array[String]): Self = StObject.set(x, "billingId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBillingIdUndefined: Self = StObject.set(x, "billingId", js.undefined)
    
    @scala.inline
    def setBillingIdVarargs(value: String*): Self = StObject.set(x, "billingId", js.Array(value :_*))
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
  }
}
