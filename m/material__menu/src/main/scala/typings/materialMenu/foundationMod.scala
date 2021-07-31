package typings.materialMenu

import typings.materialBase.foundationMod.MDCFoundation
import typings.materialMenu.adapterMod.MDCMenuAdapter
import typings.materialMenu.anon.PartialMDCMenuAdapter
import typings.materialMenu.constantsMod.DefaultFocusState
import typings.std.Element
import typings.std.KeyboardEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object foundationMod {
  
  @JSImport("@material/menu/foundation", JSImport.Default)
  @js.native
  class default () extends MDCMenuFoundation {
    def this(adapter: PartialMDCMenuAdapter) = this()
  }
  
  @JSImport("@material/menu/foundation", "MDCMenuFoundation")
  @js.native
  class MDCMenuFoundation () extends MDCFoundation[MDCMenuAdapter] {
    def this(adapter: PartialMDCMenuAdapter) = this()
    
    def handleItemAction(listItem: Element): Unit = js.native
    
    def handleKeydown(evt: KeyboardEvent): Unit = js.native
    
    def handleMenuSurfaceOpened(): Unit = js.native
    
    /**
      * Sets default focus state where the menu should focus every time when menu
      * is opened. Focuses the list root (`DefaultFocusState.LIST_ROOT`) element by
      * default.
      */
    def setDefaultFocusState(focusState: DefaultFocusState): Unit = js.native
    
    /**
      * Sets the enabled state to isEnabled for the menu item at the given index.
      * @param index Index of the menu item
      * @param isEnabled The desired enabled state of the menu item.
      */
    def setEnabled(index: Double, isEnabled: Boolean): Unit = js.native
    
    /**
      * Selects the list item at `index` within the menu.
      * @param index Index of list item within the menu.
      */
    def setSelectedIndex(index: Double): Unit = js.native
  }
}
