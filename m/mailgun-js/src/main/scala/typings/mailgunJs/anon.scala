package typings.mailgunJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Address extends StObject {
    
    var address: String
    
    var name: js.UndefOr[String] = js.undefined
    
    var subscribed: js.UndefOr[Boolean] = js.undefined
  }
  object Address {
    
    inline def apply(address: String): Address = {
      val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any])
      __obj.asInstanceOf[Address]
    }
    
    extension [Self <: Address](x: Self) {
      
      inline def setAddress(value: String): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setSubscribed(value: Boolean): Self = StObject.set(x, "subscribed", value.asInstanceOf[js.Any])
      
      inline def setSubscribedUndefined: Self = StObject.set(x, "subscribed", js.undefined)
    }
  }
  
  trait Displayname extends StObject {
    
    var display_name: String | Null
    
    var domain: String
    
    var local_part: String
  }
  object Displayname {
    
    inline def apply(domain: String, local_part: String): Displayname = {
      val __obj = js.Dynamic.literal(domain = domain.asInstanceOf[js.Any], local_part = local_part.asInstanceOf[js.Any], display_name = null)
      __obj.asInstanceOf[Displayname]
    }
    
    extension [Self <: Displayname](x: Self) {
      
      inline def setDisplay_name(value: String): Self = StObject.set(x, "display_name", value.asInstanceOf[js.Any])
      
      inline def setDisplay_nameNull: Self = StObject.set(x, "display_name", null)
      
      inline def setDomain(value: String): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
      
      inline def setLocal_part(value: String): Self = StObject.set(x, "local_part", value.asInstanceOf[js.Any])
    }
  }
  
  trait Interval extends StObject {
    
    var interval: Double
    
    var times: Double
  }
  object Interval {
    
    inline def apply(interval: Double, times: Double): Interval = {
      val __obj = js.Dynamic.literal(interval = interval.asInstanceOf[js.Any], times = times.asInstanceOf[js.Any])
      __obj.asInstanceOf[Interval]
    }
    
    extension [Self <: Interval](x: Self) {
      
      inline def setInterval(value: Double): Self = StObject.set(x, "interval", value.asInstanceOf[js.Any])
      
      inline def setTimes(value: Double): Self = StObject.set(x, "times", value.asInstanceOf[js.Any])
    }
  }
}
