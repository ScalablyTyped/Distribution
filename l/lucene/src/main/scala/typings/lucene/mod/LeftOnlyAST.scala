package typings.lucene.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LeftOnlyAST extends AST {
  var left: Node
  var start: js.UndefOr[Operator] = js.undefined
}

object LeftOnlyAST {
  @scala.inline
  def apply(left: Node, start: Operator = null): LeftOnlyAST = {
    val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any])
    if (start != null) __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    __obj.asInstanceOf[LeftOnlyAST]
  }
}

