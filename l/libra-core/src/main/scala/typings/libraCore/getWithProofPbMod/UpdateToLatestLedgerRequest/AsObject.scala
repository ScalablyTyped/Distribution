package typings.libraCore.getWithProofPbMod.UpdateToLatestLedgerRequest

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AsObject extends js.Object {
  
  var clientKnownVersion: String = js.native
  
  var requestedItemsList: js.Array[typings.libraCore.getWithProofPbMod.RequestItem.AsObject] = js.native
}
object AsObject {
  
  @scala.inline
  def apply(
    clientKnownVersion: String,
    requestedItemsList: js.Array[typings.libraCore.getWithProofPbMod.RequestItem.AsObject]
  ): AsObject = {
    val __obj = js.Dynamic.literal(clientKnownVersion = clientKnownVersion.asInstanceOf[js.Any], requestedItemsList = requestedItemsList.asInstanceOf[js.Any])
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
    def setClientKnownVersion(value: String): Self = this.set("clientKnownVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestedItemsListVarargs(value: typings.libraCore.getWithProofPbMod.RequestItem.AsObject*): Self = this.set("requestedItemsList", js.Array(value :_*))
    
    @scala.inline
    def setRequestedItemsList(value: js.Array[typings.libraCore.getWithProofPbMod.RequestItem.AsObject]): Self = this.set("requestedItemsList", value.asInstanceOf[js.Any])
  }
}
