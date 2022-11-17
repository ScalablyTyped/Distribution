package typings.materialUiCore

import org.scalablytyped.runtime.Shortcut
import typings.materialUiCore.buttonBaseButtonBaseMod.ExtendButtonBase
import typings.materialUiCore.fabFabMod.FabTypeMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fabMod extends Shortcut {
  
  /**
    *
    * Demos:
    *
    * - [Floating Action Button](https://mui.com/components/floating-action-button/)
    *
    * API:
    *
    * - [Fab API](https://mui.com/api/fab/)
    * - inherits [ButtonBase API](https://mui.com/api/button-base/)
    */
  @JSImport("@material-ui/core/Fab", JSImport.Default)
  @js.native
  val default: ExtendButtonBase[FabTypeMap[js.Object, "button"]] = js.native
  
  type _To = ExtendButtonBase[FabTypeMap[js.Object, "button"]]
  
  /* This means you don't have to write `default`, but can instead just say `fabMod.foo` */
  override def _to: ExtendButtonBase[FabTypeMap[js.Object, "button"]] = default
}
