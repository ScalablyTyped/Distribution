package typings.mathjax.MathJax

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Ajax extends StObject {
  
  /*Used internally to load a given file without checking if it already has been loaded, or where it is to
    * be found.
    */
  def Load(file: String, callBack: Any): Any
  
  /*Registers a callback to be executed when the given file is loaded. The file load operation needs to be started
    * when this method is called, so it can be used to register a hook for a file that may be loaded in the future.
    */
  def LoadHook(file: String, callBack: Any): Any
  
  /*Used with combined configuration files to indicate what files are in the configuration file. Marks the files
    * as loading (since there will never be an explicit Load() or Require() call for them), so that load-hooks and
    * other load-related events can be properly processed when the loadComplete() occurs.
    */
  def Preloading(args: Any*): Unit
  
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
  def Require(file: String, callBack: Any): Any
  
  var STATUS: typings.mathjax.MathJax.STATUS
  
  /*Creates a stylesheet from the given style data. styles can either be a string containing a stylesheet
    * definition, or an object containing a CSS Style Object.
    */
  def Styles(styles: Any, callback: Any): Any
  
  /*Returns a complete URL to a file (replacing [MathJax] with the actual root URL location).*/
  def fileURL(file: String): String
  
  /*Called from within the loaded files to inform MathJax that the file has been completely loaded and
    * initialized. The file parameter is the name of the file that has been loaded. This routine will cause any
    * callback functions registered for the file or included in the MathJax.Ajax.Require() calls to be executed,
    * passing them the status of the load (MathJax.Ajax.STATUS.OK or MathJax.Ajax.STATUS.ERROR) as their
    * last parameter.
    */
  def loadComplete(file: String): Unit
  
  /*The default error handler called when a file fails to load. It puts a warning message into the MathJax message
    * box on screen.
    */
  def loadError(file: String): Unit
  
  /*An object containing the load hooks for the various files, set up by the LoadHook() method, or by the
    * MathJax.Hub.Register.LoadHook() method.
    */
  var loadHooks: Any
  
  /*Called when the timeout period is over and the file hasn’t loaded. This indicates an error condition, and the
    * MathJax.Ajax.loadError() method will be executed, then the file’s callback will be run with
    * MathJax.Ajax.STATUS.ERROR as its parameter.
    */
  def loadTimeout(file: String): Unit
  
  /*An object containing the names of the files that have been loaded (or requested) so far.
    * MathJax.Ajax.loaded["file"] will be non-null when the file has been loaded, with the value being the
    * MathJax.Ajax.STATUS value of the load attempt.
    */
  var loaded: Any
  
  /*An object containing the files that are currently loading, the callbacks that are to be run when they load or
    * timeout, and additional internal data.*/
  var loading: Boolean
  
  /*Number of milliseconds to wait for a file to load before it is considered to have failed to load.*/
  var timeout: js.UndefOr[Double] = js.undefined
}
object Ajax {
  
  inline def apply(
    Load: (String, Any) => Any,
    LoadHook: (String, Any) => Any,
    Preloading: /* repeated */ Any => Unit,
    Require: (String, Any) => Any,
    STATUS: STATUS,
    Styles: (Any, Any) => Any,
    fileURL: String => String,
    loadComplete: String => Unit,
    loadError: String => Unit,
    loadHooks: Any,
    loadTimeout: String => Unit,
    loaded: Any,
    loading: Boolean
  ): Ajax = {
    val __obj = js.Dynamic.literal(Load = js.Any.fromFunction2(Load), LoadHook = js.Any.fromFunction2(LoadHook), Preloading = js.Any.fromFunction1(Preloading), Require = js.Any.fromFunction2(Require), STATUS = STATUS.asInstanceOf[js.Any], Styles = js.Any.fromFunction2(Styles), fileURL = js.Any.fromFunction1(fileURL), loadComplete = js.Any.fromFunction1(loadComplete), loadError = js.Any.fromFunction1(loadError), loadHooks = loadHooks.asInstanceOf[js.Any], loadTimeout = js.Any.fromFunction1(loadTimeout), loaded = loaded.asInstanceOf[js.Any], loading = loading.asInstanceOf[js.Any])
    __obj.asInstanceOf[Ajax]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Ajax] (val x: Self) extends AnyVal {
    
    inline def setFileURL(value: String => String): Self = StObject.set(x, "fileURL", js.Any.fromFunction1(value))
    
    inline def setLoad(value: (String, Any) => Any): Self = StObject.set(x, "Load", js.Any.fromFunction2(value))
    
    inline def setLoadComplete(value: String => Unit): Self = StObject.set(x, "loadComplete", js.Any.fromFunction1(value))
    
    inline def setLoadError(value: String => Unit): Self = StObject.set(x, "loadError", js.Any.fromFunction1(value))
    
    inline def setLoadHook(value: (String, Any) => Any): Self = StObject.set(x, "LoadHook", js.Any.fromFunction2(value))
    
    inline def setLoadHooks(value: Any): Self = StObject.set(x, "loadHooks", value.asInstanceOf[js.Any])
    
    inline def setLoadTimeout(value: String => Unit): Self = StObject.set(x, "loadTimeout", js.Any.fromFunction1(value))
    
    inline def setLoaded(value: Any): Self = StObject.set(x, "loaded", value.asInstanceOf[js.Any])
    
    inline def setLoading(value: Boolean): Self = StObject.set(x, "loading", value.asInstanceOf[js.Any])
    
    inline def setPreloading(value: /* repeated */ Any => Unit): Self = StObject.set(x, "Preloading", js.Any.fromFunction1(value))
    
    inline def setRequire(value: (String, Any) => Any): Self = StObject.set(x, "Require", js.Any.fromFunction2(value))
    
    inline def setSTATUS(value: STATUS): Self = StObject.set(x, "STATUS", value.asInstanceOf[js.Any])
    
    inline def setStyles(value: (Any, Any) => Any): Self = StObject.set(x, "Styles", js.Any.fromFunction2(value))
    
    inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
  }
}
