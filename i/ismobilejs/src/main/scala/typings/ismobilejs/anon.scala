package typings.ismobilejs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Blackberry extends StObject {
    
    var blackberry: Boolean
    
    var blackberry10: Boolean
    
    var chrome: Boolean
    
    var device: Boolean
    
    var firefox: Boolean
    
    var opera: Boolean
  }
  object Blackberry {
    
    @scala.inline
    def apply(
      blackberry: Boolean,
      blackberry10: Boolean,
      chrome: Boolean,
      device: Boolean,
      firefox: Boolean,
      opera: Boolean
    ): Blackberry = {
      val __obj = js.Dynamic.literal(blackberry = blackberry.asInstanceOf[js.Any], blackberry10 = blackberry10.asInstanceOf[js.Any], chrome = chrome.asInstanceOf[js.Any], device = device.asInstanceOf[js.Any], firefox = firefox.asInstanceOf[js.Any], opera = opera.asInstanceOf[js.Any])
      __obj.asInstanceOf[Blackberry]
    }
    
    @scala.inline
    implicit class BlackberryMutableBuilder[Self <: Blackberry] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBlackberry(value: Boolean): Self = StObject.set(x, "blackberry", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBlackberry10(value: Boolean): Self = StObject.set(x, "blackberry10", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChrome(value: Boolean): Self = StObject.set(x, "chrome", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDevice(value: Boolean): Self = StObject.set(x, "device", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFirefox(value: Boolean): Self = StObject.set(x, "firefox", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOpera(value: Boolean): Self = StObject.set(x, "opera", value.asInstanceOf[js.Any])
    }
  }
  
  trait Device extends StObject {
    
    var device: Boolean
    
    var ipod: Boolean
    
    var phone: Boolean
    
    var tablet: Boolean
    
    var universal: Boolean
  }
  object Device {
    
    @scala.inline
    def apply(device: Boolean, ipod: Boolean, phone: Boolean, tablet: Boolean, universal: Boolean): Device = {
      val __obj = js.Dynamic.literal(device = device.asInstanceOf[js.Any], ipod = ipod.asInstanceOf[js.Any], phone = phone.asInstanceOf[js.Any], tablet = tablet.asInstanceOf[js.Any], universal = universal.asInstanceOf[js.Any])
      __obj.asInstanceOf[Device]
    }
    
    @scala.inline
    implicit class DeviceMutableBuilder[Self <: Device] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDevice(value: Boolean): Self = StObject.set(x, "device", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIpod(value: Boolean): Self = StObject.set(x, "ipod", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPhone(value: Boolean): Self = StObject.set(x, "phone", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTablet(value: Boolean): Self = StObject.set(x, "tablet", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUniversal(value: Boolean): Self = StObject.set(x, "universal", value.asInstanceOf[js.Any])
    }
  }
  
  trait Phone extends StObject {
    
    var device: Boolean
    
    var phone: Boolean
    
    var tablet: Boolean
  }
  object Phone {
    
    @scala.inline
    def apply(device: Boolean, phone: Boolean, tablet: Boolean): Phone = {
      val __obj = js.Dynamic.literal(device = device.asInstanceOf[js.Any], phone = phone.asInstanceOf[js.Any], tablet = tablet.asInstanceOf[js.Any])
      __obj.asInstanceOf[Phone]
    }
    
    @scala.inline
    implicit class PhoneMutableBuilder[Self <: Phone] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDevice(value: Boolean): Self = StObject.set(x, "device", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPhone(value: Boolean): Self = StObject.set(x, "phone", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTablet(value: Boolean): Self = StObject.set(x, "tablet", value.asInstanceOf[js.Any])
    }
  }
}
