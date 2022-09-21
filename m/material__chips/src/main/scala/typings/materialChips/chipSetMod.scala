package typings.materialChips

import typings.materialBase.Element
import typings.materialChips.anon.PartialMDCChipSetAdapter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object chipSetMod {
  
  @JSImport("@material/chips/chip-set", "MDCChipSet")
  @js.native
  open class MDCChipSet protected ()
    extends typings.materialChips.chipSetComponentMod.MDCChipSet {
    def this(root: Element, foundation: Unit, args: Any*) = this()
    def this(
      root: Element,
      foundation: typings.materialChips.chipSetFoundationMod.MDCChipSetFoundation,
      args: Any*
    ) = this()
  }
  /* static members */
  object MDCChipSet {
    
    @JSImport("@material/chips/chip-set", "MDCChipSet")
    @js.native
    val ^ : js.Any = js.native
    
    inline def attachTo(root: typings.std.Element): typings.materialChips.chipSetComponentMod.MDCChipSet = ^.asInstanceOf[js.Dynamic].applyDynamic("attachTo")(root.asInstanceOf[js.Any]).asInstanceOf[typings.materialChips.chipSetComponentMod.MDCChipSet]
  }
  
  @JSImport("@material/chips/chip-set", "MDCChipSetAttributes")
  @js.native
  object MDCChipSetAttributes extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.materialChips.chipSetConstantsMod.MDCChipSetAttributes & String] = js.native
    
    /* "aria-multiselectable" */ val ARIA_MULTISELECTABLE: typings.materialChips.chipSetConstantsMod.MDCChipSetAttributes.ARIA_MULTISELECTABLE & String = js.native
  }
  
  @JSImport("@material/chips/chip-set", "MDCChipSetCssClasses")
  @js.native
  object MDCChipSetCssClasses extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.materialChips.chipSetConstantsMod.MDCChipSetCssClasses & String] = js.native
    
    /* "mdc-evolution-chip" */ val CHIP: typings.materialChips.chipSetConstantsMod.MDCChipSetCssClasses.CHIP & String = js.native
  }
  
  @JSImport("@material/chips/chip-set", "MDCChipSetEvents")
  @js.native
  object MDCChipSetEvents extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.materialChips.chipSetConstantsMod.MDCChipSetEvents & String] = js.native
    
    /* "MDCChipSet:interaction" */ val INTERACTION: typings.materialChips.chipSetConstantsMod.MDCChipSetEvents.INTERACTION & String = js.native
    
    /* "MDCChipSet:removal" */ val REMOVAL: typings.materialChips.chipSetConstantsMod.MDCChipSetEvents.REMOVAL & String = js.native
    
    /* "MDCChipSet:selection" */ val SELECTION: typings.materialChips.chipSetConstantsMod.MDCChipSetEvents.SELECTION & String = js.native
  }
  
  @JSImport("@material/chips/chip-set", "MDCChipSetFoundation")
  @js.native
  open class MDCChipSetFoundation ()
    extends typings.materialChips.chipSetFoundationMod.MDCChipSetFoundation {
    def this(adapter: PartialMDCChipSetAdapter) = this()
  }
}
