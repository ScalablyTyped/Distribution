package typings.mathjs.mod

import typings.mathjs.anon.NodeTNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
@JSImport("mathjs", "BlockNode")
@js.native
open class BlockNodeCls[TNode /* <: MathNode */] protected ()
  extends StObject
     with BlockNode[MathNode] {
  def this(arr: js.Array[NodeTNode[TNode] | typings.mathjs.anon.Node[TNode]]) = this()
}
