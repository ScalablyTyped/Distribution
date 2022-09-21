package typings.googleapis.dlpV2Mod.dlpV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceOrganizationsInspecttemplatesDelete
  extends StObject
     with StandardParameters {
  
  /**
    * Required. Resource name of the organization and inspectTemplate to be deleted, for example `organizations/433245324/inspectTemplates/432452342` or projects/project-id/inspectTemplates/432452342.
    */
  var name: js.UndefOr[String] = js.undefined
}
object ParamsResourceOrganizationsInspecttemplatesDelete {
  
  inline def apply(): ParamsResourceOrganizationsInspecttemplatesDelete = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceOrganizationsInspecttemplatesDelete]
  }
  
  extension [Self <: ParamsResourceOrganizationsInspecttemplatesDelete](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
