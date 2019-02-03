package typings
package atMaterialRadioLib.atMaterialRadioMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- atMaterialSelectionDashControlLib.atMaterialSelectionDashControlMod.MDCSelectionControl because Inheritance from two classes */ @JSImport("@material/radio", "MDCRadio")
@js.native
class MDCRadio ()
  extends atMaterialBaseLib.componentMod.default[
      atMaterialRadioLib.adapterMod.MDCRadioAdapter, 
      atMaterialRadioLib.foundationMod.default
    ] {
  var checked: scala.Boolean = js.native
  var disabled: scala.Boolean = js.native
  val ripple: atMaterialRippleLib.atMaterialRippleMod.MDCRipple = js.native
  var value: java.lang.String = js.native
}

/* static members */
@JSImport("@material/radio", "MDCRadio")
@js.native
object MDCRadio extends js.Object {
  def attachTo(root: stdLib.Element): atMaterialRadioLib.atMaterialRadioMod.MDCRadio = js.native
}

