package typings.hcaptchaVueHcaptcha

import org.scalablytyped.runtime.Shortcut
import typings.std.Error
import typings.vue.vueMod.Vue
import typings.vue.vueMod.VueConstructor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("@hcaptcha/vue-hcaptcha", JSImport.Default)
  @js.native
  val default: HCaptcha = js.native
  
  @JSImport("@hcaptcha/vue-hcaptcha", "h")
  @js.native
  val h: HCaptcha = js.native
  
  @js.native
  trait HCaptcha
    extends StObject
       with VueConstructor[Vue] {
    
    var data: js.Any = js.native
    
    var methods: HCaptchaMethods = js.native
    
    var props: HCaptchaProps = js.native
  }
  
  trait HCaptchaMethods extends StObject {
    
    def execute(): Unit
    
    def onError(e: Error): Unit
    
    def onExpired(): Unit
    
    def onVerify(response: String): Unit
    
    def onloadScript(): Unit
    
    def reset(): Unit
  }
  object HCaptchaMethods {
    
    @scala.inline
    def apply(
      execute: () => Unit,
      onError: Error => Unit,
      onExpired: () => Unit,
      onVerify: String => Unit,
      onloadScript: () => Unit,
      reset: () => Unit
    ): HCaptchaMethods = {
      val __obj = js.Dynamic.literal(execute = js.Any.fromFunction0(execute), onError = js.Any.fromFunction1(onError), onExpired = js.Any.fromFunction0(onExpired), onVerify = js.Any.fromFunction1(onVerify), onloadScript = js.Any.fromFunction0(onloadScript), reset = js.Any.fromFunction0(reset))
      __obj.asInstanceOf[HCaptchaMethods]
    }
    
    @scala.inline
    implicit class HCaptchaMethodsMutableBuilder[Self <: HCaptchaMethods] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setExecute(value: () => Unit): Self = StObject.set(x, "execute", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnError(value: Error => Unit): Self = StObject.set(x, "onError", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnExpired(value: () => Unit): Self = StObject.set(x, "onExpired", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnVerify(value: String => Unit): Self = StObject.set(x, "onVerify", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnloadScript(value: () => Unit): Self = StObject.set(x, "onloadScript", js.Any.fromFunction0(value))
      
      @scala.inline
      def setReset(value: () => Unit): Self = StObject.set(x, "reset", js.Any.fromFunction0(value))
    }
  }
  
  trait HCaptchaProps extends StObject {
    
    var sitekey: String
    
    var size: js.UndefOr[String] = js.undefined
    
    var tabindex: js.UndefOr[String] = js.undefined
    
    var theme: js.UndefOr[String] = js.undefined
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
      def setSitekey(value: String): Self = StObject.set(x, "sitekey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      @scala.inline
      def setTabindex(value: String): Self = StObject.set(x, "tabindex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTabindexUndefined: Self = StObject.set(x, "tabindex", js.undefined)
      
      @scala.inline
      def setTheme(value: String): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
    }
  }
  
  type _To = HCaptcha
  
  /* This means you don't have to write `default`, but can instead just say `mod.foo` */
  override def _to: HCaptcha = default
}
