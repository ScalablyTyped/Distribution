package typings.materialChips

import typings.materialBase.Element
import typings.materialChips.anon.PartialMDCChipActionAdapt
import typings.materialChips.anon.PartialMDCChipAdapter
import typings.materialChips.anon.PartialMDCChipAdapterAddClass
import typings.materialChips.anon.PartialMDCChipSetAdapter
import typings.materialChips.anon.PartialMDCChipSetAdapterAnnounceMessage
import typings.materialChips.anon.PartialMDCChipTrailingAct
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@material/chips", "MDCChip")
  @js.native
  open class MDCChip protected ()
    extends typings.materialChips.chipMod.MDCChip {
    def this(root: Element, foundation: Unit, args: Any*) = this()
    def this(root: Element, foundation: typings.materialChips.chipFoundationMod.MDCChipFoundation, args: Any*) = this()
  }
  /* static members */
  object MDCChip {
    
    @JSImport("@material/chips", "MDCChip")
    @js.native
    val ^ : js.Any = js.native
    
    inline def attachTo(root: typings.std.Element): typings.materialChips.chipComponentMod.MDCChip = ^.asInstanceOf[js.Dynamic].applyDynamic("attachTo")(root.asInstanceOf[js.Any]).asInstanceOf[typings.materialChips.chipComponentMod.MDCChip]
  }
  
  @JSImport("@material/chips", "MDCChipAction")
  @js.native
  open class MDCChipAction protected ()
    extends typings.materialChips.actionMod.MDCChipAction {
    def this(root: Element, foundation: Unit, args: Any*) = this()
    def this(
      root: Element,
      foundation: typings.materialChips.actionFoundationMod.MDCChipActionFoundation,
      args: Any*
    ) = this()
  }
  /* static members */
  object MDCChipAction {
    
    @JSImport("@material/chips", "MDCChipAction")
    @js.native
    val ^ : js.Any = js.native
    
    inline def attachTo(root: typings.std.Element): typings.materialChips.actionComponentMod.MDCChipAction = ^.asInstanceOf[js.Dynamic].applyDynamic("attachTo")(root.asInstanceOf[js.Any]).asInstanceOf[typings.materialChips.actionComponentMod.MDCChipAction]
  }
  
  @JSImport("@material/chips", "MDCChipActionAttributes")
  @js.native
  object MDCChipActionAttributes extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.materialChips.actionConstantsMod.MDCChipActionAttributes & String] = js.native
    
    /* "aria-disabled" */ val ARIA_DISABLED: typings.materialChips.actionConstantsMod.MDCChipActionAttributes.ARIA_DISABLED & String = js.native
    
    /* "aria-hidden" */ val ARIA_HIDDEN: typings.materialChips.actionConstantsMod.MDCChipActionAttributes.ARIA_HIDDEN & String = js.native
    
    /* "aria-selected" */ val ARIA_SELECTED: typings.materialChips.actionConstantsMod.MDCChipActionAttributes.ARIA_SELECTED & String = js.native
    
    /* "data-mdc-deletable" */ val DATA_DELETABLE: typings.materialChips.actionConstantsMod.MDCChipActionAttributes.DATA_DELETABLE & String = js.native
    
    /* "disabled" */ val DISABLED: typings.materialChips.actionConstantsMod.MDCChipActionAttributes.DISABLED & String = js.native
    
    /* "role" */ val ROLE: typings.materialChips.actionConstantsMod.MDCChipActionAttributes.ROLE & String = js.native
    
    /* "tabindex" */ val TAB_INDEX: typings.materialChips.actionConstantsMod.MDCChipActionAttributes.TAB_INDEX & String = js.native
  }
  
  @JSImport("@material/chips", "MDCChipActionCssClasses")
  @js.native
  object MDCChipActionCssClasses extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.materialChips.actionConstantsMod.MDCChipActionCssClasses & String] = js.native
    
    /* "mdc-evolution-chip" */ val CHIP_ROOT: typings.materialChips.actionConstantsMod.MDCChipActionCssClasses.CHIP_ROOT & String = js.native
    
    /* "mdc-evolution-chip__action--primary" */ val PRIMARY_ACTION: typings.materialChips.actionConstantsMod.MDCChipActionCssClasses.PRIMARY_ACTION & String = js.native
    
    /* "mdc-evolution-chip__action--trailing" */ val TRAILING_ACTION: typings.materialChips.actionConstantsMod.MDCChipActionCssClasses.TRAILING_ACTION & String = js.native
  }
  
  @JSImport("@material/chips", "MDCChipActionEvents")
  @js.native
  object MDCChipActionEvents extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.materialChips.actionConstantsMod.MDCChipActionEvents & String] = js.native
    
    /* "MDCChipAction:interaction" */ val INTERACTION: typings.materialChips.actionConstantsMod.MDCChipActionEvents.INTERACTION & String = js.native
    
    /* "MDCChipAction:navigation" */ val NAVIGATION: typings.materialChips.actionConstantsMod.MDCChipActionEvents.NAVIGATION & String = js.native
  }
  
  @JSImport("@material/chips", "MDCChipActionFocusBehavior")
  @js.native
  object MDCChipActionFocusBehavior extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.materialChips.actionConstantsMod.MDCChipActionFocusBehavior & Double] = js.native
    
    /* 0 */ val FOCUSABLE: typings.materialChips.actionConstantsMod.MDCChipActionFocusBehavior.FOCUSABLE & Double = js.native
    
    /* 1 */ val FOCUSABLE_AND_FOCUSED: typings.materialChips.actionConstantsMod.MDCChipActionFocusBehavior.FOCUSABLE_AND_FOCUSED & Double = js.native
    
    /* 2 */ val NOT_FOCUSABLE: typings.materialChips.actionConstantsMod.MDCChipActionFocusBehavior.NOT_FOCUSABLE & Double = js.native
  }
  
  /* note: abstract class */ @JSImport("@material/chips", "MDCChipActionFoundation")
  @js.native
  open class MDCChipActionFoundation ()
    extends typings.materialChips.actionMod.MDCChipActionFoundation {
    def this(adapter: PartialMDCChipActionAdapt) = this()
  }
  
  @JSImport("@material/chips", "MDCChipActionInteractionTrigger")
  @js.native
  object MDCChipActionInteractionTrigger extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typings.materialChips.actionConstantsMod.MDCChipActionInteractionTrigger & Double
      ] = js.native
    
    /* 2 */ val BACKSPACE_KEY: typings.materialChips.actionConstantsMod.MDCChipActionInteractionTrigger.BACKSPACE_KEY & Double = js.native
    
    /* 1 */ val CLICK: typings.materialChips.actionConstantsMod.MDCChipActionInteractionTrigger.CLICK & Double = js.native
    
    /* 3 */ val DELETE_KEY: typings.materialChips.actionConstantsMod.MDCChipActionInteractionTrigger.DELETE_KEY & Double = js.native
    
    /* 5 */ val ENTER_KEY: typings.materialChips.actionConstantsMod.MDCChipActionInteractionTrigger.ENTER_KEY & Double = js.native
    
    /* 4 */ val SPACEBAR_KEY: typings.materialChips.actionConstantsMod.MDCChipActionInteractionTrigger.SPACEBAR_KEY & Double = js.native
    
    /* 0 */ val UNSPECIFIED: typings.materialChips.actionConstantsMod.MDCChipActionInteractionTrigger.UNSPECIFIED & Double = js.native
  }
  
  @JSImport("@material/chips", "MDCChipActionType")
  @js.native
  object MDCChipActionType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.materialChips.actionConstantsMod.MDCChipActionType & Double] = js.native
    
    /* 1 */ val PRIMARY: typings.materialChips.actionConstantsMod.MDCChipActionType.PRIMARY & Double = js.native
    
    /* 2 */ val TRAILING: typings.materialChips.actionConstantsMod.MDCChipActionType.TRAILING & Double = js.native
    
    /* 0 */ val UNSPECIFIED: typings.materialChips.actionConstantsMod.MDCChipActionType.UNSPECIFIED & Double = js.native
  }
  
  @JSImport("@material/chips", "MDCChipAnimation")
  @js.native
  object MDCChipAnimation extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.materialChips.chipConstantsMod.MDCChipAnimation & String] = js.native
    
    /* "mdc-evolution-chip-enter" */ val ENTER: typings.materialChips.chipConstantsMod.MDCChipAnimation.ENTER & String = js.native
    
    /* "mdc-evolution-chip-exit" */ val EXIT: typings.materialChips.chipConstantsMod.MDCChipAnimation.EXIT & String = js.native
  }
  
  @JSImport("@material/chips", "MDCChipAttributes")
  @js.native
  object MDCChipAttributes extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.materialChips.chipConstantsMod.MDCChipAttributes & String] = js.native
    
    /* "data-mdc-added-announcement" */ val DATA_ADDED_ANNOUNCEMENT: typings.materialChips.chipConstantsMod.MDCChipAttributes.DATA_ADDED_ANNOUNCEMENT & String = js.native
    
    /* "data-mdc-removed-announcement" */ val DATA_REMOVED_ANNOUNCEMENT: typings.materialChips.chipConstantsMod.MDCChipAttributes.DATA_REMOVED_ANNOUNCEMENT & String = js.native
  }
  
  @JSImport("@material/chips", "MDCChipCssClasses")
  @js.native
  object MDCChipCssClasses extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.materialChips.chipConstantsMod.MDCChipCssClasses & String] = js.native
    
    /* "mdc-evolution-chip--deselecting" */ val DESELECTING: typings.materialChips.chipConstantsMod.MDCChipCssClasses.DESELECTING & String = js.native
    
    /* "mdc-evolution-chip--deselecting-with-primary-icon" */ val DESELECTING_WITH_PRIMARY_ICON: typings.materialChips.chipConstantsMod.MDCChipCssClasses.DESELECTING_WITH_PRIMARY_ICON & String = js.native
    
    /* "mdc-evolution-chip--disabled" */ val DISABLED: typings.materialChips.chipConstantsMod.MDCChipCssClasses.DISABLED & String = js.native
    
    /* "mdc-evolution-chip--enter" */ val ENTER: typings.materialChips.chipConstantsMod.MDCChipCssClasses.ENTER & String = js.native
    
    /* "mdc-evolution-chip--exit" */ val EXIT: typings.materialChips.chipConstantsMod.MDCChipCssClasses.EXIT & String = js.native
    
    /* "mdc-evolution-chip--hidden" */ val HIDDEN: typings.materialChips.chipConstantsMod.MDCChipCssClasses.HIDDEN & String = js.native
    
    /* "mdc-evolution-chip--selected" */ val SELECTED: typings.materialChips.chipConstantsMod.MDCChipCssClasses.SELECTED & String = js.native
    
    /* "mdc-evolution-chip--selecting" */ val SELECTING: typings.materialChips.chipConstantsMod.MDCChipCssClasses.SELECTING & String = js.native
    
    /* "mdc-evolution-chip--selecting-with-primary-icon" */ val SELECTING_WITH_PRIMARY_ICON: typings.materialChips.chipConstantsMod.MDCChipCssClasses.SELECTING_WITH_PRIMARY_ICON & String = js.native
    
    /* "mdc-evolution-chip--with-primary-icon" */ val WITH_PRIMARY_ICON: typings.materialChips.chipConstantsMod.MDCChipCssClasses.WITH_PRIMARY_ICON & String = js.native
  }
  
  @JSImport("@material/chips", "MDCChipEvents")
  @js.native
  object MDCChipEvents extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.materialChips.chipConstantsMod.MDCChipEvents & String] = js.native
    
    /* "MDCChip:animation" */ val ANIMATION: typings.materialChips.chipConstantsMod.MDCChipEvents.ANIMATION & String = js.native
    
    /* "MDCChip:interaction" */ val INTERACTION: typings.materialChips.chipConstantsMod.MDCChipEvents.INTERACTION & String = js.native
    
    /* "MDCChip:navigation" */ val NAVIGATION: typings.materialChips.chipConstantsMod.MDCChipEvents.NAVIGATION & String = js.native
  }
  
  @JSImport("@material/chips", "MDCChipFoundation")
  @js.native
  open class MDCChipFoundation ()
    extends typings.materialChips.chipMod.MDCChipFoundation {
    def this(adapter: PartialMDCChipAdapter) = this()
  }
  
  @JSImport("@material/chips", "MDCChipPrimaryActionFoundation")
  @js.native
  open class MDCChipPrimaryActionFoundation ()
    extends typings.materialChips.actionMod.MDCChipPrimaryActionFoundation {
    def this(adapter: PartialMDCChipActionAdapt) = this()
  }
  
  @JSImport("@material/chips", "MDCChipSet")
  @js.native
  open class MDCChipSet protected ()
    extends typings.materialChips.chipSetMod.MDCChipSet {
    def this(root: Element, foundation: Unit, args: Any*) = this()
    def this(
      root: Element,
      foundation: typings.materialChips.chipSetFoundationMod.MDCChipSetFoundation,
      args: Any*
    ) = this()
  }
  /* static members */
  object MDCChipSet {
    
    @JSImport("@material/chips", "MDCChipSet")
    @js.native
    val ^ : js.Any = js.native
    
    inline def attachTo(root: typings.std.Element): typings.materialChips.chipSetComponentMod.MDCChipSet = ^.asInstanceOf[js.Dynamic].applyDynamic("attachTo")(root.asInstanceOf[js.Any]).asInstanceOf[typings.materialChips.chipSetComponentMod.MDCChipSet]
  }
  
  @JSImport("@material/chips", "MDCChipSetAttributes")
  @js.native
  object MDCChipSetAttributes extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.materialChips.chipSetConstantsMod.MDCChipSetAttributes & String] = js.native
    
    /* "aria-multiselectable" */ val ARIA_MULTISELECTABLE: typings.materialChips.chipSetConstantsMod.MDCChipSetAttributes.ARIA_MULTISELECTABLE & String = js.native
  }
  
  @JSImport("@material/chips", "MDCChipSetCssClasses")
  @js.native
  object MDCChipSetCssClasses extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.materialChips.chipSetConstantsMod.MDCChipSetCssClasses & String] = js.native
    
    /* "mdc-evolution-chip" */ val CHIP: typings.materialChips.chipSetConstantsMod.MDCChipSetCssClasses.CHIP & String = js.native
  }
  
  @JSImport("@material/chips", "MDCChipSetEvents")
  @js.native
  object MDCChipSetEvents extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.materialChips.chipSetConstantsMod.MDCChipSetEvents & String] = js.native
    
    /* "MDCChipSet:interaction" */ val INTERACTION: typings.materialChips.chipSetConstantsMod.MDCChipSetEvents.INTERACTION & String = js.native
    
    /* "MDCChipSet:removal" */ val REMOVAL: typings.materialChips.chipSetConstantsMod.MDCChipSetEvents.REMOVAL & String = js.native
    
    /* "MDCChipSet:selection" */ val SELECTION: typings.materialChips.chipSetConstantsMod.MDCChipSetEvents.SELECTION & String = js.native
  }
  
  @JSImport("@material/chips", "MDCChipSetFoundation")
  @js.native
  open class MDCChipSetFoundation ()
    extends typings.materialChips.chipSetMod.MDCChipSetFoundation {
    def this(adapter: PartialMDCChipSetAdapter) = this()
  }
  
  @JSImport("@material/chips", "MDCChipTrailingActionFoundation")
  @js.native
  open class MDCChipTrailingActionFoundation ()
    extends typings.materialChips.actionMod.MDCChipTrailingActionFoundation {
    def this(adapter: PartialMDCChipActionAdapt) = this()
  }
  
  object deprecated {
    
    @JSImport("@material/chips", "deprecated.MDCChip")
    @js.native
    open class MDCChip protected ()
      extends typings.materialChips.deprecatedMod.MDCChip {
      def this(root: Element, foundation: Unit, args: Any*) = this()
      def this(
        root: Element,
        foundation: typings.materialChips.deprecatedChipFoundationMod.MDCChipFoundation,
        args: Any*
      ) = this()
    }
    /* static members */
    object MDCChip {
      
      @JSImport("@material/chips", "deprecated.MDCChip")
      @js.native
      val ^ : js.Any = js.native
      
      inline def attachTo(root: typings.std.Element): typings.materialChips.deprecatedChipComponentMod.MDCChip = ^.asInstanceOf[js.Dynamic].applyDynamic("attachTo")(root.asInstanceOf[js.Any]).asInstanceOf[typings.materialChips.deprecatedChipComponentMod.MDCChip]
    }
    
    @JSImport("@material/chips", "deprecated.MDCChipFoundation")
    @js.native
    open class MDCChipFoundation ()
      extends typings.materialChips.deprecatedMod.MDCChipFoundation {
      def this(adapter: PartialMDCChipAdapterAddClass) = this()
    }
    
    @JSImport("@material/chips", "deprecated.MDCChipSet")
    @js.native
    open class MDCChipSet protected ()
      extends typings.materialChips.deprecatedMod.MDCChipSet {
      def this(root: Element, foundation: Unit, args: Any*) = this()
      def this(
        root: Element,
        foundation: typings.materialChips.deprecatedChipSetFoundationMod.MDCChipSetFoundation,
        args: Any*
      ) = this()
    }
    /* static members */
    object MDCChipSet {
      
      @JSImport("@material/chips", "deprecated.MDCChipSet")
      @js.native
      val ^ : js.Any = js.native
      
      inline def attachTo(root: typings.std.Element): typings.materialChips.deprecatedChipSetComponentMod.MDCChipSet = ^.asInstanceOf[js.Dynamic].applyDynamic("attachTo")(root.asInstanceOf[js.Any]).asInstanceOf[typings.materialChips.deprecatedChipSetComponentMod.MDCChipSet]
    }
    
    @JSImport("@material/chips", "deprecated.MDCChipSetFoundation")
    @js.native
    open class MDCChipSetFoundation ()
      extends typings.materialChips.deprecatedMod.MDCChipSetFoundation {
      def this(adapter: PartialMDCChipSetAdapterAnnounceMessage) = this()
    }
    
    @JSImport("@material/chips", "deprecated.MDCChipTrailingAction")
    @js.native
    open class MDCChipTrailingAction protected ()
      extends typings.materialChips.deprecatedMod.MDCChipTrailingAction {
      def this(root: Element, foundation: Unit, args: Any*) = this()
      def this(
        root: Element,
        foundation: typings.materialChips.deprecatedTrailingactionFoundationMod.MDCChipTrailingActionFoundation,
        args: Any*
      ) = this()
    }
    /* static members */
    object MDCChipTrailingAction {
      
      @JSImport("@material/chips", "deprecated.MDCChipTrailingAction")
      @js.native
      val ^ : js.Any = js.native
      
      inline def attachTo(root: typings.std.Element): typings.materialChips.deprecatedTrailingactionComponentMod.MDCChipTrailingAction = ^.asInstanceOf[js.Dynamic].applyDynamic("attachTo")(root.asInstanceOf[js.Any]).asInstanceOf[typings.materialChips.deprecatedTrailingactionComponentMod.MDCChipTrailingAction]
    }
    
    @JSImport("@material/chips", "deprecated.MDCChipTrailingActionFoundation")
    @js.native
    open class MDCChipTrailingActionFoundation ()
      extends typings.materialChips.deprecatedMod.MDCChipTrailingActionFoundation {
      def this(adapter: PartialMDCChipTrailingAct) = this()
    }
    
    object chipCssClasses {
      
      @JSImport("@material/chips", "deprecated.chipCssClasses")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("@material/chips", "deprecated.chipCssClasses.CHECKMARK")
      @js.native
      def CHECKMARK: String = js.native
      inline def CHECKMARK_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CHECKMARK")(x.asInstanceOf[js.Any])
      
      @JSImport("@material/chips", "deprecated.chipCssClasses.CHIP_EXIT")
      @js.native
      def CHIP_EXIT: String = js.native
      inline def CHIP_EXIT_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CHIP_EXIT")(x.asInstanceOf[js.Any])
      
      @JSImport("@material/chips", "deprecated.chipCssClasses.DELETABLE")
      @js.native
      def DELETABLE: String = js.native
      inline def DELETABLE_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DELETABLE")(x.asInstanceOf[js.Any])
      
      @JSImport("@material/chips", "deprecated.chipCssClasses.EDITABLE")
      @js.native
      def EDITABLE: String = js.native
      inline def EDITABLE_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("EDITABLE")(x.asInstanceOf[js.Any])
      
      @JSImport("@material/chips", "deprecated.chipCssClasses.EDITING")
      @js.native
      def EDITING: String = js.native
      inline def EDITING_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("EDITING")(x.asInstanceOf[js.Any])
      
      @JSImport("@material/chips", "deprecated.chipCssClasses.HIDDEN_LEADING_ICON")
      @js.native
      def HIDDEN_LEADING_ICON: String = js.native
      inline def HIDDEN_LEADING_ICON_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("HIDDEN_LEADING_ICON")(x.asInstanceOf[js.Any])
      
      @JSImport("@material/chips", "deprecated.chipCssClasses.LEADING_ICON")
      @js.native
      def LEADING_ICON: String = js.native
      inline def LEADING_ICON_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LEADING_ICON")(x.asInstanceOf[js.Any])
      
      @JSImport("@material/chips", "deprecated.chipCssClasses.PRIMARY_ACTION")
      @js.native
      def PRIMARY_ACTION: String = js.native
      inline def PRIMARY_ACTION_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PRIMARY_ACTION")(x.asInstanceOf[js.Any])
      
      @JSImport("@material/chips", "deprecated.chipCssClasses.PRIMARY_ACTION_FOCUSED")
      @js.native
      def PRIMARY_ACTION_FOCUSED: String = js.native
      inline def PRIMARY_ACTION_FOCUSED_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PRIMARY_ACTION_FOCUSED")(x.asInstanceOf[js.Any])
      
      @JSImport("@material/chips", "deprecated.chipCssClasses.SELECTED")
      @js.native
      def SELECTED: String = js.native
      inline def SELECTED_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SELECTED")(x.asInstanceOf[js.Any])
      
      @JSImport("@material/chips", "deprecated.chipCssClasses.TEXT")
      @js.native
      def TEXT: String = js.native
      inline def TEXT_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TEXT")(x.asInstanceOf[js.Any])
      
      @JSImport("@material/chips", "deprecated.chipCssClasses.TRAILING_ACTION")
      @js.native
      def TRAILING_ACTION: String = js.native
      inline def TRAILING_ACTION_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TRAILING_ACTION")(x.asInstanceOf[js.Any])
      
      @JSImport("@material/chips", "deprecated.chipCssClasses.TRAILING_ICON")
      @js.native
      def TRAILING_ICON: String = js.native
      inline def TRAILING_ICON_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TRAILING_ICON")(x.asInstanceOf[js.Any])
    }
    
    object chipSetCssClasses {
      
      @JSImport("@material/chips", "deprecated.chipSetCssClasses")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("@material/chips", "deprecated.chipSetCssClasses.CHOICE")
      @js.native
      def CHOICE: String = js.native
      inline def CHOICE_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CHOICE")(x.asInstanceOf[js.Any])
      
      @JSImport("@material/chips", "deprecated.chipSetCssClasses.FILTER")
      @js.native
      def FILTER: String = js.native
      inline def FILTER_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FILTER")(x.asInstanceOf[js.Any])
    }
    
    object chipSetStrings {
      
      @JSImport("@material/chips", "deprecated.chipSetStrings")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("@material/chips", "deprecated.chipSetStrings.CHIP_SELECTOR")
      @js.native
      def CHIP_SELECTOR: String = js.native
      inline def CHIP_SELECTOR_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CHIP_SELECTOR")(x.asInstanceOf[js.Any])
    }
    
    object chipStrings {
      
      @JSImport("@material/chips", "deprecated.chipStrings")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("@material/chips", "deprecated.chipStrings.ADDED_ANNOUNCEMENT_ATTRIBUTE")
      @js.native
      def ADDED_ANNOUNCEMENT_ATTRIBUTE: String = js.native
      inline def ADDED_ANNOUNCEMENT_ATTRIBUTE_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ADDED_ANNOUNCEMENT_ATTRIBUTE")(x.asInstanceOf[js.Any])
      
      @JSImport("@material/chips", "deprecated.chipStrings.ARIA_CHECKED")
      @js.native
      def ARIA_CHECKED: String = js.native
      inline def ARIA_CHECKED_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ARIA_CHECKED")(x.asInstanceOf[js.Any])
      
      @JSImport("@material/chips", "deprecated.chipStrings.ARROW_DOWN_KEY")
      @js.native
      def ARROW_DOWN_KEY: String = js.native
      inline def ARROW_DOWN_KEY_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ARROW_DOWN_KEY")(x.asInstanceOf[js.Any])
      
      @JSImport("@material/chips", "deprecated.chipStrings.ARROW_LEFT_KEY")
      @js.native
      def ARROW_LEFT_KEY: String = js.native
      inline def ARROW_LEFT_KEY_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ARROW_LEFT_KEY")(x.asInstanceOf[js.Any])
      
      @JSImport("@material/chips", "deprecated.chipStrings.ARROW_RIGHT_KEY")
      @js.native
      def ARROW_RIGHT_KEY: String = js.native
      inline def ARROW_RIGHT_KEY_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ARROW_RIGHT_KEY")(x.asInstanceOf[js.Any])
      
      @JSImport("@material/chips", "deprecated.chipStrings.ARROW_UP_KEY")
      @js.native
      def ARROW_UP_KEY: String = js.native
      inline def ARROW_UP_KEY_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ARROW_UP_KEY")(x.asInstanceOf[js.Any])
      
      @JSImport("@material/chips", "deprecated.chipStrings.BACKSPACE_KEY")
      @js.native
      def BACKSPACE_KEY: String = js.native
      inline def BACKSPACE_KEY_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BACKSPACE_KEY")(x.asInstanceOf[js.Any])
      
      @JSImport("@material/chips", "deprecated.chipStrings.CHECKMARK_SELECTOR")
      @js.native
      def CHECKMARK_SELECTOR: String = js.native
      inline def CHECKMARK_SELECTOR_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CHECKMARK_SELECTOR")(x.asInstanceOf[js.Any])
      
      @JSImport("@material/chips", "deprecated.chipStrings.DELETE_KEY")
      @js.native
      def DELETE_KEY: String = js.native
      inline def DELETE_KEY_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DELETE_KEY")(x.asInstanceOf[js.Any])
      
      @JSImport("@material/chips", "deprecated.chipStrings.END_KEY")
      @js.native
      def END_KEY: String = js.native
      inline def END_KEY_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("END_KEY")(x.asInstanceOf[js.Any])
      
      @JSImport("@material/chips", "deprecated.chipStrings.ENTER_KEY")
      @js.native
      def ENTER_KEY: String = js.native
      inline def ENTER_KEY_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ENTER_KEY")(x.asInstanceOf[js.Any])
      
      @JSImport("@material/chips", "deprecated.chipStrings.ENTRY_ANIMATION_NAME")
      @js.native
      def ENTRY_ANIMATION_NAME: String = js.native
      inline def ENTRY_ANIMATION_NAME_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ENTRY_ANIMATION_NAME")(x.asInstanceOf[js.Any])
      
      @JSImport("@material/chips", "deprecated.chipStrings.HOME_KEY")
      @js.native
      def HOME_KEY: String = js.native
      inline def HOME_KEY_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("HOME_KEY")(x.asInstanceOf[js.Any])
      
      @JSImport("@material/chips", "deprecated.chipStrings.IE_ARROW_DOWN_KEY")
      @js.native
      def IE_ARROW_DOWN_KEY: String = js.native
      inline def IE_ARROW_DOWN_KEY_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("IE_ARROW_DOWN_KEY")(x.asInstanceOf[js.Any])
      
      @JSImport("@material/chips", "deprecated.chipStrings.IE_ARROW_LEFT_KEY")
      @js.native
      def IE_ARROW_LEFT_KEY: String = js.native
      inline def IE_ARROW_LEFT_KEY_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("IE_ARROW_LEFT_KEY")(x.asInstanceOf[js.Any])
      
      @JSImport("@material/chips", "deprecated.chipStrings.IE_ARROW_RIGHT_KEY")
      @js.native
      def IE_ARROW_RIGHT_KEY: String = js.native
      inline def IE_ARROW_RIGHT_KEY_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("IE_ARROW_RIGHT_KEY")(x.asInstanceOf[js.Any])
      
      @JSImport("@material/chips", "deprecated.chipStrings.IE_ARROW_UP_KEY")
      @js.native
      def IE_ARROW_UP_KEY: String = js.native
      inline def IE_ARROW_UP_KEY_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("IE_ARROW_UP_KEY")(x.asInstanceOf[js.Any])
      
      @JSImport("@material/chips", "deprecated.chipStrings.IE_DELETE_KEY")
      @js.native
      def IE_DELETE_KEY: String = js.native
      inline def IE_DELETE_KEY_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("IE_DELETE_KEY")(x.asInstanceOf[js.Any])
      
      @JSImport("@material/chips", "deprecated.chipStrings.INTERACTION_EVENT")
      @js.native
      def INTERACTION_EVENT: String = js.native
      inline def INTERACTION_EVENT_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("INTERACTION_EVENT")(x.asInstanceOf[js.Any])
      
      @JSImport("@material/chips", "deprecated.chipStrings.LEADING_ICON_SELECTOR")
      @js.native
      def LEADING_ICON_SELECTOR: String = js.native
      inline def LEADING_ICON_SELECTOR_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LEADING_ICON_SELECTOR")(x.asInstanceOf[js.Any])
      
      @JSImport("@material/chips", "deprecated.chipStrings.NAVIGATION_EVENT")
      @js.native
      def NAVIGATION_EVENT: String = js.native
      inline def NAVIGATION_EVENT_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NAVIGATION_EVENT")(x.asInstanceOf[js.Any])
      
      @JSImport("@material/chips", "deprecated.chipStrings.PRIMARY_ACTION_SELECTOR")
      @js.native
      def PRIMARY_ACTION_SELECTOR: String = js.native
      inline def PRIMARY_ACTION_SELECTOR_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PRIMARY_ACTION_SELECTOR")(x.asInstanceOf[js.Any])
      
      @JSImport("@material/chips", "deprecated.chipStrings.REMOVAL_EVENT")
      @js.native
      def REMOVAL_EVENT: String = js.native
      inline def REMOVAL_EVENT_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("REMOVAL_EVENT")(x.asInstanceOf[js.Any])
      
      @JSImport("@material/chips", "deprecated.chipStrings.REMOVED_ANNOUNCEMENT_ATTRIBUTE")
      @js.native
      def REMOVED_ANNOUNCEMENT_ATTRIBUTE: String = js.native
      inline def REMOVED_ANNOUNCEMENT_ATTRIBUTE_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("REMOVED_ANNOUNCEMENT_ATTRIBUTE")(x.asInstanceOf[js.Any])
      
      @JSImport("@material/chips", "deprecated.chipStrings.SELECTION_EVENT")
      @js.native
      def SELECTION_EVENT: String = js.native
      inline def SELECTION_EVENT_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SELECTION_EVENT")(x.asInstanceOf[js.Any])
      
      @JSImport("@material/chips", "deprecated.chipStrings.SPACEBAR_KEY")
      @js.native
      def SPACEBAR_KEY: String = js.native
      inline def SPACEBAR_KEY_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SPACEBAR_KEY")(x.asInstanceOf[js.Any])
      
      @JSImport("@material/chips", "deprecated.chipStrings.TAB_INDEX")
      @js.native
      def TAB_INDEX: String = js.native
      inline def TAB_INDEX_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TAB_INDEX")(x.asInstanceOf[js.Any])
      
      @JSImport("@material/chips", "deprecated.chipStrings.TRAILING_ACTION_SELECTOR")
      @js.native
      def TRAILING_ACTION_SELECTOR: String = js.native
      inline def TRAILING_ACTION_SELECTOR_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TRAILING_ACTION_SELECTOR")(x.asInstanceOf[js.Any])
      
      @JSImport("@material/chips", "deprecated.chipStrings.TRAILING_ICON_INTERACTION_EVENT")
      @js.native
      def TRAILING_ICON_INTERACTION_EVENT: String = js.native
      inline def TRAILING_ICON_INTERACTION_EVENT_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TRAILING_ICON_INTERACTION_EVENT")(x.asInstanceOf[js.Any])
      
      @JSImport("@material/chips", "deprecated.chipStrings.TRAILING_ICON_SELECTOR")
      @js.native
      def TRAILING_ICON_SELECTOR: String = js.native
      inline def TRAILING_ICON_SELECTOR_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TRAILING_ICON_SELECTOR")(x.asInstanceOf[js.Any])
    }
    
    object trailingActionStrings {
      
      @JSImport("@material/chips", "deprecated.trailingActionStrings")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("@material/chips", "deprecated.trailingActionStrings.ARIA_HIDDEN")
      @js.native
      def ARIA_HIDDEN: String = js.native
      inline def ARIA_HIDDEN_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ARIA_HIDDEN")(x.asInstanceOf[js.Any])
      
      @JSImport("@material/chips", "deprecated.trailingActionStrings.INTERACTION_EVENT")
      @js.native
      def INTERACTION_EVENT: String = js.native
      inline def INTERACTION_EVENT_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("INTERACTION_EVENT")(x.asInstanceOf[js.Any])
      
      @JSImport("@material/chips", "deprecated.trailingActionStrings.NAVIGATION_EVENT")
      @js.native
      def NAVIGATION_EVENT: String = js.native
      inline def NAVIGATION_EVENT_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NAVIGATION_EVENT")(x.asInstanceOf[js.Any])
      
      @JSImport("@material/chips", "deprecated.trailingActionStrings.TAB_INDEX")
      @js.native
      def TAB_INDEX: String = js.native
      inline def TAB_INDEX_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TAB_INDEX")(x.asInstanceOf[js.Any])
    }
  }
}
