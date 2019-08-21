package typings.luaparse.libAstMod

import typings.luaparse.Anon_End
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
    loc: Anon_End = null
  ): Chunk = {
    val __obj = js.Dynamic.literal(body = body)
    __obj.updateDynamic("type")(`type`)
    if (comments != null) __obj.updateDynamic("comments")(comments)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    __obj.asInstanceOf[Chunk]
  }
}

