package typings.materialComponentsWeb.mod.textField

import typings.materialTextfield.anon.ICONEVENT
import typings.materialTextfield.anon.PartialMDCTextFieldIconAd
import typings.materialTextfield.anon.ROOT
import typings.materialTextfield.iconAdapterMod.MDCTextFieldIconAdapter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("material-components-web", "textField.MDCTextFieldIconFoundation")
@js.native
class MDCTextFieldIconFoundation ()
  extends typings.materialTextfield.mod.MDCTextFieldIconFoundation {
  def this(adapter: PartialMDCTextFieldIconAd) = this()
}
/* static members */
@JSImport("material-components-web", "textField.MDCTextFieldIconFoundation")
@js.native
object MDCTextFieldIconFoundation extends js.Object {
  
  def cssClasses: ROOT = js.native
  
  /**
    * See {@link MDCTextFieldIconAdapter} for typing information on parameters and return types.
    */
  def defaultAdapter: MDCTextFieldIconAdapter = js.native
  
  def strings: ICONEVENT = js.native
}
