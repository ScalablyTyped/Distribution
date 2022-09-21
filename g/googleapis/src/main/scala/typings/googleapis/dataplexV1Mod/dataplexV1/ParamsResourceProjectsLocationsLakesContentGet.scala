package typings.googleapis.dataplexV1Mod.dataplexV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsLakesContentGet
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The resource name of the content: projects/{project_id\}/locations/{location_id\}/lakes/{lake_id\}/content/{content_id\}
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Optional. Specify content view to make a partial request.
    */
  var view: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsLocationsLakesContentGet {
  
  inline def apply(): ParamsResourceProjectsLocationsLakesContentGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsLakesContentGet]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsLakesContentGet](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setView(value: String): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
    
    inline def setViewUndefined: Self = StObject.set(x, "view", js.undefined)
  }
}
