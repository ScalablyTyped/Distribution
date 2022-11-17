package typings.materialUiCore

import org.scalablytyped.runtime.Shortcut
import typings.materialUiCore.bottomNavigationActionBottomNavigationActionMod.BottomNavigationActionTypeMap
import typings.materialUiCore.buttonBaseButtonBaseMod.ExtendButtonBase
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object bottomNavigationActionMod extends Shortcut {
  
  /**
    *
    * Demos:
    *
    * - [Bottom Navigation](https://mui.com/components/bottom-navigation/)
    *
    * API:
    *
    * - [BottomNavigationAction API](https://mui.com/api/bottom-navigation-action/)
    * - inherits [ButtonBase API](https://mui.com/api/button-base/)
    */
  @JSImport("@material-ui/core/BottomNavigationAction", JSImport.Default)
  @js.native
  val default: ExtendButtonBase[BottomNavigationActionTypeMap[js.Object, "button"]] = js.native
  
  type _To = ExtendButtonBase[BottomNavigationActionTypeMap[js.Object, "button"]]
  
  /* This means you don't have to write `default`, but can instead just say `bottomNavigationActionMod.foo` */
  override def _to: ExtendButtonBase[BottomNavigationActionTypeMap[js.Object, "button"]] = default
}
