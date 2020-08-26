package typings.gulpSourcemaps.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WriteOptions extends js.Object {
  var addComment: js.UndefOr[Boolean] = js.native
  @JSName("clone")
  var clone_FWriteOptions: js.UndefOr[Boolean | CloneOptions] = js.native
  var includeContent: js.UndefOr[Boolean] = js.native
  var sourceMappingURLPrefix: js.UndefOr[String | WriteMapper] = js.native
  var sourceRoot: js.UndefOr[String | WriteMapper] = js.native
}

object WriteOptions {
  @scala.inline
  def apply(): WriteOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WriteOptions]
  }
  @scala.inline
  implicit class WriteOptionsOps[Self <: WriteOptions] (val x: Self) extends AnyVal {
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
    def setAddComment(value: Boolean): Self = this.set("addComment", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAddComment: Self = this.set("addComment", js.undefined)
    @scala.inline
    def setClone(value: Boolean | CloneOptions): Self = this.set("clone", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClone: Self = this.set("clone", js.undefined)
    @scala.inline
    def setIncludeContent(value: Boolean): Self = this.set("includeContent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIncludeContent: Self = this.set("includeContent", js.undefined)
    @scala.inline
    def setSourceMappingURLPrefixFunction1(value: /* file */ String => String): Self = this.set("sourceMappingURLPrefix", js.Any.fromFunction1(value))
    @scala.inline
    def setSourceMappingURLPrefix(value: String | WriteMapper): Self = this.set("sourceMappingURLPrefix", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSourceMappingURLPrefix: Self = this.set("sourceMappingURLPrefix", js.undefined)
    @scala.inline
    def setSourceRootFunction1(value: /* file */ String => String): Self = this.set("sourceRoot", js.Any.fromFunction1(value))
    @scala.inline
    def setSourceRoot(value: String | WriteMapper): Self = this.set("sourceRoot", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSourceRoot: Self = this.set("sourceRoot", js.undefined)
  }
  
}

