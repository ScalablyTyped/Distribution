package typings.ionicAngular

import typings.angularCore.mod.AfterViewInit
import typings.angularCore.mod.ElementRef
import typings.angularCore.mod.Injector
import typings.angularCore.mod.OnDestroy
import typings.angularForms.mod.ControlValueAccessor
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object valueAccessorMod {
  
  @JSImport("@ionic/angular/directives/control-value-accessors/value-accessor", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@ionic/angular/directives/control-value-accessors/value-accessor", "ValueAccessor")
  @js.native
  class ValueAccessor protected ()
    extends StObject
       with ControlValueAccessor
       with AfterViewInit
       with OnDestroy {
    def this(injector: Injector, el: ElementRef[js.Any]) = this()
    
    def _handleBlurEvent(el: js.Any): Unit = js.native
    
    var el: ElementRef[js.Any] = js.native
    
    def handleChangeEvent(el: HTMLElement, value: js.Any): Unit = js.native
    
    var injector: Injector = js.native
    
    var lastValue: js.Any = js.native
    
    /**
      * A callback method that is invoked immediately after
      * Angular has completed initialization of a component's view.
      * It is invoked only once when the view is instantiated.
      *
      */
    /* CompleteClass */
    override def ngAfterViewInit(): Unit = js.native
    
    /**
      * A callback method that performs custom clean-up, invoked immediately
      * before a directive, pipe, or service instance is destroyed.
      */
    /* CompleteClass */
    override def ngOnDestroy(): Unit = js.native
    
    var onChange: js.Any = js.native
    
    var onTouched: js.Any = js.native
    
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
      *    '(change)': '_onChange($event.target.value)'
      * }
      * ```
      *
      * @param fn The callback function to register
      */
    /* CompleteClass */
    override def registerOnChange(fn: js.Any): Unit = js.native
    def registerOnChange(fn: js.Function1[/* value */ js.Any, Unit]): Unit = js.native
    
    /**
      * @description
      * Registers a callback function that is called by the forms API on initialization
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
    override def registerOnTouched(fn: js.Any): Unit = js.native
    def registerOnTouched(fn: js.Function0[Unit]): Unit = js.native
    
    @JSName("setDisabledState")
    def setDisabledState_MValueAccessor(isDisabled: Boolean): Unit = js.native
    
    var statusChanges: js.Any = js.native
    
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
    override def writeValue(obj: js.Any): Unit = js.native
  }
  
  @scala.inline
  def setIonicClasses(element: ElementRef[js.Any]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setIonicClasses")(element.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
