package typings.atMaterialCheckbox.atMaterialCheckboxMod

import typings.atMaterialBase.componentMod.default
import typings.atMaterialCheckbox.adapterMod.MDCCheckboxAdapter
import typings.atMaterialRipple.atMaterialRippleMod.MDCRipple
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.atMaterialSelectionDashControl.atMaterialSelectionDashControlMod.MDCSelectionControl because Inheritance from two classes. Inlined ripple */ @JSImport("@material/checkbox", "MDCCheckbox")
@js.native
class MDCCheckbox ()
  extends default[MDCCheckboxAdapter, typings.atMaterialCheckbox.foundationMod.default] {
  var checked: Boolean = js.native
  var disabled: Boolean = js.native
  var indeterminate: Boolean = js.native
  val ripple: MDCRipple = js.native
  var value: String = js.native
}

/* static members */
@JSImport("@material/checkbox", "MDCCheckbox")
@js.native
object MDCCheckbox extends js.Object {
  def attachTo(root: Element): MDCCheckbox = js.native
}

