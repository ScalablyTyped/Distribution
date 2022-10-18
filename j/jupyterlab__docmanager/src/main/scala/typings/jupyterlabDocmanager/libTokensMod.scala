package typings.jupyterlabDocmanager

import typings.jupyterlabDocmanager.anon.PartialIModel
import typings.jupyterlabDocregistry.libRegistryMod.DocumentRegistry.Context
import typings.jupyterlabDocregistry.libRegistryMod.DocumentRegistry.IModel
import typings.jupyterlabDocregistry.libRegistryMod.DocumentRegistry.IOpenOptions
import typings.jupyterlabDocregistry.libRegistryMod.IDocumentWidget
import typings.jupyterlabDocregistry.mod.DocumentRegistry
import typings.jupyterlabServices.libContentsMod.Contents.ICreateOptions
import typings.jupyterlabServices.libManagerMod.ServiceManager.IManager
import typings.luminoCoreutils.mod.Token
import typings.luminoDisposable.mod.IDisposable
import typings.luminoSignaling.mod.ISignal
import typings.luminoWidgets.mod.Widget
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTokensMod {
  
  @js.native
  trait IDocumentManager
    extends StObject
       with IDisposable {
    
    /**
      * A signal emitted when one of the documents is activated.
      */
    val activateRequested: ISignal[this.type, String] = js.native
    
    /**
      * Whether to autosave documents.
      */
    var autosave: Boolean = js.native
    
    /**
      * Determines the time interval for autosave in seconds.
      */
    var autosaveInterval: Double = js.native
    
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
    def cloneWidget(widget: Widget): js.UndefOr[IDocumentWidget[Widget, IModel]] = js.native
    
    /**
      * Close all of the open documents.
      *
      * @returns A promise resolving when the widgets are closed.
      */
    def closeAll(): js.Promise[Unit] = js.native
    
    /**
      * Close the widgets associated with a given path.
      *
      * @param path - The target path.
      *
      * @returns A promise resolving when the widgets are closed.
      */
    def closeFile(path: String): js.Promise[Unit] = js.native
    
    /**
      * Get the document context for a widget.
      *
      * @param widget - The widget of interest.
      *
      * @returns The context associated with the widget, or `undefined` if no such
      * context exists.
      */
    def contextForWidget(widget: Widget): js.UndefOr[Context] = js.native
    
    /**
      * Copy a file.
      *
      * @param fromFile - The full path of the original file.
      *
      * @param toDir - The full path to the target directory.
      *
      * @returns A promise which resolves to the contents of the file.
      */
    def copy(fromFile: String, toDir: String): js.Promise[typings.jupyterlabServices.libContentsMod.Contents.IModel] = js.native
    
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
    def createNew(path: String): js.UndefOr[Widget] = js.native
    def createNew(path: String, widgetName: String): js.UndefOr[Widget] = js.native
    def createNew(path: String, widgetName: String, kernel: PartialIModel): js.UndefOr[Widget] = js.native
    def createNew(path: String, widgetName: Unit, kernel: PartialIModel): js.UndefOr[Widget] = js.native
    
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
    def deleteFile(path: String): js.Promise[Unit] = js.native
    
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
    def findWidget(path: String): js.UndefOr[IDocumentWidget[Widget, IModel]] = js.native
    def findWidget(path: String, widgetName: String): js.UndefOr[IDocumentWidget[Widget, IModel]] = js.native
    
    /**
      * Create a new untitled file.
      *
      * @param options - The file content creation options.
      */
    def newUntitled(options: ICreateOptions): js.Promise[typings.jupyterlabServices.libContentsMod.Contents.IModel] = js.native
    
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
    def open(path: String): js.UndefOr[IDocumentWidget[Widget, IModel]] = js.native
    def open(path: String, widgetName: String): js.UndefOr[IDocumentWidget[Widget, IModel]] = js.native
    def open(path: String, widgetName: String, kernel: Unit, options: IOpenOptions): js.UndefOr[IDocumentWidget[Widget, IModel]] = js.native
    def open(path: String, widgetName: String, kernel: PartialIModel): js.UndefOr[IDocumentWidget[Widget, IModel]] = js.native
    def open(path: String, widgetName: String, kernel: PartialIModel, options: IOpenOptions): js.UndefOr[IDocumentWidget[Widget, IModel]] = js.native
    def open(path: String, widgetName: Unit, kernel: Unit, options: IOpenOptions): js.UndefOr[IDocumentWidget[Widget, IModel]] = js.native
    def open(path: String, widgetName: Unit, kernel: PartialIModel): js.UndefOr[IDocumentWidget[Widget, IModel]] = js.native
    def open(path: String, widgetName: Unit, kernel: PartialIModel, options: IOpenOptions): js.UndefOr[IDocumentWidget[Widget, IModel]] = js.native
    
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
    def openOrReveal(path: String): js.UndefOr[IDocumentWidget[Widget, IModel]] = js.native
    def openOrReveal(path: String, widgetName: String): js.UndefOr[IDocumentWidget[Widget, IModel]] = js.native
    def openOrReveal(path: String, widgetName: String, kernel: Unit, options: IOpenOptions): js.UndefOr[IDocumentWidget[Widget, IModel]] = js.native
    def openOrReveal(path: String, widgetName: String, kernel: PartialIModel): js.UndefOr[IDocumentWidget[Widget, IModel]] = js.native
    def openOrReveal(path: String, widgetName: String, kernel: PartialIModel, options: IOpenOptions): js.UndefOr[IDocumentWidget[Widget, IModel]] = js.native
    def openOrReveal(path: String, widgetName: Unit, kernel: Unit, options: IOpenOptions): js.UndefOr[IDocumentWidget[Widget, IModel]] = js.native
    def openOrReveal(path: String, widgetName: Unit, kernel: PartialIModel): js.UndefOr[IDocumentWidget[Widget, IModel]] = js.native
    def openOrReveal(path: String, widgetName: Unit, kernel: PartialIModel, options: IOpenOptions): js.UndefOr[IDocumentWidget[Widget, IModel]] = js.native
    
    /**
      * Overwrite a file.
      *
      * @param oldPath - The full path to the original file.
      *
      * @param newPath - The full path to the new file.
      *
      * @returns A promise containing the new file contents model.
      */
    def overwrite(oldPath: String, newPath: String): js.Promise[typings.jupyterlabServices.libContentsMod.Contents.IModel] = js.native
    
    /**
      * The registry used by the manager.
      */
    val registry: DocumentRegistry = js.native
    
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
    def rename(oldPath: String, newPath: String): js.Promise[typings.jupyterlabServices.libContentsMod.Contents.IModel] = js.native
    
    /**
      * The service manager used by the manager.
      */
    val services: IManager = js.native
  }
  @JSImport("@jupyterlab/docmanager/lib/tokens", "IDocumentManager")
  @js.native
  val IDocumentManager: Token[typings.jupyterlabDocmanager.libTokensMod.IDocumentManager] = js.native
}
