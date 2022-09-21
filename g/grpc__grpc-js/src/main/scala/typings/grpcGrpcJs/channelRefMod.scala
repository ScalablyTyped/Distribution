package typings.grpcGrpcJs

import typings.grpcProtoLoader.mod.Long
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object channelRefMod {
  
  trait ChannelRef extends StObject {
    
    /**
      * The globally unique id for this channel.  Must be a positive number.
      */
    var channel_id: js.UndefOr[Double | String | Long] = js.undefined
    
    /**
      * An optional name associated with the channel.
      */
    var name: js.UndefOr[String] = js.undefined
  }
  object ChannelRef {
    
    inline def apply(): ChannelRef = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ChannelRef]
    }
    
    extension [Self <: ChannelRef](x: Self) {
      
      inline def setChannel_id(value: Double | String | Long): Self = StObject.set(x, "channel_id", value.asInstanceOf[js.Any])
      
      inline def setChannel_idUndefined: Self = StObject.set(x, "channel_id", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    }
  }
  
  trait ChannelRefOutput extends StObject {
    
    /**
      * The globally unique id for this channel.  Must be a positive number.
      */
    var channel_id: String
    
    /**
      * An optional name associated with the channel.
      */
    var name: String
  }
  object ChannelRefOutput {
    
    inline def apply(channel_id: String, name: String): ChannelRefOutput = {
      val __obj = js.Dynamic.literal(channel_id = channel_id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[ChannelRefOutput]
    }
    
    extension [Self <: ChannelRefOutput](x: Self) {
      
      inline def setChannel_id(value: String): Self = StObject.set(x, "channel_id", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
}
