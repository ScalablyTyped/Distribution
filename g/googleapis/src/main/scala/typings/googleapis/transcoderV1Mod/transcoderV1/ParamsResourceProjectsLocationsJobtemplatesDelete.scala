package typings.googleapis.transcoderV1Mod.transcoderV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsJobtemplatesDelete
  extends StObject
     with StandardParameters {
  
  /**
    * If set to true, and the job template is not found, the request will succeed but no action will be taken on the server.
    */
  var allowMissing: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Required. The name of the job template to delete. `projects/{project\}/locations/{location\}/jobTemplates/{job_template\}`
    */
  var name: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsLocationsJobtemplatesDelete {
  
  inline def apply(): ParamsResourceProjectsLocationsJobtemplatesDelete = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsJobtemplatesDelete]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsJobtemplatesDelete](x: Self) {
    
    inline def setAllowMissing(value: Boolean): Self = StObject.set(x, "allowMissing", value.asInstanceOf[js.Any])
    
    inline def setAllowMissingUndefined: Self = StObject.set(x, "allowMissing", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
