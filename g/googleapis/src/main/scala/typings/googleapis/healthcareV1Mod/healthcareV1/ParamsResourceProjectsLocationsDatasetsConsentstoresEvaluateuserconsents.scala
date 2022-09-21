package typings.googleapis.healthcareV1Mod.healthcareV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsDatasetsConsentstoresEvaluateuserconsents
  extends StObject
     with StandardParameters {
  
  /**
    * Required. Name of the consent store to retrieve User data mappings from.
    */
  var consentStore: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaEvaluateUserConsentsRequest] = js.undefined
}
object ParamsResourceProjectsLocationsDatasetsConsentstoresEvaluateuserconsents {
  
  inline def apply(): ParamsResourceProjectsLocationsDatasetsConsentstoresEvaluateuserconsents = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsDatasetsConsentstoresEvaluateuserconsents]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsDatasetsConsentstoresEvaluateuserconsents](x: Self) {
    
    inline def setConsentStore(value: String): Self = StObject.set(x, "consentStore", value.asInstanceOf[js.Any])
    
    inline def setConsentStoreUndefined: Self = StObject.set(x, "consentStore", js.undefined)
    
    inline def setRequestBody(value: SchemaEvaluateUserConsentsRequest): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
