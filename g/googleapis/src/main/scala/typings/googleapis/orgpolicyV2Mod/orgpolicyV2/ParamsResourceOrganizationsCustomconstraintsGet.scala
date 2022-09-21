package typings.googleapis.orgpolicyV2Mod.orgpolicyV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceOrganizationsCustomconstraintsGet
  extends StObject
     with StandardParameters {
  
  /**
    * Required. Resource name of the custom constraint. See `CustomConstraint` for naming requirements.
    */
  var name: js.UndefOr[String] = js.undefined
}
object ParamsResourceOrganizationsCustomconstraintsGet {
  
  inline def apply(): ParamsResourceOrganizationsCustomconstraintsGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceOrganizationsCustomconstraintsGet]
  }
  
  extension [Self <: ParamsResourceOrganizationsCustomconstraintsGet](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
