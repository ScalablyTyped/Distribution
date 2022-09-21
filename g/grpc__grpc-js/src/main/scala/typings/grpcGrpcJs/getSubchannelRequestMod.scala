package typings.grpcGrpcJs

import typings.grpcProtoLoader.mod.Long
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getSubchannelRequestMod {
  
  trait GetSubchannelRequest extends StObject {
    
    /**
      * subchannel_id is the identifier of the specific subchannel to get.
      */
    var subchannel_id: js.UndefOr[Double | String | Long] = js.undefined
  }
  object GetSubchannelRequest {
    
    inline def apply(): GetSubchannelRequest = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GetSubchannelRequest]
    }
    
    extension [Self <: GetSubchannelRequest](x: Self) {
      
      inline def setSubchannel_id(value: Double | String | Long): Self = StObject.set(x, "subchannel_id", value.asInstanceOf[js.Any])
      
      inline def setSubchannel_idUndefined: Self = StObject.set(x, "subchannel_id", js.undefined)
    }
  }
  
  trait GetSubchannelRequestOutput extends StObject {
    
    /**
      * subchannel_id is the identifier of the specific subchannel to get.
      */
    var subchannel_id: String
  }
  object GetSubchannelRequestOutput {
    
    inline def apply(subchannel_id: String): GetSubchannelRequestOutput = {
      val __obj = js.Dynamic.literal(subchannel_id = subchannel_id.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetSubchannelRequestOutput]
    }
    
    extension [Self <: GetSubchannelRequestOutput](x: Self) {
      
      inline def setSubchannel_id(value: String): Self = StObject.set(x, "subchannel_id", value.asInstanceOf[js.Any])
    }
  }
}
