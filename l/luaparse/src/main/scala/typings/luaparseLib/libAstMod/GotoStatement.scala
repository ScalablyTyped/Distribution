package typings
package luaparseLib.libAstMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GotoStatement
  extends _Statement
     with Base[luaparseLib.luaparseLibStrings.GotoStatement] {
  var label: java.lang.String
}

object GotoStatement {
  @scala.inline
  def apply(label: java.lang.String, `type`: luaparseLib.luaparseLibStrings.GotoStatement): GotoStatement = {
    val __obj = js.Dynamic.literal(label = label)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[GotoStatement]
  }
}

