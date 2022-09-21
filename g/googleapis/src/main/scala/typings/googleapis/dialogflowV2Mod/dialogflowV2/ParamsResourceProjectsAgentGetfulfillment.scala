package typings.googleapis.dialogflowV2Mod.dialogflowV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsAgentGetfulfillment
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The name of the fulfillment. Format: `projects//agent/fulfillment`.
    */
  var name: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsAgentGetfulfillment {
  
  inline def apply(): ParamsResourceProjectsAgentGetfulfillment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsAgentGetfulfillment]
  }
  
  extension [Self <: ParamsResourceProjectsAgentGetfulfillment](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
