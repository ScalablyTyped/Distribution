package typings.ionicUtilsNetwork

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Device extends StObject {
    
    var device: String
  }
  object Device {
    
    @scala.inline
    def apply(device: String): Device = {
      val __obj = js.Dynamic.literal(device = device.asInstanceOf[js.Any])
      __obj.asInstanceOf[Device]
    }
    
    @scala.inline
    implicit class DeviceMutableBuilder[Self <: Device] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDevice(value: String): Self = StObject.set(x, "device", value.asInstanceOf[js.Any])
    }
  }
  
  trait Timeout extends StObject {
    
    var timeout: js.UndefOr[Double] = js.undefined
  }
  object Timeout {
    
    @scala.inline
    def apply(): Timeout = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Timeout]
    }
    
    @scala.inline
    implicit class TimeoutMutableBuilder[Self <: Timeout] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    }
  }
}
