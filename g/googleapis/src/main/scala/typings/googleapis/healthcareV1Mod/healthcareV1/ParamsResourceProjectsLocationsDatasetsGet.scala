package typings.googleapis.healthcareV1Mod.healthcareV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsDatasetsGet
  extends StObject
     with StandardParameters {
  
  /**
    * The name of the dataset to read. For example, `projects/{project_id\}/locations/{location_id\}/datasets/{dataset_id\}`.
    */
  var name: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsLocationsDatasetsGet {
  
  inline def apply(): ParamsResourceProjectsLocationsDatasetsGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsDatasetsGet]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsDatasetsGet](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
