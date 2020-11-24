package typings.jupyterlabDocmanager.managerMod

import typings.jupyterlabDocmanager.managerMod.DocumentManager.IOptions
import typings.jupyterlabDocmanager.tokensMod.IDocumentManager
import typings.luminoSignaling.mod.ISignal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@jupyterlab/docmanager/lib/manager", "DocumentManager")
@js.native
class DocumentManager_ protected () extends IDocumentManager {
  /**
    * Construct a new document manager.
    */
  def this(options: IOptions) = this()
  
  var _activateRequested: js.Any = js.native
  
  var _autosave: js.Any = js.native
  
  var _autosaveInterval: js.Any = js.native
  
  var _contexts: js.Any = js.native
  
  /**
    * Get the contexts for a given path.
    *
    * #### Notes
    * There may be more than one context for a given path if the path is open
    * with multiple model factories (for example, a notebook can be open with a
    * notebook model factory and a text model factory).
    */
  var _contextsForPath: js.Any = js.native
  
  /**
    * Create a context from a path and a model factory.
    */
  var _createContext: js.Any = js.native
  
  /**
    * Creates a new document, or loads one from disk, depending on the `which` argument.
    * If `which==='create'`, then it creates a new document. If `which==='open'`,
    * then it loads the document from disk.
    *
    * The two cases differ in how the document context is handled, but the creation
    * of the widget and launching of the kernel are identical.
    */
  var _createOrOpenDocument: js.Any = js.native
  
  var _dialogs: js.Any = js.native
  
  /**
    * Find a context for a given path and factory name.
    */
  var _findContext: js.Any = js.native
  
  var _isDisposed: js.Any = js.native
  
  /**
    * Handle an activateRequested signal from the widget manager.
    */
  var _onActivateRequested: js.Any = js.native
  
  /**
    * Handle a context disposal.
    */
  var _onContextDisposed: js.Any = js.native
  
  var _opener: js.Any = js.native
  
  var _setBusy: js.Any = js.native
  
  var _when: js.Any = js.native
  
  /**
    * Get the widget factory for a given widget name.
    */
  var _widgetFactoryFor: js.Any = js.native
  
  var _widgetManager: js.Any = js.native
  
  /**
    * A signal emitted when one of the documents is activated.
    */
  @JSName("activateRequested")
  def activateRequested_MDocumentManager_ : ISignal[this.type, String] = js.native
  
  /**
    * Determines the time interval for autosave in seconds.
    */
  @JSName("autosaveInterval")
  def autosaveInterval_MDocumentManager_ : Double = js.native
  
  /**
    * Whether to autosave documents.
    */
  @JSName("autosave")
  def autosave_MDocumentManager_ : Boolean = js.native
  
  /**
    * Get whether the document manager has been disposed.
    */
  @JSName("isDisposed")
  def isDisposed_MDocumentManager_ : Boolean = js.native
}
