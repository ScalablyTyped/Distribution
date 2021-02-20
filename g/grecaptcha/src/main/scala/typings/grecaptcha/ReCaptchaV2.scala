package typings.grecaptcha

import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ReCaptchaV2 {
  
  @js.native
  trait Action extends StObject {
    
    /**
      * the name of the action. Actions may only contain alphanumeric characters and slashes, and must not be user-specific.
      */
    var action: String = js.native
  }
  object Action {
    
    @scala.inline
    def apply(action: String): Action = {
      val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any])
      __obj.asInstanceOf[Action]
    }
    
    @scala.inline
    implicit class ActionMutableBuilder[Self <: Action] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAction(value: String): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.grecaptcha.grecaptchaStrings.bottomright
    - typings.grecaptcha.grecaptchaStrings.bottomleft
    - typings.grecaptcha.grecaptchaStrings.`inline`
  */
  trait Badge extends StObject
  object Badge {
    
    @scala.inline
    def bottomleft: typings.grecaptcha.grecaptchaStrings.bottomleft = "bottomleft".asInstanceOf[typings.grecaptcha.grecaptchaStrings.bottomleft]
    
    @scala.inline
    def bottomright: typings.grecaptcha.grecaptchaStrings.bottomright = "bottomright".asInstanceOf[typings.grecaptcha.grecaptchaStrings.bottomright]
    
    @scala.inline
    def `inline`: typings.grecaptcha.grecaptchaStrings.`inline` = "inline".asInstanceOf[typings.grecaptcha.grecaptchaStrings.`inline`]
  }
  
  @js.native
  trait Parameters extends StObject {
    
    /**
      * Optional. The badge location for g-recaptcha with size of "invisible".
      *
      * @default "bottomright"
      */
    var badge: js.UndefOr[Badge] = js.native
    
    /**
      * Optional. Your callback function that's executed when the user submits a successful CAPTCHA response.
      * The user's response, g-recaptcha-response, will be the input for your callback function.
      */
    var callback: js.UndefOr[js.Function1[/* response */ String, Unit]] = js.native
    
    /**
      * Optional. Your callback function that's executed when reCAPTCHA encounters an error (usually network connectivity) and cannot continue until connectivity is restored.
      * If you specify this function, you are responsible for informing the user that they should retry.
      */
    // Notice to the reader
    // I need to surround this object with quotes, this will however break intellisense in VS 2013.
    var `error-callback`: js.UndefOr[js.Function0[Unit]] = js.native
    
    /**
      * Optional. Your callback function that's executed when the reCAPTCHA response expires and the user needs to solve a new CAPTCHA.
      */
    // Notice to the reader
    // I need to surround this object with quotes, this will however break intellisense in VS 2013.
    var `expired-callback`: js.UndefOr[js.Function0[Unit]] = js.native
    
    /**
      * Optional. Invisible reCAPTCHA only. For plugin owners to not interfere with existing reCAPTCHA installations on a page.
      * If true, this reCAPTCHA instance will be part of a separate ID space.
      *
      * @default false
      */
    var isolated: js.UndefOr[Boolean] = js.native
    
    /**
      * Your sitekey.
      */
    var sitekey: js.UndefOr[String] = js.native
    
    /**
      * Optional. The size of the widget.
      * Accepted values: "compact", "normal", "invisible".
      * @default "compact"
      */
    var size: js.UndefOr[Size] = js.native
    
    /**
      * Optional. The tabindex of the widget and challenge.
      * If other elements in your page use tabindex, it should be set to make user navigation easier.
      */
    var tabindex: js.UndefOr[Double] = js.native
    
    /**
      * Optional. The color theme of the widget.
      * Accepted values: "light", "dark"
      * @default "light"
      */
    var theme: js.UndefOr[Theme] = js.native
    
    /**
      * Optional. The type of CAPTCHA to serve.
      * Accepted values: "audio", "image"
      * @default "image"
      */
    var `type`: js.UndefOr[Type] = js.native
  }
  object Parameters {
    
    @scala.inline
    def apply(): Parameters = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Parameters]
    }
    
    @scala.inline
    implicit class ParametersMutableBuilder[Self <: Parameters] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBadge(value: Badge): Self = StObject.set(x, "badge", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBadgeUndefined: Self = StObject.set(x, "badge", js.undefined)
      
      @scala.inline
      def setCallback(value: /* response */ String => Unit): Self = StObject.set(x, "callback", js.Any.fromFunction1(value))
      
      @scala.inline
      def setCallbackUndefined: Self = StObject.set(x, "callback", js.undefined)
      
      @scala.inline
      def `setError-callback`(value: () => Unit): Self = StObject.set(x, "error-callback", js.Any.fromFunction0(value))
      
      @scala.inline
      def `setError-callbackUndefined`: Self = StObject.set(x, "error-callback", js.undefined)
      
      @scala.inline
      def `setExpired-callback`(value: () => Unit): Self = StObject.set(x, "expired-callback", js.Any.fromFunction0(value))
      
      @scala.inline
      def `setExpired-callbackUndefined`: Self = StObject.set(x, "expired-callback", js.undefined)
      
      @scala.inline
      def setIsolated(value: Boolean): Self = StObject.set(x, "isolated", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsolatedUndefined: Self = StObject.set(x, "isolated", js.undefined)
      
      @scala.inline
      def setSitekey(value: String): Self = StObject.set(x, "sitekey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSitekeyUndefined: Self = StObject.set(x, "sitekey", js.undefined)
      
      @scala.inline
      def setSize(value: Size): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      @scala.inline
      def setTabindex(value: Double): Self = StObject.set(x, "tabindex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTabindexUndefined: Self = StObject.set(x, "tabindex", js.undefined)
      
      @scala.inline
      def setTheme(value: Theme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
      
      @scala.inline
      def setType(value: Type): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  @js.native
  trait ReCaptcha extends StObject {
    
    /**
      * Programatically invoke the reCAPTCHA check. Used if the invisible reCAPTCHA is on a div instead of a button.
      * @param opt_widget_id Optional widget ID, defaults to the first widget created if unspecified.
      */
    def execute(): Unit = js.native
    def execute(opt_widget_id: Double): Unit = js.native
    /**
      * Programatically invoke the reCAPTCHA check. Used if the invisible reCAPTCHA is on a div instead of a button.
      * @param siteKey the key of your site
      * @param action the action
      *
      * @return a promise-like object containing the token
      */
    def execute(siteKey: String, action: Action): js.Thenable[String] = js.native
    
    /**
      * Gets the response for the reCAPTCHA widget.
      * @param opt_widget_id Optional widget ID, defaults to the first widget created if unspecified.
      * @return the response of the reCAPTCHA widget.
      */
    def getResponse(): String = js.native
    def getResponse(opt_widget_id: Double): String = js.native
    
    /**
      * will run the given function as soon as the reCAPTCHA library has loaded
      * @param callback the function to coll
      */
    def ready(callback: js.Function0[Unit]): Unit = js.native
    
    /**
      * Renders the container as a reCAPTCHA widget and returns the ID of the newly created widget.
      * @param container The HTML element to render the reCAPTCHA widget. Specify either the ID of the container (string) or the DOM element itself.
      * @param parameters An object containing parameters as key=value pairs, for example, {"sitekey": "your_site_key", "theme": "light"}. See @see render parameters.
      * @param inherit Invisible reCAPTCHA only. Use existing data-* attributes on the element if the corresponding parameter is not specified.
      * The values in parameters will take precedence over the attributes.
      * @return the ID of the newly created widget.
      */
    def render(container: String): Double = js.native
    def render(container: String, parameters: js.UndefOr[scala.Nothing], inherit: Boolean): Double = js.native
    def render(container: String, parameters: Parameters): Double = js.native
    def render(container: String, parameters: Parameters, inherit: Boolean): Double = js.native
    def render(container: HTMLElement): Double = js.native
    def render(container: HTMLElement, parameters: js.UndefOr[scala.Nothing], inherit: Boolean): Double = js.native
    def render(container: HTMLElement, parameters: Parameters): Double = js.native
    def render(container: HTMLElement, parameters: Parameters, inherit: Boolean): Double = js.native
    
    /**
      * Resets the reCAPTCHA widget.
      * @param opt_widget_id Optional widget ID, defaults to the first widget created if unspecified.
      */
    def reset(): Unit = js.native
    def reset(opt_widget_id: Double): Unit = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.grecaptcha.grecaptchaStrings.normal
    - typings.grecaptcha.grecaptchaStrings.compact
    - typings.grecaptcha.grecaptchaStrings.invisible
  */
  trait Size extends StObject
  object Size {
    
    @scala.inline
    def compact: typings.grecaptcha.grecaptchaStrings.compact = "compact".asInstanceOf[typings.grecaptcha.grecaptchaStrings.compact]
    
    @scala.inline
    def invisible: typings.grecaptcha.grecaptchaStrings.invisible = "invisible".asInstanceOf[typings.grecaptcha.grecaptchaStrings.invisible]
    
    @scala.inline
    def normal: typings.grecaptcha.grecaptchaStrings.normal = "normal".asInstanceOf[typings.grecaptcha.grecaptchaStrings.normal]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.grecaptcha.grecaptchaStrings.light
    - typings.grecaptcha.grecaptchaStrings.dark
  */
  trait Theme extends StObject
  object Theme {
    
    @scala.inline
    def dark: typings.grecaptcha.grecaptchaStrings.dark = "dark".asInstanceOf[typings.grecaptcha.grecaptchaStrings.dark]
    
    @scala.inline
    def light: typings.grecaptcha.grecaptchaStrings.light = "light".asInstanceOf[typings.grecaptcha.grecaptchaStrings.light]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.grecaptcha.grecaptchaStrings.image
    - typings.grecaptcha.grecaptchaStrings.audio
  */
  trait Type extends StObject
  object Type {
    
    @scala.inline
    def audio: typings.grecaptcha.grecaptchaStrings.audio = "audio".asInstanceOf[typings.grecaptcha.grecaptchaStrings.audio]
    
    @scala.inline
    def image: typings.grecaptcha.grecaptchaStrings.image = "image".asInstanceOf[typings.grecaptcha.grecaptchaStrings.image]
  }
}
