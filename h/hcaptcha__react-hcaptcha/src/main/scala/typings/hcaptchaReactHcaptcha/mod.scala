package typings.hcaptchaReactHcaptcha

import typings.hcaptchaReactHcaptcha.hcaptchaReactHcaptchaStrings.compact
import typings.hcaptchaReactHcaptcha.hcaptchaReactHcaptchaStrings.dark
import typings.hcaptchaReactHcaptcha.hcaptchaReactHcaptchaStrings.invisible
import typings.hcaptchaReactHcaptcha.hcaptchaReactHcaptchaStrings.light
import typings.hcaptchaReactHcaptcha.hcaptchaReactHcaptchaStrings.normal
import typings.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@hcaptcha/react-hcaptcha", JSImport.Namespace)
  @js.native
  open class ^ () extends HCaptcha
  
  @js.native
  trait HCaptcha extends Component[HCaptchaProps, HCaptchaState, Any] {
    
    def execute(): Unit = js.native
    
    def removeCaptcha(): Unit = js.native
    
    def renderCaptcha(): Unit = js.native
    
    def resetCaptcha(): Unit = js.native
  }
  
  trait HCaptchaProps extends StObject {
    
    var id: js.UndefOr[String] = js.undefined
    
    var languageOverride: js.UndefOr[String] = js.undefined
    
    var onError: js.UndefOr[js.Function1[/* event */ String, Any]] = js.undefined
    
    var onExpire: js.UndefOr[js.Function0[Any]] = js.undefined
    
    var onVerify: js.UndefOr[js.Function1[/* token */ String, Any]] = js.undefined
    
    var reCaptchaCompat: js.UndefOr[Boolean] = js.undefined
    
    var sitekey: String
    
    var size: js.UndefOr[normal | compact | invisible] = js.undefined
    
    var tabIndex: js.UndefOr[Double] = js.undefined
    
    var theme: js.UndefOr[light | dark] = js.undefined
  }
  object HCaptchaProps {
    
    inline def apply(sitekey: String): HCaptchaProps = {
      val __obj = js.Dynamic.literal(sitekey = sitekey.asInstanceOf[js.Any])
      __obj.asInstanceOf[HCaptchaProps]
    }
    
    extension [Self <: HCaptchaProps](x: Self) {
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setLanguageOverride(value: String): Self = StObject.set(x, "languageOverride", value.asInstanceOf[js.Any])
      
      inline def setLanguageOverrideUndefined: Self = StObject.set(x, "languageOverride", js.undefined)
      
      inline def setOnError(value: /* event */ String => Any): Self = StObject.set(x, "onError", js.Any.fromFunction1(value))
      
      inline def setOnErrorUndefined: Self = StObject.set(x, "onError", js.undefined)
      
      inline def setOnExpire(value: () => Any): Self = StObject.set(x, "onExpire", js.Any.fromFunction0(value))
      
      inline def setOnExpireUndefined: Self = StObject.set(x, "onExpire", js.undefined)
      
      inline def setOnVerify(value: /* token */ String => Any): Self = StObject.set(x, "onVerify", js.Any.fromFunction1(value))
      
      inline def setOnVerifyUndefined: Self = StObject.set(x, "onVerify", js.undefined)
      
      inline def setReCaptchaCompat(value: Boolean): Self = StObject.set(x, "reCaptchaCompat", value.asInstanceOf[js.Any])
      
      inline def setReCaptchaCompatUndefined: Self = StObject.set(x, "reCaptchaCompat", js.undefined)
      
      inline def setSitekey(value: String): Self = StObject.set(x, "sitekey", value.asInstanceOf[js.Any])
      
      inline def setSize(value: normal | compact | invisible): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      inline def setTabIndex(value: Double): Self = StObject.set(x, "tabIndex", value.asInstanceOf[js.Any])
      
      inline def setTabIndexUndefined: Self = StObject.set(x, "tabIndex", js.undefined)
      
      inline def setTheme(value: light | dark): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
    }
  }
  
  trait HCaptchaState extends StObject {
    
    var captchaId: String
    
    var elementId: String
    
    var isApiReady: Boolean
    
    var isRemoved: Boolean
  }
  object HCaptchaState {
    
    inline def apply(captchaId: String, elementId: String, isApiReady: Boolean, isRemoved: Boolean): HCaptchaState = {
      val __obj = js.Dynamic.literal(captchaId = captchaId.asInstanceOf[js.Any], elementId = elementId.asInstanceOf[js.Any], isApiReady = isApiReady.asInstanceOf[js.Any], isRemoved = isRemoved.asInstanceOf[js.Any])
      __obj.asInstanceOf[HCaptchaState]
    }
    
    extension [Self <: HCaptchaState](x: Self) {
      
      inline def setCaptchaId(value: String): Self = StObject.set(x, "captchaId", value.asInstanceOf[js.Any])
      
      inline def setElementId(value: String): Self = StObject.set(x, "elementId", value.asInstanceOf[js.Any])
      
      inline def setIsApiReady(value: Boolean): Self = StObject.set(x, "isApiReady", value.asInstanceOf[js.Any])
      
      inline def setIsRemoved(value: Boolean): Self = StObject.set(x, "isRemoved", value.asInstanceOf[js.Any])
    }
  }
}
