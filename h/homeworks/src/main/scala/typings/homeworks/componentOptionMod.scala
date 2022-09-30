package typings.homeworks

import typings.angularCore.mod.ElementRef
import typings.angularCore.mod.Renderer2
import typings.homeworks.managerMod.HomeworksManager
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object componentOptionMod {
  
  @JSImport("homeworks/lib/ng2-homeworks/src/components/spinner/component.option", "WorksOption")
  @js.native
  open class WorksOption protected () extends HomeworksManager {
    def this(renderer: Renderer2, elementRef: ElementRef[Any]) = this()
    
    /* private */ @JSName("$element")
    var $element: Any = js.native
    
    /* private */ @JSName("$option")
    var $option: Any = js.native
    
    var disabled: Any = js.native
    
    /* private */ var elementRef: Any = js.native
    
    var label: String = js.native
    
    /* private */ var m_disabled: Any = js.native
    
    /* private */ var m_label: Any = js.native
    
    /* private */ var m_selected: Any = js.native
    
    /* private */ var m_value: Any = js.native
    
    def ngAfterViewInit(): Unit = js.native
    
    def ngOnDestroy(): Unit = js.native
    
    def ngOnInit(): Unit = js.native
    
    var optionChild: ElementRef[Any] = js.native
    
    /* private */ var propagateChange: Any = js.native
    
    /* private */ var propagateTouch: Any = js.native
    
    def render(): Unit = js.native
    
    var selected: Any = js.native
    
    var value: String = js.native
  }
}
