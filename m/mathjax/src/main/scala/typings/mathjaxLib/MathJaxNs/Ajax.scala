package typings
package mathjaxLib.MathJaxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Ajax extends js.Object {
  var STATUS: STATUS
  /*An object containing the load hooks for the various files, set up by the LoadHook() method, or by the
          * MathJax.Hub.Register.LoadHook() method.
          */
  var loadHooks: js.Any
  /*An object containing the names of the files that have been loaded (or requested) so far.
          * MathJax.Ajax.loaded["file"] will be non-null when the file has been loaded, with the value being the
          * MathJax.Ajax.STATUS value of the load attempt.
          */
  var loaded: js.Any
  /*An object containing the files that are currently loading, the callbacks that are to be run when they load or
          * timeout, and additional internal data.*/
  var loading: scala.Boolean
  /*Number of milliseconds to wait for a file to load before it is considered to have failed to load.*/
  var timeout: js.UndefOr[scala.Double] = js.undefined
  /*Used internally to load a given file without checking if it already has been loaded, or where it is to
          * be found.
          */
  def Load(file: java.lang.String, callBack: js.Any): js.Any
  /*Registers a callback to be executed when the given file is loaded. The file load operation needs to be started
          * when this method is called, so it can be used to register a hook for a file that may be loaded in the future.
          */
  def LoadHook(file: java.lang.String, callBack: js.Any): js.Any
  /*Used with combined configuration files to indicate what files are in the configuration file. Marks the files
          * as loading (since there will never be an explicit Load() or Require() call for them), so that load-hooks and
          * other load-related events can be properly processed when the loadComplete() occurs.
          */
  def Preloading(args: js.Any*): scala.Unit
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
  def Require(file: java.lang.String, callBack: js.Any): js.Any
  /*Creates a stylesheet from the given style data. styles can either be a string containing a stylesheet
          * definition, or an object containing a CSS Style Object.
          */
  def Styles(styles: js.Any, callback: js.Any): js.Any
  /*Returns a complete URL to a file (replacing [MathJax] with the actual root URL location).*/
  def fileURL(file: java.lang.String): java.lang.String
  /*Called from within the loaded files to inform MathJax that the file has been completely loaded and
          * initialized. The file parameter is the name of the file that has been loaded. This routine will cause any
          * callback functions registered for the file or included in the MathJax.Ajax.Require() calls to be executed,
          * passing them the status of the load (MathJax.Ajax.STATUS.OK or MathJax.Ajax.STATUS.ERROR) as their
          * last parameter.
          */
  def loadComplete(file: java.lang.String): scala.Unit
  /*The default error handler called when a file fails to load. It puts a warning message into the MathJax message
          * box on screen.
          */
  def loadError(file: java.lang.String): scala.Unit
  /*Called when the timeout period is over and the file hasn’t loaded. This indicates an error condition, and the
          * MathJax.Ajax.loadError() method will be executed, then the file’s callback will be run with
          * MathJax.Ajax.STATUS.ERROR as its parameter.
          */
  def loadTimeout(file: java.lang.String): scala.Unit
}

