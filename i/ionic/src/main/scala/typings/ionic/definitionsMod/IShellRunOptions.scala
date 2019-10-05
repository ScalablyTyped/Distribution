package typings.ionic.definitionsMod

import typings.node.NodeJS.ProcessEnv
import typings.node.NodeJS.WritableStream
import typings.node.childUnderscoreProcessMod.StdioOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IShellRunOptions extends IShellOutputOptions {
  var killOnExit: js.UndefOr[Boolean] = js.undefined
  var stream: js.UndefOr[WritableStream] = js.undefined
  var truncateErrorOutput: js.UndefOr[Double] = js.undefined
}

object IShellRunOptions {
  @scala.inline
  def apply(
    argv0: String = null,
    cwd: String = null,
    detached: js.UndefOr[Boolean] = js.undefined,
    env: ProcessEnv = null,
    fatalOnError: js.UndefOr[Boolean] = js.undefined,
    fatalOnNotFound: js.UndefOr[Boolean] = js.undefined,
    gid: Int | Double = null,
    killOnExit: js.UndefOr[Boolean] = js.undefined,
    shell: Boolean | String = null,
    showCommand: js.UndefOr[Boolean] = js.undefined,
    showError: js.UndefOr[Boolean] = js.undefined,
    stdio: StdioOptions = null,
    stream: WritableStream = null,
    timeout: Int | Double = null,
    truncateErrorOutput: Int | Double = null,
    uid: Int | Double = null,
    windowsHide: js.UndefOr[Boolean] = js.undefined,
    windowsVerbatimArguments: js.UndefOr[Boolean] = js.undefined
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

