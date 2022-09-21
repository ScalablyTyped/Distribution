package typings.grpcGrpcJs

import typings.grpcGrpcJs.channelTraceEventMod.ChannelTraceEvent
import typings.grpcGrpcJs.channelTraceEventMod.ChannelTraceEventOutput
import typings.grpcGrpcJs.timestampMod.Timestamp
import typings.grpcGrpcJs.timestampMod.TimestampOutput
import typings.grpcProtoLoader.mod.Long
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object channelTraceMod {
  
  trait ChannelTrace extends StObject {
    
    /**
      * Time that this channel was created.
      */
    var creation_timestamp: js.UndefOr[Timestamp | Null] = js.undefined
    
    /**
      * List of events that have occurred on this channel.
      */
    var events: js.UndefOr[js.Array[ChannelTraceEvent]] = js.undefined
    
    /**
      * Number of events ever logged in this tracing object. This can differ from
      * events.size() because events can be overwritten or garbage collected by
      * implementations.
      */
    var num_events_logged: js.UndefOr[Double | String | Long] = js.undefined
  }
  object ChannelTrace {
    
    inline def apply(): ChannelTrace = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ChannelTrace]
    }
    
    extension [Self <: ChannelTrace](x: Self) {
      
      inline def setCreation_timestamp(value: Timestamp): Self = StObject.set(x, "creation_timestamp", value.asInstanceOf[js.Any])
      
      inline def setCreation_timestampNull: Self = StObject.set(x, "creation_timestamp", null)
      
      inline def setCreation_timestampUndefined: Self = StObject.set(x, "creation_timestamp", js.undefined)
      
      inline def setEvents(value: js.Array[ChannelTraceEvent]): Self = StObject.set(x, "events", value.asInstanceOf[js.Any])
      
      inline def setEventsUndefined: Self = StObject.set(x, "events", js.undefined)
      
      inline def setEventsVarargs(value: ChannelTraceEvent*): Self = StObject.set(x, "events", js.Array(value*))
      
      inline def setNum_events_logged(value: Double | String | Long): Self = StObject.set(x, "num_events_logged", value.asInstanceOf[js.Any])
      
      inline def setNum_events_loggedUndefined: Self = StObject.set(x, "num_events_logged", js.undefined)
    }
  }
  
  trait ChannelTraceOutput extends StObject {
    
    /**
      * Time that this channel was created.
      */
    var creation_timestamp: TimestampOutput | Null
    
    /**
      * List of events that have occurred on this channel.
      */
    var events: js.Array[ChannelTraceEventOutput]
    
    /**
      * Number of events ever logged in this tracing object. This can differ from
      * events.size() because events can be overwritten or garbage collected by
      * implementations.
      */
    var num_events_logged: String
  }
  object ChannelTraceOutput {
    
    inline def apply(events: js.Array[ChannelTraceEventOutput], num_events_logged: String): ChannelTraceOutput = {
      val __obj = js.Dynamic.literal(events = events.asInstanceOf[js.Any], num_events_logged = num_events_logged.asInstanceOf[js.Any], creation_timestamp = null)
      __obj.asInstanceOf[ChannelTraceOutput]
    }
    
    extension [Self <: ChannelTraceOutput](x: Self) {
      
      inline def setCreation_timestamp(value: TimestampOutput): Self = StObject.set(x, "creation_timestamp", value.asInstanceOf[js.Any])
      
      inline def setCreation_timestampNull: Self = StObject.set(x, "creation_timestamp", null)
      
      inline def setEvents(value: js.Array[ChannelTraceEventOutput]): Self = StObject.set(x, "events", value.asInstanceOf[js.Any])
      
      inline def setEventsVarargs(value: ChannelTraceEventOutput*): Self = StObject.set(x, "events", js.Array(value*))
      
      inline def setNum_events_logged(value: String): Self = StObject.set(x, "num_events_logged", value.asInstanceOf[js.Any])
    }
  }
}
