package typings.homeworks

import typings.angularCore.mod.AfterContentInit
import typings.angularCore.mod.ElementRef
import typings.angularCore.mod.EventEmitter
import typings.angularCore.mod.Renderer2
import typings.homeworks.homeworks.StepEvent
import typings.homeworks.libNg2HomeworksSrcCoreManagerMod.HomeworksManager
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libNg2HomeworksSrcComponentsStepComponentDotstepMod {
  
  @JSImport("homeworks/lib/ng2-homeworks/src/components/step/component.step", "WorksStep")
  @js.native
  open class WorksStep protected () extends HomeworksManager {
    def this(renderer: Renderer2, elementRef: ElementRef[Any]) = this()
    
    /* private */ @JSName("$element")
    var $element: Any = js.native
    
    var active: Double = js.native
    
    var activeChange: EventEmitter[Double] = js.native
    
    var `class`: String = js.native
    
    /* private */ var elementRef: Any = js.native
    
    /* private */ var m_active: Any = js.native
    
    def ngAfterViewInit(): Unit = js.native
    
    def ngOnInit(): Unit = js.native
    
    var onMove: EventEmitter[StepEvent] = js.native
    
    /* private */ var wrapperElement: Any = js.native
  }
  
  @JSImport("homeworks/lib/ng2-homeworks/src/components/step/component.step", "WorksStepItem")
  @js.native
  open class WorksStepItem protected ()
    extends HomeworksManager
       with AfterContentInit {
    def this(renderer: Renderer2, elementRef: ElementRef[Any]) = this()
    
    /* private */ @JSName("$element")
    var $element: Any = js.native
    
    /* private */ var contentElement: Any = js.native
    
    /* private */ var elementRef: Any = js.native
    
    /* private */ var m_title: Any = js.native
    
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
    
    /* private */ var titleElement: Any = js.native
  }
  
  @JSImport("homeworks/lib/ng2-homeworks/src/components/step/component.step", "WorksStepTitle")
  @js.native
  open class WorksStepTitle protected () extends HomeworksManager {
    def this(renderer: Renderer2, elementRef: ElementRef[Any]) = this()
    
    /* private */ @JSName("$element")
    var $element: Any = js.native
    
    var elementRef: ElementRef[Any] = js.native
    
    def ngOnInit(): Unit = js.native
  }
}
