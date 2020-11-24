package typings.materialLinearProgress.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ARIAVALUENOW extends js.Object {
  
  var ARIA_VALUENOW: String = js.native
  
  var BUFFER_BAR_SELECTOR: String = js.native
  
  var FLEX_BASIS: String = js.native
  
  var PRIMARY_BAR_SELECTOR: String = js.native
}
object ARIAVALUENOW {
  
  @scala.inline
  def apply(
    ARIA_VALUENOW: String,
    BUFFER_BAR_SELECTOR: String,
    FLEX_BASIS: String,
    PRIMARY_BAR_SELECTOR: String
  ): ARIAVALUENOW = {
    val __obj = js.Dynamic.literal(ARIA_VALUENOW = ARIA_VALUENOW.asInstanceOf[js.Any], BUFFER_BAR_SELECTOR = BUFFER_BAR_SELECTOR.asInstanceOf[js.Any], FLEX_BASIS = FLEX_BASIS.asInstanceOf[js.Any], PRIMARY_BAR_SELECTOR = PRIMARY_BAR_SELECTOR.asInstanceOf[js.Any])
    __obj.asInstanceOf[ARIAVALUENOW]
  }
  
  @scala.inline
  implicit class ARIAVALUENOWOps[Self <: ARIAVALUENOW] (val x: Self) extends AnyVal {
    
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
    def setARIA_VALUENOW(value: String): Self = this.set("ARIA_VALUENOW", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBUFFER_BAR_SELECTOR(value: String): Self = this.set("BUFFER_BAR_SELECTOR", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFLEX_BASIS(value: String): Self = this.set("FLEX_BASIS", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPRIMARY_BAR_SELECTOR(value: String): Self = this.set("PRIMARY_BAR_SELECTOR", value.asInstanceOf[js.Any])
  }
}
