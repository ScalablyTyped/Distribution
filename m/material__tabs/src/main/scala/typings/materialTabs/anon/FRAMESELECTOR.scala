package typings.materialTabs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FRAMESELECTOR extends js.Object {
  
  var FRAME_SELECTOR: String = js.native
  
  var INDICATOR_BACK_SELECTOR: String = js.native
  
  var INDICATOR_FORWARD_SELECTOR: String = js.native
  
  var TABS_SELECTOR: String = js.native
  
  var TAB_SELECTOR: String = js.native
}
object FRAMESELECTOR {
  
  @scala.inline
  def apply(
    FRAME_SELECTOR: String,
    INDICATOR_BACK_SELECTOR: String,
    INDICATOR_FORWARD_SELECTOR: String,
    TABS_SELECTOR: String,
    TAB_SELECTOR: String
  ): FRAMESELECTOR = {
    val __obj = js.Dynamic.literal(FRAME_SELECTOR = FRAME_SELECTOR.asInstanceOf[js.Any], INDICATOR_BACK_SELECTOR = INDICATOR_BACK_SELECTOR.asInstanceOf[js.Any], INDICATOR_FORWARD_SELECTOR = INDICATOR_FORWARD_SELECTOR.asInstanceOf[js.Any], TABS_SELECTOR = TABS_SELECTOR.asInstanceOf[js.Any], TAB_SELECTOR = TAB_SELECTOR.asInstanceOf[js.Any])
    __obj.asInstanceOf[FRAMESELECTOR]
  }
  
  @scala.inline
  implicit class FRAMESELECTOROps[Self <: FRAMESELECTOR] (val x: Self) extends AnyVal {
    
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
    def setFRAME_SELECTOR(value: String): Self = this.set("FRAME_SELECTOR", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setINDICATOR_BACK_SELECTOR(value: String): Self = this.set("INDICATOR_BACK_SELECTOR", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setINDICATOR_FORWARD_SELECTOR(value: String): Self = this.set("INDICATOR_FORWARD_SELECTOR", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTABS_SELECTOR(value: String): Self = this.set("TABS_SELECTOR", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTAB_SELECTOR(value: String): Self = this.set("TAB_SELECTOR", value.asInstanceOf[js.Any])
  }
}
