package typings.gulpDashNodemon.gulpDashNodemonMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// TODO: Properties may be insufficient
// TODO: In future this interface should be moved to nodemon.d.ts
trait _Option extends js.Object {
  var args: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * Debounce restart in seconds.
    */
  var delay: js.UndefOr[Double] = js.undefined
  var env: js.UndefOr[StringDictionary[String | Boolean | Double]] = js.undefined
  var events: js.UndefOr[StringDictionary[String]] = js.undefined
  /**
    * Execute script with "app", ie. -x "python -v".
    */
  var exec: js.UndefOr[String] = js.undefined
  var execMap: js.UndefOr[StringDictionary[String | Boolean | Double]] = js.undefined
  /**
    * Exit on crash, allows use of nodemon with daemon tools like forever.js.
    */
  var exitcrash: js.UndefOr[Boolean] = js.undefined
  /**
    * Extensions to look for, ie. js,jade,hbs.
    */
  var ext: js.UndefOr[String] = js.undefined
  /**
    * Ignore specific files or directories.
    */
  var ignore: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * Forces node to use the most compatible version for watching file changes.
    */
  var legacyWatch: js.UndefOr[Boolean] = js.undefined
  var nodeArgs: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * Minimise nodemon messages to start/stop only.
    */
  var quiet: js.UndefOr[Boolean] = js.undefined
  var restartable: js.UndefOr[String] = js.undefined
  /**
    * Execute script on change only, not startup
    */
  var runOnChangeOnly: js.UndefOr[Boolean] = js.undefined
  var script: js.UndefOr[String] = js.undefined
  var scriptPosition: js.UndefOr[Double] = js.undefined
  /**
    * Try to read from stdin.
    */
  var stdin: js.UndefOr[Boolean] = js.undefined
  var stdout: js.UndefOr[Boolean] = js.undefined
  /**
    * Show detail on what is causing restarts.
    */
  var verbose: js.UndefOr[Boolean] = js.undefined
  /**
    * Watch directory "dir" or files. use once for each directory or file to watch.
    */
  var watch: js.UndefOr[js.Array[String]] = js.undefined
}

object _Option {
  @scala.inline
  def apply(
    args: js.Array[String] = null,
    delay: Int | Double = null,
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
    scriptPosition: Int | Double = null,
    stdin: js.UndefOr[Boolean] = js.undefined,
    stdout: js.UndefOr[Boolean] = js.undefined,
    verbose: js.UndefOr[Boolean] = js.undefined,
    watch: js.Array[String] = null
  ): _Option = {
    val __obj = js.Dynamic.literal()
    if (args != null) __obj.updateDynamic("args")(args)
    if (delay != null) __obj.updateDynamic("delay")(delay.asInstanceOf[js.Any])
    if (env != null) __obj.updateDynamic("env")(env)
    if (events != null) __obj.updateDynamic("events")(events)
    if (exec != null) __obj.updateDynamic("exec")(exec)
    if (execMap != null) __obj.updateDynamic("execMap")(execMap)
    if (!js.isUndefined(exitcrash)) __obj.updateDynamic("exitcrash")(exitcrash)
    if (ext != null) __obj.updateDynamic("ext")(ext)
    if (ignore != null) __obj.updateDynamic("ignore")(ignore)
    if (!js.isUndefined(legacyWatch)) __obj.updateDynamic("legacyWatch")(legacyWatch)
    if (nodeArgs != null) __obj.updateDynamic("nodeArgs")(nodeArgs)
    if (!js.isUndefined(quiet)) __obj.updateDynamic("quiet")(quiet)
    if (restartable != null) __obj.updateDynamic("restartable")(restartable)
    if (!js.isUndefined(runOnChangeOnly)) __obj.updateDynamic("runOnChangeOnly")(runOnChangeOnly)
    if (script != null) __obj.updateDynamic("script")(script)
    if (scriptPosition != null) __obj.updateDynamic("scriptPosition")(scriptPosition.asInstanceOf[js.Any])
    if (!js.isUndefined(stdin)) __obj.updateDynamic("stdin")(stdin)
    if (!js.isUndefined(stdout)) __obj.updateDynamic("stdout")(stdout)
    if (!js.isUndefined(verbose)) __obj.updateDynamic("verbose")(verbose)
    if (watch != null) __obj.updateDynamic("watch")(watch)
    __obj.asInstanceOf[_Option]
  }
}

