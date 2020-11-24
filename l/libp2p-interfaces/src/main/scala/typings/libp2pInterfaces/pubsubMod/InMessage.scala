package typings.libp2pInterfaces.pubsubMod

import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InMessage extends js.Object {
  
  var data: Uint8Array = js.native
  
  var from: js.UndefOr[String] = js.native
  
  var key: js.UndefOr[Uint8Array] = js.native
  
  var receivedFrom: String = js.native
  
  var seqno: js.UndefOr[Uint8Array] = js.native
  
  var signature: js.UndefOr[Uint8Array] = js.native
  
  var topicIDs: js.Array[String] = js.native
}
object InMessage {
  
  @scala.inline
  def apply(data: Uint8Array, receivedFrom: String, topicIDs: js.Array[String]): InMessage = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], receivedFrom = receivedFrom.asInstanceOf[js.Any], topicIDs = topicIDs.asInstanceOf[js.Any])
    __obj.asInstanceOf[InMessage]
  }
  
  @scala.inline
  implicit class InMessageOps[Self <: InMessage] (val x: Self) extends AnyVal {
    
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
    def setData(value: Uint8Array): Self = this.set("data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReceivedFrom(value: String): Self = this.set("receivedFrom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTopicIDsVarargs(value: String*): Self = this.set("topicIDs", js.Array(value :_*))
    
    @scala.inline
    def setTopicIDs(value: js.Array[String]): Self = this.set("topicIDs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFrom(value: String): Self = this.set("from", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFrom: Self = this.set("from", js.undefined)
    
    @scala.inline
    def setKey(value: Uint8Array): Self = this.set("key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKey: Self = this.set("key", js.undefined)
    
    @scala.inline
    def setSeqno(value: Uint8Array): Self = this.set("seqno", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSeqno: Self = this.set("seqno", js.undefined)
    
    @scala.inline
    def setSignature(value: Uint8Array): Self = this.set("signature", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSignature: Self = this.set("signature", js.undefined)
  }
}
