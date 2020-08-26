package typings.homeworks

import typings.angularCore.mod.ElementRef
import typings.angularCore.mod.EventEmitter
import typings.angularCore.mod.Renderer2
import typings.angularForms.mod.ControlValueAccessor
import typings.homeworks.homeworks.Event
import typings.homeworks.managerMod.HomeworksManager
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("homeworks/lib/ng2-homeworks/src/components/spinner/component.spinner", JSImport.Namespace)
@js.native
object componentSpinnerMod extends js.Object {
  @js.native
  class WorksSpinner protected ()
    extends HomeworksManager
       with ControlValueAccessor {
    def this(renderer: Renderer2, elementRef: ElementRef[_]) = this()
    @JSName("$element")
    var $element: js.Any = js.native
    @JSName("$select")
    var $select: js.Any = js.native
    var block: js.Any = js.native
    var `class`: String = js.native
    var disabled: js.Any = js.native
    var elementRef: js.Any = js.native
    var id: String = js.native
    var m_block: js.Any = js.native
    var m_disabled: js.Any = js.native
    var m_model: js.Any = js.native
    var m_placeholder: js.Any = js.native
    var m_readonly: js.Any = js.native
    var m_required: js.Any = js.native
    var m_size: js.Any = js.native
    var model: js.Any = js.native
    var name: String = js.native
    var onUpdate: EventEmitter[Event] = js.native
    var placeholder: String = js.native
    var propagateChange: js.Any = js.native
    var propagateTouch: js.Any = js.native
    var readonly: js.Any = js.native
    var required: js.Any = js.native
    var selectChild: ElementRef[_] = js.native
    var size: String = js.native
    var title: String = js.native
    def ngAfterViewInit(): Unit = js.native
    def ngOnInit(): Unit = js.native
    def render(): Unit = js.native
    def setBlock(block: Boolean): Unit = js.native
  }
  
}

