package typings.materialUiCore

import org.scalablytyped.runtime.Shortcut
import typings.materialUiCore.buttonBaseButtonBaseMod.ExtendButtonBase
import typings.materialUiCore.cardActionAreaCardActionAreaMod.CardActionAreaTypeMap
import typings.materialUiCore.materialUiCoreStrings.button
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cardActionAreaMod extends Shortcut {
  
  /**
    *
    * Demos:
    *
    * - [Cards](https://mui.com/components/cards/)
    *
    * API:
    *
    * - [CardActionArea API](https://mui.com/api/card-action-area/)
    * - inherits [ButtonBase API](https://mui.com/api/button-base/)
    */
  @JSImport("@material-ui/core/CardActionArea", JSImport.Default)
  @js.native
  val default: ExtendButtonBase[CardActionAreaTypeMap[js.Object, button]] = js.native
  
  type _To = ExtendButtonBase[CardActionAreaTypeMap[js.Object, button]]
  
  /* This means you don't have to write `default`, but can instead just say `cardActionAreaMod.foo` */
  override def _to: ExtendButtonBase[CardActionAreaTypeMap[js.Object, button]] = default
}
