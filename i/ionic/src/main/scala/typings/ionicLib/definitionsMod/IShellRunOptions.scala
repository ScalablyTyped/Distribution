package typings
package ionicLib.definitionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IShellRunOptions extends IShellOutputOptions {
  var killOnExit: js.UndefOr[scala.Boolean] = js.undefined
  var stream: js.UndefOr[nodeLib.NodeJSNs.WritableStream] = js.undefined
  var truncateErrorOutput: js.UndefOr[scala.Double] = js.undefined
}

object IShellRunOptions {
  @scala.inline
  def apply(
    argv0: java.lang.String = null,
    cwd: java.lang.String = null,
    detached: js.UndefOr[scala.Boolean] = js.undefined,
    env: nodeLib.NodeJSNs.ProcessEnv = null,
    fatalOnError: js.UndefOr[scala.Boolean] = js.undefined,
    fatalOnNotFound: js.UndefOr[scala.Boolean] = js.undefined,
    gid: scala.Int | scala.Double = null,
    killOnExit: js.UndefOr[scala.Boolean] = js.undefined,
    shell: scala.Boolean | java.lang.String = null,
    showCommand: js.UndefOr[scala.Boolean] = js.undefined,
    showError: js.UndefOr[scala.Boolean] = js.undefined,
    stdio: nodeLib.childUnderscoreProcessMod.StdioOptions = null,
    stream: nodeLib.NodeJSNs.WritableStream = null,
    timeout: scala.Int | scala.Double = null,
    truncateErrorOutput: scala.Int | scala.Double = null,
    uid: scala.Int | scala.Double = null,
    windowsHide: js.UndefOr[scala.Boolean] = js.undefined,
    windowsVerbatimArguments: js.UndefOr[scala.Boolean] = js.undefined
  ): IShellRunOptions = {
    val __obj = js.Dynamic.literal()
    if (argv0 != null) __obj.updateDynamic("argv0")(argv0)
    if (cwd != null) __obj.updateDynamic("cwd")(cwd)
    if (!js.isUndefined(detached)) __obj.updateDynamic("detached")(detached)
    if (env != null) __obj.updateDynamic("env")(env)
    if (!js.isUndefined(fatalOnError)) __obj.updateDynamic("fatalOnError")(fatalOnError)
    if (!js.isUndefined(fatalOnNotFound)) __obj.updateDynamic("fatalOnNotFound")(fatalOnNotFound)
    if (gid != null) __obj.updateDynamic("gid")(gid.asInstanceOf[js.Any])
    if (!js.isUndefined(killOnExit)) __obj.updateDynamic("killOnExit")(killOnExit)
    if (shell != null) __obj.updateDynamic("shell")(shell.asInstanceOf[js.Any])
    if (!js.isUndefined(showCommand)) __obj.updateDynamic("showCommand")(showCommand)
    if (!js.isUndefined(showError)) __obj.updateDynamic("showError")(showError)
    if (stdio != null) __obj.updateDynamic("stdio")(stdio.asInstanceOf[js.Any])
    if (stream != null) __obj.updateDynamic("stream")(stream)
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    if (truncateErrorOutput != null) __obj.updateDynamic("truncateErrorOutput")(truncateErrorOutput.asInstanceOf[js.Any])
    if (uid != null) __obj.updateDynamic("uid")(uid.asInstanceOf[js.Any])
    if (!js.isUndefined(windowsHide)) __obj.updateDynamic("windowsHide")(windowsHide)
    if (!js.isUndefined(windowsVerbatimArguments)) __obj.updateDynamic("windowsVerbatimArguments")(windowsVerbatimArguments)
    __obj.asInstanceOf[IShellRunOptions]
  }
}

