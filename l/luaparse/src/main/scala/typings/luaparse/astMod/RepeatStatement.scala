package typings.luaparse.astMod

import typings.luaparse.AnonEnd
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RepeatStatement
  extends _Statement
     with Base[typings.luaparse.luaparseStrings.RepeatStatement] {
  var body: js.Array[Statement]
  var condition: Expression
}

object RepeatStatement {
  @scala.inline
  def apply(
    body: js.Array[Statement],
    condition: Expression,
    `type`: typings.luaparse.luaparseStrings.RepeatStatement,
    loc: AnonEnd = null
  ): RepeatStatement = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], condition = condition.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[RepeatStatement]
  }
}

