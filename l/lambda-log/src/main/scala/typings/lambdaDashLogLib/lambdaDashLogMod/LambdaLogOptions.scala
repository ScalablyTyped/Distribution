package typings
package lambdaDashLogLib.lambdaDashLogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LambdaLogOptions extends js.Object {
  // Enable debugging mode (log.debug messages)
  var debug: js.UndefOr[scala.Boolean] = js.undefined
  // Enable development mode which pretty-prints the log object to the console
  var dev: js.UndefOr[scala.Boolean] = js.undefined
  // Optional function which will run for every log to inject dynamic metadata
  var dynamicMeta: js.UndefOr[js.Function1[/* message */ LogMessage, _]] = js.undefined
  var meta: js.UndefOr[js.Any] = js.undefined
  // Optional replacer function for `JSON.stringify`
  var replacer: js.UndefOr[js.Function2[/* key */ java.lang.String, /* value */ js.Any, _]] = js.undefined
  // Disables logging to the console (used for testing)
  var silent: js.UndefOr[scala.Boolean] = js.undefined
  // Optional stream to write stderr messages to
  var stderrStream: js.UndefOr[nodeLib.fsMod.WriteStream] = js.undefined
  // Optional stream to write stdout messages to
  var stdoutStream: js.UndefOr[nodeLib.fsMod.WriteStream] = js.undefined
  // Global tags array to include with every log
  var tags: js.UndefOr[js.Array[java.lang.String]] = js.undefined
}

object LambdaLogOptions {
  @scala.inline
  def apply(
    debug: js.UndefOr[scala.Boolean] = js.undefined,
    dev: js.UndefOr[scala.Boolean] = js.undefined,
    dynamicMeta: js.Function1[/* message */ LogMessage, _] = null,
    meta: js.Any = null,
    replacer: js.Function2[/* key */ java.lang.String, /* value */ js.Any, _] = null,
    silent: js.UndefOr[scala.Boolean] = js.undefined,
    stderrStream: nodeLib.fsMod.WriteStream = null,
    stdoutStream: nodeLib.fsMod.WriteStream = null,
    tags: js.Array[java.lang.String] = null
  ): LambdaLogOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(debug)) __obj.updateDynamic("debug")(debug)
    if (!js.isUndefined(dev)) __obj.updateDynamic("dev")(dev)
    if (dynamicMeta != null) __obj.updateDynamic("dynamicMeta")(dynamicMeta)
    if (meta != null) __obj.updateDynamic("meta")(meta)
    if (replacer != null) __obj.updateDynamic("replacer")(replacer)
    if (!js.isUndefined(silent)) __obj.updateDynamic("silent")(silent)
    if (stderrStream != null) __obj.updateDynamic("stderrStream")(stderrStream)
    if (stdoutStream != null) __obj.updateDynamic("stdoutStream")(stdoutStream)
    if (tags != null) __obj.updateDynamic("tags")(tags)
    __obj.asInstanceOf[LambdaLogOptions]
  }
}

