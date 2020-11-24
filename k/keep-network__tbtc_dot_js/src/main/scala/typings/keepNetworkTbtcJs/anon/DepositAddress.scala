package typings.keepNetworkTbtcJs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DepositAddress extends js.Object {
  
  var depositAddress: String = js.native
  
  var keepAddress: String = js.native
}
object DepositAddress {
  
  @scala.inline
  def apply(depositAddress: String, keepAddress: String): DepositAddress = {
    val __obj = js.Dynamic.literal(depositAddress = depositAddress.asInstanceOf[js.Any], keepAddress = keepAddress.asInstanceOf[js.Any])
    __obj.asInstanceOf[DepositAddress]
  }
  
  @scala.inline
  implicit class DepositAddressOps[Self <: DepositAddress] (val x: Self) extends AnyVal {
    
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
    def setDepositAddress(value: String): Self = this.set("depositAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeepAddress(value: String): Self = this.set("keepAddress", value.asInstanceOf[js.Any])
  }
}
