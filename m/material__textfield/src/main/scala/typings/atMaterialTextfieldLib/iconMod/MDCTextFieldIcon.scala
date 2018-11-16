package typings
package atMaterialTextfieldLib.iconMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@material/textfield/icon", "MDCTextFieldIcon")
@js.native
class MDCTextFieldIcon ()
  extends atMaterialBaseLib.componentMod.default[
      atMaterialTextfieldLib.iconAdapterMod.MDCTextFieldIconAdapter, 
      atMaterialTextfieldLib.iconFoundationMod.default
    ] {
  val foundation: atMaterialTextfieldLib.iconFoundationMod.default = js.native
}

@JSImport("@material/textfield/icon", "MDCTextFieldIcon")
@js.native
object MDCTextFieldIcon extends js.Object {
  def attachTo(root: stdLib.Element): atMaterialTextfieldLib.iconMod.MDCTextFieldIcon = js.native
}

