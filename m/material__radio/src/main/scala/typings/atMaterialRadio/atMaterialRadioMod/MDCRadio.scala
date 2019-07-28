package typings.atMaterialRadio.atMaterialRadioMod

import typings.atMaterialBase.componentMod.default
import typings.atMaterialRadio.adapterMod.MDCRadioAdapter
import typings.atMaterialRipple.atMaterialRippleMod.MDCRipple
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.atMaterialSelectionDashControl.atMaterialSelectionDashControlMod.MDCSelectionControl because Inheritance from two classes. Inlined ripple */ @JSImport("@material/radio", "MDCRadio")
@js.native
class MDCRadio ()
  extends default[MDCRadioAdapter, typings.atMaterialRadio.foundationMod.default] {
  var checked: Boolean = js.native
  var disabled: Boolean = js.native
  val ripple: MDCRipple = js.native
  var value: String = js.native
}

/* static members */
@JSImport("@material/radio", "MDCRadio")
@js.native
object MDCRadio extends js.Object {
  def attachTo(root: Element): MDCRadio = js.native
}

