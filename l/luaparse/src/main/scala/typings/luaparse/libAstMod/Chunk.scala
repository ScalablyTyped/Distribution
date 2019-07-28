package typings.luaparse.libAstMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Chunk
  extends Base[typings.luaparse.luaparseStrings.Chunk]
     with _Node {
  var body: js.Array[Statement]
  var comments: js.Array[String]
}

object Chunk {
  @scala.inline
  def apply(
    body: js.Array[Statement],
    comments: js.Array[String],
    `type`: typings.luaparse.luaparseStrings.Chunk
  ): Chunk = {
    val __obj = js.Dynamic.literal(body = body, comments = comments)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Chunk]
  }
}

