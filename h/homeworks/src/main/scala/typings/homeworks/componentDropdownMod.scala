package typings.homeworks

import typings.angularCore.mod.ElementRef
import typings.angularCore.mod.Renderer2
import typings.homeworks.managerMod.HomeworksManager
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object componentDropdownMod {
  
  @JSImport("homeworks/lib/ng2-homeworks/src/components/dropdown/component.dropdown", "WorksDropdown")
  @js.native
  open class WorksDropdown protected () extends HomeworksManager {
    def this(renderer: Renderer2, elementRef: ElementRef[Any]) = this()
    
    /* private */ @JSName("$dropdown")
    var $dropdown: Any = js.native
    
    /* private */ @JSName("$element")
    var $element: Any = js.native
    
    var `class`: String = js.native
    
    var direction: String = js.native
    
    var dropdownChild: ElementRef[Any] = js.native
    
    /* private */ var elementRef: Any = js.native
    
    def ngAfterViewInit(): Unit = js.native
    
    def ngOnDestory(): Unit = js.native
    
    def ngOnInit(): Unit = js.native
    
    var pen: String = js.native
  }
}
