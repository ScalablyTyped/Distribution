package typings.materialChips

import typings.materialChips.adapterMod.MDCChipSetAdapter
import typings.materialChips.anon.CHIPSELECTOR
import typings.materialChips.anon.CHOICE
import typings.materialChips.anon.PartialMDCChipSetAdapter
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@material/chips/chip-set/index", JSImport.Namespace)
@js.native
object indexMod extends js.Object {
  @js.native
  class MDCChipSet ()
    extends typings.materialChips.componentMod.MDCChipSet
  
  @js.native
  class MDCChipSetFoundation ()
    extends typings.materialChips.foundationMod.MDCChipSetFoundation {
    def this(adapter: PartialMDCChipSetAdapter) = this()
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
  
  @js.native
  object chipSetCssClasses extends js.Object {
    var CHOICE: String = js.native
    var FILTER: String = js.native
  }
  
  @js.native
  object chipSetStrings extends js.Object {
    var CHIP_SELECTOR: String = js.native
  }
  
}

