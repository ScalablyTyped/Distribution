package typings
package gulpDashSassLib.gulpDashSassMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SassOptions extends js.Object {
  var data: js.UndefOr[java.lang.String] = js.undefined
  var error: js.UndefOr[js.Function1[/* err */ nodeLib.Error, _]] = js.undefined
  var file: js.UndefOr[java.lang.String] = js.undefined
  var imagePaths: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var includePaths: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var indentedSyntax: js.UndefOr[scala.Boolean] = js.undefined
  var omitSourceMapUrl: js.UndefOr[scala.Boolean] = js.undefined
  var outFile: js.UndefOr[java.lang.String] = js.undefined
  var outputStyle: js.UndefOr[java.lang.String] = js.undefined
  var precision: js.UndefOr[scala.Double] = js.undefined
  var sourceComments: js.UndefOr[scala.Boolean] = js.undefined
  var sourceMap: js.UndefOr[scala.Boolean | java.lang.String] = js.undefined
  var sourceMapContents: js.UndefOr[scala.Boolean] = js.undefined
  var sourceMapEmbed: js.UndefOr[scala.Boolean] = js.undefined
  var success: js.UndefOr[js.Function1[/* results */ SassResults, _]] = js.undefined
}

object SassOptions {
  @scala.inline
  def apply(
    data: java.lang.String = null,
    error: js.Function1[/* err */ nodeLib.Error, _] = null,
    file: java.lang.String = null,
    imagePaths: js.Array[java.lang.String] = null,
    includePaths: js.Array[java.lang.String] = null,
    indentedSyntax: js.UndefOr[scala.Boolean] = js.undefined,
    omitSourceMapUrl: js.UndefOr[scala.Boolean] = js.undefined,
    outFile: java.lang.String = null,
    outputStyle: java.lang.String = null,
    precision: scala.Int | scala.Double = null,
    sourceComments: js.UndefOr[scala.Boolean] = js.undefined,
    sourceMap: scala.Boolean | java.lang.String = null,
    sourceMapContents: js.UndefOr[scala.Boolean] = js.undefined,
    sourceMapEmbed: js.UndefOr[scala.Boolean] = js.undefined,
    success: js.Function1[/* results */ SassResults, _] = null
  ): SassOptions = {
    val __obj = js.Dynamic.literal()
    if (data != null) __obj.updateDynamic("data")(data)
    if (error != null) __obj.updateDynamic("error")(error)
    if (file != null) __obj.updateDynamic("file")(file)
    if (imagePaths != null) __obj.updateDynamic("imagePaths")(imagePaths)
    if (includePaths != null) __obj.updateDynamic("includePaths")(includePaths)
    if (!js.isUndefined(indentedSyntax)) __obj.updateDynamic("indentedSyntax")(indentedSyntax)
    if (!js.isUndefined(omitSourceMapUrl)) __obj.updateDynamic("omitSourceMapUrl")(omitSourceMapUrl)
    if (outFile != null) __obj.updateDynamic("outFile")(outFile)
    if (outputStyle != null) __obj.updateDynamic("outputStyle")(outputStyle)
    if (precision != null) __obj.updateDynamic("precision")(precision.asInstanceOf[js.Any])
    if (!js.isUndefined(sourceComments)) __obj.updateDynamic("sourceComments")(sourceComments)
    if (sourceMap != null) __obj.updateDynamic("sourceMap")(sourceMap.asInstanceOf[js.Any])
    if (!js.isUndefined(sourceMapContents)) __obj.updateDynamic("sourceMapContents")(sourceMapContents)
    if (!js.isUndefined(sourceMapEmbed)) __obj.updateDynamic("sourceMapEmbed")(sourceMapEmbed)
    if (success != null) __obj.updateDynamic("success")(success)
    __obj.asInstanceOf[SassOptions]
  }
}

