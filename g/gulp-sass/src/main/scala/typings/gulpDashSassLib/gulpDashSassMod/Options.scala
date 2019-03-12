package typings
package gulpDashSassLib.gulpDashSassMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends SassOptions {
  var errLogToConsole: js.UndefOr[scala.Boolean] = js.undefined
  var onError: js.UndefOr[js.Function1[/* err */ stdLib.Error, _]] = js.undefined
  var onSuccess: js.UndefOr[js.Function1[/* css */ java.lang.String, _]] = js.undefined
  var sync: js.UndefOr[scala.Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    data: java.lang.String = null,
    errLogToConsole: js.UndefOr[scala.Boolean] = js.undefined,
    error: /* err */ stdLib.Error => _ = null,
    file: java.lang.String = null,
    imagePaths: js.Array[java.lang.String] = null,
    includePaths: js.Array[java.lang.String] = null,
    indentedSyntax: js.UndefOr[scala.Boolean] = js.undefined,
    omitSourceMapUrl: js.UndefOr[scala.Boolean] = js.undefined,
    onError: /* err */ stdLib.Error => _ = null,
    onSuccess: /* css */ java.lang.String => _ = null,
    outFile: java.lang.String = null,
    outputStyle: java.lang.String = null,
    precision: scala.Int | scala.Double = null,
    sourceComments: js.UndefOr[scala.Boolean] = js.undefined,
    sourceMap: scala.Boolean | java.lang.String = null,
    sourceMapContents: js.UndefOr[scala.Boolean] = js.undefined,
    sourceMapEmbed: js.UndefOr[scala.Boolean] = js.undefined,
    success: /* results */ SassResults => _ = null,
    sync: js.UndefOr[scala.Boolean] = js.undefined
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (data != null) __obj.updateDynamic("data")(data)
    if (!js.isUndefined(errLogToConsole)) __obj.updateDynamic("errLogToConsole")(errLogToConsole)
    if (error != null) __obj.updateDynamic("error")(js.Any.fromFunction1(error))
    if (file != null) __obj.updateDynamic("file")(file)
    if (imagePaths != null) __obj.updateDynamic("imagePaths")(imagePaths)
    if (includePaths != null) __obj.updateDynamic("includePaths")(includePaths)
    if (!js.isUndefined(indentedSyntax)) __obj.updateDynamic("indentedSyntax")(indentedSyntax)
    if (!js.isUndefined(omitSourceMapUrl)) __obj.updateDynamic("omitSourceMapUrl")(omitSourceMapUrl)
    if (onError != null) __obj.updateDynamic("onError")(js.Any.fromFunction1(onError))
    if (onSuccess != null) __obj.updateDynamic("onSuccess")(js.Any.fromFunction1(onSuccess))
    if (outFile != null) __obj.updateDynamic("outFile")(outFile)
    if (outputStyle != null) __obj.updateDynamic("outputStyle")(outputStyle)
    if (precision != null) __obj.updateDynamic("precision")(precision.asInstanceOf[js.Any])
    if (!js.isUndefined(sourceComments)) __obj.updateDynamic("sourceComments")(sourceComments)
    if (sourceMap != null) __obj.updateDynamic("sourceMap")(sourceMap.asInstanceOf[js.Any])
    if (!js.isUndefined(sourceMapContents)) __obj.updateDynamic("sourceMapContents")(sourceMapContents)
    if (!js.isUndefined(sourceMapEmbed)) __obj.updateDynamic("sourceMapEmbed")(sourceMapEmbed)
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1(success))
    if (!js.isUndefined(sync)) __obj.updateDynamic("sync")(sync)
    __obj.asInstanceOf[Options]
  }
}

