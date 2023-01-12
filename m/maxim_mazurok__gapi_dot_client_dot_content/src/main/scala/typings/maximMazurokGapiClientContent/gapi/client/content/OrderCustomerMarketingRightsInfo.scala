package typings.maximMazurokGapiClientContent.gapi.client.content

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OrderCustomerMarketingRightsInfo extends StObject {
  
  /**
    * Last known customer selection regarding marketing preferences. In certain cases this selection might not be known, so this field would be empty. If a customer selected `granted` in
    * their most recent order, they can be subscribed to marketing emails. Customers who have chosen `denied` must not be subscribed, or must be unsubscribed if already opted-in.
    * Acceptable values are: - "`denied`" - "`granted`"
    */
  var explicitMarketingPreference: js.UndefOr[String] = js.undefined
  
  /** Timestamp when last time marketing preference was updated. Could be empty, if user wasn't offered a selection yet. */
  var lastUpdatedTimestamp: js.UndefOr[String] = js.undefined
  
  /**
    * Email address that can be used for marketing purposes. The field may be empty even if `explicitMarketingPreference` is 'granted'. This happens when retrieving an old order from the
    * customer who deleted their account.
    */
  var marketingEmailAddress: js.UndefOr[String] = js.undefined
}
object OrderCustomerMarketingRightsInfo {
  
  inline def apply(): OrderCustomerMarketingRightsInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OrderCustomerMarketingRightsInfo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OrderCustomerMarketingRightsInfo] (val x: Self) extends AnyVal {
    
    inline def setExplicitMarketingPreference(value: String): Self = StObject.set(x, "explicitMarketingPreference", value.asInstanceOf[js.Any])
    
    inline def setExplicitMarketingPreferenceUndefined: Self = StObject.set(x, "explicitMarketingPreference", js.undefined)
    
    inline def setLastUpdatedTimestamp(value: String): Self = StObject.set(x, "lastUpdatedTimestamp", value.asInstanceOf[js.Any])
    
    inline def setLastUpdatedTimestampUndefined: Self = StObject.set(x, "lastUpdatedTimestamp", js.undefined)
    
    inline def setMarketingEmailAddress(value: String): Self = StObject.set(x, "marketingEmailAddress", value.asInstanceOf[js.Any])
    
    inline def setMarketingEmailAddressUndefined: Self = StObject.set(x, "marketingEmailAddress", js.undefined)
  }
}
