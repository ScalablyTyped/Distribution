package typings.googleapis.v21Mod.contentV21

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaOrderCustomerMarketingRightsInfo extends StObject {
  
  /**
    * Last known user selection regarding marketing preferences. In certain
    * cases this selection might not be known, so this field would be empty.
    */
  var explicitMarketingPreference: js.UndefOr[String] = js.undefined
  
  /**
    * Timestamp when last time marketing preference was updated. Could be
    * empty, if user wasn&#39;t offered a selection yet.
    */
  var lastUpdatedTimestamp: js.UndefOr[String] = js.undefined
  
  /**
    * Email address that can be used for marketing purposes. The field may be
    * empty even if explicitMarketingPreference is &#39;granted&#39;. This
    * happens when retrieving an old order from the customer who deleted their
    * account.
    */
  var marketingEmailAddress: js.UndefOr[String] = js.undefined
}
object SchemaOrderCustomerMarketingRightsInfo {
  
  inline def apply(): SchemaOrderCustomerMarketingRightsInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaOrderCustomerMarketingRightsInfo]
  }
  
  extension [Self <: SchemaOrderCustomerMarketingRightsInfo](x: Self) {
    
    inline def setExplicitMarketingPreference(value: String): Self = StObject.set(x, "explicitMarketingPreference", value.asInstanceOf[js.Any])
    
    inline def setExplicitMarketingPreferenceUndefined: Self = StObject.set(x, "explicitMarketingPreference", js.undefined)
    
    inline def setLastUpdatedTimestamp(value: String): Self = StObject.set(x, "lastUpdatedTimestamp", value.asInstanceOf[js.Any])
    
    inline def setLastUpdatedTimestampUndefined: Self = StObject.set(x, "lastUpdatedTimestamp", js.undefined)
    
    inline def setMarketingEmailAddress(value: String): Self = StObject.set(x, "marketingEmailAddress", value.asInstanceOf[js.Any])
    
    inline def setMarketingEmailAddressUndefined: Self = StObject.set(x, "marketingEmailAddress", js.undefined)
  }
}
