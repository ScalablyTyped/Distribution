package typings.materialUiCore

import org.scalablytyped.runtime.Shortcut
import typings.materialUiCore.imageListImageListMod.ImageListTypeMap
import typings.materialUiCore.overridableComponentMod.OverridableComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object imageListMod extends Shortcut {
  
  /**
    *
    * Demos:
    *
    * - [Image List](https://mui.com/components/image-list/)
    *
    * API:
    *
    * - [ImageList API](https://mui.com/api/image-list/)
    */
  @JSImport("@material-ui/core/ImageList", JSImport.Default)
  @js.native
  val default: OverridableComponent[ImageListTypeMap[js.Object, "ul"]] = js.native
  
  type _To = OverridableComponent[ImageListTypeMap[js.Object, "ul"]]
  
  /* This means you don't have to write `default`, but can instead just say `imageListMod.foo` */
  override def _to: OverridableComponent[ImageListTypeMap[js.Object, "ul"]] = default
}
