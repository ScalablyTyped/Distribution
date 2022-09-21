package typings.googleapis.healthcareV1Mod.healthcareV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsDatasetsConsentstoresPatch
  extends StObject
     with StandardParameters {
  
  /**
    * Resource name of the consent store, of the form `projects/{project_id\}/locations/{location_id\}/datasets/{dataset_id\}/consentStores/{consent_store_id\}`. Cannot be changed after creation.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaConsentStore] = js.undefined
  
  /**
    * Required. The update mask that applies to the resource. For the `FieldMask` definition, see https://developers.google.com/protocol-buffers/docs/reference/google.protobuf#fieldmask. Only the `labels`, `default_consent_ttl`, and `enable_consent_create_on_update` fields are allowed to be updated.
    */
  var updateMask: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsLocationsDatasetsConsentstoresPatch {
  
  inline def apply(): ParamsResourceProjectsLocationsDatasetsConsentstoresPatch = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsDatasetsConsentstoresPatch]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsDatasetsConsentstoresPatch](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setRequestBody(value: SchemaConsentStore): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
    
    inline def setUpdateMask(value: String): Self = StObject.set(x, "updateMask", value.asInstanceOf[js.Any])
    
    inline def setUpdateMaskUndefined: Self = StObject.set(x, "updateMask", js.undefined)
  }
}
