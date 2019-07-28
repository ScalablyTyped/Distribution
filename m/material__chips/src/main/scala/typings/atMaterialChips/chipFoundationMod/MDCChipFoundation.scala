package typings.atMaterialChips.chipFoundationMod

import typings.atMaterialChips.chipAdapterMod.MDCChipAdapter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MDCChipFoundation
  extends typings.atMaterialBase.foundationMod.default[MDCChipAdapter] {
  def isSelected(): Boolean = js.native
  def setSelected(selected: Boolean): Unit = js.native
}

