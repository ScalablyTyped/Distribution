package typings.iobroker.anon

import typings.iobroker.iobrokerStrings.Timeout
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IoBrokerBrand extends js.Object {
  
  var __ioBrokerBrand: Timeout = js.native
}
object IoBrokerBrand {
  
  @scala.inline
  def apply(__ioBrokerBrand: Timeout): IoBrokerBrand = {
    val __obj = js.Dynamic.literal(__ioBrokerBrand = __ioBrokerBrand.asInstanceOf[js.Any])
    __obj.asInstanceOf[IoBrokerBrand]
  }
  
  @scala.inline
  implicit class IoBrokerBrandOps[Self <: IoBrokerBrand] (val x: Self) extends AnyVal {
    
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
    def set__ioBrokerBrand(value: Timeout): Self = this.set("__ioBrokerBrand", value.asInstanceOf[js.Any])
  }
}
