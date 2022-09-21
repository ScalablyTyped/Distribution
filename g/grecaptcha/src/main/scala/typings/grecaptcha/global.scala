package typings.grecaptcha

import typings.grecaptcha.ReCaptchaV2.Action
import typings.grecaptcha.ReCaptchaV2.Parameters
import typings.grecaptcha.ReCaptchaV2.ReCaptcha
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  /* Inlined grecaptcha.ReCaptchaV2.ReCaptcha & {  enterprise :grecaptcha.ReCaptchaV2.ReCaptcha} */
  object grecaptcha {
    
    @JSGlobal("grecaptcha")
    @js.native
    val ^ : js.Any = js.native
    
    @JSGlobal("grecaptcha.enterprise")
    @js.native
    def enterprise: ReCaptcha = js.native
    inline def enterprise_=(x: ReCaptcha): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("enterprise")(x.asInstanceOf[js.Any])
    
    /**
      * Programatically invoke the reCAPTCHA check. Used if the invisible reCAPTCHA is on a div instead of a button.
      * @param opt_widget_id Optional widget ID, defaults to the first widget created if unspecified.
      */
    inline def execute(): js.Thenable[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("execute")().asInstanceOf[js.Thenable[Unit]]
    inline def execute(opt_widget_id: Double): js.Thenable[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("execute")(opt_widget_id.asInstanceOf[js.Any]).asInstanceOf[js.Thenable[Unit]]
    /**
      * Programatically invoke the reCAPTCHA check. Used if the invisible reCAPTCHA is on a div instead of a button.
      * @param siteKey the key of your site
      * @param action the action
      *
      * @return a promise-like object containing the token
      */
    inline def execute(siteKey: String, action: Action): js.Thenable[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("execute")(siteKey.asInstanceOf[js.Any], action.asInstanceOf[js.Any])).asInstanceOf[js.Thenable[String]]
    
    /**
      * Gets the response for the reCAPTCHA widget.
      * @param opt_widget_id Optional widget ID, defaults to the first widget created if unspecified.
      * @return the response of the reCAPTCHA widget.
      */
    inline def getResponse(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getResponse")().asInstanceOf[String]
    inline def getResponse(opt_widget_id: Double): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getResponse")(opt_widget_id.asInstanceOf[js.Any]).asInstanceOf[String]
    
    /**
      * will run the given function as soon as the reCAPTCHA library has loaded
      * @param callback the function to coll
      */
    inline def ready(callback: js.Function0[Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("ready")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * Renders the container as a reCAPTCHA widget and returns the ID of the newly created widget.
      * @param container The HTML element to render the reCAPTCHA widget. Specify either the ID of the container (string) or the DOM element itself.
      * @param parameters An object containing parameters as key=value pairs, for example, {"sitekey": "your_site_key", "theme": "light"}. See @see render parameters.
      * @param inherit Invisible reCAPTCHA only. Use existing data-* attributes on the element if the corresponding parameter is not specified.
      * The values in parameters will take precedence over the attributes.
      * @return the ID of the newly created widget.
      */
    inline def render(container: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("render")(container.asInstanceOf[js.Any]).asInstanceOf[Double]
    inline def render(container: String, parameters: Unit, inherit: Boolean): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("render")(container.asInstanceOf[js.Any], parameters.asInstanceOf[js.Any], inherit.asInstanceOf[js.Any])).asInstanceOf[Double]
    inline def render(container: String, parameters: Parameters): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("render")(container.asInstanceOf[js.Any], parameters.asInstanceOf[js.Any])).asInstanceOf[Double]
    inline def render(container: String, parameters: Parameters, inherit: Boolean): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("render")(container.asInstanceOf[js.Any], parameters.asInstanceOf[js.Any], inherit.asInstanceOf[js.Any])).asInstanceOf[Double]
    inline def render(container: HTMLElement): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("render")(container.asInstanceOf[js.Any]).asInstanceOf[Double]
    inline def render(container: HTMLElement, parameters: Unit, inherit: Boolean): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("render")(container.asInstanceOf[js.Any], parameters.asInstanceOf[js.Any], inherit.asInstanceOf[js.Any])).asInstanceOf[Double]
    inline def render(container: HTMLElement, parameters: Parameters): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("render")(container.asInstanceOf[js.Any], parameters.asInstanceOf[js.Any])).asInstanceOf[Double]
    inline def render(container: HTMLElement, parameters: Parameters, inherit: Boolean): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("render")(container.asInstanceOf[js.Any], parameters.asInstanceOf[js.Any], inherit.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    /**
      * Resets the reCAPTCHA widget.
      * @param opt_widget_id Optional widget ID, defaults to the first widget created if unspecified.
      */
    inline def reset(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("reset")().asInstanceOf[Unit]
    inline def reset(opt_widget_id: Double): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("reset")(opt_widget_id.asInstanceOf[js.Any]).asInstanceOf[Unit]
  }
}
