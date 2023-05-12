package typings.grpcGcp

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildSrcGrpcInterfaceMod {
  
  trait GrpcInterface extends StObject {
    
    var Channel: Any
    
    var InterceptingCall: Any
    
    var connectivityState: Any
    
    var status: Any
  }
  object GrpcInterface {
    
    inline def apply(Channel: Any, InterceptingCall: Any, connectivityState: Any, status: Any): GrpcInterface = {
      val __obj = js.Dynamic.literal(Channel = Channel.asInstanceOf[js.Any], InterceptingCall = InterceptingCall.asInstanceOf[js.Any], connectivityState = connectivityState.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
      __obj.asInstanceOf[GrpcInterface]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: GrpcInterface] (val x: Self) extends AnyVal {
      
      inline def setChannel(value: Any): Self = StObject.set(x, "Channel", value.asInstanceOf[js.Any])
      
      inline def setConnectivityState(value: Any): Self = StObject.set(x, "connectivityState", value.asInstanceOf[js.Any])
      
      inline def setInterceptingCall(value: Any): Self = StObject.set(x, "InterceptingCall", value.asInstanceOf[js.Any])
      
      inline def setStatus(value: Any): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    }
  }
}
