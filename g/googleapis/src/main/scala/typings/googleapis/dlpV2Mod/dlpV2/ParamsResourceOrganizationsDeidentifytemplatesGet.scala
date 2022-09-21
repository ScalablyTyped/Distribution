package typings.googleapis.dlpV2Mod.dlpV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceOrganizationsDeidentifytemplatesGet
  extends StObject
     with StandardParameters {
  
  /**
    * Required. Resource name of the organization and deidentify template to be read, for example `organizations/433245324/deidentifyTemplates/432452342` or projects/project-id/deidentifyTemplates/432452342.
    */
  var name: js.UndefOr[String] = js.undefined
}
object ParamsResourceOrganizationsDeidentifytemplatesGet {
  
  inline def apply(): ParamsResourceOrganizationsDeidentifytemplatesGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceOrganizationsDeidentifytemplatesGet]
  }
  
  extension [Self <: ParamsResourceOrganizationsDeidentifytemplatesGet](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
