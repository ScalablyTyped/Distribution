package typings.liftoff.liftoffMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LaunchOptions extends js.Object {
  var completion: js.UndefOr[String] = js.undefined
  /**
    * Don't search for a config, use the one provided.
    * **Note**: Liftoff will assume the current working directory is the directory containing the config file
    * unless an alternate location is explicitly specified using `cwd`.
    * @default null
    */
  var configPath: js.UndefOr[String] = js.undefined
  /**
    * Change the current working directory for this launch. Relative paths are calculated against `process.cwd()`.
    * @default process.cwd()
    */
  var cwd: js.UndefOr[String] = js.undefined
  /**
    * Allows you to force node or V8 flags during the launch.
    * This is useful if you need to make sure certain flags will always be enabled
    * or if you need to enable flags that don't show up in `opts.v8flags`
    * (as these flags aren't validated against opts.v8flags).
    * @default null
    */
  var forcedFlags: js.UndefOr[
    String | js.Array[String] | (js.Function1[/* env */ LiftoffEnv, String | js.Array[String]])
  ] = js.undefined
  /**
    * A string or array of modules to attempt requiring from the local
    * working directory before invoking the launch callback.
    * @default null
    */
  var require: js.UndefOr[String | js.Array[_]] = js.undefined
}

object LaunchOptions {
  @scala.inline
  def apply(
    completion: String = null,
    configPath: String = null,
    cwd: String = null,
    forcedFlags: String | js.Array[String] | (js.Function1[/* env */ LiftoffEnv, String | js.Array[String]]) = null,
    require: String | js.Array[_] = null
  ): LaunchOptions = {
    val __obj = js.Dynamic.literal()
    if (completion != null) __obj.updateDynamic("completion")(completion.asInstanceOf[js.Any])
    if (configPath != null) __obj.updateDynamic("configPath")(configPath.asInstanceOf[js.Any])
    if (cwd != null) __obj.updateDynamic("cwd")(cwd.asInstanceOf[js.Any])
    if (forcedFlags != null) __obj.updateDynamic("forcedFlags")(forcedFlags.asInstanceOf[js.Any])
    if (require != null) __obj.updateDynamic("require")(require.asInstanceOf[js.Any])
    __obj.asInstanceOf[LaunchOptions]
  }
}

