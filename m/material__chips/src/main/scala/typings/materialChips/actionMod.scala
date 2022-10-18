package typings.materialChips

import typings.materialBase.Element
import typings.materialChips.anon.PartialMDCChipActionAdapt
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object actionMod {
  
  @JSImport("@material/chips/action", JSImport.Default)
  @js.native
  open class default ()
    extends typings.materialChips.actionTrailingFoundationMod.default {
    def this(adapter: PartialMDCChipActionAdapt) = this()
  }
  
  @JSImport("@material/chips/action", "MDCChipAction")
  @js.native
  open class MDCChipAction protected ()
    extends typings.materialChips.actionComponentMod.MDCChipAction {
    def this(root: Element, foundation: Unit, args: Any*) = this()
    def this(
      root: Element,
      foundation: typings.materialChips.actionFoundationMod.MDCChipActionFoundation,
      args: Any*
    ) = this()
  }
  /* static members */
  object MDCChipAction {
    
    @JSImport("@material/chips/action", "MDCChipAction")
    @js.native
    val ^ : js.Any = js.native
    
    inline def attachTo(root: typings.std.Element): typings.materialChips.actionComponentMod.MDCChipAction = ^.asInstanceOf[js.Dynamic].applyDynamic("attachTo")(root.asInstanceOf[js.Any]).asInstanceOf[typings.materialChips.actionComponentMod.MDCChipAction]
  }
  
  @JSImport("@material/chips/action", "MDCChipActionAttributes")
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
  
  @JSImport("@material/chips/action", "MDCChipActionCssClasses")
  @js.native
  object MDCChipActionCssClasses extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.materialChips.actionConstantsMod.MDCChipActionCssClasses & String] = js.native
    
    /* "mdc-evolution-chip" */ val CHIP_ROOT: typings.materialChips.actionConstantsMod.MDCChipActionCssClasses.CHIP_ROOT & String = js.native
    
    /* "mdc-evolution-chip__action--primary" */ val PRIMARY_ACTION: typings.materialChips.actionConstantsMod.MDCChipActionCssClasses.PRIMARY_ACTION & String = js.native
    
    /* "mdc-evolution-chip__action--trailing" */ val TRAILING_ACTION: typings.materialChips.actionConstantsMod.MDCChipActionCssClasses.TRAILING_ACTION & String = js.native
  }
  
  @JSImport("@material/chips/action", "MDCChipActionEvents")
  @js.native
  object MDCChipActionEvents extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.materialChips.actionConstantsMod.MDCChipActionEvents & String] = js.native
    
    /* "MDCChipAction:interaction" */ val INTERACTION: typings.materialChips.actionConstantsMod.MDCChipActionEvents.INTERACTION & String = js.native
    
    /* "MDCChipAction:navigation" */ val NAVIGATION: typings.materialChips.actionConstantsMod.MDCChipActionEvents.NAVIGATION & String = js.native
  }
  
  @JSImport("@material/chips/action", "MDCChipActionFocusBehavior")
  @js.native
  object MDCChipActionFocusBehavior extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.materialChips.actionConstantsMod.MDCChipActionFocusBehavior & Double] = js.native
    
    /* 0 */ val FOCUSABLE: typings.materialChips.actionConstantsMod.MDCChipActionFocusBehavior.FOCUSABLE & Double = js.native
    
    /* 1 */ val FOCUSABLE_AND_FOCUSED: typings.materialChips.actionConstantsMod.MDCChipActionFocusBehavior.FOCUSABLE_AND_FOCUSED & Double = js.native
    
    /* 2 */ val NOT_FOCUSABLE: typings.materialChips.actionConstantsMod.MDCChipActionFocusBehavior.NOT_FOCUSABLE & Double = js.native
  }
  
  /* note: abstract class */ @JSImport("@material/chips/action", "MDCChipActionFoundation")
  @js.native
  open class MDCChipActionFoundation ()
    extends typings.materialChips.actionFoundationMod.MDCChipActionFoundation {
    def this(adapter: PartialMDCChipActionAdapt) = this()
  }
  
  @JSImport("@material/chips/action", "MDCChipActionInteractionTrigger")
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
  
  @JSImport("@material/chips/action", "MDCChipActionType")
  @js.native
  object MDCChipActionType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.materialChips.actionConstantsMod.MDCChipActionType & Double] = js.native
    
    /* 1 */ val PRIMARY: typings.materialChips.actionConstantsMod.MDCChipActionType.PRIMARY & Double = js.native
    
    /* 2 */ val TRAILING: typings.materialChips.actionConstantsMod.MDCChipActionType.TRAILING & Double = js.native
    
    /* 0 */ val UNSPECIFIED: typings.materialChips.actionConstantsMod.MDCChipActionType.UNSPECIFIED & Double = js.native
  }
  
  @JSImport("@material/chips/action", "MDCChipPrimaryActionFoundation")
  @js.native
  open class MDCChipPrimaryActionFoundation ()
    extends typings.materialChips.actionPrimaryFoundationMod.MDCChipPrimaryActionFoundation {
    def this(adapter: PartialMDCChipActionAdapt) = this()
  }
  
  @JSImport("@material/chips/action", "MDCChipTrailingActionFoundation")
  @js.native
  open class MDCChipTrailingActionFoundation ()
    extends typings.materialChips.actionTrailingFoundationMod.MDCChipTrailingActionFoundation {
    def this(adapter: PartialMDCChipActionAdapt) = this()
  }
}
