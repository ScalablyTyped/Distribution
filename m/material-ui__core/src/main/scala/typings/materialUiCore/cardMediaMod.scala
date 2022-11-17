package typings.materialUiCore

import org.scalablytyped.runtime.Shortcut
import typings.materialUiCore.cardMediaCardMediaMod.CardMediaTypeMap
import typings.materialUiCore.overridableComponentMod.OverridableComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cardMediaMod extends Shortcut {
  
  /**
    *
    * Demos:
    *
    * - [Cards](https://mui.com/components/cards/)
    *
    * API:
    *
    * - [CardMedia API](https://mui.com/api/card-media/)
    */
  @JSImport("@material-ui/core/CardMedia", JSImport.Default)
  @js.native
  val default: OverridableComponent[CardMediaTypeMap[js.Object, "div"]] = js.native
  
  type _To = OverridableComponent[CardMediaTypeMap[js.Object, "div"]]
  
  /* This means you don't have to write `default`, but can instead just say `cardMediaMod.foo` */
  override def _to: OverridableComponent[CardMediaTypeMap[js.Object, "div"]] = default
}
