package typings.highlightWordsCore.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FindAllArgs extends FindChunksArgs {
  var findChunks: js.UndefOr[js.Function1[/* args */ FindChunksArgs, js.Array[Chunk]]] = js.native
}

object FindAllArgs {
  @scala.inline
  def apply(searchWords: js.Array[String], textToHighlight: String): FindAllArgs = {
    val __obj = js.Dynamic.literal(searchWords = searchWords.asInstanceOf[js.Any], textToHighlight = textToHighlight.asInstanceOf[js.Any])
    __obj.asInstanceOf[FindAllArgs]
  }
  @scala.inline
  implicit class FindAllArgsOps[Self <: FindAllArgs] (val x: Self) extends AnyVal {
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
    def setFindChunks(value: /* args */ FindChunksArgs => js.Array[Chunk]): Self = this.set("findChunks", js.Any.fromFunction1(value))
    @scala.inline
    def deleteFindChunks: Self = this.set("findChunks", js.undefined)
  }
  
}

