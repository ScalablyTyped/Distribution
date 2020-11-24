package typings.logkitty.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DEFAULT extends js.Object {
  
  var DEBUG: Double = js.native
  
  var DEFAULT: Double = js.native
  
  var ERROR: Double = js.native
  
  var INFO: Double = js.native
}
object DEFAULT {
  
  @scala.inline
  def apply(DEBUG: Double, DEFAULT: Double, ERROR: Double, INFO: Double): DEFAULT = {
    val __obj = js.Dynamic.literal(DEBUG = DEBUG.asInstanceOf[js.Any], DEFAULT = DEFAULT.asInstanceOf[js.Any], ERROR = ERROR.asInstanceOf[js.Any], INFO = INFO.asInstanceOf[js.Any])
    __obj.asInstanceOf[DEFAULT]
  }
  
  @scala.inline
  implicit class DEFAULTOps[Self <: DEFAULT] (val x: Self) extends AnyVal {
    
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
    def setDEBUG(value: Double): Self = this.set("DEBUG", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDEFAULT(value: Double): Self = this.set("DEFAULT", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setERROR(value: Double): Self = this.set("ERROR", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setINFO(value: Double): Self = this.set("INFO", value.asInstanceOf[js.Any])
  }
}
