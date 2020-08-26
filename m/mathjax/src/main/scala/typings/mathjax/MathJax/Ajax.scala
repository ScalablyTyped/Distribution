package typings.mathjax.MathJax

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Ajax extends js.Object {
  var STATUS: typings.mathjax.MathJax.STATUS = js.native
  /*An object containing the load hooks for the various files, set up by the LoadHook() method, or by the
    * MathJax.Hub.Register.LoadHook() method.
    */
  var loadHooks: js.Any = js.native
  /*An object containing the names of the files that have been loaded (or requested) so far.
    * MathJax.Ajax.loaded["file"] will be non-null when the file has been loaded, with the value being the
    * MathJax.Ajax.STATUS value of the load attempt.
    */
  var loaded: js.Any = js.native
  /*An object containing the files that are currently loading, the callbacks that are to be run when they load or
    * timeout, and additional internal data.*/
  var loading: Boolean = js.native
  /*Number of milliseconds to wait for a file to load before it is considered to have failed to load.*/
  var timeout: js.UndefOr[Double] = js.native
  /*Used internally to load a given file without checking if it already has been loaded, or where it is to
    * be found.
    */
  def Load(file: String, callBack: js.Any): js.Any = js.native
  /*Registers a callback to be executed when the given file is loaded. The file load operation needs to be started
    * when this method is called, so it can be used to register a hook for a file that may be loaded in the future.
    */
  def LoadHook(file: String, callBack: js.Any): js.Any = js.native
  /*Used with combined configuration files to indicate what files are in the configuration file. Marks the files
    * as loading (since there will never be an explicit Load() or Require() call for them), so that load-hooks and
    * other load-related events can be properly processed when the loadComplete() occurs.
    */
  def Preloading(args: js.Any*): Unit = js.native
  /*Loads the given file if it hasn’t been already. The file must be a JavaScript file or a CSS stylesheet; i.e.,
    * it must end in .js or .css. Alternatively, it can be an object with a single key:value pair where the key is
    * one of js or css and the value is the file of that type to be loaded (this makes it possible to have the file
    * be created by a CGI script, for example, or to use a data:: URL). The file must be relative to the MathJax
    * home directory and can not contain ../ file path components.
    *
    * When the file is completely loaded and run, the callback, if provided, will be executed passing it the status
    * of the file load. If there was an error while loading the file, or if the file fails to load within the time
    * limit given by MathJax.Ajax.timout, the status will be MathJax.Ajax.STATUS.ERROR otherwise it will be
    * MathJax.Ajax.STATUS.OK. If the file is already loaded, the callback will be called immediately and the file
    * will not be loaded again.
    */
  def Require(file: String, callBack: js.Any): js.Any = js.native
  /*Creates a stylesheet from the given style data. styles can either be a string containing a stylesheet
    * definition, or an object containing a CSS Style Object.
    */
  def Styles(styles: js.Any, callback: js.Any): js.Any = js.native
  /*Returns a complete URL to a file (replacing [MathJax] with the actual root URL location).*/
  def fileURL(file: String): String = js.native
  /*Called from within the loaded files to inform MathJax that the file has been completely loaded and
    * initialized. The file parameter is the name of the file that has been loaded. This routine will cause any
    * callback functions registered for the file or included in the MathJax.Ajax.Require() calls to be executed,
    * passing them the status of the load (MathJax.Ajax.STATUS.OK or MathJax.Ajax.STATUS.ERROR) as their
    * last parameter.
    */
  def loadComplete(file: String): Unit = js.native
  /*The default error handler called when a file fails to load. It puts a warning message into the MathJax message
    * box on screen.
    */
  def loadError(file: String): Unit = js.native
  /*Called when the timeout period is over and the file hasn’t loaded. This indicates an error condition, and the
    * MathJax.Ajax.loadError() method will be executed, then the file’s callback will be run with
    * MathJax.Ajax.STATUS.ERROR as its parameter.
    */
  def loadTimeout(file: String): Unit = js.native
}

object Ajax {
  @scala.inline
  def apply(
    Load: (String, js.Any) => js.Any,
    LoadHook: (String, js.Any) => js.Any,
    Preloading: /* repeated */ js.Any => Unit,
    Require: (String, js.Any) => js.Any,
    STATUS: STATUS,
    Styles: (js.Any, js.Any) => js.Any,
    fileURL: String => String,
    loadComplete: String => Unit,
    loadError: String => Unit,
    loadHooks: js.Any,
    loadTimeout: String => Unit,
    loaded: js.Any,
    loading: Boolean
  ): Ajax = {
    val __obj = js.Dynamic.literal(Load = js.Any.fromFunction2(Load), LoadHook = js.Any.fromFunction2(LoadHook), Preloading = js.Any.fromFunction1(Preloading), Require = js.Any.fromFunction2(Require), STATUS = STATUS.asInstanceOf[js.Any], Styles = js.Any.fromFunction2(Styles), fileURL = js.Any.fromFunction1(fileURL), loadComplete = js.Any.fromFunction1(loadComplete), loadError = js.Any.fromFunction1(loadError), loadHooks = loadHooks.asInstanceOf[js.Any], loadTimeout = js.Any.fromFunction1(loadTimeout), loaded = loaded.asInstanceOf[js.Any], loading = loading.asInstanceOf[js.Any])
    __obj.asInstanceOf[Ajax]
  }
  @scala.inline
  implicit class AjaxOps[Self <: Ajax] (val x: Self) extends AnyVal {
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
    def setLoad(value: (String, js.Any) => js.Any): Self = this.set("Load", js.Any.fromFunction2(value))
    @scala.inline
    def setLoadHook(value: (String, js.Any) => js.Any): Self = this.set("LoadHook", js.Any.fromFunction2(value))
    @scala.inline
    def setPreloading(value: /* repeated */ js.Any => Unit): Self = this.set("Preloading", js.Any.fromFunction1(value))
    @scala.inline
    def setRequire(value: (String, js.Any) => js.Any): Self = this.set("Require", js.Any.fromFunction2(value))
    @scala.inline
    def setSTATUS(value: STATUS): Self = this.set("STATUS", value.asInstanceOf[js.Any])
    @scala.inline
    def setStyles(value: (js.Any, js.Any) => js.Any): Self = this.set("Styles", js.Any.fromFunction2(value))
    @scala.inline
    def setFileURL(value: String => String): Self = this.set("fileURL", js.Any.fromFunction1(value))
    @scala.inline
    def setLoadComplete(value: String => Unit): Self = this.set("loadComplete", js.Any.fromFunction1(value))
    @scala.inline
    def setLoadError(value: String => Unit): Self = this.set("loadError", js.Any.fromFunction1(value))
    @scala.inline
    def setLoadHooks(value: js.Any): Self = this.set("loadHooks", value.asInstanceOf[js.Any])
    @scala.inline
    def setLoadTimeout(value: String => Unit): Self = this.set("loadTimeout", js.Any.fromFunction1(value))
    @scala.inline
    def setLoaded(value: js.Any): Self = this.set("loaded", value.asInstanceOf[js.Any])
    @scala.inline
    def setLoading(value: Boolean): Self = this.set("loading", value.asInstanceOf[js.Any])
    @scala.inline
    def setTimeout(value: Double): Self = this.set("timeout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimeout: Self = this.set("timeout", js.undefined)
  }
  
}

