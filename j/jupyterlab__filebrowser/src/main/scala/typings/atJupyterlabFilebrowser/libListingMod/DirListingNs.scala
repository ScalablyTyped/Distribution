package typings.atJupyterlabFilebrowser.libListingMod

import typings.atJupyterlabFilebrowser.atJupyterlabFilebrowserStrings.ascending
import typings.atJupyterlabFilebrowser.atJupyterlabFilebrowserStrings.descending
import typings.atJupyterlabFilebrowser.atJupyterlabFilebrowserStrings.last_modified
import typings.atJupyterlabFilebrowser.atJupyterlabFilebrowserStrings.name
import typings.atJupyterlabFilebrowser.libListingMod.DirListingNs.IRenderer
import typings.atJupyterlabFilebrowser.libListingMod.DirListingNs.ISortState
import typings.atJupyterlabFilebrowser.libListingMod.DirListingNs.Renderer
import typings.atJupyterlabFilebrowser.libModelMod.FileBrowserModel
import typings.atJupyterlabServices.libContentsMod.ContentsNs.IModel
import typings.std.HTMLElement
import typings.std.MouseEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/filebrowser/lib/listing", "DirListing")
@js.native
object DirListingNs extends js.Object {
  /**
    * An options object for initializing a file browser directory listing.
    */
  trait IOptions extends js.Object {
    /**
      * A file browser model instance.
      */
    var model: FileBrowserModel
    /**
      * A renderer for file items.
      *
      * The default is a shared `Renderer` instance.
      */
    var renderer: js.UndefOr[IRenderer] = js.undefined
  }
  
  /**
    * The render interface for file browser listing options.
    */
  @js.native
  trait IRenderer extends js.Object {
    /**
      * Create an appropriate drag image for an item.
      *
      * @param node - A node created by [[createItemNode]].
      *
      * @param count - The number of items being dragged.
      *
      * @param fileType - The file type of the item, if applicable.
      *
      * @returns An element to use as the drag image.
      */
    def createDragImage(node: HTMLElement, count: Double): HTMLElement = js.native
    def createDragImage(
      node: HTMLElement,
      count: Double,
      fileType: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify DocumentRegistry.IFileType */ js.Any
    ): HTMLElement = js.native
    /**
      * Create a new item node for a dir listing.
      *
      * @returns A new DOM node to use as a content item.
      */
    def createItemNode(): HTMLElement = js.native
    /**
      * Create the DOM node for a dir listing.
      */
    def createNode(): HTMLElement = js.native
    /**
      * Get the node containing the file name.
      *
      * @param node - A node created by [[createItemNode]].
      *
      * @returns The node containing the file name.
      */
    def getNameNode(node: HTMLElement): HTMLElement = js.native
    /**
      * Handle a header click.
      *
      * @param node - A node populated by [[populateHeaderNode]].
      *
      * @param event - A click event on the node.
      *
      * @returns The sort state of the header after the click event.
      */
    def handleHeaderClick(node: HTMLElement, event: MouseEvent): ISortState = js.native
    /**
      * Populate and empty header node for a dir listing.
      *
      * @param node - The header node to populate.
      */
    def populateHeaderNode(node: HTMLElement): Unit = js.native
    /**
      * Update an item node to reflect the current state of a model.
      *
      * @param node - A node created by [[createItemNode]].
      *
      * @param model - The model object to use for the item state.
      *
      * @param fileType - The file type of the item, if applicable.
      */
    def updateItemNode(node: HTMLElement, model: IModel): Unit = js.native
    def updateItemNode(
      node: HTMLElement,
      model: IModel,
      fileType: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify DocumentRegistry.IFileType */ js.Any
    ): Unit = js.native
  }
  
  /**
    * A sort state.
    */
  trait ISortState extends js.Object {
    /**
      * The direction of sort.
      */
    var direction: ascending | descending
    /**
      * The sort key.
      */
    var key: name | last_modified
  }
  
  /**
    * The default implementation of an `IRenderer`.
    */
  @js.native
  class Renderer () extends IRenderer {
    /**
      * Create a node for a header item.
      */
    var _createHeaderItemNode: js.Any = js.native
  }
  
  /**
    * The default `IRenderer` instance.
    */
  val defaultRenderer: Renderer = js.native
}

