package typings.marko

import typings.marko.domElementMod.DomElement
import typings.node.eventsMod.EventEmitter
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object componentMod {
  
  @js.native
  trait Component
    extends EventEmitter
       with DomElement {
    
    def apply(id: String): this.type = js.native
    
    def destroy(): Unit = js.native
    
    /** @deprecated */
    var el: HTMLElement = js.native
    
    def elId(key: String): String = js.native
    def elId(key: String, index: Double): String = js.native
    
    /** @deprecated */
    var els: js.Array[HTMLElement] = js.native
    
    def forceUpdate(): Unit = js.native
    
    def getComponent(key: String): Component = js.native
    def getComponent(key: String, index: Double): Component = js.native
    
    def getComponents(key: String): js.Array[Component] = js.native
    
    def getEl(): HTMLElement = js.native
    def getEl(key: String): HTMLElement = js.native
    def getEl(key: String, index: Double): HTMLElement = js.native
    def getEl(key: Unit, index: Double): HTMLElement = js.native
    
    def getElId(key: String): String = js.native
    def getElId(key: String, index: Double): String = js.native
    
    def getEls(): js.Array[HTMLElement] = js.native
    def getEls(key: String): js.Array[HTMLElement] = js.native
    
    var id: String = js.native
    
    var input: Any = js.native
    
    def isDestroyed(): Boolean = js.native
    
    def replaceState(newState: Any): Unit = js.native
    
    def setState(name: String, value: Any): Unit = js.native
    def setState(name: Any): Unit = js.native
    
    def setStateDirty(name: String): Unit = js.native
    def setStateDirty(name: String, value: Any): Unit = js.native
    
    def shouldUpdate(newState: Any, newProps: Any): Boolean = js.native
    
    var state: Any = js.native
    
    def update(): Unit = js.native
  }
}
