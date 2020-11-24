package typings.htmlCodesniffer.mod.Util

import typings.std.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("html_codesniffer", "Util.findParentNode")
@js.native
object findParentNode extends js.Object {
  
  /**
    * Find a parent node matching a selector.
    *
    * @param node  Node to search from.
    * @param selector The selector to search.
    */
  def apply(node: Node, selector: String): Node | Null = js.native
}
