package typings
package kssLib.kssMod.kssNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KssOptions extends Options {
  var builder: js.UndefOr[js.Any] = js.undefined
  @JSName("clone")
  var clone_FKssOptions: js.UndefOr[scala.Boolean] = js.undefined
  var custom: js.UndefOr[js.Any] = js.undefined
  var json: js.UndefOr[scala.Boolean] = js.undefined
  var logErrorFunction: js.UndefOr[js.Function1[/* repeated */ java.lang.String, scala.Unit]] = js.undefined
  var source: js.Array[java.lang.String]
  var verbose: js.UndefOr[scala.Boolean] = js.undefined
}

object KssOptions {
  @scala.inline
  def apply(
    source: js.Array[java.lang.String],
    builder: js.Any = null,
    clone: js.UndefOr[scala.Boolean] = js.undefined,
    custom: js.Any = null,
    header: js.UndefOr[scala.Boolean] = js.undefined,
    json: js.UndefOr[scala.Boolean] = js.undefined,
    logErrorFunction: js.Function1[/* repeated */ java.lang.String, scala.Unit] = null,
    markdown: js.UndefOr[scala.Boolean] = js.undefined,
    mask: java.lang.String | stdLib.RegExp = null,
    verbose: js.UndefOr[scala.Boolean] = js.undefined
  ): KssOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("source")(source)
    if (builder != null) __obj.updateDynamic("builder")(builder)
    if (!js.isUndefined(clone)) __obj.updateDynamic("clone")(clone)
    if (custom != null) __obj.updateDynamic("custom")(custom)
    if (!js.isUndefined(header)) __obj.updateDynamic("header")(header)
    if (!js.isUndefined(json)) __obj.updateDynamic("json")(json)
    if (logErrorFunction != null) __obj.updateDynamic("logErrorFunction")(logErrorFunction)
    if (!js.isUndefined(markdown)) __obj.updateDynamic("markdown")(markdown)
    if (mask != null) __obj.updateDynamic("mask")(mask.asInstanceOf[js.Any])
    if (!js.isUndefined(verbose)) __obj.updateDynamic("verbose")(verbose)
    __obj.asInstanceOf[KssOptions]
  }
}

