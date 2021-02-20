package typings.grpc.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Requester extends StObject {
  
  var cancel: js.UndefOr[CancelRequester] = js.native
  
  var getPeer: js.UndefOr[GetPeerRequester] = js.native
  
  var halfClose: js.UndefOr[CloseRequester] = js.native
  
  var sendMessage: js.UndefOr[MessageRequester] = js.native
  
  var start: js.UndefOr[MetadataRequester] = js.native
}
object Requester {
  
  @scala.inline
  def apply(): Requester = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Requester]
  }
  
  @scala.inline
  implicit class RequesterMutableBuilder[Self <: Requester] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCancel(value: /* next */ js.Function => Unit): Self = StObject.set(x, "cancel", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
    
    @scala.inline
    def setGetPeer(value: /* next */ js.Function => String): Self = StObject.set(x, "getPeer", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetPeerUndefined: Self = StObject.set(x, "getPeer", js.undefined)
    
    @scala.inline
    def setHalfClose(value: /* next */ js.Function => Unit): Self = StObject.set(x, "halfClose", js.Any.fromFunction1(value))
    
    @scala.inline
    def setHalfCloseUndefined: Self = StObject.set(x, "halfClose", js.undefined)
    
    @scala.inline
    def setSendMessage(value: (/* message */ js.Any, /* next */ js.Function) => Unit): Self = StObject.set(x, "sendMessage", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSendMessageUndefined: Self = StObject.set(x, "sendMessage", js.undefined)
    
    @scala.inline
    def setStart(value: (/* metadata */ Metadata, /* listener */ Listener, /* next */ js.Function) => Unit): Self = StObject.set(x, "start", js.Any.fromFunction3(value))
    
    @scala.inline
    def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
  }
}
