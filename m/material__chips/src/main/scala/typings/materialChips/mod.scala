package typings.materialChips

import typings.materialChips.anon.PartialMDCChipAdapter
import typings.materialChips.anon.PartialMDCChipSetAdapter
import typings.materialChips.anon.PartialMDCChipTrailingAct
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@material/chips", "MDCChip")
  @js.native
  class MDCChip protected ()
    extends typings.materialChips.chipIndexMod.MDCChip {
    def this(root: Element, foundation: Unit, args: js.Any*) = this()
    def this(
      root: Element,
      foundation: typings.materialChips.chipFoundationMod.MDCChipFoundation,
      args: js.Any*
    ) = this()
  }
  /* static members */
  object MDCChip {
    
    @JSImport("@material/chips", "MDCChip")
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def attachTo(root: Element): typings.materialChips.chipComponentMod.MDCChip = ^.asInstanceOf[js.Dynamic].applyDynamic("attachTo")(root.asInstanceOf[js.Any]).asInstanceOf[typings.materialChips.chipComponentMod.MDCChip]
  }
  
  @JSImport("@material/chips", "MDCChipFoundation")
  @js.native
  class MDCChipFoundation ()
    extends typings.materialChips.chipIndexMod.MDCChipFoundation {
    def this(adapter: PartialMDCChipAdapter) = this()
  }
  
  @JSImport("@material/chips", "MDCChipSet")
  @js.native
  class MDCChipSet protected ()
    extends typings.materialChips.indexMod.MDCChipSet {
    def this(root: Element, foundation: Unit, args: js.Any*) = this()
    def this(root: Element, foundation: typings.materialChips.foundationMod.MDCChipSetFoundation, args: js.Any*) = this()
  }
  /* static members */
  object MDCChipSet {
    
    @JSImport("@material/chips", "MDCChipSet")
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def attachTo(root: Element): typings.materialChips.componentMod.MDCChipSet = ^.asInstanceOf[js.Dynamic].applyDynamic("attachTo")(root.asInstanceOf[js.Any]).asInstanceOf[typings.materialChips.componentMod.MDCChipSet]
  }
  
  @JSImport("@material/chips", "MDCChipSetFoundation")
  @js.native
  class MDCChipSetFoundation ()
    extends typings.materialChips.indexMod.MDCChipSetFoundation {
    def this(adapter: PartialMDCChipSetAdapter) = this()
  }
  
  @JSImport("@material/chips", "MDCChipTrailingAction")
  @js.native
  class MDCChipTrailingAction protected ()
    extends typings.materialChips.trailingactionIndexMod.MDCChipTrailingAction {
    def this(root: Element, foundation: Unit, args: js.Any*) = this()
    def this(
      root: Element,
      foundation: typings.materialChips.trailingactionFoundationMod.MDCChipTrailingActionFoundation,
      args: js.Any*
    ) = this()
  }
  /* static members */
  object MDCChipTrailingAction {
    
    @JSImport("@material/chips", "MDCChipTrailingAction")
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def attachTo(root: Element): typings.materialChips.trailingactionComponentMod.MDCChipTrailingAction = ^.asInstanceOf[js.Dynamic].applyDynamic("attachTo")(root.asInstanceOf[js.Any]).asInstanceOf[typings.materialChips.trailingactionComponentMod.MDCChipTrailingAction]
  }
  
  @JSImport("@material/chips", "MDCChipTrailingActionFoundation")
  @js.native
  class MDCChipTrailingActionFoundation ()
    extends typings.materialChips.trailingactionIndexMod.MDCChipTrailingActionFoundation {
    def this(adapter: PartialMDCChipTrailingAct) = this()
  }
  
  object chipCssClasses {
    
    @JSImport("@material/chips", "chipCssClasses")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@material/chips", "chipCssClasses.CHECKMARK")
    @js.native
    def CHECKMARK: String = js.native
    @scala.inline
    def CHECKMARK_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CHECKMARK")(x.asInstanceOf[js.Any])
    
    @JSImport("@material/chips", "chipCssClasses.CHIP_EXIT")
    @js.native
    def CHIP_EXIT: String = js.native
    @scala.inline
    def CHIP_EXIT_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CHIP_EXIT")(x.asInstanceOf[js.Any])
    
    @JSImport("@material/chips", "chipCssClasses.DELETABLE")
    @js.native
    def DELETABLE: String = js.native
    @scala.inline
    def DELETABLE_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DELETABLE")(x.asInstanceOf[js.Any])
    
    @JSImport("@material/chips", "chipCssClasses.EDITABLE")
    @js.native
    def EDITABLE: String = js.native
    @scala.inline
    def EDITABLE_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("EDITABLE")(x.asInstanceOf[js.Any])
    
    @JSImport("@material/chips", "chipCssClasses.EDITING")
    @js.native
    def EDITING: String = js.native
    @scala.inline
    def EDITING_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("EDITING")(x.asInstanceOf[js.Any])
    
    @JSImport("@material/chips", "chipCssClasses.HIDDEN_LEADING_ICON")
    @js.native
    def HIDDEN_LEADING_ICON: String = js.native
    @scala.inline
    def HIDDEN_LEADING_ICON_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("HIDDEN_LEADING_ICON")(x.asInstanceOf[js.Any])
    
    @JSImport("@material/chips", "chipCssClasses.LEADING_ICON")
    @js.native
    def LEADING_ICON: String = js.native
    @scala.inline
    def LEADING_ICON_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LEADING_ICON")(x.asInstanceOf[js.Any])
    
    @JSImport("@material/chips", "chipCssClasses.PRIMARY_ACTION")
    @js.native
    def PRIMARY_ACTION: String = js.native
    @scala.inline
    def PRIMARY_ACTION_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PRIMARY_ACTION")(x.asInstanceOf[js.Any])
    
    @JSImport("@material/chips", "chipCssClasses.PRIMARY_ACTION_FOCUSED")
    @js.native
    def PRIMARY_ACTION_FOCUSED: String = js.native
    @scala.inline
    def PRIMARY_ACTION_FOCUSED_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PRIMARY_ACTION_FOCUSED")(x.asInstanceOf[js.Any])
    
    @JSImport("@material/chips", "chipCssClasses.SELECTED")
    @js.native
    def SELECTED: String = js.native
    @scala.inline
    def SELECTED_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SELECTED")(x.asInstanceOf[js.Any])
    
    @JSImport("@material/chips", "chipCssClasses.TEXT")
    @js.native
    def TEXT: String = js.native
    @scala.inline
    def TEXT_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TEXT")(x.asInstanceOf[js.Any])
    
    @JSImport("@material/chips", "chipCssClasses.TRAILING_ACTION")
    @js.native
    def TRAILING_ACTION: String = js.native
    @scala.inline
    def TRAILING_ACTION_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TRAILING_ACTION")(x.asInstanceOf[js.Any])
    
    @JSImport("@material/chips", "chipCssClasses.TRAILING_ICON")
    @js.native
    def TRAILING_ICON: String = js.native
    @scala.inline
    def TRAILING_ICON_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TRAILING_ICON")(x.asInstanceOf[js.Any])
  }
  
  object chipSetCssClasses {
    
    @JSImport("@material/chips", "chipSetCssClasses")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@material/chips", "chipSetCssClasses.CHOICE")
    @js.native
    def CHOICE: String = js.native
    @scala.inline
    def CHOICE_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CHOICE")(x.asInstanceOf[js.Any])
    
    @JSImport("@material/chips", "chipSetCssClasses.FILTER")
    @js.native
    def FILTER: String = js.native
    @scala.inline
    def FILTER_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FILTER")(x.asInstanceOf[js.Any])
  }
  
  object chipSetStrings {
    
    @JSImport("@material/chips", "chipSetStrings")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@material/chips", "chipSetStrings.CHIP_SELECTOR")
    @js.native
    def CHIP_SELECTOR: String = js.native
    @scala.inline
    def CHIP_SELECTOR_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CHIP_SELECTOR")(x.asInstanceOf[js.Any])
  }
  
  object chipStrings {
    
    @JSImport("@material/chips", "chipStrings")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@material/chips", "chipStrings.ADDED_ANNOUNCEMENT_ATTRIBUTE")
    @js.native
    def ADDED_ANNOUNCEMENT_ATTRIBUTE: String = js.native
    @scala.inline
    def ADDED_ANNOUNCEMENT_ATTRIBUTE_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ADDED_ANNOUNCEMENT_ATTRIBUTE")(x.asInstanceOf[js.Any])
    
    @JSImport("@material/chips", "chipStrings.ARIA_CHECKED")
    @js.native
    def ARIA_CHECKED: String = js.native
    @scala.inline
    def ARIA_CHECKED_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ARIA_CHECKED")(x.asInstanceOf[js.Any])
    
    @JSImport("@material/chips", "chipStrings.ARROW_DOWN_KEY")
    @js.native
    def ARROW_DOWN_KEY: String = js.native
    @scala.inline
    def ARROW_DOWN_KEY_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ARROW_DOWN_KEY")(x.asInstanceOf[js.Any])
    
    @JSImport("@material/chips", "chipStrings.ARROW_LEFT_KEY")
    @js.native
    def ARROW_LEFT_KEY: String = js.native
    @scala.inline
    def ARROW_LEFT_KEY_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ARROW_LEFT_KEY")(x.asInstanceOf[js.Any])
    
    @JSImport("@material/chips", "chipStrings.ARROW_RIGHT_KEY")
    @js.native
    def ARROW_RIGHT_KEY: String = js.native
    @scala.inline
    def ARROW_RIGHT_KEY_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ARROW_RIGHT_KEY")(x.asInstanceOf[js.Any])
    
    @JSImport("@material/chips", "chipStrings.ARROW_UP_KEY")
    @js.native
    def ARROW_UP_KEY: String = js.native
    @scala.inline
    def ARROW_UP_KEY_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ARROW_UP_KEY")(x.asInstanceOf[js.Any])
    
    @JSImport("@material/chips", "chipStrings.BACKSPACE_KEY")
    @js.native
    def BACKSPACE_KEY: String = js.native
    @scala.inline
    def BACKSPACE_KEY_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BACKSPACE_KEY")(x.asInstanceOf[js.Any])
    
    @JSImport("@material/chips", "chipStrings.CHECKMARK_SELECTOR")
    @js.native
    def CHECKMARK_SELECTOR: String = js.native
    @scala.inline
    def CHECKMARK_SELECTOR_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CHECKMARK_SELECTOR")(x.asInstanceOf[js.Any])
    
    @JSImport("@material/chips", "chipStrings.DELETE_KEY")
    @js.native
    def DELETE_KEY: String = js.native
    @scala.inline
    def DELETE_KEY_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DELETE_KEY")(x.asInstanceOf[js.Any])
    
    @JSImport("@material/chips", "chipStrings.END_KEY")
    @js.native
    def END_KEY: String = js.native
    @scala.inline
    def END_KEY_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("END_KEY")(x.asInstanceOf[js.Any])
    
    @JSImport("@material/chips", "chipStrings.ENTER_KEY")
    @js.native
    def ENTER_KEY: String = js.native
    @scala.inline
    def ENTER_KEY_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ENTER_KEY")(x.asInstanceOf[js.Any])
    
    @JSImport("@material/chips", "chipStrings.ENTRY_ANIMATION_NAME")
    @js.native
    def ENTRY_ANIMATION_NAME: String = js.native
    @scala.inline
    def ENTRY_ANIMATION_NAME_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ENTRY_ANIMATION_NAME")(x.asInstanceOf[js.Any])
    
    @JSImport("@material/chips", "chipStrings.HOME_KEY")
    @js.native
    def HOME_KEY: String = js.native
    @scala.inline
    def HOME_KEY_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("HOME_KEY")(x.asInstanceOf[js.Any])
    
    @JSImport("@material/chips", "chipStrings.IE_ARROW_DOWN_KEY")
    @js.native
    def IE_ARROW_DOWN_KEY: String = js.native
    @scala.inline
    def IE_ARROW_DOWN_KEY_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("IE_ARROW_DOWN_KEY")(x.asInstanceOf[js.Any])
    
    @JSImport("@material/chips", "chipStrings.IE_ARROW_LEFT_KEY")
    @js.native
    def IE_ARROW_LEFT_KEY: String = js.native
    @scala.inline
    def IE_ARROW_LEFT_KEY_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("IE_ARROW_LEFT_KEY")(x.asInstanceOf[js.Any])
    
    @JSImport("@material/chips", "chipStrings.IE_ARROW_RIGHT_KEY")
    @js.native
    def IE_ARROW_RIGHT_KEY: String = js.native
    @scala.inline
    def IE_ARROW_RIGHT_KEY_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("IE_ARROW_RIGHT_KEY")(x.asInstanceOf[js.Any])
    
    @JSImport("@material/chips", "chipStrings.IE_ARROW_UP_KEY")
    @js.native
    def IE_ARROW_UP_KEY: String = js.native
    @scala.inline
    def IE_ARROW_UP_KEY_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("IE_ARROW_UP_KEY")(x.asInstanceOf[js.Any])
    
    @JSImport("@material/chips", "chipStrings.IE_DELETE_KEY")
    @js.native
    def IE_DELETE_KEY: String = js.native
    @scala.inline
    def IE_DELETE_KEY_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("IE_DELETE_KEY")(x.asInstanceOf[js.Any])
    
    @JSImport("@material/chips", "chipStrings.INTERACTION_EVENT")
    @js.native
    def INTERACTION_EVENT: String = js.native
    @scala.inline
    def INTERACTION_EVENT_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("INTERACTION_EVENT")(x.asInstanceOf[js.Any])
    
    @JSImport("@material/chips", "chipStrings.LEADING_ICON_SELECTOR")
    @js.native
    def LEADING_ICON_SELECTOR: String = js.native
    @scala.inline
    def LEADING_ICON_SELECTOR_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LEADING_ICON_SELECTOR")(x.asInstanceOf[js.Any])
    
    @JSImport("@material/chips", "chipStrings.NAVIGATION_EVENT")
    @js.native
    def NAVIGATION_EVENT: String = js.native
    @scala.inline
    def NAVIGATION_EVENT_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NAVIGATION_EVENT")(x.asInstanceOf[js.Any])
    
    @JSImport("@material/chips", "chipStrings.PRIMARY_ACTION_SELECTOR")
    @js.native
    def PRIMARY_ACTION_SELECTOR: String = js.native
    @scala.inline
    def PRIMARY_ACTION_SELECTOR_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PRIMARY_ACTION_SELECTOR")(x.asInstanceOf[js.Any])
    
    @JSImport("@material/chips", "chipStrings.REMOVAL_EVENT")
    @js.native
    def REMOVAL_EVENT: String = js.native
    @scala.inline
    def REMOVAL_EVENT_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("REMOVAL_EVENT")(x.asInstanceOf[js.Any])
    
    @JSImport("@material/chips", "chipStrings.REMOVED_ANNOUNCEMENT_ATTRIBUTE")
    @js.native
    def REMOVED_ANNOUNCEMENT_ATTRIBUTE: String = js.native
    @scala.inline
    def REMOVED_ANNOUNCEMENT_ATTRIBUTE_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("REMOVED_ANNOUNCEMENT_ATTRIBUTE")(x.asInstanceOf[js.Any])
    
    @JSImport("@material/chips", "chipStrings.SELECTION_EVENT")
    @js.native
    def SELECTION_EVENT: String = js.native
    @scala.inline
    def SELECTION_EVENT_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SELECTION_EVENT")(x.asInstanceOf[js.Any])
    
    @JSImport("@material/chips", "chipStrings.SPACEBAR_KEY")
    @js.native
    def SPACEBAR_KEY: String = js.native
    @scala.inline
    def SPACEBAR_KEY_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SPACEBAR_KEY")(x.asInstanceOf[js.Any])
    
    @JSImport("@material/chips", "chipStrings.TAB_INDEX")
    @js.native
    def TAB_INDEX: String = js.native
    @scala.inline
    def TAB_INDEX_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TAB_INDEX")(x.asInstanceOf[js.Any])
    
    @JSImport("@material/chips", "chipStrings.TRAILING_ACTION_SELECTOR")
    @js.native
    def TRAILING_ACTION_SELECTOR: String = js.native
    @scala.inline
    def TRAILING_ACTION_SELECTOR_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TRAILING_ACTION_SELECTOR")(x.asInstanceOf[js.Any])
    
    @JSImport("@material/chips", "chipStrings.TRAILING_ICON_INTERACTION_EVENT")
    @js.native
    def TRAILING_ICON_INTERACTION_EVENT: String = js.native
    @scala.inline
    def TRAILING_ICON_INTERACTION_EVENT_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TRAILING_ICON_INTERACTION_EVENT")(x.asInstanceOf[js.Any])
    
    @JSImport("@material/chips", "chipStrings.TRAILING_ICON_SELECTOR")
    @js.native
    def TRAILING_ICON_SELECTOR: String = js.native
    @scala.inline
    def TRAILING_ICON_SELECTOR_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TRAILING_ICON_SELECTOR")(x.asInstanceOf[js.Any])
  }
  
  object trailingActionStrings {
    
    @JSImport("@material/chips", "trailingActionStrings")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@material/chips", "trailingActionStrings.ARIA_HIDDEN")
    @js.native
    def ARIA_HIDDEN: String = js.native
    @scala.inline
    def ARIA_HIDDEN_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ARIA_HIDDEN")(x.asInstanceOf[js.Any])
    
    @JSImport("@material/chips", "trailingActionStrings.INTERACTION_EVENT")
    @js.native
    def INTERACTION_EVENT: String = js.native
    @scala.inline
    def INTERACTION_EVENT_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("INTERACTION_EVENT")(x.asInstanceOf[js.Any])
    
    @JSImport("@material/chips", "trailingActionStrings.NAVIGATION_EVENT")
    @js.native
    def NAVIGATION_EVENT: String = js.native
    @scala.inline
    def NAVIGATION_EVENT_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NAVIGATION_EVENT")(x.asInstanceOf[js.Any])
    
    @JSImport("@material/chips", "trailingActionStrings.TAB_INDEX")
    @js.native
    def TAB_INDEX: String = js.native
    @scala.inline
    def TAB_INDEX_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TAB_INDEX")(x.asInstanceOf[js.Any])
  }
}
