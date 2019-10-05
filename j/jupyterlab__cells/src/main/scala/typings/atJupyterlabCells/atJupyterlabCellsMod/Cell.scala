package typings.atJupyterlabCells.atJupyterlabCellsMod

import typings.atJupyterlabCells.libWidgetMod.Cell.IOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/cells", "Cell")
@js.native
class Cell protected ()
  extends typings.atJupyterlabCells.libWidgetMod.Cell {
  /**
    * Construct a new base cell widget.
    */
  def this(options: IOptions) = this()
}

@JSImport("@jupyterlab/cells", "Cell")
@js.native
object Cell extends js.Object {
  /**
    * The default implementation of an `IContentFactory`.
    *
    * This includes a CodeMirror editor factory to make it easy to use out of the box.
    */
  @js.native
  /**
    * Create a content factory for a cell.
    */
  class ContentFactory ()
    extends typings.atJupyterlabCells.libWidgetMod.Cell.ContentFactory {
    def this(options: typings.atJupyterlabCells.libWidgetMod.Cell.ContentFactory.IOptions) = this()
  }
  
  /**
    * The default content factory for cells.
    */
  val defaultContentFactory: typings.atJupyterlabCells.libWidgetMod.Cell.ContentFactory = js.native
  /**
    * A namespace for cell content factory.
    */
  @js.native
  object ContentFactory extends js.Object
  
}

