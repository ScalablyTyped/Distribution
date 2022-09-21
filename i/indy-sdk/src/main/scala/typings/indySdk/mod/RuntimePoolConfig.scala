package typings.indySdk.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RuntimePoolConfig extends StObject {
  
  var extended_timeout: js.UndefOr[Double] = js.undefined
  
  var number_read_nodes: js.UndefOr[Double] = js.undefined
  
  var preordered_nodes: js.UndefOr[js.Array[String]] = js.undefined
  
  var timeout: js.UndefOr[Double] = js.undefined
}
object RuntimePoolConfig {
  
  inline def apply(): RuntimePoolConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RuntimePoolConfig]
  }
  
  extension [Self <: RuntimePoolConfig](x: Self) {
    
    inline def setExtended_timeout(value: Double): Self = StObject.set(x, "extended_timeout", value.asInstanceOf[js.Any])
    
    inline def setExtended_timeoutUndefined: Self = StObject.set(x, "extended_timeout", js.undefined)
    
    inline def setNumber_read_nodes(value: Double): Self = StObject.set(x, "number_read_nodes", value.asInstanceOf[js.Any])
    
    inline def setNumber_read_nodesUndefined: Self = StObject.set(x, "number_read_nodes", js.undefined)
    
    inline def setPreordered_nodes(value: js.Array[String]): Self = StObject.set(x, "preordered_nodes", value.asInstanceOf[js.Any])
    
    inline def setPreordered_nodesUndefined: Self = StObject.set(x, "preordered_nodes", js.undefined)
    
    inline def setPreordered_nodesVarargs(value: String*): Self = StObject.set(x, "preordered_nodes", js.Array(value*))
    
    inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
  }
}
