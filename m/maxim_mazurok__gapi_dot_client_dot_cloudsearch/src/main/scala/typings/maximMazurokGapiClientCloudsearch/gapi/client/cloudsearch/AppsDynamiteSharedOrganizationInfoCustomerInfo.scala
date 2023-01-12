package typings.maximMazurokGapiClientCloudsearch.gapi.client.cloudsearch

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AppsDynamiteSharedOrganizationInfoCustomerInfo extends StObject {
  
  var customerId: js.UndefOr[AppsDynamiteCustomerId] = js.undefined
}
object AppsDynamiteSharedOrganizationInfoCustomerInfo {
  
  inline def apply(): AppsDynamiteSharedOrganizationInfoCustomerInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AppsDynamiteSharedOrganizationInfoCustomerInfo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AppsDynamiteSharedOrganizationInfoCustomerInfo] (val x: Self) extends AnyVal {
    
    inline def setCustomerId(value: AppsDynamiteCustomerId): Self = StObject.set(x, "customerId", value.asInstanceOf[js.Any])
    
    inline def setCustomerIdUndefined: Self = StObject.set(x, "customerId", js.undefined)
  }
}
