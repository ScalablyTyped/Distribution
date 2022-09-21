package typings.materialChips

import typings.materialBase.Element
import typings.materialChips.anon.PartialMDCChipActionAdapt
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object actionMod {
  
  @JSImport("@material/chips/action", "MDCChipAction")
  @js.native
  open class MDCChipAction protected ()
    extends typings.materialChips.componentMod.MDCChipAction {
    def this(root: Element, foundation: Unit, args: Any*) = this()
    def this(root: Element, foundation: typings.materialChips.foundationMod.MDCChipActionFoundation, args: Any*) = this()
  }
  /* static members */
  object MDCChipAction {
    
    @JSImport("@material/chips/action", "MDCChipAction")
    @js.native
    val ^ : js.Any = js.native
    
    inline def attachTo(root: typings.std.Element): typings.materialChips.componentMod.MDCChipAction = ^.asInstanceOf[js.Dynamic].applyDynamic("attachTo")(root.asInstanceOf[js.Any]).asInstanceOf[typings.materialChips.componentMod.MDCChipAction]
  }
  
  @JSImport("@material/chips/action", "MDCChipActionAttributes")
  @js.native
  object MDCChipActionAttributes extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.materialChips.constantsMod.MDCChipActionAttributes & String] = js.native
    
    /* "aria-disabled" */ val ARIA_DISABLED: typings.materialChips.constantsMod.MDCChipActionAttributes.ARIA_DISABLED & String = js.native
    
    /* "aria-hidden" */ val ARIA_HIDDEN: typings.materialChips.constantsMod.MDCChipActionAttributes.ARIA_HIDDEN & String = js.native
    
    /* "aria-selected" */ val ARIA_SELECTED: typings.materialChips.constantsMod.MDCChipActionAttributes.ARIA_SELECTED & String = js.native
    
    /* "data-mdc-deletable" */ val DATA_DELETABLE: typings.materialChips.constantsMod.MDCChipActionAttributes.DATA_DELETABLE & String = js.native
    
    /* "disabled" */ val DISABLED: typings.materialChips.constantsMod.MDCChipActionAttributes.DISABLED & String = js.native
    
    /* "role" */ val ROLE: typings.materialChips.constantsMod.MDCChipActionAttributes.ROLE & String = js.native
    
    /* "tabindex" */ val TAB_INDEX: typings.materialChips.constantsMod.MDCChipActionAttributes.TAB_INDEX & String = js.native
  }
  
  @JSImport("@material/chips/action", "MDCChipActionCssClasses")
  @js.native
  object MDCChipActionCssClasses extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.materialChips.constantsMod.MDCChipActionCssClasses & String] = js.native
    
    /* "mdc-evolution-chip" */ val CHIP_ROOT: typings.materialChips.constantsMod.MDCChipActionCssClasses.CHIP_ROOT & String = js.native
    
    /* "mdc-evolution-chip__action--primary" */ val PRIMARY_ACTION: typings.materialChips.constantsMod.MDCChipActionCssClasses.PRIMARY_ACTION & String = js.native
    
    /* "mdc-evolution-chip__action--trailing" */ val TRAILING_ACTION: typings.materialChips.constantsMod.MDCChipActionCssClasses.TRAILING_ACTION & String = js.native
  }
  
  @JSImport("@material/chips/action", "MDCChipActionEvents")
  @js.native
  object MDCChipActionEvents extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.materialChips.constantsMod.MDCChipActionEvents & String] = js.native
    
    /* "MDCChipAction:interaction" */ val INTERACTION: typings.materialChips.constantsMod.MDCChipActionEvents.INTERACTION & String = js.native
    
    /* "MDCChipAction:navigation" */ val NAVIGATION: typings.materialChips.constantsMod.MDCChipActionEvents.NAVIGATION & String = js.native
  }
  
  @JSImport("@material/chips/action", "MDCChipActionFocusBehavior")
  @js.native
  object MDCChipActionFocusBehavior extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.materialChips.constantsMod.MDCChipActionFocusBehavior & Double] = js.native
    
    /* 0 */ val FOCUSABLE: typings.materialChips.constantsMod.MDCChipActionFocusBehavior.FOCUSABLE & Double = js.native
    
    /* 1 */ val FOCUSABLE_AND_FOCUSED: typings.materialChips.constantsMod.MDCChipActionFocusBehavior.FOCUSABLE_AND_FOCUSED & Double = js.native
    
    /* 2 */ val NOT_FOCUSABLE: typings.materialChips.constantsMod.MDCChipActionFocusBehavior.NOT_FOCUSABLE & Double = js.native
  }
  
  @JSImport("@material/chips/action", "MDCChipActionFoundation")
  @js.native
  abstract class MDCChipActionFoundation ()
    extends typings.materialChips.foundationMod.MDCChipActionFoundation {
    def this(adapter: PartialMDCChipActionAdapt) = this()
  }
  
  @JSImport("@material/chips/action", "MDCChipActionInteractionTrigger")
  @js.native
  object MDCChipActionInteractionTrigger extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.materialChips.constantsMod.MDCChipActionInteractionTrigger & Double] = js.native
    
    /* 2 */ val BACKSPACE_KEY: typings.materialChips.constantsMod.MDCChipActionInteractionTrigger.BACKSPACE_KEY & Double = js.native
    
    /* 1 */ val CLICK: typings.materialChips.constantsMod.MDCChipActionInteractionTrigger.CLICK & Double = js.native
    
    /* 3 */ val DELETE_KEY: typings.materialChips.constantsMod.MDCChipActionInteractionTrigger.DELETE_KEY & Double = js.native
    
    /* 5 */ val ENTER_KEY: typings.materialChips.constantsMod.MDCChipActionInteractionTrigger.ENTER_KEY & Double = js.native
    
    /* 4 */ val SPACEBAR_KEY: typings.materialChips.constantsMod.MDCChipActionInteractionTrigger.SPACEBAR_KEY & Double = js.native
    
    /* 0 */ val UNSPECIFIED: typings.materialChips.constantsMod.MDCChipActionInteractionTrigger.UNSPECIFIED & Double = js.native
  }
  
  @JSImport("@material/chips/action", "MDCChipActionType")
  @js.native
  object MDCChipActionType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.materialChips.constantsMod.MDCChipActionType & Double] = js.native
    
    /* 1 */ val PRIMARY: typings.materialChips.constantsMod.MDCChipActionType.PRIMARY & Double = js.native
    
    /* 2 */ val TRAILING: typings.materialChips.constantsMod.MDCChipActionType.TRAILING & Double = js.native
    
    /* 0 */ val UNSPECIFIED: typings.materialChips.constantsMod.MDCChipActionType.UNSPECIFIED & Double = js.native
  }
  
  @JSImport("@material/chips/action", "MDCChipPrimaryActionFoundation")
  @js.native
  open class MDCChipPrimaryActionFoundation ()
    extends typings.materialChips.primaryFoundationMod.MDCChipPrimaryActionFoundation {
    def this(adapter: PartialMDCChipActionAdapt) = this()
  }
  
  @JSImport("@material/chips/action", "MDCChipTrailingActionFoundation")
  @js.native
  open class MDCChipTrailingActionFoundation ()
    extends typings.materialChips.trailingFoundationMod.MDCChipTrailingActionFoundation {
    def this(adapter: PartialMDCChipActionAdapt) = this()
  }
}
