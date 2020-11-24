package typings.materialTextfield.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HELPERTEXTPERSISTENT extends js.Object {
  
  var HELPER_TEXT_PERSISTENT: String = js.native
  
  var HELPER_TEXT_VALIDATION_MSG: String = js.native
  
  var ROOT: String = js.native
}
object HELPERTEXTPERSISTENT {
  
  @scala.inline
  def apply(HELPER_TEXT_PERSISTENT: String, HELPER_TEXT_VALIDATION_MSG: String, ROOT: String): HELPERTEXTPERSISTENT = {
    val __obj = js.Dynamic.literal(HELPER_TEXT_PERSISTENT = HELPER_TEXT_PERSISTENT.asInstanceOf[js.Any], HELPER_TEXT_VALIDATION_MSG = HELPER_TEXT_VALIDATION_MSG.asInstanceOf[js.Any], ROOT = ROOT.asInstanceOf[js.Any])
    __obj.asInstanceOf[HELPERTEXTPERSISTENT]
  }
  
  @scala.inline
  implicit class HELPERTEXTPERSISTENTOps[Self <: HELPERTEXTPERSISTENT] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setHELPER_TEXT_PERSISTENT(value: String): Self = this.set("HELPER_TEXT_PERSISTENT", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHELPER_TEXT_VALIDATION_MSG(value: String): Self = this.set("HELPER_TEXT_VALIDATION_MSG", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setROOT(value: String): Self = this.set("ROOT", value.asInstanceOf[js.Any])
  }
}
