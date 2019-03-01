package typings
package gulpDashRubyDashSassLib.gulpDashRubyDashSassMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The interface includes the node-ruby-sass only options.
  * Attention: sourcemap option type differs from the same SassOption's type.
  * @interface Options
  * @extends SassOptions
  */
trait Options extends SassOptions {
  var bundleExec: js.UndefOr[scala.Boolean] = js.undefined
  var container: js.UndefOr[java.lang.String] = js.undefined
  @JSName("sourcemap")
  var sourcemap_Options: js.UndefOr[scala.Boolean] = js.undefined
  var verbose: js.UndefOr[scala.Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    bundleExec: js.UndefOr[scala.Boolean] = js.undefined,
    cacheLocation: java.lang.String = null,
    check: js.UndefOr[scala.Boolean] = js.undefined,
    compass: js.UndefOr[scala.Boolean] = js.undefined,
    container: java.lang.String = null,
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
    sourcemap: js.UndefOr[scala.Boolean] = js.undefined,
    stdin: js.UndefOr[scala.Boolean] = js.undefined,
    stopOnError: js.UndefOr[scala.Boolean] = js.undefined,
    style: java.lang.String = null,
    trace: js.UndefOr[scala.Boolean] = js.undefined,
    unixNewlines: js.UndefOr[scala.Boolean] = js.undefined,
    update: java.lang.String = null,
    verbose: js.UndefOr[scala.Boolean] = js.undefined,
    watch: java.lang.String = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(bundleExec)) __obj.updateDynamic("bundleExec")(bundleExec)
    if (cacheLocation != null) __obj.updateDynamic("cacheLocation")(cacheLocation)
    if (!js.isUndefined(check)) __obj.updateDynamic("check")(check)
    if (!js.isUndefined(compass)) __obj.updateDynamic("compass")(compass)
    if (container != null) __obj.updateDynamic("container")(container)
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
    if (!js.isUndefined(sourcemap)) __obj.updateDynamic("sourcemap")(sourcemap)
    if (!js.isUndefined(stdin)) __obj.updateDynamic("stdin")(stdin)
    if (!js.isUndefined(stopOnError)) __obj.updateDynamic("stopOnError")(stopOnError)
    if (style != null) __obj.updateDynamic("style")(style)
    if (!js.isUndefined(trace)) __obj.updateDynamic("trace")(trace)
    if (!js.isUndefined(unixNewlines)) __obj.updateDynamic("unixNewlines")(unixNewlines)
    if (update != null) __obj.updateDynamic("update")(update)
    if (!js.isUndefined(verbose)) __obj.updateDynamic("verbose")(verbose)
    if (watch != null) __obj.updateDynamic("watch")(watch)
    __obj.asInstanceOf[Options]
  }
}

