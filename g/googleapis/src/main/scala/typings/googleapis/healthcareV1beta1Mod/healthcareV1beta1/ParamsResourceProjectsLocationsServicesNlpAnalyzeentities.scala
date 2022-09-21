package typings.googleapis.healthcareV1beta1Mod.healthcareV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsServicesNlpAnalyzeentities
  extends StObject
     with StandardParameters {
  
  /**
    * The resource name of the service of the form: "projects/{project_id\}/locations/{location_id\}/services/nlp".
    */
  var nlpService: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaAnalyzeEntitiesRequest] = js.undefined
}
object ParamsResourceProjectsLocationsServicesNlpAnalyzeentities {
  
  inline def apply(): ParamsResourceProjectsLocationsServicesNlpAnalyzeentities = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsServicesNlpAnalyzeentities]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsServicesNlpAnalyzeentities](x: Self) {
    
    inline def setNlpService(value: String): Self = StObject.set(x, "nlpService", value.asInstanceOf[js.Any])
    
    inline def setNlpServiceUndefined: Self = StObject.set(x, "nlpService", js.undefined)
    
    inline def setRequestBody(value: SchemaAnalyzeEntitiesRequest): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
