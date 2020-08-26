package typings.homeworks

import typings.angularCore.mod.ChangeDetectorRef
import typings.angularCore.mod.ElementRef
import typings.angularCore.mod.EventEmitter
import typings.angularCore.mod.Renderer2
import typings.angularForms.mod.ControlValueAccessor
import typings.homeworks.managerMod.HomeworksManager
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("homeworks/lib/ng2-homeworks/src/components/toggle/component.toggle", JSImport.Namespace)
@js.native
object componentToggleMod extends js.Object {
  @js.native
  class WorksToggle protected ()
    extends HomeworksManager
       with ControlValueAccessor {
    def this(renderer: Renderer2, changeDetectorRef: ChangeDetectorRef, elementRef: ElementRef[_]) = this()
    @JSName("$element")
    var $element: js.Any = js.native
    @JSName("$toggle")
    var $toggle: js.Any = js.native
    var changeDetectorRef: js.Any = js.native
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
    var m_placeholder: js.Any = js.native
    var m_readonly: js.Any = js.native
    var m_required: js.Any = js.native
    var model: js.Any = js.native
    var name: String = js.native
    var onUpdate: EventEmitter[_] = js.native
    var placeholder: js.Any = js.native
    var propagateChange: js.Any = js.native
    var propagateTouch: js.Any = js.native
    var readonly: js.Any = js.native
    var required: js.Any = js.native
    var title: String = js.native
    var toggleChild: ElementRef[_] = js.native
    var `type`: String = js.native
    var value: js.Any = js.native
    def ngAfterViewInit(): Unit = js.native
    def ngOnInit(): Unit = js.native
    def render(): Unit = js.native
  }
  
}

