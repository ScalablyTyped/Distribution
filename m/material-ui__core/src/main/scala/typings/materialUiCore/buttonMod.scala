package typings.materialUiCore

import org.scalablytyped.runtime.Shortcut
import typings.materialUiCore.buttonBaseButtonBaseMod.ExtendButtonBase
import typings.materialUiCore.buttonButtonMod.ButtonTypeMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buttonMod extends Shortcut {
  
  /**
    *
    * Demos:
    *
    * - [Button Group](https://mui.com/components/button-group/)
    * - [Buttons](https://mui.com/components/buttons/)
    *
    * API:
    *
    * - [Button API](https://mui.com/api/button/)
    * - inherits [ButtonBase API](https://mui.com/api/button-base/)
    */
  @JSImport("@material-ui/core/Button", JSImport.Default)
  @js.native
  val default: ExtendButtonBase[ButtonTypeMap[js.Object, "button"]] = js.native
  
  type _To = ExtendButtonBase[ButtonTypeMap[js.Object, "button"]]
  
  /* This means you don't have to write `default`, but can instead just say `buttonMod.foo` */
  override def _to: ExtendButtonBase[ButtonTypeMap[js.Object, "button"]] = default
}
