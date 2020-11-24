package typings.materialCircularProgress.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CLOSEDCLASS extends js.Object {
  
  var CLOSED_CLASS: String = js.native
  
  var INDETERMINATE_CLASS: String = js.native
}
object CLOSEDCLASS {
  
  @scala.inline
  def apply(CLOSED_CLASS: String, INDETERMINATE_CLASS: String): CLOSEDCLASS = {
    val __obj = js.Dynamic.literal(CLOSED_CLASS = CLOSED_CLASS.asInstanceOf[js.Any], INDETERMINATE_CLASS = INDETERMINATE_CLASS.asInstanceOf[js.Any])
    __obj.asInstanceOf[CLOSEDCLASS]
  }
  
  @scala.inline
  implicit class CLOSEDCLASSOps[Self <: CLOSEDCLASS] (val x: Self) extends AnyVal {
    
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
    def setCLOSED_CLASS(value: String): Self = this.set("CLOSED_CLASS", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setINDETERMINATE_CLASS(value: String): Self = this.set("INDETERMINATE_CLASS", value.asInstanceOf[js.Any])
  }
}
