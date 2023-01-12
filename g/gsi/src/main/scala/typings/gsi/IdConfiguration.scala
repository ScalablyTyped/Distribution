package typings.gsi

import typings.gsi.gsiStrings.popup
import typings.gsi.gsiStrings.redirect
import typings.gsi.gsiStrings.signin
import typings.gsi.gsiStrings.signup
import typings.gsi.gsiStrings.use
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IdConfiguration extends StObject {
  
  /** The origins that are allowed to embed the intermediate iframe. One Tap will run in the intermediate iframe mode if this field presents. */
  var allowed_parent_origin: js.UndefOr[String | js.Array[String]] = js.undefined
  
  /** Enables automatic selection. */
  var auto_select: js.UndefOr[Boolean] = js.undefined
  
  /** The JavaScript function that handles ID tokens. Google One Tap and the Sign In With Google button popup UX mode use this attribute. */
  var callback: js.UndefOr[js.Function1[/* token */ CredentialResponse, Unit]] = js.undefined
  
  /** Cancels the prompt if the user clicks outside the prompt. */
  var cancel_on_tap_outside: js.UndefOr[Boolean] = js.undefined
  
  /** Your application's client ID */
  var client_id: String
  
  /** The title and words in the One Tap prompt. */
  var context: js.UndefOr[signin | signup | use] = js.undefined
  
  /** Overrides the default intermediate iframe behavior when users manually close One Tap. */
  var intermediate_iframe_close_callback: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /** Enables upgraded One Tap UX on ITP browsers. */
  var itp_support: js.UndefOr[Boolean] = js.undefined
  
  /** The URL of your login endpoint. The Sign In With Google button redirect UX mode uses this attribute. */
  var login_uri: js.UndefOr[String] = js.undefined
  
  /** The JavaScript function that handles password credentials. */
  var native_callback: js.UndefOr[js.Function1[/* credential */ GsiCredential, Unit]] = js.undefined
  
  /** A random string for ID tokens. */
  var nonce: js.UndefOr[String] = js.undefined
  
  /** The DOM ID of the One Tap prompt container element. */
  var prompt_parent_id: js.UndefOr[String] = js.undefined
  
  /** If you need to call One Tap in the parent domain and its subdomains, pass the parent domain to this field so that a single shared cookie is used. */
  var state_cookie_domain: js.UndefOr[String] = js.undefined
  
  /** The Sign In With Google button UX flow. */
  var ux_mode: js.UndefOr[popup | redirect] = js.undefined
}
object IdConfiguration {
  
  inline def apply(client_id: String): IdConfiguration = {
    val __obj = js.Dynamic.literal(client_id = client_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[IdConfiguration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IdConfiguration] (val x: Self) extends AnyVal {
    
    inline def setAllowed_parent_origin(value: String | js.Array[String]): Self = StObject.set(x, "allowed_parent_origin", value.asInstanceOf[js.Any])
    
    inline def setAllowed_parent_originUndefined: Self = StObject.set(x, "allowed_parent_origin", js.undefined)
    
    inline def setAllowed_parent_originVarargs(value: String*): Self = StObject.set(x, "allowed_parent_origin", js.Array(value*))
    
    inline def setAuto_select(value: Boolean): Self = StObject.set(x, "auto_select", value.asInstanceOf[js.Any])
    
    inline def setAuto_selectUndefined: Self = StObject.set(x, "auto_select", js.undefined)
    
    inline def setCallback(value: /* token */ CredentialResponse => Unit): Self = StObject.set(x, "callback", js.Any.fromFunction1(value))
    
    inline def setCallbackUndefined: Self = StObject.set(x, "callback", js.undefined)
    
    inline def setCancel_on_tap_outside(value: Boolean): Self = StObject.set(x, "cancel_on_tap_outside", value.asInstanceOf[js.Any])
    
    inline def setCancel_on_tap_outsideUndefined: Self = StObject.set(x, "cancel_on_tap_outside", js.undefined)
    
    inline def setClient_id(value: String): Self = StObject.set(x, "client_id", value.asInstanceOf[js.Any])
    
    inline def setContext(value: signin | signup | use): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
    
    inline def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
    
    inline def setIntermediate_iframe_close_callback(value: () => Unit): Self = StObject.set(x, "intermediate_iframe_close_callback", js.Any.fromFunction0(value))
    
    inline def setIntermediate_iframe_close_callbackUndefined: Self = StObject.set(x, "intermediate_iframe_close_callback", js.undefined)
    
    inline def setItp_support(value: Boolean): Self = StObject.set(x, "itp_support", value.asInstanceOf[js.Any])
    
    inline def setItp_supportUndefined: Self = StObject.set(x, "itp_support", js.undefined)
    
    inline def setLogin_uri(value: String): Self = StObject.set(x, "login_uri", value.asInstanceOf[js.Any])
    
    inline def setLogin_uriUndefined: Self = StObject.set(x, "login_uri", js.undefined)
    
    inline def setNative_callback(value: /* credential */ GsiCredential => Unit): Self = StObject.set(x, "native_callback", js.Any.fromFunction1(value))
    
    inline def setNative_callbackUndefined: Self = StObject.set(x, "native_callback", js.undefined)
    
    inline def setNonce(value: String): Self = StObject.set(x, "nonce", value.asInstanceOf[js.Any])
    
    inline def setNonceUndefined: Self = StObject.set(x, "nonce", js.undefined)
    
    inline def setPrompt_parent_id(value: String): Self = StObject.set(x, "prompt_parent_id", value.asInstanceOf[js.Any])
    
    inline def setPrompt_parent_idUndefined: Self = StObject.set(x, "prompt_parent_id", js.undefined)
    
    inline def setState_cookie_domain(value: String): Self = StObject.set(x, "state_cookie_domain", value.asInstanceOf[js.Any])
    
    inline def setState_cookie_domainUndefined: Self = StObject.set(x, "state_cookie_domain", js.undefined)
    
    inline def setUx_mode(value: popup | redirect): Self = StObject.set(x, "ux_mode", value.asInstanceOf[js.Any])
    
    inline def setUx_modeUndefined: Self = StObject.set(x, "ux_mode", js.undefined)
  }
}
