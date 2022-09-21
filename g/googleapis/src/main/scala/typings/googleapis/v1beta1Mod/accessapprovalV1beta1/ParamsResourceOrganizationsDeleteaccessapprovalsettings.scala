package typings.googleapis.v1beta1Mod.accessapprovalV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceOrganizationsDeleteaccessapprovalsettings
  extends StObject
     with StandardParameters {
  
  /**
    * Name of the AccessApprovalSettings to delete.
    */
  var name: js.UndefOr[String] = js.undefined
}
object ParamsResourceOrganizationsDeleteaccessapprovalsettings {
  
  inline def apply(): ParamsResourceOrganizationsDeleteaccessapprovalsettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceOrganizationsDeleteaccessapprovalsettings]
  }
  
  extension [Self <: ParamsResourceOrganizationsDeleteaccessapprovalsettings](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
