package typings.googleapis.toolresultsV1beta3Mod.toolresultsV1beta3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsGetsettings
  extends StObject
     with StandardParameters {
  
  /**
    * A Project id. Required.
    */
  var projectId: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsGetsettings {
  
  inline def apply(): ParamsResourceProjectsGetsettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsGetsettings]
  }
  
  extension [Self <: ParamsResourceProjectsGetsettings](x: Self) {
    
    inline def setProjectId(value: String): Self = StObject.set(x, "projectId", value.asInstanceOf[js.Any])
    
    inline def setProjectIdUndefined: Self = StObject.set(x, "projectId", js.undefined)
  }
}
