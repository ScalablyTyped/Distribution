package typings.lucene.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.lucene.mod.LeftOnlyAST
  - typings.lucene.mod.BinaryAST
*/
trait AST extends js.Object

object AST {
  @scala.inline
  def LeftOnlyAST(left: Node, start: Operator = null): AST = {
    val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any])
    if (start != null) __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    __obj.asInstanceOf[AST]
  }
  @scala.inline
  def BinaryAST(left: AST | Node, operator: Operator, right: AST | Node): AST = {
    val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any], operator = operator.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AST]
  }
}

