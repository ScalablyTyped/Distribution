package typings.grpcGrpcJs

import typings.grpcGrpcJs.channelTraceMod.ChannelTrace
import typings.grpcGrpcJs.channelTraceMod.ChannelTraceOutput
import typings.grpcGrpcJs.timestampMod.Timestamp
import typings.grpcGrpcJs.timestampMod.TimestampOutput
import typings.grpcProtoLoader.mod.Long
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object serverDataMod {
  
  trait ServerData extends StObject {
    
    /**
      * The number of incoming calls that have a completed with a non-OK status
      */
    var calls_failed: js.UndefOr[Double | String | Long] = js.undefined
    
    /**
      * The number of incoming calls started on the server
      */
    var calls_started: js.UndefOr[Double | String | Long] = js.undefined
    
    /**
      * The number of incoming calls that have completed with an OK status
      */
    var calls_succeeded: js.UndefOr[Double | String | Long] = js.undefined
    
    /**
      * The last time a call was started on the server.
      */
    var last_call_started_timestamp: js.UndefOr[Timestamp | Null] = js.undefined
    
    /**
      * A trace of recent events on the server.  May be absent.
      */
    var trace: js.UndefOr[ChannelTrace | Null] = js.undefined
  }
  object ServerData {
    
    inline def apply(): ServerData = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ServerData]
    }
    
    extension [Self <: ServerData](x: Self) {
      
      inline def setCalls_failed(value: Double | String | Long): Self = StObject.set(x, "calls_failed", value.asInstanceOf[js.Any])
      
      inline def setCalls_failedUndefined: Self = StObject.set(x, "calls_failed", js.undefined)
      
      inline def setCalls_started(value: Double | String | Long): Self = StObject.set(x, "calls_started", value.asInstanceOf[js.Any])
      
      inline def setCalls_startedUndefined: Self = StObject.set(x, "calls_started", js.undefined)
      
      inline def setCalls_succeeded(value: Double | String | Long): Self = StObject.set(x, "calls_succeeded", value.asInstanceOf[js.Any])
      
      inline def setCalls_succeededUndefined: Self = StObject.set(x, "calls_succeeded", js.undefined)
      
      inline def setLast_call_started_timestamp(value: Timestamp): Self = StObject.set(x, "last_call_started_timestamp", value.asInstanceOf[js.Any])
      
      inline def setLast_call_started_timestampNull: Self = StObject.set(x, "last_call_started_timestamp", null)
      
      inline def setLast_call_started_timestampUndefined: Self = StObject.set(x, "last_call_started_timestamp", js.undefined)
      
      inline def setTrace(value: ChannelTrace): Self = StObject.set(x, "trace", value.asInstanceOf[js.Any])
      
      inline def setTraceNull: Self = StObject.set(x, "trace", null)
      
      inline def setTraceUndefined: Self = StObject.set(x, "trace", js.undefined)
    }
  }
  
  trait ServerDataOutput extends StObject {
    
    /**
      * The number of incoming calls that have a completed with a non-OK status
      */
    var calls_failed: String
    
    /**
      * The number of incoming calls started on the server
      */
    var calls_started: String
    
    /**
      * The number of incoming calls that have completed with an OK status
      */
    var calls_succeeded: String
    
    /**
      * The last time a call was started on the server.
      */
    var last_call_started_timestamp: TimestampOutput | Null
    
    /**
      * A trace of recent events on the server.  May be absent.
      */
    var trace: ChannelTraceOutput | Null
  }
  object ServerDataOutput {
    
    inline def apply(calls_failed: String, calls_started: String, calls_succeeded: String): ServerDataOutput = {
      val __obj = js.Dynamic.literal(calls_failed = calls_failed.asInstanceOf[js.Any], calls_started = calls_started.asInstanceOf[js.Any], calls_succeeded = calls_succeeded.asInstanceOf[js.Any], last_call_started_timestamp = null, trace = null)
      __obj.asInstanceOf[ServerDataOutput]
    }
    
    extension [Self <: ServerDataOutput](x: Self) {
      
      inline def setCalls_failed(value: String): Self = StObject.set(x, "calls_failed", value.asInstanceOf[js.Any])
      
      inline def setCalls_started(value: String): Self = StObject.set(x, "calls_started", value.asInstanceOf[js.Any])
      
      inline def setCalls_succeeded(value: String): Self = StObject.set(x, "calls_succeeded", value.asInstanceOf[js.Any])
      
      inline def setLast_call_started_timestamp(value: TimestampOutput): Self = StObject.set(x, "last_call_started_timestamp", value.asInstanceOf[js.Any])
      
      inline def setLast_call_started_timestampNull: Self = StObject.set(x, "last_call_started_timestamp", null)
      
      inline def setTrace(value: ChannelTraceOutput): Self = StObject.set(x, "trace", value.asInstanceOf[js.Any])
      
      inline def setTraceNull: Self = StObject.set(x, "trace", null)
    }
  }
}
