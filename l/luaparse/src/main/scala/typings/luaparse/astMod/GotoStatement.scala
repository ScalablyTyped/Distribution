package typings.luaparse.astMod

import typings.luaparse.AnonEnd
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GotoStatement
  extends _Statement
     with Base[typings.luaparse.luaparseStrings.GotoStatement] {
  var label: Identifier
}

object GotoStatement {
  @scala.inline
  def apply(label: Identifier, `type`: typings.luaparse.luaparseStrings.GotoStatement, loc: AnonEnd = null): GotoStatement = {
    val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[GotoStatement]
  }
}

