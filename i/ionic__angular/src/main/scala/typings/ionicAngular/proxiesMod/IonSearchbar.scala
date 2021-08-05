package typings.ionicAngular.proxiesMod

import typings.angularCore.mod.ChangeDetectorRef
import typings.angularCore.mod.ElementRef
import typings.angularCore.mod.EventEmitter
import typings.angularCore.mod.NgZone
import typings.ionicCore.ionicCoreStrings.always
import typings.ionicCore.ionicCoreStrings.email
import typings.ionicCore.ionicCoreStrings.focus
import typings.ionicCore.ionicCoreStrings.never
import typings.ionicCore.ionicCoreStrings.number
import typings.ionicCore.ionicCoreStrings.off
import typings.ionicCore.ionicCoreStrings.on
import typings.ionicCore.ionicCoreStrings.password
import typings.ionicCore.ionicCoreStrings.search
import typings.ionicCore.ionicCoreStrings.tel
import typings.ionicCore.ionicCoreStrings.text
import typings.ionicCore.ionicCoreStrings.url
import typings.ionicCore.mod.AutocompleteTypes
import typings.std.CustomEvent
import typings.std.HTMLElement
import typings.std.HTMLInputElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@ionic/angular/directives/proxies", "IonSearchbar")
@js.native
class IonSearchbar protected ()
  extends StObject
     with typings.ionicCore.componentsMod.Components.IonSearchbar {
  def this(c: ChangeDetectorRef, r: ElementRef[js.Any], z: NgZone) = this()
  
  /**
    * If `true`, enable searchbar animation.
    */
  /* CompleteClass */
  var animated: Boolean = js.native
  
  /**
    * Set the input's autocomplete property.
    */
  /* CompleteClass */
  var autocomplete: AutocompleteTypes = js.native
  
  /**
    * Set the input's autocorrect property.
    */
  /* CompleteClass */
  var autocorrect: on | off = js.native
  
  /**
    * Set the cancel button icon. Only applies to `md` mode. Defaults to `"arrow-back-sharp"`.
    */
  /* CompleteClass */
  var cancelButtonIcon: String = js.native
  
  /**
    * Set the the cancel button text. Only applies to `ios` mode.
    */
  /* CompleteClass */
  var cancelButtonText: String = js.native
  
  /**
    * Set the amount of time, in milliseconds, to wait to trigger the `ionChange` event after each keystroke. This also impacts form bindings such as `ngModel` or `v-model`.
    */
  /* CompleteClass */
  var debounce: Double = js.native
  
  /**
    * If `true`, the user cannot interact with the input.
    */
  /* CompleteClass */
  var disabled: Boolean = js.native
  
  /* protected */ var el: HTMLElement = js.native
  
  /**
    * Returns the native `<input>` element used under the hood.
    */
  /* CompleteClass */
  override def getInputElement(): js.Promise[HTMLInputElement] = js.native
  
  var ionBlur: EventEmitter[CustomEvent[js.Any]] = js.native
  
  var ionCancel: EventEmitter[CustomEvent[js.Any]] = js.native
  
  var ionChange: EventEmitter[CustomEvent[js.Any]] = js.native
  
  var ionClear: EventEmitter[CustomEvent[js.Any]] = js.native
  
  var ionFocus: EventEmitter[CustomEvent[js.Any]] = js.native
  
  var ionInput: EventEmitter[CustomEvent[js.Any]] = js.native
  
  /**
    * Set the input's placeholder. `placeholder` can accept either plaintext or HTML as a string. To display characters normally reserved for HTML, they must be escaped. For example `<Ionic>` would become `&lt;Ionic&gt;`  For more information: [Security Documentation](https://ionicframework.com/docs/faq/security)
    */
  /* CompleteClass */
  var placeholder: String = js.native
  
  /**
    * Sets focus on the specified `ion-searchbar`. Use this method instead of the global `input.focus()`.
    */
  /* CompleteClass */
  override def setFocus(): js.Promise[Unit] = js.native
  
  /**
    * Sets the behavior for the cancel button. Defaults to `"never"`. Setting to `"focus"` shows the cancel button on focus. Setting to `"never"` hides the cancel button. Setting to `"always"` shows the cancel button regardless of focus state.
    */
  /* CompleteClass */
  var showCancelButton: never | focus | always = js.native
  
  /**
    * If `true`, enable spellcheck on the input.
    */
  /* CompleteClass */
  var spellcheck: Boolean = js.native
  
  /**
    * Set the type of the input.
    */
  /* CompleteClass */
  var `type`: text | password | email | number | search | tel | url = js.native
  
  /* protected */ var z: NgZone = js.native
}
