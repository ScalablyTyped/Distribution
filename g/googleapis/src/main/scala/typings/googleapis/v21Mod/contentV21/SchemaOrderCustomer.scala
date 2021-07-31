package typings.googleapis.v21Mod.contentV21

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaOrderCustomer extends StObject {
  
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
  
  @scala.inline
  def apply(): SchemaOrderCustomer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaOrderCustomer]
  }
  
  @scala.inline
  implicit class SchemaOrderCustomerMutableBuilder[Self <: SchemaOrderCustomer] (val x: Self) extends AnyVal {
    
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
