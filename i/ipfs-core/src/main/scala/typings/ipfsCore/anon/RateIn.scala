package typings.ipfsCore.anon

import typings.bignumberJs.mod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RateIn extends js.Object {
  
  var rateIn: default = js.native
  
  var rateOut: default = js.native
  
  var totalIn: js.Any = js.native
  
  var totalOut: js.Any = js.native
}
object RateIn {
  
  @scala.inline
  def apply(rateIn: default, rateOut: default, totalIn: js.Any, totalOut: js.Any): RateIn = {
    val __obj = js.Dynamic.literal(rateIn = rateIn.asInstanceOf[js.Any], rateOut = rateOut.asInstanceOf[js.Any], totalIn = totalIn.asInstanceOf[js.Any], totalOut = totalOut.asInstanceOf[js.Any])
    __obj.asInstanceOf[RateIn]
  }
  
  @scala.inline
  implicit class RateInOps[Self <: RateIn] (val x: Self) extends AnyVal {
    
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
    def setRateIn(value: default): Self = this.set("rateIn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRateOut(value: default): Self = this.set("rateOut", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotalIn(value: js.Any): Self = this.set("totalIn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotalOut(value: js.Any): Self = this.set("totalOut", value.asInstanceOf[js.Any])
  }
}
