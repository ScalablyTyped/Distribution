package typings.luminoWidgets.menubarMod.MenuBar

import typings.luminoVirtualdom.mod.ElementDataset
import typings.luminoVirtualdom.mod.VirtualElement
import typings.luminoVirtualdom.mod.h.Child
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The default implementation of `IRenderer`.
  *
  * #### Notes
  * Subclasses are free to reimplement rendering methods as needed.
  */
@JSImport("@lumino/widgets/types/menubar", "MenuBar.Renderer")
@js.native
/**
  * Construct a new renderer.
  */
class Renderer () extends IRenderer {
  
  /**
    * Create the class name for the menu bar item icon.
    *
    * @param data - The data to use for the class name.
    *
    * @returns The full class name for the item icon.
    */
  def createIconClass(data: IRenderData): String = js.native
  
  /**
    * Create the class name for the menu bar item.
    *
    * @param data - The data to use for the class name.
    *
    * @returns The full class name for the menu item.
    */
  def createItemClass(data: IRenderData): String = js.native
  
  /**
    * Create the dataset for a menu bar item.
    *
    * @param data - The data to use for the item.
    *
    * @returns The dataset for the menu bar item.
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
    * Render the icon element for a menu bar item.
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
}
