package typings.luaparse.libAstMod

import typings.luaparse.Anon_End
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LabelStatement
  extends _Statement
     with Base[typings.luaparse.luaparseStrings.LabelStatement] {
  var label: Identifier
}

object LabelStatement {
  @scala.inline
  def apply(label: Identifier, `type`: typings.luaparse.luaparseStrings.LabelStatement, loc: Anon_End = null): LabelStatement = {
    val __obj = js.Dynamic.literal(label = label)
    __obj.updateDynamic("type")(`type`)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    __obj.asInstanceOf[LabelStatement]
  }
}

