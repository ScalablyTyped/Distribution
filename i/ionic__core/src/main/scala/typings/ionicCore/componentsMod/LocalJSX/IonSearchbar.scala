package typings.ionicCore.componentsMod.LocalJSX

import typings.ionicCore.ionicCoreStrings.always
import typings.ionicCore.ionicCoreStrings.decimal
import typings.ionicCore.ionicCoreStrings.done
import typings.ionicCore.ionicCoreStrings.email
import typings.ionicCore.ionicCoreStrings.enter
import typings.ionicCore.ionicCoreStrings.focus
import typings.ionicCore.ionicCoreStrings.go
import typings.ionicCore.ionicCoreStrings.ios
import typings.ionicCore.ionicCoreStrings.md
import typings.ionicCore.ionicCoreStrings.never
import typings.ionicCore.ionicCoreStrings.next
import typings.ionicCore.ionicCoreStrings.none
import typings.ionicCore.ionicCoreStrings.number
import typings.ionicCore.ionicCoreStrings.numeric
import typings.ionicCore.ionicCoreStrings.off
import typings.ionicCore.ionicCoreStrings.on
import typings.ionicCore.ionicCoreStrings.password
import typings.ionicCore.ionicCoreStrings.previous
import typings.ionicCore.ionicCoreStrings.search
import typings.ionicCore.ionicCoreStrings.send
import typings.ionicCore.ionicCoreStrings.tel
import typings.ionicCore.ionicCoreStrings.text
import typings.ionicCore.ionicCoreStrings.url
import typings.ionicCore.mod.AutocompleteTypes
import typings.ionicCore.mod.Color
import typings.ionicCore.searchbarInterfaceMod.SearchbarChangeEventDetail
import typings.std.CustomEvent
import typings.std.KeyboardEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IonSearchbar extends StObject {
  
  /**
    * If `true`, enable searchbar animation.
    */
  var animated: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Set the input's autocomplete property.
    */
  var autocomplete: js.UndefOr[AutocompleteTypes] = js.undefined
  
  /**
    * Set the input's autocorrect property.
    */
  var autocorrect: js.UndefOr[on | off] = js.undefined
  
  /**
    * Set the cancel button icon. Only applies to `md` mode. Defaults to `"arrow-back-sharp"`.
    */
  var cancelButtonIcon: js.UndefOr[String] = js.undefined
  
  /**
    * Set the the cancel button text. Only applies to `ios` mode.
    */
  var cancelButtonText: js.UndefOr[String] = js.undefined
  
  /**
    * Set the clear icon. Defaults to `"close-circle"` for `ios` and `"close-sharp"` for `md`.
    */
  var clearIcon: js.UndefOr[String] = js.undefined
  
  /**
    * The color to use from your application's color palette. Default options are: `"primary"`, `"secondary"`, `"tertiary"`, `"success"`, `"warning"`, `"danger"`, `"light"`, `"medium"`, and `"dark"`. For more information on colors, see [theming](/docs/theming/basics).
    */
  var color: js.UndefOr[Color] = js.undefined
  
  /**
    * Set the amount of time, in milliseconds, to wait to trigger the `ionChange` event after each keystroke. This also impacts form bindings such as `ngModel` or `v-model`.
    */
  var debounce: js.UndefOr[Double] = js.undefined
  
  /**
    * If `true`, the user cannot interact with the input.
    */
  var disabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * A hint to the browser for which enter key to display. Possible values: `"enter"`, `"done"`, `"go"`, `"next"`, `"previous"`, `"search"`, and `"send"`.
    */
  var enterkeyhint: js.UndefOr[enter | done | go | next | previous | search | send] = js.undefined
  
  /**
    * A hint to the browser for which keyboard to display. Possible values: `"none"`, `"text"`, `"tel"`, `"url"`, `"email"`, `"numeric"`, `"decimal"`, and `"search"`.
    */
  var inputmode: js.UndefOr[none | text | tel | url | email | numeric | decimal | search] = js.undefined
  
  /**
    * The mode determines which platform styles to use.
    */
  var mode: js.UndefOr[ios | md] = js.undefined
  
  /**
    * Emitted when the input loses focus.
    */
  var onIonBlur: js.UndefOr[js.Function1[/* event */ CustomEvent[Unit], Unit]] = js.undefined
  
  /**
    * Emitted when the cancel button is clicked.
    */
  var onIonCancel: js.UndefOr[js.Function1[/* event */ CustomEvent[Unit], Unit]] = js.undefined
  
  /**
    * Emitted when the value has changed.
    */
  var onIonChange: js.UndefOr[js.Function1[/* event */ CustomEvent[SearchbarChangeEventDetail], Unit]] = js.undefined
  
  /**
    * Emitted when the clear input button is clicked.
    */
  var onIonClear: js.UndefOr[js.Function1[/* event */ CustomEvent[Unit], Unit]] = js.undefined
  
  /**
    * Emitted when the input has focus.
    */
  var onIonFocus: js.UndefOr[js.Function1[/* event */ CustomEvent[Unit], Unit]] = js.undefined
  
  /**
    * Emitted when a keyboard input occurred.
    */
  var onIonInput: js.UndefOr[js.Function1[/* event */ CustomEvent[KeyboardEvent], Unit]] = js.undefined
  
  /**
    * Set the input's placeholder. `placeholder` can accept either plaintext or HTML as a string. To display characters normally reserved for HTML, they must be escaped. For example `<Ionic>` would become `&lt;Ionic&gt;`  For more information: [Security Documentation](https://ionicframework.com/docs/faq/security)
    */
  var placeholder: js.UndefOr[String] = js.undefined
  
  /**
    * The icon to use as the search icon. Defaults to `"search-outline"` in `ios` mode and `"search-sharp"` in `md` mode.
    */
  var searchIcon: js.UndefOr[String] = js.undefined
  
  /**
    * Sets the behavior for the cancel button. Defaults to `"never"`. Setting to `"focus"` shows the cancel button on focus. Setting to `"never"` hides the cancel button. Setting to `"always"` shows the cancel button regardless of focus state.
    */
  var showCancelButton: js.UndefOr[never | focus | always] = js.undefined
  
  /**
    * If `true`, enable spellcheck on the input.
    */
  var spellcheck: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Set the type of the input.
    */
  var `type`: js.UndefOr[text | password | email | number | search | tel | url] = js.undefined
  
  /**
    * the value of the searchbar.
    */
  var value: js.UndefOr[String | Null] = js.undefined
}
object IonSearchbar {
  
  inline def apply(): IonSearchbar = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IonSearchbar]
  }
  
  extension [Self <: IonSearchbar](x: Self) {
    
    inline def setAnimated(value: Boolean): Self = StObject.set(x, "animated", value.asInstanceOf[js.Any])
    
    inline def setAnimatedUndefined: Self = StObject.set(x, "animated", js.undefined)
    
    inline def setAutocomplete(value: AutocompleteTypes): Self = StObject.set(x, "autocomplete", value.asInstanceOf[js.Any])
    
    inline def setAutocompleteUndefined: Self = StObject.set(x, "autocomplete", js.undefined)
    
    inline def setAutocorrect(value: on | off): Self = StObject.set(x, "autocorrect", value.asInstanceOf[js.Any])
    
    inline def setAutocorrectUndefined: Self = StObject.set(x, "autocorrect", js.undefined)
    
    inline def setCancelButtonIcon(value: String): Self = StObject.set(x, "cancelButtonIcon", value.asInstanceOf[js.Any])
    
    inline def setCancelButtonIconUndefined: Self = StObject.set(x, "cancelButtonIcon", js.undefined)
    
    inline def setCancelButtonText(value: String): Self = StObject.set(x, "cancelButtonText", value.asInstanceOf[js.Any])
    
    inline def setCancelButtonTextUndefined: Self = StObject.set(x, "cancelButtonText", js.undefined)
    
    inline def setClearIcon(value: String): Self = StObject.set(x, "clearIcon", value.asInstanceOf[js.Any])
    
    inline def setClearIconUndefined: Self = StObject.set(x, "clearIcon", js.undefined)
    
    inline def setColor(value: Color): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setDebounce(value: Double): Self = StObject.set(x, "debounce", value.asInstanceOf[js.Any])
    
    inline def setDebounceUndefined: Self = StObject.set(x, "debounce", js.undefined)
    
    inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    inline def setEnterkeyhint(value: enter | done | go | next | previous | search | send): Self = StObject.set(x, "enterkeyhint", value.asInstanceOf[js.Any])
    
    inline def setEnterkeyhintUndefined: Self = StObject.set(x, "enterkeyhint", js.undefined)
    
    inline def setInputmode(value: none | text | tel | url | email | numeric | decimal | search): Self = StObject.set(x, "inputmode", value.asInstanceOf[js.Any])
    
    inline def setInputmodeUndefined: Self = StObject.set(x, "inputmode", js.undefined)
    
    inline def setMode(value: ios | md): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
    
    inline def setOnIonBlur(value: /* event */ CustomEvent[Unit] => Unit): Self = StObject.set(x, "onIonBlur", js.Any.fromFunction1(value))
    
    inline def setOnIonBlurUndefined: Self = StObject.set(x, "onIonBlur", js.undefined)
    
    inline def setOnIonCancel(value: /* event */ CustomEvent[Unit] => Unit): Self = StObject.set(x, "onIonCancel", js.Any.fromFunction1(value))
    
    inline def setOnIonCancelUndefined: Self = StObject.set(x, "onIonCancel", js.undefined)
    
    inline def setOnIonChange(value: /* event */ CustomEvent[SearchbarChangeEventDetail] => Unit): Self = StObject.set(x, "onIonChange", js.Any.fromFunction1(value))
    
    inline def setOnIonChangeUndefined: Self = StObject.set(x, "onIonChange", js.undefined)
    
    inline def setOnIonClear(value: /* event */ CustomEvent[Unit] => Unit): Self = StObject.set(x, "onIonClear", js.Any.fromFunction1(value))
    
    inline def setOnIonClearUndefined: Self = StObject.set(x, "onIonClear", js.undefined)
    
    inline def setOnIonFocus(value: /* event */ CustomEvent[Unit] => Unit): Self = StObject.set(x, "onIonFocus", js.Any.fromFunction1(value))
    
    inline def setOnIonFocusUndefined: Self = StObject.set(x, "onIonFocus", js.undefined)
    
    inline def setOnIonInput(value: /* event */ CustomEvent[KeyboardEvent] => Unit): Self = StObject.set(x, "onIonInput", js.Any.fromFunction1(value))
    
    inline def setOnIonInputUndefined: Self = StObject.set(x, "onIonInput", js.undefined)
    
    inline def setPlaceholder(value: String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
    
    inline def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
    
    inline def setSearchIcon(value: String): Self = StObject.set(x, "searchIcon", value.asInstanceOf[js.Any])
    
    inline def setSearchIconUndefined: Self = StObject.set(x, "searchIcon", js.undefined)
    
    inline def setShowCancelButton(value: never | focus | always): Self = StObject.set(x, "showCancelButton", value.asInstanceOf[js.Any])
    
    inline def setShowCancelButtonUndefined: Self = StObject.set(x, "showCancelButton", js.undefined)
    
    inline def setSpellcheck(value: Boolean): Self = StObject.set(x, "spellcheck", value.asInstanceOf[js.Any])
    
    inline def setSpellcheckUndefined: Self = StObject.set(x, "spellcheck", js.undefined)
    
    inline def setType(value: text | password | email | number | search | tel | url): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueNull: Self = StObject.set(x, "value", null)
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
