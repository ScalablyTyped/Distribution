package typings.libp2pInterfaces.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CanRelayMessage extends js.Object {
  
  var canRelayMessage: js.UndefOr[Boolean] = js.native
  
  var debugName: String = js.native
  
  var emitSelf: js.UndefOr[Boolean] = js.native
  
  var globalSignaturePolicy: js.UndefOr[js.Any] = js.native
  
  var libp2p: js.Any = js.native
  
  var multicodecs: String | js.Array[String] = js.native
}
object CanRelayMessage {
  
  @scala.inline
  def apply(debugName: String, libp2p: js.Any, multicodecs: String | js.Array[String]): CanRelayMessage = {
    val __obj = js.Dynamic.literal(debugName = debugName.asInstanceOf[js.Any], libp2p = libp2p.asInstanceOf[js.Any], multicodecs = multicodecs.asInstanceOf[js.Any])
    __obj.asInstanceOf[CanRelayMessage]
  }
  
  @scala.inline
  implicit class CanRelayMessageOps[Self <: CanRelayMessage] (val x: Self) extends AnyVal {
    
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
    def setDebugName(value: String): Self = this.set("debugName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLibp2p(value: js.Any): Self = this.set("libp2p", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMulticodecsVarargs(value: String*): Self = this.set("multicodecs", js.Array(value :_*))
    
    @scala.inline
    def setMulticodecs(value: String | js.Array[String]): Self = this.set("multicodecs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCanRelayMessage(value: Boolean): Self = this.set("canRelayMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCanRelayMessage: Self = this.set("canRelayMessage", js.undefined)
    
    @scala.inline
    def setEmitSelf(value: Boolean): Self = this.set("emitSelf", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEmitSelf: Self = this.set("emitSelf", js.undefined)
    
    @scala.inline
    def setGlobalSignaturePolicy(value: js.Any): Self = this.set("globalSignaturePolicy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGlobalSignaturePolicy: Self = this.set("globalSignaturePolicy", js.undefined)
  }
}
