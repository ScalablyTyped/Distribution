package typings.luaparse.libAstMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GotoStatement
  extends _Statement
     with Base[typings.luaparse.luaparseStrings.GotoStatement] {
  var label: String
}

object GotoStatement {
  @scala.inline
  def apply(label: String, `type`: typings.luaparse.luaparseStrings.GotoStatement): GotoStatement = {
    val __obj = js.Dynamic.literal(label = label)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[GotoStatement]
  }
}

