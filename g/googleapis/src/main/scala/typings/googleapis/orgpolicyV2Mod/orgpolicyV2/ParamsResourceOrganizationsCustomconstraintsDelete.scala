package typings.googleapis.orgpolicyV2Mod.orgpolicyV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceOrganizationsCustomconstraintsDelete
  extends StObject
     with StandardParameters {
  
  /**
    * Required. Name of the custom constraint to delete. See `CustomConstraint` for naming rules.
    */
  var name: js.UndefOr[String] = js.undefined
}
object ParamsResourceOrganizationsCustomconstraintsDelete {
  
  inline def apply(): ParamsResourceOrganizationsCustomconstraintsDelete = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceOrganizationsCustomconstraintsDelete]
  }
  
  extension [Self <: ParamsResourceOrganizationsCustomconstraintsDelete](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
