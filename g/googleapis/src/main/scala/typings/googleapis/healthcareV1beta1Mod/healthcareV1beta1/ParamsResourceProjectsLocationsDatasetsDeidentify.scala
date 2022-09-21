package typings.googleapis.healthcareV1beta1Mod.healthcareV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsDatasetsDeidentify
  extends StObject
     with StandardParameters {
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaDeidentifyDatasetRequest] = js.undefined
  
  /**
    * Source dataset resource name. For example, `projects/{project_id\}/locations/{location_id\}/datasets/{dataset_id\}`.
    */
  var sourceDataset: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsLocationsDatasetsDeidentify {
  
  inline def apply(): ParamsResourceProjectsLocationsDatasetsDeidentify = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsDatasetsDeidentify]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsDatasetsDeidentify](x: Self) {
    
    inline def setRequestBody(value: SchemaDeidentifyDatasetRequest): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
    
    inline def setSourceDataset(value: String): Self = StObject.set(x, "sourceDataset", value.asInstanceOf[js.Any])
    
    inline def setSourceDatasetUndefined: Self = StObject.set(x, "sourceDataset", js.undefined)
  }
}
