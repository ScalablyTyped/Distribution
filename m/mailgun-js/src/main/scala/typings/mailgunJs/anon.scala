package typings.mailgunJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Address extends StObject {
    
    var address: String = js.native
    
    var name: js.UndefOr[String] = js.native
    
    var subscribed: js.UndefOr[Boolean] = js.native
  }
  object Address {
    
    @scala.inline
    def apply(address: String): Address = {
      val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any])
      __obj.asInstanceOf[Address]
    }
    
    @scala.inline
    implicit class AddressMutableBuilder[Self <: Address] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAddress(value: String): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setSubscribed(value: Boolean): Self = StObject.set(x, "subscribed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSubscribedUndefined: Self = StObject.set(x, "subscribed", js.undefined)
    }
  }
  
  @js.native
  trait Displayname extends StObject {
    
    var display_name: String | Null = js.native
    
    var domain: String = js.native
    
    var local_part: String = js.native
  }
  object Displayname {
    
    @scala.inline
    def apply(domain: String, local_part: String): Displayname = {
      val __obj = js.Dynamic.literal(domain = domain.asInstanceOf[js.Any], local_part = local_part.asInstanceOf[js.Any])
      __obj.asInstanceOf[Displayname]
    }
    
    @scala.inline
    implicit class DisplaynameMutableBuilder[Self <: Displayname] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDisplay_name(value: String): Self = StObject.set(x, "display_name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisplay_nameNull: Self = StObject.set(x, "display_name", null)
      
      @scala.inline
      def setDomain(value: String): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocal_part(value: String): Self = StObject.set(x, "local_part", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Interval extends StObject {
    
    var interval: Double = js.native
    
    var times: Double = js.native
  }
  object Interval {
    
    @scala.inline
    def apply(interval: Double, times: Double): Interval = {
      val __obj = js.Dynamic.literal(interval = interval.asInstanceOf[js.Any], times = times.asInstanceOf[js.Any])
      __obj.asInstanceOf[Interval]
    }
    
    @scala.inline
    implicit class IntervalMutableBuilder[Self <: Interval] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setInterval(value: Double): Self = StObject.set(x, "interval", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimes(value: Double): Self = StObject.set(x, "times", value.asInstanceOf[js.Any])
    }
  }
}
