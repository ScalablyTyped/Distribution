package typings.grpc.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Requester extends StObject {
  
  var cancel: js.UndefOr[CancelRequester] = js.undefined
  
  var getPeer: js.UndefOr[GetPeerRequester] = js.undefined
  
  var halfClose: js.UndefOr[CloseRequester] = js.undefined
  
  var sendMessage: js.UndefOr[MessageRequester] = js.undefined
  
  var start: js.UndefOr[MetadataRequester] = js.undefined
}
object Requester {
  
  inline def apply(): Requester = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Requester]
  }
  
  extension [Self <: Requester](x: Self) {
    
    inline def setCancel(value: /* next */ js.Function => Unit): Self = StObject.set(x, "cancel", js.Any.fromFunction1(value))
    
    inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
    
    inline def setGetPeer(value: /* next */ js.Function => String): Self = StObject.set(x, "getPeer", js.Any.fromFunction1(value))
    
    inline def setGetPeerUndefined: Self = StObject.set(x, "getPeer", js.undefined)
    
    inline def setHalfClose(value: /* next */ js.Function => Unit): Self = StObject.set(x, "halfClose", js.Any.fromFunction1(value))
    
    inline def setHalfCloseUndefined: Self = StObject.set(x, "halfClose", js.undefined)
    
    inline def setSendMessage(value: (/* message */ js.Any, /* next */ js.Function) => Unit): Self = StObject.set(x, "sendMessage", js.Any.fromFunction2(value))
    
    inline def setSendMessageUndefined: Self = StObject.set(x, "sendMessage", js.undefined)
    
    inline def setStart(value: (/* metadata */ Metadata, /* listener */ Listener, /* next */ js.Function) => Unit): Self = StObject.set(x, "start", js.Any.fromFunction3(value))
    
    inline def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
  }
}
