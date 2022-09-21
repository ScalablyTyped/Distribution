package typings.materialChips

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object chipSetConstantsMod {
  
  @js.native
  sealed trait MDCChipSetAttributes extends StObject
  @JSImport("@material/chips/chip-set/constants", "MDCChipSetAttributes")
  @js.native
  object MDCChipSetAttributes extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[MDCChipSetAttributes & String] = js.native
    
    @js.native
    sealed trait ARIA_MULTISELECTABLE
      extends StObject
         with MDCChipSetAttributes
    /* "aria-multiselectable" */ val ARIA_MULTISELECTABLE: typings.materialChips.chipSetConstantsMod.MDCChipSetAttributes.ARIA_MULTISELECTABLE & String = js.native
  }
  
  @js.native
  sealed trait MDCChipSetCssClasses extends StObject
  @JSImport("@material/chips/chip-set/constants", "MDCChipSetCssClasses")
  @js.native
  object MDCChipSetCssClasses extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[MDCChipSetCssClasses & String] = js.native
    
    @js.native
    sealed trait CHIP
      extends StObject
         with MDCChipSetCssClasses
    /* "mdc-evolution-chip" */ val CHIP: typings.materialChips.chipSetConstantsMod.MDCChipSetCssClasses.CHIP & String = js.native
  }
  
  @js.native
  sealed trait MDCChipSetEvents extends StObject
  @JSImport("@material/chips/chip-set/constants", "MDCChipSetEvents")
  @js.native
  object MDCChipSetEvents extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[MDCChipSetEvents & String] = js.native
    
    @js.native
    sealed trait INTERACTION
      extends StObject
         with MDCChipSetEvents
    /* "MDCChipSet:interaction" */ val INTERACTION: typings.materialChips.chipSetConstantsMod.MDCChipSetEvents.INTERACTION & String = js.native
    
    @js.native
    sealed trait REMOVAL
      extends StObject
         with MDCChipSetEvents
    /* "MDCChipSet:removal" */ val REMOVAL: typings.materialChips.chipSetConstantsMod.MDCChipSetEvents.REMOVAL & String = js.native
    
    @js.native
    sealed trait SELECTION
      extends StObject
         with MDCChipSetEvents
    /* "MDCChipSet:selection" */ val SELECTION: typings.materialChips.chipSetConstantsMod.MDCChipSetEvents.SELECTION & String = js.native
  }
}
