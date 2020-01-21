package typings.homeworks

import typings.angularCore.mod.AfterContentInit
import typings.angularCore.mod.ElementRef
import typings.angularCore.mod.EventEmitter
import typings.angularCore.mod.Renderer2
import typings.homeworks.homeworks.TabEvent
import typings.homeworks.managerMod.HomeworksManager
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("homeworks/lib/ng2-homeworks/src/components/tab/component.tab", JSImport.Namespace)
@js.native
object componentTabMod extends js.Object {
  @js.native
  class WorksTab protected () extends HomeworksManager {
    def this(renderer: Renderer2, elementRef: ElementRef[_]) = this()
    @JSName("$element")
    var $element: js.Any = js.native
    var active: Double = js.native
    var activeChange: EventEmitter[Double] = js.native
    var `class`: String = js.native
    var elementRef: js.Any = js.native
    var m_active: js.Any = js.native
    var onMove: EventEmitter[TabEvent] = js.native
    var wrapperElement: js.UndefOr[js.Any] = js.native
    def ngAfterViewInit(): Unit = js.native
    def ngOnInit(): Unit = js.native
  }
  
  @js.native
  class WorksTabItem protected ()
    extends HomeworksManager
       with AfterContentInit {
    def this(renderer: Renderer2, elementRef: ElementRef[_]) = this()
    @JSName("$element")
    var $element: js.Any = js.native
    var contentElement: js.Any = js.native
    var elementRef: js.Any = js.native
    var m_title: js.Any = js.native
    var title: String = js.native
    var titleChild: WorksTabTitle = js.native
    var titleElement: js.Any = js.native
    /**
      * A callback method that is invoked immediately after
      * Angular has completed initialization of all of the directive's
      * content.
      * It is invoked only once when the directive is instantiated.
      */
    /* CompleteClass */
    override def ngAfterContentInit(): Unit = js.native
    def ngOnInit(): Unit = js.native
  }
  
  @js.native
  class WorksTabTitle protected () extends HomeworksManager {
    def this(renderer: Renderer2, elementRef: ElementRef[_]) = this()
    @JSName("$element")
    var $element: js.Any = js.native
    var elementRef: ElementRef[_] = js.native
  }
  
}

