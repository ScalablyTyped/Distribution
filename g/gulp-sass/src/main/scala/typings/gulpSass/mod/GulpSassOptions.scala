package typings.gulpSass.mod

import typings.nodeSass.mod.FunctionDeclarations
import typings.nodeSass.mod.Importer
import typings.nodeSass.mod.SassFunction
import typings.nodeSass.nodeSassStrings.compact
import typings.nodeSass.nodeSassStrings.compressed
import typings.nodeSass.nodeSassStrings.expanded
import typings.nodeSass.nodeSassStrings.nested
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
    indentWidth: js.UndefOr[Double] = js.undefined,
    indentedSyntax: js.UndefOr[Boolean] = js.undefined,
    linefeed: String = null,
    omitSourceMapUrl: js.UndefOr[Boolean] = js.undefined,
    onError: /* err */ Error => _ = null,
    onSuccess: /* css */ String => _ = null,
    outFile: String = null,
    outputStyle: compact | compressed | expanded | nested = null,
    precision: js.UndefOr[Double] = js.undefined,
    sourceComments: js.UndefOr[Boolean] = js.undefined,
    sourceMap: Boolean | String = null,
    sourceMapContents: js.UndefOr[Boolean] = js.undefined,
    sourceMapEmbed: js.UndefOr[Boolean] = js.undefined,
    sourceMapRoot: String = null,
    success: /* results */ SassResults => _ = null,
    sync: js.UndefOr[Boolean] = js.undefined
  ): GulpSassOptions = {
    val __obj = js.Dynamic.literal()
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (!js.isUndefined(errLogToConsole)) __obj.updateDynamic("errLogToConsole")(errLogToConsole.get.asInstanceOf[js.Any])
    if (error != null) __obj.updateDynamic("error")(js.Any.fromFunction1(error))
    if (file != null) __obj.updateDynamic("file")(file.asInstanceOf[js.Any])
    if (functions != null) __obj.updateDynamic("functions")(functions.asInstanceOf[js.Any])
    if (imagePaths != null) __obj.updateDynamic("imagePaths")(imagePaths.asInstanceOf[js.Any])
    if (importer != null) __obj.updateDynamic("importer")(importer.asInstanceOf[js.Any])
    if (includePaths != null) __obj.updateDynamic("includePaths")(includePaths.asInstanceOf[js.Any])
    if (indentType != null) __obj.updateDynamic("indentType")(indentType.asInstanceOf[js.Any])
    if (!js.isUndefined(indentWidth)) __obj.updateDynamic("indentWidth")(indentWidth.get.asInstanceOf[js.Any])
    if (!js.isUndefined(indentedSyntax)) __obj.updateDynamic("indentedSyntax")(indentedSyntax.get.asInstanceOf[js.Any])
    if (linefeed != null) __obj.updateDynamic("linefeed")(linefeed.asInstanceOf[js.Any])
    if (!js.isUndefined(omitSourceMapUrl)) __obj.updateDynamic("omitSourceMapUrl")(omitSourceMapUrl.get.asInstanceOf[js.Any])
    if (onError != null) __obj.updateDynamic("onError")(js.Any.fromFunction1(onError))
    if (onSuccess != null) __obj.updateDynamic("onSuccess")(js.Any.fromFunction1(onSuccess))
    if (outFile != null) __obj.updateDynamic("outFile")(outFile.asInstanceOf[js.Any])
    if (outputStyle != null) __obj.updateDynamic("outputStyle")(outputStyle.asInstanceOf[js.Any])
    if (!js.isUndefined(precision)) __obj.updateDynamic("precision")(precision.get.asInstanceOf[js.Any])
    if (!js.isUndefined(sourceComments)) __obj.updateDynamic("sourceComments")(sourceComments.get.asInstanceOf[js.Any])
    if (sourceMap != null) __obj.updateDynamic("sourceMap")(sourceMap.asInstanceOf[js.Any])
    if (!js.isUndefined(sourceMapContents)) __obj.updateDynamic("sourceMapContents")(sourceMapContents.get.asInstanceOf[js.Any])
    if (!js.isUndefined(sourceMapEmbed)) __obj.updateDynamic("sourceMapEmbed")(sourceMapEmbed.get.asInstanceOf[js.Any])
    if (sourceMapRoot != null) __obj.updateDynamic("sourceMapRoot")(sourceMapRoot.asInstanceOf[js.Any])
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1(success))
    if (!js.isUndefined(sync)) __obj.updateDynamic("sync")(sync.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GulpSassOptions]
  }
}

