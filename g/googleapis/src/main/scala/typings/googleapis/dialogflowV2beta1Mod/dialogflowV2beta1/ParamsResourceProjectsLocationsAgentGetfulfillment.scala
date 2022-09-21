package typings.googleapis.dialogflowV2beta1Mod.dialogflowV2beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsAgentGetfulfillment
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The name of the fulfillment. Supported formats: - `projects//agent/fulfillment` - `projects//locations//agent/fulfillment`
    */
  var name: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsLocationsAgentGetfulfillment {
  
  inline def apply(): ParamsResourceProjectsLocationsAgentGetfulfillment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsAgentGetfulfillment]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsAgentGetfulfillment](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
