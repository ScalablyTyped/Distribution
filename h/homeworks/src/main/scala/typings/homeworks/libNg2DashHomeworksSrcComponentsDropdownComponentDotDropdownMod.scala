package typings.homeworks

import typings.atAngularCore.atAngularCoreMod.ElementRef
import typings.atAngularCore.atAngularCoreMod.Renderer2
import typings.homeworks.libNg2DashHomeworksSrcCoreManagerMod.HomeworksManager
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("homeworks/lib/ng2-homeworks/src/components/dropdown/component.dropdown", JSImport.Namespace)
@js.native
object libNg2DashHomeworksSrcComponentsDropdownComponentDotDropdownMod extends js.Object {
  @js.native
  class WorksDropdown protected () extends HomeworksManager {
    def this(renderer: Renderer2, elementRef: ElementRef[_]) = this()
    @JSName("$dropdown")
    var $dropdown: js.Any = js.native
    @JSName("$element")
    var $element: js.Any = js.native
    var `class`: String = js.native
    var direction: String = js.native
    var dropdownChild: ElementRef[_] = js.native
    var elementRef: js.Any = js.native
    var pen: String = js.native
    def ngAfterViewInit(): Unit = js.native
    def ngOnDestory(): Unit = js.native
    def ngOnInit(): Unit = js.native
  }
  
}

