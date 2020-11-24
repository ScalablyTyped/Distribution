package typings.luminoWidgets.tabbarMod.TabBar

import typings.luminoVirtualdom.mod.ElementDataset
import typings.luminoVirtualdom.mod.ElementInlineStyle
import typings.luminoVirtualdom.mod.VirtualElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The default implementation of `IRenderer`.
  *
  * #### Notes
  * Subclasses are free to reimplement rendering methods as needed.
  */
@JSImport("@lumino/widgets/types/tabbar", "TabBar.Renderer")
@js.native
/**
  * Construct a new renderer.
  */
class Renderer ()
  extends IRenderer[js.Any] {
  
  var _tabID: js.Any = js.native
  
  var _tabKeys: js.Any = js.native
  
  /**
    * Create the class name for the tab icon.
    *
    * @param data - The data to use for the tab.
    *
    * @returns The full class name for the tab icon.
    */
  def createIconClass(data: IRenderData[_]): String = js.native
  
  /**
    * Create the class name for the tab.
    *
    * @param data - The data to use for the tab.
    *
    * @returns The full class name for the tab.
    */
  def createTabClass(data: IRenderData[_]): String = js.native
  
  /**
    * Create the dataset for a tab.
    *
    * @param data - The data to use for the tab.
    *
    * @returns The dataset for the tab.
    */
  def createTabDataset(data: IRenderData[_]): ElementDataset = js.native
  
  /**
    * Create a unique render key for the tab.
    *
    * @param data - The data to use for the tab.
    *
    * @returns The unique render key for the tab.
    *
    * #### Notes
    * This method caches the key against the tab title the first time
    * the key is generated. This enables efficient rendering of moved
    * tabs and avoids subtle hover style artifacts.
    */
  def createTabKey(data: IRenderData[_]): String = js.native
  
  /**
    * Create the inline style object for a tab.
    *
    * @param data - The data to use for the tab.
    *
    * @returns The inline style data for the tab.
    */
  def createTabStyle(data: IRenderData[_]): ElementInlineStyle = js.native
  
  /**
    * Render the close icon element for a tab.
    *
    * @param data - The data to use for rendering the tab.
    *
    * @returns A virtual element representing the tab close icon.
    */
  def renderCloseIcon(data: IRenderData[_]): VirtualElement = js.native
  
  /**
    * Render the icon element for a tab.
    *
    * @param data - The data to use for rendering the tab.
    *
    * @returns A virtual element representing the tab icon.
    */
  def renderIcon(data: IRenderData[_]): VirtualElement = js.native
  
  /**
    * Render the label element for a tab.
    *
    * @param data - The data to use for rendering the tab.
    *
    * @returns A virtual element representing the tab label.
    */
  def renderLabel(data: IRenderData[_]): VirtualElement = js.native
}
