package typings.googleapis.contentV2Mod.contentV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaOrderCustomer extends StObject {
  
  /**
    * Deprecated.
    */
  var email: js.UndefOr[String] = js.native
  
  /**
    * Deprecated. Please use marketingRightsInfo instead.
    */
  var explicitMarketingPreference: js.UndefOr[Boolean] = js.native
  
  /**
    * Full name of the customer.
    */
  var fullName: js.UndefOr[String] = js.native
  
  /**
    * Customer&#39;s marketing preferences.
    */
  var marketingRightsInfo: js.UndefOr[SchemaOrderCustomerMarketingRightsInfo] = js.native
}
object SchemaOrderCustomer {
  
  @scala.inline
  def apply(): SchemaOrderCustomer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaOrderCustomer]
  }
  
  @scala.inline
  implicit class SchemaOrderCustomerMutableBuilder[Self <: SchemaOrderCustomer] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
    
    @scala.inline
    def setExplicitMarketingPreference(value: Boolean): Self = StObject.set(x, "explicitMarketingPreference", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExplicitMarketingPreferenceUndefined: Self = StObject.set(x, "explicitMarketingPreference", js.undefined)
    
    @scala.inline
    def setFullName(value: String): Self = StObject.set(x, "fullName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFullNameUndefined: Self = StObject.set(x, "fullName", js.undefined)
    
    @scala.inline
    def setMarketingRightsInfo(value: SchemaOrderCustomerMarketingRightsInfo): Self = StObject.set(x, "marketingRightsInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarketingRightsInfoUndefined: Self = StObject.set(x, "marketingRightsInfo", js.undefined)
  }
}
