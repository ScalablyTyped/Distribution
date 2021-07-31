package typings.homeworks

import typings.angularCore.mod.AfterContentInit
import typings.angularCore.mod.ElementRef
import typings.angularCore.mod.EventEmitter
import typings.angularCore.mod.Renderer2
import typings.homeworks.homeworks.StepEvent
import typings.homeworks.managerMod.HomeworksManager
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object componentStepMod {
  
  @JSImport("homeworks/lib/ng2-homeworks/src/components/step/component.step", "WorksStep")
  @js.native
  class WorksStep protected () extends HomeworksManager {
    def this(renderer: Renderer2, elementRef: ElementRef[js.Any]) = this()
    
    @JSName("$element")
    var $element: js.Any = js.native
    
    var active: Double = js.native
    
    var activeChange: EventEmitter[Double] = js.native
    
    var `class`: String = js.native
    
    var elementRef: js.Any = js.native
    
    var m_active: js.Any = js.native
    
    def ngAfterViewInit(): Unit = js.native
    
    def ngOnInit(): Unit = js.native
    
    var onMove: EventEmitter[StepEvent] = js.native
    
    var wrapperElement: js.Any = js.native
  }
  
  @JSImport("homeworks/lib/ng2-homeworks/src/components/step/component.step", "WorksStepItem")
  @js.native
  class WorksStepItem protected ()
    extends HomeworksManager
       with AfterContentInit {
    def this(renderer: Renderer2, elementRef: ElementRef[js.Any]) = this()
    
    @JSName("$element")
    var $element: js.Any = js.native
    
    var contentElement: js.Any = js.native
    
    var elementRef: js.Any = js.native
    
    var m_title: js.Any = js.native
    
    /**
      * A callback method that is invoked immediately after
      * Angular has completed initialization of all of the directive's
      * content.
      * It is invoked only once when the directive is instantiated.
      */
    /* CompleteClass */
    override def ngAfterContentInit(): Unit = js.native
    
    def ngOnInit(): Unit = js.native
    
    var title: String = js.native
    
    var titleChild: WorksStepTitle = js.native
    
    var titleElement: js.Any = js.native
  }
  
  @JSImport("homeworks/lib/ng2-homeworks/src/components/step/component.step", "WorksStepTitle")
  @js.native
  class WorksStepTitle protected () extends HomeworksManager {
    def this(renderer: Renderer2, elementRef: ElementRef[js.Any]) = this()
    
    @JSName("$element")
    var $element: js.Any = js.native
    
    var elementRef: ElementRef[js.Any] = js.native
    
    def ngOnInit(): Unit = js.native
  }
}
