package typings.materialUiCore

import org.scalablytyped.runtime.Shortcut
import typings.materialUiCore.buttonBaseButtonBaseMod.ExtendButtonBase
import typings.materialUiCore.iconButtonIconButtonMod.IconButtonTypeMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object iconButtonMod extends Shortcut {
  
  /**
    * Refer to the [Icons](https://mui.com/components/icons/) section of the documentation
    * regarding the available icon options.
    * Demos:
    *
    * - [Buttons](https://mui.com/components/buttons/)
    *
    * API:
    *
    * - [IconButton API](https://mui.com/api/icon-button/)
    * - inherits [ButtonBase API](https://mui.com/api/button-base/)
    */
  @JSImport("@material-ui/core/IconButton", JSImport.Default)
  @js.native
  val default: ExtendButtonBase[IconButtonTypeMap[js.Object, "button"]] = js.native
  
  type _To = ExtendButtonBase[IconButtonTypeMap[js.Object, "button"]]
  
  /* This means you don't have to write `default`, but can instead just say `iconButtonMod.foo` */
  override def _to: ExtendButtonBase[IconButtonTypeMap[js.Object, "button"]] = default
}
