package typings.googleapis.orgpolicyV2Mod.orgpolicyV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceOrganizationsPoliciesDelete
  extends StObject
     with StandardParameters {
  
  /**
    * Required. Name of the policy to delete. See `Policy` for naming rules.
    */
  var name: js.UndefOr[String] = js.undefined
}
object ParamsResourceOrganizationsPoliciesDelete {
  
  inline def apply(): ParamsResourceOrganizationsPoliciesDelete = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceOrganizationsPoliciesDelete]
  }
  
  extension [Self <: ParamsResourceOrganizationsPoliciesDelete](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
