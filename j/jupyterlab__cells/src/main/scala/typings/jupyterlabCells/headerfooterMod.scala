package typings.jupyterlabCells

import typings.luminoWidgets.mod.Widget
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object headerfooterMod {
  
  @JSImport("@jupyterlab/cells/lib/headerfooter", "CellFooter")
  @js.native
  /**
    * Construct a new cell footer.
    */
  class CellFooter () extends Widget
  
  @JSImport("@jupyterlab/cells/lib/headerfooter", "CellHeader")
  @js.native
  /**
    * Construct a new cell header.
    */
  class CellHeader () extends Widget
  
  type ICellFooter = Widget
  
  type ICellHeader = Widget
}
