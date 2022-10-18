package typings.isReference

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("is-reference", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(node: NodeWithPropertyDefinition, parent: NodeWithPropertyDefinition): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(node.asInstanceOf[js.Any], parent.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  type Node = /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 70, starting with typings.estree.mod.Identifier, typings.estree.mod.SimpleLiteral, typings.estree.mod.RegExpLiteral */ Any
  
  type NodeWithPropertyDefinition = /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 71, starting with typings.estree.mod.Identifier, typings.estree.mod.SimpleLiteral, typings.estree.mod.RegExpLiteral */ Any
}
