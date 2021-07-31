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
  class ^ () extends HCaptcha
  
  @js.native
  trait HCaptcha
    extends Component[HCaptchaProps, HCaptchaState, js.Any] {
    
    def execute(): Unit = js.native
    
    def removeCaptcha(): Unit = js.native
    
    def renderCaptcha(): Unit = js.native
    
    def resetCaptcha(): Unit = js.native
  }
  
  trait HCaptchaProps extends StObject {
    
    var id: js.UndefOr[String] = js.undefined
    
    var languageOverride: js.UndefOr[String] = js.undefined
    
    var onError: js.UndefOr[js.Function1[/* event */ String, js.Any]] = js.undefined
    
    var onExpire: js.UndefOr[js.Function0[js.Any]] = js.undefined
    
    var onVerify: js.UndefOr[js.Function1[/* token */ String, js.Any]] = js.undefined
    
    var reCaptchaCompat: js.UndefOr[Boolean] = js.undefined
    
    var sitekey: String
    
    var size: js.UndefOr[normal | compact | invisible] = js.undefined
    
    var tabIndex: js.UndefOr[Double] = js.undefined
    
    var theme: js.UndefOr[light | dark] = js.undefined
  }
  object HCaptchaProps {
    
    @scala.inline
    def apply(sitekey: String): HCaptchaProps = {
      val __obj = js.Dynamic.literal(sitekey = sitekey.asInstanceOf[js.Any])
      __obj.asInstanceOf[HCaptchaProps]
    }
    
    @scala.inline
    implicit class HCaptchaPropsMutableBuilder[Self <: HCaptchaProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      @scala.inline
      def setLanguageOverride(value: String): Self = StObject.set(x, "languageOverride", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLanguageOverrideUndefined: Self = StObject.set(x, "languageOverride", js.undefined)
      
      @scala.inline
      def setOnError(value: /* event */ String => js.Any): Self = StObject.set(x, "onError", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnErrorUndefined: Self = StObject.set(x, "onError", js.undefined)
      
      @scala.inline
      def setOnExpire(value: () => js.Any): Self = StObject.set(x, "onExpire", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnExpireUndefined: Self = StObject.set(x, "onExpire", js.undefined)
      
      @scala.inline
      def setOnVerify(value: /* token */ String => js.Any): Self = StObject.set(x, "onVerify", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnVerifyUndefined: Self = StObject.set(x, "onVerify", js.undefined)
      
      @scala.inline
      def setReCaptchaCompat(value: Boolean): Self = StObject.set(x, "reCaptchaCompat", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReCaptchaCompatUndefined: Self = StObject.set(x, "reCaptchaCompat", js.undefined)
      
      @scala.inline
      def setSitekey(value: String): Self = StObject.set(x, "sitekey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSize(value: normal | compact | invisible): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      @scala.inline
      def setTabIndex(value: Double): Self = StObject.set(x, "tabIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTabIndexUndefined: Self = StObject.set(x, "tabIndex", js.undefined)
      
      @scala.inline
      def setTheme(value: light | dark): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
    }
  }
  
  trait HCaptchaState extends StObject {
    
    var captchaId: String
    
    var elementId: String
    
    var isApiReady: Boolean
    
    var isRemoved: Boolean
  }
  object HCaptchaState {
    
    @scala.inline
    def apply(captchaId: String, elementId: String, isApiReady: Boolean, isRemoved: Boolean): HCaptchaState = {
      val __obj = js.Dynamic.literal(captchaId = captchaId.asInstanceOf[js.Any], elementId = elementId.asInstanceOf[js.Any], isApiReady = isApiReady.asInstanceOf[js.Any], isRemoved = isRemoved.asInstanceOf[js.Any])
      __obj.asInstanceOf[HCaptchaState]
    }
    
    @scala.inline
    implicit class HCaptchaStateMutableBuilder[Self <: HCaptchaState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCaptchaId(value: String): Self = StObject.set(x, "captchaId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setElementId(value: String): Self = StObject.set(x, "elementId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsApiReady(value: Boolean): Self = StObject.set(x, "isApiReady", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsRemoved(value: Boolean): Self = StObject.set(x, "isRemoved", value.asInstanceOf[js.Any])
    }
  }
}
