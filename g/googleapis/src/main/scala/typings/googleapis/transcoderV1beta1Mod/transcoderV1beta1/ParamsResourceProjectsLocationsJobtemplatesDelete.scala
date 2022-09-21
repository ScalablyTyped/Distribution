package typings.googleapis.transcoderV1beta1Mod.transcoderV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsJobtemplatesDelete
  extends StObject
     with StandardParameters {
  
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
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
