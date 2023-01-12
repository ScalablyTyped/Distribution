package typings.ismobilejs

import typings.ismobilejs.anon.Blackberry
import typings.ismobilejs.anon.Device
import typings.ismobilejs.anon.Phone
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesIsMobileMod {
  
  @JSImport("ismobilejs/types/isMobile", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(): isMobileResult = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[isMobileResult]
  inline def default(param: IsMobileParameter): isMobileResult = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(param.asInstanceOf[js.Any]).asInstanceOf[isMobileResult]
  
  type IsMobileParameter = UserAgent | Navigator
  
  trait Navigator extends StObject {
    
    var maxTouchPoints: js.UndefOr[Double] = js.undefined
    
    var platform: String
    
    var userAgent: String
  }
  object Navigator {
    
    inline def apply(platform: String, userAgent: String): Navigator = {
      val __obj = js.Dynamic.literal(platform = platform.asInstanceOf[js.Any], userAgent = userAgent.asInstanceOf[js.Any])
      __obj.asInstanceOf[Navigator]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Navigator] (val x: Self) extends AnyVal {
      
      inline def setMaxTouchPoints(value: Double): Self = StObject.set(x, "maxTouchPoints", value.asInstanceOf[js.Any])
      
      inline def setMaxTouchPointsUndefined: Self = StObject.set(x, "maxTouchPoints", js.undefined)
      
      inline def setPlatform(value: String): Self = StObject.set(x, "platform", value.asInstanceOf[js.Any])
      
      inline def setUserAgent(value: String): Self = StObject.set(x, "userAgent", value.asInstanceOf[js.Any])
    }
  }
  
  type UserAgent = String
  
  trait isMobileResult extends StObject {
    
    var amazon: Phone
    
    var android: Phone
    
    var any: Boolean
    
    var apple: Device
    
    var other: Blackberry
    
    var phone: Boolean
    
    var tablet: Boolean
    
    var windows: Phone
  }
  object isMobileResult {
    
    inline def apply(
      amazon: Phone,
      android: Phone,
      any: Boolean,
      apple: Device,
      other: Blackberry,
      phone: Boolean,
      tablet: Boolean,
      windows: Phone
    ): isMobileResult = {
      val __obj = js.Dynamic.literal(amazon = amazon.asInstanceOf[js.Any], android = android.asInstanceOf[js.Any], any = any.asInstanceOf[js.Any], apple = apple.asInstanceOf[js.Any], other = other.asInstanceOf[js.Any], phone = phone.asInstanceOf[js.Any], tablet = tablet.asInstanceOf[js.Any], windows = windows.asInstanceOf[js.Any])
      __obj.asInstanceOf[isMobileResult]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: isMobileResult] (val x: Self) extends AnyVal {
      
      inline def setAmazon(value: Phone): Self = StObject.set(x, "amazon", value.asInstanceOf[js.Any])
      
      inline def setAndroid(value: Phone): Self = StObject.set(x, "android", value.asInstanceOf[js.Any])
      
      inline def setAny(value: Boolean): Self = StObject.set(x, "any", value.asInstanceOf[js.Any])
      
      inline def setApple(value: Device): Self = StObject.set(x, "apple", value.asInstanceOf[js.Any])
      
      inline def setOther(value: Blackberry): Self = StObject.set(x, "other", value.asInstanceOf[js.Any])
      
      inline def setPhone(value: Boolean): Self = StObject.set(x, "phone", value.asInstanceOf[js.Any])
      
      inline def setTablet(value: Boolean): Self = StObject.set(x, "tablet", value.asInstanceOf[js.Any])
      
      inline def setWindows(value: Phone): Self = StObject.set(x, "windows", value.asInstanceOf[js.Any])
    }
  }
}
