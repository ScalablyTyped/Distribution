package typings.gulpDashSass.gulpDashSassMod

import typings.nodeDashSass.nodeDashSassMod.FunctionDeclarations
import typings.nodeDashSass.nodeDashSassMod.Importer
import typings.nodeDashSass.nodeDashSassMod.SassFunction
import typings.nodeDashSass.nodeDashSassStrings.compact
import typings.nodeDashSass.nodeDashSassStrings.compressed
import typings.nodeDashSass.nodeDashSassStrings.expanded
import typings.nodeDashSass.nodeDashSassStrings.nested
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GulpSassOptions extends SassOptions {
  var errLogToConsole: js.UndefOr[Boolean] = js.undefined
  var onError: js.UndefOr[js.Function1[/* err */ Error, _]] = js.undefined
  var onSuccess: js.UndefOr[js.Function1[/* css */ String, _]] = js.undefined
  var sync: js.UndefOr[Boolean] = js.undefined
}

object GulpSassOptions {
  @scala.inline
  def apply(
    data: String = null,
    errLogToConsole: js.UndefOr[Boolean] = js.undefined,
    error: /* err */ Error => _ = null,
    file: String = null,
    functions: FunctionDeclarations[SassFunction] = null,
    imagePaths: js.Array[String] = null,
    importer: Importer | js.Array[Importer] = null,
    includePaths: js.Array[String] = null,
    indentType: String = null,
    indentWidth: Int | Double = null,
    indentedSyntax: js.UndefOr[Boolean] = js.undefined,
    linefeed: String = null,
    omitSourceMapUrl: js.UndefOr[Boolean] = js.undefined,
    onError: /* err */ Error => _ = null,
    onSuccess: /* css */ String => _ = null,
    outFile: String = null,
    outputStyle: compact | compressed | expanded | nested = null,
    precision: Int | Double = null,
    sourceComments: js.UndefOr[Boolean] = js.undefined,
    sourceMap: Boolean | String = null,
    sourceMapContents: js.UndefOr[Boolean] = js.undefined,
    sourceMapEmbed: js.UndefOr[Boolean] = js.undefined,
    sourceMapRoot: String = null,
    success: /* results */ SassResults => _ = null,
    sync: js.UndefOr[Boolean] = js.undefined
  ): GulpSassOptions = {
    val __obj = js.Dynamic.literal()
    if (data != null) __obj.updateDynamic("data")(data)
    if (!js.isUndefined(errLogToConsole)) __obj.updateDynamic("errLogToConsole")(errLogToConsole)
    if (error != null) __obj.updateDynamic("error")(js.Any.fromFunction1(error))
    if (file != null) __obj.updateDynamic("file")(file)
    if (functions != null) __obj.updateDynamic("functions")(functions)
    if (imagePaths != null) __obj.updateDynamic("imagePaths")(imagePaths)
    if (importer != null) __obj.updateDynamic("importer")(importer.asInstanceOf[js.Any])
    if (includePaths != null) __obj.updateDynamic("includePaths")(includePaths)
    if (indentType != null) __obj.updateDynamic("indentType")(indentType)
    if (indentWidth != null) __obj.updateDynamic("indentWidth")(indentWidth.asInstanceOf[js.Any])
    if (!js.isUndefined(indentedSyntax)) __obj.updateDynamic("indentedSyntax")(indentedSyntax)
    if (linefeed != null) __obj.updateDynamic("linefeed")(linefeed)
    if (!js.isUndefined(omitSourceMapUrl)) __obj.updateDynamic("omitSourceMapUrl")(omitSourceMapUrl)
    if (onError != null) __obj.updateDynamic("onError")(js.Any.fromFunction1(onError))
    if (onSuccess != null) __obj.updateDynamic("onSuccess")(js.Any.fromFunction1(onSuccess))
    if (outFile != null) __obj.updateDynamic("outFile")(outFile)
    if (outputStyle != null) __obj.updateDynamic("outputStyle")(outputStyle.asInstanceOf[js.Any])
    if (precision != null) __obj.updateDynamic("precision")(precision.asInstanceOf[js.Any])
    if (!js.isUndefined(sourceComments)) __obj.updateDynamic("sourceComments")(sourceComments)
    if (sourceMap != null) __obj.updateDynamic("sourceMap")(sourceMap.asInstanceOf[js.Any])
    if (!js.isUndefined(sourceMapContents)) __obj.updateDynamic("sourceMapContents")(sourceMapContents)
    if (!js.isUndefined(sourceMapEmbed)) __obj.updateDynamic("sourceMapEmbed")(sourceMapEmbed)
    if (sourceMapRoot != null) __obj.updateDynamic("sourceMapRoot")(sourceMapRoot)
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1(success))
    if (!js.isUndefined(sync)) __obj.updateDynamic("sync")(sync)
    __obj.asInstanceOf[GulpSassOptions]
  }
}

