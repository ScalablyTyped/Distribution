package typings.googleapis.datalabelingV1beta1Mod.datalabelingV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsDatasetsEvaluationsExamplecomparisonsSearch
  extends StObject
     with StandardParameters {
  
  /**
    * Required. Name of the Evaluation resource to search for example comparisons from. Format: "projects/{project_id\}/datasets/{dataset_id\}/evaluations/ {evaluation_id\}"
    */
  var parent: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaGoogleCloudDatalabelingV1beta1SearchExampleComparisonsRequest] = js.undefined
}
object ParamsResourceProjectsDatasetsEvaluationsExamplecomparisonsSearch {
  
  inline def apply(): ParamsResourceProjectsDatasetsEvaluationsExamplecomparisonsSearch = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsDatasetsEvaluationsExamplecomparisonsSearch]
  }
  
  extension [Self <: ParamsResourceProjectsDatasetsEvaluationsExamplecomparisonsSearch](x: Self) {
    
    inline def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
    
    inline def setRequestBody(value: SchemaGoogleCloudDatalabelingV1beta1SearchExampleComparisonsRequest): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
