package typings.luminoWidgets.menuMod.Menu

import typings.luminoVirtualdom.mod.ElementDataset
import typings.luminoVirtualdom.mod.VirtualElement
import typings.luminoVirtualdom.mod.h.Child
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The default implementation of `IRenderer`.
  *
  * #### Notes
  * Subclasses are free to reimplement rendering methods as needed.
  */
@JSImport("@lumino/widgets/types/menu", "Menu.Renderer")
@js.native
/**
  * Construct a new renderer.
  */
class Renderer () extends IRenderer {
  /**
    * Create the class name for the menu item icon.
    *
    * @param data - The data to use for the class name.
    *
    * @returns The full class name for the item icon.
    */
  def createIconClass(data: IRenderData): String = js.native
  /**
    * Create the class name for the menu item.
    *
    * @param data - The data to use for the class name.
    *
    * @returns The full class name for the menu item.
    */
  def createItemClass(data: IRenderData): String = js.native
  /**
    * Create the dataset for the menu item.
    *
    * @param data - The data to use for creating the dataset.
    *
    * @returns The dataset for the menu item.
    */
  def createItemDataset(data: IRenderData): ElementDataset = js.native
  /**
    * Create the render content for the label node.
    *
    * @param data - The data to use for the label content.
    *
    * @returns The content to add to the label node.
    */
  def formatLabel(data: IRenderData): Child = js.native
  /**
    * Create the render content for the shortcut node.
    *
    * @param data - The data to use for the shortcut content.
    *
    * @returns The content to add to the shortcut node.
    */
  def formatShortcut(data: IRenderData): Child = js.native
  /**
    * Render the icon element for a menu item.
    *
    * @param data - The data to use for rendering the icon.
    *
    * @returns A virtual element representing the item icon.
    */
  def renderIcon(data: IRenderData): VirtualElement = js.native
  /**
    * Render the label element for a menu item.
    *
    * @param data - The data to use for rendering the label.
    *
    * @returns A virtual element representing the item label.
    */
  def renderLabel(data: IRenderData): VirtualElement = js.native
  /**
    * Render the shortcut element for a menu item.
    *
    * @param data - The data to use for rendering the shortcut.
    *
    * @returns A virtual element representing the item shortcut.
    */
  def renderShortcut(data: IRenderData): VirtualElement = js.native
  /**
    * Render the submenu icon element for a menu item.
    *
    * @param data - The data to use for rendering the submenu icon.
    *
    * @returns A virtual element representing the submenu icon.
    */
  def renderSubmenu(data: IRenderData): VirtualElement = js.native
}

