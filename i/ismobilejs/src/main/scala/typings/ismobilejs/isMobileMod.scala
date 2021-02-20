package typings.ismobilejs

import typings.ismobilejs.anon.Blackberry
import typings.ismobilejs.anon.Device
import typings.ismobilejs.anon.Phone
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object isMobileMod {
  
  @JSImport("ismobilejs/types/isMobile", JSImport.Default)
  @js.native
  def default(): isMobileResult = js.native
  @JSImport("ismobilejs/types/isMobile", JSImport.Default)
  @js.native
  def default(param: IsMobileParameter): isMobileResult = js.native
  
  type IsMobileParameter = UserAgent | Navigator
  
  @js.native
  trait Navigator extends StObject {
    
    var maxTouchPoints: js.UndefOr[Double] = js.native
    
    var platform: String = js.native
    
    var userAgent: String = js.native
  }
  object Navigator {
    
    @scala.inline
    def apply(platform: String, userAgent: String): Navigator = {
      val __obj = js.Dynamic.literal(platform = platform.asInstanceOf[js.Any], userAgent = userAgent.asInstanceOf[js.Any])
      __obj.asInstanceOf[Navigator]
    }
    
    @scala.inline
    implicit class NavigatorMutableBuilder[Self <: Navigator] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMaxTouchPoints(value: Double): Self = StObject.set(x, "maxTouchPoints", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxTouchPointsUndefined: Self = StObject.set(x, "maxTouchPoints", js.undefined)
      
      @scala.inline
      def setPlatform(value: String): Self = StObject.set(x, "platform", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUserAgent(value: String): Self = StObject.set(x, "userAgent", value.asInstanceOf[js.Any])
    }
  }
  
  type UserAgent = String
  
  @js.native
  trait isMobileResult extends StObject {
    
    var amazon: Phone = js.native
    
    var android: Phone = js.native
    
    var any: Boolean = js.native
    
    var apple: Device = js.native
    
    var other: Blackberry = js.native
    
    var phone: Boolean = js.native
    
    var tablet: Boolean = js.native
    
    var windows: Phone = js.native
  }
  object isMobileResult {
    
    @scala.inline
    def apply(
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
    implicit class isMobileResultMutableBuilder[Self <: isMobileResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAmazon(value: Phone): Self = StObject.set(x, "amazon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAndroid(value: Phone): Self = StObject.set(x, "android", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAny(value: Boolean): Self = StObject.set(x, "any", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setApple(value: Device): Self = StObject.set(x, "apple", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOther(value: Blackberry): Self = StObject.set(x, "other", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPhone(value: Boolean): Self = StObject.set(x, "phone", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTablet(value: Boolean): Self = StObject.set(x, "tablet", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWindows(value: Phone): Self = StObject.set(x, "windows", value.asInstanceOf[js.Any])
    }
  }
}
