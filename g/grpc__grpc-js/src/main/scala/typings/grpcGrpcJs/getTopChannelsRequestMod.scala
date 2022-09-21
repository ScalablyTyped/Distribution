package typings.grpcGrpcJs

import typings.grpcProtoLoader.mod.Long
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getTopChannelsRequestMod {
  
  trait GetTopChannelsRequest extends StObject {
    
    /**
      * If non-zero, the server will return a page of results containing
      * at most this many items. If zero, the server will choose a
      * reasonable page size.  Must never be negative.
      */
    var max_results: js.UndefOr[Double | String | Long] = js.undefined
    
    /**
      * start_channel_id indicates that only channels at or above this id should be
      * included in the results.
      * To request the first page, this should be set to 0. To request
      * subsequent pages, the client generates this value by adding 1 to
      * the highest seen result ID.
      */
    var start_channel_id: js.UndefOr[Double | String | Long] = js.undefined
  }
  object GetTopChannelsRequest {
    
    inline def apply(): GetTopChannelsRequest = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GetTopChannelsRequest]
    }
    
    extension [Self <: GetTopChannelsRequest](x: Self) {
      
      inline def setMax_results(value: Double | String | Long): Self = StObject.set(x, "max_results", value.asInstanceOf[js.Any])
      
      inline def setMax_resultsUndefined: Self = StObject.set(x, "max_results", js.undefined)
      
      inline def setStart_channel_id(value: Double | String | Long): Self = StObject.set(x, "start_channel_id", value.asInstanceOf[js.Any])
      
      inline def setStart_channel_idUndefined: Self = StObject.set(x, "start_channel_id", js.undefined)
    }
  }
  
  trait GetTopChannelsRequestOutput extends StObject {
    
    /**
      * If non-zero, the server will return a page of results containing
      * at most this many items. If zero, the server will choose a
      * reasonable page size.  Must never be negative.
      */
    var max_results: String
    
    /**
      * start_channel_id indicates that only channels at or above this id should be
      * included in the results.
      * To request the first page, this should be set to 0. To request
      * subsequent pages, the client generates this value by adding 1 to
      * the highest seen result ID.
      */
    var start_channel_id: String
  }
  object GetTopChannelsRequestOutput {
    
    inline def apply(max_results: String, start_channel_id: String): GetTopChannelsRequestOutput = {
      val __obj = js.Dynamic.literal(max_results = max_results.asInstanceOf[js.Any], start_channel_id = start_channel_id.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetTopChannelsRequestOutput]
    }
    
    extension [Self <: GetTopChannelsRequestOutput](x: Self) {
      
      inline def setMax_results(value: String): Self = StObject.set(x, "max_results", value.asInstanceOf[js.Any])
      
      inline def setStart_channel_id(value: String): Self = StObject.set(x, "start_channel_id", value.asInstanceOf[js.Any])
    }
  }
}
