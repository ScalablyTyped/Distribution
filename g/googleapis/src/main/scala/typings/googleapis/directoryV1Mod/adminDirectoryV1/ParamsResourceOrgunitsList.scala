package typings.googleapis.directoryV1Mod.adminDirectoryV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceOrgunitsList
  extends StObject
     with StandardParameters {
  
  /**
    * The unique ID for the customer's Google Workspace account. As an account administrator, you can also use the `my_customer` alias to represent your account's `customerId`. The `customerId` is also returned as part of the [Users resource](/admin-sdk/directory/v1/reference/users).
    */
  var customerId: js.UndefOr[String] = js.undefined
  
  /**
    * The full path to the organizational unit or its unique ID. Returns the children of the specified organizational unit.
    */
  var orgUnitPath: js.UndefOr[String] = js.undefined
  
  /**
    * Whether to return all sub-organizations or just immediate children.
    */
  var `type`: js.UndefOr[String] = js.undefined
}
object ParamsResourceOrgunitsList {
  
  inline def apply(): ParamsResourceOrgunitsList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceOrgunitsList]
  }
  
  extension [Self <: ParamsResourceOrgunitsList](x: Self) {
    
    inline def setCustomerId(value: String): Self = StObject.set(x, "customerId", value.asInstanceOf[js.Any])
    
    inline def setCustomerIdUndefined: Self = StObject.set(x, "customerId", js.undefined)
    
    inline def setOrgUnitPath(value: String): Self = StObject.set(x, "orgUnitPath", value.asInstanceOf[js.Any])
    
    inline def setOrgUnitPathUndefined: Self = StObject.set(x, "orgUnitPath", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
