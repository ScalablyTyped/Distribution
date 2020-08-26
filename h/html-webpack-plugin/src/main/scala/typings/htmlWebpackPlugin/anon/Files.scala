package typings.htmlWebpackPlugin.anon

import typings.htmlWebpackPlugin.mod.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Files extends js.Object {
  var files: Css = js.native
  var options: Options = js.native
  var tags: BodyTags = js.native
}

object Files {
  @scala.inline
  def apply(files: Css, options: Options, tags: BodyTags): Files = {
    val __obj = js.Dynamic.literal(files = files.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[Files]
  }
  @scala.inline
  implicit class FilesOps[Self <: Files] (val x: Self) extends AnyVal {
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
    def setFiles(value: Css): Self = this.set("files", value.asInstanceOf[js.Any])
    @scala.inline
    def setOptions(value: Options): Self = this.set("options", value.asInstanceOf[js.Any])
    @scala.inline
    def setTags(value: BodyTags): Self = this.set("tags", value.asInstanceOf[js.Any])
  }
  
}

