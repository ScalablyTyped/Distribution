package typings.materialChips

import typings.materialChips.adapterMod.MDCChipSetAdapter
import typings.materialChips.chipAdapterMod.MDCChipAdapter
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@material/chips", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  class MDCChip ()
    extends typings.materialChips.chipMod.MDCChip
  
  @js.native
  class MDCChipFoundation ()
    extends typings.materialChips.chipMod.MDCChipFoundation
  
  @js.native
  class MDCChipSet ()
    extends typings.materialChips.chipSetMod.MDCChipSet
  
  @js.native
  class MDCChipSetFoundation ()
    extends typings.materialChips.chipSetMod.MDCChipSetFoundation
  
  /* static members */
  @js.native
  object MDCChip extends js.Object {
    def attachTo(root: Element): typings.materialChips.chipMod.MDCChip = js.native
  }
  
  /* static members */
  @js.native
  object MDCChipFoundation extends js.Object {
    val cssClasses: typings.materialChips.chipConstantsMod.cssClasses = js.native
    val defaultAdapter: MDCChipAdapter = js.native
    val strings: typings.materialChips.chipConstantsMod.strings = js.native
  }
  
  /* static members */
  @js.native
  object MDCChipSet extends js.Object {
    def attachTo(root: js.Any): typings.materialChips.chipSetMod.MDCChipSet = js.native
  }
  
  /* static members */
  @js.native
  object MDCChipSetFoundation extends js.Object {
    val cssClasses: typings.materialChips.constantsMod.cssClasses = js.native
    val defaultAdapter: MDCChipSetAdapter = js.native
    val strings: typings.materialChips.constantsMod.strings = js.native
  }
  
}

