package typings.grpcGrpcJs

import typings.grpcGrpcJs.socketMod.Socket
import typings.grpcGrpcJs.socketMod.SocketOutput
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getSocketResponseMod {
  
  trait GetSocketResponse extends StObject {
    
    /**
      * The Socket that corresponds to the requested socket_id.  This field
      * should be set.
      */
    var socket: js.UndefOr[Socket | Null] = js.undefined
  }
  object GetSocketResponse {
    
    inline def apply(): GetSocketResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GetSocketResponse]
    }
    
    extension [Self <: GetSocketResponse](x: Self) {
      
      inline def setSocket(value: Socket): Self = StObject.set(x, "socket", value.asInstanceOf[js.Any])
      
      inline def setSocketNull: Self = StObject.set(x, "socket", null)
      
      inline def setSocketUndefined: Self = StObject.set(x, "socket", js.undefined)
    }
  }
  
  trait GetSocketResponseOutput extends StObject {
    
    /**
      * The Socket that corresponds to the requested socket_id.  This field
      * should be set.
      */
    var socket: SocketOutput | Null
  }
  object GetSocketResponseOutput {
    
    inline def apply(): GetSocketResponseOutput = {
      val __obj = js.Dynamic.literal(socket = null)
      __obj.asInstanceOf[GetSocketResponseOutput]
    }
    
    extension [Self <: GetSocketResponseOutput](x: Self) {
      
      inline def setSocket(value: SocketOutput): Self = StObject.set(x, "socket", value.asInstanceOf[js.Any])
      
      inline def setSocketNull: Self = StObject.set(x, "socket", null)
    }
  }
}
