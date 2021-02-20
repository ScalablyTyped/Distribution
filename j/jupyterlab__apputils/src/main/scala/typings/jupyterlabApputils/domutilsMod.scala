package typings.jupyterlabApputils

import typings.std.HTMLCollection
import typings.std.HTMLCollectionOf
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object domutilsMod {
  
  object DOMUtils {
    
    /**
      * Create a DOM id with prefix "id-" to solve bug for UUIDs beginning with numbers.
      */
    @JSImport("@jupyterlab/apputils/lib/domutils", "DOMUtils.createDomID")
    @js.native
    def createDomID(): String = js.native
    
    /**
      * Find the first element matching a class name.
      */
    @JSImport("@jupyterlab/apputils/lib/domutils", "DOMUtils.findElement")
    @js.native
    def findElement(parent: HTMLElement, className: String): HTMLElement = js.native
    
    /**
      * Find the first element matching a class name.
      */
    @JSImport("@jupyterlab/apputils/lib/domutils", "DOMUtils.findElements")
    @js.native
    def findElements(parent: HTMLElement, className: String): HTMLCollectionOf[HTMLElement] = js.native
    
    /**
      * Get the index of the node at a client position, or `-1`.
      */
    @JSImport("@jupyterlab/apputils/lib/domutils", "DOMUtils.hitTestNodes")
    @js.native
    def hitTestNodes(nodes: js.Array[HTMLElement], x: Double, y: Double): Double = js.native
    @JSImport("@jupyterlab/apputils/lib/domutils", "DOMUtils.hitTestNodes")
    @js.native
    def hitTestNodes(nodes: HTMLCollection, x: Double, y: Double): Double = js.native
  }
}
