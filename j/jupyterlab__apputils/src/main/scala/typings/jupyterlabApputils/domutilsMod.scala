package typings.jupyterlabApputils

import typings.std.HTMLCollection
import typings.std.HTMLCollectionOf
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object domutilsMod {
  
  object DOMUtils {
    
    @JSImport("@jupyterlab/apputils/lib/domutils", "DOMUtils")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Create a DOM id with prefix "id-" to solve bug for UUIDs beginning with numbers.
      */
    inline def createDomID(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("createDomID")().asInstanceOf[String]
    
    /**
      * Find the first element matching a class name.
      */
    inline def findElement(parent: HTMLElement, className: String): HTMLElement = (^.asInstanceOf[js.Dynamic].applyDynamic("findElement")(parent.asInstanceOf[js.Any], className.asInstanceOf[js.Any])).asInstanceOf[HTMLElement]
    
    /**
      * Find the first element matching a class name.
      */
    inline def findElements(parent: HTMLElement, className: String): HTMLCollectionOf[HTMLElement] = (^.asInstanceOf[js.Dynamic].applyDynamic("findElements")(parent.asInstanceOf[js.Any], className.asInstanceOf[js.Any])).asInstanceOf[HTMLCollectionOf[HTMLElement]]
    
    /**
      * Get the index of the node at a client position, or `-1`.
      */
    inline def hitTestNodes(nodes: js.Array[HTMLElement], x: Double, y: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("hitTestNodes")(nodes.asInstanceOf[js.Any], x.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[Double]
    inline def hitTestNodes(nodes: HTMLCollection, x: Double, y: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("hitTestNodes")(nodes.asInstanceOf[js.Any], x.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[Double]
  }
}
