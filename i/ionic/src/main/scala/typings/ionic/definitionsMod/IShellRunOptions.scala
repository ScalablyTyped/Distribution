package typings.ionic.definitionsMod

import typings.node.NodeJS.ProcessEnv
import typings.node.NodeJS.WritableStream
import typings.node.childProcessMod.SerializationType
import typings.node.childProcessMod.StdioOptions
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
    gid: js.UndefOr[Double] = js.undefined,
    killOnExit: js.UndefOr[Boolean] = js.undefined,
    serialization: SerializationType = null,
    shell: Boolean | String = null,
    showCommand: js.UndefOr[Boolean] = js.undefined,
    showError: js.UndefOr[Boolean] = js.undefined,
    stdio: StdioOptions = null,
    stream: WritableStream = null,
    timeout: js.UndefOr[Double] = js.undefined,
    truncateErrorOutput: js.UndefOr[Double] = js.undefined,
    uid: js.UndefOr[Double] = js.undefined,
    windowsHide: js.UndefOr[Boolean] = js.undefined,
    windowsVerbatimArguments: js.UndefOr[Boolean] = js.undefined
  ): IShellRunOptions = {
    val __obj = js.Dynamic.literal()
    if (argv0 != null) __obj.updateDynamic("argv0")(argv0.asInstanceOf[js.Any])
    if (cwd != null) __obj.updateDynamic("cwd")(cwd.asInstanceOf[js.Any])
    if (!js.isUndefined(detached)) __obj.updateDynamic("detached")(detached.get.asInstanceOf[js.Any])
    if (env != null) __obj.updateDynamic("env")(env.asInstanceOf[js.Any])
    if (!js.isUndefined(fatalOnError)) __obj.updateDynamic("fatalOnError")(fatalOnError.get.asInstanceOf[js.Any])
    if (!js.isUndefined(fatalOnNotFound)) __obj.updateDynamic("fatalOnNotFound")(fatalOnNotFound.get.asInstanceOf[js.Any])
    if (!js.isUndefined(gid)) __obj.updateDynamic("gid")(gid.get.asInstanceOf[js.Any])
    if (!js.isUndefined(killOnExit)) __obj.updateDynamic("killOnExit")(killOnExit.get.asInstanceOf[js.Any])
    if (serialization != null) __obj.updateDynamic("serialization")(serialization.asInstanceOf[js.Any])
    if (shell != null) __obj.updateDynamic("shell")(shell.asInstanceOf[js.Any])
    if (!js.isUndefined(showCommand)) __obj.updateDynamic("showCommand")(showCommand.get.asInstanceOf[js.Any])
    if (!js.isUndefined(showError)) __obj.updateDynamic("showError")(showError.get.asInstanceOf[js.Any])
    if (stdio != null) __obj.updateDynamic("stdio")(stdio.asInstanceOf[js.Any])
    if (stream != null) __obj.updateDynamic("stream")(stream.asInstanceOf[js.Any])
    if (!js.isUndefined(timeout)) __obj.updateDynamic("timeout")(timeout.get.asInstanceOf[js.Any])
    if (!js.isUndefined(truncateErrorOutput)) __obj.updateDynamic("truncateErrorOutput")(truncateErrorOutput.get.asInstanceOf[js.Any])
    if (!js.isUndefined(uid)) __obj.updateDynamic("uid")(uid.get.asInstanceOf[js.Any])
    if (!js.isUndefined(windowsHide)) __obj.updateDynamic("windowsHide")(windowsHide.get.asInstanceOf[js.Any])
    if (!js.isUndefined(windowsVerbatimArguments)) __obj.updateDynamic("windowsVerbatimArguments")(windowsVerbatimArguments.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[IShellRunOptions]
  }
}

