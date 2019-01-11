package typings
package materialDashComponentsDashWebLib.materialDashComponentsDashWebMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("material-components-web", "chips")
@js.native
object chipsNs extends js.Object {
  @js.native
  class MDCChip ()
    extends atMaterialChipsLib.atMaterialChipsMod.MDCChip
  
  @js.native
  class MDCChipFoundation ()
    extends atMaterialChipsLib.atMaterialChipsMod.MDCChipFoundation
  
  @js.native
  class MDCChipSet ()
    extends atMaterialChipsLib.atMaterialChipsMod.MDCChipSet
  
  @js.native
  class MDCChipSetFoundation ()
    extends atMaterialChipsLib.atMaterialChipsMod.MDCChipSetFoundation
  
  @js.native
  object MDCChip extends js.Object {
    def attachTo(root: stdLib.Element): atMaterialChipsLib.chipMod.MDCChip = js.native
  }
  
  @js.native
  object MDCChipFoundation extends js.Object {
    val cssClasses: atMaterialChipsLib.chipConstantsMod.cssClasses = js.native
    val defaultAdapter: atMaterialChipsLib.chipAdapterMod.MDCChipAdapter = js.native
    val strings: atMaterialChipsLib.chipConstantsMod.strings = js.native
  }
  
  @js.native
  object MDCChipSet extends js.Object {
    def attachTo(root: js.Any): atMaterialChipsLib.chipDashSetMod.MDCChipSet = js.native
  }
  
  @js.native
  object MDCChipSetFoundation extends js.Object {
    val cssClasses: atMaterialChipsLib.chipDashSetConstantsMod.cssClasses = js.native
    val defaultAdapter: atMaterialChipsLib.chipDashSetAdapterMod.MDCChipSetAdapter = js.native
    val strings: atMaterialChipsLib.chipDashSetConstantsMod.strings = js.native
  }
  
}

