package typings.googleapis.firebaseappcheckV1betaMod.firebaseappcheckV1beta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsAppsPlayintegrityconfigGet
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The relative resource name of the PlayIntegrityConfig, in the format: ``` projects/{project_number\}/apps/{app_id\}/playIntegrityConfig ```
    */
  var name: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsAppsPlayintegrityconfigGet {
  
  inline def apply(): ParamsResourceProjectsAppsPlayintegrityconfigGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsAppsPlayintegrityconfigGet]
  }
  
  extension [Self <: ParamsResourceProjectsAppsPlayintegrityconfigGet](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
