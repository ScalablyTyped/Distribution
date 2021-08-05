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
  class WorksOption protected () extends HomeworksManager {
    def this(renderer: Renderer2, elementRef: ElementRef[js.Any]) = this()
    
    /* private */ @JSName("$element")
    var $element: js.Any = js.native
    
    /* private */ @JSName("$option")
    var $option: js.Any = js.native
    
    var disabled: js.Any = js.native
    
    /* private */ var elementRef: js.Any = js.native
    
    var label: String = js.native
    
    /* private */ var m_disabled: js.Any = js.native
    
    /* private */ var m_label: js.Any = js.native
    
    /* private */ var m_selected: js.Any = js.native
    
    /* private */ var m_value: js.Any = js.native
    
    def ngAfterViewInit(): Unit = js.native
    
    def ngOnDestroy(): Unit = js.native
    
    def ngOnInit(): Unit = js.native
    
    var optionChild: ElementRef[js.Any] = js.native
    
    /* private */ var propagateChange: js.Any = js.native
    
    /* private */ var propagateTouch: js.Any = js.native
    
    def render(): Unit = js.native
    
    var selected: js.Any = js.native
    
    var value: String = js.native
  }
}
