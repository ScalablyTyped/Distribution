package typings.luaparse.libAstMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LabelStatement
  extends _Statement
     with Base[typings.luaparse.luaparseStrings.LabelStatement] {
  var label: String
}

object LabelStatement {
  @scala.inline
  def apply(label: String, `type`: typings.luaparse.luaparseStrings.LabelStatement): LabelStatement = {
    val __obj = js.Dynamic.literal(label = label)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[LabelStatement]
  }
}

