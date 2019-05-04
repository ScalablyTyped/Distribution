package typings
package atJupyterlabDocmanagerLib.libManagerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/docmanager/lib/manager", "DocumentManager")
@js.native
class DocumentManager protected ()
  extends atPhosphorDisposableLib.atPhosphorDisposableMod.IDisposable {
  /**
    * Construct a new document manager.
    */
  def this(options: atJupyterlabDocmanagerLib.libManagerMod.DocumentManagerNs.IOptions) = this()
  var _activateRequested: js.Any = js.native
  var _autosave: js.Any = js.native
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
    * A signal emitted when one of the documents is activated.
    */
  val activateRequested: atPhosphorSignalingLib.atPhosphorSignalingMod.ISignal[this.type, java.lang.String] = js.native
  /**
    * Whether to autosave documents.
    */
  var autosave: scala.Boolean = js.native
  /**
    * Test whether the object has been disposed.
    *
    * #### Notes
    * This property is always safe to access.
    */
  /* CompleteClass */
  override val isDisposed: scala.Boolean = js.native
  /**
    * The registry used by the manager.
    */
  val registry: atJupyterlabDocregistryLib.atJupyterlabDocregistryMod.DocumentRegistry = js.native
  /**
    * The service manager used by the manager.
    */
  val services: atJupyterlabServicesLib.libManagerMod.ServiceManagerNs.IManager = js.native
  /**
    * Clone a widget.
    *
    * @param widget - The source widget.
    *
    * @returns A new widget or `undefined`.
    *
    * #### Notes
    *  Uses the same widget factory and context as the source, or returns
    *  `undefined` if the source widget is not managed by this manager.
    */
  def cloneWidget(widget: atPhosphorWidgetsLib.atPhosphorWidgetsMod.Widget): js.UndefOr[
    atJupyterlabDocregistryLib.libRegistryMod.IDocumentWidget[
      atPhosphorWidgetsLib.atPhosphorWidgetsMod.Widget, 
      atJupyterlabDocregistryLib.libRegistryMod.DocumentRegistryNs.IModel
    ]
  ] = js.native
  /**
    * Close all of the open documents.
    *
    * @returns A promise resolving when the widgets are closed.
    */
  def closeAll(): js.Promise[scala.Unit] = js.native
  /**
    * Close the widgets associated with a given path.
    *
    * @param path - The target path.
    *
    * @returns A promise resolving when the widgets are closed.
    */
  def closeFile(path: java.lang.String): js.Promise[scala.Unit] = js.native
  /**
    * Get the document context for a widget.
    *
    * @param widget - The widget of interest.
    *
    * @returns The context associated with the widget, or `undefined` if no such
    * context exists.
    */
  def contextForWidget(widget: atPhosphorWidgetsLib.atPhosphorWidgetsMod.Widget): js.UndefOr[atJupyterlabDocregistryLib.libRegistryMod.DocumentRegistryNs.Context] = js.native
  /**
    * Copy a file.
    *
    * @param fromFile - The full path of the original file.
    *
    * @param toDir - The full path to the target directory.
    *
    * @returns A promise which resolves to the contents of the file.
    */
  def copy(fromFile: java.lang.String, toDir: java.lang.String): js.Promise[atJupyterlabServicesLib.libContentsMod.ContentsNs.IModel] = js.native
  /**
    * Create a new file and return the widget used to view it.
    *
    * @param path - The file path to create.
    *
    * @param widgetName - The name of the widget factory to use. 'default' will use the default widget.
    *
    * @param kernel - An optional kernel name/id to override the default.
    *
    * @returns The created widget, or `undefined`.
    *
    * #### Notes
    * This function will return `undefined` if a valid widget factory
    * cannot be found.
    */
  def createNew(path: java.lang.String): atPhosphorWidgetsLib.atPhosphorWidgetsMod.Widget = js.native
  def createNew(path: java.lang.String, widgetName: java.lang.String): atPhosphorWidgetsLib.atPhosphorWidgetsMod.Widget = js.native
  def createNew(
    path: java.lang.String,
    widgetName: java.lang.String,
    kernel: stdLib.Partial[atJupyterlabServicesLib.libKernelKernelMod.KernelNs.IModel]
  ): atPhosphorWidgetsLib.atPhosphorWidgetsMod.Widget = js.native
  /**
    * Delete a file.
    *
    * @param path - The full path to the file to be deleted.
    *
    * @returns A promise which resolves when the file is deleted.
    *
    * #### Notes
    * If there is a running session associated with the file and no other
    * sessions are using the kernel, the session will be shut down.
    */
  def deleteFile(path: java.lang.String): js.Promise[scala.Unit] = js.native
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
  override def dispose(): scala.Unit = js.native
  /**
    * See if a widget already exists for the given path and widget name.
    *
    * @param path - The file path to use.
    *
    * @param widgetName - The name of the widget factory to use. 'default' will use the default widget.
    *
    * @returns The found widget, or `undefined`.
    *
    * #### Notes
    * This can be used to find an existing widget instead of opening
    * a new widget.
    */
  def findWidget(path: java.lang.String): js.UndefOr[
    atJupyterlabDocregistryLib.libRegistryMod.IDocumentWidget[
      atPhosphorWidgetsLib.atPhosphorWidgetsMod.Widget, 
      atJupyterlabDocregistryLib.libRegistryMod.DocumentRegistryNs.IModel
    ]
  ] = js.native
  def findWidget(path: java.lang.String, widgetName: java.lang.String): js.UndefOr[
    atJupyterlabDocregistryLib.libRegistryMod.IDocumentWidget[
      atPhosphorWidgetsLib.atPhosphorWidgetsMod.Widget, 
      atJupyterlabDocregistryLib.libRegistryMod.DocumentRegistryNs.IModel
    ]
  ] = js.native
  /**
    * Create a new untitled file.
    *
    * @param options - The file content creation options.
    */
  def newUntitled(options: atJupyterlabServicesLib.libContentsMod.ContentsNs.ICreateOptions): js.Promise[atJupyterlabServicesLib.libContentsMod.ContentsNs.IModel] = js.native
  /**
    * Open a file and return the widget used to view it.
    *
    * @param path - The file path to open.
    *
    * @param widgetName - The name of the widget factory to use. 'default' will use the default widget.
    *
    * @param kernel - An optional kernel name/id to override the default.
    *
    * @returns The created widget, or `undefined`.
    *
    * #### Notes
    * This function will return `undefined` if a valid widget factory
    * cannot be found.
    */
  def open(path: java.lang.String): js.UndefOr[
    atJupyterlabDocregistryLib.libRegistryMod.IDocumentWidget[
      atPhosphorWidgetsLib.atPhosphorWidgetsMod.Widget, 
      atJupyterlabDocregistryLib.libRegistryMod.DocumentRegistryNs.IModel
    ]
  ] = js.native
  def open(path: java.lang.String, widgetName: java.lang.String): js.UndefOr[
    atJupyterlabDocregistryLib.libRegistryMod.IDocumentWidget[
      atPhosphorWidgetsLib.atPhosphorWidgetsMod.Widget, 
      atJupyterlabDocregistryLib.libRegistryMod.DocumentRegistryNs.IModel
    ]
  ] = js.native
  def open(
    path: java.lang.String,
    widgetName: java.lang.String,
    kernel: stdLib.Partial[atJupyterlabServicesLib.libKernelKernelMod.KernelNs.IModel]
  ): js.UndefOr[
    atJupyterlabDocregistryLib.libRegistryMod.IDocumentWidget[
      atPhosphorWidgetsLib.atPhosphorWidgetsMod.Widget, 
      atJupyterlabDocregistryLib.libRegistryMod.DocumentRegistryNs.IModel
    ]
  ] = js.native
  def open(
    path: java.lang.String,
    widgetName: java.lang.String,
    kernel: stdLib.Partial[atJupyterlabServicesLib.libKernelKernelMod.KernelNs.IModel],
    options: atJupyterlabDocregistryLib.libRegistryMod.DocumentRegistryNs.IOpenOptions
  ): js.UndefOr[
    atJupyterlabDocregistryLib.libRegistryMod.IDocumentWidget[
      atPhosphorWidgetsLib.atPhosphorWidgetsMod.Widget, 
      atJupyterlabDocregistryLib.libRegistryMod.DocumentRegistryNs.IModel
    ]
  ] = js.native
  /**
    * Open a file and return the widget used to view it.
    * Reveals an already existing editor.
    *
    * @param path - The file path to open.
    *
    * @param widgetName - The name of the widget factory to use. 'default' will use the default widget.
    *
    * @param kernel - An optional kernel name/id to override the default.
    *
    * @returns The created widget, or `undefined`.
    *
    * #### Notes
    * This function will return `undefined` if a valid widget factory
    * cannot be found.
    */
  def openOrReveal(path: java.lang.String): js.UndefOr[
    atJupyterlabDocregistryLib.libRegistryMod.IDocumentWidget[
      atPhosphorWidgetsLib.atPhosphorWidgetsMod.Widget, 
      atJupyterlabDocregistryLib.libRegistryMod.DocumentRegistryNs.IModel
    ]
  ] = js.native
  def openOrReveal(path: java.lang.String, widgetName: java.lang.String): js.UndefOr[
    atJupyterlabDocregistryLib.libRegistryMod.IDocumentWidget[
      atPhosphorWidgetsLib.atPhosphorWidgetsMod.Widget, 
      atJupyterlabDocregistryLib.libRegistryMod.DocumentRegistryNs.IModel
    ]
  ] = js.native
  def openOrReveal(
    path: java.lang.String,
    widgetName: java.lang.String,
    kernel: stdLib.Partial[atJupyterlabServicesLib.libKernelKernelMod.KernelNs.IModel]
  ): js.UndefOr[
    atJupyterlabDocregistryLib.libRegistryMod.IDocumentWidget[
      atPhosphorWidgetsLib.atPhosphorWidgetsMod.Widget, 
      atJupyterlabDocregistryLib.libRegistryMod.DocumentRegistryNs.IModel
    ]
  ] = js.native
  def openOrReveal(
    path: java.lang.String,
    widgetName: java.lang.String,
    kernel: stdLib.Partial[atJupyterlabServicesLib.libKernelKernelMod.KernelNs.IModel],
    options: atJupyterlabDocregistryLib.libRegistryMod.DocumentRegistryNs.IOpenOptions
  ): js.UndefOr[
    atJupyterlabDocregistryLib.libRegistryMod.IDocumentWidget[
      atPhosphorWidgetsLib.atPhosphorWidgetsMod.Widget, 
      atJupyterlabDocregistryLib.libRegistryMod.DocumentRegistryNs.IModel
    ]
  ] = js.native
  /**
    * Overwrite a file.
    *
    * @param oldPath - The full path to the original file.
    *
    * @param newPath - The full path to the new file.
    *
    * @returns A promise containing the new file contents model.
    */
  def overwrite(oldPath: java.lang.String, newPath: java.lang.String): js.Promise[atJupyterlabServicesLib.libContentsMod.ContentsNs.IModel] = js.native
  /**
    * Rename a file or directory.
    *
    * @param oldPath - The full path to the original file.
    *
    * @param newPath - The full path to the new file.
    *
    * @returns A promise containing the new file contents model.  The promise
    * will reject if the newPath already exists.  Use [[overwrite]] to overwrite
    * a file.
    */
  def rename(oldPath: java.lang.String, newPath: java.lang.String): js.Promise[atJupyterlabServicesLib.libContentsMod.ContentsNs.IModel] = js.native
}

