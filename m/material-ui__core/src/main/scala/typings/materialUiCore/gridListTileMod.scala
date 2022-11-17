package typings.materialUiCore

import org.scalablytyped.runtime.Shortcut
import typings.materialUiCore.gridListTileGridListTileMod.GridListTileTypeMap
import typings.materialUiCore.overridableComponentMod.OverridableComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object gridListTileMod extends Shortcut {
  
  /**
    * ⚠️ The GridList component was renamed to ImageList to align with the current Material Design naming.
    *
    * You should use `import { ImageListItem } from '@material-ui/core'`
    * or `import ImageListItem from '@material-ui/core/ImageListItem'`.
    * API:
    *
    * - [GridListTile API](https://mui.com/api/grid-list-tile/)
    */
  @JSImport("@material-ui/core/GridListTile", JSImport.Default)
  @js.native
  val default: OverridableComponent[GridListTileTypeMap[js.Object, "li"]] = js.native
  
  type _To = OverridableComponent[GridListTileTypeMap[js.Object, "li"]]
  
  /* This means you don't have to write `default`, but can instead just say `gridListTileMod.foo` */
  override def _to: OverridableComponent[GridListTileTypeMap[js.Object, "li"]] = default
}
