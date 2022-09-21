package typings.googleapis.datalabelingV1beta1Mod.datalabelingV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsDatasetsGet
  extends StObject
     with StandardParameters {
  
  /**
    * Required. Dataset resource name, format: projects/{project_id\}/datasets/{dataset_id\}
    */
  var name: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsDatasetsGet {
  
  inline def apply(): ParamsResourceProjectsDatasetsGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsDatasetsGet]
  }
  
  extension [Self <: ParamsResourceProjectsDatasetsGet](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
