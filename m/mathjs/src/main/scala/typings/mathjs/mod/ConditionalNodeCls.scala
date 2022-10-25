package typings.mathjs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
@JSImport("mathjs", "ConditionalNode")
@js.native
open class ConditionalNodeCls[TCond /* <: MathNode */, TTrueNode /* <: MathNode */, TFalseNode /* <: MathNode */] protected ()
  extends StObject
     with ConditionalNode[MathNode, MathNode, MathNode] {
  def this(condition: TCond, trueExpr: TTrueNode, falseExpr: TFalseNode) = this()
}
