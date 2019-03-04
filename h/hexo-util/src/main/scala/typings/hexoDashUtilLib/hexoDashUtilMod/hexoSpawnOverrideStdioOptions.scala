package typings
package hexoDashUtilLib.hexoDashUtilMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait hexoSpawnOverrideStdioOptions extends hexoSpawnOptions {
  @JSName("stdio")
  var stdio_hexoSpawnOverrideStdioOptions: nodeLib.childUnderscoreProcessMod.StdioOptions
}

object hexoSpawnOverrideStdioOptions {
  @scala.inline
  def apply(
    stdio: nodeLib.childUnderscoreProcessMod.StdioOptions,
    argv0: java.lang.String = null,
    cwd: java.lang.String = null,
    detached: js.UndefOr[scala.Boolean] = js.undefined,
    encoding: nodeLib.BufferEncoding = null,
    env: nodeLib.NodeJSNs.ProcessEnv = null,
    gid: scala.Int | scala.Double = null,
    shell: scala.Boolean | java.lang.String = null,
    timeout: scala.Int | scala.Double = null,
    uid: scala.Int | scala.Double = null,
    verbose: js.UndefOr[scala.Boolean] = js.undefined,
    windowsHide: js.UndefOr[scala.Boolean] = js.undefined,
    windowsVerbatimArguments: js.UndefOr[scala.Boolean] = js.undefined
  ): hexoSpawnOverrideStdioOptions = {
    val __obj = js.Dynamic.literal(stdio = stdio.asInstanceOf[js.Any])
    if (argv0 != null) __obj.updateDynamic("argv0")(argv0)
    if (cwd != null) __obj.updateDynamic("cwd")(cwd)
    if (!js.isUndefined(detached)) __obj.updateDynamic("detached")(detached)
    if (encoding != null) __obj.updateDynamic("encoding")(encoding)
    if (env != null) __obj.updateDynamic("env")(env)
    if (gid != null) __obj.updateDynamic("gid")(gid.asInstanceOf[js.Any])
    if (shell != null) __obj.updateDynamic("shell")(shell.asInstanceOf[js.Any])
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    if (uid != null) __obj.updateDynamic("uid")(uid.asInstanceOf[js.Any])
    if (!js.isUndefined(verbose)) __obj.updateDynamic("verbose")(verbose)
    if (!js.isUndefined(windowsHide)) __obj.updateDynamic("windowsHide")(windowsHide)
    if (!js.isUndefined(windowsVerbatimArguments)) __obj.updateDynamic("windowsVerbatimArguments")(windowsVerbatimArguments)
    __obj.asInstanceOf[hexoSpawnOverrideStdioOptions]
  }
}

