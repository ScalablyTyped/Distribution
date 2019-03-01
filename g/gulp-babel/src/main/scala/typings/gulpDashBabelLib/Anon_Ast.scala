package typings
package gulpDashBabelLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Ast extends js.Object {
  var ast: js.UndefOr[scala.Boolean] = js.undefined
  var auxiliaryCommentAfter: js.UndefOr[js.Any] = js.undefined
  var auxiliaryCommentBefore: js.UndefOr[js.Any] = js.undefined
  var code: js.UndefOr[scala.Boolean] = js.undefined
  var comments: js.UndefOr[scala.Boolean] = js.undefined
  var compact: js.UndefOr[js.Any] = js.undefined
  var env: js.UndefOr[js.Any] = js.undefined
  var filename: js.UndefOr[java.lang.String] = js.undefined
  var filenameRelative: js.UndefOr[java.lang.String] = js.undefined
  var getModuleId: js.UndefOr[js.Any] = js.undefined
  var highlightCode: js.UndefOr[scala.Boolean] = js.undefined
  var ignore: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
  var inputSourceMap: js.UndefOr[js.Any] = js.undefined
  var keepModuleIdExtesions: js.UndefOr[scala.Boolean] = js.undefined
  var moduleId: js.UndefOr[js.Any] = js.undefined
  var moduleIds: js.UndefOr[js.Any] = js.undefined
  var moduleRoot: js.UndefOr[js.Any] = js.undefined
  var only: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
  var plugins: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var presets: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var resolveModuleSource: js.UndefOr[js.Any] = js.undefined
  var retainLines: js.UndefOr[scala.Boolean] = js.undefined
  var shouldPrintComment: js.UndefOr[js.Any] = js.undefined
  var sourceFileName: js.UndefOr[js.Any] = js.undefined
  var sourceMapTarget: js.UndefOr[js.Any] = js.undefined
  var sourceMaps: js.UndefOr[js.Any] = js.undefined
  var sourceRoot: js.UndefOr[js.Any] = js.undefined
}

object Anon_Ast {
  @scala.inline
  def apply(
    ast: js.UndefOr[scala.Boolean] = js.undefined,
    auxiliaryCommentAfter: js.Any = null,
    auxiliaryCommentBefore: js.Any = null,
    code: js.UndefOr[scala.Boolean] = js.undefined,
    comments: js.UndefOr[scala.Boolean] = js.undefined,
    compact: js.Any = null,
    env: js.Any = null,
    filename: java.lang.String = null,
    filenameRelative: java.lang.String = null,
    getModuleId: js.Any = null,
    highlightCode: js.UndefOr[scala.Boolean] = js.undefined,
    ignore: java.lang.String | js.Array[java.lang.String] = null,
    inputSourceMap: js.Any = null,
    keepModuleIdExtesions: js.UndefOr[scala.Boolean] = js.undefined,
    moduleId: js.Any = null,
    moduleIds: js.Any = null,
    moduleRoot: js.Any = null,
    only: java.lang.String | js.Array[java.lang.String] = null,
    plugins: js.Array[java.lang.String] = null,
    presets: js.Array[java.lang.String] = null,
    resolveModuleSource: js.Any = null,
    retainLines: js.UndefOr[scala.Boolean] = js.undefined,
    shouldPrintComment: js.Any = null,
    sourceFileName: js.Any = null,
    sourceMapTarget: js.Any = null,
    sourceMaps: js.Any = null,
    sourceRoot: js.Any = null
  ): Anon_Ast = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(ast)) __obj.updateDynamic("ast")(ast)
    if (auxiliaryCommentAfter != null) __obj.updateDynamic("auxiliaryCommentAfter")(auxiliaryCommentAfter)
    if (auxiliaryCommentBefore != null) __obj.updateDynamic("auxiliaryCommentBefore")(auxiliaryCommentBefore)
    if (!js.isUndefined(code)) __obj.updateDynamic("code")(code)
    if (!js.isUndefined(comments)) __obj.updateDynamic("comments")(comments)
    if (compact != null) __obj.updateDynamic("compact")(compact)
    if (env != null) __obj.updateDynamic("env")(env)
    if (filename != null) __obj.updateDynamic("filename")(filename)
    if (filenameRelative != null) __obj.updateDynamic("filenameRelative")(filenameRelative)
    if (getModuleId != null) __obj.updateDynamic("getModuleId")(getModuleId)
    if (!js.isUndefined(highlightCode)) __obj.updateDynamic("highlightCode")(highlightCode)
    if (ignore != null) __obj.updateDynamic("ignore")(ignore.asInstanceOf[js.Any])
    if (inputSourceMap != null) __obj.updateDynamic("inputSourceMap")(inputSourceMap)
    if (!js.isUndefined(keepModuleIdExtesions)) __obj.updateDynamic("keepModuleIdExtesions")(keepModuleIdExtesions)
    if (moduleId != null) __obj.updateDynamic("moduleId")(moduleId)
    if (moduleIds != null) __obj.updateDynamic("moduleIds")(moduleIds)
    if (moduleRoot != null) __obj.updateDynamic("moduleRoot")(moduleRoot)
    if (only != null) __obj.updateDynamic("only")(only.asInstanceOf[js.Any])
    if (plugins != null) __obj.updateDynamic("plugins")(plugins)
    if (presets != null) __obj.updateDynamic("presets")(presets)
    if (resolveModuleSource != null) __obj.updateDynamic("resolveModuleSource")(resolveModuleSource)
    if (!js.isUndefined(retainLines)) __obj.updateDynamic("retainLines")(retainLines)
    if (shouldPrintComment != null) __obj.updateDynamic("shouldPrintComment")(shouldPrintComment)
    if (sourceFileName != null) __obj.updateDynamic("sourceFileName")(sourceFileName)
    if (sourceMapTarget != null) __obj.updateDynamic("sourceMapTarget")(sourceMapTarget)
    if (sourceMaps != null) __obj.updateDynamic("sourceMaps")(sourceMaps)
    if (sourceRoot != null) __obj.updateDynamic("sourceRoot")(sourceRoot)
    __obj.asInstanceOf[Anon_Ast]
  }
}

