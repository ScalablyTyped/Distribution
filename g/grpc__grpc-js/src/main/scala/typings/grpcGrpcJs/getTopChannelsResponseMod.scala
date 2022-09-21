package typings.grpcGrpcJs

import typings.grpcGrpcJs.v1ChannelMod.Channel
import typings.grpcGrpcJs.v1ChannelMod.ChannelOutput
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getTopChannelsResponseMod {
  
  trait GetTopChannelsResponse extends StObject {
    
    /**
      * list of channels that the connection detail service knows about.  Sorted in
      * ascending channel_id order.
      * Must contain at least 1 result, otherwise 'end' must be true.
      */
    var channel: js.UndefOr[js.Array[Channel]] = js.undefined
    
    /**
      * If set, indicates that the list of channels is the final list.  Requesting
      * more channels can only return more if they are created after this RPC
      * completes.
      */
    var end: js.UndefOr[Boolean] = js.undefined
  }
  object GetTopChannelsResponse {
    
    inline def apply(): GetTopChannelsResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GetTopChannelsResponse]
    }
    
    extension [Self <: GetTopChannelsResponse](x: Self) {
      
      inline def setChannel(value: js.Array[Channel]): Self = StObject.set(x, "channel", value.asInstanceOf[js.Any])
      
      inline def setChannelUndefined: Self = StObject.set(x, "channel", js.undefined)
      
      inline def setChannelVarargs(value: Channel*): Self = StObject.set(x, "channel", js.Array(value*))
      
      inline def setEnd(value: Boolean): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
      
      inline def setEndUndefined: Self = StObject.set(x, "end", js.undefined)
    }
  }
  
  trait GetTopChannelsResponseOutput extends StObject {
    
    /**
      * list of channels that the connection detail service knows about.  Sorted in
      * ascending channel_id order.
      * Must contain at least 1 result, otherwise 'end' must be true.
      */
    var channel: js.Array[ChannelOutput]
    
    /**
      * If set, indicates that the list of channels is the final list.  Requesting
      * more channels can only return more if they are created after this RPC
      * completes.
      */
    var end: Boolean
  }
  object GetTopChannelsResponseOutput {
    
    inline def apply(channel: js.Array[ChannelOutput], end: Boolean): GetTopChannelsResponseOutput = {
      val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetTopChannelsResponseOutput]
    }
    
    extension [Self <: GetTopChannelsResponseOutput](x: Self) {
      
      inline def setChannel(value: js.Array[ChannelOutput]): Self = StObject.set(x, "channel", value.asInstanceOf[js.Any])
      
      inline def setChannelVarargs(value: ChannelOutput*): Self = StObject.set(x, "channel", js.Array(value*))
      
      inline def setEnd(value: Boolean): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
    }
  }
}
