package typings.materialUi

import typings.materialUi.MaterialUI.GridList.GridListProps
import typings.materialUi.MaterialUI.GridList.GridTileProps
import typings.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object gridListMod {
  
  @JSImport("material-ui/GridList", JSImport.Default)
  @js.native
  open class default () extends GridList
  
  @JSImport("material-ui/GridList", "GridList")
  @js.native
  open class GridList ()
    extends Component[GridListProps, js.Object, Any]
  
  @JSImport("material-ui/GridList", "GridTile")
  @js.native
  open class GridTile ()
    extends Component[GridTileProps, js.Object, Any]
}
