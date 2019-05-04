package typings
package atJupyterlabCellsLib.atJupyterlabCellsMod

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
    extends atJupyterlabCellsLib.libWidgetMod.CellNs.ContentFactory {
    def this(options: atJupyterlabCellsLib.libWidgetMod.CellNs.ContentFactoryNs.IOptions) = this()
  }
  
  /**
    * The default content factory for cells.
    */
  val defaultContentFactory: atJupyterlabCellsLib.libWidgetMod.CellNs.ContentFactory = js.native
  /**
    * A namespace for cell content factory.
    */
  @JSName("ContentFactory")
  @js.native
  object ContentFactoryNs extends js.Object
  
}

