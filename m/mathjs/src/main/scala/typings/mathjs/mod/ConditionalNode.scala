package typings.mathjs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConditionalNode[TCond /* <: MathNode */, TTrueNode /* <: MathNode */, TFalseNode /* <: MathNode */]
  extends StObject
     with MathNode {
  
  var condition: TCond = js.native
  
  var falseExpr: TFalseNode = js.native
  
  var isConditionalNode: Boolean = js.native
  
  var trueExpr: TTrueNode = js.native
  
  @JSName("type")
  var type_ConditionalNode: typings.mathjs.mathjsStrings.ConditionalNode = js.native
}
