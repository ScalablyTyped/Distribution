package typings.grpcGrpcJs

import typings.grpcGrpcJs.callStreamMod.StatusObject
import typings.grpcGrpcJs.constantsMod.Status
import typings.grpcGrpcJs.metadataMod.Metadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait LocalityPath extends StObject {
    
    var localityPath: js.Array[String] = js.native
  }
  object LocalityPath {
    
    @scala.inline
    def apply(localityPath: js.Array[String]): LocalityPath = {
      val __obj = js.Dynamic.literal(localityPath = localityPath.asInstanceOf[js.Any])
      __obj.asInstanceOf[LocalityPath]
    }
    
    @scala.inline
    implicit class LocalityPathMutableBuilder[Self <: LocalityPath] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLocalityPath(value: js.Array[String]): Self = StObject.set(x, "localityPath", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocalityPathVarargs(value: String*): Self = StObject.set(x, "localityPath", js.Array(value :_*))
    }
  }
  
  /* Inlined std.Partial<@grpc/grpc-js.@grpc/grpc-js/build/src/channel-options.ChannelOptions> */
  @js.native
  trait PartialChannelOptions extends StObject {
    
    @JSName("grpc.default_authority")
    var grpcDotdefault_authority: js.UndefOr[String] = js.native
    
    @JSName("grpc.enable_http_proxy")
    var grpcDotenable_http_proxy: js.UndefOr[Double] = js.native
    
    @JSName("grpc.http_connect_creds")
    var grpcDothttp_connect_creds: js.UndefOr[String] = js.native
    
    @JSName("grpc.http_connect_target")
    var grpcDothttp_connect_target: js.UndefOr[String] = js.native
    
    @JSName("grpc.initial_reconnect_backoff_ms")
    var grpcDotinitial_reconnect_backoff_ms: js.UndefOr[Double] = js.native
    
    @JSName("grpc.keepalive_time_ms")
    var grpcDotkeepalive_time_ms: js.UndefOr[Double] = js.native
    
    @JSName("grpc.keepalive_timeout_ms")
    var grpcDotkeepalive_timeout_ms: js.UndefOr[Double] = js.native
    
    @JSName("grpc.max_concurrent_streams")
    var grpcDotmax_concurrent_streams: js.UndefOr[Double] = js.native
    
    @JSName("grpc.max_receive_message_length")
    var grpcDotmax_receive_message_length: js.UndefOr[Double] = js.native
    
    @JSName("grpc.max_reconnect_backoff_ms")
    var grpcDotmax_reconnect_backoff_ms: js.UndefOr[Double] = js.native
    
    @JSName("grpc.max_send_message_length")
    var grpcDotmax_send_message_length: js.UndefOr[Double] = js.native
    
    @JSName("grpc.primary_user_agent")
    var grpcDotprimary_user_agent: js.UndefOr[String] = js.native
    
    @JSName("grpc.secondary_user_agent")
    var grpcDotsecondary_user_agent: js.UndefOr[String] = js.native
    
    @JSName("grpc.service_config")
    var grpcDotservice_config: js.UndefOr[String] = js.native
    
    @JSName("grpc.ssl_target_name_override")
    var grpcDotssl_target_name_override: js.UndefOr[String] = js.native
    
    @JSName("grpc.use_local_subchannel_pool")
    var grpcDotuse_local_subchannel_pool: js.UndefOr[Double] = js.native
  }
  object PartialChannelOptions {
    
    @scala.inline
    def apply(): PartialChannelOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialChannelOptions]
    }
    
    @scala.inline
    implicit class PartialChannelOptionsMutableBuilder[Self <: PartialChannelOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGrpcDotdefault_authority(value: String): Self = StObject.set(x, "grpc.default_authority", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGrpcDotdefault_authorityUndefined: Self = StObject.set(x, "grpc.default_authority", js.undefined)
      
      @scala.inline
      def setGrpcDotenable_http_proxy(value: Double): Self = StObject.set(x, "grpc.enable_http_proxy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGrpcDotenable_http_proxyUndefined: Self = StObject.set(x, "grpc.enable_http_proxy", js.undefined)
      
      @scala.inline
      def setGrpcDothttp_connect_creds(value: String): Self = StObject.set(x, "grpc.http_connect_creds", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGrpcDothttp_connect_credsUndefined: Self = StObject.set(x, "grpc.http_connect_creds", js.undefined)
      
      @scala.inline
      def setGrpcDothttp_connect_target(value: String): Self = StObject.set(x, "grpc.http_connect_target", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGrpcDothttp_connect_targetUndefined: Self = StObject.set(x, "grpc.http_connect_target", js.undefined)
      
      @scala.inline
      def setGrpcDotinitial_reconnect_backoff_ms(value: Double): Self = StObject.set(x, "grpc.initial_reconnect_backoff_ms", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGrpcDotinitial_reconnect_backoff_msUndefined: Self = StObject.set(x, "grpc.initial_reconnect_backoff_ms", js.undefined)
      
      @scala.inline
      def setGrpcDotkeepalive_time_ms(value: Double): Self = StObject.set(x, "grpc.keepalive_time_ms", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGrpcDotkeepalive_time_msUndefined: Self = StObject.set(x, "grpc.keepalive_time_ms", js.undefined)
      
      @scala.inline
      def setGrpcDotkeepalive_timeout_ms(value: Double): Self = StObject.set(x, "grpc.keepalive_timeout_ms", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGrpcDotkeepalive_timeout_msUndefined: Self = StObject.set(x, "grpc.keepalive_timeout_ms", js.undefined)
      
      @scala.inline
      def setGrpcDotmax_concurrent_streams(value: Double): Self = StObject.set(x, "grpc.max_concurrent_streams", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGrpcDotmax_concurrent_streamsUndefined: Self = StObject.set(x, "grpc.max_concurrent_streams", js.undefined)
      
      @scala.inline
      def setGrpcDotmax_receive_message_length(value: Double): Self = StObject.set(x, "grpc.max_receive_message_length", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGrpcDotmax_receive_message_lengthUndefined: Self = StObject.set(x, "grpc.max_receive_message_length", js.undefined)
      
      @scala.inline
      def setGrpcDotmax_reconnect_backoff_ms(value: Double): Self = StObject.set(x, "grpc.max_reconnect_backoff_ms", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGrpcDotmax_reconnect_backoff_msUndefined: Self = StObject.set(x, "grpc.max_reconnect_backoff_ms", js.undefined)
      
      @scala.inline
      def setGrpcDotmax_send_message_length(value: Double): Self = StObject.set(x, "grpc.max_send_message_length", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGrpcDotmax_send_message_lengthUndefined: Self = StObject.set(x, "grpc.max_send_message_length", js.undefined)
      
      @scala.inline
      def setGrpcDotprimary_user_agent(value: String): Self = StObject.set(x, "grpc.primary_user_agent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGrpcDotprimary_user_agentUndefined: Self = StObject.set(x, "grpc.primary_user_agent", js.undefined)
      
      @scala.inline
      def setGrpcDotsecondary_user_agent(value: String): Self = StObject.set(x, "grpc.secondary_user_agent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGrpcDotsecondary_user_agentUndefined: Self = StObject.set(x, "grpc.secondary_user_agent", js.undefined)
      
      @scala.inline
      def setGrpcDotservice_config(value: String): Self = StObject.set(x, "grpc.service_config", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGrpcDotservice_configUndefined: Self = StObject.set(x, "grpc.service_config", js.undefined)
      
      @scala.inline
      def setGrpcDotssl_target_name_override(value: String): Self = StObject.set(x, "grpc.ssl_target_name_override", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGrpcDotssl_target_name_overrideUndefined: Self = StObject.set(x, "grpc.ssl_target_name_override", js.undefined)
      
      @scala.inline
      def setGrpcDotuse_local_subchannel_pool(value: Double): Self = StObject.set(x, "grpc.use_local_subchannel_pool", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGrpcDotuse_local_subchannel_poolUndefined: Self = StObject.set(x, "grpc.use_local_subchannel_pool", js.undefined)
    }
  }
  
  /* Inlined std.Partial<std.Console> */
  @js.native
  trait PartialConsole extends StObject {
    
    var assert: js.UndefOr[js.Function2[/* condition */ Boolean, /* repeated */ js.Any, Unit]] = js.native
    
    var clear: js.UndefOr[js.Function0[Unit]] = js.native
    
    var count: js.UndefOr[js.Function0[Unit]] = js.native
    
    var countReset: js.UndefOr[js.Function0[Unit]] = js.native
    
    var debug: js.UndefOr[js.Function1[/* repeated */ js.Any, Unit]] = js.native
    
    var dir: js.UndefOr[js.Function0[Unit]] = js.native
    
    var dirxml: js.UndefOr[js.Function1[/* repeated */ js.Any, Unit]] = js.native
    
    var error: js.UndefOr[js.Function1[/* repeated */ js.Any, Unit]] = js.native
    
    var exception: js.UndefOr[js.Function2[/* message */ String, /* repeated */ js.Any, Unit]] = js.native
    
    var group: js.UndefOr[js.Function1[/* repeated */ js.Any, Unit]] = js.native
    
    var groupCollapsed: js.UndefOr[js.Function1[/* repeated */ js.Any, Unit]] = js.native
    
    var groupEnd: js.UndefOr[js.Function0[Unit]] = js.native
    
    var info: js.UndefOr[js.Function1[/* repeated */ js.Any, Unit]] = js.native
    
    var log: js.UndefOr[js.Function1[/* repeated */ js.Any, Unit]] = js.native
    
    var memory: js.UndefOr[js.Any] = js.native
    
    var table: js.UndefOr[js.Function0[Unit]] = js.native
    
    var time: js.UndefOr[js.Function0[Unit]] = js.native
    
    var timeEnd: js.UndefOr[js.Function0[Unit]] = js.native
    
    var timeLog: js.UndefOr[js.Function2[/* label */ String, /* repeated */ js.Any, Unit]] = js.native
    
    var timeStamp: js.UndefOr[js.Function0[Unit]] = js.native
    
    var trace: js.UndefOr[js.Function1[/* repeated */ js.Any, Unit]] = js.native
    
    var warn: js.UndefOr[js.Function1[/* repeated */ js.Any, Unit]] = js.native
  }
  object PartialConsole {
    
    @scala.inline
    def apply(): PartialConsole = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialConsole]
    }
    
    @scala.inline
    implicit class PartialConsoleMutableBuilder[Self <: PartialConsole] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAssert(value: (/* condition */ Boolean, /* repeated */ js.Any) => Unit): Self = StObject.set(x, "assert", js.Any.fromFunction2(value))
      
      @scala.inline
      def setAssertUndefined: Self = StObject.set(x, "assert", js.undefined)
      
      @scala.inline
      def setClear(value: () => Unit): Self = StObject.set(x, "clear", js.Any.fromFunction0(value))
      
      @scala.inline
      def setClearUndefined: Self = StObject.set(x, "clear", js.undefined)
      
      @scala.inline
      def setCount(value: () => Unit): Self = StObject.set(x, "count", js.Any.fromFunction0(value))
      
      @scala.inline
      def setCountReset(value: () => Unit): Self = StObject.set(x, "countReset", js.Any.fromFunction0(value))
      
      @scala.inline
      def setCountResetUndefined: Self = StObject.set(x, "countReset", js.undefined)
      
      @scala.inline
      def setCountUndefined: Self = StObject.set(x, "count", js.undefined)
      
      @scala.inline
      def setDebug(value: /* repeated */ js.Any => Unit): Self = StObject.set(x, "debug", js.Any.fromFunction1(value))
      
      @scala.inline
      def setDebugUndefined: Self = StObject.set(x, "debug", js.undefined)
      
      @scala.inline
      def setDir(value: () => Unit): Self = StObject.set(x, "dir", js.Any.fromFunction0(value))
      
      @scala.inline
      def setDirUndefined: Self = StObject.set(x, "dir", js.undefined)
      
      @scala.inline
      def setDirxml(value: /* repeated */ js.Any => Unit): Self = StObject.set(x, "dirxml", js.Any.fromFunction1(value))
      
      @scala.inline
      def setDirxmlUndefined: Self = StObject.set(x, "dirxml", js.undefined)
      
      @scala.inline
      def setError(value: /* repeated */ js.Any => Unit): Self = StObject.set(x, "error", js.Any.fromFunction1(value))
      
      @scala.inline
      def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      @scala.inline
      def setException(value: (/* message */ String, /* repeated */ js.Any) => Unit): Self = StObject.set(x, "exception", js.Any.fromFunction2(value))
      
      @scala.inline
      def setExceptionUndefined: Self = StObject.set(x, "exception", js.undefined)
      
      @scala.inline
      def setGroup(value: /* repeated */ js.Any => Unit): Self = StObject.set(x, "group", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGroupCollapsed(value: /* repeated */ js.Any => Unit): Self = StObject.set(x, "groupCollapsed", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGroupCollapsedUndefined: Self = StObject.set(x, "groupCollapsed", js.undefined)
      
      @scala.inline
      def setGroupEnd(value: () => Unit): Self = StObject.set(x, "groupEnd", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGroupEndUndefined: Self = StObject.set(x, "groupEnd", js.undefined)
      
      @scala.inline
      def setGroupUndefined: Self = StObject.set(x, "group", js.undefined)
      
      @scala.inline
      def setInfo(value: /* repeated */ js.Any => Unit): Self = StObject.set(x, "info", js.Any.fromFunction1(value))
      
      @scala.inline
      def setInfoUndefined: Self = StObject.set(x, "info", js.undefined)
      
      @scala.inline
      def setLog(value: /* repeated */ js.Any => Unit): Self = StObject.set(x, "log", js.Any.fromFunction1(value))
      
      @scala.inline
      def setLogUndefined: Self = StObject.set(x, "log", js.undefined)
      
      @scala.inline
      def setMemory(value: js.Any): Self = StObject.set(x, "memory", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMemoryUndefined: Self = StObject.set(x, "memory", js.undefined)
      
      @scala.inline
      def setTable(value: () => Unit): Self = StObject.set(x, "table", js.Any.fromFunction0(value))
      
      @scala.inline
      def setTableUndefined: Self = StObject.set(x, "table", js.undefined)
      
      @scala.inline
      def setTime(value: () => Unit): Self = StObject.set(x, "time", js.Any.fromFunction0(value))
      
      @scala.inline
      def setTimeEnd(value: () => Unit): Self = StObject.set(x, "timeEnd", js.Any.fromFunction0(value))
      
      @scala.inline
      def setTimeEndUndefined: Self = StObject.set(x, "timeEnd", js.undefined)
      
      @scala.inline
      def setTimeLog(value: (/* label */ String, /* repeated */ js.Any) => Unit): Self = StObject.set(x, "timeLog", js.Any.fromFunction2(value))
      
      @scala.inline
      def setTimeLogUndefined: Self = StObject.set(x, "timeLog", js.undefined)
      
      @scala.inline
      def setTimeStamp(value: () => Unit): Self = StObject.set(x, "timeStamp", js.Any.fromFunction0(value))
      
      @scala.inline
      def setTimeStampUndefined: Self = StObject.set(x, "timeStamp", js.undefined)
      
      @scala.inline
      def setTimeUndefined: Self = StObject.set(x, "time", js.undefined)
      
      @scala.inline
      def setTrace(value: /* repeated */ js.Any => Unit): Self = StObject.set(x, "trace", js.Any.fromFunction1(value))
      
      @scala.inline
      def setTraceUndefined: Self = StObject.set(x, "trace", js.undefined)
      
      @scala.inline
      def setWarn(value: /* repeated */ js.Any => Unit): Self = StObject.set(x, "warn", js.Any.fromFunction1(value))
      
      @scala.inline
      def setWarnUndefined: Self = StObject.set(x, "warn", js.undefined)
    }
  }
  
  /* Inlined std.Partial<@grpc/grpc-js.@grpc/grpc-js/build/src/call-stream.InterceptingListener> */
  @js.native
  trait PartialInterceptingListen extends StObject {
    
    var onReceiveMessage: js.UndefOr[js.Function1[/* message */ js.Any, Unit]] = js.native
    
    var onReceiveMetadata: js.UndefOr[js.Function1[/* metadata */ Metadata, Unit]] = js.native
    
    var onReceiveStatus: js.UndefOr[js.Function1[/* status */ StatusObject, Unit]] = js.native
  }
  object PartialInterceptingListen {
    
    @scala.inline
    def apply(): PartialInterceptingListen = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialInterceptingListen]
    }
    
    @scala.inline
    implicit class PartialInterceptingListenMutableBuilder[Self <: PartialInterceptingListen] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOnReceiveMessage(value: /* message */ js.Any => Unit): Self = StObject.set(x, "onReceiveMessage", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnReceiveMessageUndefined: Self = StObject.set(x, "onReceiveMessage", js.undefined)
      
      @scala.inline
      def setOnReceiveMetadata(value: /* metadata */ Metadata => Unit): Self = StObject.set(x, "onReceiveMetadata", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnReceiveMetadataUndefined: Self = StObject.set(x, "onReceiveMetadata", js.undefined)
      
      @scala.inline
      def setOnReceiveStatus(value: /* status */ StatusObject => Unit): Self = StObject.set(x, "onReceiveStatus", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnReceiveStatusUndefined: Self = StObject.set(x, "onReceiveStatus", js.undefined)
    }
  }
  
  /* Inlined std.Partial<@grpc/grpc-js.@grpc/grpc-js/build/src/call-stream.StatusObject> */
  @js.native
  trait PartialStatusObject extends StObject {
    
    var code: js.UndefOr[Status] = js.native
    
    var details: js.UndefOr[String] = js.native
    
    var metadata: js.UndefOr[Metadata] = js.native
  }
  object PartialStatusObject {
    
    @scala.inline
    def apply(): PartialStatusObject = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialStatusObject]
    }
    
    @scala.inline
    implicit class PartialStatusObjectMutableBuilder[Self <: PartialStatusObject] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCode(value: Status): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
      
      @scala.inline
      def setDetails(value: String): Self = StObject.set(x, "details", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDetailsUndefined: Self = StObject.set(x, "details", js.undefined)
      
      @scala.inline
      def setMetadata(value: Metadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
    }
  }
}
