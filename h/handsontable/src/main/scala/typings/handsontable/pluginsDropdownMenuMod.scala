package typings.handsontable

import typings.handsontable.coreMod.default
import typings.handsontable.pluginsDropdownMenuDropdownMenuMod.SeparatorObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pluginsDropdownMenuMod {
  
  @JSImport("handsontable/plugins/dropdownMenu", "DropdownMenu")
  @js.native
  open class DropdownMenu protected ()
    extends typings.handsontable.pluginsDropdownMenuDropdownMenuMod.DropdownMenu {
    def this(hotInstance: default) = this()
  }
  /* static members */
  object DropdownMenu {
    
    @JSImport("handsontable/plugins/dropdownMenu", "DropdownMenu")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("handsontable/plugins/dropdownMenu", "DropdownMenu.SEPARATOR")
    @js.native
    def SEPARATOR: SeparatorObject = js.native
    inline def SEPARATOR_=(x: SeparatorObject): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SEPARATOR")(x.asInstanceOf[js.Any])
  }
}
