package typings.materialToolbar.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FIXED extends js.Object {
  
  var FIXED: String = js.native
  
  var FIXED_AT_LAST_ROW: String = js.native
  
  var FIXED_LASTROW: String = js.native
  
  var FLEXIBLE_DEFAULT_BEHAVIOR: String = js.native
  
  var FLEXIBLE_MAX: String = js.native
  
  var FLEXIBLE_MIN: String = js.native
  
  var TOOLBAR_ROW_FLEXIBLE: String = js.native
}
object FIXED {
  
  @scala.inline
  def apply(
    FIXED: String,
    FIXED_AT_LAST_ROW: String,
    FIXED_LASTROW: String,
    FLEXIBLE_DEFAULT_BEHAVIOR: String,
    FLEXIBLE_MAX: String,
    FLEXIBLE_MIN: String,
    TOOLBAR_ROW_FLEXIBLE: String
  ): FIXED = {
    val __obj = js.Dynamic.literal(FIXED = FIXED.asInstanceOf[js.Any], FIXED_AT_LAST_ROW = FIXED_AT_LAST_ROW.asInstanceOf[js.Any], FIXED_LASTROW = FIXED_LASTROW.asInstanceOf[js.Any], FLEXIBLE_DEFAULT_BEHAVIOR = FLEXIBLE_DEFAULT_BEHAVIOR.asInstanceOf[js.Any], FLEXIBLE_MAX = FLEXIBLE_MAX.asInstanceOf[js.Any], FLEXIBLE_MIN = FLEXIBLE_MIN.asInstanceOf[js.Any], TOOLBAR_ROW_FLEXIBLE = TOOLBAR_ROW_FLEXIBLE.asInstanceOf[js.Any])
    __obj.asInstanceOf[FIXED]
  }
  
  @scala.inline
  implicit class FIXEDOps[Self <: FIXED] (val x: Self) extends AnyVal {
    
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
    def setFIXED(value: String): Self = this.set("FIXED", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFIXED_AT_LAST_ROW(value: String): Self = this.set("FIXED_AT_LAST_ROW", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFIXED_LASTROW(value: String): Self = this.set("FIXED_LASTROW", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFLEXIBLE_DEFAULT_BEHAVIOR(value: String): Self = this.set("FLEXIBLE_DEFAULT_BEHAVIOR", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFLEXIBLE_MAX(value: String): Self = this.set("FLEXIBLE_MAX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFLEXIBLE_MIN(value: String): Self = this.set("FLEXIBLE_MIN", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTOOLBAR_ROW_FLEXIBLE(value: String): Self = this.set("TOOLBAR_ROW_FLEXIBLE", value.asInstanceOf[js.Any])
  }
}
