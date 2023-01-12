package typings.jaegerClient.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SamplerConfig extends StObject {
  
  var host: js.UndefOr[String] = js.undefined
  
  var hostPort: js.UndefOr[String] = js.undefined
  
  var param: Double
  
  var port: js.UndefOr[Double] = js.undefined
  
  var refreshIntervalMs: js.UndefOr[Double] = js.undefined
  
  var `type`: String
}
object SamplerConfig {
  
  inline def apply(param: Double, `type`: String): SamplerConfig = {
    val __obj = js.Dynamic.literal(param = param.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SamplerConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SamplerConfig] (val x: Self) extends AnyVal {
    
    inline def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
    
    inline def setHostPort(value: String): Self = StObject.set(x, "hostPort", value.asInstanceOf[js.Any])
    
    inline def setHostPortUndefined: Self = StObject.set(x, "hostPort", js.undefined)
    
    inline def setHostUndefined: Self = StObject.set(x, "host", js.undefined)
    
    inline def setParam(value: Double): Self = StObject.set(x, "param", value.asInstanceOf[js.Any])
    
    inline def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
    
    inline def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
    
    inline def setRefreshIntervalMs(value: Double): Self = StObject.set(x, "refreshIntervalMs", value.asInstanceOf[js.Any])
    
    inline def setRefreshIntervalMsUndefined: Self = StObject.set(x, "refreshIntervalMs", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
