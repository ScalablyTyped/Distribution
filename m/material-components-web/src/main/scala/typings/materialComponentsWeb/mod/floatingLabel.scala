package typings.materialComponentsWeb.mod

import typings.materialFloatingLabel.adapterMod.MDCFloatingLabelAdapter
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("material-components-web", "floatingLabel")
@js.native
object floatingLabel extends js.Object {
  @js.native
  class MDCFloatingLabel ()
    extends typings.materialFloatingLabel.mod.MDCFloatingLabel
  
  @js.native
  class MDCFloatingLabelFoundation ()
    extends typings.materialFloatingLabel.mod.MDCFloatingLabelFoundation
  
  /* static members */
  @js.native
  object MDCFloatingLabel extends js.Object {
    def attachTo(root: Element): typings.materialFloatingLabel.mod.MDCFloatingLabel = js.native
  }
  
  /* static members */
  @js.native
  object MDCFloatingLabelFoundation extends js.Object {
    val cssClasses: typings.materialFloatingLabel.constantsMod.cssClasses = js.native
    val defaultAdapter: MDCFloatingLabelAdapter = js.native
  }
  
}

