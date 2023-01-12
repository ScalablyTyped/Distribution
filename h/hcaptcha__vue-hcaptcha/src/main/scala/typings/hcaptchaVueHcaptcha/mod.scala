package typings.hcaptchaVueHcaptcha

import org.scalablytyped.runtime.Shortcut
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
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify VueConstructor * / any */ trait HCaptcha extends StObject {
    
    var data: Any
    
    var methods: HCaptchaMethods
    
    var props: HCaptchaProps
  }
  object HCaptcha {
    
    inline def apply(data: Any, methods: HCaptchaMethods, props: HCaptchaProps): HCaptcha = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], methods = methods.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any])
      __obj.asInstanceOf[HCaptcha]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: HCaptcha] (val x: Self) extends AnyVal {
      
      inline def setData(value: Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setMethods(value: HCaptchaMethods): Self = StObject.set(x, "methods", value.asInstanceOf[js.Any])
      
      inline def setProps(value: HCaptchaProps): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
    }
  }
  
  trait HCaptchaMethods extends StObject {
    
    def execute(): Unit
    
    def onError(e: js.Error): Unit
    
    def onExpired(): Unit
    
    def onVerify(response: String): Unit
    
    def onloadScript(): Unit
    
    def reset(): Unit
  }
  object HCaptchaMethods {
    
    inline def apply(
      execute: () => Unit,
      onError: js.Error => Unit,
      onExpired: () => Unit,
      onVerify: String => Unit,
      onloadScript: () => Unit,
      reset: () => Unit
    ): HCaptchaMethods = {
      val __obj = js.Dynamic.literal(execute = js.Any.fromFunction0(execute), onError = js.Any.fromFunction1(onError), onExpired = js.Any.fromFunction0(onExpired), onVerify = js.Any.fromFunction1(onVerify), onloadScript = js.Any.fromFunction0(onloadScript), reset = js.Any.fromFunction0(reset))
      __obj.asInstanceOf[HCaptchaMethods]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: HCaptchaMethods] (val x: Self) extends AnyVal {
      
      inline def setExecute(value: () => Unit): Self = StObject.set(x, "execute", js.Any.fromFunction0(value))
      
      inline def setOnError(value: js.Error => Unit): Self = StObject.set(x, "onError", js.Any.fromFunction1(value))
      
      inline def setOnExpired(value: () => Unit): Self = StObject.set(x, "onExpired", js.Any.fromFunction0(value))
      
      inline def setOnVerify(value: String => Unit): Self = StObject.set(x, "onVerify", js.Any.fromFunction1(value))
      
      inline def setOnloadScript(value: () => Unit): Self = StObject.set(x, "onloadScript", js.Any.fromFunction0(value))
      
      inline def setReset(value: () => Unit): Self = StObject.set(x, "reset", js.Any.fromFunction0(value))
    }
  }
  
  trait HCaptchaProps extends StObject {
    
    var sitekey: String
    
    var size: js.UndefOr[String] = js.undefined
    
    var tabindex: js.UndefOr[String] = js.undefined
    
    var theme: js.UndefOr[String] = js.undefined
  }
  object HCaptchaProps {
    
    inline def apply(sitekey: String): HCaptchaProps = {
      val __obj = js.Dynamic.literal(sitekey = sitekey.asInstanceOf[js.Any])
      __obj.asInstanceOf[HCaptchaProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: HCaptchaProps] (val x: Self) extends AnyVal {
      
      inline def setSitekey(value: String): Self = StObject.set(x, "sitekey", value.asInstanceOf[js.Any])
      
      inline def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      inline def setTabindex(value: String): Self = StObject.set(x, "tabindex", value.asInstanceOf[js.Any])
      
      inline def setTabindexUndefined: Self = StObject.set(x, "tabindex", js.undefined)
      
      inline def setTheme(value: String): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
    }
  }
  
  type _To = HCaptcha
  
  /* This means you don't have to write `default`, but can instead just say `mod.foo` */
  override def _to: HCaptcha = default
}
