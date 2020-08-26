package typings.jsmediatags.flactagcontentsMod

import typings.jsmediatags.typesMod.ByteArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FLACTagContents extends js.Object {
  var blocks: js.Array[MetadataBlock] = js.native
  def toArray(): ByteArray = js.native
}

object FLACTagContents {
  @scala.inline
  def apply(blocks: js.Array[MetadataBlock], toArray: () => ByteArray): FLACTagContents = {
    val __obj = js.Dynamic.literal(blocks = blocks.asInstanceOf[js.Any], toArray = js.Any.fromFunction0(toArray))
    __obj.asInstanceOf[FLACTagContents]
  }
  @scala.inline
  implicit class FLACTagContentsOps[Self <: FLACTagContents] (val x: Self) extends AnyVal {
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
    def setBlocksVarargs(value: MetadataBlock*): Self = this.set("blocks", js.Array(value :_*))
    @scala.inline
    def setBlocks(value: js.Array[MetadataBlock]): Self = this.set("blocks", value.asInstanceOf[js.Any])
    @scala.inline
    def setToArray(value: () => ByteArray): Self = this.set("toArray", js.Any.fromFunction0(value))
  }
  
}

