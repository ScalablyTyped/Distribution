package typings.isTrademarked.mod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TrademarkedData extends js.Object {
  
  var description: String = js.native
  
  var reg: Date = js.native
  
  var serviceCode: String = js.native
  
  var sn: String = js.native
  
  var wordmark: String = js.native
}
object TrademarkedData {
  
  @scala.inline
  def apply(description: String, reg: Date, serviceCode: String, sn: String, wordmark: String): TrademarkedData = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], reg = reg.asInstanceOf[js.Any], serviceCode = serviceCode.asInstanceOf[js.Any], sn = sn.asInstanceOf[js.Any], wordmark = wordmark.asInstanceOf[js.Any])
    __obj.asInstanceOf[TrademarkedData]
  }
  
  @scala.inline
  implicit class TrademarkedDataOps[Self <: TrademarkedData] (val x: Self) extends AnyVal {
    
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
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReg(value: Date): Self = this.set("reg", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServiceCode(value: String): Self = this.set("serviceCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSn(value: String): Self = this.set("sn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWordmark(value: String): Self = this.set("wordmark", value.asInstanceOf[js.Any])
  }
}
