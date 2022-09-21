package typings.googleapis.healthcareV1beta1Mod.healthcareV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsDatasetsAnnotationstoresImport
  extends StObject
     with StandardParameters {
  
  /**
    * The name of the Annotation store to which the server imports annotations, in the format `projects/{project_id\}/locations/{location_id\}/datasets/{dataset_id\}/annotationStores/{annotation_store_id\}`.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaImportAnnotationsRequest] = js.undefined
}
object ParamsResourceProjectsLocationsDatasetsAnnotationstoresImport {
  
  inline def apply(): ParamsResourceProjectsLocationsDatasetsAnnotationstoresImport = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsDatasetsAnnotationstoresImport]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsDatasetsAnnotationstoresImport](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setRequestBody(value: SchemaImportAnnotationsRequest): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
