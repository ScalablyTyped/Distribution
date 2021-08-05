package typings.materialUiCore

import typings.std.Element
import typings.std.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object manageAriaHiddenMod {
  
  @JSImport("@material-ui/core/Modal/manageAriaHidden", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def ariaHidden(node: Node, show: Boolean): scala.Nothing = (^.asInstanceOf[js.Dynamic].applyDynamic("ariaHidden")(node.asInstanceOf[js.Any], show.asInstanceOf[js.Any])).asInstanceOf[scala.Nothing]
  
  inline def ariaHiddenSiblings(container: Element, mountNode: Node, currentNode: Node, show: Boolean): scala.Nothing = (^.asInstanceOf[js.Dynamic].applyDynamic("ariaHiddenSiblings")(container.asInstanceOf[js.Any], mountNode.asInstanceOf[js.Any], currentNode.asInstanceOf[js.Any], show.asInstanceOf[js.Any])).asInstanceOf[scala.Nothing]
}
