package typings.materialSelect.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LABELSCALE extends js.Object {
  
  var LABEL_SCALE: Double = js.native
  
  var UNSET_INDEX: Double = js.native
}
object LABELSCALE {
  
  @scala.inline
  def apply(LABEL_SCALE: Double, UNSET_INDEX: Double): LABELSCALE = {
    val __obj = js.Dynamic.literal(LABEL_SCALE = LABEL_SCALE.asInstanceOf[js.Any], UNSET_INDEX = UNSET_INDEX.asInstanceOf[js.Any])
    __obj.asInstanceOf[LABELSCALE]
  }
  
  @scala.inline
  implicit class LABELSCALEOps[Self <: LABELSCALE] (val x: Self) extends AnyVal {
    
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
    def setLABEL_SCALE(value: Double): Self = this.set("LABEL_SCALE", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUNSET_INDEX(value: Double): Self = this.set("UNSET_INDEX", value.asInstanceOf[js.Any])
  }
}
