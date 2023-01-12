package typings.ioredis.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Ip extends StObject {
  
  var ip: String
  
  var port: String
  
  var prio: js.UndefOr[Double] = js.undefined
}
object Ip {
  
  inline def apply(ip: String, port: String): Ip = {
    val __obj = js.Dynamic.literal(ip = ip.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any])
    __obj.asInstanceOf[Ip]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Ip] (val x: Self) extends AnyVal {
    
    inline def setIp(value: String): Self = StObject.set(x, "ip", value.asInstanceOf[js.Any])
    
    inline def setPort(value: String): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
    
    inline def setPrio(value: Double): Self = StObject.set(x, "prio", value.asInstanceOf[js.Any])
    
    inline def setPrioUndefined: Self = StObject.set(x, "prio", js.undefined)
  }
}
