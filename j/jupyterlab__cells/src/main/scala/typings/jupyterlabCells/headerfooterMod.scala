package typings.jupyterlabCells

import typings.luminoWidgets.mod.Widget
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/cells/lib/headerfooter", JSImport.Namespace)
@js.native
object headerfooterMod extends js.Object {
  @js.native
  /**
    * Construct a new cell footer.
    */
  class CellFooter () extends Widget
  
  @js.native
  /**
    * Construct a new cell header.
    */
  class CellHeader () extends Widget
  
  type ICellFooter = Widget
  type ICellHeader = Widget
}

