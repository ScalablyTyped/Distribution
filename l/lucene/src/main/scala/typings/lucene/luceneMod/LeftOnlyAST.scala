package typings.lucene.luceneMod

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
    val __obj = js.Dynamic.literal(left = left)
    if (start != null) __obj.updateDynamic("start")(start)
    __obj.asInstanceOf[LeftOnlyAST]
  }
}

