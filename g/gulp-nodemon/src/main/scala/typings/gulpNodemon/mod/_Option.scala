package typings.gulpNodemon.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// TODO: Properties may be insufficient
// TODO: In future this interface should be moved to nodemon.d.ts
@js.native
trait _Option extends js.Object {
  var args: js.UndefOr[js.Array[String]] = js.native
  /**
    * Debounce restart in seconds.
    */
  var delay: js.UndefOr[Double] = js.native
  var env: js.UndefOr[StringDictionary[String | Boolean | Double]] = js.native
  var events: js.UndefOr[StringDictionary[String]] = js.native
  /**
    * Execute script with "app", ie. -x "python -v".
    */
  var exec: js.UndefOr[String] = js.native
  var execMap: js.UndefOr[StringDictionary[String | Boolean | Double]] = js.native
  /**
    * Exit on crash, allows use of nodemon with daemon tools like forever.js.
    */
  var exitcrash: js.UndefOr[Boolean] = js.native
  /**
    * Extensions to look for, ie. js,jade,hbs.
    */
  var ext: js.UndefOr[String] = js.native
  /**
    * Ignore specific files or directories.
    */
  var ignore: js.UndefOr[js.Array[String]] = js.native
  /**
    * Forces node to use the most compatible version for watching file changes.
    */
  var legacyWatch: js.UndefOr[Boolean] = js.native
  var nodeArgs: js.UndefOr[js.Array[String]] = js.native
  /**
    * Minimise nodemon messages to start/stop only.
    */
  var quiet: js.UndefOr[Boolean] = js.native
  var restartable: js.UndefOr[String] = js.native
  /**
    * Execute script on change only, not startup
    */
  var runOnChangeOnly: js.UndefOr[Boolean] = js.native
  var script: js.UndefOr[String] = js.native
  var scriptPosition: js.UndefOr[Double] = js.native
  /**
    * Try to read from stdin.
    */
  var stdin: js.UndefOr[Boolean] = js.native
  var stdout: js.UndefOr[Boolean] = js.native
  /**
    * Show detail on what is causing restarts.
    */
  var verbose: js.UndefOr[Boolean] = js.native
  /**
    * Watch directory "dir" or files. use once for each directory or file to watch.
    */
  var watch: js.UndefOr[js.Array[String]] = js.native
}

object _Option {
  @scala.inline
  def apply(): _Option = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[_Option]
  }
  @scala.inline
  implicit class _OptionOps[Self <: _Option] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setArgsVarargs(value: String*): Self = this.set("args", js.Array(value :_*))
    @scala.inline
    def setArgs(value: js.Array[String]): Self = this.set("args", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteArgs: Self = this.set("args", js.undefined)
    @scala.inline
    def setDelay(value: Double): Self = this.set("delay", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDelay: Self = this.set("delay", js.undefined)
    @scala.inline
    def setEnv(value: StringDictionary[String | Boolean | Double]): Self = this.set("env", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnv: Self = this.set("env", js.undefined)
    @scala.inline
    def setEvents(value: StringDictionary[String]): Self = this.set("events", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEvents: Self = this.set("events", js.undefined)
    @scala.inline
    def setExec(value: String): Self = this.set("exec", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExec: Self = this.set("exec", js.undefined)
    @scala.inline
    def setExecMap(value: StringDictionary[String | Boolean | Double]): Self = this.set("execMap", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExecMap: Self = this.set("execMap", js.undefined)
    @scala.inline
    def setExitcrash(value: Boolean): Self = this.set("exitcrash", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExitcrash: Self = this.set("exitcrash", js.undefined)
    @scala.inline
    def setExt(value: String): Self = this.set("ext", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExt: Self = this.set("ext", js.undefined)
    @scala.inline
    def setIgnoreVarargs(value: String*): Self = this.set("ignore", js.Array(value :_*))
    @scala.inline
    def setIgnore(value: js.Array[String]): Self = this.set("ignore", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIgnore: Self = this.set("ignore", js.undefined)
    @scala.inline
    def setLegacyWatch(value: Boolean): Self = this.set("legacyWatch", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLegacyWatch: Self = this.set("legacyWatch", js.undefined)
    @scala.inline
    def setNodeArgsVarargs(value: String*): Self = this.set("nodeArgs", js.Array(value :_*))
    @scala.inline
    def setNodeArgs(value: js.Array[String]): Self = this.set("nodeArgs", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNodeArgs: Self = this.set("nodeArgs", js.undefined)
    @scala.inline
    def setQuiet(value: Boolean): Self = this.set("quiet", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQuiet: Self = this.set("quiet", js.undefined)
    @scala.inline
    def setRestartable(value: String): Self = this.set("restartable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRestartable: Self = this.set("restartable", js.undefined)
    @scala.inline
    def setRunOnChangeOnly(value: Boolean): Self = this.set("runOnChangeOnly", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRunOnChangeOnly: Self = this.set("runOnChangeOnly", js.undefined)
    @scala.inline
    def setScript(value: String): Self = this.set("script", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScript: Self = this.set("script", js.undefined)
    @scala.inline
    def setScriptPosition(value: Double): Self = this.set("scriptPosition", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScriptPosition: Self = this.set("scriptPosition", js.undefined)
    @scala.inline
    def setStdin(value: Boolean): Self = this.set("stdin", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStdin: Self = this.set("stdin", js.undefined)
    @scala.inline
    def setStdout(value: Boolean): Self = this.set("stdout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStdout: Self = this.set("stdout", js.undefined)
    @scala.inline
    def setVerbose(value: Boolean): Self = this.set("verbose", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVerbose: Self = this.set("verbose", js.undefined)
    @scala.inline
    def setWatchVarargs(value: String*): Self = this.set("watch", js.Array(value :_*))
    @scala.inline
    def setWatch(value: js.Array[String]): Self = this.set("watch", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWatch: Self = this.set("watch", js.undefined)
  }
  
}

