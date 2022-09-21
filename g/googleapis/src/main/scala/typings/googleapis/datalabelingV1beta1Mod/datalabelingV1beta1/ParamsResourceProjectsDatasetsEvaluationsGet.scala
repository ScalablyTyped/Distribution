package typings.googleapis.datalabelingV1beta1Mod.datalabelingV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsDatasetsEvaluationsGet
  extends StObject
     with StandardParameters {
  
  /**
    * Required. Name of the evaluation. Format: "projects/{project_id\}/datasets/ {dataset_id\}/evaluations/{evaluation_id\}'
    */
  var name: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsDatasetsEvaluationsGet {
  
  inline def apply(): ParamsResourceProjectsDatasetsEvaluationsGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsDatasetsEvaluationsGet]
  }
  
  extension [Self <: ParamsResourceProjectsDatasetsEvaluationsGet](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
