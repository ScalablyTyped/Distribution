package typings.hexoDashUtil.hexoDashUtilMod

import typings.node.BufferEncoding
import typings.node.NodeJS.ProcessEnv
import typings.node.childUnderscoreProcessMod.SerializationType
import typings.node.childUnderscoreProcessMod.SpawnOptions
import typings.node.childUnderscoreProcessMod.StdioOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait hexoSpawnOptions extends SpawnOptions {
  var encoding: js.UndefOr[BufferEncoding] = js.undefined
  var verbose: js.UndefOr[Boolean] = js.undefined
}

object hexoSpawnOptions {
  @scala.inline
  def apply(
    argv0: String = null,
    cwd: String = null,
    detached: js.UndefOr[Boolean] = js.undefined,
    encoding: BufferEncoding = null,
    env: ProcessEnv = null,
    gid: Int | Double = null,
    serialization: SerializationType = null,
    shell: Boolean | String = null,
    stdio: StdioOptions = null,
    timeout: Int | Double = null,
    uid: Int | Double = null,
    verbose: js.UndefOr[Boolean] = js.undefined,
    windowsHide: js.UndefOr[Boolean] = js.undefined,
    windowsVerbatimArguments: js.UndefOr[Boolean] = js.undefined
  ): hexoSpawnOptions = {
    val __obj = js.Dynamic.literal()
    if (argv0 != null) __obj.updateDynamic("argv0")(argv0.asInstanceOf[js.Any])
    if (cwd != null) __obj.updateDynamic("cwd")(cwd.asInstanceOf[js.Any])
    if (!js.isUndefined(detached)) __obj.updateDynamic("detached")(detached.asInstanceOf[js.Any])
    if (encoding != null) __obj.updateDynamic("encoding")(encoding.asInstanceOf[js.Any])
    if (env != null) __obj.updateDynamic("env")(env.asInstanceOf[js.Any])
    if (gid != null) __obj.updateDynamic("gid")(gid.asInstanceOf[js.Any])
    if (serialization != null) __obj.updateDynamic("serialization")(serialization.asInstanceOf[js.Any])
    if (shell != null) __obj.updateDynamic("shell")(shell.asInstanceOf[js.Any])
    if (stdio != null) __obj.updateDynamic("stdio")(stdio.asInstanceOf[js.Any])
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    if (uid != null) __obj.updateDynamic("uid")(uid.asInstanceOf[js.Any])
    if (!js.isUndefined(verbose)) __obj.updateDynamic("verbose")(verbose.asInstanceOf[js.Any])
    if (!js.isUndefined(windowsHide)) __obj.updateDynamic("windowsHide")(windowsHide.asInstanceOf[js.Any])
    if (!js.isUndefined(windowsVerbatimArguments)) __obj.updateDynamic("windowsVerbatimArguments")(windowsVerbatimArguments.asInstanceOf[js.Any])
    __obj.asInstanceOf[hexoSpawnOptions]
  }
}

