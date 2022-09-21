package typings.grpcGrpcJs

import typings.grpcGrpcJs.channelDataMod.ChannelData
import typings.grpcGrpcJs.channelDataMod.ChannelDataOutput
import typings.grpcGrpcJs.channelRefMod.ChannelRef
import typings.grpcGrpcJs.channelRefMod.ChannelRefOutput
import typings.grpcGrpcJs.socketRefMod.SocketRef
import typings.grpcGrpcJs.socketRefMod.SocketRefOutput
import typings.grpcGrpcJs.subchannelRefMod.SubchannelRef
import typings.grpcGrpcJs.subchannelRefMod.SubchannelRefOutput
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object v1ChannelMod {
  
  trait Channel extends StObject {
    
    /**
      * There are no ordering guarantees on the order of channel refs.
      * There may not be cycles in the ref graph.
      * A channel ref may be present in more than one channel or subchannel.
      */
    var channel_ref: js.UndefOr[js.Array[ChannelRef]] = js.undefined
    
    /**
      * Data specific to this channel.
      */
    var data: js.UndefOr[ChannelData | Null] = js.undefined
    
    /**
      * The identifier for this channel. This should bet set.
      */
    var ref: js.UndefOr[ChannelRef | Null] = js.undefined
    
    /**
      * There are no ordering guarantees on the order of sockets.
      */
    var socket_ref: js.UndefOr[js.Array[SocketRef]] = js.undefined
    
    /**
      * At most one of 'channel_ref+subchannel_ref' and 'socket' is set.
      * There are no ordering guarantees on the order of subchannel refs.
      * There may not be cycles in the ref graph.
      * A sub channel ref may be present in more than one channel or subchannel.
      */
    var subchannel_ref: js.UndefOr[js.Array[SubchannelRef]] = js.undefined
  }
  object Channel {
    
    inline def apply(): Channel = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Channel]
    }
    
    extension [Self <: Channel](x: Self) {
      
      inline def setChannel_ref(value: js.Array[ChannelRef]): Self = StObject.set(x, "channel_ref", value.asInstanceOf[js.Any])
      
      inline def setChannel_refUndefined: Self = StObject.set(x, "channel_ref", js.undefined)
      
      inline def setChannel_refVarargs(value: ChannelRef*): Self = StObject.set(x, "channel_ref", js.Array(value*))
      
      inline def setData(value: ChannelData): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataNull: Self = StObject.set(x, "data", null)
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      inline def setRef(value: ChannelRef): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
      
      inline def setRefNull: Self = StObject.set(x, "ref", null)
      
      inline def setRefUndefined: Self = StObject.set(x, "ref", js.undefined)
      
      inline def setSocket_ref(value: js.Array[SocketRef]): Self = StObject.set(x, "socket_ref", value.asInstanceOf[js.Any])
      
      inline def setSocket_refUndefined: Self = StObject.set(x, "socket_ref", js.undefined)
      
      inline def setSocket_refVarargs(value: SocketRef*): Self = StObject.set(x, "socket_ref", js.Array(value*))
      
      inline def setSubchannel_ref(value: js.Array[SubchannelRef]): Self = StObject.set(x, "subchannel_ref", value.asInstanceOf[js.Any])
      
      inline def setSubchannel_refUndefined: Self = StObject.set(x, "subchannel_ref", js.undefined)
      
      inline def setSubchannel_refVarargs(value: SubchannelRef*): Self = StObject.set(x, "subchannel_ref", js.Array(value*))
    }
  }
  
  trait ChannelOutput extends StObject {
    
    /**
      * There are no ordering guarantees on the order of channel refs.
      * There may not be cycles in the ref graph.
      * A channel ref may be present in more than one channel or subchannel.
      */
    var channel_ref: js.Array[ChannelRefOutput]
    
    /**
      * Data specific to this channel.
      */
    var data: ChannelDataOutput | Null
    
    /**
      * The identifier for this channel. This should bet set.
      */
    var ref: ChannelRefOutput | Null
    
    /**
      * There are no ordering guarantees on the order of sockets.
      */
    var socket_ref: js.Array[SocketRefOutput]
    
    /**
      * At most one of 'channel_ref+subchannel_ref' and 'socket' is set.
      * There are no ordering guarantees on the order of subchannel refs.
      * There may not be cycles in the ref graph.
      * A sub channel ref may be present in more than one channel or subchannel.
      */
    var subchannel_ref: js.Array[SubchannelRefOutput]
  }
  object ChannelOutput {
    
    inline def apply(
      channel_ref: js.Array[ChannelRefOutput],
      socket_ref: js.Array[SocketRefOutput],
      subchannel_ref: js.Array[SubchannelRefOutput]
    ): ChannelOutput = {
      val __obj = js.Dynamic.literal(channel_ref = channel_ref.asInstanceOf[js.Any], socket_ref = socket_ref.asInstanceOf[js.Any], subchannel_ref = subchannel_ref.asInstanceOf[js.Any], data = null, ref = null)
      __obj.asInstanceOf[ChannelOutput]
    }
    
    extension [Self <: ChannelOutput](x: Self) {
      
      inline def setChannel_ref(value: js.Array[ChannelRefOutput]): Self = StObject.set(x, "channel_ref", value.asInstanceOf[js.Any])
      
      inline def setChannel_refVarargs(value: ChannelRefOutput*): Self = StObject.set(x, "channel_ref", js.Array(value*))
      
      inline def setData(value: ChannelDataOutput): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataNull: Self = StObject.set(x, "data", null)
      
      inline def setRef(value: ChannelRefOutput): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
      
      inline def setRefNull: Self = StObject.set(x, "ref", null)
      
      inline def setSocket_ref(value: js.Array[SocketRefOutput]): Self = StObject.set(x, "socket_ref", value.asInstanceOf[js.Any])
      
      inline def setSocket_refVarargs(value: SocketRefOutput*): Self = StObject.set(x, "socket_ref", js.Array(value*))
      
      inline def setSubchannel_ref(value: js.Array[SubchannelRefOutput]): Self = StObject.set(x, "subchannel_ref", value.asInstanceOf[js.Any])
      
      inline def setSubchannel_refVarargs(value: SubchannelRefOutput*): Self = StObject.set(x, "subchannel_ref", js.Array(value*))
    }
  }
}
