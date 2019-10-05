package typings.materialDashComponentsDashWeb.materialDashComponentsDashWebMod

import typings.atMaterialCheckbox.adapterMod.MDCCheckboxAdapter
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("material-components-web", "checkbox")
@js.native
object checkbox extends js.Object {
  @js.native
  class MDCCheckbox ()
    extends typings.atMaterialCheckbox.atMaterialCheckboxMod.MDCCheckbox
  
  @js.native
  class MDCCheckboxFoundation ()
    extends typings.atMaterialCheckbox.atMaterialCheckboxMod.MDCCheckboxFoundation
  
  /* static members */
  @js.native
  object MDCCheckbox extends js.Object {
    def attachTo(root: Element): typings.atMaterialCheckbox.atMaterialCheckboxMod.MDCCheckbox = js.native
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

