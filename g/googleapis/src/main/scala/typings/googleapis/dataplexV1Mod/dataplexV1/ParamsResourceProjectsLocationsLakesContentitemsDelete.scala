package typings.googleapis.dataplexV1Mod.dataplexV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsLakesContentitemsDelete
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The resource name of the content: projects/{project_id\}/locations/{location_id\}/lakes/{lake_id\}/content/{content_id\}
    */
  var name: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsLocationsLakesContentitemsDelete {
  
  inline def apply(): ParamsResourceProjectsLocationsLakesContentitemsDelete = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsLakesContentitemsDelete]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsLakesContentitemsDelete](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
