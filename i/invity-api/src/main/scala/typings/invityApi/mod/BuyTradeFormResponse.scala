package typings.invityApi.mod

import typings.invityApi.anon.Fields
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BuyTradeFormResponse extends js.Object {
  
  var error: js.UndefOr[String] = js.native
  
  var form: js.UndefOr[Fields] = js.native
}
object BuyTradeFormResponse {
  
  @scala.inline
  def apply(): BuyTradeFormResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BuyTradeFormResponse]
  }
  
  @scala.inline
  implicit class BuyTradeFormResponseOps[Self <: BuyTradeFormResponse] (val x: Self) extends AnyVal {
    
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
    def setError(value: String): Self = this.set("error", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteError: Self = this.set("error", js.undefined)
    
    @scala.inline
    def setForm(value: Fields): Self = this.set("form", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteForm: Self = this.set("form", js.undefined)
  }
}
