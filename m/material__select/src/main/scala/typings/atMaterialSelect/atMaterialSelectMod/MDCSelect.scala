package typings.atMaterialSelect.atMaterialSelectMod

import typings.atMaterialBase.atMaterialBaseMod.MDCComponent
import typings.atMaterialFloatingDashLabel.atMaterialFloatingDashLabelMod.MDCFloatingLabel
import typings.atMaterialLineDashRipple.atMaterialLineDashRippleMod.MDCLineRipple
import typings.atMaterialSelect.adapterMod.MDCSelectAdapter
import typings.atMaterialSelect.foundationMod.default
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@material/select", "MDCSelect")
@js.native
class MDCSelect () extends MDCComponent[MDCSelectAdapter, default] {
  var disabled: Boolean = js.native
  var selectedIndex: Double = js.native
  var value: String = js.native
  def initialize(): Unit = js.native
  def initialize(labelFactory: js.Function1[/* el */ Element, MDCFloatingLabel]): Unit = js.native
  def initialize(
    labelFactory: js.Function1[/* el */ Element, MDCFloatingLabel],
    lineRippleFactory: js.Function1[/* el */ Element, MDCLineRipple]
  ): Unit = js.native
}

/* static members */
@JSImport("@material/select", "MDCSelect")
@js.native
object MDCSelect extends js.Object {
  def attachTo(root: Element): MDCSelect = js.native
}

