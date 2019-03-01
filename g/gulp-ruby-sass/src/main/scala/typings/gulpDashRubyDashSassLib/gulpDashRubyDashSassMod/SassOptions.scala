package typings
package gulpDashRubyDashSassLib.gulpDashRubyDashSassMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The interface includes all options that available for sass executable.
  * Options are converted from dashed to camelCase
  * @interface SassOptions
  */
trait SassOptions extends js.Object {
  var cacheLocation: js.UndefOr[java.lang.String] = js.undefined
  var check: js.UndefOr[scala.Boolean] = js.undefined
  var compass: js.UndefOr[scala.Boolean] = js.undefined
  var debugInfo: js.UndefOr[scala.Boolean] = js.undefined
  var defaultEncoding: js.UndefOr[java.lang.String] = js.undefined
  var force: js.UndefOr[scala.Boolean] = js.undefined
  var interactive: js.UndefOr[scala.Boolean] = js.undefined
  var lineComments: js.UndefOr[scala.Boolean] = js.undefined
  var lineNumbers: js.UndefOr[scala.Boolean] = js.undefined
  var loadPath: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
  var noCache: js.UndefOr[scala.Boolean] = js.undefined
  var precision: js.UndefOr[scala.Double] = js.undefined
  var quiet: js.UndefOr[scala.Boolean] = js.undefined
  var require: js.UndefOr[java.lang.String] = js.undefined
  var scss: js.UndefOr[scala.Boolean] = js.undefined
  // Actually, there should be a string. However due to ts spec, overriding member should be the same type or a subtype.
  // http://stackoverflow.com/questions/19605557/incompatible-static-properties-in-three-d-ts-with-latest-typescript
  // We need Options.soucemap to be boolean, so here 'any' is used instead of string.
  var sourcemap: js.UndefOr[js.Any] = js.undefined
  var stdin: js.UndefOr[scala.Boolean] = js.undefined
  var stopOnError: js.UndefOr[scala.Boolean] = js.undefined
  var style: js.UndefOr[java.lang.String] = js.undefined
  var trace: js.UndefOr[scala.Boolean] = js.undefined
  var unixNewlines: js.UndefOr[scala.Boolean] = js.undefined
  var update: js.UndefOr[java.lang.String] = js.undefined
  // All listed below options are acceptable by the sass executable and potentially may be used from js.
  // However I doubt are there cases when it's meaningful
  var watch: js.UndefOr[java.lang.String] = js.undefined
}

object SassOptions {
  @scala.inline
  def apply(
    cacheLocation: java.lang.String = null,
    check: js.UndefOr[scala.Boolean] = js.undefined,
    compass: js.UndefOr[scala.Boolean] = js.undefined,
    debugInfo: js.UndefOr[scala.Boolean] = js.undefined,
    defaultEncoding: java.lang.String = null,
    force: js.UndefOr[scala.Boolean] = js.undefined,
    interactive: js.UndefOr[scala.Boolean] = js.undefined,
    lineComments: js.UndefOr[scala.Boolean] = js.undefined,
    lineNumbers: js.UndefOr[scala.Boolean] = js.undefined,
    loadPath: java.lang.String | js.Array[java.lang.String] = null,
    noCache: js.UndefOr[scala.Boolean] = js.undefined,
    precision: scala.Int | scala.Double = null,
    quiet: js.UndefOr[scala.Boolean] = js.undefined,
    require: java.lang.String = null,
    scss: js.UndefOr[scala.Boolean] = js.undefined,
    sourcemap: js.Any = null,
    stdin: js.UndefOr[scala.Boolean] = js.undefined,
    stopOnError: js.UndefOr[scala.Boolean] = js.undefined,
    style: java.lang.String = null,
    trace: js.UndefOr[scala.Boolean] = js.undefined,
    unixNewlines: js.UndefOr[scala.Boolean] = js.undefined,
    update: java.lang.String = null,
    watch: java.lang.String = null
  ): SassOptions = {
    val __obj = js.Dynamic.literal()
    if (cacheLocation != null) __obj.updateDynamic("cacheLocation")(cacheLocation)
    if (!js.isUndefined(check)) __obj.updateDynamic("check")(check)
    if (!js.isUndefined(compass)) __obj.updateDynamic("compass")(compass)
    if (!js.isUndefined(debugInfo)) __obj.updateDynamic("debugInfo")(debugInfo)
    if (defaultEncoding != null) __obj.updateDynamic("defaultEncoding")(defaultEncoding)
    if (!js.isUndefined(force)) __obj.updateDynamic("force")(force)
    if (!js.isUndefined(interactive)) __obj.updateDynamic("interactive")(interactive)
    if (!js.isUndefined(lineComments)) __obj.updateDynamic("lineComments")(lineComments)
    if (!js.isUndefined(lineNumbers)) __obj.updateDynamic("lineNumbers")(lineNumbers)
    if (loadPath != null) __obj.updateDynamic("loadPath")(loadPath.asInstanceOf[js.Any])
    if (!js.isUndefined(noCache)) __obj.updateDynamic("noCache")(noCache)
    if (precision != null) __obj.updateDynamic("precision")(precision.asInstanceOf[js.Any])
    if (!js.isUndefined(quiet)) __obj.updateDynamic("quiet")(quiet)
    if (require != null) __obj.updateDynamic("require")(require)
    if (!js.isUndefined(scss)) __obj.updateDynamic("scss")(scss)
    if (sourcemap != null) __obj.updateDynamic("sourcemap")(sourcemap)
    if (!js.isUndefined(stdin)) __obj.updateDynamic("stdin")(stdin)
    if (!js.isUndefined(stopOnError)) __obj.updateDynamic("stopOnError")(stopOnError)
    if (style != null) __obj.updateDynamic("style")(style)
    if (!js.isUndefined(trace)) __obj.updateDynamic("trace")(trace)
    if (!js.isUndefined(unixNewlines)) __obj.updateDynamic("unixNewlines")(unixNewlines)
    if (update != null) __obj.updateDynamic("update")(update)
    if (watch != null) __obj.updateDynamic("watch")(watch)
    __obj.asInstanceOf[SassOptions]
  }
}

