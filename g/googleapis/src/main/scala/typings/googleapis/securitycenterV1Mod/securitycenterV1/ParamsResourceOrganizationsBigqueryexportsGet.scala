package typings.googleapis.securitycenterV1Mod.securitycenterV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceOrganizationsBigqueryexportsGet
  extends StObject
     with StandardParameters {
  
  /**
    * Required. Name of the big query export to retrieve. Its format is organizations/{organization\}/bigQueryExports/{export_id\}, folders/{folder\}/bigQueryExports/{export_id\}, or projects/{project\}/bigQueryExports/{export_id\}
    */
  var name: js.UndefOr[String] = js.undefined
}
object ParamsResourceOrganizationsBigqueryexportsGet {
  
  inline def apply(): ParamsResourceOrganizationsBigqueryexportsGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceOrganizationsBigqueryexportsGet]
  }
  
  extension [Self <: ParamsResourceOrganizationsBigqueryexportsGet](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
