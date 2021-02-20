package typings.jupyterlabFilebrowser

import typings.jupyterlabApputils.mod.Toolbar
import typings.jupyterlabFilebrowser.browserMod.FileBrowser.IOptions
import typings.jupyterlabFilebrowser.listingMod.DirListing.IRenderer
import typings.jupyterlabFilebrowser.modelMod.FileBrowserModel
import typings.jupyterlabServices.contentsMod.Contents.IModel
import typings.luminoAlgorithm.iterMod.IIterator
import typings.luminoWidgets.mod.Widget
import typings.std.MouseEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object browserMod {
  
  @JSImport("@jupyterlab/filebrowser/lib/browser", "FileBrowser")
  @js.native
  class FileBrowser protected () extends Widget {
    /**
      * Construct a new file browser.
      *
      * @param model - The file browser view model.
      */
    def this(options: IOptions) = this()
    
    var _crumbs: js.Any = js.native
    
    var _directoryPending: js.Any = js.native
    
    var _listing: js.Any = js.native
    
    var _manager: js.Any = js.native
    
    var _navigateToCurrentDirectory: js.Any = js.native
    
    /**
      * Handle a connection lost signal from the model.
      */
    var _onConnectionFailure: js.Any = js.native
    
    def clearSelectedItems(): Unit = js.native
    
    /**
      * Copy the selected items.
      */
    def copy(): Unit = js.native
    
    /**
      * Create a new directory
      */
    def createNewDirectory(): Unit = js.native
    
    /**
      * Cut the selected items.
      */
    def cut(): Unit = js.native
    
    /**
      * Delete the currently selected item(s).
      *
      * @returns A promise that resolves when the operation is complete.
      */
    def delete(): js.Promise[Unit] = js.native
    
    /**
      * Download the currently selected item(s).
      */
    def download(): js.Promise[Unit] = js.native
    
    /**
      * Duplicate the currently selected item(s).
      *
      * @returns A promise that resolves when the operation is complete.
      */
    def duplicate(): js.Promise[Unit] = js.native
    
    /**
      * The model used by the file browser.
      */
    val model: FileBrowserModel = js.native
    
    /**
      * Find a model given a click.
      *
      * @param event - The mouse event.
      *
      * @returns The model for the selected file.
      */
    def modelForClick(event: MouseEvent): js.UndefOr[IModel] = js.native
    
    /**
      * Whether to show active file in file browser
      */
    def navigateToCurrentDirectory: Boolean = js.native
    def navigateToCurrentDirectory_=(value: Boolean): Unit = js.native
    
    /**
      * Paste the items from the clipboard.
      *
      * @returns A promise that resolves when the operation is complete.
      */
    def paste(): js.Promise[Unit] = js.native
    
    /**
      * Rename the first currently selected item.
      *
      * @returns A promise that resolves with the new name of the item.
      */
    def rename(): js.Promise[String] = js.native
    
    /**
      * Select an item by name.
      *
      * @param name - The name of the item to select.
      */
    def selectItemByName(name: String): js.Promise[Unit] = js.native
    
    /**
      * Select next item.
      */
    def selectNext(): Unit = js.native
    
    /**
      * Select previous item.
      */
    def selectPrevious(): Unit = js.native
    
    /**
      * Create an iterator over the listing's selected items.
      *
      * @returns A new iterator over the listing's selected items.
      */
    def selectedItems(): IIterator[IModel] = js.native
    
    /**
      * Shut down kernels on the applicable currently selected items.
      *
      * @returns A promise that resolves when the operation is complete.
      */
    def shutdownKernels(): js.Promise[Unit] = js.native
    
    /**
      * The toolbar used by the file browser.
      */
    val toolbar: Toolbar[Widget] = js.native
  }
  object FileBrowser {
    
    /**
      * An options object for initializing a file browser widget.
      */
    @js.native
    trait IOptions extends StObject {
      
      /**
        * The widget/DOM id of the file browser.
        */
      var id: String = js.native
      
      /**
        * A file browser model instance.
        */
      var model: FileBrowserModel = js.native
      
      /**
        * An optional renderer for the directory listing area.
        *
        * The default is a shared instance of `DirListing.Renderer`.
        */
      var renderer: js.UndefOr[IRenderer] = js.native
      
      /**
        * Whether a file browser automatically restores state when instantiated.
        * The default is `true`.
        *
        * #### Notes
        * The file browser model will need to be restored manually for the file
        * browser to be able to save its state.
        */
      var restore: js.UndefOr[Boolean] = js.native
    }
    object IOptions {
      
      @scala.inline
      def apply(id: String, model: FileBrowserModel): IOptions = {
        val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], model = model.asInstanceOf[js.Any])
        __obj.asInstanceOf[IOptions]
      }
      
      @scala.inline
      implicit class IOptionsMutableBuilder[Self <: IOptions] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setModel(value: FileBrowserModel): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setRenderer(value: IRenderer): Self = StObject.set(x, "renderer", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setRendererUndefined: Self = StObject.set(x, "renderer", js.undefined)
        
        @scala.inline
        def setRestore(value: Boolean): Self = StObject.set(x, "restore", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setRestoreUndefined: Self = StObject.set(x, "restore", js.undefined)
      }
    }
  }
}
