package typings
package atJupyterlabFilebrowserLib.libListingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/filebrowser/lib/listing", "DirListing")
@js.native
class DirListing protected ()
  extends atPhosphorWidgetsLib.atPhosphorWidgetsMod.Widget {
  /**
    * Construct a new file browser directory listing widget.
    *
    * @param model - The file browser view model.
    */
  def this(options: atJupyterlabFilebrowserLib.libListingMod.DirListingNs.IOptions) = this()
  var _clipboard: js.Any = js.native
  /**
    * Copy the selected items, and optionally cut as well.
    */
  var _copy: js.Any = js.native
  /**
    * Delete the files with the given names.
    */
  var _delete: js.Any = js.native
  /**
    * Allow the user to rename item on a given row.
    */
  var _doRename: js.Any = js.native
  var _drag: js.Any = js.native
  var _dragData: js.Any = js.native
  var _editNode: js.Any = js.native
  /**
    * Handle the `'click'` event for the widget.
    */
  var _evtClick: js.Any = js.native
  /**
    * Handle the `'dblclick'` event for the widget.
    */
  var _evtDblClick: js.Any = js.native
  /**
    * Handle the `'p-dragenter'` event for the widget.
    */
  var _evtDragEnter: js.Any = js.native
  /**
    * Handle the `'p-dragleave'` event for the widget.
    */
  var _evtDragLeave: js.Any = js.native
  /**
    * Handle the `'p-dragover'` event for the widget.
    */
  var _evtDragOver: js.Any = js.native
  /**
    * Handle the `'p-drop'` event for the widget.
    */
  var _evtDrop: js.Any = js.native
  /**
    * Handle the `'keydown'` event for the widget.
    */
  var _evtKeydown: js.Any = js.native
  /**
    * Handle the `'mousedown'` event for the widget.
    */
  var _evtMousedown: js.Any = js.native
  /**
    * Handle the `'mousemove'` event for the widget.
    */
  var _evtMousemove: js.Any = js.native
  /**
    * Handle the `'mouseup'` event for the widget.
    */
  var _evtMouseup: js.Any = js.native
  /**
    * Handle the `drop` event for the widget.
    */
  var _evtNativeDrop: js.Any = js.native
  /**
    * Handle the `'scroll'` event for the widget.
    */
  var _evtScroll: js.Any = js.native
  /**
    * Handle selection on a file node.
    */
  var _handleFileSelect: js.Any = js.native
  /**
    * Handle a multiple select on a file item node.
    */
  var _handleMultiSelect: js.Any = js.native
  var _inRename: js.Any = js.native
  var _isCut: js.Any = js.native
  var _isDirty: js.Any = js.native
  var _items: js.Any = js.native
  var _manager: js.Any = js.native
  var _model: js.Any = js.native
  /**
    * Handle an `activateRequested` signal from the manager.
    */
  var _onActivateRequested: js.Any = js.native
  /**
    * Handle a `fileChanged` signal from the model.
    */
  var _onFileChanged: js.Any = js.native
  /**
    * Handle the `refreshed` signal from the model.
    */
  var _onModelRefreshed: js.Any = js.native
  /**
    * Handle a `pathChanged` signal from the model.
    */
  var _onPathChanged: js.Any = js.native
  var _prevPath: js.Any = js.native
  var _renderer: js.Any = js.native
  var _searchPrefix: js.Any = js.native
  var _searchPrefixTimer: js.Any = js.native
  /**
    * Select a given item.
    */
  var _selectItem: js.Any = js.native
  var _selectTimer: js.Any = js.native
  var _selection: js.Any = js.native
  var _softSelection: js.Any = js.native
  var _sortState: js.Any = js.native
  var _sortedItems: js.Any = js.native
  /**
    * Start a drag event.
    */
  var _startDrag: js.Any = js.native
  /**
    * Get the dir listing content node.
    *
    * #### Notes
    * This is the node which holds the item nodes.
    *
    * Modifying this node directly can lead to undefined behavior.
    */
  val contentNode: stdLib.HTMLElement = js.native
  /**
    * Get the dir listing header node.
    *
    * #### Notes
    * This is the node which holds the header cells.
    *
    * Modifying this node directly can lead to undefined behavior.
    */
  val headerNode: stdLib.HTMLElement = js.native
  /**
    * Get the model used by the listing.
    */
  val model: atJupyterlabFilebrowserLib.libModelMod.FileBrowserModel = js.native
  /**
    * The renderer instance used by the directory listing.
    */
  val renderer: atJupyterlabFilebrowserLib.libListingMod.DirListingNs.IRenderer = js.native
  /**
    * The current sort state.
    */
  val sortState: atJupyterlabFilebrowserLib.libListingMod.DirListingNs.ISortState = js.native
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
    * Handle the DOM events for the directory listing.
    *
    * @param event - The DOM event sent to the widget.
    *
    * #### Notes
    * This method implements the DOM `EventListener` interface and is
    * called in response to events on the panel's DOM node. It should
    * not be called directly by user code.
    */
  def handleEvent(event: stdLib.Event): scala.Unit = js.native
  /**
    * Get whether an item is selected by name.
    *
    * @param name - The name of of the item.
    *
    * @returns Whether the item is selected.
    */
  def isSelected(name: java.lang.String): scala.Boolean = js.native
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
    * Select the first item that starts with prefix being typed.
    */
  def selectByPrefix(): scala.Unit = js.native
  /**
    * Select an item by name.
    *
    * @parem name - The name of the item to select.
    *
    * @returns A promise that resolves when the name is selected.
    */
  def selectItemByName(name: java.lang.String): js.Promise[scala.Unit] = js.native
  /**
    * Select next item.
    *
    * @param keepExisting - Whether to keep the current selection and add to it.
    */
  def selectNext(): scala.Unit = js.native
  def selectNext(keepExisting: scala.Boolean): scala.Unit = js.native
  /**
    * Select previous item.
    *
    * @param keepExisting - Whether to keep the current selection and add to it.
    */
  def selectPrevious(): scala.Unit = js.native
  def selectPrevious(keepExisting: scala.Boolean): scala.Unit = js.native
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
  /**
    * Sort the items using a sort condition.
    */
  def sort(state: atJupyterlabFilebrowserLib.libListingMod.DirListingNs.ISortState): scala.Unit = js.native
  /**
    * Create an iterator over the listing's sorted items.
    *
    * @returns A new iterator over the listing's sorted items.
    */
  def sortedItems(): atPhosphorAlgorithmLib.libIterMod.IIterator[atJupyterlabServicesLib.libContentsMod.ContentsNs.IModel] = js.native
}

