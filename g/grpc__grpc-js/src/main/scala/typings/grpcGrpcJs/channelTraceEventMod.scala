package typings.grpcGrpcJs

import typings.grpcGrpcJs.channelRefMod.ChannelRef
import typings.grpcGrpcJs.channelRefMod.ChannelRefOutput
import typings.grpcGrpcJs.grpcGrpcJsStrings.channel_ref
import typings.grpcGrpcJs.grpcGrpcJsStrings.subchannel_ref
import typings.grpcGrpcJs.subchannelRefMod.SubchannelRef
import typings.grpcGrpcJs.subchannelRefMod.SubchannelRefOutput
import typings.grpcGrpcJs.timestampMod.Timestamp
import typings.grpcGrpcJs.timestampMod.TimestampOutput
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object channelTraceEventMod {
  
  @js.native
  sealed trait grpcChannelzV1ChannelTraceEventSeverity extends StObject
  @JSImport("@grpc/grpc-js/build/src/generated/grpc/channelz/v1/ChannelTraceEvent", "_grpc_channelz_v1_ChannelTraceEvent_Severity")
  @js.native
  object grpcChannelzV1ChannelTraceEventSeverity extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[grpcChannelzV1ChannelTraceEventSeverity & Double] = js.native
    
    @js.native
    sealed trait CT_ERROR
      extends StObject
         with grpcChannelzV1ChannelTraceEventSeverity
    /* 3 */ val CT_ERROR: typings.grpcGrpcJs.channelTraceEventMod.grpcChannelzV1ChannelTraceEventSeverity.CT_ERROR & Double = js.native
    
    @js.native
    sealed trait CT_INFO
      extends StObject
         with grpcChannelzV1ChannelTraceEventSeverity
    /* 1 */ val CT_INFO: typings.grpcGrpcJs.channelTraceEventMod.grpcChannelzV1ChannelTraceEventSeverity.CT_INFO & Double = js.native
    
    @js.native
    sealed trait CT_UNKNOWN
      extends StObject
         with grpcChannelzV1ChannelTraceEventSeverity
    /* 0 */ val CT_UNKNOWN: typings.grpcGrpcJs.channelTraceEventMod.grpcChannelzV1ChannelTraceEventSeverity.CT_UNKNOWN & Double = js.native
    
    @js.native
    sealed trait CT_WARNING
      extends StObject
         with grpcChannelzV1ChannelTraceEventSeverity
    /* 2 */ val CT_WARNING: typings.grpcGrpcJs.channelTraceEventMod.grpcChannelzV1ChannelTraceEventSeverity.CT_WARNING & Double = js.native
  }
  
  trait ChannelTraceEvent extends StObject {
    
    var channel_ref: js.UndefOr[ChannelRef | Null] = js.undefined
    
    /**
      * ref of referenced channel or subchannel.
      * Optional, only present if this event refers to a child object. For example,
      * this field would be filled if this trace event was for a subchannel being
      * created.
      */
    var child_ref: js.UndefOr[channel_ref | subchannel_ref] = js.undefined
    
    /**
      * High level description of the event.
      */
    var description: js.UndefOr[String] = js.undefined
    
    /**
      * the severity of the trace event
      */
    var severity: js.UndefOr[
        grpcChannelzV1ChannelTraceEventSeverity | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof _grpc_channelz_v1_ChannelTraceEvent_Severity * / any */ String)
      ] = js.undefined
    
    var subchannel_ref: js.UndefOr[SubchannelRef | Null] = js.undefined
    
    /**
      * When this event occurred.
      */
    var timestamp: js.UndefOr[Timestamp | Null] = js.undefined
  }
  object ChannelTraceEvent {
    
    inline def apply(): ChannelTraceEvent = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ChannelTraceEvent]
    }
    
    extension [Self <: ChannelTraceEvent](x: Self) {
      
      inline def setChannel_ref(value: ChannelRef): Self = StObject.set(x, "channel_ref", value.asInstanceOf[js.Any])
      
      inline def setChannel_refNull: Self = StObject.set(x, "channel_ref", null)
      
      inline def setChannel_refUndefined: Self = StObject.set(x, "channel_ref", js.undefined)
      
      inline def setChild_ref(value: channel_ref | subchannel_ref): Self = StObject.set(x, "child_ref", value.asInstanceOf[js.Any])
      
      inline def setChild_refUndefined: Self = StObject.set(x, "child_ref", js.undefined)
      
      inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      inline def setSeverity(
        value: grpcChannelzV1ChannelTraceEventSeverity | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof _grpc_channelz_v1_ChannelTraceEvent_Severity * / any */ String)
      ): Self = StObject.set(x, "severity", value.asInstanceOf[js.Any])
      
      inline def setSeverityUndefined: Self = StObject.set(x, "severity", js.undefined)
      
      inline def setSubchannel_ref(value: SubchannelRef): Self = StObject.set(x, "subchannel_ref", value.asInstanceOf[js.Any])
      
      inline def setSubchannel_refNull: Self = StObject.set(x, "subchannel_ref", null)
      
      inline def setSubchannel_refUndefined: Self = StObject.set(x, "subchannel_ref", js.undefined)
      
      inline def setTimestamp(value: Timestamp): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
      
      inline def setTimestampNull: Self = StObject.set(x, "timestamp", null)
      
      inline def setTimestampUndefined: Self = StObject.set(x, "timestamp", js.undefined)
    }
  }
  
  trait ChannelTraceEventOutput extends StObject {
    
    var channel_ref: js.UndefOr[ChannelRefOutput | Null] = js.undefined
    
    /**
      * ref of referenced channel or subchannel.
      * Optional, only present if this event refers to a child object. For example,
      * this field would be filled if this trace event was for a subchannel being
      * created.
      */
    var child_ref: channel_ref | subchannel_ref
    
    /**
      * High level description of the event.
      */
    var description: String
    
    /**
      * the severity of the trace event
      */
    var severity: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof _grpc_channelz_v1_ChannelTraceEvent_Severity * / any */ String
    
    var subchannel_ref: js.UndefOr[SubchannelRefOutput | Null] = js.undefined
    
    /**
      * When this event occurred.
      */
    var timestamp: TimestampOutput | Null
  }
  object ChannelTraceEventOutput {
    
    inline def apply(
      child_ref: channel_ref | subchannel_ref,
      description: String,
      severity: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof _grpc_channelz_v1_ChannelTraceEvent_Severity * / any */ String
    ): ChannelTraceEventOutput = {
      val __obj = js.Dynamic.literal(child_ref = child_ref.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], severity = severity.asInstanceOf[js.Any], timestamp = null)
      __obj.asInstanceOf[ChannelTraceEventOutput]
    }
    
    extension [Self <: ChannelTraceEventOutput](x: Self) {
      
      inline def setChannel_ref(value: ChannelRefOutput): Self = StObject.set(x, "channel_ref", value.asInstanceOf[js.Any])
      
      inline def setChannel_refNull: Self = StObject.set(x, "channel_ref", null)
      
      inline def setChannel_refUndefined: Self = StObject.set(x, "channel_ref", js.undefined)
      
      inline def setChild_ref(value: channel_ref | subchannel_ref): Self = StObject.set(x, "child_ref", value.asInstanceOf[js.Any])
      
      inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setSeverity(
        value: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof _grpc_channelz_v1_ChannelTraceEvent_Severity * / any */ String
      ): Self = StObject.set(x, "severity", value.asInstanceOf[js.Any])
      
      inline def setSubchannel_ref(value: SubchannelRefOutput): Self = StObject.set(x, "subchannel_ref", value.asInstanceOf[js.Any])
      
      inline def setSubchannel_refNull: Self = StObject.set(x, "subchannel_ref", null)
      
      inline def setSubchannel_refUndefined: Self = StObject.set(x, "subchannel_ref", js.undefined)
      
      inline def setTimestamp(value: TimestampOutput): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
      
      inline def setTimestampNull: Self = StObject.set(x, "timestamp", null)
    }
  }
}
