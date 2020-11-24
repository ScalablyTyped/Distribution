package typings.homeworks

import typings.angularCore.mod.ChangeDetectorRef
import typings.angularCore.mod.ElementRef
import typings.angularCore.mod.EventEmitter
import typings.angularCore.mod.Renderer2
import typings.angularForms.mod.ControlValueAccessor
import typings.homeworks.homeworks.Event
import typings.homeworks.managerMod.HomeworksManager
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("homeworks/lib/ng2-homeworks/src/components/checkbox/component.checkbox", JSImport.Namespace)
@js.native
object componentCheckboxMod extends js.Object {
  
  @js.native
  class WorksCheckbox protected ()
    extends HomeworksManager
       with ControlValueAccessor {
    def this(renderer: Renderer2, changeDetectorRef: ChangeDetectorRef, elementRef: ElementRef[_]) = this()
    
    @JSName("$checkbox")
    var $checkbox: js.Any = js.native
    
    @JSName("$element")
    var $element: js.Any = js.native
    
    var changeDetectorRef: js.Any = js.native
    
    var checkboxChild: ElementRef[_] = js.native
    
    var checked: js.Any = js.native
    
    var `class`: String = js.native
    
    var color: String = js.native
    
    var disabled: js.Any = js.native
    
    var elementRef: js.Any = js.native
    
    var id: String = js.native
    
    var m_checked: js.Any = js.native
    
    var m_color: js.Any = js.native
    
    var m_disabled: js.Any = js.native
    
    var m_model: js.Any = js.native
    
    var m_readonly: js.Any = js.native
    
    var m_required: js.Any = js.native
    
    var m_value: js.Any = js.native
    
    var model: js.Any = js.native
    
    var name: String = js.native
    
    def ngAfterViewInit(): Unit = js.native
    
    def ngOnInit(): Unit = js.native
    
    var onUpdate: EventEmitter[Event] = js.native
    
    var propagateChange: js.Any = js.native
    
    var propagateTouch: js.Any = js.native
    
    var readonly: js.Any = js.native
    
    def render(): Unit = js.native
    
    var required: js.Any = js.native
    
    var title: String = js.native
    
    var `type`: String = js.native
    
    var value: js.Any = js.native
  }
}
