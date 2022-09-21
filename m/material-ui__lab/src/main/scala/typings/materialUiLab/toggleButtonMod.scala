package typings.materialUiLab

import org.scalablytyped.runtime.Shortcut
import typings.materialUiCore.buttonBaseButtonBaseMod.ExtendButtonBase
import typings.materialUiLab.materialUiLabStrings.button
import typings.materialUiLab.toggleButtonToggleButtonMod.ToggleButtonTypeMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object toggleButtonMod extends Shortcut {
  
  /**
    *
    * Demos:
    *
    * - [Toggle Button](https://mui.com/components/toggle-button/)
    *
    * API:
    *
    * - [ToggleButton API](https://mui.com/api/toggle-button/)
    * - inherits [ButtonBase API](https://mui.com/api/button-base/)
    */
  @JSImport("@material-ui/lab/ToggleButton", JSImport.Default)
  @js.native
  val default: ExtendButtonBase[ToggleButtonTypeMap[js.Object, button]] = js.native
  
  type _To = ExtendButtonBase[ToggleButtonTypeMap[js.Object, button]]
  
  /* This means you don't have to write `default`, but can instead just say `toggleButtonMod.foo` */
  override def _to: ExtendButtonBase[ToggleButtonTypeMap[js.Object, button]] = default
}
