package typings.googleapis.orgpolicyV2Mod.orgpolicyV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsPoliciesDelete
  extends StObject
     with StandardParameters {
  
  /**
    * Required. Name of the policy to delete. See `Policy` for naming rules.
    */
  var name: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsPoliciesDelete {
  
  inline def apply(): ParamsResourceProjectsPoliciesDelete = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsPoliciesDelete]
  }
  
  extension [Self <: ParamsResourceProjectsPoliciesDelete](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
