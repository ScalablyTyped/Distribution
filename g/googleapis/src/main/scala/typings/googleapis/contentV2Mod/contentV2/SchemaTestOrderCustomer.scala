package typings.googleapis.contentV2Mod.contentV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaTestOrderCustomer extends StObject {
  
  /**
    * Required. Email address of the customer. Acceptable values are: - "`pog.dwight.schrute@gmail.com`" - "`pog.jim.halpert@gmail.com`" - "`penpog.pam.beesly@gmail.comding`"
    */
  var email: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Deprecated. Please use marketingRightsInfo instead.
    */
  var explicitMarketingPreference: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Full name of the customer.
    */
  var fullName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Customer's marketing preferences.
    */
  var marketingRightsInfo: js.UndefOr[SchemaTestOrderCustomerMarketingRightsInfo] = js.undefined
}
object SchemaTestOrderCustomer {
  
  inline def apply(): SchemaTestOrderCustomer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTestOrderCustomer]
  }
  
  extension [Self <: SchemaTestOrderCustomer](x: Self) {
    
    inline def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
    
    inline def setEmailNull: Self = StObject.set(x, "email", null)
    
    inline def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
    
    inline def setExplicitMarketingPreference(value: Boolean): Self = StObject.set(x, "explicitMarketingPreference", value.asInstanceOf[js.Any])
    
    inline def setExplicitMarketingPreferenceNull: Self = StObject.set(x, "explicitMarketingPreference", null)
    
    inline def setExplicitMarketingPreferenceUndefined: Self = StObject.set(x, "explicitMarketingPreference", js.undefined)
    
    inline def setFullName(value: String): Self = StObject.set(x, "fullName", value.asInstanceOf[js.Any])
    
    inline def setFullNameNull: Self = StObject.set(x, "fullName", null)
    
    inline def setFullNameUndefined: Self = StObject.set(x, "fullName", js.undefined)
    
    inline def setMarketingRightsInfo(value: SchemaTestOrderCustomerMarketingRightsInfo): Self = StObject.set(x, "marketingRightsInfo", value.asInstanceOf[js.Any])
    
    inline def setMarketingRightsInfoUndefined: Self = StObject.set(x, "marketingRightsInfo", js.undefined)
  }
}
