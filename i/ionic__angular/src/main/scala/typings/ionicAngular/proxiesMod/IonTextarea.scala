package typings.ionicAngular.proxiesMod

import typings.angularCore.mod.ChangeDetectorRef
import typings.angularCore.mod.ElementRef
import typings.angularCore.mod.EventEmitter
import typings.angularCore.mod.NgZone
import typings.std.CustomEvent
import typings.std.HTMLElement
import typings.std.HTMLTextAreaElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/angular/directives/proxies", "IonTextarea")
@js.native
class IonTextarea protected ()
  extends typings.ionicCore.componentsMod.Components.IonTextarea {
  def this(c: ChangeDetectorRef, r: ElementRef[_], z: NgZone) = this()
  /**
    * If `true`, the element height will increase based on the value.
    */
  /* CompleteClass */
  override var autoGrow: Boolean = js.native
  /**
    * Indicates whether and how the text value should be automatically capitalized as it is entered/edited by the user.
    */
  /* CompleteClass */
  override var autocapitalize: String = js.native
  /**
    * This Boolean attribute lets you specify that a form control should have input focus when the page loads.
    */
  /* CompleteClass */
  override var autofocus: Boolean = js.native
  /**
    * If `true`, the value will be cleared after focus upon edit. Defaults to `true` when `type` is `"password"`, `false` for all other types.
    */
  /* CompleteClass */
  override var clearOnEdit: Boolean = js.native
  /**
    * Set the amount of time, in milliseconds, to wait to trigger the `ionChange` event after each keystroke.
    */
  /* CompleteClass */
  override var debounce: Double = js.native
  /**
    * If `true`, the user cannot interact with the textarea.
    */
  /* CompleteClass */
  override var disabled: Boolean = js.native
  var el: HTMLElement = js.native
  var ionBlur: EventEmitter[CustomEvent[_]] = js.native
  var ionChange: EventEmitter[CustomEvent[_]] = js.native
  var ionFocus: EventEmitter[CustomEvent[_]] = js.native
  var ionInput: EventEmitter[CustomEvent[_]] = js.native
  /**
    * The name of the control, which is submitted with the form data.
    */
  /* CompleteClass */
  override var name: String = js.native
  /**
    * If `true`, the user cannot modify the value.
    */
  /* CompleteClass */
  override var readonly: Boolean = js.native
  /**
    * If `true`, the user must fill in a value before submitting a form.
    */
  /* CompleteClass */
  override var required: Boolean = js.native
  /**
    * If `true`, the element will have its spelling and grammar checked.
    */
  /* CompleteClass */
  override var spellcheck: Boolean = js.native
  var z: NgZone = js.native
  /**
    * Returns the native `<textarea>` element used under the hood.
    */
  /* CompleteClass */
  override def getInputElement(): js.Promise[HTMLTextAreaElement] = js.native
  /**
    * Sets focus on the specified `ion-textarea`. Use this method instead of the global `input.focus()`.
    */
  /* CompleteClass */
  override def setFocus(): js.Promise[Unit] = js.native
}

