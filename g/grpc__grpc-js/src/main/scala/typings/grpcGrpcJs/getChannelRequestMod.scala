package typings.grpcGrpcJs

import typings.grpcProtoLoader.mod.Long
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getChannelRequestMod {
  
  trait GetChannelRequest extends StObject {
    
    /**
      * channel_id is the identifier of the specific channel to get.
      */
    var channel_id: js.UndefOr[Double | String | Long] = js.undefined
  }
  object GetChannelRequest {
    
    inline def apply(): GetChannelRequest = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GetChannelRequest]
    }
    
    extension [Self <: GetChannelRequest](x: Self) {
      
      inline def setChannel_id(value: Double | String | Long): Self = StObject.set(x, "channel_id", value.asInstanceOf[js.Any])
      
      inline def setChannel_idUndefined: Self = StObject.set(x, "channel_id", js.undefined)
    }
  }
  
  trait GetChannelRequestOutput extends StObject {
    
    /**
      * channel_id is the identifier of the specific channel to get.
      */
    var channel_id: String
  }
  object GetChannelRequestOutput {
    
    inline def apply(channel_id: String): GetChannelRequestOutput = {
      val __obj = js.Dynamic.literal(channel_id = channel_id.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetChannelRequestOutput]
    }
    
    extension [Self <: GetChannelRequestOutput](x: Self) {
      
      inline def setChannel_id(value: String): Self = StObject.set(x, "channel_id", value.asInstanceOf[js.Any])
    }
  }
}
