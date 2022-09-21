package typings.googleapis.dialogflowV3Mod.dialogflowV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsAgentsWebhooksGet
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The name of the webhook. Format: `projects//locations//agents//webhooks/`.
    */
  var name: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsLocationsAgentsWebhooksGet {
  
  inline def apply(): ParamsResourceProjectsLocationsAgentsWebhooksGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsAgentsWebhooksGet]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsAgentsWebhooksGet](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
