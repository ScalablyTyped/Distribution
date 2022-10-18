package typings.materialUi

import typings.materialUi.MaterialUI.Menus.MenuItemProps
import typings.materialUi.MaterialUI.Menus.MenuProps
import typings.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object menuMod {
  
  @JSImport("material-ui/Menu", JSImport.Default)
  @js.native
  open class default () extends Menu
  
  @JSImport("material-ui/Menu", "Menu")
  @js.native
  open class Menu ()
    extends Component[MenuProps, js.Object, Any]
  
  @JSImport("material-ui/Menu", "MenuItem")
  @js.native
  open class MenuItem ()
    extends Component[MenuItemProps, js.Object, Any]
}
