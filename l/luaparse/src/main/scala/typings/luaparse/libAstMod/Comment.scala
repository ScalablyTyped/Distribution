package typings.luaparse.libAstMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Comment
  extends Base[typings.luaparse.luaparseStrings.Comment]
     with _Node {
  var raw: String
  var value: String
}

object Comment {
  @scala.inline
  def apply(raw: String, `type`: typings.luaparse.luaparseStrings.Comment, value: String): Comment = {
    val __obj = js.Dynamic.literal(raw = raw, value = value)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Comment]
  }
}

