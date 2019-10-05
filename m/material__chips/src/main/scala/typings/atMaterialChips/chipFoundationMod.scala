package typings.atMaterialChips

import typings.atMaterialChips.chipAdapterMod.MDCChipAdapter
import typings.atMaterialChips.chipFoundationMod.MDCChipFoundation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@material/chips/chip/foundation", JSImport.Namespace)
@js.native
object chipFoundationMod extends js.Object {
  @js.native
  trait MDCChipFoundation
    extends typings.atMaterialBase.foundationMod.default[MDCChipAdapter] {
    def isSelected(): Boolean = js.native
    def setSelected(selected: Boolean): Unit = js.native
  }
  
  @js.native
  class default () extends MDCChipFoundation
  
  /* static members */
  @js.native
  object default extends js.Object {
    val cssClasses: typings.atMaterialChips.chipConstantsMod.cssClasses = js.native
    val defaultAdapter: MDCChipAdapter = js.native
    val strings: typings.atMaterialChips.chipConstantsMod.strings = js.native
  }
  
}

