package typings.materialUiCore

import org.scalablytyped.runtime.Shortcut
import typings.materialUiCore.imageListItemImageListItemMod.ImageListItemTypeMap
import typings.materialUiCore.materialUiCoreStrings.li
import typings.materialUiCore.overridableComponentMod.OverridableComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object imageListItemMod extends Shortcut {
  
  /**
    *
    * Demos:
    *
    * - [Image List](https://mui.com/components/image-list/)
    *
    * API:
    *
    * - [ImageListItem API](https://mui.com/api/image-list-item/)
    */
  @JSImport("@material-ui/core/ImageListItem", JSImport.Default)
  @js.native
  val default: OverridableComponent[ImageListItemTypeMap[js.Object, li]] = js.native
  
  type _To = OverridableComponent[ImageListItemTypeMap[js.Object, li]]
  
  /* This means you don't have to write `default`, but can instead just say `imageListItemMod.foo` */
  override def _to: OverridableComponent[ImageListItemTypeMap[js.Object, li]] = default
}
