package typings.graphqlToolsLoadFiles.mod

import typings.globby.mod.GlobbyOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LoadFilesOptions extends js.Object {
  var exportNames: js.UndefOr[js.Array[String]] = js.native
  var extensions: js.UndefOr[js.Array[String]] = js.native
  var globOptions: js.UndefOr[GlobbyOptions] = js.native
  var ignoreIndex: js.UndefOr[Boolean] = js.native
  var ignoredExtensions: js.UndefOr[js.Array[String]] = js.native
  var recursive: js.UndefOr[Boolean] = js.native
  var requireMethod: js.UndefOr[js.Any] = js.native
  var useRequire: js.UndefOr[Boolean] = js.native
}

object LoadFilesOptions {
  @scala.inline
  def apply(): LoadFilesOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LoadFilesOptions]
  }
  @scala.inline
  implicit class LoadFilesOptionsOps[Self <: LoadFilesOptions] (val x: Self) extends AnyVal {
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
    def setExportNamesVarargs(value: String*): Self = this.set("exportNames", js.Array(value :_*))
    @scala.inline
    def setExportNames(value: js.Array[String]): Self = this.set("exportNames", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExportNames: Self = this.set("exportNames", js.undefined)
    @scala.inline
    def setExtensionsVarargs(value: String*): Self = this.set("extensions", js.Array(value :_*))
    @scala.inline
    def setExtensions(value: js.Array[String]): Self = this.set("extensions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExtensions: Self = this.set("extensions", js.undefined)
    @scala.inline
    def setGlobOptions(value: GlobbyOptions): Self = this.set("globOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGlobOptions: Self = this.set("globOptions", js.undefined)
    @scala.inline
    def setIgnoreIndex(value: Boolean): Self = this.set("ignoreIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIgnoreIndex: Self = this.set("ignoreIndex", js.undefined)
    @scala.inline
    def setIgnoredExtensionsVarargs(value: String*): Self = this.set("ignoredExtensions", js.Array(value :_*))
    @scala.inline
    def setIgnoredExtensions(value: js.Array[String]): Self = this.set("ignoredExtensions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIgnoredExtensions: Self = this.set("ignoredExtensions", js.undefined)
    @scala.inline
    def setRecursive(value: Boolean): Self = this.set("recursive", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRecursive: Self = this.set("recursive", js.undefined)
    @scala.inline
    def setRequireMethod(value: js.Any): Self = this.set("requireMethod", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRequireMethod: Self = this.set("requireMethod", js.undefined)
    @scala.inline
    def setUseRequire(value: Boolean): Self = this.set("useRequire", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUseRequire: Self = this.set("useRequire", js.undefined)
  }
  
}

