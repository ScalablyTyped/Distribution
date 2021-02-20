package typings.luminoWidgets.mod

import typings.luminoWidgets.anon.PartialICellConfig
import typings.luminoWidgets.gridlayoutMod.GridLayout.ICellConfig
import typings.luminoWidgets.gridlayoutMod.GridLayout.IOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@lumino/widgets", "GridLayout")
@js.native
/**
  * Construct a new grid layout.
  *
  * @param options - The options for initializing the layout.
  */
class GridLayout ()
  extends typings.luminoWidgets.gridlayoutMod.GridLayout {
  def this(options: IOptions) = this()
}
object GridLayout {
  
  /**
    * Get the cell config for the given widget.
    *
    * @param widget - The widget of interest.
    *
    * @returns The cell config for the widget.
    */
  @JSImport("@lumino/widgets", "GridLayout.getCellConfig")
  @js.native
  def getCellConfig(widget: typings.luminoWidgets.widgetMod.Widget): ICellConfig = js.native
  
  /**
    * Set the cell config for the given widget.
    *
    * @param widget - The widget of interest.
    *
    * @param value - The value for the cell config.
    */
  @JSImport("@lumino/widgets", "GridLayout.setCellConfig")
  @js.native
  def setCellConfig(widget: typings.luminoWidgets.widgetMod.Widget, value: PartialICellConfig): Unit = js.native
}
