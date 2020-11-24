package typings.ionicCore.anon

import typings.std.Window
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Android extends js.Object {
  
  def android(win: Window): Boolean = js.native
  
  def capacitor(win: js.Any): Boolean = js.native
  
  def cordova(win: js.Any): Boolean = js.native
  
  def desktop(win: Window): Boolean = js.native
  
  def electron(win: Window): Boolean = js.native
  
  def hybrid(win: Window): Boolean = js.native
  
  def ios(win: Window): Boolean = js.native
  
  def ipad(win: Window): Boolean = js.native
  
  def iphone(win: Window): Boolean = js.native
  
  def mobile(win: Window): Boolean = js.native
  
  def mobileweb(win: Window): Boolean = js.native
  
  def phablet(win: Window): Boolean = js.native
  
  def pwa(win: Window): Boolean = js.native
  
  def tablet(win: Window): Boolean = js.native
}
object Android {
  
  @scala.inline
  def apply(
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
  
  @scala.inline
  implicit class AndroidOps[Self <: Android] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAndroid(value: Window => Boolean): Self = this.set("android", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCapacitor(value: js.Any => Boolean): Self = this.set("capacitor", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCordova(value: js.Any => Boolean): Self = this.set("cordova", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDesktop(value: Window => Boolean): Self = this.set("desktop", js.Any.fromFunction1(value))
    
    @scala.inline
    def setElectron(value: Window => Boolean): Self = this.set("electron", js.Any.fromFunction1(value))
    
    @scala.inline
    def setHybrid(value: Window => Boolean): Self = this.set("hybrid", js.Any.fromFunction1(value))
    
    @scala.inline
    def setIos(value: Window => Boolean): Self = this.set("ios", js.Any.fromFunction1(value))
    
    @scala.inline
    def setIpad(value: Window => Boolean): Self = this.set("ipad", js.Any.fromFunction1(value))
    
    @scala.inline
    def setIphone(value: Window => Boolean): Self = this.set("iphone", js.Any.fromFunction1(value))
    
    @scala.inline
    def setMobile(value: Window => Boolean): Self = this.set("mobile", js.Any.fromFunction1(value))
    
    @scala.inline
    def setMobileweb(value: Window => Boolean): Self = this.set("mobileweb", js.Any.fromFunction1(value))
    
    @scala.inline
    def setPhablet(value: Window => Boolean): Self = this.set("phablet", js.Any.fromFunction1(value))
    
    @scala.inline
    def setPwa(value: Window => Boolean): Self = this.set("pwa", js.Any.fromFunction1(value))
    
    @scala.inline
    def setTablet(value: Window => Boolean): Self = this.set("tablet", js.Any.fromFunction1(value))
  }
}
