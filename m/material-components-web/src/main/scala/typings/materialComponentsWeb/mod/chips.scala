package typings.materialComponentsWeb.mod

import typings.materialChips.adapterMod.MDCChipSetAdapter
import typings.materialChips.chipAdapterMod.MDCChipAdapter
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("material-components-web", "chips")
@js.native
object chips extends js.Object {
  @js.native
  class MDCChip ()
    extends typings.materialChips.mod.MDCChip
  
  @js.native
  class MDCChipFoundation ()
    extends typings.materialChips.mod.MDCChipFoundation
  
  @js.native
  class MDCChipSet ()
    extends typings.materialChips.mod.MDCChipSet
  
  @js.native
  class MDCChipSetFoundation ()
    extends typings.materialChips.mod.MDCChipSetFoundation
  
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

