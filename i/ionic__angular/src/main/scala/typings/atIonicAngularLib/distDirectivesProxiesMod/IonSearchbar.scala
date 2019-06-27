package typings
package atIonicAngularLib.distDirectivesProxiesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/angular/dist/directives/proxies", "IonSearchbar")
@js.native
class IonSearchbar protected ()
  extends atIonicCoreLib.distTypesComponentsMod.ComponentsNs.IonSearchbar {
  def this(c: atAngularCoreLib.atAngularCoreMod.ChangeDetectorRef, r: atAngularCoreLib.atAngularCoreMod.ElementRef[_]) = this()
  /**
    * If `true`, enable searchbar animation.
    */
  /* CompleteClass */
  override var animated: scala.Boolean = js.native
  /**
    * Set the input's autocomplete property.
    */
  /* CompleteClass */
  override var autocomplete: atIonicCoreLib.atIonicCoreLibStrings.on | atIonicCoreLib.atIonicCoreLibStrings.off = js.native
  /**
    * Set the input's autocorrect property.
    */
  /* CompleteClass */
  override var autocorrect: atIonicCoreLib.atIonicCoreLibStrings.on | atIonicCoreLib.atIonicCoreLibStrings.off = js.native
  /**
    * Set the cancel button icon. Only applies to `md` mode.
    */
  /* CompleteClass */
  override var cancelButtonIcon: java.lang.String = js.native
  /**
    * Set the the cancel button text. Only applies to `ios` mode.
    */
  /* CompleteClass */
  override var cancelButtonText: java.lang.String = js.native
  /**
    * Set the amount of time, in milliseconds, to wait to trigger the `ionChange` event after each keystroke.
    */
  /* CompleteClass */
  override var debounce: scala.Double = js.native
  /**
    * If `true`, the user cannot interact with the input.
    */
  /* CompleteClass */
  override var disabled: scala.Boolean = js.native
  var el: stdLib.HTMLElement = js.native
  var ionBlur: atAngularCoreLib.atAngularCoreMod.EventEmitter[stdLib.CustomEvent[_]] = js.native
  var ionCancel: atAngularCoreLib.atAngularCoreMod.EventEmitter[stdLib.CustomEvent[_]] = js.native
  var ionChange: atAngularCoreLib.atAngularCoreMod.EventEmitter[stdLib.CustomEvent[_]] = js.native
  var ionClear: atAngularCoreLib.atAngularCoreMod.EventEmitter[stdLib.CustomEvent[_]] = js.native
  var ionFocus: atAngularCoreLib.atAngularCoreMod.EventEmitter[stdLib.CustomEvent[_]] = js.native
  var ionInput: atAngularCoreLib.atAngularCoreMod.EventEmitter[stdLib.CustomEvent[_]] = js.native
  /**
    * Set the input's placeholder. `placeholder` can accept either plaintext or HTML as a string. To display characters normally reserved for HTML, they must be escaped. For example `<Ionic>` would become `&lt;Ionic&gt;`  For more information: [Security Documentation](https://ionicframework.com/docs/faq/security)
    */
  /* CompleteClass */
  override var placeholder: java.lang.String = js.native
  /**
    * The icon to use as the search icon.
    */
  /* CompleteClass */
  override var searchIcon: java.lang.String = js.native
  /**
    * Sets the behavior for the cancel button. Defaults to `"never"`. Setting to `"focus"` shows the cancel button on focus. Setting to `"never"` hides the cancel button. Setting to `"always"` shows the cancel button regardless of focus state.
    */
  /* CompleteClass */
  override var showCancelButton: scala.Boolean | java.lang.String = js.native
  /**
    * If `true`, enable spellcheck on the input.
    */
  /* CompleteClass */
  override var spellcheck: scala.Boolean = js.native
  /**
    * Set the type of the input.
    */
  /* CompleteClass */
  override var `type`: atIonicCoreLib.atIonicCoreLibStrings.text | atIonicCoreLib.atIonicCoreLibStrings.password | atIonicCoreLib.atIonicCoreLibStrings.email | atIonicCoreLib.atIonicCoreLibStrings.number | atIonicCoreLib.atIonicCoreLibStrings.search | atIonicCoreLib.atIonicCoreLibStrings.tel | atIonicCoreLib.atIonicCoreLibStrings.url = js.native
  /**
    * Returns the native `<input>` element used under the hood.
    */
  /* CompleteClass */
  override def getInputElement(): js.Promise[stdLib.HTMLInputElement] = js.native
  /**
    * Sets focus on the specified `ion-searchbar`. Use this method instead of the global `input.focus()`.
    */
  /* CompleteClass */
  override def setFocus(): js.Promise[scala.Unit] = js.native
}

