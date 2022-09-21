package typings.grpcGrpcJs

import typings.grpcProtoLoader.mod.Long
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getServerRequestMod {
  
  trait GetServerRequest extends StObject {
    
    /**
      * server_id is the identifier of the specific server to get.
      */
    var server_id: js.UndefOr[Double | String | Long] = js.undefined
  }
  object GetServerRequest {
    
    inline def apply(): GetServerRequest = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GetServerRequest]
    }
    
    extension [Self <: GetServerRequest](x: Self) {
      
      inline def setServer_id(value: Double | String | Long): Self = StObject.set(x, "server_id", value.asInstanceOf[js.Any])
      
      inline def setServer_idUndefined: Self = StObject.set(x, "server_id", js.undefined)
    }
  }
  
  trait GetServerRequestOutput extends StObject {
    
    /**
      * server_id is the identifier of the specific server to get.
      */
    var server_id: String
  }
  object GetServerRequestOutput {
    
    inline def apply(server_id: String): GetServerRequestOutput = {
      val __obj = js.Dynamic.literal(server_id = server_id.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetServerRequestOutput]
    }
    
    extension [Self <: GetServerRequestOutput](x: Self) {
      
      inline def setServer_id(value: String): Self = StObject.set(x, "server_id", value.asInstanceOf[js.Any])
    }
  }
}
