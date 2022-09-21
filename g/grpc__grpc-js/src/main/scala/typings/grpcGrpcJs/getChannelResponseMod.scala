package typings.grpcGrpcJs

import typings.grpcGrpcJs.v1ChannelMod.Channel
import typings.grpcGrpcJs.v1ChannelMod.ChannelOutput
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getChannelResponseMod {
  
  trait GetChannelResponse extends StObject {
    
    /**
      * The Channel that corresponds to the requested channel_id.  This field
      * should be set.
      */
    var channel: js.UndefOr[Channel | Null] = js.undefined
  }
  object GetChannelResponse {
    
    inline def apply(): GetChannelResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GetChannelResponse]
    }
    
    extension [Self <: GetChannelResponse](x: Self) {
      
      inline def setChannel(value: Channel): Self = StObject.set(x, "channel", value.asInstanceOf[js.Any])
      
      inline def setChannelNull: Self = StObject.set(x, "channel", null)
      
      inline def setChannelUndefined: Self = StObject.set(x, "channel", js.undefined)
    }
  }
  
  trait GetChannelResponseOutput extends StObject {
    
    /**
      * The Channel that corresponds to the requested channel_id.  This field
      * should be set.
      */
    var channel: ChannelOutput | Null
  }
  object GetChannelResponseOutput {
    
    inline def apply(): GetChannelResponseOutput = {
      val __obj = js.Dynamic.literal(channel = null)
      __obj.asInstanceOf[GetChannelResponseOutput]
    }
    
    extension [Self <: GetChannelResponseOutput](x: Self) {
      
      inline def setChannel(value: ChannelOutput): Self = StObject.set(x, "channel", value.asInstanceOf[js.Any])
      
      inline def setChannelNull: Self = StObject.set(x, "channel", null)
    }
  }
}
