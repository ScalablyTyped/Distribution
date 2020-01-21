package typings.luaparse.astMod

import typings.luaparse.AnonEnd
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DoStatement
  extends _Statement
     with Base[typings.luaparse.luaparseStrings.DoStatement] {
  var body: js.Array[Statement]
}

object DoStatement {
  @scala.inline
  def apply(
    body: js.Array[Statement],
    `type`: typings.luaparse.luaparseStrings.DoStatement,
    loc: AnonEnd = null
  ): DoStatement = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[DoStatement]
  }
}

