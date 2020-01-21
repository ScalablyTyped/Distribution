package typings.gulpBabel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAst extends js.Object {
  var ast: js.UndefOr[Boolean] = js.undefined
  var auxiliaryCommentAfter: js.UndefOr[js.Any] = js.undefined
  var auxiliaryCommentBefore: js.UndefOr[js.Any] = js.undefined
  var code: js.UndefOr[Boolean] = js.undefined
  var comments: js.UndefOr[Boolean] = js.undefined
  var compact: js.UndefOr[js.Any] = js.undefined
  var env: js.UndefOr[js.Any] = js.undefined
  var filename: js.UndefOr[String] = js.undefined
  var filenameRelative: js.UndefOr[String] = js.undefined
  var getModuleId: js.UndefOr[js.Any] = js.undefined
  var highlightCode: js.UndefOr[Boolean] = js.undefined
  var ignore: js.UndefOr[String | js.Array[String]] = js.undefined
  var inputSourceMap: js.UndefOr[js.Any] = js.undefined
  var keepModuleIdExtesions: js.UndefOr[Boolean] = js.undefined
  var moduleId: js.UndefOr[js.Any] = js.undefined
  var moduleIds: js.UndefOr[js.Any] = js.undefined
  var moduleRoot: js.UndefOr[js.Any] = js.undefined
  var only: js.UndefOr[String | js.Array[String]] = js.undefined
  var plugins: js.UndefOr[js.Array[String]] = js.undefined
  var presets: js.UndefOr[js.Array[String]] = js.undefined
  var resolveModuleSource: js.UndefOr[js.Any] = js.undefined
  var retainLines: js.UndefOr[Boolean] = js.undefined
  var shouldPrintComment: js.UndefOr[js.Any] = js.undefined
  var sourceFileName: js.UndefOr[js.Any] = js.undefined
  var sourceMapTarget: js.UndefOr[js.Any] = js.undefined
  var sourceMaps: js.UndefOr[js.Any] = js.undefined
  var sourceRoot: js.UndefOr[js.Any] = js.undefined
}

object AnonAst {
  @scala.inline
  def apply(
    ast: js.UndefOr[Boolean] = js.undefined,
    auxiliaryCommentAfter: js.Any = null,
    auxiliaryCommentBefore: js.Any = null,
    code: js.UndefOr[Boolean] = js.undefined,
    comments: js.UndefOr[Boolean] = js.undefined,
    compact: js.Any = null,
    env: js.Any = null,
    filename: String = null,
    filenameRelative: String = null,
    getModuleId: js.Any = null,
    highlightCode: js.UndefOr[Boolean] = js.undefined,
    ignore: String | js.Array[String] = null,
    inputSourceMap: js.Any = null,
    keepModuleIdExtesions: js.UndefOr[Boolean] = js.undefined,
    moduleId: js.Any = null,
    moduleIds: js.Any = null,
    moduleRoot: js.Any = null,
    only: String | js.Array[String] = null,
    plugins: js.Array[String] = null,
    presets: js.Array[String] = null,
    resolveModuleSource: js.Any = null,
    retainLines: js.UndefOr[Boolean] = js.undefined,
    shouldPrintComment: js.Any = null,
    sourceFileName: js.Any = null,
    sourceMapTarget: js.Any = null,
    sourceMaps: js.Any = null,
    sourceRoot: js.Any = null
  ): AnonAst = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(ast)) __obj.updateDynamic("ast")(ast.asInstanceOf[js.Any])
    if (auxiliaryCommentAfter != null) __obj.updateDynamic("auxiliaryCommentAfter")(auxiliaryCommentAfter.asInstanceOf[js.Any])
    if (auxiliaryCommentBefore != null) __obj.updateDynamic("auxiliaryCommentBefore")(auxiliaryCommentBefore.asInstanceOf[js.Any])
    if (!js.isUndefined(code)) __obj.updateDynamic("code")(code.asInstanceOf[js.Any])
    if (!js.isUndefined(comments)) __obj.updateDynamic("comments")(comments.asInstanceOf[js.Any])
    if (compact != null) __obj.updateDynamic("compact")(compact.asInstanceOf[js.Any])
    if (env != null) __obj.updateDynamic("env")(env.asInstanceOf[js.Any])
    if (filename != null) __obj.updateDynamic("filename")(filename.asInstanceOf[js.Any])
    if (filenameRelative != null) __obj.updateDynamic("filenameRelative")(filenameRelative.asInstanceOf[js.Any])
    if (getModuleId != null) __obj.updateDynamic("getModuleId")(getModuleId.asInstanceOf[js.Any])
    if (!js.isUndefined(highlightCode)) __obj.updateDynamic("highlightCode")(highlightCode.asInstanceOf[js.Any])
    if (ignore != null) __obj.updateDynamic("ignore")(ignore.asInstanceOf[js.Any])
    if (inputSourceMap != null) __obj.updateDynamic("inputSourceMap")(inputSourceMap.asInstanceOf[js.Any])
    if (!js.isUndefined(keepModuleIdExtesions)) __obj.updateDynamic("keepModuleIdExtesions")(keepModuleIdExtesions.asInstanceOf[js.Any])
    if (moduleId != null) __obj.updateDynamic("moduleId")(moduleId.asInstanceOf[js.Any])
    if (moduleIds != null) __obj.updateDynamic("moduleIds")(moduleIds.asInstanceOf[js.Any])
    if (moduleRoot != null) __obj.updateDynamic("moduleRoot")(moduleRoot.asInstanceOf[js.Any])
    if (only != null) __obj.updateDynamic("only")(only.asInstanceOf[js.Any])
    if (plugins != null) __obj.updateDynamic("plugins")(plugins.asInstanceOf[js.Any])
    if (presets != null) __obj.updateDynamic("presets")(presets.asInstanceOf[js.Any])
    if (resolveModuleSource != null) __obj.updateDynamic("resolveModuleSource")(resolveModuleSource.asInstanceOf[js.Any])
    if (!js.isUndefined(retainLines)) __obj.updateDynamic("retainLines")(retainLines.asInstanceOf[js.Any])
    if (shouldPrintComment != null) __obj.updateDynamic("shouldPrintComment")(shouldPrintComment.asInstanceOf[js.Any])
    if (sourceFileName != null) __obj.updateDynamic("sourceFileName")(sourceFileName.asInstanceOf[js.Any])
    if (sourceMapTarget != null) __obj.updateDynamic("sourceMapTarget")(sourceMapTarget.asInstanceOf[js.Any])
    if (sourceMaps != null) __obj.updateDynamic("sourceMaps")(sourceMaps.asInstanceOf[js.Any])
    if (sourceRoot != null) __obj.updateDynamic("sourceRoot")(sourceRoot.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAst]
  }
}

