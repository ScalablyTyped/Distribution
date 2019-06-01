package typings
package luaparseLib.libAstMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LabelStatement
  extends _Statement
     with Base[luaparseLib.luaparseLibStrings.LabelStatement] {
  var label: java.lang.String
}

object LabelStatement {
  @scala.inline
  def apply(label: java.lang.String, `type`: luaparseLib.luaparseLibStrings.LabelStatement): LabelStatement = {
    val __obj = js.Dynamic.literal(label = label)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[LabelStatement]
  }
}

