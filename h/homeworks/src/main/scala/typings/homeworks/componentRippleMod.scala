package typings.homeworks

import typings.angularCore.mod.ElementRef
import typings.angularCore.mod.Renderer2
import typings.homeworks.managerMod.HomeworksManager
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object componentRippleMod {
  
  @JSImport("homeworks/lib/ng2-homeworks/src/components/ripple/component.ripple", "WorksRipple")
  @js.native
  class WorksRipple protected () extends HomeworksManager {
    def this(renderer: Renderer2, elementRef: ElementRef[js.Any]) = this()
    
    /* private */ @JSName("$element")
    var $element: js.Any = js.native
    
    /* private */ var elementRef: js.Any = js.native
    
    def ngOnInit(): Unit = js.native
    
    var ripple: String = js.native
  }
}
