package typings.homeworks

import typings.angularCore.mod.Renderer2
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object managerMod {
  
  @JSImport("homeworks/lib/ng2-homeworks/src/core/manager", "HomeworksManager")
  @js.native
  open class HomeworksManager protected () extends StObject {
    def this(renderer: Renderer2, component: String) = this()
    def this(renderer: Renderer2, component: String, alias: String) = this()
    
    /* protected */ def getSizeClassName(size: String): String = js.native
    
    /* private */ var m_class: Any = js.native
    
    /* private */ var m_component: Any = js.native
    
    /* protected */ var renderer: Renderer2 = js.native
    
    /* protected */ def setColor(el: Element, color: String): Unit = js.native
    
    /* protected */ def setElementClass(el: Element, className: String): Unit = js.native
    /* protected */ def setElementClass(el: Element, className: String, isAdd: Boolean): Unit = js.native
    
    /* protected */ def setPropagateChildClass(rootEl: Element, childEl: Element, className: String): Unit = js.native
    
    /* protected */ def setRootElementClass(el: Element, className: String): Unit = js.native
    /* protected */ def setRootElementClass(el: Element, className: String, isAdd: Boolean): Unit = js.native
    
    /* protected */ def setSize(el: Element, size: String): Unit = js.native
    
    /* protected */ def updateRootElementClass(el: Element): Unit = js.native
  }
}
