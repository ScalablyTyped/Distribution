package typings.googleapis.runV2Mod.runV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsServicesRevisionsGet
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The full name of the Revision. Format: projects/{project\}/locations/{location\}/services/{service\}/revisions/{revision\}
    */
  var name: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsLocationsServicesRevisionsGet {
  
  inline def apply(): ParamsResourceProjectsLocationsServicesRevisionsGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsServicesRevisionsGet]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsServicesRevisionsGet](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
