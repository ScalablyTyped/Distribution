package typings.materialFloatingLabel.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LABELFLOATABOVE extends js.Object {
  
  var LABEL_FLOAT_ABOVE: String = js.native
  
  var LABEL_REQUIRED: String = js.native
  
  var LABEL_SHAKE: String = js.native
  
  var ROOT: String = js.native
}
object LABELFLOATABOVE {
  
  @scala.inline
  def apply(LABEL_FLOAT_ABOVE: String, LABEL_REQUIRED: String, LABEL_SHAKE: String, ROOT: String): LABELFLOATABOVE = {
    val __obj = js.Dynamic.literal(LABEL_FLOAT_ABOVE = LABEL_FLOAT_ABOVE.asInstanceOf[js.Any], LABEL_REQUIRED = LABEL_REQUIRED.asInstanceOf[js.Any], LABEL_SHAKE = LABEL_SHAKE.asInstanceOf[js.Any], ROOT = ROOT.asInstanceOf[js.Any])
    __obj.asInstanceOf[LABELFLOATABOVE]
  }
  
  @scala.inline
  implicit class LABELFLOATABOVEOps[Self <: LABELFLOATABOVE] (val x: Self) extends AnyVal {
    
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
    def setLABEL_FLOAT_ABOVE(value: String): Self = this.set("LABEL_FLOAT_ABOVE", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLABEL_REQUIRED(value: String): Self = this.set("LABEL_REQUIRED", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLABEL_SHAKE(value: String): Self = this.set("LABEL_SHAKE", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setROOT(value: String): Self = this.set("ROOT", value.asInstanceOf[js.Any])
  }
}
