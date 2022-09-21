package typings.googleapis.v1beta1Mod.accessapprovalV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceOrganizationsGetaccessapprovalsettings
  extends StObject
     with StandardParameters {
  
  /**
    * Name of the AccessApprovalSettings to retrieve.
    */
  var name: js.UndefOr[String] = js.undefined
}
object ParamsResourceOrganizationsGetaccessapprovalsettings {
  
  inline def apply(): ParamsResourceOrganizationsGetaccessapprovalsettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceOrganizationsGetaccessapprovalsettings]
  }
  
  extension [Self <: ParamsResourceOrganizationsGetaccessapprovalsettings](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
