package typings.googleapis.computeV1Mod.computeV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceBackendservicesGethealth
  extends StObject
     with StandardParameters {
  
  /**
    * Name of the BackendService resource to which the queried instance belongs.
    */
  var backendService: js.UndefOr[String] = js.undefined
  
  /**
    *
    */
  var project: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaResourceGroupReference] = js.undefined
}
object ParamsResourceBackendservicesGethealth {
  
  inline def apply(): ParamsResourceBackendservicesGethealth = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceBackendservicesGethealth]
  }
  
  extension [Self <: ParamsResourceBackendservicesGethealth](x: Self) {
    
    inline def setBackendService(value: String): Self = StObject.set(x, "backendService", value.asInstanceOf[js.Any])
    
    inline def setBackendServiceUndefined: Self = StObject.set(x, "backendService", js.undefined)
    
    inline def setProject(value: String): Self = StObject.set(x, "project", value.asInstanceOf[js.Any])
    
    inline def setProjectUndefined: Self = StObject.set(x, "project", js.undefined)
    
    inline def setRequestBody(value: SchemaResourceGroupReference): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
