package typings.materialChips

import typings.materialBase.Element
import typings.materialChips.anon.PartialMDCChipSetAdapterAnnounceMessage
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object deprecatedChipSetMod {
  
  @JSImport("@material/chips/deprecated/chip-set", JSImport.Default)
  @js.native
  open class default ()
    extends typings.materialChips.deprecatedChipSetFoundationMod.default {
    def this(adapter: PartialMDCChipSetAdapterAnnounceMessage) = this()
  }
  
  @JSImport("@material/chips/deprecated/chip-set", "MDCChipSet")
  @js.native
  open class MDCChipSet protected ()
    extends typings.materialChips.deprecatedChipSetComponentMod.MDCChipSet {
    def this(root: Element, foundation: Unit, args: Any*) = this()
    def this(
      root: Element,
      foundation: typings.materialChips.deprecatedChipSetFoundationMod.MDCChipSetFoundation,
      args: Any*
    ) = this()
  }
  /* static members */
  object MDCChipSet {
    
    @JSImport("@material/chips/deprecated/chip-set", "MDCChipSet")
    @js.native
    val ^ : js.Any = js.native
    
    inline def attachTo(root: typings.std.Element): typings.materialChips.deprecatedChipSetComponentMod.MDCChipSet = ^.asInstanceOf[js.Dynamic].applyDynamic("attachTo")(root.asInstanceOf[js.Any]).asInstanceOf[typings.materialChips.deprecatedChipSetComponentMod.MDCChipSet]
  }
  
  @JSImport("@material/chips/deprecated/chip-set", "MDCChipSetFoundation")
  @js.native
  open class MDCChipSetFoundation ()
    extends typings.materialChips.deprecatedChipSetFoundationMod.MDCChipSetFoundation {
    def this(adapter: PartialMDCChipSetAdapterAnnounceMessage) = this()
  }
  
  object chipSetCssClasses {
    
    @JSImport("@material/chips/deprecated/chip-set", "chipSetCssClasses")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@material/chips/deprecated/chip-set", "chipSetCssClasses.CHOICE")
    @js.native
    def CHOICE: String = js.native
    inline def CHOICE_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CHOICE")(x.asInstanceOf[js.Any])
    
    @JSImport("@material/chips/deprecated/chip-set", "chipSetCssClasses.FILTER")
    @js.native
    def FILTER: String = js.native
    inline def FILTER_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FILTER")(x.asInstanceOf[js.Any])
  }
  
  object chipSetStrings {
    
    @JSImport("@material/chips/deprecated/chip-set", "chipSetStrings")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@material/chips/deprecated/chip-set", "chipSetStrings.CHIP_SELECTOR")
    @js.native
    def CHIP_SELECTOR: String = js.native
    inline def CHIP_SELECTOR_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CHIP_SELECTOR")(x.asInstanceOf[js.Any])
  }
}
