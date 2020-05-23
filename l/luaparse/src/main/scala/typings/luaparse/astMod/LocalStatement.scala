package typings.luaparse.astMod

import typings.luaparse.anon.End
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LocalStatement
  extends _Statement
     with Base[typings.luaparse.luaparseStrings.LocalStatement] {
  var init: js.Array[Expression]
  var variables: js.Array[Identifier]
}

object LocalStatement {
  @scala.inline
  def apply(
    init: js.Array[Expression],
    `type`: typings.luaparse.luaparseStrings.LocalStatement,
    variables: js.Array[Identifier],
    loc: End = null
  ): LocalStatement = {
    val __obj = js.Dynamic.literal(init = init.asInstanceOf[js.Any], variables = variables.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[LocalStatement]
  }
}

