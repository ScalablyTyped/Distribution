package typings.grpcGrpcJs.anon

import typings.grpcGrpcJs.buildSrcCallInterfaceMod.StatusObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@grpc/grpc-js.@grpc/grpc-js/build/src/transport.CallEventTracker> */
trait PartialCallEventTracker extends StObject {
  
  var addMessageReceived: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var addMessageSent: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var onCallEnd: js.UndefOr[js.Function1[/* status */ StatusObject, Unit]] = js.undefined
  
  var onStreamEnd: js.UndefOr[js.Function1[/* success */ Boolean, Unit]] = js.undefined
}
object PartialCallEventTracker {
  
  inline def apply(): PartialCallEventTracker = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialCallEventTracker]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PartialCallEventTracker] (val x: Self) extends AnyVal {
    
    inline def setAddMessageReceived(value: () => Unit): Self = StObject.set(x, "addMessageReceived", js.Any.fromFunction0(value))
    
    inline def setAddMessageReceivedUndefined: Self = StObject.set(x, "addMessageReceived", js.undefined)
    
    inline def setAddMessageSent(value: () => Unit): Self = StObject.set(x, "addMessageSent", js.Any.fromFunction0(value))
    
    inline def setAddMessageSentUndefined: Self = StObject.set(x, "addMessageSent", js.undefined)
    
    inline def setOnCallEnd(value: /* status */ StatusObject => Unit): Self = StObject.set(x, "onCallEnd", js.Any.fromFunction1(value))
    
    inline def setOnCallEndUndefined: Self = StObject.set(x, "onCallEnd", js.undefined)
    
    inline def setOnStreamEnd(value: /* success */ Boolean => Unit): Self = StObject.set(x, "onStreamEnd", js.Any.fromFunction1(value))
    
    inline def setOnStreamEndUndefined: Self = StObject.set(x, "onStreamEnd", js.undefined)
  }
}
