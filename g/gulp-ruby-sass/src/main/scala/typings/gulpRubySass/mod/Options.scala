package typings.gulpRubySass.mod

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
  var bundleExec: js.UndefOr[Boolean] = js.undefined
  var container: js.UndefOr[String] = js.undefined
  @JSName("sourcemap")
  var sourcemap_Options: js.UndefOr[Boolean] = js.undefined
  var verbose: js.UndefOr[Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    bundleExec: js.UndefOr[Boolean] = js.undefined,
    cacheLocation: String = null,
    check: js.UndefOr[Boolean] = js.undefined,
    compass: js.UndefOr[Boolean] = js.undefined,
    container: String = null,
    debugInfo: js.UndefOr[Boolean] = js.undefined,
    defaultEncoding: String = null,
    force: js.UndefOr[Boolean] = js.undefined,
    interactive: js.UndefOr[Boolean] = js.undefined,
    lineComments: js.UndefOr[Boolean] = js.undefined,
    lineNumbers: js.UndefOr[Boolean] = js.undefined,
    loadPath: String | js.Array[String] = null,
    noCache: js.UndefOr[Boolean] = js.undefined,
    precision: Int | Double = null,
    quiet: js.UndefOr[Boolean] = js.undefined,
    require: String = null,
    scss: js.UndefOr[Boolean] = js.undefined,
    sourcemap: js.UndefOr[Boolean] = js.undefined,
    stdin: js.UndefOr[Boolean] = js.undefined,
    stopOnError: js.UndefOr[Boolean] = js.undefined,
    style: String = null,
    trace: js.UndefOr[Boolean] = js.undefined,
    unixNewlines: js.UndefOr[Boolean] = js.undefined,
    update: String = null,
    verbose: js.UndefOr[Boolean] = js.undefined,
    watch: String = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(bundleExec)) __obj.updateDynamic("bundleExec")(bundleExec.asInstanceOf[js.Any])
    if (cacheLocation != null) __obj.updateDynamic("cacheLocation")(cacheLocation.asInstanceOf[js.Any])
    if (!js.isUndefined(check)) __obj.updateDynamic("check")(check.asInstanceOf[js.Any])
    if (!js.isUndefined(compass)) __obj.updateDynamic("compass")(compass.asInstanceOf[js.Any])
    if (container != null) __obj.updateDynamic("container")(container.asInstanceOf[js.Any])
    if (!js.isUndefined(debugInfo)) __obj.updateDynamic("debugInfo")(debugInfo.asInstanceOf[js.Any])
    if (defaultEncoding != null) __obj.updateDynamic("defaultEncoding")(defaultEncoding.asInstanceOf[js.Any])
    if (!js.isUndefined(force)) __obj.updateDynamic("force")(force.asInstanceOf[js.Any])
    if (!js.isUndefined(interactive)) __obj.updateDynamic("interactive")(interactive.asInstanceOf[js.Any])
    if (!js.isUndefined(lineComments)) __obj.updateDynamic("lineComments")(lineComments.asInstanceOf[js.Any])
    if (!js.isUndefined(lineNumbers)) __obj.updateDynamic("lineNumbers")(lineNumbers.asInstanceOf[js.Any])
    if (loadPath != null) __obj.updateDynamic("loadPath")(loadPath.asInstanceOf[js.Any])
    if (!js.isUndefined(noCache)) __obj.updateDynamic("noCache")(noCache.asInstanceOf[js.Any])
    if (precision != null) __obj.updateDynamic("precision")(precision.asInstanceOf[js.Any])
    if (!js.isUndefined(quiet)) __obj.updateDynamic("quiet")(quiet.asInstanceOf[js.Any])
    if (require != null) __obj.updateDynamic("require")(require.asInstanceOf[js.Any])
    if (!js.isUndefined(scss)) __obj.updateDynamic("scss")(scss.asInstanceOf[js.Any])
    if (!js.isUndefined(sourcemap)) __obj.updateDynamic("sourcemap")(sourcemap.asInstanceOf[js.Any])
    if (!js.isUndefined(stdin)) __obj.updateDynamic("stdin")(stdin.asInstanceOf[js.Any])
    if (!js.isUndefined(stopOnError)) __obj.updateDynamic("stopOnError")(stopOnError.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (!js.isUndefined(trace)) __obj.updateDynamic("trace")(trace.asInstanceOf[js.Any])
    if (!js.isUndefined(unixNewlines)) __obj.updateDynamic("unixNewlines")(unixNewlines.asInstanceOf[js.Any])
    if (update != null) __obj.updateDynamic("update")(update.asInstanceOf[js.Any])
    if (!js.isUndefined(verbose)) __obj.updateDynamic("verbose")(verbose.asInstanceOf[js.Any])
    if (watch != null) __obj.updateDynamic("watch")(watch.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

