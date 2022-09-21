package typings.googleapis.notebooksV1Mod.notebooksV1

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGetInstanceHealthResponse extends StObject {
  
  /**
    * Output only. Additional information about instance health. Example: healthInfo": { "docker_proxy_agent_status": "1", "docker_status": "1", "jupyterlab_api_status": "-1", "jupyterlab_status": "-1", "updated": "2020-10-18 09:40:03.573409" \}
    */
  var healthInfo: js.UndefOr[StringDictionary[String] | Null] = js.undefined
  
  /**
    * Output only. Runtime health_state.
    */
  var healthState: js.UndefOr[String | Null] = js.undefined
}
object SchemaGetInstanceHealthResponse {
  
  inline def apply(): SchemaGetInstanceHealthResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGetInstanceHealthResponse]
  }
  
  extension [Self <: SchemaGetInstanceHealthResponse](x: Self) {
    
    inline def setHealthInfo(value: StringDictionary[String]): Self = StObject.set(x, "healthInfo", value.asInstanceOf[js.Any])
    
    inline def setHealthInfoNull: Self = StObject.set(x, "healthInfo", null)
    
    inline def setHealthInfoUndefined: Self = StObject.set(x, "healthInfo", js.undefined)
    
    inline def setHealthState(value: String): Self = StObject.set(x, "healthState", value.asInstanceOf[js.Any])
    
    inline def setHealthStateNull: Self = StObject.set(x, "healthState", null)
    
    inline def setHealthStateUndefined: Self = StObject.set(x, "healthState", js.undefined)
  }
}
