package typings.homeworks

import typings.angularCore.mod.ChangeDetectorRef
import typings.angularCore.mod.ElementRef
import typings.angularCore.mod.EventEmitter
import typings.angularCore.mod.Renderer2
import typings.angularForms.mod.ControlValueAccessor
import typings.homeworks.libNg2HomeworksSrcCoreManagerMod.HomeworksManager
import typings.std.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libNg2HomeworksSrcComponentsInputComponentDotinputMod {
  
  @JSImport("homeworks/lib/ng2-homeworks/src/components/input/component.input", "WorksInput")
  @js.native
  open class WorksInput protected ()
    extends HomeworksManager
       with ControlValueAccessor {
    def this(renderer: Renderer2, elementRef: ElementRef[Any], changeDectecterRef: ChangeDetectorRef) = this()
    
    /* private */ @JSName("$element")
    var $element: Any = js.native
    
    /* private */ @JSName("$input")
    var $input: Any = js.native
    
    var block: Any = js.native
    
    /* private */ var changeDectecterRef: Any = js.native
    
    var `class`: String = js.native
    
    var color: String = js.native
    
    var disabled: Any = js.native
    
    /* private */ var elementRef: Any = js.native
    
    var id: String = js.native
    
    var inputChild: ElementRef[Any] = js.native
    
    /* private */ var m_block: Any = js.native
    
    /* private */ var m_color: Any = js.native
    
    /* private */ var m_disabled: Any = js.native
    
    /* private */ var m_model: Any = js.native
    
    /* private */ var m_placeholder: Any = js.native
    
    /* private */ var m_readonly: Any = js.native
    
    /* private */ var m_required: Any = js.native
    
    /* private */ var m_size: Any = js.native
    
    var model: Any = js.native
    
    var name: String = js.native
    
    def ngAfterViewInit(): Unit = js.native
    
    def ngOnInit(): Unit = js.native
    
    def onInput($event: Event): Unit = js.native
    
    var onUpdate: EventEmitter[typings.homeworks.homeworks.Event] = js.native
    
    var placeholder: String = js.native
    
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
    
    def setBlock(block: Boolean): Unit = js.native
    
    var size: String = js.native
    
    var title: String = js.native
    
    var `type`: String = js.native
    
    var validation: Boolean = js.native
    
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
