package typings
package atIonicAngularLib.distDirectivesProxiesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/angular/dist/directives/proxies", "IonInput")
@js.native
class IonInput protected ()
  extends atIonicCoreLib.distTypesComponentsMod.ComponentsNs.IonInput {
  def this(c: atAngularCoreLib.atAngularCoreMod.ChangeDetectorRef, r: atAngularCoreLib.atAngularCoreMod.ElementRef[_]) = this()
  /**
    * Indicates whether and how the text value should be automatically capitalized as it is entered/edited by the user.
    */
  /* CompleteClass */
  override var autocapitalize: java.lang.String = js.native
  /**
    * Indicates whether the value of the control can be automatically completed by the browser.
    */
  /* CompleteClass */
  override var autocomplete: atIonicCoreLib.atIonicCoreLibStrings.on | atIonicCoreLib.atIonicCoreLibStrings.off = js.native
  /**
    * Whether auto correction should be enabled when the user is entering/editing the text value.
    */
  /* CompleteClass */
  override var autocorrect: atIonicCoreLib.atIonicCoreLibStrings.on | atIonicCoreLib.atIonicCoreLibStrings.off = js.native
  /**
    * This Boolean attribute lets you specify that a form control should have input focus when the page loads.
    */
  /* CompleteClass */
  override var autofocus: scala.Boolean = js.native
  /**
    * If `true`, a clear icon will appear in the input when there is a value. Clicking it clears the input.
    */
  /* CompleteClass */
  override var clearInput: scala.Boolean = js.native
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
  /**
    * The type of control to display. The default type is text.
    */
  /* CompleteClass */
  override var `type`: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify TextFieldTypes */ js.Any = js.native
  /**
    * Returns the native `<input>` element used under the hood.
    */
  /* CompleteClass */
  override def getInputElement(): js.Promise[stdLib.HTMLInputElement] = js.native
  /**
    * Sets focus on the specified `ion-input`. Use this method instead of the global `input.focus()`.
    */
  /* CompleteClass */
  override def setFocus(): js.Promise[scala.Unit] = js.native
}

