package typings.jupyterlabFilebrowser.browserMod

import typings.jupyterlabApputils.mod.Toolbar
import typings.jupyterlabFilebrowser.browserMod.FileBrowser.IOptions
import typings.jupyterlabFilebrowser.modelMod.FileBrowserModel
import typings.jupyterlabServices.contentsMod.Contents.IModel
import typings.luminoAlgorithm.iterMod.IIterator
import typings.luminoWidgets.mod.Widget
import typings.std.MouseEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@jupyterlab/filebrowser/lib/browser", "FileBrowser")
@js.native
class FileBrowser_ protected () extends Widget {
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
