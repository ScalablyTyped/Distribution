package typings.luaparse.libAstMod

import typings.luaparse.Anon_End
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
  def apply(raw: String, `type`: typings.luaparse.luaparseStrings.Comment, value: String, loc: Anon_End = null): Comment = {
    val __obj = js.Dynamic.literal(raw = raw, value = value)
    __obj.updateDynamic("type")(`type`)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    __obj.asInstanceOf[Comment]
  }
}

