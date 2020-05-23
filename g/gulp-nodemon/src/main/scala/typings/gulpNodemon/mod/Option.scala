package typings.gulpNodemon.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Option extends _Option {
  var tasks: js.UndefOr[
    js.Array[String] | (js.Function1[/* changedFiles */ js.Array[String], js.Array[String]])
  ] = js.undefined
}

object Option {
  @scala.inline
  def apply(
    args: js.Array[String] = null,
    delay: js.UndefOr[Double] = js.undefined,
    env: StringDictionary[String | Boolean | Double] = null,
    events: StringDictionary[String] = null,
    exec: String = null,
    execMap: StringDictionary[String | Boolean | Double] = null,
    exitcrash: js.UndefOr[Boolean] = js.undefined,
    ext: String = null,
    ignore: js.Array[String] = null,
    legacyWatch: js.UndefOr[Boolean] = js.undefined,
    nodeArgs: js.Array[String] = null,
    quiet: js.UndefOr[Boolean] = js.undefined,
    restartable: String = null,
    runOnChangeOnly: js.UndefOr[Boolean] = js.undefined,
    script: String = null,
    scriptPosition: js.UndefOr[Double] = js.undefined,
    stdin: js.UndefOr[Boolean] = js.undefined,
    stdout: js.UndefOr[Boolean] = js.undefined,
    tasks: js.Array[String] | (js.Function1[/* changedFiles */ js.Array[String], js.Array[String]]) = null,
    verbose: js.UndefOr[Boolean] = js.undefined,
    watch: js.Array[String] = null
  ): Option = {
    val __obj = js.Dynamic.literal()
    if (args != null) __obj.updateDynamic("args")(args.asInstanceOf[js.Any])
    if (!js.isUndefined(delay)) __obj.updateDynamic("delay")(delay.get.asInstanceOf[js.Any])
    if (env != null) __obj.updateDynamic("env")(env.asInstanceOf[js.Any])
    if (events != null) __obj.updateDynamic("events")(events.asInstanceOf[js.Any])
    if (exec != null) __obj.updateDynamic("exec")(exec.asInstanceOf[js.Any])
    if (execMap != null) __obj.updateDynamic("execMap")(execMap.asInstanceOf[js.Any])
    if (!js.isUndefined(exitcrash)) __obj.updateDynamic("exitcrash")(exitcrash.get.asInstanceOf[js.Any])
    if (ext != null) __obj.updateDynamic("ext")(ext.asInstanceOf[js.Any])
    if (ignore != null) __obj.updateDynamic("ignore")(ignore.asInstanceOf[js.Any])
    if (!js.isUndefined(legacyWatch)) __obj.updateDynamic("legacyWatch")(legacyWatch.get.asInstanceOf[js.Any])
    if (nodeArgs != null) __obj.updateDynamic("nodeArgs")(nodeArgs.asInstanceOf[js.Any])
    if (!js.isUndefined(quiet)) __obj.updateDynamic("quiet")(quiet.get.asInstanceOf[js.Any])
    if (restartable != null) __obj.updateDynamic("restartable")(restartable.asInstanceOf[js.Any])
    if (!js.isUndefined(runOnChangeOnly)) __obj.updateDynamic("runOnChangeOnly")(runOnChangeOnly.get.asInstanceOf[js.Any])
    if (script != null) __obj.updateDynamic("script")(script.asInstanceOf[js.Any])
    if (!js.isUndefined(scriptPosition)) __obj.updateDynamic("scriptPosition")(scriptPosition.get.asInstanceOf[js.Any])
    if (!js.isUndefined(stdin)) __obj.updateDynamic("stdin")(stdin.get.asInstanceOf[js.Any])
    if (!js.isUndefined(stdout)) __obj.updateDynamic("stdout")(stdout.get.asInstanceOf[js.Any])
    if (tasks != null) __obj.updateDynamic("tasks")(tasks.asInstanceOf[js.Any])
    if (!js.isUndefined(verbose)) __obj.updateDynamic("verbose")(verbose.get.asInstanceOf[js.Any])
    if (watch != null) __obj.updateDynamic("watch")(watch.asInstanceOf[js.Any])
    __obj.asInstanceOf[Option]
  }
}

