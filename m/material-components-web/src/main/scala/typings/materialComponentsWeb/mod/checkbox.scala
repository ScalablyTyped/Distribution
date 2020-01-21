package typings.materialComponentsWeb.mod

import typings.materialCheckbox.adapterMod.MDCCheckboxAdapter
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("material-components-web", "checkbox")
@js.native
object checkbox extends js.Object {
  @js.native
  class MDCCheckbox ()
    extends typings.materialCheckbox.mod.MDCCheckbox
  
  @js.native
  class MDCCheckboxFoundation ()
    extends typings.materialCheckbox.mod.MDCCheckboxFoundation
  
  /* static members */
  @js.native
  object MDCCheckbox extends js.Object {
    def attachTo(root: Element): typings.materialCheckbox.mod.MDCCheckbox = js.native
  }
  
  /* static members */
  @js.native
  object MDCCheckboxFoundation extends js.Object {
    val cssClasses: typings.materialCheckbox.constantsMod.cssClasses = js.native
    val defaultAdapter: MDCCheckboxAdapter = js.native
    val numbers: typings.materialCheckbox.constantsMod.numbers = js.native
    val strings: typings.materialCheckbox.constantsMod.strings = js.native
  }
  
}

