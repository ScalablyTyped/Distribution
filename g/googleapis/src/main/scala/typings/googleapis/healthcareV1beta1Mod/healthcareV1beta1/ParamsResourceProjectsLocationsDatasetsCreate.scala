package typings.googleapis.healthcareV1beta1Mod.healthcareV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsDatasetsCreate
  extends StObject
     with StandardParameters {
  
  /**
    * The ID of the dataset that is being created. The string must match the following regex: `[\p{L\}\p{N\}_\-\.]{1,256\}`.
    */
  var datasetId: js.UndefOr[String] = js.undefined
  
  /**
    * The name of the project where the server creates the dataset. For example, `projects/{project_id\}/locations/{location_id\}`.
    */
  var parent: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaDataset] = js.undefined
}
object ParamsResourceProjectsLocationsDatasetsCreate {
  
  inline def apply(): ParamsResourceProjectsLocationsDatasetsCreate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsDatasetsCreate]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsDatasetsCreate](x: Self) {
    
    inline def setDatasetId(value: String): Self = StObject.set(x, "datasetId", value.asInstanceOf[js.Any])
    
    inline def setDatasetIdUndefined: Self = StObject.set(x, "datasetId", js.undefined)
    
    inline def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
    
    inline def setRequestBody(value: SchemaDataset): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
