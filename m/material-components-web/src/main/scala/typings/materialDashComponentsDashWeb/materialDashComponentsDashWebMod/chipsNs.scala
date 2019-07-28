package typings.materialDashComponentsDashWeb.materialDashComponentsDashWebMod

import typings.atMaterialChips.chipAdapterMod.MDCChipAdapter
import typings.atMaterialChips.chipDashSetAdapterMod.MDCChipSetAdapter
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("material-components-web", "chips")
@js.native
object chipsNs extends js.Object {
  @js.native
  class MDCChip ()
    extends typings.atMaterialChips.atMaterialChipsMod.MDCChip
  
  @js.native
  class MDCChipFoundation ()
    extends typings.atMaterialChips.atMaterialChipsMod.MDCChipFoundation
  
  @js.native
  class MDCChipSet ()
    extends typings.atMaterialChips.atMaterialChipsMod.MDCChipSet
  
  @js.native
  class MDCChipSetFoundation ()
    extends typings.atMaterialChips.atMaterialChipsMod.MDCChipSetFoundation
  
  /* static members */
  @js.native
  object MDCChip extends js.Object {
    def attachTo(root: Element): typings.atMaterialChips.chipMod.MDCChip = js.native
  }
  
  /* static members */
  @js.native
  object MDCChipFoundation extends js.Object {
    val cssClasses: typings.atMaterialChips.chipConstantsMod.cssClasses = js.native
    val defaultAdapter: MDCChipAdapter = js.native
    val strings: typings.atMaterialChips.chipConstantsMod.strings = js.native
  }
  
  /* static members */
  @js.native
  object MDCChipSet extends js.Object {
    def attachTo(root: js.Any): typings.atMaterialChips.chipDashSetMod.MDCChipSet = js.native
  }
  
  /* static members */
  @js.native
  object MDCChipSetFoundation extends js.Object {
    val cssClasses: typings.atMaterialChips.chipDashSetConstantsMod.cssClasses = js.native
    val defaultAdapter: MDCChipSetAdapter = js.native
    val strings: typings.atMaterialChips.chipDashSetConstantsMod.strings = js.native
  }
  
}

