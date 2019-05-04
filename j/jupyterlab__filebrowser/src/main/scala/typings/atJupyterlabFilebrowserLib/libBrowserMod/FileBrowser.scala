package typings
package atJupyterlabFilebrowserLib.libBrowserMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/filebrowser/lib/browser", "FileBrowser")
@js.native
class FileBrowser protected ()
  extends atPhosphorWidgetsLib.atPhosphorWidgetsMod.Widget {
  /**
    * Construct a new file browser.
    *
    * @param model - The file browser view model.
    */
  def this(options: atJupyterlabFilebrowserLib.libBrowserMod.FileBrowserNs.IOptions) = this()
  var _crumbs: js.Any = js.native
  var _listing: js.Any = js.native
  var _manager: js.Any = js.native
  /**
    * Handle a connection lost signal from the model.
    */
  var _onConnectionFailure: js.Any = js.native
  var _showingError: js.Any = js.native
  /**
    * The model used by the file browser.
    */
  val model: atJupyterlabFilebrowserLib.libModelMod.FileBrowserModel = js.native
  /**
    * The toolbar used by the file browser.
    */
  val toolbar: atJupyterlabApputilsLib.atJupyterlabApputilsMod.Toolbar[atPhosphorWidgetsLib.atPhosphorWidgetsMod.Widget] = js.native
  /**
    * Copy the selected items.
    */
  def copy(): scala.Unit = js.native
  /**
    * Cut the selected items.
    */
  def cut(): scala.Unit = js.native
  /**
    * Delete the currently selected item(s).
    *
    * @returns A promise that resolves when the operation is complete.
    */
  def delete(): js.Promise[scala.Unit] = js.native
  /**
    * Download the currently selected item(s).
    */
  def download(): scala.Unit = js.native
  /**
    * Duplicate the currently selected item(s).
    *
    * @returns A promise that resolves when the operation is complete.
    */
  def duplicate(): js.Promise[scala.Unit] = js.native
  /**
    * Find a model given a click.
    *
    * @param event - The mouse event.
    *
    * @returns The model for the selected file.
    */
  def modelForClick(event: stdLib.MouseEvent): js.UndefOr[atJupyterlabServicesLib.libContentsMod.ContentsNs.IModel] = js.native
  /**
    * Paste the items from the clipboard.
    *
    * @returns A promise that resolves when the operation is complete.
    */
  def paste(): js.Promise[scala.Unit] = js.native
  /**
    * Rename the first currently selected item.
    *
    * @returns A promise that resolves with the new name of the item.
    */
  def rename(): js.Promise[java.lang.String] = js.native
  /**
    * Select next item.
    */
  def selectNext(): scala.Unit = js.native
  /**
    * Select previous item.
    */
  def selectPrevious(): scala.Unit = js.native
  /**
    * Create an iterator over the listing's selected items.
    *
    * @returns A new iterator over the listing's selected items.
    */
  def selectedItems(): atPhosphorAlgorithmLib.libIterMod.IIterator[atJupyterlabServicesLib.libContentsMod.ContentsNs.IModel] = js.native
  /**
    * Shut down kernels on the applicable currently selected items.
    *
    * @returns A promise that resolves when the operation is complete.
    */
  def shutdownKernels(): js.Promise[scala.Unit] = js.native
}

