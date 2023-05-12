package typings.grpcGrpcJs.anon

import typings.grpcGrpcJs.buildSrcCallInterfaceMod.StatusObject
import typings.grpcGrpcJs.buildSrcMetadataMod.Metadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@grpc/grpc-js.@grpc/grpc-js/build/src/call-interface.InterceptingListener> */
trait PartialInterceptingListen extends StObject {
  
  var onReceiveMessage: js.UndefOr[js.Function1[/* message */ scala.Any, Unit]] = js.undefined
  
  var onReceiveMetadata: js.UndefOr[js.Function1[/* metadata */ Metadata, Unit]] = js.undefined
  
  var onReceiveStatus: js.UndefOr[js.Function1[/* status */ StatusObject, Unit]] = js.undefined
}
object PartialInterceptingListen {
  
  inline def apply(): PartialInterceptingListen = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialInterceptingListen]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PartialInterceptingListen] (val x: Self) extends AnyVal {
    
    inline def setOnReceiveMessage(value: /* message */ scala.Any => Unit): Self = StObject.set(x, "onReceiveMessage", js.Any.fromFunction1(value))
    
    inline def setOnReceiveMessageUndefined: Self = StObject.set(x, "onReceiveMessage", js.undefined)
    
    inline def setOnReceiveMetadata(value: /* metadata */ Metadata => Unit): Self = StObject.set(x, "onReceiveMetadata", js.Any.fromFunction1(value))
    
    inline def setOnReceiveMetadataUndefined: Self = StObject.set(x, "onReceiveMetadata", js.undefined)
    
    inline def setOnReceiveStatus(value: /* status */ StatusObject => Unit): Self = StObject.set(x, "onReceiveStatus", js.Any.fromFunction1(value))
    
    inline def setOnReceiveStatusUndefined: Self = StObject.set(x, "onReceiveStatus", js.undefined)
  }
}
