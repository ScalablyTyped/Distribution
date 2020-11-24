package typings.iitc.redeemingMod.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ResultData extends js.Object {
  
  var ap: String = js.native
  
  var inventory: js.Any = js.native
  
  var other: js.Array[String] = js.native
  
  var xm: String = js.native
}
object ResultData {
  
  @scala.inline
  def apply(ap: String, inventory: js.Any, other: js.Array[String], xm: String): ResultData = {
    val __obj = js.Dynamic.literal(ap = ap.asInstanceOf[js.Any], inventory = inventory.asInstanceOf[js.Any], other = other.asInstanceOf[js.Any], xm = xm.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResultData]
  }
  
  @scala.inline
  implicit class ResultDataOps[Self <: ResultData] (val x: Self) extends AnyVal {
    
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
    def setAp(value: String): Self = this.set("ap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInventory(value: js.Any): Self = this.set("inventory", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOtherVarargs(value: String*): Self = this.set("other", js.Array(value :_*))
    
    @scala.inline
    def setOther(value: js.Array[String]): Self = this.set("other", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXm(value: String): Self = this.set("xm", value.asInstanceOf[js.Any])
  }
}
