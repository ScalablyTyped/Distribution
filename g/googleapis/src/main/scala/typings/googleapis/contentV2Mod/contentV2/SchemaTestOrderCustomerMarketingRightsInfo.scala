package typings.googleapis.contentV2Mod.contentV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaTestOrderCustomerMarketingRightsInfo extends StObject {
  
  /**
    * Last know user use selection regards marketing preferences. In certain cases selection might not be known, so this field would be empty. Acceptable values are: - "`denied`" - "`granted`"
    */
  var explicitMarketingPreference: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Timestamp when last time marketing preference was updated. Could be empty, if user wasn't offered a selection yet.
    */
  var lastUpdatedTimestamp: js.UndefOr[String | Null] = js.undefined
}
object SchemaTestOrderCustomerMarketingRightsInfo {
  
  inline def apply(): SchemaTestOrderCustomerMarketingRightsInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTestOrderCustomerMarketingRightsInfo]
  }
  
  extension [Self <: SchemaTestOrderCustomerMarketingRightsInfo](x: Self) {
    
    inline def setExplicitMarketingPreference(value: String): Self = StObject.set(x, "explicitMarketingPreference", value.asInstanceOf[js.Any])
    
    inline def setExplicitMarketingPreferenceNull: Self = StObject.set(x, "explicitMarketingPreference", null)
    
    inline def setExplicitMarketingPreferenceUndefined: Self = StObject.set(x, "explicitMarketingPreference", js.undefined)
    
    inline def setLastUpdatedTimestamp(value: String): Self = StObject.set(x, "lastUpdatedTimestamp", value.asInstanceOf[js.Any])
    
    inline def setLastUpdatedTimestampNull: Self = StObject.set(x, "lastUpdatedTimestamp", null)
    
    inline def setLastUpdatedTimestampUndefined: Self = StObject.set(x, "lastUpdatedTimestamp", js.undefined)
  }
}
