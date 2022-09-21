package typings.googleapis.dfareportingV4Mod.dfareportingV4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaBillingAssignment extends StObject {
  
  /**
    * ID of the account associated with the billing assignment.This is a read-only, auto-generated field.
    */
  var accountId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * ID of the advertiser associated with the billing assignment.Wildcard (*) means this assignment is not limited to a single advertiser
    */
  var advertiserId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * ID of the campaign associated with the billing assignment. Wildcard (*) means this assignment is not limited to a single campaign
    */
  var campaignId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Identifies what kind of resource this is. Value: the fixed string "dfareporting#billingAssignment".
    */
  var kind: js.UndefOr[String | Null] = js.undefined
  
  /**
    * ID of the subaccount associated with the billing assignment.Wildcard (*) means this assignment is not limited to a single subaccountThis is a read-only, auto-generated field.
    */
  var subaccountId: js.UndefOr[String | Null] = js.undefined
}
object SchemaBillingAssignment {
  
  inline def apply(): SchemaBillingAssignment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBillingAssignment]
  }
  
  extension [Self <: SchemaBillingAssignment](x: Self) {
    
    inline def setAccountId(value: String): Self = StObject.set(x, "accountId", value.asInstanceOf[js.Any])
    
    inline def setAccountIdNull: Self = StObject.set(x, "accountId", null)
    
    inline def setAccountIdUndefined: Self = StObject.set(x, "accountId", js.undefined)
    
    inline def setAdvertiserId(value: String): Self = StObject.set(x, "advertiserId", value.asInstanceOf[js.Any])
    
    inline def setAdvertiserIdNull: Self = StObject.set(x, "advertiserId", null)
    
    inline def setAdvertiserIdUndefined: Self = StObject.set(x, "advertiserId", js.undefined)
    
    inline def setCampaignId(value: String): Self = StObject.set(x, "campaignId", value.asInstanceOf[js.Any])
    
    inline def setCampaignIdNull: Self = StObject.set(x, "campaignId", null)
    
    inline def setCampaignIdUndefined: Self = StObject.set(x, "campaignId", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindNull: Self = StObject.set(x, "kind", null)
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setSubaccountId(value: String): Self = StObject.set(x, "subaccountId", value.asInstanceOf[js.Any])
    
    inline def setSubaccountIdNull: Self = StObject.set(x, "subaccountId", null)
    
    inline def setSubaccountIdUndefined: Self = StObject.set(x, "subaccountId", js.undefined)
  }
}
