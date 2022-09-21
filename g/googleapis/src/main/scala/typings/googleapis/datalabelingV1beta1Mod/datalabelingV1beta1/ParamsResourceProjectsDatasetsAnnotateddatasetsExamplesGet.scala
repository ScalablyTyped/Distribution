package typings.googleapis.datalabelingV1beta1Mod.datalabelingV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsDatasetsAnnotateddatasetsExamplesGet
  extends StObject
     with StandardParameters {
  
  /**
    * Optional. An expression for filtering Examples. Filter by annotation_spec.display_name is supported. Format "annotation_spec.display_name = {display_name\}"
    */
  var filter: js.UndefOr[String] = js.undefined
  
  /**
    * Required. Name of example, format: projects/{project_id\}/datasets/{dataset_id\}/annotatedDatasets/ {annotated_dataset_id\}/examples/{example_id\}
    */
  var name: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsDatasetsAnnotateddatasetsExamplesGet {
  
  inline def apply(): ParamsResourceProjectsDatasetsAnnotateddatasetsExamplesGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsDatasetsAnnotateddatasetsExamplesGet]
  }
  
  extension [Self <: ParamsResourceProjectsDatasetsAnnotateddatasetsExamplesGet](x: Self) {
    
    inline def setFilter(value: String): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
