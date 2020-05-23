package typings.luaparse.astMod

import typings.luaparse.anon.End
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
  def apply(raw: String, `type`: typings.luaparse.luaparseStrings.Comment, value: String, loc: End = null): Comment = {
    val __obj = js.Dynamic.literal(raw = raw.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[Comment]
  }
}

