package typings
package atIonicAngularLib.distDirectivesProxiesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/angular/dist/directives/proxies", "IonTextarea")
@js.native
class IonTextarea protected ()
  extends atIonicCoreLib.distTypesComponentsMod.ComponentsNs.IonTextarea {
  def this(c: atAngularCoreLib.atAngularCoreMod.ChangeDetectorRef, r: atAngularCoreLib.atAngularCoreMod.ElementRef[_], z: atAngularCoreLib.atAngularCoreMod.NgZone) = this()
  /**
    * If `true`, the element height will increase based on the value.
    */
  /* CompleteClass */
  override var autoGrow: scala.Boolean = js.native
  /**
    * Indicates whether and how the text value should be automatically capitalized as it is entered/edited by the user.
    */
  /* CompleteClass */
  override var autocapitalize: java.lang.String = js.native
  /**
    * This Boolean attribute lets you specify that a form control should have input focus when the page loads.
    */
  /* CompleteClass */
  override var autofocus: scala.Boolean = js.native
  /**
    * If `true`, the value will be cleared after focus upon edit. Defaults to `true` when `type` is `"password"`, `false` for all other types.
    */
  /* CompleteClass */
  override var clearOnEdit: scala.Boolean = js.native
  /**
    * Set the amount of time, in milliseconds, to wait to trigger the `ionChange` event after each keystroke.
    */
  /* CompleteClass */
  override var debounce: scala.Double = js.native
  /**
    * If `true`, the user cannot interact with the textarea.
    */
  /* CompleteClass */
  override var disabled: scala.Boolean = js.native
  var el: stdLib.HTMLElement = js.native
  var ionBlur: atAngularCoreLib.atAngularCoreMod.EventEmitter[stdLib.CustomEvent[_]] = js.native
  var ionChange: atAngularCoreLib.atAngularCoreMod.EventEmitter[stdLib.CustomEvent[_]] = js.native
  var ionFocus: atAngularCoreLib.atAngularCoreMod.EventEmitter[stdLib.CustomEvent[_]] = js.native
  var ionInput: atAngularCoreLib.atAngularCoreMod.EventEmitter[stdLib.CustomEvent[_]] = js.native
  /**
    * The name of the control, which is submitted with the form data.
    */
  /* CompleteClass */
  override var name: java.lang.String = js.native
  /**
    * If `true`, the user cannot modify the value.
    */
  /* CompleteClass */
  override var readonly: scala.Boolean = js.native
  /**
    * If `true`, the user must fill in a value before submitting a form.
    */
  /* CompleteClass */
  override var required: scala.Boolean = js.native
  /**
    * If `true`, the element will have its spelling and grammar checked.
    */
  /* CompleteClass */
  override var spellcheck: scala.Boolean = js.native
  var z: atAngularCoreLib.atAngularCoreMod.NgZone = js.native
  /**
    * Returns the native `<textarea>` element used under the hood.
    */
  /* CompleteClass */
  override def getInputElement(): js.Promise[stdLib.HTMLTextAreaElement] = js.native
  /**
    * Sets focus on the specified `ion-textarea`. Use this method instead of the global `input.focus()`.
    */
  /* CompleteClass */
  override def setFocus(): js.Promise[scala.Unit] = js.native
}

