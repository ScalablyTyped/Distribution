package typings.grpcGrpcJs

import typings.grpcProtoLoader.mod.Long
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getServerSocketsRequestMod {
  
  trait GetServerSocketsRequest extends StObject {
    
    /**
      * If non-zero, the server will return a page of results containing
      * at most this many items. If zero, the server will choose a
      * reasonable page size.  Must never be negative.
      */
    var max_results: js.UndefOr[Double | String | Long] = js.undefined
    
    var server_id: js.UndefOr[Double | String | Long] = js.undefined
    
    /**
      * start_socket_id indicates that only sockets at or above this id should be
      * included in the results.
      * To request the first page, this must be set to 0. To request
      * subsequent pages, the client generates this value by adding 1 to
      * the highest seen result ID.
      */
    var start_socket_id: js.UndefOr[Double | String | Long] = js.undefined
  }
  object GetServerSocketsRequest {
    
    inline def apply(): GetServerSocketsRequest = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GetServerSocketsRequest]
    }
    
    extension [Self <: GetServerSocketsRequest](x: Self) {
      
      inline def setMax_results(value: Double | String | Long): Self = StObject.set(x, "max_results", value.asInstanceOf[js.Any])
      
      inline def setMax_resultsUndefined: Self = StObject.set(x, "max_results", js.undefined)
      
      inline def setServer_id(value: Double | String | Long): Self = StObject.set(x, "server_id", value.asInstanceOf[js.Any])
      
      inline def setServer_idUndefined: Self = StObject.set(x, "server_id", js.undefined)
      
      inline def setStart_socket_id(value: Double | String | Long): Self = StObject.set(x, "start_socket_id", value.asInstanceOf[js.Any])
      
      inline def setStart_socket_idUndefined: Self = StObject.set(x, "start_socket_id", js.undefined)
    }
  }
  
  trait GetServerSocketsRequestOutput extends StObject {
    
    /**
      * If non-zero, the server will return a page of results containing
      * at most this many items. If zero, the server will choose a
      * reasonable page size.  Must never be negative.
      */
    var max_results: String
    
    var server_id: String
    
    /**
      * start_socket_id indicates that only sockets at or above this id should be
      * included in the results.
      * To request the first page, this must be set to 0. To request
      * subsequent pages, the client generates this value by adding 1 to
      * the highest seen result ID.
      */
    var start_socket_id: String
  }
  object GetServerSocketsRequestOutput {
    
    inline def apply(max_results: String, server_id: String, start_socket_id: String): GetServerSocketsRequestOutput = {
      val __obj = js.Dynamic.literal(max_results = max_results.asInstanceOf[js.Any], server_id = server_id.asInstanceOf[js.Any], start_socket_id = start_socket_id.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetServerSocketsRequestOutput]
    }
    
    extension [Self <: GetServerSocketsRequestOutput](x: Self) {
      
      inline def setMax_results(value: String): Self = StObject.set(x, "max_results", value.asInstanceOf[js.Any])
      
      inline def setServer_id(value: String): Self = StObject.set(x, "server_id", value.asInstanceOf[js.Any])
      
      inline def setStart_socket_id(value: String): Self = StObject.set(x, "start_socket_id", value.asInstanceOf[js.Any])
    }
  }
}
