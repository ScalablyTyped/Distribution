package typings
package atIonicAngularLib.distDirectivesControlDashValueDashAccessorsValueDashAccessorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/angular/dist/directives/control-value-accessors/value-accessor", "ValueAccessor")
@js.native
class ValueAccessor protected ()
  extends atAngularFormsLib.srcDirectivesControlUnderscoreValueUnderscoreAccessorMod.ControlValueAccessor {
  def this(el: atAngularCoreLib.atAngularCoreMod.ElementRef[_]) = this()
  var el: atAngularCoreLib.atAngularCoreMod.ElementRef[_] = js.native
  var lastValue: js.Any = js.native
  var onChange: js.Any = js.native
  var onTouched: js.Any = js.native
  def _handleBlurEvent(): scala.Unit = js.native
  def handleChangeEvent(value: js.Any): scala.Unit = js.native
  /**
    * @description
    * Registers a callback function that is called when the control's value
    * changes in the UI.
    *
    * This method is called by the forms API on initialization to update the form
    * model when values propagate from the view to the model.
    *
    * When implementing the `registerOnChange` method in your own value accessor,
    * save the given function so your class calls it at the appropriate time.
    *
    * @usageNotes
    * ### Store the change function
    *
    * The following example stores the provided function as an internal method.
    *
    * ```ts
    * registerOnChange(fn: (_: any) => void): void {
    *   this._onChange = fn;
    * }
    * ```
    *
    * When the value changes in the UI, call the registered
    * function to allow the forms API to update itself:
    *
    * ```ts
    * host: {
    *    (change): '_onChange($event.target.value)'
    * }
    * ```
    *
    * @param fn The callback function to register
    */
  /* CompleteClass */
  override def registerOnChange(fn: js.Any): scala.Unit = js.native
  def registerOnChange(fn: js.Function1[/* value */ js.Any, scala.Unit]): scala.Unit = js.native
  /**
    * @description
    * Registers a callback function is called by the forms API on initialization
    * to update the form model on blur.
    *
    * When implementing `registerOnTouched` in your own value accessor, save the given
    * function so your class calls it when the control should be considered
    * blurred or "touched".
    *
    * @usageNotes
    * ### Store the callback function
    *
    * The following example stores the provided function as an internal method.
    *
    * ```ts
    * registerOnTouched(fn: any): void {
    *   this._onTouched = fn;
    * }
    * ```
    *
    * On blur (or equivalent), your class should call the registered function to allow
    * the forms API to update itself:
    *
    * ```ts
    * host: {
    *    '(blur)': '_onTouched()'
    * }
    * ```
    *
    * @param fn The callback function to register
    */
  /* CompleteClass */
  override def registerOnTouched(fn: js.Any): scala.Unit = js.native
  def registerOnTouched(fn: js.Function0[scala.Unit]): scala.Unit = js.native
  @JSName("setDisabledState")
  def setDisabledState_MValueAccessor(isDisabled: scala.Boolean): scala.Unit = js.native
  /**
    * @description
    * Writes a new value to the element.
    *
    * This method is called by the forms API to write to the view when programmatic
    * changes from model to view are requested.
    *
    * @usageNotes
    * ### Write a value to the element
    *
    * The following example writes a value to the native DOM element.
    *
    * ```ts
    * writeValue(value: any): void {
    *   this._renderer.setProperty(this._elementRef.nativeElement, 'value', value);
    * }
    * ```
    *
    * @param obj The new value for the element
    */
  /* CompleteClass */
  override def writeValue(obj: js.Any): scala.Unit = js.native
}

