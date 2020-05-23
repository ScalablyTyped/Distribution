package typings.materialCheckbox

import typings.materialCheckbox.adapterMod.MDCCheckboxAdapter
import typings.materialCheckbox.foundationMod.default
import typings.materialRipple.mod.MDCRipple
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@material/checkbox", JSImport.Namespace)
@js.native
object mod extends js.Object {
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.materialSelectionControl.mod.MDCSelectionControl because Inheritance from two classes. Inlined ripple */ @js.native
  class MDCCheckbox ()
    extends typings.materialBase.componentMod.default[MDCCheckboxAdapter, default] {
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
    val cssClasses: typings.materialCheckbox.constantsMod.cssClasses = js.native
    val defaultAdapter: MDCCheckboxAdapter = js.native
    val numbers: typings.materialCheckbox.constantsMod.numbers = js.native
    val strings: typings.materialCheckbox.constantsMod.strings = js.native
  }
  
}

