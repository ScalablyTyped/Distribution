package typings.googleapis.datalabelingV1beta1Mod.datalabelingV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsDatasetsAnnotateddatasetsDelete
  extends StObject
     with StandardParameters {
  
  /**
    * Required. Name of the annotated dataset to delete, format: projects/{project_id\}/datasets/{dataset_id\}/annotatedDatasets/ {annotated_dataset_id\}
    */
  var name: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsDatasetsAnnotateddatasetsDelete {
  
  inline def apply(): ParamsResourceProjectsDatasetsAnnotateddatasetsDelete = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsDatasetsAnnotateddatasetsDelete]
  }
  
  extension [Self <: ParamsResourceProjectsDatasetsAnnotateddatasetsDelete](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
