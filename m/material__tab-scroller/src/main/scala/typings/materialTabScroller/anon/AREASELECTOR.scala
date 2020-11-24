package typings.materialTabScroller.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AREASELECTOR extends js.Object {
  
  var AREA_SELECTOR: String = js.native
  
  var CONTENT_SELECTOR: String = js.native
}
object AREASELECTOR {
  
  @scala.inline
  def apply(AREA_SELECTOR: String, CONTENT_SELECTOR: String): AREASELECTOR = {
    val __obj = js.Dynamic.literal(AREA_SELECTOR = AREA_SELECTOR.asInstanceOf[js.Any], CONTENT_SELECTOR = CONTENT_SELECTOR.asInstanceOf[js.Any])
    __obj.asInstanceOf[AREASELECTOR]
  }
  
  @scala.inline
  implicit class AREASELECTOROps[Self <: AREASELECTOR] (val x: Self) extends AnyVal {
    
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
    def setAREA_SELECTOR(value: String): Self = this.set("AREA_SELECTOR", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCONTENT_SELECTOR(value: String): Self = this.set("CONTENT_SELECTOR", value.asInstanceOf[js.Any])
  }
}
