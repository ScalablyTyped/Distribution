package typings.grpcGrpcJs

import typings.grpcGrpcJs.channelConnectivityStateMod.ChannelConnectivityState
import typings.grpcGrpcJs.channelConnectivityStateMod.ChannelConnectivityStateOutput
import typings.grpcGrpcJs.channelTraceMod.ChannelTrace
import typings.grpcGrpcJs.channelTraceMod.ChannelTraceOutput
import typings.grpcGrpcJs.timestampMod.Timestamp
import typings.grpcGrpcJs.timestampMod.TimestampOutput
import typings.grpcProtoLoader.mod.Long
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object channelDataMod {
  
  trait ChannelData extends StObject {
    
    /**
      * The number of calls that have completed with a non-OK status
      */
    var calls_failed: js.UndefOr[Double | String | Long] = js.undefined
    
    /**
      * The number of calls started on the channel
      */
    var calls_started: js.UndefOr[Double | String | Long] = js.undefined
    
    /**
      * The number of calls that have completed with an OK status
      */
    var calls_succeeded: js.UndefOr[Double | String | Long] = js.undefined
    
    /**
      * The last time a call was started on the channel.
      */
    var last_call_started_timestamp: js.UndefOr[Timestamp | Null] = js.undefined
    
    /**
      * The connectivity state of the channel or subchannel.  Implementations
      * should always set this.
      */
    var state: js.UndefOr[ChannelConnectivityState | Null] = js.undefined
    
    /**
      * The target this channel originally tried to connect to.  May be absent
      */
    var target: js.UndefOr[String] = js.undefined
    
    /**
      * A trace of recent events on the channel.  May be absent.
      */
    var trace: js.UndefOr[ChannelTrace | Null] = js.undefined
  }
  object ChannelData {
    
    inline def apply(): ChannelData = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ChannelData]
    }
    
    extension [Self <: ChannelData](x: Self) {
      
      inline def setCalls_failed(value: Double | String | Long): Self = StObject.set(x, "calls_failed", value.asInstanceOf[js.Any])
      
      inline def setCalls_failedUndefined: Self = StObject.set(x, "calls_failed", js.undefined)
      
      inline def setCalls_started(value: Double | String | Long): Self = StObject.set(x, "calls_started", value.asInstanceOf[js.Any])
      
      inline def setCalls_startedUndefined: Self = StObject.set(x, "calls_started", js.undefined)
      
      inline def setCalls_succeeded(value: Double | String | Long): Self = StObject.set(x, "calls_succeeded", value.asInstanceOf[js.Any])
      
      inline def setCalls_succeededUndefined: Self = StObject.set(x, "calls_succeeded", js.undefined)
      
      inline def setLast_call_started_timestamp(value: Timestamp): Self = StObject.set(x, "last_call_started_timestamp", value.asInstanceOf[js.Any])
      
      inline def setLast_call_started_timestampNull: Self = StObject.set(x, "last_call_started_timestamp", null)
      
      inline def setLast_call_started_timestampUndefined: Self = StObject.set(x, "last_call_started_timestamp", js.undefined)
      
      inline def setState(value: ChannelConnectivityState): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
      
      inline def setStateNull: Self = StObject.set(x, "state", null)
      
      inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
      
      inline def setTarget(value: String): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
      
      inline def setTrace(value: ChannelTrace): Self = StObject.set(x, "trace", value.asInstanceOf[js.Any])
      
      inline def setTraceNull: Self = StObject.set(x, "trace", null)
      
      inline def setTraceUndefined: Self = StObject.set(x, "trace", js.undefined)
    }
  }
  
  trait ChannelDataOutput extends StObject {
    
    /**
      * The number of calls that have completed with a non-OK status
      */
    var calls_failed: String
    
    /**
      * The number of calls started on the channel
      */
    var calls_started: String
    
    /**
      * The number of calls that have completed with an OK status
      */
    var calls_succeeded: String
    
    /**
      * The last time a call was started on the channel.
      */
    var last_call_started_timestamp: TimestampOutput | Null
    
    /**
      * The connectivity state of the channel or subchannel.  Implementations
      * should always set this.
      */
    var state: ChannelConnectivityStateOutput | Null
    
    /**
      * The target this channel originally tried to connect to.  May be absent
      */
    var target: String
    
    /**
      * A trace of recent events on the channel.  May be absent.
      */
    var trace: ChannelTraceOutput | Null
  }
  object ChannelDataOutput {
    
    inline def apply(calls_failed: String, calls_started: String, calls_succeeded: String, target: String): ChannelDataOutput = {
      val __obj = js.Dynamic.literal(calls_failed = calls_failed.asInstanceOf[js.Any], calls_started = calls_started.asInstanceOf[js.Any], calls_succeeded = calls_succeeded.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any], last_call_started_timestamp = null, state = null, trace = null)
      __obj.asInstanceOf[ChannelDataOutput]
    }
    
    extension [Self <: ChannelDataOutput](x: Self) {
      
      inline def setCalls_failed(value: String): Self = StObject.set(x, "calls_failed", value.asInstanceOf[js.Any])
      
      inline def setCalls_started(value: String): Self = StObject.set(x, "calls_started", value.asInstanceOf[js.Any])
      
      inline def setCalls_succeeded(value: String): Self = StObject.set(x, "calls_succeeded", value.asInstanceOf[js.Any])
      
      inline def setLast_call_started_timestamp(value: TimestampOutput): Self = StObject.set(x, "last_call_started_timestamp", value.asInstanceOf[js.Any])
      
      inline def setLast_call_started_timestampNull: Self = StObject.set(x, "last_call_started_timestamp", null)
      
      inline def setState(value: ChannelConnectivityStateOutput): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
      
      inline def setStateNull: Self = StObject.set(x, "state", null)
      
      inline def setTarget(value: String): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      inline def setTrace(value: ChannelTraceOutput): Self = StObject.set(x, "trace", value.asInstanceOf[js.Any])
      
      inline def setTraceNull: Self = StObject.set(x, "trace", null)
    }
  }
}
