package typings
package atJupyterlabApputilsLib

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
      * Find the first element matching a class name.
      */
    def findElement(parent: stdLib.HTMLElement, className: java.lang.String): stdLib.HTMLElement = js.native
    /**
      * Get the index of the node at a client position, or `-1`.
      */
    def hitTestNodes(nodes: js.Array[stdLib.HTMLElement], x: scala.Double, y: scala.Double): scala.Double = js.native
    def hitTestNodes(nodes: stdLib.HTMLCollection, x: scala.Double, y: scala.Double): scala.Double = js.native
  }
  
}

