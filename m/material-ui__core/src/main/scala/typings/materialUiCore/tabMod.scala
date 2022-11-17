package typings.materialUiCore

import org.scalablytyped.runtime.Shortcut
import typings.materialUiCore.buttonBaseButtonBaseMod.ExtendButtonBase
import typings.materialUiCore.tabTabMod.TabTypeMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tabMod extends Shortcut {
  
  /**
    *
    * Demos:
    *
    * - [Tabs](https://mui.com/components/tabs/)
    *
    * API:
    *
    * - [Tab API](https://mui.com/api/tab/)
    * - inherits [ButtonBase API](https://mui.com/api/button-base/)
    */
  @JSImport("@material-ui/core/Tab", JSImport.Default)
  @js.native
  val default: ExtendButtonBase[TabTypeMap[js.Object, "div"]] = js.native
  
  type _To = ExtendButtonBase[TabTypeMap[js.Object, "div"]]
  
  /* This means you don't have to write `default`, but can instead just say `tabMod.foo` */
  override def _to: ExtendButtonBase[TabTypeMap[js.Object, "div"]] = default
}
