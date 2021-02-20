package typings.materialChips

import typings.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object chipConstantsMod {
  
  @js.native
  sealed trait Direction extends StObject
  @JSImport("@material/chips/chip/constants", "Direction")
  @js.native
  object Direction extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[Direction with String] = js.native
    
    @js.native
    sealed trait LEFT extends Direction
    /* "left" */ val LEFT: typings.materialChips.chipConstantsMod.Direction.LEFT with String = js.native
    
    @js.native
    sealed trait RIGHT extends Direction
    /* "right" */ val RIGHT: typings.materialChips.chipConstantsMod.Direction.RIGHT with String = js.native
  }
  
  @js.native
  sealed trait EventSource extends StObject
  @JSImport("@material/chips/chip/constants", "EventSource")
  @js.native
  object EventSource extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[EventSource with String] = js.native
    
    @js.native
    sealed trait NONE extends EventSource
    /* "none" */ val NONE: typings.materialChips.chipConstantsMod.EventSource.NONE with String = js.native
    
    @js.native
    sealed trait PRIMARY extends EventSource
    /* "primary" */ val PRIMARY: typings.materialChips.chipConstantsMod.EventSource.PRIMARY with String = js.native
    
    @js.native
    sealed trait TRAILING extends EventSource
    /* "trailing" */ val TRAILING: typings.materialChips.chipConstantsMod.EventSource.TRAILING with String = js.native
  }
  
  object cssClasses {
    
    @JSImport("@material/chips/chip/constants", "cssClasses")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@material/chips/chip/constants", "cssClasses.CHECKMARK")
    @js.native
    def CHECKMARK: String = js.native
    @scala.inline
    def CHECKMARK_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CHECKMARK")(x.asInstanceOf[js.Any])
    
    @JSImport("@material/chips/chip/constants", "cssClasses.CHIP_EXIT")
    @js.native
    def CHIP_EXIT: String = js.native
    @scala.inline
    def CHIP_EXIT_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CHIP_EXIT")(x.asInstanceOf[js.Any])
    
    @JSImport("@material/chips/chip/constants", "cssClasses.DELETABLE")
    @js.native
    def DELETABLE: String = js.native
    @scala.inline
    def DELETABLE_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DELETABLE")(x.asInstanceOf[js.Any])
    
    @JSImport("@material/chips/chip/constants", "cssClasses.EDITABLE")
    @js.native
    def EDITABLE: String = js.native
    @scala.inline
    def EDITABLE_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("EDITABLE")(x.asInstanceOf[js.Any])
    
    @JSImport("@material/chips/chip/constants", "cssClasses.EDITING")
    @js.native
    def EDITING: String = js.native
    @scala.inline
    def EDITING_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("EDITING")(x.asInstanceOf[js.Any])
    
    @JSImport("@material/chips/chip/constants", "cssClasses.HIDDEN_LEADING_ICON")
    @js.native
    def HIDDEN_LEADING_ICON: String = js.native
    @scala.inline
    def HIDDEN_LEADING_ICON_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("HIDDEN_LEADING_ICON")(x.asInstanceOf[js.Any])
    
    @JSImport("@material/chips/chip/constants", "cssClasses.LEADING_ICON")
    @js.native
    def LEADING_ICON: String = js.native
    @scala.inline
    def LEADING_ICON_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LEADING_ICON")(x.asInstanceOf[js.Any])
    
    @JSImport("@material/chips/chip/constants", "cssClasses.PRIMARY_ACTION")
    @js.native
    def PRIMARY_ACTION: String = js.native
    @scala.inline
    def PRIMARY_ACTION_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PRIMARY_ACTION")(x.asInstanceOf[js.Any])
    
    @JSImport("@material/chips/chip/constants", "cssClasses.PRIMARY_ACTION_FOCUSED")
    @js.native
    def PRIMARY_ACTION_FOCUSED: String = js.native
    @scala.inline
    def PRIMARY_ACTION_FOCUSED_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PRIMARY_ACTION_FOCUSED")(x.asInstanceOf[js.Any])
    
    @JSImport("@material/chips/chip/constants", "cssClasses.SELECTED")
    @js.native
    def SELECTED: String = js.native
    @scala.inline
    def SELECTED_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SELECTED")(x.asInstanceOf[js.Any])
    
    @JSImport("@material/chips/chip/constants", "cssClasses.TEXT")
    @js.native
    def TEXT: String = js.native
    @scala.inline
    def TEXT_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TEXT")(x.asInstanceOf[js.Any])
    
    @JSImport("@material/chips/chip/constants", "cssClasses.TRAILING_ACTION")
    @js.native
    def TRAILING_ACTION: String = js.native
    @scala.inline
    def TRAILING_ACTION_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TRAILING_ACTION")(x.asInstanceOf[js.Any])
    
    @JSImport("@material/chips/chip/constants", "cssClasses.TRAILING_ICON")
    @js.native
    def TRAILING_ICON: String = js.native
    @scala.inline
    def TRAILING_ICON_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TRAILING_ICON")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("@material/chips/chip/constants", "jumpChipKeys")
  @js.native
  val jumpChipKeys: Set[String] = js.native
  
  @JSImport("@material/chips/chip/constants", "navigationKeys")
  @js.native
  val navigationKeys: Set[String] = js.native
  
  object strings {
    
    @JSImport("@material/chips/chip/constants", "strings")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@material/chips/chip/constants", "strings.ADDED_ANNOUNCEMENT_ATTRIBUTE")
    @js.native
    def ADDED_ANNOUNCEMENT_ATTRIBUTE: String = js.native
    @scala.inline
    def ADDED_ANNOUNCEMENT_ATTRIBUTE_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ADDED_ANNOUNCEMENT_ATTRIBUTE")(x.asInstanceOf[js.Any])
    
    @JSImport("@material/chips/chip/constants", "strings.ARIA_CHECKED")
    @js.native
    def ARIA_CHECKED: String = js.native
    @scala.inline
    def ARIA_CHECKED_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ARIA_CHECKED")(x.asInstanceOf[js.Any])
    
    @JSImport("@material/chips/chip/constants", "strings.ARROW_DOWN_KEY")
    @js.native
    def ARROW_DOWN_KEY: String = js.native
    @scala.inline
    def ARROW_DOWN_KEY_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ARROW_DOWN_KEY")(x.asInstanceOf[js.Any])
    
    @JSImport("@material/chips/chip/constants", "strings.ARROW_LEFT_KEY")
    @js.native
    def ARROW_LEFT_KEY: String = js.native
    @scala.inline
    def ARROW_LEFT_KEY_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ARROW_LEFT_KEY")(x.asInstanceOf[js.Any])
    
    @JSImport("@material/chips/chip/constants", "strings.ARROW_RIGHT_KEY")
    @js.native
    def ARROW_RIGHT_KEY: String = js.native
    @scala.inline
    def ARROW_RIGHT_KEY_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ARROW_RIGHT_KEY")(x.asInstanceOf[js.Any])
    
    @JSImport("@material/chips/chip/constants", "strings.ARROW_UP_KEY")
    @js.native
    def ARROW_UP_KEY: String = js.native
    @scala.inline
    def ARROW_UP_KEY_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ARROW_UP_KEY")(x.asInstanceOf[js.Any])
    
    @JSImport("@material/chips/chip/constants", "strings.BACKSPACE_KEY")
    @js.native
    def BACKSPACE_KEY: String = js.native
    @scala.inline
    def BACKSPACE_KEY_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BACKSPACE_KEY")(x.asInstanceOf[js.Any])
    
    @JSImport("@material/chips/chip/constants", "strings.CHECKMARK_SELECTOR")
    @js.native
    def CHECKMARK_SELECTOR: String = js.native
    @scala.inline
    def CHECKMARK_SELECTOR_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CHECKMARK_SELECTOR")(x.asInstanceOf[js.Any])
    
    @JSImport("@material/chips/chip/constants", "strings.DELETE_KEY")
    @js.native
    def DELETE_KEY: String = js.native
    @scala.inline
    def DELETE_KEY_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DELETE_KEY")(x.asInstanceOf[js.Any])
    
    @JSImport("@material/chips/chip/constants", "strings.END_KEY")
    @js.native
    def END_KEY: String = js.native
    @scala.inline
    def END_KEY_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("END_KEY")(x.asInstanceOf[js.Any])
    
    @JSImport("@material/chips/chip/constants", "strings.ENTER_KEY")
    @js.native
    def ENTER_KEY: String = js.native
    @scala.inline
    def ENTER_KEY_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ENTER_KEY")(x.asInstanceOf[js.Any])
    
    @JSImport("@material/chips/chip/constants", "strings.ENTRY_ANIMATION_NAME")
    @js.native
    def ENTRY_ANIMATION_NAME: String = js.native
    @scala.inline
    def ENTRY_ANIMATION_NAME_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ENTRY_ANIMATION_NAME")(x.asInstanceOf[js.Any])
    
    @JSImport("@material/chips/chip/constants", "strings.HOME_KEY")
    @js.native
    def HOME_KEY: String = js.native
    @scala.inline
    def HOME_KEY_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("HOME_KEY")(x.asInstanceOf[js.Any])
    
    @JSImport("@material/chips/chip/constants", "strings.IE_ARROW_DOWN_KEY")
    @js.native
    def IE_ARROW_DOWN_KEY: String = js.native
    @scala.inline
    def IE_ARROW_DOWN_KEY_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("IE_ARROW_DOWN_KEY")(x.asInstanceOf[js.Any])
    
    @JSImport("@material/chips/chip/constants", "strings.IE_ARROW_LEFT_KEY")
    @js.native
    def IE_ARROW_LEFT_KEY: String = js.native
    @scala.inline
    def IE_ARROW_LEFT_KEY_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("IE_ARROW_LEFT_KEY")(x.asInstanceOf[js.Any])
    
    @JSImport("@material/chips/chip/constants", "strings.IE_ARROW_RIGHT_KEY")
    @js.native
    def IE_ARROW_RIGHT_KEY: String = js.native
    @scala.inline
    def IE_ARROW_RIGHT_KEY_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("IE_ARROW_RIGHT_KEY")(x.asInstanceOf[js.Any])
    
    @JSImport("@material/chips/chip/constants", "strings.IE_ARROW_UP_KEY")
    @js.native
    def IE_ARROW_UP_KEY: String = js.native
    @scala.inline
    def IE_ARROW_UP_KEY_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("IE_ARROW_UP_KEY")(x.asInstanceOf[js.Any])
    
    @JSImport("@material/chips/chip/constants", "strings.IE_DELETE_KEY")
    @js.native
    def IE_DELETE_KEY: String = js.native
    @scala.inline
    def IE_DELETE_KEY_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("IE_DELETE_KEY")(x.asInstanceOf[js.Any])
    
    @JSImport("@material/chips/chip/constants", "strings.INTERACTION_EVENT")
    @js.native
    def INTERACTION_EVENT: String = js.native
    @scala.inline
    def INTERACTION_EVENT_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("INTERACTION_EVENT")(x.asInstanceOf[js.Any])
    
    @JSImport("@material/chips/chip/constants", "strings.LEADING_ICON_SELECTOR")
    @js.native
    def LEADING_ICON_SELECTOR: String = js.native
    @scala.inline
    def LEADING_ICON_SELECTOR_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LEADING_ICON_SELECTOR")(x.asInstanceOf[js.Any])
    
    @JSImport("@material/chips/chip/constants", "strings.NAVIGATION_EVENT")
    @js.native
    def NAVIGATION_EVENT: String = js.native
    @scala.inline
    def NAVIGATION_EVENT_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NAVIGATION_EVENT")(x.asInstanceOf[js.Any])
    
    @JSImport("@material/chips/chip/constants", "strings.PRIMARY_ACTION_SELECTOR")
    @js.native
    def PRIMARY_ACTION_SELECTOR: String = js.native
    @scala.inline
    def PRIMARY_ACTION_SELECTOR_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PRIMARY_ACTION_SELECTOR")(x.asInstanceOf[js.Any])
    
    @JSImport("@material/chips/chip/constants", "strings.REMOVAL_EVENT")
    @js.native
    def REMOVAL_EVENT: String = js.native
    @scala.inline
    def REMOVAL_EVENT_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("REMOVAL_EVENT")(x.asInstanceOf[js.Any])
    
    @JSImport("@material/chips/chip/constants", "strings.REMOVED_ANNOUNCEMENT_ATTRIBUTE")
    @js.native
    def REMOVED_ANNOUNCEMENT_ATTRIBUTE: String = js.native
    @scala.inline
    def REMOVED_ANNOUNCEMENT_ATTRIBUTE_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("REMOVED_ANNOUNCEMENT_ATTRIBUTE")(x.asInstanceOf[js.Any])
    
    @JSImport("@material/chips/chip/constants", "strings.SELECTION_EVENT")
    @js.native
    def SELECTION_EVENT: String = js.native
    @scala.inline
    def SELECTION_EVENT_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SELECTION_EVENT")(x.asInstanceOf[js.Any])
    
    @JSImport("@material/chips/chip/constants", "strings.SPACEBAR_KEY")
    @js.native
    def SPACEBAR_KEY: String = js.native
    @scala.inline
    def SPACEBAR_KEY_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SPACEBAR_KEY")(x.asInstanceOf[js.Any])
    
    @JSImport("@material/chips/chip/constants", "strings.TAB_INDEX")
    @js.native
    def TAB_INDEX: String = js.native
    @scala.inline
    def TAB_INDEX_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TAB_INDEX")(x.asInstanceOf[js.Any])
    
    @JSImport("@material/chips/chip/constants", "strings.TRAILING_ACTION_SELECTOR")
    @js.native
    def TRAILING_ACTION_SELECTOR: String = js.native
    @scala.inline
    def TRAILING_ACTION_SELECTOR_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TRAILING_ACTION_SELECTOR")(x.asInstanceOf[js.Any])
    
    @JSImport("@material/chips/chip/constants", "strings.TRAILING_ICON_INTERACTION_EVENT")
    @js.native
    def TRAILING_ICON_INTERACTION_EVENT: String = js.native
    @scala.inline
    def TRAILING_ICON_INTERACTION_EVENT_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TRAILING_ICON_INTERACTION_EVENT")(x.asInstanceOf[js.Any])
    
    @JSImport("@material/chips/chip/constants", "strings.TRAILING_ICON_SELECTOR")
    @js.native
    def TRAILING_ICON_SELECTOR: String = js.native
    @scala.inline
    def TRAILING_ICON_SELECTOR_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TRAILING_ICON_SELECTOR")(x.asInstanceOf[js.Any])
  }
}
