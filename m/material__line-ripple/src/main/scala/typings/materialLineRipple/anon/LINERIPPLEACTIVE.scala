package typings.materialLineRipple.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LINERIPPLEACTIVE extends js.Object {
  
  var LINE_RIPPLE_ACTIVE: String = js.native
  
  var LINE_RIPPLE_DEACTIVATING: String = js.native
}
object LINERIPPLEACTIVE {
  
  @scala.inline
  def apply(LINE_RIPPLE_ACTIVE: String, LINE_RIPPLE_DEACTIVATING: String): LINERIPPLEACTIVE = {
    val __obj = js.Dynamic.literal(LINE_RIPPLE_ACTIVE = LINE_RIPPLE_ACTIVE.asInstanceOf[js.Any], LINE_RIPPLE_DEACTIVATING = LINE_RIPPLE_DEACTIVATING.asInstanceOf[js.Any])
    __obj.asInstanceOf[LINERIPPLEACTIVE]
  }
  
  @scala.inline
  implicit class LINERIPPLEACTIVEOps[Self <: LINERIPPLEACTIVE] (val x: Self) extends AnyVal {
    
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
    def setLINE_RIPPLE_ACTIVE(value: String): Self = this.set("LINE_RIPPLE_ACTIVE", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLINE_RIPPLE_DEACTIVATING(value: String): Self = this.set("LINE_RIPPLE_DEACTIVATING", value.asInstanceOf[js.Any])
  }
}
