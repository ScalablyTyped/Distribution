package typings.grecaptcha.ReCaptchaV2

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReCaptcha extends js.Object {
  
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
