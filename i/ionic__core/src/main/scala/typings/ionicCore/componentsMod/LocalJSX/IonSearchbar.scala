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
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IonSearchbar extends js.Object {
  
  /**
    * If `true`, enable searchbar animation.
    */
  var animated: js.UndefOr[Boolean] = js.native
  
  /**
    * Set the input's autocomplete property.
    */
  var autocomplete: js.UndefOr[AutocompleteTypes] = js.native
  
  /**
    * Set the input's autocorrect property.
    */
  var autocorrect: js.UndefOr[on | off] = js.native
  
  /**
    * Set the cancel button icon. Only applies to `md` mode. Defaults to `"arrow-back-sharp"`.
    */
  var cancelButtonIcon: js.UndefOr[String] = js.native
  
  /**
    * Set the the cancel button text. Only applies to `ios` mode.
    */
  var cancelButtonText: js.UndefOr[String] = js.native
  
  /**
    * Set the clear icon. Defaults to `"close-circle"` for `ios` and `"close-sharp"` for `md`.
    */
  var clearIcon: js.UndefOr[String] = js.native
  
  /**
    * The color to use from your application's color palette. Default options are: `"primary"`, `"secondary"`, `"tertiary"`, `"success"`, `"warning"`, `"danger"`, `"light"`, `"medium"`, and `"dark"`. For more information on colors, see [theming](/docs/theming/basics).
    */
  var color: js.UndefOr[Color] = js.native
  
  /**
    * Set the amount of time, in milliseconds, to wait to trigger the `ionChange` event after each keystroke. This also impacts form bindings such as `ngModel` or `v-model`.
    */
  var debounce: js.UndefOr[Double] = js.native
  
  /**
    * If `true`, the user cannot interact with the input.
    */
  var disabled: js.UndefOr[Boolean] = js.native
  
  /**
    * A hint to the browser for which enter key to display. Possible values: `"enter"`, `"done"`, `"go"`, `"next"`, `"previous"`, `"search"`, and `"send"`.
    */
  var enterkeyhint: js.UndefOr[enter | done | go | next | previous | search | send] = js.native
  
  /**
    * A hint to the browser for which keyboard to display. Possible values: `"none"`, `"text"`, `"tel"`, `"url"`, `"email"`, `"numeric"`, `"decimal"`, and `"search"`.
    */
  var inputmode: js.UndefOr[none | text | tel | url | email | numeric | decimal | search] = js.native
  
  /**
    * The mode determines which platform styles to use.
    */
  var mode: js.UndefOr[ios | md] = js.native
  
  /**
    * Emitted when the input loses focus.
    */
  var onIonBlur: js.UndefOr[js.Function1[/* event */ CustomEvent[Unit], Unit]] = js.native
  
  /**
    * Emitted when the cancel button is clicked.
    */
  var onIonCancel: js.UndefOr[js.Function1[/* event */ CustomEvent[Unit], Unit]] = js.native
  
  /**
    * Emitted when the value has changed.
    */
  var onIonChange: js.UndefOr[js.Function1[/* event */ CustomEvent[SearchbarChangeEventDetail], Unit]] = js.native
  
  /**
    * Emitted when the clear input button is clicked.
    */
  var onIonClear: js.UndefOr[js.Function1[/* event */ CustomEvent[Unit], Unit]] = js.native
  
  /**
    * Emitted when the input has focus.
    */
  var onIonFocus: js.UndefOr[js.Function1[/* event */ CustomEvent[Unit], Unit]] = js.native
  
  /**
    * Emitted when a keyboard input occurred.
    */
  var onIonInput: js.UndefOr[js.Function1[/* event */ CustomEvent[KeyboardEvent], Unit]] = js.native
  
  /**
    * Set the input's placeholder. `placeholder` can accept either plaintext or HTML as a string. To display characters normally reserved for HTML, they must be escaped. For example `<Ionic>` would become `&lt;Ionic&gt;`  For more information: [Security Documentation](https://ionicframework.com/docs/faq/security)
    */
  var placeholder: js.UndefOr[String] = js.native
  
  /**
    * The icon to use as the search icon. Defaults to `"search-outline"` in `ios` mode and `"search-sharp"` in `md` mode.
    */
  var searchIcon: js.UndefOr[String] = js.native
  
  /**
    * Sets the behavior for the cancel button. Defaults to `"never"`. Setting to `"focus"` shows the cancel button on focus. Setting to `"never"` hides the cancel button. Setting to `"always"` shows the cancel button regardless of focus state.
    */
  var showCancelButton: js.UndefOr[never | focus | always] = js.native
  
  /**
    * If `true`, enable spellcheck on the input.
    */
  var spellcheck: js.UndefOr[Boolean] = js.native
  
  /**
    * Set the type of the input.
    */
  var `type`: js.UndefOr[text | password | email | number | search | tel | url] = js.native
  
  /**
    * the value of the searchbar.
    */
  var value: js.UndefOr[String | Null] = js.native
}
object IonSearchbar {
  
  @scala.inline
  def apply(): IonSearchbar = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IonSearchbar]
  }
  
  @scala.inline
  implicit class IonSearchbarOps[Self <: IonSearchbar] (val x: Self) extends AnyVal {
    
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
    def setAnimated(value: Boolean): Self = this.set("animated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnimated: Self = this.set("animated", js.undefined)
    
    @scala.inline
    def setAutocomplete(value: AutocompleteTypes): Self = this.set("autocomplete", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutocomplete: Self = this.set("autocomplete", js.undefined)
    
    @scala.inline
    def setAutocorrect(value: on | off): Self = this.set("autocorrect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutocorrect: Self = this.set("autocorrect", js.undefined)
    
    @scala.inline
    def setCancelButtonIcon(value: String): Self = this.set("cancelButtonIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCancelButtonIcon: Self = this.set("cancelButtonIcon", js.undefined)
    
    @scala.inline
    def setCancelButtonText(value: String): Self = this.set("cancelButtonText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCancelButtonText: Self = this.set("cancelButtonText", js.undefined)
    
    @scala.inline
    def setClearIcon(value: String): Self = this.set("clearIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClearIcon: Self = this.set("clearIcon", js.undefined)
    
    @scala.inline
    def setColor(value: Color): Self = this.set("color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColor: Self = this.set("color", js.undefined)
    
    @scala.inline
    def setDebounce(value: Double): Self = this.set("debounce", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDebounce: Self = this.set("debounce", js.undefined)
    
    @scala.inline
    def setDisabled(value: Boolean): Self = this.set("disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisabled: Self = this.set("disabled", js.undefined)
    
    @scala.inline
    def setEnterkeyhint(value: enter | done | go | next | previous | search | send): Self = this.set("enterkeyhint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnterkeyhint: Self = this.set("enterkeyhint", js.undefined)
    
    @scala.inline
    def setInputmode(value: none | text | tel | url | email | numeric | decimal | search): Self = this.set("inputmode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInputmode: Self = this.set("inputmode", js.undefined)
    
    @scala.inline
    def setMode(value: ios | md): Self = this.set("mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMode: Self = this.set("mode", js.undefined)
    
    @scala.inline
    def setOnIonBlur(value: /* event */ CustomEvent[Unit] => Unit): Self = this.set("onIonBlur", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnIonBlur: Self = this.set("onIonBlur", js.undefined)
    
    @scala.inline
    def setOnIonCancel(value: /* event */ CustomEvent[Unit] => Unit): Self = this.set("onIonCancel", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnIonCancel: Self = this.set("onIonCancel", js.undefined)
    
    @scala.inline
    def setOnIonChange(value: /* event */ CustomEvent[SearchbarChangeEventDetail] => Unit): Self = this.set("onIonChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnIonChange: Self = this.set("onIonChange", js.undefined)
    
    @scala.inline
    def setOnIonClear(value: /* event */ CustomEvent[Unit] => Unit): Self = this.set("onIonClear", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnIonClear: Self = this.set("onIonClear", js.undefined)
    
    @scala.inline
    def setOnIonFocus(value: /* event */ CustomEvent[Unit] => Unit): Self = this.set("onIonFocus", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnIonFocus: Self = this.set("onIonFocus", js.undefined)
    
    @scala.inline
    def setOnIonInput(value: /* event */ CustomEvent[KeyboardEvent] => Unit): Self = this.set("onIonInput", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnIonInput: Self = this.set("onIonInput", js.undefined)
    
    @scala.inline
    def setPlaceholder(value: String): Self = this.set("placeholder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePlaceholder: Self = this.set("placeholder", js.undefined)
    
    @scala.inline
    def setSearchIcon(value: String): Self = this.set("searchIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSearchIcon: Self = this.set("searchIcon", js.undefined)
    
    @scala.inline
    def setShowCancelButton(value: never | focus | always): Self = this.set("showCancelButton", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowCancelButton: Self = this.set("showCancelButton", js.undefined)
    
    @scala.inline
    def setSpellcheck(value: Boolean): Self = this.set("spellcheck", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSpellcheck: Self = this.set("spellcheck", js.undefined)
    
    @scala.inline
    def setType(value: text | password | email | number | search | tel | url): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    
    @scala.inline
    def setValue(value: String): Self = this.set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
    
    @scala.inline
    def setValueNull: Self = this.set("value", null)
  }
}
