package typings.materialUiCore

import org.scalablytyped.runtime.Shortcut
import typings.materialUiCore.buttonBaseButtonBaseMod.ButtonBaseTypeMap
import typings.materialUiCore.buttonBaseButtonBaseMod.ExtendButtonBase
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buttonBaseMod extends Shortcut {
  
  /**
    * `ButtonBase` contains as few styles as possible.
    * It aims to be a simple building block for creating a button.
    * It contains a load of style reset and some focus/ripple logic.
    * Demos:
    *
    * - [Buttons](https://mui.com/components/buttons/)
    *
    * API:
    *
    * - [ButtonBase API](https://mui.com/api/button-base/)
    */
  @JSImport("@material-ui/core/ButtonBase", JSImport.Default)
  @js.native
  val default: ExtendButtonBase[ButtonBaseTypeMap[js.Object, "button"]] = js.native
  
  type _To = ExtendButtonBase[ButtonBaseTypeMap[js.Object, "button"]]
  
  /* This means you don't have to write `default`, but can instead just say `buttonBaseMod.foo` */
  override def _to: ExtendButtonBase[ButtonBaseTypeMap[js.Object, "button"]] = default
}
