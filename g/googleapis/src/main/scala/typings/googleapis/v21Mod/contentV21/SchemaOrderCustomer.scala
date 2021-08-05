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
  
  inline def apply(): SchemaOrderCustomer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaOrderCustomer]
  }
  
  extension [Self <: SchemaOrderCustomer](x: Self) {
    
    inline def setFullName(value: String): Self = StObject.set(x, "fullName", value.asInstanceOf[js.Any])
    
    inline def setFullNameUndefined: Self = StObject.set(x, "fullName", js.undefined)
    
    inline def setMarketingRightsInfo(value: SchemaOrderCustomerMarketingRightsInfo): Self = StObject.set(x, "marketingRightsInfo", value.asInstanceOf[js.Any])
    
    inline def setMarketingRightsInfoUndefined: Self = StObject.set(x, "marketingRightsInfo", js.undefined)
  }
}
