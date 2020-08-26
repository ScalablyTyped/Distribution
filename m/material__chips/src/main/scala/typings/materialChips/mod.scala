package typings.materialChips

import typings.materialChips.adapterMod.MDCChipSetAdapter
import typings.materialChips.anon.ADDEDANNOUNCEMENTATTRIBUTE
import typings.materialChips.anon.ARIAHIDDEN
import typings.materialChips.anon.CHECKMARK
import typings.materialChips.anon.CHIPSELECTOR
import typings.materialChips.anon.CHOICE
import typings.materialChips.anon.PartialMDCChipAdapter
import typings.materialChips.anon.PartialMDCChipSetAdapter
import typings.materialChips.anon.PartialMDCChipTrailingAct
import typings.materialChips.chipAdapterMod.MDCChipAdapter
import typings.materialChips.trailingactionAdapterMod.MDCChipTrailingActionAdapter
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@material/chips", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  class MDCChip ()
    extends typings.materialChips.chipIndexMod.MDCChip
  
  @js.native
  class MDCChipFoundation ()
    extends typings.materialChips.chipIndexMod.MDCChipFoundation {
    def this(adapter: PartialMDCChipAdapter) = this()
  }
  
  @js.native
  class MDCChipSet ()
    extends typings.materialChips.indexMod.MDCChipSet
  
  @js.native
  class MDCChipSetFoundation ()
    extends typings.materialChips.indexMod.MDCChipSetFoundation {
    def this(adapter: PartialMDCChipSetAdapter) = this()
  }
  
  @js.native
  class MDCChipTrailingAction ()
    extends typings.materialChips.trailingactionIndexMod.MDCChipTrailingAction
  
  @js.native
  class MDCChipTrailingActionFoundation ()
    extends typings.materialChips.trailingactionIndexMod.MDCChipTrailingActionFoundation {
    def this(adapter: PartialMDCChipTrailingAct) = this()
  }
  
  /* static members */
  @js.native
  object MDCChip extends js.Object {
    def attachTo(root: Element): typings.materialChips.chipComponentMod.MDCChip = js.native
  }
  
  /* static members */
  @js.native
  object MDCChipFoundation extends js.Object {
    def cssClasses: CHECKMARK = js.native
    def defaultAdapter: MDCChipAdapter = js.native
    def strings: ADDEDANNOUNCEMENTATTRIBUTE = js.native
  }
  
  /* static members */
  @js.native
  object MDCChipSet extends js.Object {
    def attachTo(root: Element): typings.materialChips.componentMod.MDCChipSet = js.native
  }
  
  /* static members */
  @js.native
  object MDCChipSetFoundation extends js.Object {
    def cssClasses: CHOICE = js.native
    def defaultAdapter: MDCChipSetAdapter = js.native
    def strings: CHIPSELECTOR = js.native
  }
  
  /* static members */
  @js.native
  object MDCChipTrailingAction extends js.Object {
    def attachTo(root: Element): typings.materialChips.trailingactionComponentMod.MDCChipTrailingAction = js.native
  }
  
  /* static members */
  @js.native
  object MDCChipTrailingActionFoundation extends js.Object {
    def defaultAdapter: MDCChipTrailingActionAdapter = js.native
    def strings: ARIAHIDDEN = js.native
  }
  
  @js.native
  object chipCssClasses extends js.Object {
    var CHECKMARK: String = js.native
    var CHIP_EXIT: String = js.native
    var DELETABLE: String = js.native
    var EDITABLE: String = js.native
    var EDITING: String = js.native
    var HIDDEN_LEADING_ICON: String = js.native
    var LEADING_ICON: String = js.native
    var PRIMARY_ACTION: String = js.native
    var PRIMARY_ACTION_FOCUSED: String = js.native
    var SELECTED: String = js.native
    var TEXT: String = js.native
    var TRAILING_ACTION: String = js.native
    var TRAILING_ICON: String = js.native
  }
  
  @js.native
  object chipSetCssClasses extends js.Object {
    var CHOICE: String = js.native
    var FILTER: String = js.native
  }
  
  @js.native
  object chipSetStrings extends js.Object {
    var CHIP_SELECTOR: String = js.native
  }
  
  @js.native
  object chipStrings extends js.Object {
    var ADDED_ANNOUNCEMENT_ATTRIBUTE: String = js.native
    var ARIA_CHECKED: String = js.native
    var ARROW_DOWN_KEY: String = js.native
    var ARROW_LEFT_KEY: String = js.native
    var ARROW_RIGHT_KEY: String = js.native
    var ARROW_UP_KEY: String = js.native
    var BACKSPACE_KEY: String = js.native
    var CHECKMARK_SELECTOR: String = js.native
    var DELETE_KEY: String = js.native
    var END_KEY: String = js.native
    var ENTER_KEY: String = js.native
    var ENTRY_ANIMATION_NAME: String = js.native
    var HOME_KEY: String = js.native
    var IE_ARROW_DOWN_KEY: String = js.native
    var IE_ARROW_LEFT_KEY: String = js.native
    var IE_ARROW_RIGHT_KEY: String = js.native
    var IE_ARROW_UP_KEY: String = js.native
    var IE_DELETE_KEY: String = js.native
    var INTERACTION_EVENT: String = js.native
    var LEADING_ICON_SELECTOR: String = js.native
    var NAVIGATION_EVENT: String = js.native
    var PRIMARY_ACTION_SELECTOR: String = js.native
    var REMOVAL_EVENT: String = js.native
    var REMOVED_ANNOUNCEMENT_ATTRIBUTE: String = js.native
    var SELECTION_EVENT: String = js.native
    var SPACEBAR_KEY: String = js.native
    var TAB_INDEX: String = js.native
    var TRAILING_ACTION_SELECTOR: String = js.native
    var TRAILING_ICON_INTERACTION_EVENT: String = js.native
    var TRAILING_ICON_SELECTOR: String = js.native
  }
  
  @js.native
  object trailingActionStrings extends js.Object {
    var ARIA_HIDDEN: String = js.native
    var INTERACTION_EVENT: String = js.native
    var NAVIGATION_EVENT: String = js.native
    var TAB_INDEX: String = js.native
  }
  
}

