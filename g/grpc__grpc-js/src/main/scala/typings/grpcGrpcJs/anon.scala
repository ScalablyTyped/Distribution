package typings.grpcGrpcJs

import typings.grpcGrpcJs.callStreamMod.StatusObject
import typings.grpcGrpcJs.constantsMod.Status
import typings.grpcGrpcJs.metadataMod.Metadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait LocalityPath extends StObject {
    
    var localityPath: js.Array[String]
  }
  object LocalityPath {
    
    inline def apply(localityPath: js.Array[String]): LocalityPath = {
      val __obj = js.Dynamic.literal(localityPath = localityPath.asInstanceOf[js.Any])
      __obj.asInstanceOf[LocalityPath]
    }
    
    extension [Self <: LocalityPath](x: Self) {
      
      inline def setLocalityPath(value: js.Array[String]): Self = StObject.set(x, "localityPath", value.asInstanceOf[js.Any])
      
      inline def setLocalityPathVarargs(value: String*): Self = StObject.set(x, "localityPath", js.Array(value :_*))
    }
  }
  
  /* Inlined std.Partial<@grpc/grpc-js.@grpc/grpc-js/build/src/channel-options.ChannelOptions> */
  trait PartialChannelOptions extends StObject {
    
    @JSName("grpc.default_authority")
    var grpcDotdefault_authority: js.UndefOr[String] = js.undefined
    
    @JSName("grpc.enable_http_proxy")
    var grpcDotenable_http_proxy: js.UndefOr[Double] = js.undefined
    
    @JSName("grpc.http_connect_creds")
    var grpcDothttp_connect_creds: js.UndefOr[String] = js.undefined
    
    @JSName("grpc.http_connect_target")
    var grpcDothttp_connect_target: js.UndefOr[String] = js.undefined
    
    @JSName("grpc.initial_reconnect_backoff_ms")
    var grpcDotinitial_reconnect_backoff_ms: js.UndefOr[Double] = js.undefined
    
    @JSName("grpc.keepalive_time_ms")
    var grpcDotkeepalive_time_ms: js.UndefOr[Double] = js.undefined
    
    @JSName("grpc.keepalive_timeout_ms")
    var grpcDotkeepalive_timeout_ms: js.UndefOr[Double] = js.undefined
    
    @JSName("grpc.max_concurrent_streams")
    var grpcDotmax_concurrent_streams: js.UndefOr[Double] = js.undefined
    
    @JSName("grpc.max_receive_message_length")
    var grpcDotmax_receive_message_length: js.UndefOr[Double] = js.undefined
    
    @JSName("grpc.max_reconnect_backoff_ms")
    var grpcDotmax_reconnect_backoff_ms: js.UndefOr[Double] = js.undefined
    
    @JSName("grpc.max_send_message_length")
    var grpcDotmax_send_message_length: js.UndefOr[Double] = js.undefined
    
    @JSName("grpc.primary_user_agent")
    var grpcDotprimary_user_agent: js.UndefOr[String] = js.undefined
    
    @JSName("grpc.secondary_user_agent")
    var grpcDotsecondary_user_agent: js.UndefOr[String] = js.undefined
    
    @JSName("grpc.service_config")
    var grpcDotservice_config: js.UndefOr[String] = js.undefined
    
    @JSName("grpc.ssl_target_name_override")
    var grpcDotssl_target_name_override: js.UndefOr[String] = js.undefined
    
    @JSName("grpc.use_local_subchannel_pool")
    var grpcDotuse_local_subchannel_pool: js.UndefOr[Double] = js.undefined
  }
  object PartialChannelOptions {
    
    inline def apply(): PartialChannelOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialChannelOptions]
    }
    
    extension [Self <: PartialChannelOptions](x: Self) {
      
      inline def setGrpcDotdefault_authority(value: String): Self = StObject.set(x, "grpc.default_authority", value.asInstanceOf[js.Any])
      
      inline def setGrpcDotdefault_authorityUndefined: Self = StObject.set(x, "grpc.default_authority", js.undefined)
      
      inline def setGrpcDotenable_http_proxy(value: Double): Self = StObject.set(x, "grpc.enable_http_proxy", value.asInstanceOf[js.Any])
      
      inline def setGrpcDotenable_http_proxyUndefined: Self = StObject.set(x, "grpc.enable_http_proxy", js.undefined)
      
      inline def setGrpcDothttp_connect_creds(value: String): Self = StObject.set(x, "grpc.http_connect_creds", value.asInstanceOf[js.Any])
      
      inline def setGrpcDothttp_connect_credsUndefined: Self = StObject.set(x, "grpc.http_connect_creds", js.undefined)
      
      inline def setGrpcDothttp_connect_target(value: String): Self = StObject.set(x, "grpc.http_connect_target", value.asInstanceOf[js.Any])
      
      inline def setGrpcDothttp_connect_targetUndefined: Self = StObject.set(x, "grpc.http_connect_target", js.undefined)
      
      inline def setGrpcDotinitial_reconnect_backoff_ms(value: Double): Self = StObject.set(x, "grpc.initial_reconnect_backoff_ms", value.asInstanceOf[js.Any])
      
      inline def setGrpcDotinitial_reconnect_backoff_msUndefined: Self = StObject.set(x, "grpc.initial_reconnect_backoff_ms", js.undefined)
      
      inline def setGrpcDotkeepalive_time_ms(value: Double): Self = StObject.set(x, "grpc.keepalive_time_ms", value.asInstanceOf[js.Any])
      
      inline def setGrpcDotkeepalive_time_msUndefined: Self = StObject.set(x, "grpc.keepalive_time_ms", js.undefined)
      
      inline def setGrpcDotkeepalive_timeout_ms(value: Double): Self = StObject.set(x, "grpc.keepalive_timeout_ms", value.asInstanceOf[js.Any])
      
      inline def setGrpcDotkeepalive_timeout_msUndefined: Self = StObject.set(x, "grpc.keepalive_timeout_ms", js.undefined)
      
      inline def setGrpcDotmax_concurrent_streams(value: Double): Self = StObject.set(x, "grpc.max_concurrent_streams", value.asInstanceOf[js.Any])
      
      inline def setGrpcDotmax_concurrent_streamsUndefined: Self = StObject.set(x, "grpc.max_concurrent_streams", js.undefined)
      
      inline def setGrpcDotmax_receive_message_length(value: Double): Self = StObject.set(x, "grpc.max_receive_message_length", value.asInstanceOf[js.Any])
      
      inline def setGrpcDotmax_receive_message_lengthUndefined: Self = StObject.set(x, "grpc.max_receive_message_length", js.undefined)
      
      inline def setGrpcDotmax_reconnect_backoff_ms(value: Double): Self = StObject.set(x, "grpc.max_reconnect_backoff_ms", value.asInstanceOf[js.Any])
      
      inline def setGrpcDotmax_reconnect_backoff_msUndefined: Self = StObject.set(x, "grpc.max_reconnect_backoff_ms", js.undefined)
      
      inline def setGrpcDotmax_send_message_length(value: Double): Self = StObject.set(x, "grpc.max_send_message_length", value.asInstanceOf[js.Any])
      
      inline def setGrpcDotmax_send_message_lengthUndefined: Self = StObject.set(x, "grpc.max_send_message_length", js.undefined)
      
      inline def setGrpcDotprimary_user_agent(value: String): Self = StObject.set(x, "grpc.primary_user_agent", value.asInstanceOf[js.Any])
      
      inline def setGrpcDotprimary_user_agentUndefined: Self = StObject.set(x, "grpc.primary_user_agent", js.undefined)
      
      inline def setGrpcDotsecondary_user_agent(value: String): Self = StObject.set(x, "grpc.secondary_user_agent", value.asInstanceOf[js.Any])
      
      inline def setGrpcDotsecondary_user_agentUndefined: Self = StObject.set(x, "grpc.secondary_user_agent", js.undefined)
      
      inline def setGrpcDotservice_config(value: String): Self = StObject.set(x, "grpc.service_config", value.asInstanceOf[js.Any])
      
      inline def setGrpcDotservice_configUndefined: Self = StObject.set(x, "grpc.service_config", js.undefined)
      
      inline def setGrpcDotssl_target_name_override(value: String): Self = StObject.set(x, "grpc.ssl_target_name_override", value.asInstanceOf[js.Any])
      
      inline def setGrpcDotssl_target_name_overrideUndefined: Self = StObject.set(x, "grpc.ssl_target_name_override", js.undefined)
      
      inline def setGrpcDotuse_local_subchannel_pool(value: Double): Self = StObject.set(x, "grpc.use_local_subchannel_pool", value.asInstanceOf[js.Any])
      
      inline def setGrpcDotuse_local_subchannel_poolUndefined: Self = StObject.set(x, "grpc.use_local_subchannel_pool", js.undefined)
    }
  }
  
  /* Inlined std.Partial<std.Console> */
  trait PartialConsole extends StObject {
    
    var assert: js.UndefOr[js.Function2[/* condition */ Boolean, /* repeated */ js.Any, Unit]] = js.undefined
    
    var clear: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var count: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var countReset: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var debug: js.UndefOr[js.Function1[/* repeated */ js.Any, Unit]] = js.undefined
    
    var dir: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var dirxml: js.UndefOr[js.Function1[/* repeated */ js.Any, Unit]] = js.undefined
    
    var error: js.UndefOr[js.Function1[/* repeated */ js.Any, Unit]] = js.undefined
    
    var exception: js.UndefOr[js.Function2[/* message */ String, /* repeated */ js.Any, Unit]] = js.undefined
    
    var group: js.UndefOr[js.Function1[/* repeated */ js.Any, Unit]] = js.undefined
    
    var groupCollapsed: js.UndefOr[js.Function1[/* repeated */ js.Any, Unit]] = js.undefined
    
    var groupEnd: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var info: js.UndefOr[js.Function1[/* repeated */ js.Any, Unit]] = js.undefined
    
    var log: js.UndefOr[js.Function1[/* repeated */ js.Any, Unit]] = js.undefined
    
    var memory: js.UndefOr[js.Any] = js.undefined
    
    var table: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var time: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var timeEnd: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var timeLog: js.UndefOr[js.Function2[/* label */ String, /* repeated */ js.Any, Unit]] = js.undefined
    
    var timeStamp: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var trace: js.UndefOr[js.Function1[/* repeated */ js.Any, Unit]] = js.undefined
    
    var warn: js.UndefOr[js.Function1[/* repeated */ js.Any, Unit]] = js.undefined
  }
  object PartialConsole {
    
    inline def apply(): PartialConsole = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialConsole]
    }
    
    extension [Self <: PartialConsole](x: Self) {
      
      inline def setAssert(value: (/* condition */ Boolean, /* repeated */ js.Any) => Unit): Self = StObject.set(x, "assert", js.Any.fromFunction2(value))
      
      inline def setAssertUndefined: Self = StObject.set(x, "assert", js.undefined)
      
      inline def setClear(value: () => Unit): Self = StObject.set(x, "clear", js.Any.fromFunction0(value))
      
      inline def setClearUndefined: Self = StObject.set(x, "clear", js.undefined)
      
      inline def setCount(value: () => Unit): Self = StObject.set(x, "count", js.Any.fromFunction0(value))
      
      inline def setCountReset(value: () => Unit): Self = StObject.set(x, "countReset", js.Any.fromFunction0(value))
      
      inline def setCountResetUndefined: Self = StObject.set(x, "countReset", js.undefined)
      
      inline def setCountUndefined: Self = StObject.set(x, "count", js.undefined)
      
      inline def setDebug(value: /* repeated */ js.Any => Unit): Self = StObject.set(x, "debug", js.Any.fromFunction1(value))
      
      inline def setDebugUndefined: Self = StObject.set(x, "debug", js.undefined)
      
      inline def setDir(value: () => Unit): Self = StObject.set(x, "dir", js.Any.fromFunction0(value))
      
      inline def setDirUndefined: Self = StObject.set(x, "dir", js.undefined)
      
      inline def setDirxml(value: /* repeated */ js.Any => Unit): Self = StObject.set(x, "dirxml", js.Any.fromFunction1(value))
      
      inline def setDirxmlUndefined: Self = StObject.set(x, "dirxml", js.undefined)
      
      inline def setError(value: /* repeated */ js.Any => Unit): Self = StObject.set(x, "error", js.Any.fromFunction1(value))
      
      inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      inline def setException(value: (/* message */ String, /* repeated */ js.Any) => Unit): Self = StObject.set(x, "exception", js.Any.fromFunction2(value))
      
      inline def setExceptionUndefined: Self = StObject.set(x, "exception", js.undefined)
      
      inline def setGroup(value: /* repeated */ js.Any => Unit): Self = StObject.set(x, "group", js.Any.fromFunction1(value))
      
      inline def setGroupCollapsed(value: /* repeated */ js.Any => Unit): Self = StObject.set(x, "groupCollapsed", js.Any.fromFunction1(value))
      
      inline def setGroupCollapsedUndefined: Self = StObject.set(x, "groupCollapsed", js.undefined)
      
      inline def setGroupEnd(value: () => Unit): Self = StObject.set(x, "groupEnd", js.Any.fromFunction0(value))
      
      inline def setGroupEndUndefined: Self = StObject.set(x, "groupEnd", js.undefined)
      
      inline def setGroupUndefined: Self = StObject.set(x, "group", js.undefined)
      
      inline def setInfo(value: /* repeated */ js.Any => Unit): Self = StObject.set(x, "info", js.Any.fromFunction1(value))
      
      inline def setInfoUndefined: Self = StObject.set(x, "info", js.undefined)
      
      inline def setLog(value: /* repeated */ js.Any => Unit): Self = StObject.set(x, "log", js.Any.fromFunction1(value))
      
      inline def setLogUndefined: Self = StObject.set(x, "log", js.undefined)
      
      inline def setMemory(value: js.Any): Self = StObject.set(x, "memory", value.asInstanceOf[js.Any])
      
      inline def setMemoryUndefined: Self = StObject.set(x, "memory", js.undefined)
      
      inline def setTable(value: () => Unit): Self = StObject.set(x, "table", js.Any.fromFunction0(value))
      
      inline def setTableUndefined: Self = StObject.set(x, "table", js.undefined)
      
      inline def setTime(value: () => Unit): Self = StObject.set(x, "time", js.Any.fromFunction0(value))
      
      inline def setTimeEnd(value: () => Unit): Self = StObject.set(x, "timeEnd", js.Any.fromFunction0(value))
      
      inline def setTimeEndUndefined: Self = StObject.set(x, "timeEnd", js.undefined)
      
      inline def setTimeLog(value: (/* label */ String, /* repeated */ js.Any) => Unit): Self = StObject.set(x, "timeLog", js.Any.fromFunction2(value))
      
      inline def setTimeLogUndefined: Self = StObject.set(x, "timeLog", js.undefined)
      
      inline def setTimeStamp(value: () => Unit): Self = StObject.set(x, "timeStamp", js.Any.fromFunction0(value))
      
      inline def setTimeStampUndefined: Self = StObject.set(x, "timeStamp", js.undefined)
      
      inline def setTimeUndefined: Self = StObject.set(x, "time", js.undefined)
      
      inline def setTrace(value: /* repeated */ js.Any => Unit): Self = StObject.set(x, "trace", js.Any.fromFunction1(value))
      
      inline def setTraceUndefined: Self = StObject.set(x, "trace", js.undefined)
      
      inline def setWarn(value: /* repeated */ js.Any => Unit): Self = StObject.set(x, "warn", js.Any.fromFunction1(value))
      
      inline def setWarnUndefined: Self = StObject.set(x, "warn", js.undefined)
    }
  }
  
  /* Inlined std.Partial<@grpc/grpc-js.@grpc/grpc-js/build/src/call-stream.InterceptingListener> */
  trait PartialInterceptingListen extends StObject {
    
    var onReceiveMessage: js.UndefOr[js.Function1[/* message */ js.Any, Unit]] = js.undefined
    
    var onReceiveMetadata: js.UndefOr[js.Function1[/* metadata */ Metadata, Unit]] = js.undefined
    
    var onReceiveStatus: js.UndefOr[js.Function1[/* status */ StatusObject, Unit]] = js.undefined
  }
  object PartialInterceptingListen {
    
    inline def apply(): PartialInterceptingListen = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialInterceptingListen]
    }
    
    extension [Self <: PartialInterceptingListen](x: Self) {
      
      inline def setOnReceiveMessage(value: /* message */ js.Any => Unit): Self = StObject.set(x, "onReceiveMessage", js.Any.fromFunction1(value))
      
      inline def setOnReceiveMessageUndefined: Self = StObject.set(x, "onReceiveMessage", js.undefined)
      
      inline def setOnReceiveMetadata(value: /* metadata */ Metadata => Unit): Self = StObject.set(x, "onReceiveMetadata", js.Any.fromFunction1(value))
      
      inline def setOnReceiveMetadataUndefined: Self = StObject.set(x, "onReceiveMetadata", js.undefined)
      
      inline def setOnReceiveStatus(value: /* status */ StatusObject => Unit): Self = StObject.set(x, "onReceiveStatus", js.Any.fromFunction1(value))
      
      inline def setOnReceiveStatusUndefined: Self = StObject.set(x, "onReceiveStatus", js.undefined)
    }
  }
  
  /* Inlined std.Partial<@grpc/grpc-js.@grpc/grpc-js/build/src/call-stream.StatusObject> */
  trait PartialStatusObject extends StObject {
    
    var code: js.UndefOr[Status] = js.undefined
    
    var details: js.UndefOr[String] = js.undefined
    
    var metadata: js.UndefOr[Metadata] = js.undefined
  }
  object PartialStatusObject {
    
    inline def apply(): PartialStatusObject = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialStatusObject]
    }
    
    extension [Self <: PartialStatusObject](x: Self) {
      
      inline def setCode(value: Status): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      inline def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
      
      inline def setDetails(value: String): Self = StObject.set(x, "details", value.asInstanceOf[js.Any])
      
      inline def setDetailsUndefined: Self = StObject.set(x, "details", js.undefined)
      
      inline def setMetadata(value: Metadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
      
      inline def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
    }
  }
}
