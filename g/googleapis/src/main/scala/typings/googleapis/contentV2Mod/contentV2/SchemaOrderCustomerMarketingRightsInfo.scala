package typings.googleapis.contentV2Mod.contentV2

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
  
  @scala.inline
  def apply(): SchemaOrderCustomerMarketingRightsInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaOrderCustomerMarketingRightsInfo]
  }
  
  @scala.inline
  implicit class SchemaOrderCustomerMarketingRightsInfoMutableBuilder[Self <: SchemaOrderCustomerMarketingRightsInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExplicitMarketingPreference(value: String): Self = StObject.set(x, "explicitMarketingPreference", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExplicitMarketingPreferenceUndefined: Self = StObject.set(x, "explicitMarketingPreference", js.undefined)
    
    @scala.inline
    def setLastUpdatedTimestamp(value: String): Self = StObject.set(x, "lastUpdatedTimestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastUpdatedTimestampUndefined: Self = StObject.set(x, "lastUpdatedTimestamp", js.undefined)
    
    @scala.inline
    def setMarketingEmailAddress(value: String): Self = StObject.set(x, "marketingEmailAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarketingEmailAddressUndefined: Self = StObject.set(x, "marketingEmailAddress", js.undefined)
  }
}
