package typings.atJupyterlabApputils

import typings.std.HTMLCollection
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/apputils/lib/domutils", JSImport.Namespace)
@js.native
object libDomutilsMod extends js.Object {
  @JSName("DOMUtils")
  @js.native
  object DOMUtilsNs extends js.Object {
    /**
      * Create a DOM id with prefix "id-" to solve bug for UUIDs beginning with numbers.
      */
    def createDomID(): String = js.native
    /**
      * Find the first element matching a class name.
      */
    def findElement(parent: HTMLElement, className: String): HTMLElement = js.native
    /**
      * Get the index of the node at a client position, or `-1`.
      */
    def hitTestNodes(nodes: js.Array[HTMLElement], x: Double, y: Double): Double = js.native
    def hitTestNodes(nodes: HTMLCollection, x: Double, y: Double): Double = js.native
  }
  
}

