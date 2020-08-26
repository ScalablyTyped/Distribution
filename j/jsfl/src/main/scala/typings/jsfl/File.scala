package typings.jsfl

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait File extends js.Object {
  var contents: String = js.native
  def copy(path: String): File = js.native
  def write(data: String): File = js.native
}

object File {
  @scala.inline
  def apply(contents: String, copy: String => File, write: String => File): File = {
    val __obj = js.Dynamic.literal(contents = contents.asInstanceOf[js.Any], copy = js.Any.fromFunction1(copy), write = js.Any.fromFunction1(write))
    __obj.asInstanceOf[File]
  }
  @scala.inline
  implicit class FileOps[Self <: File] (val x: Self) extends AnyVal {
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
    def setContents(value: String): Self = this.set("contents", value.asInstanceOf[js.Any])
    @scala.inline
    def setCopy(value: String => File): Self = this.set("copy", js.Any.fromFunction1(value))
    @scala.inline
    def setWrite(value: String => File): Self = this.set("write", js.Any.fromFunction1(value))
  }
  
}

