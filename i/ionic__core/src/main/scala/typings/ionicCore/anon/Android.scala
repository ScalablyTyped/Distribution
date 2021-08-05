package typings.ionicCore.anon

import typings.std.Window
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Android extends StObject {
  
  def android(win: Window): Boolean
  
  def capacitor(win: js.Any): Boolean
  
  def cordova(win: js.Any): Boolean
  
  def desktop(win: Window): Boolean
  
  def electron(win: Window): Boolean
  
  def hybrid(win: Window): Boolean
  
  def ios(win: Window): Boolean
  
  def ipad(win: Window): Boolean
  
  def iphone(win: Window): Boolean
  
  def mobile(win: Window): Boolean
  
  def mobileweb(win: Window): Boolean
  
  def phablet(win: Window): Boolean
  
  def pwa(win: Window): Boolean
  
  def tablet(win: Window): Boolean
}
object Android {
  
  inline def apply(
    android: Window => Boolean,
    capacitor: js.Any => Boolean,
    cordova: js.Any => Boolean,
    desktop: Window => Boolean,
    electron: Window => Boolean,
    hybrid: Window => Boolean,
    ios: Window => Boolean,
    ipad: Window => Boolean,
    iphone: Window => Boolean,
    mobile: Window => Boolean,
    mobileweb: Window => Boolean,
    phablet: Window => Boolean,
    pwa: Window => Boolean,
    tablet: Window => Boolean
  ): Android = {
    val __obj = js.Dynamic.literal(android = js.Any.fromFunction1(android), capacitor = js.Any.fromFunction1(capacitor), cordova = js.Any.fromFunction1(cordova), desktop = js.Any.fromFunction1(desktop), electron = js.Any.fromFunction1(electron), hybrid = js.Any.fromFunction1(hybrid), ios = js.Any.fromFunction1(ios), ipad = js.Any.fromFunction1(ipad), iphone = js.Any.fromFunction1(iphone), mobile = js.Any.fromFunction1(mobile), mobileweb = js.Any.fromFunction1(mobileweb), phablet = js.Any.fromFunction1(phablet), pwa = js.Any.fromFunction1(pwa), tablet = js.Any.fromFunction1(tablet))
    __obj.asInstanceOf[Android]
  }
  
  extension [Self <: Android](x: Self) {
    
    inline def setAndroid(value: Window => Boolean): Self = StObject.set(x, "android", js.Any.fromFunction1(value))
    
    inline def setCapacitor(value: js.Any => Boolean): Self = StObject.set(x, "capacitor", js.Any.fromFunction1(value))
    
    inline def setCordova(value: js.Any => Boolean): Self = StObject.set(x, "cordova", js.Any.fromFunction1(value))
    
    inline def setDesktop(value: Window => Boolean): Self = StObject.set(x, "desktop", js.Any.fromFunction1(value))
    
    inline def setElectron(value: Window => Boolean): Self = StObject.set(x, "electron", js.Any.fromFunction1(value))
    
    inline def setHybrid(value: Window => Boolean): Self = StObject.set(x, "hybrid", js.Any.fromFunction1(value))
    
    inline def setIos(value: Window => Boolean): Self = StObject.set(x, "ios", js.Any.fromFunction1(value))
    
    inline def setIpad(value: Window => Boolean): Self = StObject.set(x, "ipad", js.Any.fromFunction1(value))
    
    inline def setIphone(value: Window => Boolean): Self = StObject.set(x, "iphone", js.Any.fromFunction1(value))
    
    inline def setMobile(value: Window => Boolean): Self = StObject.set(x, "mobile", js.Any.fromFunction1(value))
    
    inline def setMobileweb(value: Window => Boolean): Self = StObject.set(x, "mobileweb", js.Any.fromFunction1(value))
    
    inline def setPhablet(value: Window => Boolean): Self = StObject.set(x, "phablet", js.Any.fromFunction1(value))
    
    inline def setPwa(value: Window => Boolean): Self = StObject.set(x, "pwa", js.Any.fromFunction1(value))
    
    inline def setTablet(value: Window => Boolean): Self = StObject.set(x, "tablet", js.Any.fromFunction1(value))
  }
}
