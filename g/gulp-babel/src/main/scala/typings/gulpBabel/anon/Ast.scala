package typings.gulpBabel.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Ast extends js.Object {
  var ast: js.UndefOr[Boolean] = js.native
  var auxiliaryCommentAfter: js.UndefOr[js.Any] = js.native
  var auxiliaryCommentBefore: js.UndefOr[js.Any] = js.native
  var code: js.UndefOr[Boolean] = js.native
  var comments: js.UndefOr[Boolean] = js.native
  var compact: js.UndefOr[js.Any] = js.native
  var env: js.UndefOr[js.Any] = js.native
  var filename: js.UndefOr[String] = js.native
  var filenameRelative: js.UndefOr[String] = js.native
  var getModuleId: js.UndefOr[js.Any] = js.native
  var highlightCode: js.UndefOr[Boolean] = js.native
  var ignore: js.UndefOr[String | js.Array[String]] = js.native
  var inputSourceMap: js.UndefOr[js.Any] = js.native
  var keepModuleIdExtesions: js.UndefOr[Boolean] = js.native
  var moduleId: js.UndefOr[js.Any] = js.native
  var moduleIds: js.UndefOr[js.Any] = js.native
  var moduleRoot: js.UndefOr[js.Any] = js.native
  var only: js.UndefOr[String | js.Array[String]] = js.native
  var plugins: js.UndefOr[js.Array[String]] = js.native
  var presets: js.UndefOr[js.Array[String]] = js.native
  var resolveModuleSource: js.UndefOr[js.Any] = js.native
  var retainLines: js.UndefOr[Boolean] = js.native
  var shouldPrintComment: js.UndefOr[js.Any] = js.native
  var sourceFileName: js.UndefOr[js.Any] = js.native
  var sourceMapTarget: js.UndefOr[js.Any] = js.native
  var sourceMaps: js.UndefOr[js.Any] = js.native
  var sourceRoot: js.UndefOr[js.Any] = js.native
}

object Ast {
  @scala.inline
  def apply(): Ast = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Ast]
  }
  @scala.inline
  implicit class AstOps[Self <: Ast] (val x: Self) extends AnyVal {
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
    def setAst(value: Boolean): Self = this.set("ast", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAst: Self = this.set("ast", js.undefined)
    @scala.inline
    def setAuxiliaryCommentAfter(value: js.Any): Self = this.set("auxiliaryCommentAfter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAuxiliaryCommentAfter: Self = this.set("auxiliaryCommentAfter", js.undefined)
    @scala.inline
    def setAuxiliaryCommentBefore(value: js.Any): Self = this.set("auxiliaryCommentBefore", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAuxiliaryCommentBefore: Self = this.set("auxiliaryCommentBefore", js.undefined)
    @scala.inline
    def setCode(value: Boolean): Self = this.set("code", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCode: Self = this.set("code", js.undefined)
    @scala.inline
    def setComments(value: Boolean): Self = this.set("comments", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteComments: Self = this.set("comments", js.undefined)
    @scala.inline
    def setCompact(value: js.Any): Self = this.set("compact", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCompact: Self = this.set("compact", js.undefined)
    @scala.inline
    def setEnv(value: js.Any): Self = this.set("env", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnv: Self = this.set("env", js.undefined)
    @scala.inline
    def setFilename(value: String): Self = this.set("filename", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilename: Self = this.set("filename", js.undefined)
    @scala.inline
    def setFilenameRelative(value: String): Self = this.set("filenameRelative", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilenameRelative: Self = this.set("filenameRelative", js.undefined)
    @scala.inline
    def setGetModuleId(value: js.Any): Self = this.set("getModuleId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGetModuleId: Self = this.set("getModuleId", js.undefined)
    @scala.inline
    def setHighlightCode(value: Boolean): Self = this.set("highlightCode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHighlightCode: Self = this.set("highlightCode", js.undefined)
    @scala.inline
    def setIgnoreVarargs(value: String*): Self = this.set("ignore", js.Array(value :_*))
    @scala.inline
    def setIgnore(value: String | js.Array[String]): Self = this.set("ignore", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIgnore: Self = this.set("ignore", js.undefined)
    @scala.inline
    def setInputSourceMap(value: js.Any): Self = this.set("inputSourceMap", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInputSourceMap: Self = this.set("inputSourceMap", js.undefined)
    @scala.inline
    def setKeepModuleIdExtesions(value: Boolean): Self = this.set("keepModuleIdExtesions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKeepModuleIdExtesions: Self = this.set("keepModuleIdExtesions", js.undefined)
    @scala.inline
    def setModuleId(value: js.Any): Self = this.set("moduleId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteModuleId: Self = this.set("moduleId", js.undefined)
    @scala.inline
    def setModuleIds(value: js.Any): Self = this.set("moduleIds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteModuleIds: Self = this.set("moduleIds", js.undefined)
    @scala.inline
    def setModuleRoot(value: js.Any): Self = this.set("moduleRoot", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteModuleRoot: Self = this.set("moduleRoot", js.undefined)
    @scala.inline
    def setOnlyVarargs(value: String*): Self = this.set("only", js.Array(value :_*))
    @scala.inline
    def setOnly(value: String | js.Array[String]): Self = this.set("only", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnly: Self = this.set("only", js.undefined)
    @scala.inline
    def setPluginsVarargs(value: String*): Self = this.set("plugins", js.Array(value :_*))
    @scala.inline
    def setPlugins(value: js.Array[String]): Self = this.set("plugins", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePlugins: Self = this.set("plugins", js.undefined)
    @scala.inline
    def setPresetsVarargs(value: String*): Self = this.set("presets", js.Array(value :_*))
    @scala.inline
    def setPresets(value: js.Array[String]): Self = this.set("presets", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePresets: Self = this.set("presets", js.undefined)
    @scala.inline
    def setResolveModuleSource(value: js.Any): Self = this.set("resolveModuleSource", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResolveModuleSource: Self = this.set("resolveModuleSource", js.undefined)
    @scala.inline
    def setRetainLines(value: Boolean): Self = this.set("retainLines", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRetainLines: Self = this.set("retainLines", js.undefined)
    @scala.inline
    def setShouldPrintComment(value: js.Any): Self = this.set("shouldPrintComment", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShouldPrintComment: Self = this.set("shouldPrintComment", js.undefined)
    @scala.inline
    def setSourceFileName(value: js.Any): Self = this.set("sourceFileName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSourceFileName: Self = this.set("sourceFileName", js.undefined)
    @scala.inline
    def setSourceMapTarget(value: js.Any): Self = this.set("sourceMapTarget", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSourceMapTarget: Self = this.set("sourceMapTarget", js.undefined)
    @scala.inline
    def setSourceMaps(value: js.Any): Self = this.set("sourceMaps", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSourceMaps: Self = this.set("sourceMaps", js.undefined)
    @scala.inline
    def setSourceRoot(value: js.Any): Self = this.set("sourceRoot", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSourceRoot: Self = this.set("sourceRoot", js.undefined)
  }
  
}

