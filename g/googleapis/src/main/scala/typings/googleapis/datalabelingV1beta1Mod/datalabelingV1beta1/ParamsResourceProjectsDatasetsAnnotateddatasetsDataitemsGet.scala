package typings.googleapis.datalabelingV1beta1Mod.datalabelingV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsDatasetsAnnotateddatasetsDataitemsGet
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The name of the data item to get, format: projects/{project_id\}/datasets/{dataset_id\}/dataItems/{data_item_id\}
    */
  var name: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsDatasetsAnnotateddatasetsDataitemsGet {
  
  inline def apply(): ParamsResourceProjectsDatasetsAnnotateddatasetsDataitemsGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsDatasetsAnnotateddatasetsDataitemsGet]
  }
  
  extension [Self <: ParamsResourceProjectsDatasetsAnnotateddatasetsDataitemsGet](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
