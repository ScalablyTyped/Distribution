package typings.googlepay.google.payments.api

import typings.std.Event
import typings.std.HTMLDocument
import typings.std.ShadowRoot
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This object allows you to configure a Google Pay payment button. For
  * more information about button types, colors, and display requirements,
  * see Google's [Brand
  * guidelines](https://developers.google.com/pay/api/web/guides/brand-guidelines).
  */
trait ButtonOptions extends StObject {
  
  /**
    * List of allowed payment methods.
    *
    * This is an optional field for filtering card info for dynamic
    * buttons. No filtering will happen if this field is not set.
    */
  var allowedPaymentMethods: js.UndefOr[js.Array[IsReadyToPayPaymentMethodSpecification]] = js.undefined
  
  /**
    * Specifies the button color of the Google Pay button.
    *
    * @default "default"
    */
  var buttonColor: js.UndefOr[ButtonColor] = js.undefined
  
  /**
    * The [ISO
    * 639-1](https://en.wikipedia.org/wiki/List_of_ISO_639-1_codes) code
    * representing the desired button language.
    *
    * Supported locales include `en`, `ar`, `bg`, `ca`, `cs`, `da`, `de`,
    * `el`, `es`, `et`, `fi`, `fr`, `hr`, `id`, `it`, `ja`, `ko`, `ms`,
    * `nl`, `no`, `pl`, `pt`, `ru`, `sk`, `sl`, `sr`, `sv`, `th`, `tr`,
    * `uk`, and `zh`.
    *
    * @default browser or operating system language
    */
  var buttonLocale: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies how to append Google Pay resources, such as `<style>` tags,
    * in the DOM. Its default value is document.
    *
    * Use this property to integrate Google Pay with Web Components and the
    * shadow DOM. Set its value to the result of
    * [`container.getRootNode()`](https://developer.mozilla.org/en-US/docs/Web/API/Node/getRootNode).
    *
    * @default document
    */
  var buttonRootNode: js.UndefOr[HTMLDocument | ShadowRoot] = js.undefined
  
  /**
    * Determines how the button's size should change relative to the
    * button's parent element.
    *
    * @default "static"
    */
  var buttonSizeMode: js.UndefOr[ButtonSizeMode] = js.undefined
  
  /**
    * Specifies the text to be displayed within the Google Pay button.
    *
    * @default "buy"
    */
  var buttonType: js.UndefOr[ButtonType] = js.undefined
  
  /**
    * An [event listener
    * callback](https://developer.mozilla.org/en-US/docs/Web/API/EventTarget/addEventListener#The_event_listener_callback)
    * to call when a click event is delivered to the `<button>` target.
    */
  def onClick(event: Event): Unit
}
object ButtonOptions {
  
  inline def apply(onClick: Event => Unit): ButtonOptions = {
    val __obj = js.Dynamic.literal(onClick = js.Any.fromFunction1(onClick))
    __obj.asInstanceOf[ButtonOptions]
  }
  
  extension [Self <: ButtonOptions](x: Self) {
    
    inline def setAllowedPaymentMethods(value: js.Array[IsReadyToPayPaymentMethodSpecification]): Self = StObject.set(x, "allowedPaymentMethods", value.asInstanceOf[js.Any])
    
    inline def setAllowedPaymentMethodsUndefined: Self = StObject.set(x, "allowedPaymentMethods", js.undefined)
    
    inline def setAllowedPaymentMethodsVarargs(value: IsReadyToPayPaymentMethodSpecification*): Self = StObject.set(x, "allowedPaymentMethods", js.Array(value*))
    
    inline def setButtonColor(value: ButtonColor): Self = StObject.set(x, "buttonColor", value.asInstanceOf[js.Any])
    
    inline def setButtonColorUndefined: Self = StObject.set(x, "buttonColor", js.undefined)
    
    inline def setButtonLocale(value: String): Self = StObject.set(x, "buttonLocale", value.asInstanceOf[js.Any])
    
    inline def setButtonLocaleUndefined: Self = StObject.set(x, "buttonLocale", js.undefined)
    
    inline def setButtonRootNode(value: HTMLDocument | ShadowRoot): Self = StObject.set(x, "buttonRootNode", value.asInstanceOf[js.Any])
    
    inline def setButtonRootNodeUndefined: Self = StObject.set(x, "buttonRootNode", js.undefined)
    
    inline def setButtonSizeMode(value: ButtonSizeMode): Self = StObject.set(x, "buttonSizeMode", value.asInstanceOf[js.Any])
    
    inline def setButtonSizeModeUndefined: Self = StObject.set(x, "buttonSizeMode", js.undefined)
    
    inline def setButtonType(value: ButtonType): Self = StObject.set(x, "buttonType", value.asInstanceOf[js.Any])
    
    inline def setButtonTypeUndefined: Self = StObject.set(x, "buttonType", js.undefined)
    
    inline def setOnClick(value: Event => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
  }
}
