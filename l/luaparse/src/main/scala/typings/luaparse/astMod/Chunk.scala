package typings.luaparse.astMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Chunk
  extends Base[typings.luaparse.luaparseStrings.Chunk]
     with _Node {
  var body: js.Array[Statement] = js.native
  var comments: js.UndefOr[js.Array[String]] = js.native
}

object Chunk {
  @scala.inline
  def apply(body: js.Array[Statement], `type`: typings.luaparse.luaparseStrings.Chunk): Chunk = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Chunk]
  }
  @scala.inline
  implicit class ChunkOps[Self <: Chunk] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setBodyVarargs(value: Statement*): Self = this.set("body", js.Array(value :_*))
    @scala.inline
    def setBody(value: js.Array[Statement]): Self = this.set("body", value.asInstanceOf[js.Any])
    @scala.inline
    def setCommentsVarargs(value: String*): Self = this.set("comments", js.Array(value :_*))
    @scala.inline
    def setComments(value: js.Array[String]): Self = this.set("comments", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteComments: Self = this.set("comments", js.undefined)
  }
  
}

