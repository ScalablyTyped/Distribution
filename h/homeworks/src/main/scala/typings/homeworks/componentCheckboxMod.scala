package typings.homeworks

import typings.angularCore.mod.ChangeDetectorRef
import typings.angularCore.mod.ElementRef
import typings.angularCore.mod.EventEmitter
import typings.angularCore.mod.Renderer2
import typings.angularForms.mod.ControlValueAccessor
import typings.homeworks.homeworks.Event
import typings.homeworks.managerMod.HomeworksManager
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object componentCheckboxMod {
  
  @JSImport("homeworks/lib/ng2-homeworks/src/components/checkbox/component.checkbox", "WorksCheckbox")
  @js.native
  open class WorksCheckbox protected ()
    extends HomeworksManager
       with ControlValueAccessor {
    def this(renderer: Renderer2, changeDetectorRef: ChangeDetectorRef, elementRef: ElementRef[Any]) = this()
    
    /* private */ @JSName("$checkbox")
    var $checkbox: Any = js.native
    
    /* private */ @JSName("$element")
    var $element: Any = js.native
    
    /* private */ var changeDetectorRef: Any = js.native
    
    var checkboxChild: ElementRef[Any] = js.native
    
    var checked: Any = js.native
    
    var `class`: String = js.native
    
    var color: String = js.native
    
    var disabled: Any = js.native
    
    /* private */ var elementRef: Any = js.native
    
    var id: String = js.native
    
    /* private */ var m_checked: Any = js.native
    
    /* private */ var m_color: Any = js.native
    
    /* private */ var m_disabled: Any = js.native
    
    /* private */ var m_model: Any = js.native
    
    /* private */ var m_readonly: Any = js.native
    
    /* private */ var m_required: Any = js.native
    
    /* private */ var m_value: Any = js.native
    
    var model: Any = js.native
    
    var name: String = js.native
    
    def ngAfterViewInit(): Unit = js.native
    
    def ngOnInit(): Unit = js.native
    
    var onUpdate: EventEmitter[Event] = js.native
    
    /* private */ var propagateChange: Any = js.native
    
    /* private */ var propagateTouch: Any = js.native
    
    var readonly: Any = js.native
    
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
    override def registerOnChange(fn: Any): Unit = js.native
    
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
    override def registerOnTouched(fn: Any): Unit = js.native
    
    def render(): Unit = js.native
    
    var required: Any = js.native
    
    var title: String = js.native
    
    var `type`: String = js.native
    
    var value: Any = js.native
    
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
    override def writeValue(obj: Any): Unit = js.native
  }
}
