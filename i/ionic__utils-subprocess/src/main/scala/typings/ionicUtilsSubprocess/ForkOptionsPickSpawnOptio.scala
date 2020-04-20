package typings.ionicUtilsSubprocess

import typings.node.NodeJS.Dict
import typings.node.childProcessMod.SerializationType
import typings.node.childProcessMod.StdioOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined node.child_process.ForkOptions & std.Pick<node.child_process.SpawnOptions, 'stdio'> */
trait ForkOptionsPickSpawnOptio extends js.Object {
  var cwd: js.UndefOr[String] = js.undefined
  var detached: js.UndefOr[Boolean] = js.undefined
  var env: js.UndefOr[Dict[String]] = js.undefined
  var execArgv: js.UndefOr[js.Array[String]] = js.undefined
  var execPath: js.UndefOr[String] = js.undefined
  var gid: js.UndefOr[Double] = js.undefined
  /**
    * Specify the kind of serialization used for sending messages between processes.
    * @default 'json'
    */
  var serialization: js.UndefOr[SerializationType] = js.undefined
  var silent: js.UndefOr[Boolean] = js.undefined
  var stdio: js.UndefOr[StdioOptions] = js.undefined
  var uid: js.UndefOr[Double] = js.undefined
  var windowsVerbatimArguments: js.UndefOr[Boolean] = js.undefined
}

object ForkOptionsPickSpawnOptio {
  @scala.inline
  def apply(
    cwd: String = null,
    detached: js.UndefOr[Boolean] = js.undefined,
    env: Dict[String] = null,
    execArgv: js.Array[String] = null,
    execPath: String = null,
    gid: Int | Double = null,
    serialization: SerializationType = null,
    silent: js.UndefOr[Boolean] = js.undefined,
    stdio: StdioOptions = null,
    uid: Int | Double = null,
    windowsVerbatimArguments: js.UndefOr[Boolean] = js.undefined
  ): ForkOptionsPickSpawnOptio = {
    val __obj = js.Dynamic.literal()
    if (cwd != null) __obj.updateDynamic("cwd")(cwd.asInstanceOf[js.Any])
    if (!js.isUndefined(detached)) __obj.updateDynamic("detached")(detached.asInstanceOf[js.Any])
    if (env != null) __obj.updateDynamic("env")(env.asInstanceOf[js.Any])
    if (execArgv != null) __obj.updateDynamic("execArgv")(execArgv.asInstanceOf[js.Any])
    if (execPath != null) __obj.updateDynamic("execPath")(execPath.asInstanceOf[js.Any])
    if (gid != null) __obj.updateDynamic("gid")(gid.asInstanceOf[js.Any])
    if (serialization != null) __obj.updateDynamic("serialization")(serialization.asInstanceOf[js.Any])
    if (!js.isUndefined(silent)) __obj.updateDynamic("silent")(silent.asInstanceOf[js.Any])
    if (stdio != null) __obj.updateDynamic("stdio")(stdio.asInstanceOf[js.Any])
    if (uid != null) __obj.updateDynamic("uid")(uid.asInstanceOf[js.Any])
    if (!js.isUndefined(windowsVerbatimArguments)) __obj.updateDynamic("windowsVerbatimArguments")(windowsVerbatimArguments.asInstanceOf[js.Any])
    __obj.asInstanceOf[ForkOptionsPickSpawnOptio]
  }
}

