package typings.ioredis.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NodeConfiguration extends StObject {
  
  var host: js.UndefOr[String] = js.undefined
  
  var port: js.UndefOr[Double] = js.undefined
}
object NodeConfiguration {
  
  inline def apply(): NodeConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NodeConfiguration]
  }
  
  extension [Self <: NodeConfiguration](x: Self) {
    
    inline def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
    
    inline def setHostUndefined: Self = StObject.set(x, "host", js.undefined)
    
    inline def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
    
    inline def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
  }
}
