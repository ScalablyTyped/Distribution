package typings.jsfl

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Folder extends js.Object {
  var contents: js.Array[File] = js.native
}

object Folder {
  @scala.inline
  def apply(contents: js.Array[File]): Folder = {
    val __obj = js.Dynamic.literal(contents = contents.asInstanceOf[js.Any])
    __obj.asInstanceOf[Folder]
  }
  @scala.inline
  implicit class FolderOps[Self <: Folder] (val x: Self) extends AnyVal {
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
    def setContentsVarargs(value: File*): Self = this.set("contents", js.Array(value :_*))
    @scala.inline
    def setContents(value: js.Array[File]): Self = this.set("contents", value.asInstanceOf[js.Any])
  }
  
}

