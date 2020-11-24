package typings.libraCore.getWithProofPbMod.GetEventsByEventAccessPathResponse

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AsObject extends js.Object {
  
  var eventsWithProofList: js.Array[typings.libraCore.eventsPbMod.EventWithProof.AsObject] = js.native
  
  var proofOfLatestEvent: js.UndefOr[typings.libraCore.accountStateBlobPbMod.AccountStateWithProof.AsObject] = js.native
}
object AsObject {
  
  @scala.inline
  def apply(eventsWithProofList: js.Array[typings.libraCore.eventsPbMod.EventWithProof.AsObject]): AsObject = {
    val __obj = js.Dynamic.literal(eventsWithProofList = eventsWithProofList.asInstanceOf[js.Any])
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
    def setEventsWithProofListVarargs(value: typings.libraCore.eventsPbMod.EventWithProof.AsObject*): Self = this.set("eventsWithProofList", js.Array(value :_*))
    
    @scala.inline
    def setEventsWithProofList(value: js.Array[typings.libraCore.eventsPbMod.EventWithProof.AsObject]): Self = this.set("eventsWithProofList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProofOfLatestEvent(value: typings.libraCore.accountStateBlobPbMod.AccountStateWithProof.AsObject): Self = this.set("proofOfLatestEvent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProofOfLatestEvent: Self = this.set("proofOfLatestEvent", js.undefined)
  }
}
