package typings.googleapis.retailV2alphaMod.retailV2alpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsCatalogsModelsDelete
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The resource name of the Model to delete. Format: projects/{project_number\}/locations/{location_id\}/catalogs/{catalog_id\}/models/{model_id\}
    */
  var name: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsLocationsCatalogsModelsDelete {
  
  inline def apply(): ParamsResourceProjectsLocationsCatalogsModelsDelete = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsCatalogsModelsDelete]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsCatalogsModelsDelete](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
