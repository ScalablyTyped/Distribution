package typings.ionicCore.componentsMod._Global_

import org.scalablytyped.runtime.Instantiable0
import typings.ionicCore.ionicCoreStrings.always
import typings.ionicCore.ionicCoreStrings.decimal
import typings.ionicCore.ionicCoreStrings.email
import typings.ionicCore.ionicCoreStrings.focus
import typings.ionicCore.ionicCoreStrings.ios
import typings.ionicCore.ionicCoreStrings.md
import typings.ionicCore.ionicCoreStrings.never
import typings.ionicCore.ionicCoreStrings.none
import typings.ionicCore.ionicCoreStrings.number
import typings.ionicCore.ionicCoreStrings.numeric
import typings.ionicCore.ionicCoreStrings.off
import typings.ionicCore.ionicCoreStrings.on
import typings.ionicCore.ionicCoreStrings.password
import typings.ionicCore.ionicCoreStrings.search
import typings.ionicCore.ionicCoreStrings.tel
import typings.ionicCore.ionicCoreStrings.text
import typings.ionicCore.ionicCoreStrings.url
import typings.ionicCore.mod.Color
import typings.ionicCore.stencilPublicRuntimeMod.HTMLStencilElement
import typings.std.HTMLInputElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.ionicCore.componentsMod.Components.IonSearchbar because var conflicts: spellcheck. Inlined animated, autocomplete, autocorrect, cancelButtonIcon, cancelButtonText, clearIcon, color, debounce, disabled, getInputElement, inputmode, mode, placeholder, searchIcon, setFocus, showCancelButton, `type`, value */ @js.native
trait HTMLIonSearchbarElement extends HTMLStencilElement {
  /**
    * If `true`, enable searchbar animation.
    */
  var animated: Boolean = js.native
  /**
    * Set the input's autocomplete property.
    */
  var autocomplete: on | off = js.native
  /**
    * Set the input's autocorrect property.
    */
  var autocorrect: on | off = js.native
  /**
    * Set the cancel button icon. Only applies to `md` mode. Defaults to `"arrow-back-sharp"`.
    */
  var cancelButtonIcon: String = js.native
  /**
    * Set the the cancel button text. Only applies to `ios` mode.
    */
  var cancelButtonText: String = js.native
  /**
    * Set the clear icon. Defaults to `"close-circle"` for `ios` and `"close-sharp"` for `md`.
    */
  var clearIcon: js.UndefOr[String] = js.native
  /**
    * The color to use from your application's color palette. Default options are: `"primary"`, `"secondary"`, `"tertiary"`, `"success"`, `"warning"`, `"danger"`, `"light"`, `"medium"`, and `"dark"`. For more information on colors, see [theming](/docs/theming/basics).
    */
  var color: js.UndefOr[Color] = js.native
  /**
    * Set the amount of time, in milliseconds, to wait to trigger the `ionChange` event after each keystroke.
    */
  var debounce: Double = js.native
  /**
    * If `true`, the user cannot interact with the input.
    */
  var disabled: Boolean = js.native
  /**
    * A hint to the browser for which keyboard to display. Possible values: `"none"`, `"text"`, `"tel"`, `"url"`, `"email"`, `"numeric"`, `"decimal"`, and `"search"`.
    */
  var inputmode: js.UndefOr[none | text | tel | url | email | numeric | decimal | search] = js.native
  /**
    * The mode determines which platform styles to use.
    */
  var mode: js.UndefOr[ios | md] = js.native
  /**
    * Set the input's placeholder. `placeholder` can accept either plaintext or HTML as a string. To display characters normally reserved for HTML, they must be escaped. For example `<Ionic>` would become `&lt;Ionic&gt;`  For more information: [Security Documentation](https://ionicframework.com/docs/faq/security)
    */
  var placeholder: String = js.native
  /**
    * The icon to use as the search icon. Defaults to `"search-outline"` in `ios` mode and `"search-sharp"` in `md` mode.
    */
  var searchIcon: js.UndefOr[String] = js.native
  /**
    * Sets the behavior for the cancel button. Defaults to `"never"`. Setting to `"focus"` shows the cancel button on focus. Setting to `"never"` hides the cancel button. Setting to `"always"` shows the cancel button regardless of focus state.
    */
  var showCancelButton: never | focus | always = js.native
  /**
    * Set the type of the input.
    */
  var `type`: text | password | email | number | search | tel | url = js.native
  /**
    * the value of the searchbar.
    */
  var value: js.UndefOr[String | Null] = js.native
  /**
    * Returns the native `<input>` element used under the hood.
    */
  def getInputElement(): js.Promise[HTMLInputElement] = js.native
  /**
    * Sets focus on the specified `ion-searchbar`. Use this method instead of the global `input.focus()`.
    */
  def setFocus(): js.Promise[Unit] = js.native
}

@JSGlobal("HTMLIonSearchbarElement")
@js.native
object HTMLIonSearchbarElement extends Instantiable0[HTMLIonSearchbarElement]

