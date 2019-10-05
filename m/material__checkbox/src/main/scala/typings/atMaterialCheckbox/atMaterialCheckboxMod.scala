package typings.atMaterialCheckbox

import typings.atMaterialCheckbox.adapterMod.MDCCheckboxAdapter
import typings.atMaterialCheckbox.atMaterialCheckboxMod.MDCCheckbox
import typings.atMaterialCheckbox.foundationMod.default
import typings.atMaterialRipple.atMaterialRippleMod.MDCRipple
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@material/checkbox", JSImport.Namespace)
@js.native
object atMaterialCheckboxMod extends js.Object {
  /* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
  - typings.atMaterialSelectionDashControl.atMaterialSelectionDashControlMod.MDCSelectionControl because Inheritance from two classes. Inlined ripple */ @js.native
  class MDCCheckbox ()
    extends typings.atMaterialBase.componentMod.default[MDCCheckboxAdapter, default] {
    var checked: Boolean = js.native
    var disabled: Boolean = js.native
    var indeterminate: Boolean = js.native
    val ripple: MDCRipple = js.native
    var value: String = js.native
  }
  
  @js.native
  class MDCCheckboxFoundation () extends default
  
  /* static members */
  @js.native
  object MDCCheckbox extends js.Object {
    def attachTo(root: Element): MDCCheckbox = js.native
  }
  
  /* static members */
  @js.native
  object MDCCheckboxFoundation extends js.Object {
    val cssClasses: typings.atMaterialCheckbox.constantsMod.cssClasses = js.native
    val defaultAdapter: MDCCheckboxAdapter = js.native
    val numbers: typings.atMaterialCheckbox.constantsMod.numbers = js.native
    val strings: typings.atMaterialCheckbox.constantsMod.strings = js.native
  }
  
}

