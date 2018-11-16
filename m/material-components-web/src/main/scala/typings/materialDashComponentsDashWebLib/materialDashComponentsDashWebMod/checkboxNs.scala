package typings
package materialDashComponentsDashWebLib.materialDashComponentsDashWebMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("material-components-web", "checkbox")
@js.native
object checkboxNs extends js.Object {
  @js.native
  class MDCCheckbox ()
    extends atMaterialCheckboxLib.checkboxMod.MDCCheckbox
  
  @js.native
  class MDCCheckboxFoundation ()
    extends atMaterialCheckboxLib.checkboxMod.MDCCheckboxFoundation
  
  @js.native
  object MDCCheckbox extends js.Object {
    def attachTo(root: stdLib.Element): atMaterialCheckboxLib.checkboxMod.MDCCheckbox = js.native
  }
  
  @js.native
  object MDCCheckboxFoundation extends js.Object {
    val cssClasses: atMaterialCheckboxLib.constantsMod.cssClasses = js.native
    val defaultAdapter: atMaterialCheckboxLib.adapterMod.MDCCheckboxAdapter = js.native
    val numbers: atMaterialCheckboxLib.constantsMod.numbers = js.native
    val strings: atMaterialCheckboxLib.constantsMod.strings = js.native
  }
  
}

