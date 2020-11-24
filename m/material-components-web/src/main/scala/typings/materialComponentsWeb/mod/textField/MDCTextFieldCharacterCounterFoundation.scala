package typings.materialComponentsWeb.mod.textField

import typings.materialTextfield.anon.PartialMDCTextFieldCharac
import typings.materialTextfield.anon.ROOT
import typings.materialTextfield.anon.ROOTSELECTOR
import typings.materialTextfield.characterCounterAdapterMod.MDCTextFieldCharacterCounterAdapter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("material-components-web", "textField.MDCTextFieldCharacterCounterFoundation")
@js.native
class MDCTextFieldCharacterCounterFoundation ()
  extends typings.materialTextfield.mod.MDCTextFieldCharacterCounterFoundation {
  def this(adapter: PartialMDCTextFieldCharac) = this()
}
/* static members */
@JSImport("material-components-web", "textField.MDCTextFieldCharacterCounterFoundation")
@js.native
object MDCTextFieldCharacterCounterFoundation extends js.Object {
  
  def cssClasses: ROOT = js.native
  
  /**
    * See {@link MDCTextFieldCharacterCounterAdapter} for typing information on parameters and return types.
    */
  def defaultAdapter: MDCTextFieldCharacterCounterAdapter = js.native
  
  def strings: ROOTSELECTOR = js.native
}
