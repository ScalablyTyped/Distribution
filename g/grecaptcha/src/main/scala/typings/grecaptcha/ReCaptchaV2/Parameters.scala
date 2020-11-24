package typings.grecaptcha.ReCaptchaV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Parameters extends js.Object {
  
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
  implicit class ParametersOps[Self <: Parameters] (val x: Self) extends AnyVal {
    
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
    def setBadge(value: Badge): Self = this.set("badge", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBadge: Self = this.set("badge", js.undefined)
    
    @scala.inline
    def setCallback(value: /* response */ String => Unit): Self = this.set("callback", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteCallback: Self = this.set("callback", js.undefined)
    
    @scala.inline
    def `setError-callback`(value: () => Unit): Self = this.set("error-callback", js.Any.fromFunction0(value))
    
    @scala.inline
    def `deleteError-callback`: Self = this.set("error-callback", js.undefined)
    
    @scala.inline
    def `setExpired-callback`(value: () => Unit): Self = this.set("expired-callback", js.Any.fromFunction0(value))
    
    @scala.inline
    def `deleteExpired-callback`: Self = this.set("expired-callback", js.undefined)
    
    @scala.inline
    def setIsolated(value: Boolean): Self = this.set("isolated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsolated: Self = this.set("isolated", js.undefined)
    
    @scala.inline
    def setSitekey(value: String): Self = this.set("sitekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSitekey: Self = this.set("sitekey", js.undefined)
    
    @scala.inline
    def setSize(value: Size): Self = this.set("size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
    
    @scala.inline
    def setTabindex(value: Double): Self = this.set("tabindex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTabindex: Self = this.set("tabindex", js.undefined)
    
    @scala.inline
    def setTheme(value: Theme): Self = this.set("theme", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTheme: Self = this.set("theme", js.undefined)
    
    @scala.inline
    def setType(value: Type): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
}
