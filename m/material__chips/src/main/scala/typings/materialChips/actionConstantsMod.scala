package typings.materialChips

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object actionConstantsMod {
  
  @js.native
  sealed trait MDCChipActionAttributes extends StObject
  @JSImport("@material/chips/action/constants", "MDCChipActionAttributes")
  @js.native
  object MDCChipActionAttributes extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[MDCChipActionAttributes & String] = js.native
    
    @js.native
    sealed trait ARIA_DISABLED
      extends StObject
         with MDCChipActionAttributes
    /* "aria-disabled" */ val ARIA_DISABLED: typings.materialChips.actionConstantsMod.MDCChipActionAttributes.ARIA_DISABLED & String = js.native
    
    @js.native
    sealed trait ARIA_HIDDEN
      extends StObject
         with MDCChipActionAttributes
    /* "aria-hidden" */ val ARIA_HIDDEN: typings.materialChips.actionConstantsMod.MDCChipActionAttributes.ARIA_HIDDEN & String = js.native
    
    @js.native
    sealed trait ARIA_SELECTED
      extends StObject
         with MDCChipActionAttributes
    /* "aria-selected" */ val ARIA_SELECTED: typings.materialChips.actionConstantsMod.MDCChipActionAttributes.ARIA_SELECTED & String = js.native
    
    @js.native
    sealed trait DATA_DELETABLE
      extends StObject
         with MDCChipActionAttributes
    /* "data-mdc-deletable" */ val DATA_DELETABLE: typings.materialChips.actionConstantsMod.MDCChipActionAttributes.DATA_DELETABLE & String = js.native
    
    @js.native
    sealed trait DISABLED
      extends StObject
         with MDCChipActionAttributes
    /* "disabled" */ val DISABLED: typings.materialChips.actionConstantsMod.MDCChipActionAttributes.DISABLED & String = js.native
    
    @js.native
    sealed trait ROLE
      extends StObject
         with MDCChipActionAttributes
    /* "role" */ val ROLE: typings.materialChips.actionConstantsMod.MDCChipActionAttributes.ROLE & String = js.native
    
    @js.native
    sealed trait TAB_INDEX
      extends StObject
         with MDCChipActionAttributes
    /* "tabindex" */ val TAB_INDEX: typings.materialChips.actionConstantsMod.MDCChipActionAttributes.TAB_INDEX & String = js.native
  }
  
  @js.native
  sealed trait MDCChipActionCssClasses extends StObject
  @JSImport("@material/chips/action/constants", "MDCChipActionCssClasses")
  @js.native
  object MDCChipActionCssClasses extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[MDCChipActionCssClasses & String] = js.native
    
    @js.native
    sealed trait CHIP_ROOT
      extends StObject
         with MDCChipActionCssClasses
    /* "mdc-evolution-chip" */ val CHIP_ROOT: typings.materialChips.actionConstantsMod.MDCChipActionCssClasses.CHIP_ROOT & String = js.native
    
    @js.native
    sealed trait PRIMARY_ACTION
      extends StObject
         with MDCChipActionCssClasses
    /* "mdc-evolution-chip__action--primary" */ val PRIMARY_ACTION: typings.materialChips.actionConstantsMod.MDCChipActionCssClasses.PRIMARY_ACTION & String = js.native
    
    @js.native
    sealed trait TRAILING_ACTION
      extends StObject
         with MDCChipActionCssClasses
    /* "mdc-evolution-chip__action--trailing" */ val TRAILING_ACTION: typings.materialChips.actionConstantsMod.MDCChipActionCssClasses.TRAILING_ACTION & String = js.native
  }
  
  @js.native
  sealed trait MDCChipActionEvents extends StObject
  @JSImport("@material/chips/action/constants", "MDCChipActionEvents")
  @js.native
  object MDCChipActionEvents extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[MDCChipActionEvents & String] = js.native
    
    @js.native
    sealed trait INTERACTION
      extends StObject
         with MDCChipActionEvents
    /* "MDCChipAction:interaction" */ val INTERACTION: typings.materialChips.actionConstantsMod.MDCChipActionEvents.INTERACTION & String = js.native
    
    @js.native
    sealed trait NAVIGATION
      extends StObject
         with MDCChipActionEvents
    /* "MDCChipAction:navigation" */ val NAVIGATION: typings.materialChips.actionConstantsMod.MDCChipActionEvents.NAVIGATION & String = js.native
  }
  
  @js.native
  sealed trait MDCChipActionFocusBehavior extends StObject
  @JSImport("@material/chips/action/constants", "MDCChipActionFocusBehavior")
  @js.native
  object MDCChipActionFocusBehavior extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[MDCChipActionFocusBehavior & Double] = js.native
    
    @js.native
    sealed trait FOCUSABLE
      extends StObject
         with MDCChipActionFocusBehavior
    /* 0 */ val FOCUSABLE: typings.materialChips.actionConstantsMod.MDCChipActionFocusBehavior.FOCUSABLE & Double = js.native
    
    @js.native
    sealed trait FOCUSABLE_AND_FOCUSED
      extends StObject
         with MDCChipActionFocusBehavior
    /* 1 */ val FOCUSABLE_AND_FOCUSED: typings.materialChips.actionConstantsMod.MDCChipActionFocusBehavior.FOCUSABLE_AND_FOCUSED & Double = js.native
    
    @js.native
    sealed trait NOT_FOCUSABLE
      extends StObject
         with MDCChipActionFocusBehavior
    /* 2 */ val NOT_FOCUSABLE: typings.materialChips.actionConstantsMod.MDCChipActionFocusBehavior.NOT_FOCUSABLE & Double = js.native
  }
  
  @js.native
  sealed trait MDCChipActionInteractionTrigger extends StObject
  @JSImport("@material/chips/action/constants", "MDCChipActionInteractionTrigger")
  @js.native
  object MDCChipActionInteractionTrigger extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[MDCChipActionInteractionTrigger & Double] = js.native
    
    @js.native
    sealed trait BACKSPACE_KEY
      extends StObject
         with MDCChipActionInteractionTrigger
    /* 2 */ val BACKSPACE_KEY: typings.materialChips.actionConstantsMod.MDCChipActionInteractionTrigger.BACKSPACE_KEY & Double = js.native
    
    @js.native
    sealed trait CLICK
      extends StObject
         with MDCChipActionInteractionTrigger
    /* 1 */ val CLICK: typings.materialChips.actionConstantsMod.MDCChipActionInteractionTrigger.CLICK & Double = js.native
    
    @js.native
    sealed trait DELETE_KEY
      extends StObject
         with MDCChipActionInteractionTrigger
    /* 3 */ val DELETE_KEY: typings.materialChips.actionConstantsMod.MDCChipActionInteractionTrigger.DELETE_KEY & Double = js.native
    
    @js.native
    sealed trait ENTER_KEY
      extends StObject
         with MDCChipActionInteractionTrigger
    /* 5 */ val ENTER_KEY: typings.materialChips.actionConstantsMod.MDCChipActionInteractionTrigger.ENTER_KEY & Double = js.native
    
    @js.native
    sealed trait SPACEBAR_KEY
      extends StObject
         with MDCChipActionInteractionTrigger
    /* 4 */ val SPACEBAR_KEY: typings.materialChips.actionConstantsMod.MDCChipActionInteractionTrigger.SPACEBAR_KEY & Double = js.native
    
    @js.native
    sealed trait UNSPECIFIED
      extends StObject
         with MDCChipActionInteractionTrigger
    /* 0 */ val UNSPECIFIED: typings.materialChips.actionConstantsMod.MDCChipActionInteractionTrigger.UNSPECIFIED & Double = js.native
  }
  
  @js.native
  sealed trait MDCChipActionType extends StObject
  @JSImport("@material/chips/action/constants", "MDCChipActionType")
  @js.native
  object MDCChipActionType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[MDCChipActionType & Double] = js.native
    
    @js.native
    sealed trait PRIMARY
      extends StObject
         with MDCChipActionType
    /* 1 */ val PRIMARY: typings.materialChips.actionConstantsMod.MDCChipActionType.PRIMARY & Double = js.native
    
    @js.native
    sealed trait TRAILING
      extends StObject
         with MDCChipActionType
    /* 2 */ val TRAILING: typings.materialChips.actionConstantsMod.MDCChipActionType.TRAILING & Double = js.native
    
    @js.native
    sealed trait UNSPECIFIED
      extends StObject
         with MDCChipActionType
    /* 0 */ val UNSPECIFIED: typings.materialChips.actionConstantsMod.MDCChipActionType.UNSPECIFIED & Double = js.native
  }
}
