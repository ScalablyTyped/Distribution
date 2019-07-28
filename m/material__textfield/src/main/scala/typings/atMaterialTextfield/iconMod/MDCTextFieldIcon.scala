package typings.atMaterialTextfield.iconMod

import typings.atMaterialBase.componentMod.default
import typings.atMaterialTextfield.iconAdapterMod.MDCTextFieldIconAdapter
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@material/textfield/icon", "MDCTextFieldIcon")
@js.native
class MDCTextFieldIcon ()
  extends default[MDCTextFieldIconAdapter, typings.atMaterialTextfield.iconFoundationMod.default] {
  val foundation: typings.atMaterialTextfield.iconFoundationMod.default = js.native
}

/* static members */
@JSImport("@material/textfield/icon", "MDCTextFieldIcon")
@js.native
object MDCTextFieldIcon extends js.Object {
  def attachTo(root: Element): MDCTextFieldIcon = js.native
}

