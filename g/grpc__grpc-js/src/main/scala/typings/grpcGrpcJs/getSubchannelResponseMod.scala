package typings.grpcGrpcJs

import typings.grpcGrpcJs.subchannelMod.Subchannel
import typings.grpcGrpcJs.subchannelMod.SubchannelOutput
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getSubchannelResponseMod {
  
  trait GetSubchannelResponse extends StObject {
    
    /**
      * The Subchannel that corresponds to the requested subchannel_id.  This
      * field should be set.
      */
    var subchannel: js.UndefOr[Subchannel | Null] = js.undefined
  }
  object GetSubchannelResponse {
    
    inline def apply(): GetSubchannelResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GetSubchannelResponse]
    }
    
    extension [Self <: GetSubchannelResponse](x: Self) {
      
      inline def setSubchannel(value: Subchannel): Self = StObject.set(x, "subchannel", value.asInstanceOf[js.Any])
      
      inline def setSubchannelNull: Self = StObject.set(x, "subchannel", null)
      
      inline def setSubchannelUndefined: Self = StObject.set(x, "subchannel", js.undefined)
    }
  }
  
  trait GetSubchannelResponseOutput extends StObject {
    
    /**
      * The Subchannel that corresponds to the requested subchannel_id.  This
      * field should be set.
      */
    var subchannel: SubchannelOutput | Null
  }
  object GetSubchannelResponseOutput {
    
    inline def apply(): GetSubchannelResponseOutput = {
      val __obj = js.Dynamic.literal(subchannel = null)
      __obj.asInstanceOf[GetSubchannelResponseOutput]
    }
    
    extension [Self <: GetSubchannelResponseOutput](x: Self) {
      
      inline def setSubchannel(value: SubchannelOutput): Self = StObject.set(x, "subchannel", value.asInstanceOf[js.Any])
      
      inline def setSubchannelNull: Self = StObject.set(x, "subchannel", null)
    }
  }
}
