package typings.googleapis.trafficdirectorV2Mod.trafficdirectorV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaClientConfig extends StObject {
  
  /**
    * Node for a particular client.
    */
  var node: js.UndefOr[SchemaNode] = js.undefined
  
  var xdsConfig: js.UndefOr[js.Array[SchemaPerXdsConfig]] = js.undefined
}
object SchemaClientConfig {
  
  inline def apply(): SchemaClientConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaClientConfig]
  }
  
  extension [Self <: SchemaClientConfig](x: Self) {
    
    inline def setNode(value: SchemaNode): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
    
    inline def setNodeUndefined: Self = StObject.set(x, "node", js.undefined)
    
    inline def setXdsConfig(value: js.Array[SchemaPerXdsConfig]): Self = StObject.set(x, "xdsConfig", value.asInstanceOf[js.Any])
    
    inline def setXdsConfigUndefined: Self = StObject.set(x, "xdsConfig", js.undefined)
    
    inline def setXdsConfigVarargs(value: SchemaPerXdsConfig*): Self = StObject.set(x, "xdsConfig", js.Array(value*))
  }
}
