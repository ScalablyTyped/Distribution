package typings.lucene.luceneMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BinaryAST extends AST {
  var left: AST | Node
  var operator: Operator
  var right: AST | Node
}

object BinaryAST {
  @scala.inline
  def apply(left: AST | Node, operator: Operator, right: AST | Node): BinaryAST = {
    val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any], operator = operator, right = right.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[BinaryAST]
  }
}

