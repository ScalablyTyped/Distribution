package typings.libp2pGossipsub.messageMod

import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Message extends js.Object {
  
  /**
    * Opaque blob of data
    */
  var data: js.UndefOr[Uint8Array] = js.native
  
  /**
    * Peer id of the author of the message
    *
    * Note: This is not necessarily the peer who sent the RPC this message is contained in
    */
  var from: js.UndefOr[Uint8Array] = js.native
  
  /**
    * Signing key
    */
  var key: js.UndefOr[Uint8Array] = js.native
  
  /**
    * 64-bit big-endian uint
    *
    * No two messages on a topic from the same peer should have the same seqno value
    */
  var seqno: js.UndefOr[Uint8Array] = js.native
  
  /**
    * Signature of the message
    *
    * The signature is computed over the marshalled message protobuf excluding the key field
    * The protobuf bloc is prefixed by the string `libp2p-pubsub:` before signing
    */
  var signature: js.UndefOr[Uint8Array] = js.native
  
  /**
    * Set of topics being published to
    */
  var topicIDs: js.Array[String] = js.native
}
object Message {
  
  @scala.inline
  def apply(topicIDs: js.Array[String]): Message = {
    val __obj = js.Dynamic.literal(topicIDs = topicIDs.asInstanceOf[js.Any])
    __obj.asInstanceOf[Message]
  }
  
  @scala.inline
  implicit class MessageOps[Self <: Message] (val x: Self) extends AnyVal {
    
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
    def setTopicIDsVarargs(value: String*): Self = this.set("topicIDs", js.Array(value :_*))
    
    @scala.inline
    def setTopicIDs(value: js.Array[String]): Self = this.set("topicIDs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setData(value: Uint8Array): Self = this.set("data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteData: Self = this.set("data", js.undefined)
    
    @scala.inline
    def setFrom(value: Uint8Array): Self = this.set("from", value.asInstanceOf[js.Any])
    
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
