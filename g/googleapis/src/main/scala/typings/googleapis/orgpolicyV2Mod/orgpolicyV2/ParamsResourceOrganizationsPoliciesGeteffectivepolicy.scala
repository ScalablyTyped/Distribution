package typings.googleapis.orgpolicyV2Mod.orgpolicyV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceOrganizationsPoliciesGeteffectivepolicy
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The effective policy to compute. See `Policy` for naming rules.
    */
  var name: js.UndefOr[String] = js.undefined
}
object ParamsResourceOrganizationsPoliciesGeteffectivepolicy {
  
  inline def apply(): ParamsResourceOrganizationsPoliciesGeteffectivepolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceOrganizationsPoliciesGeteffectivepolicy]
  }
  
  extension [Self <: ParamsResourceOrganizationsPoliciesGeteffectivepolicy](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
