package typings.materialTextfield.mod

import typings.materialTextfield.anon.ARIAHIDDEN
import typings.materialTextfield.anon.HELPERTEXTPERSISTENT
import typings.materialTextfield.anon.PartialMDCTextFieldHelper
import typings.materialTextfield.helperTextAdapterMod.MDCTextFieldHelperTextAdapter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@material/textfield", "MDCTextFieldHelperTextFoundation")
@js.native
class MDCTextFieldHelperTextFoundation ()
  extends typings.materialTextfield.helperTextIndexMod.MDCTextFieldHelperTextFoundation {
  def this(adapter: PartialMDCTextFieldHelper) = this()
}

/* static members */
@JSImport("@material/textfield", "MDCTextFieldHelperTextFoundation")
@js.native
object MDCTextFieldHelperTextFoundation extends js.Object {
  def cssClasses: HELPERTEXTPERSISTENT = js.native
  /**
    * See {@link MDCTextFieldHelperTextAdapter} for typing information on parameters and return types.
    */
  def defaultAdapter: MDCTextFieldHelperTextAdapter = js.native
  def strings: ARIAHIDDEN = js.native
}

