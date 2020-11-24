package typings.libraCore.getWithProofPbMod.GetAccountTransactionBySequenceNumberRequest

import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AsObject extends js.Object {
  
  var account: Uint8Array | String = js.native
  
  var fetchEvents: Boolean = js.native
  
  var sequenceNumber: String = js.native
}
object AsObject {
  
  @scala.inline
  def apply(account: Uint8Array | String, fetchEvents: Boolean, sequenceNumber: String): AsObject = {
    val __obj = js.Dynamic.literal(account = account.asInstanceOf[js.Any], fetchEvents = fetchEvents.asInstanceOf[js.Any], sequenceNumber = sequenceNumber.asInstanceOf[js.Any])
    __obj.asInstanceOf[AsObject]
  }
  
  @scala.inline
  implicit class AsObjectOps[Self <: AsObject] (val x: Self) extends AnyVal {
    
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
    def setAccount(value: Uint8Array | String): Self = this.set("account", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFetchEvents(value: Boolean): Self = this.set("fetchEvents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSequenceNumber(value: String): Self = this.set("sequenceNumber", value.asInstanceOf[js.Any])
  }
}
