package typings.materialUiCore

import org.scalablytyped.runtime.Shortcut
import typings.materialUiCore.gridListGridListMod.GridListTypeMap
import typings.materialUiCore.materialUiCoreStrings.ul
import typings.materialUiCore.overridableComponentMod.OverridableComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object gridListMod extends Shortcut {
  
  /**
    * ⚠️ The GridList component was renamed to ImageList to align with the current Material Design naming.
    *
    * You should use `import { ImageList } from '@material-ui/core'`
    * or `import ImageList from '@material-ui/core/ImageList'`.
    * API:
    *
    * - [GridList API](https://mui.com/api/grid-list/)
    */
  @JSImport("@material-ui/core/GridList", JSImport.Default)
  @js.native
  val default: OverridableComponent[GridListTypeMap[js.Object, ul]] = js.native
  
  type _To = OverridableComponent[GridListTypeMap[js.Object, ul]]
  
  /* This means you don't have to write `default`, but can instead just say `gridListMod.foo` */
  override def _to: OverridableComponent[GridListTypeMap[js.Object, ul]] = default
}
