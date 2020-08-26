package typings.htmlWebpackTagsPlugin.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BaseTagOptions extends CommonOptions {
  var glob: js.UndefOr[String] = js.native
  var globFlatten: js.UndefOr[Boolean] = js.native
  var globPath: js.UndefOr[String] = js.native
  var sourcePath: js.UndefOr[String] = js.native
}

object BaseTagOptions {
  @scala.inline
  def apply(): BaseTagOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BaseTagOptions]
  }
  @scala.inline
  implicit class BaseTagOptionsOps[Self <: BaseTagOptions] (val x: Self) extends AnyVal {
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
    def setGlob(value: String): Self = this.set("glob", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGlob: Self = this.set("glob", js.undefined)
    @scala.inline
    def setGlobFlatten(value: Boolean): Self = this.set("globFlatten", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGlobFlatten: Self = this.set("globFlatten", js.undefined)
    @scala.inline
    def setGlobPath(value: String): Self = this.set("globPath", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGlobPath: Self = this.set("globPath", js.undefined)
    @scala.inline
    def setSourcePath(value: String): Self = this.set("sourcePath", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSourcePath: Self = this.set("sourcePath", js.undefined)
  }
  
}

