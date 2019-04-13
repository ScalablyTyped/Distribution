package typings
package koaDashStaticLib.koaDashStaticMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options
  extends koaDashSendLib.koaDashSendMod.SendOptions {
  /** If true, serves after return next(), allowing any downstream middleware to respond first. */
  var defer: js.UndefOr[scala.Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    brotli: js.UndefOr[scala.Boolean] = js.undefined,
    defer: js.UndefOr[scala.Boolean] = js.undefined,
    extensions: js.Array[java.lang.String] | koaDashSendLib.koaDashSendLibNumbers.`false` = null,
    format: js.UndefOr[scala.Boolean] = js.undefined,
    gzip: js.UndefOr[scala.Boolean] = js.undefined,
    hidden: js.UndefOr[scala.Boolean] = js.undefined,
    immutable: js.UndefOr[scala.Boolean] = js.undefined,
    index: java.lang.String | koaDashSendLib.koaDashSendLibNumbers.`false` = null,
    maxAge: scala.Int | scala.Double = null,
    maxage: scala.Int | scala.Double = null,
    root: java.lang.String = null,
    setHeaders: koaDashSendLib.koaDashSendMod.SetHeaders = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(brotli)) __obj.updateDynamic("brotli")(brotli)
    if (!js.isUndefined(defer)) __obj.updateDynamic("defer")(defer)
    if (extensions != null) __obj.updateDynamic("extensions")(extensions.asInstanceOf[js.Any])
    if (!js.isUndefined(format)) __obj.updateDynamic("format")(format)
    if (!js.isUndefined(gzip)) __obj.updateDynamic("gzip")(gzip)
    if (!js.isUndefined(hidden)) __obj.updateDynamic("hidden")(hidden)
    if (!js.isUndefined(immutable)) __obj.updateDynamic("immutable")(immutable)
    if (index != null) __obj.updateDynamic("index")(index.asInstanceOf[js.Any])
    if (maxAge != null) __obj.updateDynamic("maxAge")(maxAge.asInstanceOf[js.Any])
    if (maxage != null) __obj.updateDynamic("maxage")(maxage.asInstanceOf[js.Any])
    if (root != null) __obj.updateDynamic("root")(root)
    if (setHeaders != null) __obj.updateDynamic("setHeaders")(setHeaders)
    __obj.asInstanceOf[Options]
  }
}

