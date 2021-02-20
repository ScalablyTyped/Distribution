package typings.materialChips

import typings.materialChips.anon.PartialMDCChipSetAdapter
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object indexMod {
  
  @JSImport("@material/chips/chip-set/index", "MDCChipSet")
  @js.native
  class MDCChipSet protected ()
    extends typings.materialChips.componentMod.MDCChipSet {
    def this(root: Element, foundation: js.UndefOr[scala.Nothing], args: js.Any*) = this()
    def this(root: Element, foundation: typings.materialChips.foundationMod.MDCChipSetFoundation, args: js.Any*) = this()
  }
  /* static members */
  object MDCChipSet {
    
    @JSImport("@material/chips/chip-set/index", "MDCChipSet.attachTo")
    @js.native
    def attachTo(root: Element): typings.materialChips.componentMod.MDCChipSet = js.native
  }
  
  @JSImport("@material/chips/chip-set/index", "MDCChipSetFoundation")
  @js.native
  class MDCChipSetFoundation ()
    extends typings.materialChips.foundationMod.MDCChipSetFoundation {
    def this(adapter: PartialMDCChipSetAdapter) = this()
  }
  
  object chipSetCssClasses {
    
    @JSImport("@material/chips/chip-set/index", "chipSetCssClasses")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@material/chips/chip-set/index", "chipSetCssClasses.CHOICE")
    @js.native
    def CHOICE: String = js.native
    @scala.inline
    def CHOICE_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CHOICE")(x.asInstanceOf[js.Any])
    
    @JSImport("@material/chips/chip-set/index", "chipSetCssClasses.FILTER")
    @js.native
    def FILTER: String = js.native
    @scala.inline
    def FILTER_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FILTER")(x.asInstanceOf[js.Any])
  }
  
  object chipSetStrings {
    
    @JSImport("@material/chips/chip-set/index", "chipSetStrings")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@material/chips/chip-set/index", "chipSetStrings.CHIP_SELECTOR")
    @js.native
    def CHIP_SELECTOR: String = js.native
    @scala.inline
    def CHIP_SELECTOR_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CHIP_SELECTOR")(x.asInstanceOf[js.Any])
  }
}
