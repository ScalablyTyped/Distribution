package typings.hyperdeckJsLib

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Connected extends StObject {
    
    var connected: Boolean
  }
  object Connected {
    
    inline def apply(connected: Boolean): Connected = {
      val __obj = js.Dynamic.literal(connected = connected.asInstanceOf[js.Any])
      __obj.asInstanceOf[Connected]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Connected] (val x: Self) extends AnyVal {
      
      inline def setConnected(value: Boolean): Self = StObject.set(x, "connected", value.asInstanceOf[js.Any])
    }
  }
  
  trait Ip extends StObject {
    
    var ip: String
    
    var pingInterval: js.UndefOr[Double] = js.undefined
  }
  object Ip {
    
    inline def apply(ip: String): Ip = {
      val __obj = js.Dynamic.literal(ip = ip.asInstanceOf[js.Any])
      __obj.asInstanceOf[Ip]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Ip] (val x: Self) extends AnyVal {
      
      inline def setIp(value: String): Self = StObject.set(x, "ip", value.asInstanceOf[js.Any])
      
      inline def setPingInterval(value: Double): Self = StObject.set(x, "pingInterval", value.asInstanceOf[js.Any])
      
      inline def setPingIntervalUndefined: Self = StObject.set(x, "pingInterval", js.undefined)
    }
  }
}
