package typings.koaMulter.mod.koaAugmentingMod

import typings.std.File
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DefaultContext extends js.Object {
  var file: File = js.native
  var files: js.Array[File] = js.native
}

object DefaultContext {
  @scala.inline
  def apply(file: File, files: js.Array[File]): DefaultContext = {
    val __obj = js.Dynamic.literal(file = file.asInstanceOf[js.Any], files = files.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefaultContext]
  }
  @scala.inline
  implicit class DefaultContextOps[Self <: DefaultContext] (val x: Self) extends AnyVal {
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
    def setFile(value: File): Self = this.set("file", value.asInstanceOf[js.Any])
    @scala.inline
    def setFilesVarargs(value: File*): Self = this.set("files", js.Array(value :_*))
    @scala.inline
    def setFiles(value: js.Array[File]): Self = this.set("files", value.asInstanceOf[js.Any])
  }
  
}

