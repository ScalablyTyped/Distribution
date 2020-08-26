package typings.less.Less

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SourceMapOption extends js.Object {
  var outputSourceFiles: js.UndefOr[Boolean] = js.native
  var sourceMapBasepath: js.UndefOr[String] = js.native
  var sourceMapFileInline: js.UndefOr[Boolean] = js.native
  var sourceMapRootpath: js.UndefOr[String] = js.native
  var sourceMapURL: js.UndefOr[String] = js.native
}

object SourceMapOption {
  @scala.inline
  def apply(): SourceMapOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SourceMapOption]
  }
  @scala.inline
  implicit class SourceMapOptionOps[Self <: SourceMapOption] (val x: Self) extends AnyVal {
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
    def setOutputSourceFiles(value: Boolean): Self = this.set("outputSourceFiles", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOutputSourceFiles: Self = this.set("outputSourceFiles", js.undefined)
    @scala.inline
    def setSourceMapBasepath(value: String): Self = this.set("sourceMapBasepath", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSourceMapBasepath: Self = this.set("sourceMapBasepath", js.undefined)
    @scala.inline
    def setSourceMapFileInline(value: Boolean): Self = this.set("sourceMapFileInline", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSourceMapFileInline: Self = this.set("sourceMapFileInline", js.undefined)
    @scala.inline
    def setSourceMapRootpath(value: String): Self = this.set("sourceMapRootpath", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSourceMapRootpath: Self = this.set("sourceMapRootpath", js.undefined)
    @scala.inline
    def setSourceMapURL(value: String): Self = this.set("sourceMapURL", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSourceMapURL: Self = this.set("sourceMapURL", js.undefined)
  }
  
}

