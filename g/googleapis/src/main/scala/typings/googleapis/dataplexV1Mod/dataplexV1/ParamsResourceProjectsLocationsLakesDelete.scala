package typings.googleapis.dataplexV1Mod.dataplexV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsLakesDelete
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The resource name of the lake: projects/{project_number\}/locations/{location_id\}/lakes/{lake_id\}.
    */
  var name: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsLocationsLakesDelete {
  
  inline def apply(): ParamsResourceProjectsLocationsLakesDelete = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsLakesDelete]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsLakesDelete](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
