package typings.luaparse.libAstMod

import typings.luaparse.Anon_End
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
    loc: Anon_End = null
  ): DoStatement = {
    val __obj = js.Dynamic.literal(body = body)
    __obj.updateDynamic("type")(`type`)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    __obj.asInstanceOf[DoStatement]
  }
}

