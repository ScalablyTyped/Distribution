package typings.grpcGrpcJs

import typings.grpcProtoLoader.mod.Long
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object socketRefMod {
  
  trait SocketRef extends StObject {
    
    /**
      * An optional name associated with the socket.
      */
    var name: js.UndefOr[String] = js.undefined
    
    /**
      * The globally unique id for this socket.  Must be a positive number.
      */
    var socket_id: js.UndefOr[Double | String | Long] = js.undefined
  }
  object SocketRef {
    
    inline def apply(): SocketRef = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SocketRef]
    }
    
    extension [Self <: SocketRef](x: Self) {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setSocket_id(value: Double | String | Long): Self = StObject.set(x, "socket_id", value.asInstanceOf[js.Any])
      
      inline def setSocket_idUndefined: Self = StObject.set(x, "socket_id", js.undefined)
    }
  }
  
  trait SocketRefOutput extends StObject {
    
    /**
      * An optional name associated with the socket.
      */
    var name: String
    
    /**
      * The globally unique id for this socket.  Must be a positive number.
      */
    var socket_id: String
  }
  object SocketRefOutput {
    
    inline def apply(name: String, socket_id: String): SocketRefOutput = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], socket_id = socket_id.asInstanceOf[js.Any])
      __obj.asInstanceOf[SocketRefOutput]
    }
    
    extension [Self <: SocketRefOutput](x: Self) {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setSocket_id(value: String): Self = StObject.set(x, "socket_id", value.asInstanceOf[js.Any])
    }
  }
}
