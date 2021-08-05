package typings.googleapis.contentV2Mod.contentV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaOrderCustomer extends StObject {
  
  /**
    * Deprecated.
    */
  var email: js.UndefOr[String] = js.undefined
  
  /**
    * Deprecated. Please use marketingRightsInfo instead.
    */
  var explicitMarketingPreference: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Full name of the customer.
    */
  var fullName: js.UndefOr[String] = js.undefined
  
  /**
    * Customer&#39;s marketing preferences.
    */
  var marketingRightsInfo: js.UndefOr[SchemaOrderCustomerMarketingRightsInfo] = js.undefined
}
object SchemaOrderCustomer {
  
  inline def apply(): SchemaOrderCustomer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaOrderCustomer]
  }
  
  extension [Self <: SchemaOrderCustomer](x: Self) {
    
    inline def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
    
    inline def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
    
    inline def setExplicitMarketingPreference(value: Boolean): Self = StObject.set(x, "explicitMarketingPreference", value.asInstanceOf[js.Any])
    
    inline def setExplicitMarketingPreferenceUndefined: Self = StObject.set(x, "explicitMarketingPreference", js.undefined)
    
    inline def setFullName(value: String): Self = StObject.set(x, "fullName", value.asInstanceOf[js.Any])
    
    inline def setFullNameUndefined: Self = StObject.set(x, "fullName", js.undefined)
    
    inline def setMarketingRightsInfo(value: SchemaOrderCustomerMarketingRightsInfo): Self = StObject.set(x, "marketingRightsInfo", value.asInstanceOf[js.Any])
    
    inline def setMarketingRightsInfoUndefined: Self = StObject.set(x, "marketingRightsInfo", js.undefined)
  }
}
