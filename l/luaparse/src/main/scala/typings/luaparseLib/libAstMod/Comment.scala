package typings
package luaparseLib.libAstMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Comment
  extends Base[luaparseLib.luaparseLibStrings.Comment]
     with _Node {
  var raw: java.lang.String
  var value: java.lang.String
}

object Comment {
  @scala.inline
  def apply(raw: java.lang.String, `type`: luaparseLib.luaparseLibStrings.Comment, value: java.lang.String): Comment = {
    val __obj = js.Dynamic.literal(raw = raw, value = value)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Comment]
  }
}

