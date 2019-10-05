package typings.atJupyterlabDocmanager.libManagerMod

import typings.atJupyterlabDocmanager.libManagerMod.DocumentManager.IOptions
import typings.atJupyterlabDocmanager.libTokensMod.IDocumentManager
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
    * Test whether the object has been disposed.
    *
    * #### Notes
    * This property is always safe to access.
    */
  /* CompleteClass */
  override val isDisposed: Boolean = js.native
  /**
    * Dispose of the resources held by the object.
    *
    * #### Notes
    * If the object's `dispose` method is called more than once, all
    * calls made after the first will be a no-op.
    *
    * #### Undefined Behavior
    * It is undefined behavior to use any functionality of the object
    * after it has been disposed unless otherwise explicitly noted.
    */
  /* CompleteClass */
  override def dispose(): Unit = js.native
}

