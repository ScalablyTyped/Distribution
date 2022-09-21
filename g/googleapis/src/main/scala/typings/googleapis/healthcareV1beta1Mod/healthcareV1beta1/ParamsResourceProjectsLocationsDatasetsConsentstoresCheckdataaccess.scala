package typings.googleapis.healthcareV1beta1Mod.healthcareV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsDatasetsConsentstoresCheckdataaccess
  extends StObject
     with StandardParameters {
  
  /**
    * Required. Name of the consent store where the requested data_id is stored, of the form `projects/{project_id\}/locations/{location_id\}/datasets/{dataset_id\}/consentStores/{consent_store_id\}`.
    */
  var consentStore: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaCheckDataAccessRequest] = js.undefined
}
object ParamsResourceProjectsLocationsDatasetsConsentstoresCheckdataaccess {
  
  inline def apply(): ParamsResourceProjectsLocationsDatasetsConsentstoresCheckdataaccess = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsDatasetsConsentstoresCheckdataaccess]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsDatasetsConsentstoresCheckdataaccess](x: Self) {
    
    inline def setConsentStore(value: String): Self = StObject.set(x, "consentStore", value.asInstanceOf[js.Any])
    
    inline def setConsentStoreUndefined: Self = StObject.set(x, "consentStore", js.undefined)
    
    inline def setRequestBody(value: SchemaCheckDataAccessRequest): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
