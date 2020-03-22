package typings.luminoDatagrid.textrendererMod

import typings.luminoDatagrid.cellrendererMod.CellRenderer
import typings.luminoDatagrid.cellrendererMod.CellRenderer.CellConfig
import typings.luminoDatagrid.cellrendererMod.CellRenderer.ConfigOption
import typings.luminoDatagrid.graphicscontextMod.GraphicsContext
import typings.luminoDatagrid.textrendererMod.TextRenderer.HorizontalAlignment
import typings.luminoDatagrid.textrendererMod.TextRenderer.IOptions
import typings.luminoDatagrid.textrendererMod.TextRenderer.VerticalAlignment
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@lumino/datagrid/lib/textrenderer", "TextRenderer")
@js.native
/**
  * Construct a new text renderer.
  *
  * @param options - The options for initializing the renderer.
  */
class TextRenderer_ () extends CellRenderer {
  def this(options: IOptions) = this()
  /**
    * The CSS color for the cell background.
    */
  val backgroundColor: ConfigOption[String] = js.native
  /**
    * The CSS shorthand font for drawing the text.
    */
  val font: ConfigOption[String] = js.native
  /**
    * The horizontal alignment for the cell text.
    */
  val horizontalAlignment: ConfigOption[HorizontalAlignment] = js.native
  /**
    * The CSS color for drawing the text.
    */
  val textColor: ConfigOption[String] = js.native
  /**
    * The vertical alignment for the cell text.
    */
  val verticalAlignment: ConfigOption[VerticalAlignment] = js.native
  /**
    * Draw the background for the cell.
    *
    * @param gc - The graphics context to use for drawing.
    *
    * @param config - The configuration data for the cell.
    */
  def drawBackground(gc: GraphicsContext, config: CellConfig): Unit = js.native
  /**
    * Draw the text for the cell.
    *
    * @param gc - The graphics context to use for drawing.
    *
    * @param config - The configuration data for the cell.
    */
  def drawText(gc: GraphicsContext, config: CellConfig): Unit = js.native
  /**
    * The format function for the cell value.
    */
  def format(config: CellConfig): String = js.native
}

