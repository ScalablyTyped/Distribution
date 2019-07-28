package typings.atJupyterlabCells.atJupyterlabCellsMod

import typings.atJupyterlabCells.libWidgetMod.CellNs.ContentFactoryNs.IOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/cells", "Cell")
@js.native
object CellNs extends js.Object {
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
    extends typings.atJupyterlabCells.libWidgetMod.CellNs.ContentFactory {
    def this(options: IOptions) = this()
  }
  
  /**
    * The default content factory for cells.
    */
  val defaultContentFactory: typings.atJupyterlabCells.libWidgetMod.CellNs.ContentFactory = js.native
  /**
    * A namespace for cell content factory.
    */
  @JSName("ContentFactory")
  @js.native
  object ContentFactoryNs extends js.Object
  
}

