package typings.grpcGrpcJs

import typings.grpcGrpcJs.serverMod.Server
import typings.grpcGrpcJs.serverMod.ServerOutput
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getServerResponseMod {
  
  trait GetServerResponse extends StObject {
    
    /**
      * The Server that corresponds to the requested server_id.  This field
      * should be set.
      */
    var server: js.UndefOr[Server | Null] = js.undefined
  }
  object GetServerResponse {
    
    inline def apply(): GetServerResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GetServerResponse]
    }
    
    extension [Self <: GetServerResponse](x: Self) {
      
      inline def setServer(value: Server): Self = StObject.set(x, "server", value.asInstanceOf[js.Any])
      
      inline def setServerNull: Self = StObject.set(x, "server", null)
      
      inline def setServerUndefined: Self = StObject.set(x, "server", js.undefined)
    }
  }
  
  trait GetServerResponseOutput extends StObject {
    
    /**
      * The Server that corresponds to the requested server_id.  This field
      * should be set.
      */
    var server: ServerOutput | Null
  }
  object GetServerResponseOutput {
    
    inline def apply(): GetServerResponseOutput = {
      val __obj = js.Dynamic.literal(server = null)
      __obj.asInstanceOf[GetServerResponseOutput]
    }
    
    extension [Self <: GetServerResponseOutput](x: Self) {
      
      inline def setServer(value: ServerOutput): Self = StObject.set(x, "server", value.asInstanceOf[js.Any])
      
      inline def setServerNull: Self = StObject.set(x, "server", null)
    }
  }
}
