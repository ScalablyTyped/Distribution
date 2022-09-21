package typings.googleapis.healthcareV1Mod.healthcareV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsDatasetsConsentstoresConsentsReject
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The resource name of the Consent to reject, of the form `projects/{project_id\}/locations/{location_id\}/datasets/{dataset_id\}/consentStores/{consent_store_id\}/consents/{consent_id\}`. An INVALID_ARGUMENT error occurs if `revision_id` is specified in the name.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaRejectConsentRequest] = js.undefined
}
object ParamsResourceProjectsLocationsDatasetsConsentstoresConsentsReject {
  
  inline def apply(): ParamsResourceProjectsLocationsDatasetsConsentstoresConsentsReject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsDatasetsConsentstoresConsentsReject]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsDatasetsConsentstoresConsentsReject](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setRequestBody(value: SchemaRejectConsentRequest): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
