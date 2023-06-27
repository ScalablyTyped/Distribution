package typings.isReference

import typings.isReference.anon.Computed
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("is-reference", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(node: NodeWithPropertyDefinition, parent: NodeWithPropertyDefinition): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(node.asInstanceOf[js.Any], parent.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  type Node = typings.estree.mod.Node
  
  type NodeWithPropertyDefinition = Node | Computed
}
