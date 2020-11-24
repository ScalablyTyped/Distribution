package typings.javascriptTimeAgo.localeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Tense extends js.Object {
  
  var current: js.UndefOr[QuantifyType | String] = js.native
  
  var future: js.UndefOr[QuantifyType | String] = js.native
  
  var next: js.UndefOr[QuantifyType | String] = js.native
  
  var past: js.UndefOr[QuantifyType | String] = js.native
  
  var previous: js.UndefOr[QuantifyType | String] = js.native
}
object Tense {
  
  @scala.inline
  def apply(): Tense = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Tense]
  }
  
  @scala.inline
  implicit class TenseOps[Self <: Tense] (val x: Self) extends AnyVal {
    
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
    def setCurrent(value: QuantifyType | String): Self = this.set("current", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCurrent: Self = this.set("current", js.undefined)
    
    @scala.inline
    def setFuture(value: QuantifyType | String): Self = this.set("future", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFuture: Self = this.set("future", js.undefined)
    
    @scala.inline
    def setNext(value: QuantifyType | String): Self = this.set("next", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNext: Self = this.set("next", js.undefined)
    
    @scala.inline
    def setPast(value: QuantifyType | String): Self = this.set("past", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePast: Self = this.set("past", js.undefined)
    
    @scala.inline
    def setPrevious(value: QuantifyType | String): Self = this.set("previous", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrevious: Self = this.set("previous", js.undefined)
  }
}
