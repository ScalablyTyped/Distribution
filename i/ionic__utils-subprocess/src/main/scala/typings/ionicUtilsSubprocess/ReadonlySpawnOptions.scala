package typings.ionicUtilsSubprocess

import typings.node.NodeJS.Dict
import typings.node.childProcessMod.SerializationType
import typings.node.childProcessMod.StdioOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Readonly<node.child_process.SpawnOptions> */
trait ReadonlySpawnOptions extends js.Object {
  val argv0: js.UndefOr[String] = js.undefined
  val cwd: js.UndefOr[String] = js.undefined
  val detached: js.UndefOr[Boolean] = js.undefined
  val env: js.UndefOr[Dict[String]] = js.undefined
  val gid: js.UndefOr[Double] = js.undefined
  val serialization: js.UndefOr[SerializationType] = js.undefined
  val shell: js.UndefOr[Boolean | String] = js.undefined
  val stdio: js.UndefOr[StdioOptions] = js.undefined
  val timeout: js.UndefOr[Double] = js.undefined
  val uid: js.UndefOr[Double] = js.undefined
  val windowsHide: js.UndefOr[Boolean] = js.undefined
  val windowsVerbatimArguments: js.UndefOr[Boolean] = js.undefined
}

object ReadonlySpawnOptions {
  @scala.inline
  def apply(
    argv0: String = null,
    cwd: String = null,
    detached: js.UndefOr[Boolean] = js.undefined,
    env: Dict[String] = null,
    gid: Int | Double = null,
    serialization: SerializationType = null,
    shell: Boolean | String = null,
    stdio: StdioOptions = null,
    timeout: Int | Double = null,
    uid: Int | Double = null,
    windowsHide: js.UndefOr[Boolean] = js.undefined,
    windowsVerbatimArguments: js.UndefOr[Boolean] = js.undefined
  ): ReadonlySpawnOptions = {
    val __obj = js.Dynamic.literal()
    if (argv0 != null) __obj.updateDynamic("argv0")(argv0.asInstanceOf[js.Any])
    if (cwd != null) __obj.updateDynamic("cwd")(cwd.asInstanceOf[js.Any])
    if (!js.isUndefined(detached)) __obj.updateDynamic("detached")(detached.asInstanceOf[js.Any])
    if (env != null) __obj.updateDynamic("env")(env.asInstanceOf[js.Any])
    if (gid != null) __obj.updateDynamic("gid")(gid.asInstanceOf[js.Any])
    if (serialization != null) __obj.updateDynamic("serialization")(serialization.asInstanceOf[js.Any])
    if (shell != null) __obj.updateDynamic("shell")(shell.asInstanceOf[js.Any])
    if (stdio != null) __obj.updateDynamic("stdio")(stdio.asInstanceOf[js.Any])
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    if (uid != null) __obj.updateDynamic("uid")(uid.asInstanceOf[js.Any])
    if (!js.isUndefined(windowsHide)) __obj.updateDynamic("windowsHide")(windowsHide.asInstanceOf[js.Any])
    if (!js.isUndefined(windowsVerbatimArguments)) __obj.updateDynamic("windowsVerbatimArguments")(windowsVerbatimArguments.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReadonlySpawnOptions]
  }
}

