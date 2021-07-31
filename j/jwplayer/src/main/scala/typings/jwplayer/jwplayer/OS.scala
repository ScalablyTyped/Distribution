package typings.jwplayer.jwplayer

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OS extends StObject {
  
  var android: Boolean
  
  var androidNative: Boolean
  
  // Android native browser
  var iOS: Boolean
  
  var iPad: Boolean
  
  var iPhone: Boolean
  
  var mac: Boolean
  
  var mobile: Boolean
  
  var version: Version
  
  var windows: Boolean
}
object OS {
  
  @scala.inline
  def apply(
    android: Boolean,
    androidNative: Boolean,
    iOS: Boolean,
    iPad: Boolean,
    iPhone: Boolean,
    mac: Boolean,
    mobile: Boolean,
    version: Version,
    windows: Boolean
  ): OS = {
    val __obj = js.Dynamic.literal(android = android.asInstanceOf[js.Any], androidNative = androidNative.asInstanceOf[js.Any], iOS = iOS.asInstanceOf[js.Any], iPad = iPad.asInstanceOf[js.Any], iPhone = iPhone.asInstanceOf[js.Any], mac = mac.asInstanceOf[js.Any], mobile = mobile.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any], windows = windows.asInstanceOf[js.Any])
    __obj.asInstanceOf[OS]
  }
  
  @scala.inline
  implicit class OSMutableBuilder[Self <: OS] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAndroid(value: Boolean): Self = StObject.set(x, "android", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAndroidNative(value: Boolean): Self = StObject.set(x, "androidNative", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIOS(value: Boolean): Self = StObject.set(x, "iOS", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIPad(value: Boolean): Self = StObject.set(x, "iPad", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIPhone(value: Boolean): Self = StObject.set(x, "iPhone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMac(value: Boolean): Self = StObject.set(x, "mac", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMobile(value: Boolean): Self = StObject.set(x, "mobile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersion(value: Version): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWindows(value: Boolean): Self = StObject.set(x, "windows", value.asInstanceOf[js.Any])
  }
}
