package typings.googleapis.mybusinessaccountmanagementV1Mod.mybusinessaccountmanagementV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceLocationsAdminsPatch
  extends StObject
     with StandardParameters {
  
  /**
    * Immutable. The resource name. For account admins, this is in the form: `accounts/{account_id\}/admins/{admin_id\}` For location admins, this is in the form: `locations/{location_id\}/admins/{admin_id\}` This field will be ignored if set during admin creation.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaAdmin] = js.undefined
  
  /**
    * Required. The specific fields that should be updated. The only editable field is role.
    */
  var updateMask: js.UndefOr[String] = js.undefined
}
object ParamsResourceLocationsAdminsPatch {
  
  inline def apply(): ParamsResourceLocationsAdminsPatch = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceLocationsAdminsPatch]
  }
  
  extension [Self <: ParamsResourceLocationsAdminsPatch](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setRequestBody(value: SchemaAdmin): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
    
    inline def setUpdateMask(value: String): Self = StObject.set(x, "updateMask", value.asInstanceOf[js.Any])
    
    inline def setUpdateMaskUndefined: Self = StObject.set(x, "updateMask", js.undefined)
  }
}
