package typings.googleapis.dlpV2Mod.dlpV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceOrganizationsLocationsDeidentifytemplatesPatch
  extends StObject
     with StandardParameters {
  
  /**
    * Required. Resource name of organization and deidentify template to be updated, for example `organizations/433245324/deidentifyTemplates/432452342` or projects/project-id/deidentifyTemplates/432452342.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaGooglePrivacyDlpV2UpdateDeidentifyTemplateRequest] = js.undefined
}
object ParamsResourceOrganizationsLocationsDeidentifytemplatesPatch {
  
  inline def apply(): ParamsResourceOrganizationsLocationsDeidentifytemplatesPatch = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceOrganizationsLocationsDeidentifytemplatesPatch]
  }
  
  extension [Self <: ParamsResourceOrganizationsLocationsDeidentifytemplatesPatch](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setRequestBody(value: SchemaGooglePrivacyDlpV2UpdateDeidentifyTemplateRequest): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
