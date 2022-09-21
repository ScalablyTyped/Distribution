package typings.grpcGrpcJs

import typings.grpcGrpcJs.int64ValueMod.Int64Value
import typings.grpcGrpcJs.int64ValueMod.Int64ValueOutput
import typings.grpcGrpcJs.socketOptionMod.SocketOption
import typings.grpcGrpcJs.socketOptionMod.SocketOptionOutput
import typings.grpcGrpcJs.timestampMod.Timestamp
import typings.grpcGrpcJs.timestampMod.TimestampOutput
import typings.grpcProtoLoader.mod.Long
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object socketDataMod {
  
  trait SocketData extends StObject {
    
    /**
      * The number of keep alives sent.  This is typically implemented with HTTP/2
      * ping messages.
      */
    var keep_alives_sent: js.UndefOr[Double | String | Long] = js.undefined
    
    /**
      * The last time a stream was created by this endpoint.  Usually unset for
      * servers.
      */
    var last_local_stream_created_timestamp: js.UndefOr[Timestamp | Null] = js.undefined
    
    /**
      * The last time a message was received by this endpoint.
      */
    var last_message_received_timestamp: js.UndefOr[Timestamp | Null] = js.undefined
    
    /**
      * The last time a message was sent by this endpoint.
      */
    var last_message_sent_timestamp: js.UndefOr[Timestamp | Null] = js.undefined
    
    /**
      * The last time a stream was created by the remote endpoint.  Usually unset
      * for clients.
      */
    var last_remote_stream_created_timestamp: js.UndefOr[Timestamp | Null] = js.undefined
    
    /**
      * The amount of window, granted to the local endpoint by the remote endpoint.
      * This may be slightly out of date due to network latency.  This does NOT
      * include stream level or TCP level flow control info.
      */
    var local_flow_control_window: js.UndefOr[Int64Value | Null] = js.undefined
    
    /**
      * The number of grpc messages received on this socket.
      */
    var messages_received: js.UndefOr[Double | String | Long] = js.undefined
    
    /**
      * The number of grpc messages successfully sent on this socket.
      */
    var messages_sent: js.UndefOr[Double | String | Long] = js.undefined
    
    /**
      * Socket options set on this socket.  May be absent if 'summary' is set
      * on GetSocketRequest.
      */
    var option: js.UndefOr[js.Array[SocketOption]] = js.undefined
    
    /**
      * The amount of window, granted to the remote endpoint by the local endpoint.
      * This may be slightly out of date due to network latency.  This does NOT
      * include stream level or TCP level flow control info.
      */
    var remote_flow_control_window: js.UndefOr[Int64Value | Null] = js.undefined
    
    /**
      * The number of streams that have ended unsuccessfully:
      * On client side, ended without receiving frame with eos bit set;
      * On server side, ended without sending frame with eos bit set.
      */
    var streams_failed: js.UndefOr[Double | String | Long] = js.undefined
    
    /**
      * The number of streams that have been started.
      */
    var streams_started: js.UndefOr[Double | String | Long] = js.undefined
    
    /**
      * The number of streams that have ended successfully:
      * On client side, received frame with eos bit set;
      * On server side, sent frame with eos bit set.
      */
    var streams_succeeded: js.UndefOr[Double | String | Long] = js.undefined
  }
  object SocketData {
    
    inline def apply(): SocketData = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SocketData]
    }
    
    extension [Self <: SocketData](x: Self) {
      
      inline def setKeep_alives_sent(value: Double | String | Long): Self = StObject.set(x, "keep_alives_sent", value.asInstanceOf[js.Any])
      
      inline def setKeep_alives_sentUndefined: Self = StObject.set(x, "keep_alives_sent", js.undefined)
      
      inline def setLast_local_stream_created_timestamp(value: Timestamp): Self = StObject.set(x, "last_local_stream_created_timestamp", value.asInstanceOf[js.Any])
      
      inline def setLast_local_stream_created_timestampNull: Self = StObject.set(x, "last_local_stream_created_timestamp", null)
      
      inline def setLast_local_stream_created_timestampUndefined: Self = StObject.set(x, "last_local_stream_created_timestamp", js.undefined)
      
      inline def setLast_message_received_timestamp(value: Timestamp): Self = StObject.set(x, "last_message_received_timestamp", value.asInstanceOf[js.Any])
      
      inline def setLast_message_received_timestampNull: Self = StObject.set(x, "last_message_received_timestamp", null)
      
      inline def setLast_message_received_timestampUndefined: Self = StObject.set(x, "last_message_received_timestamp", js.undefined)
      
      inline def setLast_message_sent_timestamp(value: Timestamp): Self = StObject.set(x, "last_message_sent_timestamp", value.asInstanceOf[js.Any])
      
      inline def setLast_message_sent_timestampNull: Self = StObject.set(x, "last_message_sent_timestamp", null)
      
      inline def setLast_message_sent_timestampUndefined: Self = StObject.set(x, "last_message_sent_timestamp", js.undefined)
      
      inline def setLast_remote_stream_created_timestamp(value: Timestamp): Self = StObject.set(x, "last_remote_stream_created_timestamp", value.asInstanceOf[js.Any])
      
      inline def setLast_remote_stream_created_timestampNull: Self = StObject.set(x, "last_remote_stream_created_timestamp", null)
      
      inline def setLast_remote_stream_created_timestampUndefined: Self = StObject.set(x, "last_remote_stream_created_timestamp", js.undefined)
      
      inline def setLocal_flow_control_window(value: Int64Value): Self = StObject.set(x, "local_flow_control_window", value.asInstanceOf[js.Any])
      
      inline def setLocal_flow_control_windowNull: Self = StObject.set(x, "local_flow_control_window", null)
      
      inline def setLocal_flow_control_windowUndefined: Self = StObject.set(x, "local_flow_control_window", js.undefined)
      
      inline def setMessages_received(value: Double | String | Long): Self = StObject.set(x, "messages_received", value.asInstanceOf[js.Any])
      
      inline def setMessages_receivedUndefined: Self = StObject.set(x, "messages_received", js.undefined)
      
      inline def setMessages_sent(value: Double | String | Long): Self = StObject.set(x, "messages_sent", value.asInstanceOf[js.Any])
      
      inline def setMessages_sentUndefined: Self = StObject.set(x, "messages_sent", js.undefined)
      
      inline def setOption(value: js.Array[SocketOption]): Self = StObject.set(x, "option", value.asInstanceOf[js.Any])
      
      inline def setOptionUndefined: Self = StObject.set(x, "option", js.undefined)
      
      inline def setOptionVarargs(value: SocketOption*): Self = StObject.set(x, "option", js.Array(value*))
      
      inline def setRemote_flow_control_window(value: Int64Value): Self = StObject.set(x, "remote_flow_control_window", value.asInstanceOf[js.Any])
      
      inline def setRemote_flow_control_windowNull: Self = StObject.set(x, "remote_flow_control_window", null)
      
      inline def setRemote_flow_control_windowUndefined: Self = StObject.set(x, "remote_flow_control_window", js.undefined)
      
      inline def setStreams_failed(value: Double | String | Long): Self = StObject.set(x, "streams_failed", value.asInstanceOf[js.Any])
      
      inline def setStreams_failedUndefined: Self = StObject.set(x, "streams_failed", js.undefined)
      
      inline def setStreams_started(value: Double | String | Long): Self = StObject.set(x, "streams_started", value.asInstanceOf[js.Any])
      
      inline def setStreams_startedUndefined: Self = StObject.set(x, "streams_started", js.undefined)
      
      inline def setStreams_succeeded(value: Double | String | Long): Self = StObject.set(x, "streams_succeeded", value.asInstanceOf[js.Any])
      
      inline def setStreams_succeededUndefined: Self = StObject.set(x, "streams_succeeded", js.undefined)
    }
  }
  
  trait SocketDataOutput extends StObject {
    
    /**
      * The number of keep alives sent.  This is typically implemented with HTTP/2
      * ping messages.
      */
    var keep_alives_sent: String
    
    /**
      * The last time a stream was created by this endpoint.  Usually unset for
      * servers.
      */
    var last_local_stream_created_timestamp: TimestampOutput | Null
    
    /**
      * The last time a message was received by this endpoint.
      */
    var last_message_received_timestamp: TimestampOutput | Null
    
    /**
      * The last time a message was sent by this endpoint.
      */
    var last_message_sent_timestamp: TimestampOutput | Null
    
    /**
      * The last time a stream was created by the remote endpoint.  Usually unset
      * for clients.
      */
    var last_remote_stream_created_timestamp: TimestampOutput | Null
    
    /**
      * The amount of window, granted to the local endpoint by the remote endpoint.
      * This may be slightly out of date due to network latency.  This does NOT
      * include stream level or TCP level flow control info.
      */
    var local_flow_control_window: Int64ValueOutput | Null
    
    /**
      * The number of grpc messages received on this socket.
      */
    var messages_received: String
    
    /**
      * The number of grpc messages successfully sent on this socket.
      */
    var messages_sent: String
    
    /**
      * Socket options set on this socket.  May be absent if 'summary' is set
      * on GetSocketRequest.
      */
    var option: js.Array[SocketOptionOutput]
    
    /**
      * The amount of window, granted to the remote endpoint by the local endpoint.
      * This may be slightly out of date due to network latency.  This does NOT
      * include stream level or TCP level flow control info.
      */
    var remote_flow_control_window: Int64ValueOutput | Null
    
    /**
      * The number of streams that have ended unsuccessfully:
      * On client side, ended without receiving frame with eos bit set;
      * On server side, ended without sending frame with eos bit set.
      */
    var streams_failed: String
    
    /**
      * The number of streams that have been started.
      */
    var streams_started: String
    
    /**
      * The number of streams that have ended successfully:
      * On client side, received frame with eos bit set;
      * On server side, sent frame with eos bit set.
      */
    var streams_succeeded: String
  }
  object SocketDataOutput {
    
    inline def apply(
      keep_alives_sent: String,
      messages_received: String,
      messages_sent: String,
      option: js.Array[SocketOptionOutput],
      streams_failed: String,
      streams_started: String,
      streams_succeeded: String
    ): SocketDataOutput = {
      val __obj = js.Dynamic.literal(keep_alives_sent = keep_alives_sent.asInstanceOf[js.Any], messages_received = messages_received.asInstanceOf[js.Any], messages_sent = messages_sent.asInstanceOf[js.Any], option = option.asInstanceOf[js.Any], streams_failed = streams_failed.asInstanceOf[js.Any], streams_started = streams_started.asInstanceOf[js.Any], streams_succeeded = streams_succeeded.asInstanceOf[js.Any], last_local_stream_created_timestamp = null, last_message_received_timestamp = null, last_message_sent_timestamp = null, last_remote_stream_created_timestamp = null, local_flow_control_window = null, remote_flow_control_window = null)
      __obj.asInstanceOf[SocketDataOutput]
    }
    
    extension [Self <: SocketDataOutput](x: Self) {
      
      inline def setKeep_alives_sent(value: String): Self = StObject.set(x, "keep_alives_sent", value.asInstanceOf[js.Any])
      
      inline def setLast_local_stream_created_timestamp(value: TimestampOutput): Self = StObject.set(x, "last_local_stream_created_timestamp", value.asInstanceOf[js.Any])
      
      inline def setLast_local_stream_created_timestampNull: Self = StObject.set(x, "last_local_stream_created_timestamp", null)
      
      inline def setLast_message_received_timestamp(value: TimestampOutput): Self = StObject.set(x, "last_message_received_timestamp", value.asInstanceOf[js.Any])
      
      inline def setLast_message_received_timestampNull: Self = StObject.set(x, "last_message_received_timestamp", null)
      
      inline def setLast_message_sent_timestamp(value: TimestampOutput): Self = StObject.set(x, "last_message_sent_timestamp", value.asInstanceOf[js.Any])
      
      inline def setLast_message_sent_timestampNull: Self = StObject.set(x, "last_message_sent_timestamp", null)
      
      inline def setLast_remote_stream_created_timestamp(value: TimestampOutput): Self = StObject.set(x, "last_remote_stream_created_timestamp", value.asInstanceOf[js.Any])
      
      inline def setLast_remote_stream_created_timestampNull: Self = StObject.set(x, "last_remote_stream_created_timestamp", null)
      
      inline def setLocal_flow_control_window(value: Int64ValueOutput): Self = StObject.set(x, "local_flow_control_window", value.asInstanceOf[js.Any])
      
      inline def setLocal_flow_control_windowNull: Self = StObject.set(x, "local_flow_control_window", null)
      
      inline def setMessages_received(value: String): Self = StObject.set(x, "messages_received", value.asInstanceOf[js.Any])
      
      inline def setMessages_sent(value: String): Self = StObject.set(x, "messages_sent", value.asInstanceOf[js.Any])
      
      inline def setOption(value: js.Array[SocketOptionOutput]): Self = StObject.set(x, "option", value.asInstanceOf[js.Any])
      
      inline def setOptionVarargs(value: SocketOptionOutput*): Self = StObject.set(x, "option", js.Array(value*))
      
      inline def setRemote_flow_control_window(value: Int64ValueOutput): Self = StObject.set(x, "remote_flow_control_window", value.asInstanceOf[js.Any])
      
      inline def setRemote_flow_control_windowNull: Self = StObject.set(x, "remote_flow_control_window", null)
      
      inline def setStreams_failed(value: String): Self = StObject.set(x, "streams_failed", value.asInstanceOf[js.Any])
      
      inline def setStreams_started(value: String): Self = StObject.set(x, "streams_started", value.asInstanceOf[js.Any])
      
      inline def setStreams_succeeded(value: String): Self = StObject.set(x, "streams_succeeded", value.asInstanceOf[js.Any])
    }
  }
}
