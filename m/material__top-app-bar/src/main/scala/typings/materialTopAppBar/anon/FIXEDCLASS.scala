package typings.materialTopAppBar.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FIXEDCLASS extends js.Object {
  
  var FIXED_CLASS: String = js.native
  
  var FIXED_SCROLLED_CLASS: String = js.native
  
  var SHORT_CLASS: String = js.native
  
  var SHORT_COLLAPSED_CLASS: String = js.native
  
  var SHORT_HAS_ACTION_ITEM_CLASS: String = js.native
}
object FIXEDCLASS {
  
  @scala.inline
  def apply(
    FIXED_CLASS: String,
    FIXED_SCROLLED_CLASS: String,
    SHORT_CLASS: String,
    SHORT_COLLAPSED_CLASS: String,
    SHORT_HAS_ACTION_ITEM_CLASS: String
  ): FIXEDCLASS = {
    val __obj = js.Dynamic.literal(FIXED_CLASS = FIXED_CLASS.asInstanceOf[js.Any], FIXED_SCROLLED_CLASS = FIXED_SCROLLED_CLASS.asInstanceOf[js.Any], SHORT_CLASS = SHORT_CLASS.asInstanceOf[js.Any], SHORT_COLLAPSED_CLASS = SHORT_COLLAPSED_CLASS.asInstanceOf[js.Any], SHORT_HAS_ACTION_ITEM_CLASS = SHORT_HAS_ACTION_ITEM_CLASS.asInstanceOf[js.Any])
    __obj.asInstanceOf[FIXEDCLASS]
  }
  
  @scala.inline
  implicit class FIXEDCLASSOps[Self <: FIXEDCLASS] (val x: Self) extends AnyVal {
    
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
    def setFIXED_CLASS(value: String): Self = this.set("FIXED_CLASS", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFIXED_SCROLLED_CLASS(value: String): Self = this.set("FIXED_SCROLLED_CLASS", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSHORT_CLASS(value: String): Self = this.set("SHORT_CLASS", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSHORT_COLLAPSED_CLASS(value: String): Self = this.set("SHORT_COLLAPSED_CLASS", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSHORT_HAS_ACTION_ITEM_CLASS(value: String): Self = this.set("SHORT_HAS_ACTION_ITEM_CLASS", value.asInstanceOf[js.Any])
  }
}
