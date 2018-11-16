package typings
package atMaterialSelectLib.selectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@material/select", "MDCSelect")
@js.native
class MDCSelect ()
  extends atMaterialBaseLib.baseMod.MDCComponent[
      atMaterialSelectLib.adapterMod.MDCSelectAdapter, 
      atMaterialSelectLib.foundationMod.default
    ] {
  var disabled: scala.Boolean = js.native
  var selectedIndex: scala.Double = js.native
  var value: java.lang.String = js.native
  def initialize(): scala.Unit = js.native
  def initialize(
    labelFactory: js.Function1[
      /* el */ stdLib.Element, 
      atMaterialFloatingDashLabelLib.floatingDashLabelMod.MDCFloatingLabel
    ]
  ): scala.Unit = js.native
  def initialize(
    labelFactory: js.Function1[
      /* el */ stdLib.Element, 
      atMaterialFloatingDashLabelLib.floatingDashLabelMod.MDCFloatingLabel
    ],
    lineRippleFactory: js.Function1[
      /* el */ stdLib.Element, 
      atMaterialLineDashRippleLib.lineDashRippleMod.MDCLineRipple
    ]
  ): scala.Unit = js.native
}

@JSImport("@material/select", "MDCSelect")
@js.native
object MDCSelect extends js.Object {
  def attachTo(root: stdLib.Element): atMaterialSelectLib.selectMod.MDCSelect = js.native
}

