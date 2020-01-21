package typings.luaparse.astMod

import typings.luaparse.AnonEnd
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Chunk
  extends Base[typings.luaparse.luaparseStrings.Chunk]
     with _Node {
  var body: js.Array[Statement]
  var comments: js.UndefOr[js.Array[String]] = js.undefined
}

object Chunk {
  @scala.inline
  def apply(
    body: js.Array[Statement],
    `type`: typings.luaparse.luaparseStrings.Chunk,
    comments: js.Array[String] = null,
    loc: AnonEnd = null
  ): Chunk = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (comments != null) __obj.updateDynamic("comments")(comments.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[Chunk]
  }
}

