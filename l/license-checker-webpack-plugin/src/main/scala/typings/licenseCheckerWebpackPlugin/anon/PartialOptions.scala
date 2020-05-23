package typings.licenseCheckerWebpackPlugin.anon

import typings.licenseCheckerWebpackPlugin.mod.OutputWriter
import typings.std.Record
import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<license-checker-webpack-plugin.license-checker-webpack-plugin.Options> */
trait PartialOptions extends js.Object {
  var allow: js.UndefOr[String] = js.undefined
  var emitError: js.UndefOr[Boolean] = js.undefined
  var filter: js.UndefOr[RegExp] = js.undefined
  var ignore: js.UndefOr[js.Array[String]] = js.undefined
  var outputFilename: js.UndefOr[String] = js.undefined
  var outputWriter: js.UndefOr[String | OutputWriter] = js.undefined
  var `override`: js.UndefOr[Record[String, PartialDependency]] = js.undefined
}

object PartialOptions {
  @scala.inline
  def apply(
    allow: String = null,
    emitError: js.UndefOr[Boolean] = js.undefined,
    filter: RegExp = null,
    ignore: js.Array[String] = null,
    outputFilename: String = null,
    outputWriter: String | OutputWriter = null,
    `override`: Record[String, PartialDependency] = null
  ): PartialOptions = {
    val __obj = js.Dynamic.literal()
    if (allow != null) __obj.updateDynamic("allow")(allow.asInstanceOf[js.Any])
    if (!js.isUndefined(emitError)) __obj.updateDynamic("emitError")(emitError.get.asInstanceOf[js.Any])
    if (filter != null) __obj.updateDynamic("filter")(filter.asInstanceOf[js.Any])
    if (ignore != null) __obj.updateDynamic("ignore")(ignore.asInstanceOf[js.Any])
    if (outputFilename != null) __obj.updateDynamic("outputFilename")(outputFilename.asInstanceOf[js.Any])
    if (outputWriter != null) __obj.updateDynamic("outputWriter")(outputWriter.asInstanceOf[js.Any])
    if (`override` != null) __obj.updateDynamic("override")(`override`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialOptions]
  }
}

