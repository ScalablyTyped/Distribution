package typings.materialMenu

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object constantsMod {
  
  @js.native
  sealed trait DefaultFocusState extends StObject
  @JSImport("@material/menu/constants", "DefaultFocusState")
  @js.native
  object DefaultFocusState extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[DefaultFocusState & Double] = js.native
    
    @js.native
    sealed trait FIRST_ITEM
      extends StObject
         with DefaultFocusState
    /* 2 */ val FIRST_ITEM: typings.materialMenu.constantsMod.DefaultFocusState.FIRST_ITEM & Double = js.native
    
    @js.native
    sealed trait LAST_ITEM
      extends StObject
         with DefaultFocusState
    /* 3 */ val LAST_ITEM: typings.materialMenu.constantsMod.DefaultFocusState.LAST_ITEM & Double = js.native
    
    @js.native
    sealed trait LIST_ROOT
      extends StObject
         with DefaultFocusState
    /* 1 */ val LIST_ROOT: typings.materialMenu.constantsMod.DefaultFocusState.LIST_ROOT & Double = js.native
    
    @js.native
    sealed trait NONE
      extends StObject
         with DefaultFocusState
    /* 0 */ val NONE: typings.materialMenu.constantsMod.DefaultFocusState.NONE & Double = js.native
  }
  
  object cssClasses {
    
    @JSImport("@material/menu/constants", "cssClasses")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@material/menu/constants", "cssClasses.MENU_SELECTED_LIST_ITEM")
    @js.native
    def MENU_SELECTED_LIST_ITEM: String = js.native
    inline def MENU_SELECTED_LIST_ITEM_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MENU_SELECTED_LIST_ITEM")(x.asInstanceOf[js.Any])
    
    @JSImport("@material/menu/constants", "cssClasses.MENU_SELECTION_GROUP")
    @js.native
    def MENU_SELECTION_GROUP: String = js.native
    inline def MENU_SELECTION_GROUP_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MENU_SELECTION_GROUP")(x.asInstanceOf[js.Any])
    
    @JSImport("@material/menu/constants", "cssClasses.ROOT")
    @js.native
    def ROOT: String = js.native
    inline def ROOT_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ROOT")(x.asInstanceOf[js.Any])
  }
  
  object numbers {
    
    @JSImport("@material/menu/constants", "numbers")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@material/menu/constants", "numbers.FOCUS_ROOT_INDEX")
    @js.native
    def FOCUS_ROOT_INDEX: Double = js.native
    inline def FOCUS_ROOT_INDEX_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FOCUS_ROOT_INDEX")(x.asInstanceOf[js.Any])
  }
  
  object strings {
    
    @JSImport("@material/menu/constants", "strings")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@material/menu/constants", "strings.ARIA_CHECKED_ATTR")
    @js.native
    def ARIA_CHECKED_ATTR: String = js.native
    inline def ARIA_CHECKED_ATTR_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ARIA_CHECKED_ATTR")(x.asInstanceOf[js.Any])
    
    @JSImport("@material/menu/constants", "strings.ARIA_DISABLED_ATTR")
    @js.native
    def ARIA_DISABLED_ATTR: String = js.native
    inline def ARIA_DISABLED_ATTR_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ARIA_DISABLED_ATTR")(x.asInstanceOf[js.Any])
    
    @JSImport("@material/menu/constants", "strings.CHECKBOX_SELECTOR")
    @js.native
    def CHECKBOX_SELECTOR: String = js.native
    inline def CHECKBOX_SELECTOR_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CHECKBOX_SELECTOR")(x.asInstanceOf[js.Any])
    
    @JSImport("@material/menu/constants", "strings.LIST_SELECTOR")
    @js.native
    def LIST_SELECTOR: String = js.native
    inline def LIST_SELECTOR_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LIST_SELECTOR")(x.asInstanceOf[js.Any])
    
    @JSImport("@material/menu/constants", "strings.SELECTED_EVENT")
    @js.native
    def SELECTED_EVENT: String = js.native
    inline def SELECTED_EVENT_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SELECTED_EVENT")(x.asInstanceOf[js.Any])
    
    @JSImport("@material/menu/constants", "strings.SKIP_RESTORE_FOCUS")
    @js.native
    def SKIP_RESTORE_FOCUS: String = js.native
    inline def SKIP_RESTORE_FOCUS_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SKIP_RESTORE_FOCUS")(x.asInstanceOf[js.Any])
  }
}
