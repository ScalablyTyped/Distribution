package typings.googleapis.trafficdirectorV2Mod.trafficdirectorV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaClientStatusResponse extends StObject {
  
  /**
    * Client configs for the clients specified in the ClientStatusRequest.
    */
  var config: js.UndefOr[js.Array[SchemaClientConfig]] = js.undefined
}
object SchemaClientStatusResponse {
  
  inline def apply(): SchemaClientStatusResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaClientStatusResponse]
  }
  
  extension [Self <: SchemaClientStatusResponse](x: Self) {
    
    inline def setConfig(value: js.Array[SchemaClientConfig]): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
    
    inline def setConfigUndefined: Self = StObject.set(x, "config", js.undefined)
    
    inline def setConfigVarargs(value: SchemaClientConfig*): Self = StObject.set(x, "config", js.Array(value*))
  }
}
