package typings.grpcGrpcJs

import typings.grpcProtoLoader.mod.Long
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getServersRequestMod {
  
  trait GetServersRequest extends StObject {
    
    /**
      * If non-zero, the server will return a page of results containing
      * at most this many items. If zero, the server will choose a
      * reasonable page size.  Must never be negative.
      */
    var max_results: js.UndefOr[Double | String | Long] = js.undefined
    
    /**
      * start_server_id indicates that only servers at or above this id should be
      * included in the results.
      * To request the first page, this must be set to 0. To request
      * subsequent pages, the client generates this value by adding 1 to
      * the highest seen result ID.
      */
    var start_server_id: js.UndefOr[Double | String | Long] = js.undefined
  }
  object GetServersRequest {
    
    inline def apply(): GetServersRequest = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GetServersRequest]
    }
    
    extension [Self <: GetServersRequest](x: Self) {
      
      inline def setMax_results(value: Double | String | Long): Self = StObject.set(x, "max_results", value.asInstanceOf[js.Any])
      
      inline def setMax_resultsUndefined: Self = StObject.set(x, "max_results", js.undefined)
      
      inline def setStart_server_id(value: Double | String | Long): Self = StObject.set(x, "start_server_id", value.asInstanceOf[js.Any])
      
      inline def setStart_server_idUndefined: Self = StObject.set(x, "start_server_id", js.undefined)
    }
  }
  
  trait GetServersRequestOutput extends StObject {
    
    /**
      * If non-zero, the server will return a page of results containing
      * at most this many items. If zero, the server will choose a
      * reasonable page size.  Must never be negative.
      */
    var max_results: String
    
    /**
      * start_server_id indicates that only servers at or above this id should be
      * included in the results.
      * To request the first page, this must be set to 0. To request
      * subsequent pages, the client generates this value by adding 1 to
      * the highest seen result ID.
      */
    var start_server_id: String
  }
  object GetServersRequestOutput {
    
    inline def apply(max_results: String, start_server_id: String): GetServersRequestOutput = {
      val __obj = js.Dynamic.literal(max_results = max_results.asInstanceOf[js.Any], start_server_id = start_server_id.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetServersRequestOutput]
    }
    
    extension [Self <: GetServersRequestOutput](x: Self) {
      
      inline def setMax_results(value: String): Self = StObject.set(x, "max_results", value.asInstanceOf[js.Any])
      
      inline def setStart_server_id(value: String): Self = StObject.set(x, "start_server_id", value.asInstanceOf[js.Any])
    }
  }
}
