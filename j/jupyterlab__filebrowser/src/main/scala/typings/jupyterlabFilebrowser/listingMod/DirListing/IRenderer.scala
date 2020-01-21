package typings.jupyterlabFilebrowser.listingMod.DirListing

import typings.jupyterlabDocregistry.registryMod.DocumentRegistry.IFileType
import typings.jupyterlabServices.contentsMod.Contents.IModel
import typings.std.HTMLElement
import typings.std.MouseEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  def createDragImage(node: HTMLElement, count: Double, fileType: IFileType): HTMLElement = js.native
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
  def updateItemNode(node: HTMLElement, model: IModel, fileType: IFileType): Unit = js.native
}

