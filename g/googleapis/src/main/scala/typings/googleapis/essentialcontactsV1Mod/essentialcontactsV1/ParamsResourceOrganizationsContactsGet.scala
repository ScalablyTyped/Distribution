package typings.googleapis.essentialcontactsV1Mod.essentialcontactsV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceOrganizationsContactsGet
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The name of the contact to retrieve. Format: organizations/{organization_id\}/contacts/{contact_id\}, folders/{folder_id\}/contacts/{contact_id\} or projects/{project_id\}/contacts/{contact_id\}
    */
  var name: js.UndefOr[String] = js.undefined
}
object ParamsResourceOrganizationsContactsGet {
  
  inline def apply(): ParamsResourceOrganizationsContactsGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceOrganizationsContactsGet]
  }
  
  extension [Self <: ParamsResourceOrganizationsContactsGet](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
