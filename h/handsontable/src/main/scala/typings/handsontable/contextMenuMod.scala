package typings.handsontable

import typings.handsontable.contextMenuContextMenuMod.PredefinedMenuItemKey
import typings.handsontable.contextMenuContextMenuMod.SeparatorObject
import typings.handsontable.coreMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object contextMenuMod {
  
  @JSImport("handsontable/plugins/contextMenu", "ContextMenu")
  @js.native
  open class ContextMenu protected ()
    extends typings.handsontable.contextMenuContextMenuMod.ContextMenu {
    def this(hotInstance: default) = this()
  }
  /* static members */
  object ContextMenu {
    
    @JSImport("handsontable/plugins/contextMenu", "ContextMenu")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("handsontable/plugins/contextMenu", "ContextMenu.DEFAULT_ITEMS")
    @js.native
    def DEFAULT_ITEMS: js.Array[PredefinedMenuItemKey] = js.native
    inline def DEFAULT_ITEMS_=(x: js.Array[PredefinedMenuItemKey]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DEFAULT_ITEMS")(x.asInstanceOf[js.Any])
    
    @JSImport("handsontable/plugins/contextMenu", "ContextMenu.SEPARATOR")
    @js.native
    def SEPARATOR: SeparatorObject = js.native
    inline def SEPARATOR_=(x: SeparatorObject): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SEPARATOR")(x.asInstanceOf[js.Any])
  }
}
