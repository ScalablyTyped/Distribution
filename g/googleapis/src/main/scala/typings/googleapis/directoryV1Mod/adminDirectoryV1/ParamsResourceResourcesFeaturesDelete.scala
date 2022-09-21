package typings.googleapis.directoryV1Mod.adminDirectoryV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceResourcesFeaturesDelete
  extends StObject
     with StandardParameters {
  
  /**
    * The unique ID for the customer's Google Workspace account. As an account administrator, you can also use the `my_customer` alias to represent your account's customer ID.
    */
  var customer: js.UndefOr[String] = js.undefined
  
  /**
    * The unique ID of the feature to delete.
    */
  var featureKey: js.UndefOr[String] = js.undefined
}
object ParamsResourceResourcesFeaturesDelete {
  
  inline def apply(): ParamsResourceResourcesFeaturesDelete = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceResourcesFeaturesDelete]
  }
  
  extension [Self <: ParamsResourceResourcesFeaturesDelete](x: Self) {
    
    inline def setCustomer(value: String): Self = StObject.set(x, "customer", value.asInstanceOf[js.Any])
    
    inline def setCustomerUndefined: Self = StObject.set(x, "customer", js.undefined)
    
    inline def setFeatureKey(value: String): Self = StObject.set(x, "featureKey", value.asInstanceOf[js.Any])
    
    inline def setFeatureKeyUndefined: Self = StObject.set(x, "featureKey", js.undefined)
  }
}
