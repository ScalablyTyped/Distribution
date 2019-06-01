package typings
package luaparseLib.libAstMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Chunk
  extends Base[luaparseLib.luaparseLibStrings.Chunk]
     with _Node {
  var body: js.Array[Statement]
  var comments: js.Array[java.lang.String]
}

object Chunk {
  @scala.inline
  def apply(
    body: js.Array[Statement],
    comments: js.Array[java.lang.String],
    `type`: luaparseLib.luaparseLibStrings.Chunk
  ): Chunk = {
    val __obj = js.Dynamic.literal(body = body, comments = comments)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Chunk]
  }
}

