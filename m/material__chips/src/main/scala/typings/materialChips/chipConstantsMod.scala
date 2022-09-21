package typings.materialChips

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object chipConstantsMod {
  
  @js.native
  sealed trait MDCChipAnimation extends StObject
  @JSImport("@material/chips/chip/constants", "MDCChipAnimation")
  @js.native
  object MDCChipAnimation extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[MDCChipAnimation & String] = js.native
    
    @js.native
    sealed trait ENTER
      extends StObject
         with MDCChipAnimation
    /* "mdc-evolution-chip-enter" */ val ENTER: typings.materialChips.chipConstantsMod.MDCChipAnimation.ENTER & String = js.native
    
    @js.native
    sealed trait EXIT
      extends StObject
         with MDCChipAnimation
    /* "mdc-evolution-chip-exit" */ val EXIT: typings.materialChips.chipConstantsMod.MDCChipAnimation.EXIT & String = js.native
  }
  
  @js.native
  sealed trait MDCChipAttributes extends StObject
  @JSImport("@material/chips/chip/constants", "MDCChipAttributes")
  @js.native
  object MDCChipAttributes extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[MDCChipAttributes & String] = js.native
    
    @js.native
    sealed trait DATA_ADDED_ANNOUNCEMENT
      extends StObject
         with MDCChipAttributes
    /* "data-mdc-added-announcement" */ val DATA_ADDED_ANNOUNCEMENT: typings.materialChips.chipConstantsMod.MDCChipAttributes.DATA_ADDED_ANNOUNCEMENT & String = js.native
    
    @js.native
    sealed trait DATA_REMOVED_ANNOUNCEMENT
      extends StObject
         with MDCChipAttributes
    /* "data-mdc-removed-announcement" */ val DATA_REMOVED_ANNOUNCEMENT: typings.materialChips.chipConstantsMod.MDCChipAttributes.DATA_REMOVED_ANNOUNCEMENT & String = js.native
  }
  
  @js.native
  sealed trait MDCChipCssClasses extends StObject
  @JSImport("@material/chips/chip/constants", "MDCChipCssClasses")
  @js.native
  object MDCChipCssClasses extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[MDCChipCssClasses & String] = js.native
    
    @js.native
    sealed trait DESELECTING
      extends StObject
         with MDCChipCssClasses
    /* "mdc-evolution-chip--deselecting" */ val DESELECTING: typings.materialChips.chipConstantsMod.MDCChipCssClasses.DESELECTING & String = js.native
    
    @js.native
    sealed trait DESELECTING_WITH_PRIMARY_ICON
      extends StObject
         with MDCChipCssClasses
    /* "mdc-evolution-chip--deselecting-with-primary-icon" */ val DESELECTING_WITH_PRIMARY_ICON: typings.materialChips.chipConstantsMod.MDCChipCssClasses.DESELECTING_WITH_PRIMARY_ICON & String = js.native
    
    @js.native
    sealed trait DISABLED
      extends StObject
         with MDCChipCssClasses
    /* "mdc-evolution-chip--disabled" */ val DISABLED: typings.materialChips.chipConstantsMod.MDCChipCssClasses.DISABLED & String = js.native
    
    @js.native
    sealed trait ENTER
      extends StObject
         with MDCChipCssClasses
    /* "mdc-evolution-chip--enter" */ val ENTER: typings.materialChips.chipConstantsMod.MDCChipCssClasses.ENTER & String = js.native
    
    @js.native
    sealed trait EXIT
      extends StObject
         with MDCChipCssClasses
    /* "mdc-evolution-chip--exit" */ val EXIT: typings.materialChips.chipConstantsMod.MDCChipCssClasses.EXIT & String = js.native
    
    @js.native
    sealed trait HIDDEN
      extends StObject
         with MDCChipCssClasses
    /* "mdc-evolution-chip--hidden" */ val HIDDEN: typings.materialChips.chipConstantsMod.MDCChipCssClasses.HIDDEN & String = js.native
    
    @js.native
    sealed trait SELECTED
      extends StObject
         with MDCChipCssClasses
    /* "mdc-evolution-chip--selected" */ val SELECTED: typings.materialChips.chipConstantsMod.MDCChipCssClasses.SELECTED & String = js.native
    
    @js.native
    sealed trait SELECTING
      extends StObject
         with MDCChipCssClasses
    /* "mdc-evolution-chip--selecting" */ val SELECTING: typings.materialChips.chipConstantsMod.MDCChipCssClasses.SELECTING & String = js.native
    
    @js.native
    sealed trait SELECTING_WITH_PRIMARY_ICON
      extends StObject
         with MDCChipCssClasses
    /* "mdc-evolution-chip--selecting-with-primary-icon" */ val SELECTING_WITH_PRIMARY_ICON: typings.materialChips.chipConstantsMod.MDCChipCssClasses.SELECTING_WITH_PRIMARY_ICON & String = js.native
    
    @js.native
    sealed trait WITH_PRIMARY_ICON
      extends StObject
         with MDCChipCssClasses
    /* "mdc-evolution-chip--with-primary-icon" */ val WITH_PRIMARY_ICON: typings.materialChips.chipConstantsMod.MDCChipCssClasses.WITH_PRIMARY_ICON & String = js.native
  }
  
  @js.native
  sealed trait MDCChipEvents extends StObject
  @JSImport("@material/chips/chip/constants", "MDCChipEvents")
  @js.native
  object MDCChipEvents extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[MDCChipEvents & String] = js.native
    
    @js.native
    sealed trait ANIMATION
      extends StObject
         with MDCChipEvents
    /* "MDCChip:animation" */ val ANIMATION: typings.materialChips.chipConstantsMod.MDCChipEvents.ANIMATION & String = js.native
    
    @js.native
    sealed trait INTERACTION
      extends StObject
         with MDCChipEvents
    /* "MDCChip:interaction" */ val INTERACTION: typings.materialChips.chipConstantsMod.MDCChipEvents.INTERACTION & String = js.native
    
    @js.native
    sealed trait NAVIGATION
      extends StObject
         with MDCChipEvents
    /* "MDCChip:navigation" */ val NAVIGATION: typings.materialChips.chipConstantsMod.MDCChipEvents.NAVIGATION & String = js.native
  }
}
