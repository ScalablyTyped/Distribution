package typings.grpcGrpcJs

import typings.grpcGrpcJs.anon.PartialChannelControlHelp
import typings.grpcGrpcJs.anon.PartialConsole
import typings.grpcGrpcJs.anon.PartialFailurePercentageE
import typings.grpcGrpcJs.anon.PartialSuccessRateEjectio
import typings.grpcGrpcJs.buildSrcAdminMod.GetHandlers
import typings.grpcGrpcJs.buildSrcAdminMod.GetServiceDefinition
import typings.grpcGrpcJs.buildSrcBackoffTimeoutMod.BackoffOptions
import typings.grpcGrpcJs.buildSrcCallCredentialsMod.CallMetadataGenerator
import typings.grpcGrpcJs.buildSrcCallCredentialsMod.OAuth2Client
import typings.grpcGrpcJs.buildSrcCallMod.ClientDuplexStream
import typings.grpcGrpcJs.buildSrcCallMod.ClientReadableStream
import typings.grpcGrpcJs.buildSrcCallMod.ClientUnaryCall
import typings.grpcGrpcJs.buildSrcCallMod.ClientWritableStream
import typings.grpcGrpcJs.buildSrcCallStreamMod.StatusObject
import typings.grpcGrpcJs.buildSrcChannelCredentialsMod.VerifyOptions
import typings.grpcGrpcJs.buildSrcChannelMod.ChannelImplementation
import typings.grpcGrpcJs.buildSrcChannelOptionsMod.ChannelOptions
import typings.grpcGrpcJs.buildSrcClientInterceptorsMod.InterceptingCallInterface
import typings.grpcGrpcJs.buildSrcClientInterceptorsMod.Requester
import typings.grpcGrpcJs.buildSrcClientMod.ClientOptions
import typings.grpcGrpcJs.buildSrcCompressionAlgorithmsMod.CompressionAlgorithms
import typings.grpcGrpcJs.buildSrcConnectivityStateMod.ConnectivityState
import typings.grpcGrpcJs.buildSrcConstantsMod.LogVerbosity
import typings.grpcGrpcJs.buildSrcConstantsMod.Propagate
import typings.grpcGrpcJs.buildSrcConstantsMod.Status
import typings.grpcGrpcJs.buildSrcDurationMod.Duration
import typings.grpcGrpcJs.buildSrcFilterMod.Filter
import typings.grpcGrpcJs.buildSrcFilterMod.FilterFactory
import typings.grpcGrpcJs.buildSrcLoadBalancerMod.ChannelControlHelper
import typings.grpcGrpcJs.buildSrcLoadBalancerMod.LoadBalancer
import typings.grpcGrpcJs.buildSrcLoadBalancerMod.LoadBalancerConstructor
import typings.grpcGrpcJs.buildSrcLoadBalancerMod.LoadBalancingConfig
import typings.grpcGrpcJs.buildSrcLoadBalancerMod.LoadBalancingConfigConstructor
import typings.grpcGrpcJs.buildSrcMakeClientMod.GrpcObject
import typings.grpcGrpcJs.buildSrcMakeClientMod.PackageDefinition
import typings.grpcGrpcJs.buildSrcMakeClientMod.ServiceClientConstructor
import typings.grpcGrpcJs.buildSrcMetadataMod.MetadataOptions
import typings.grpcGrpcJs.buildSrcResolverMod.ResolverConstructor
import typings.grpcGrpcJs.buildSrcServerCredentialsMod.KeyCertPair
import typings.grpcGrpcJs.buildSrcSubchannelAddressMod.SubchannelAddress
import typings.grpcGrpcJs.buildSrcSubchannelInterfaceMod.SubchannelInterface
import typings.grpcGrpcJs.buildSrcUriParserMod.GrpcUri
import typings.grpcGrpcJs.grpcGrpcJsBooleans.`true`
import typings.node.bufferMod.global.Buffer
import typings.node.http2Mod.IncomingHttpHeaders
import typings.node.tlsMod.SecureContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@grpc/grpc-js", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* note: abstract class */ @JSImport("@grpc/grpc-js", "CallCredentials")
  @js.native
  open class CallCredentials ()
    extends typings.grpcGrpcJs.buildSrcCallCredentialsMod.CallCredentials
  /* static members */
  object CallCredentials {
    
    @JSImport("@grpc/grpc-js", "CallCredentials")
    @js.native
    val ^ : js.Any = js.native
    
    inline def createEmpty(): typings.grpcGrpcJs.buildSrcCallCredentialsMod.CallCredentials = ^.asInstanceOf[js.Dynamic].applyDynamic("createEmpty")().asInstanceOf[typings.grpcGrpcJs.buildSrcCallCredentialsMod.CallCredentials]
    
    /**
      * Create a gRPC credential from a Google credential object.
      * @param googleCredentials The authentication client to use.
      * @return The resulting CallCredentials object.
      */
    inline def createFromGoogleCredential(googleCredentials: OAuth2Client): typings.grpcGrpcJs.buildSrcCallCredentialsMod.CallCredentials = ^.asInstanceOf[js.Dynamic].applyDynamic("createFromGoogleCredential")(googleCredentials.asInstanceOf[js.Any]).asInstanceOf[typings.grpcGrpcJs.buildSrcCallCredentialsMod.CallCredentials]
    
    /**
      * Creates a new CallCredentials object from a given function that generates
      * Metadata objects.
      * @param metadataGenerator A function that accepts a set of options, and
      * generates a Metadata object based on these options, which is passed back
      * to the caller via a supplied (err, metadata) callback.
      */
    inline def createFromMetadataGenerator(metadataGenerator: CallMetadataGenerator): typings.grpcGrpcJs.buildSrcCallCredentialsMod.CallCredentials = ^.asInstanceOf[js.Dynamic].applyDynamic("createFromMetadataGenerator")(metadataGenerator.asInstanceOf[js.Any]).asInstanceOf[typings.grpcGrpcJs.buildSrcCallCredentialsMod.CallCredentials]
  }
  
  @JSImport("@grpc/grpc-js", "Channel")
  @js.native
  open class Channel protected () extends ChannelImplementation {
    def this(
      target: String,
      credentials: typings.grpcGrpcJs.buildSrcChannelCredentialsMod.ChannelCredentials,
      options: ChannelOptions
    ) = this()
  }
  
  /* note: abstract class */ @JSImport("@grpc/grpc-js", "ChannelCredentials")
  @js.native
  /* protected */ open class ChannelCredentials ()
    extends typings.grpcGrpcJs.buildSrcChannelCredentialsMod.ChannelCredentials {
    /* protected */ def this(callCredentials: typings.grpcGrpcJs.buildSrcCallCredentialsMod.CallCredentials) = this()
  }
  /* static members */
  object ChannelCredentials {
    
    @JSImport("@grpc/grpc-js", "ChannelCredentials")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Return a new ChannelCredentials instance with credentials created using
      * the provided secureContext. The resulting instances can be used to
      * construct a Channel that communicates over TLS. gRPC will not override
      * anything in the provided secureContext, so the environment variables
      * GRPC_SSL_CIPHER_SUITES and GRPC_DEFAULT_SSL_ROOTS_FILE_PATH will
      * not be applied.
      * @param secureContext The return value of tls.createSecureContext()
      * @param verifyOptions Additional options to modify certificate verification
      */
    inline def createFromSecureContext(secureContext: SecureContext): typings.grpcGrpcJs.buildSrcChannelCredentialsMod.ChannelCredentials = ^.asInstanceOf[js.Dynamic].applyDynamic("createFromSecureContext")(secureContext.asInstanceOf[js.Any]).asInstanceOf[typings.grpcGrpcJs.buildSrcChannelCredentialsMod.ChannelCredentials]
    inline def createFromSecureContext(secureContext: SecureContext, verifyOptions: VerifyOptions): typings.grpcGrpcJs.buildSrcChannelCredentialsMod.ChannelCredentials = (^.asInstanceOf[js.Dynamic].applyDynamic("createFromSecureContext")(secureContext.asInstanceOf[js.Any], verifyOptions.asInstanceOf[js.Any])).asInstanceOf[typings.grpcGrpcJs.buildSrcChannelCredentialsMod.ChannelCredentials]
    
    /**
      * Return a new ChannelCredentials instance with no credentials.
      */
    inline def createInsecure(): typings.grpcGrpcJs.buildSrcChannelCredentialsMod.ChannelCredentials = ^.asInstanceOf[js.Dynamic].applyDynamic("createInsecure")().asInstanceOf[typings.grpcGrpcJs.buildSrcChannelCredentialsMod.ChannelCredentials]
    
    /**
      * Return a new ChannelCredentials instance with a given set of credentials.
      * The resulting instance can be used to construct a Channel that communicates
      * over TLS.
      * @param rootCerts The root certificate data.
      * @param privateKey The client certificate private key, if available.
      * @param certChain The client certificate key chain, if available.
      * @param verifyOptions Additional options to modify certificate verification
      */
    inline def createSsl(
      rootCerts: js.UndefOr[Buffer | Null],
      privateKey: js.UndefOr[Buffer | Null],
      certChain: js.UndefOr[Buffer | Null],
      verifyOptions: js.UndefOr[VerifyOptions]
    ): typings.grpcGrpcJs.buildSrcChannelCredentialsMod.ChannelCredentials = (^.asInstanceOf[js.Dynamic].applyDynamic("createSsl")(rootCerts.asInstanceOf[js.Any], privateKey.asInstanceOf[js.Any], certChain.asInstanceOf[js.Any], verifyOptions.asInstanceOf[js.Any])).asInstanceOf[typings.grpcGrpcJs.buildSrcChannelCredentialsMod.ChannelCredentials]
  }
  
  @JSImport("@grpc/grpc-js", "Client")
  @js.native
  open class Client protected ()
    extends typings.grpcGrpcJs.buildSrcClientMod.Client {
    def this(address: String, credentials: typings.grpcGrpcJs.buildSrcChannelCredentialsMod.ChannelCredentials) = this()
    def this(
      address: String,
      credentials: typings.grpcGrpcJs.buildSrcChannelCredentialsMod.ChannelCredentials,
      options: ClientOptions
    ) = this()
  }
  
  @JSImport("@grpc/grpc-js", "InterceptingCall")
  @js.native
  open class InterceptingCall protected ()
    extends typings.grpcGrpcJs.buildSrcClientInterceptorsMod.InterceptingCall {
    def this(nextCall: InterceptingCallInterface) = this()
    def this(nextCall: InterceptingCallInterface, requester: Requester) = this()
  }
  
  @JSImport("@grpc/grpc-js", "InterceptorConfigurationError")
  @js.native
  open class InterceptorConfigurationError protected ()
    extends typings.grpcGrpcJs.buildSrcClientInterceptorsMod.InterceptorConfigurationError {
    def this(message: String) = this()
  }
  
  @JSImport("@grpc/grpc-js", "ListenerBuilder")
  @js.native
  open class ListenerBuilder ()
    extends typings.grpcGrpcJs.buildSrcClientInterceptorsMod.ListenerBuilder
  
  @JSImport("@grpc/grpc-js", "Metadata")
  @js.native
  open class Metadata ()
    extends typings.grpcGrpcJs.buildSrcMetadataMod.Metadata {
    def this(options: MetadataOptions) = this()
  }
  /* static members */
  object Metadata {
    
    @JSImport("@grpc/grpc-js", "Metadata")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Returns a new Metadata object based fields in a given IncomingHttpHeaders
      * object.
      * @param headers An IncomingHttpHeaders object.
      */
    inline def fromHttp2Headers(headers: IncomingHttpHeaders): typings.grpcGrpcJs.buildSrcMetadataMod.Metadata = ^.asInstanceOf[js.Dynamic].applyDynamic("fromHttp2Headers")(headers.asInstanceOf[js.Any]).asInstanceOf[typings.grpcGrpcJs.buildSrcMetadataMod.Metadata]
  }
  
  @JSImport("@grpc/grpc-js", "RequesterBuilder")
  @js.native
  open class RequesterBuilder ()
    extends typings.grpcGrpcJs.buildSrcClientInterceptorsMod.RequesterBuilder
  
  @JSImport("@grpc/grpc-js", "Server")
  @js.native
  open class Server ()
    extends typings.grpcGrpcJs.buildSrcServerMod.Server {
    def this(options: ChannelOptions) = this()
  }
  
  /* note: abstract class */ @JSImport("@grpc/grpc-js", "ServerCredentials")
  @js.native
  open class ServerCredentials ()
    extends typings.grpcGrpcJs.buildSrcServerCredentialsMod.ServerCredentials
  /* static members */
  object ServerCredentials {
    
    @JSImport("@grpc/grpc-js", "ServerCredentials")
    @js.native
    val ^ : js.Any = js.native
    
    inline def createInsecure(): typings.grpcGrpcJs.buildSrcServerCredentialsMod.ServerCredentials = ^.asInstanceOf[js.Dynamic].applyDynamic("createInsecure")().asInstanceOf[typings.grpcGrpcJs.buildSrcServerCredentialsMod.ServerCredentials]
    
    inline def createSsl(rootCerts: Null, keyCertPairs: js.Array[KeyCertPair]): typings.grpcGrpcJs.buildSrcServerCredentialsMod.ServerCredentials = (^.asInstanceOf[js.Dynamic].applyDynamic("createSsl")(rootCerts.asInstanceOf[js.Any], keyCertPairs.asInstanceOf[js.Any])).asInstanceOf[typings.grpcGrpcJs.buildSrcServerCredentialsMod.ServerCredentials]
    inline def createSsl(rootCerts: Null, keyCertPairs: js.Array[KeyCertPair], checkClientCertificate: Boolean): typings.grpcGrpcJs.buildSrcServerCredentialsMod.ServerCredentials = (^.asInstanceOf[js.Dynamic].applyDynamic("createSsl")(rootCerts.asInstanceOf[js.Any], keyCertPairs.asInstanceOf[js.Any], checkClientCertificate.asInstanceOf[js.Any])).asInstanceOf[typings.grpcGrpcJs.buildSrcServerCredentialsMod.ServerCredentials]
    inline def createSsl(rootCerts: Buffer, keyCertPairs: js.Array[KeyCertPair]): typings.grpcGrpcJs.buildSrcServerCredentialsMod.ServerCredentials = (^.asInstanceOf[js.Dynamic].applyDynamic("createSsl")(rootCerts.asInstanceOf[js.Any], keyCertPairs.asInstanceOf[js.Any])).asInstanceOf[typings.grpcGrpcJs.buildSrcServerCredentialsMod.ServerCredentials]
    inline def createSsl(rootCerts: Buffer, keyCertPairs: js.Array[KeyCertPair], checkClientCertificate: Boolean): typings.grpcGrpcJs.buildSrcServerCredentialsMod.ServerCredentials = (^.asInstanceOf[js.Dynamic].applyDynamic("createSsl")(rootCerts.asInstanceOf[js.Any], keyCertPairs.asInstanceOf[js.Any], checkClientCertificate.asInstanceOf[js.Any])).asInstanceOf[typings.grpcGrpcJs.buildSrcServerCredentialsMod.ServerCredentials]
  }
  
  @JSImport("@grpc/grpc-js", "StatusBuilder")
  @js.native
  open class StatusBuilder ()
    extends typings.grpcGrpcJs.buildSrcStatusBuilderMod.StatusBuilder
  
  inline def addAdminServicesToServer(server: typings.grpcGrpcJs.buildSrcServerMod.Server): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("addAdminServicesToServer")(server.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def closeClient(client: typings.grpcGrpcJs.buildSrcClientMod.Client): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("closeClient")(client.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @JSImport("@grpc/grpc-js", "compressionAlgorithms")
  @js.native
  object compressionAlgorithms extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[CompressionAlgorithms & Double] = js.native
    
    /* 1 */ val deflate: typings.grpcGrpcJs.buildSrcCompressionAlgorithmsMod.CompressionAlgorithms.deflate & Double = js.native
    
    /* 2 */ val gzip: typings.grpcGrpcJs.buildSrcCompressionAlgorithmsMod.CompressionAlgorithms.gzip & Double = js.native
    
    /* 0 */ val identity: typings.grpcGrpcJs.buildSrcCompressionAlgorithmsMod.CompressionAlgorithms.identity & Double = js.native
  }
  
  @JSImport("@grpc/grpc-js", "connectivityState")
  @js.native
  object connectivityState extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[ConnectivityState & Double] = js.native
    
    /* 1 */ val CONNECTING: typings.grpcGrpcJs.buildSrcConnectivityStateMod.ConnectivityState.CONNECTING & Double = js.native
    
    /* 0 */ val IDLE: typings.grpcGrpcJs.buildSrcConnectivityStateMod.ConnectivityState.IDLE & Double = js.native
    
    /* 2 */ val READY: typings.grpcGrpcJs.buildSrcConnectivityStateMod.ConnectivityState.READY & Double = js.native
    
    /* 4 */ val SHUTDOWN: typings.grpcGrpcJs.buildSrcConnectivityStateMod.ConnectivityState.SHUTDOWN & Double = js.native
    
    /* 3 */ val TRANSIENT_FAILURE: typings.grpcGrpcJs.buildSrcConnectivityStateMod.ConnectivityState.TRANSIENT_FAILURE & Double = js.native
  }
  
  object credentials {
    
    @JSImport("@grpc/grpc-js", "credentials")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Combine any number of CallCredentials into a single CallCredentials
      * object.
      * @param first The first CallCredentials object.
      * @param additional Any number of additional CallCredentials objects.
      * @return The resulting CallCredentials object.
      */
    inline def combineCallCredentials(
      first: typings.grpcGrpcJs.buildSrcCallCredentialsMod.CallCredentials,
      additional: typings.grpcGrpcJs.buildSrcCallCredentialsMod.CallCredentials*
    ): typings.grpcGrpcJs.buildSrcCallCredentialsMod.CallCredentials = ^.asInstanceOf[js.Dynamic].applyDynamic("combineCallCredentials")(scala.List(first.asInstanceOf[js.Any]).`++`(additional.asInstanceOf[Seq[js.Any]])*).asInstanceOf[typings.grpcGrpcJs.buildSrcCallCredentialsMod.CallCredentials]
    
    /**
      * Combine a ChannelCredentials with any number of CallCredentials into a
      * single ChannelCredentials object.
      * @param channelCredentials The ChannelCredentials object.
      * @param callCredentials Any number of CallCredentials objects.
      * @return The resulting ChannelCredentials object.
      */
    inline def combineChannelCredentials(
      channelCredentials: typings.grpcGrpcJs.buildSrcChannelCredentialsMod.ChannelCredentials,
      callCredentials: typings.grpcGrpcJs.buildSrcCallCredentialsMod.CallCredentials*
    ): typings.grpcGrpcJs.buildSrcChannelCredentialsMod.ChannelCredentials = ^.asInstanceOf[js.Dynamic].applyDynamic("combineChannelCredentials")(scala.List(channelCredentials.asInstanceOf[js.Any]).`++`(callCredentials.asInstanceOf[Seq[js.Any]])*).asInstanceOf[typings.grpcGrpcJs.buildSrcChannelCredentialsMod.ChannelCredentials]
    
    @JSImport("@grpc/grpc-js", "credentials.createEmpty")
    @js.native
    def createEmpty: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof CallCredentials.createEmpty */ Any = js.native
    inline def createEmpty_=(
      x: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof CallCredentials.createEmpty */ Any
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("createEmpty")(x.asInstanceOf[js.Any])
    
    @JSImport("@grpc/grpc-js", "credentials.createFromGoogleCredential")
    @js.native
    def createFromGoogleCredential: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof CallCredentials.createFromGoogleCredential */ Any = js.native
    inline def createFromGoogleCredential_=(
      x: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof CallCredentials.createFromGoogleCredential */ Any
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("createFromGoogleCredential")(x.asInstanceOf[js.Any])
    
    @JSImport("@grpc/grpc-js", "credentials.createFromMetadataGenerator")
    @js.native
    def createFromMetadataGenerator: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof CallCredentials.createFromMetadataGenerator */ Any = js.native
    inline def createFromMetadataGenerator_=(
      x: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof CallCredentials.createFromMetadataGenerator */ Any
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("createFromMetadataGenerator")(x.asInstanceOf[js.Any])
    
    @JSImport("@grpc/grpc-js", "credentials.createFromSecureContext")
    @js.native
    def createFromSecureContext: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ChannelCredentials.createFromSecureContext */ Any = js.native
    inline def createFromSecureContext_=(
      x: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ChannelCredentials.createFromSecureContext */ Any
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("createFromSecureContext")(x.asInstanceOf[js.Any])
    
    @JSImport("@grpc/grpc-js", "credentials.createInsecure")
    @js.native
    def createInsecure: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ChannelCredentials.createInsecure */ Any = js.native
    inline def createInsecure_=(
      x: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ChannelCredentials.createInsecure */ Any
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("createInsecure")(x.asInstanceOf[js.Any])
    
    @JSImport("@grpc/grpc-js", "credentials.createSsl")
    @js.native
    def createSsl: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ChannelCredentials.createSsl */ Any = js.native
    inline def createSsl_=(
      x: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ChannelCredentials.createSsl */ Any
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("createSsl")(x.asInstanceOf[js.Any])
  }
  
  object experimental {
    
    @JSImport("@grpc/grpc-js", "experimental")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@grpc/grpc-js", "experimental.BackoffTimeout")
    @js.native
    open class BackoffTimeout protected ()
      extends typings.grpcGrpcJs.buildSrcExperimentalMod.BackoffTimeout {
      def this(callback: js.Function0[Unit]) = this()
      def this(callback: js.Function0[Unit], options: BackoffOptions) = this()
    }
    
    /* note: abstract class */ @JSImport("@grpc/grpc-js", "experimental.BaseFilter")
    @js.native
    open class BaseFilter ()
      extends typings.grpcGrpcJs.buildSrcExperimentalMod.BaseFilter
    
    /* note: abstract class */ @JSImport("@grpc/grpc-js", "experimental.BaseSubchannelWrapper")
    @js.native
    open class BaseSubchannelWrapper protected ()
      extends typings.grpcGrpcJs.buildSrcExperimentalMod.BaseSubchannelWrapper {
      def this(child: SubchannelInterface) = this()
    }
    
    @JSImport("@grpc/grpc-js", "experimental.ChildLoadBalancerHandler")
    @js.native
    open class ChildLoadBalancerHandler protected ()
      extends typings.grpcGrpcJs.buildSrcExperimentalMod.ChildLoadBalancerHandler {
      def this(channelControlHelper: ChannelControlHelper) = this()
    }
    
    @JSImport("@grpc/grpc-js", "experimental.FilterStackFactory")
    @js.native
    open class FilterStackFactory protected ()
      extends typings.grpcGrpcJs.buildSrcExperimentalMod.FilterStackFactory {
      def this(factories: js.Array[FilterFactory[Filter]]) = this()
    }
    
    @JSImport("@grpc/grpc-js", "experimental.OutlierDetectionLoadBalancingConfig")
    @js.native
    open class OutlierDetectionLoadBalancingConfig protected ()
      extends typings.grpcGrpcJs.buildSrcExperimentalMod.OutlierDetectionLoadBalancingConfig {
      def this(
        intervalMs: Double | Null,
        baseEjectionTimeMs: Double | Null,
        maxEjectionTimeMs: Double | Null,
        maxEjectionPercent: Double | Null,
        successRateEjection: PartialSuccessRateEjectio | Null,
        failurePercentageEjection: PartialFailurePercentageE | Null,
        childPolicy: js.Array[LoadBalancingConfig]
      ) = this()
    }
    /* static members */
    object OutlierDetectionLoadBalancingConfig {
      
      @JSImport("@grpc/grpc-js", "experimental.OutlierDetectionLoadBalancingConfig")
      @js.native
      val ^ : js.Any = js.native
      
      inline def createFromJson(obj: Any): typings.grpcGrpcJs.buildSrcLoadBalancerOutlierDetectionMod.OutlierDetectionLoadBalancingConfig = ^.asInstanceOf[js.Dynamic].applyDynamic("createFromJson")(obj.asInstanceOf[js.Any]).asInstanceOf[typings.grpcGrpcJs.buildSrcLoadBalancerOutlierDetectionMod.OutlierDetectionLoadBalancingConfig]
    }
    
    @JSImport("@grpc/grpc-js", "experimental.PickResultType")
    @js.native
    object PickResultType extends StObject {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[typings.grpcGrpcJs.buildSrcPickerMod.PickResultType & Double] = js.native
      
      /* 0 */ val COMPLETE: typings.grpcGrpcJs.buildSrcPickerMod.PickResultType.COMPLETE & Double = js.native
      
      /* 3 */ val DROP: typings.grpcGrpcJs.buildSrcPickerMod.PickResultType.DROP & Double = js.native
      
      /* 1 */ val QUEUE: typings.grpcGrpcJs.buildSrcPickerMod.PickResultType.QUEUE & Double = js.native
      
      /* 2 */ val TRANSIENT_FAILURE: typings.grpcGrpcJs.buildSrcPickerMod.PickResultType.TRANSIENT_FAILURE & Double = js.native
    }
    
    @JSImport("@grpc/grpc-js", "experimental.QueuePicker")
    @js.native
    open class QueuePicker protected ()
      extends typings.grpcGrpcJs.buildSrcExperimentalMod.QueuePicker {
      def this(loadBalancer: LoadBalancer) = this()
    }
    
    @JSImport("@grpc/grpc-js", "experimental.UnavailablePicker")
    @js.native
    open class UnavailablePicker ()
      extends typings.grpcGrpcJs.buildSrcExperimentalMod.UnavailablePicker {
      def this(status: StatusObject) = this()
    }
    
    inline def createChildChannelControlHelper(parent: ChannelControlHelper, overrides: PartialChannelControlHelp): ChannelControlHelper = (^.asInstanceOf[js.Dynamic].applyDynamic("createChildChannelControlHelper")(parent.asInstanceOf[js.Any], overrides.asInstanceOf[js.Any])).asInstanceOf[ChannelControlHelper]
    
    inline def durationToMs(duration: Duration): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("durationToMs")(duration.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    inline def getFirstUsableConfig(configs: js.Array[LoadBalancingConfig]): LoadBalancingConfig = ^.asInstanceOf[js.Dynamic].applyDynamic("getFirstUsableConfig")(configs.asInstanceOf[js.Any]).asInstanceOf[LoadBalancingConfig]
    
    inline def getFirstUsableConfig_true(configs: js.Array[LoadBalancingConfig], fallbackTodefault: `true`): LoadBalancingConfig = (^.asInstanceOf[js.Dynamic].applyDynamic("getFirstUsableConfig")(configs.asInstanceOf[js.Any], fallbackTodefault.asInstanceOf[js.Any])).asInstanceOf[LoadBalancingConfig]
    
    inline def log(severity: LogVerbosity, args: Any*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("log")(scala.List(severity.asInstanceOf[js.Any]).`++`(args.asInstanceOf[Seq[js.Any]])*).asInstanceOf[Unit]
    
    inline def registerAdminService(getServiceDefinition: GetServiceDefinition, getHandlers: GetHandlers): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("registerAdminService")(getServiceDefinition.asInstanceOf[js.Any], getHandlers.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def registerLoadBalancerType(
      typeName: String,
      loadBalancerType: LoadBalancerConstructor,
      loadBalancingConfigType: LoadBalancingConfigConstructor
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("registerLoadBalancerType")(typeName.asInstanceOf[js.Any], loadBalancerType.asInstanceOf[js.Any], loadBalancingConfigType.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def registerResolver(scheme: String, resolverClass: ResolverConstructor): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("registerResolver")(scheme.asInstanceOf[js.Any], resolverClass.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def subchannelAddressToString(address: SubchannelAddress): String = ^.asInstanceOf[js.Dynamic].applyDynamic("subchannelAddressToString")(address.asInstanceOf[js.Any]).asInstanceOf[String]
    
    inline def trace(severity: LogVerbosity, tracer: String, text: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("trace")(severity.asInstanceOf[js.Any], tracer.asInstanceOf[js.Any], text.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def uriToString(uri: GrpcUri): String = ^.asInstanceOf[js.Dynamic].applyDynamic("uriToString")(uri.asInstanceOf[js.Any]).asInstanceOf[String]
    
    inline def validateLoadBalancingConfig(obj: Any): LoadBalancingConfig = ^.asInstanceOf[js.Dynamic].applyDynamic("validateLoadBalancingConfig")(obj.asInstanceOf[js.Any]).asInstanceOf[LoadBalancingConfig]
  }
  
  inline def getChannelzHandlers(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getChannelzHandlers")().asInstanceOf[Any]
  
  inline def getChannelzServiceDefinition(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getChannelzServiceDefinition")().asInstanceOf[Any]
  
  inline def getClientChannel(client: typings.grpcGrpcJs.buildSrcClientMod.Client): typings.grpcGrpcJs.buildSrcChannelMod.Channel = ^.asInstanceOf[js.Dynamic].applyDynamic("getClientChannel")(client.asInstanceOf[js.Any]).asInstanceOf[typings.grpcGrpcJs.buildSrcChannelMod.Channel]
  
  inline def load(filename: Any, format: Any, options: Any): scala.Nothing = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(filename.asInstanceOf[js.Any], format.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[scala.Nothing]
  
  inline def loadObject(value: Any, options: Any): scala.Nothing = (^.asInstanceOf[js.Dynamic].applyDynamic("loadObject")(value.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[scala.Nothing]
  
  inline def loadPackageDefinition(packageDef: PackageDefinition): GrpcObject = ^.asInstanceOf[js.Dynamic].applyDynamic("loadPackageDefinition")(packageDef.asInstanceOf[js.Any]).asInstanceOf[GrpcObject]
  
  @JSImport("@grpc/grpc-js", "logVerbosity")
  @js.native
  object logVerbosity extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[LogVerbosity & Double] = js.native
    
    /* 0 */ val DEBUG: typings.grpcGrpcJs.buildSrcConstantsMod.LogVerbosity.DEBUG & Double = js.native
    
    /* 2 */ val ERROR: typings.grpcGrpcJs.buildSrcConstantsMod.LogVerbosity.ERROR & Double = js.native
    
    /* 1 */ val INFO: typings.grpcGrpcJs.buildSrcConstantsMod.LogVerbosity.INFO & Double = js.native
    
    /* 3 */ val NONE: typings.grpcGrpcJs.buildSrcConstantsMod.LogVerbosity.NONE & Double = js.native
  }
  
  inline def makeClientConstructor(methods: js.Object, serviceName: String): ServiceClientConstructor = (^.asInstanceOf[js.Dynamic].applyDynamic("makeClientConstructor")(methods.asInstanceOf[js.Any], serviceName.asInstanceOf[js.Any])).asInstanceOf[ServiceClientConstructor]
  inline def makeClientConstructor(methods: js.Object, serviceName: String, classOptions: js.Object): ServiceClientConstructor = (^.asInstanceOf[js.Dynamic].applyDynamic("makeClientConstructor")(methods.asInstanceOf[js.Any], serviceName.asInstanceOf[js.Any], classOptions.asInstanceOf[js.Any])).asInstanceOf[ServiceClientConstructor]
  
  inline def makeGenericClientConstructor(methods: js.Object, serviceName: String): ServiceClientConstructor = (^.asInstanceOf[js.Dynamic].applyDynamic("makeGenericClientConstructor")(methods.asInstanceOf[js.Any], serviceName.asInstanceOf[js.Any])).asInstanceOf[ServiceClientConstructor]
  inline def makeGenericClientConstructor(methods: js.Object, serviceName: String, classOptions: js.Object): ServiceClientConstructor = (^.asInstanceOf[js.Dynamic].applyDynamic("makeGenericClientConstructor")(methods.asInstanceOf[js.Any], serviceName.asInstanceOf[js.Any], classOptions.asInstanceOf[js.Any])).asInstanceOf[ServiceClientConstructor]
  
  @JSImport("@grpc/grpc-js", "propagate")
  @js.native
  object propagate extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[Propagate & Double] = js.native
    
    /* 8 */ val CANCELLATION: typings.grpcGrpcJs.buildSrcConstantsMod.Propagate.CANCELLATION & Double = js.native
    
    /* 2 */ val CENSUS_STATS_CONTEXT: typings.grpcGrpcJs.buildSrcConstantsMod.Propagate.CENSUS_STATS_CONTEXT & Double = js.native
    
    /* 4 */ val CENSUS_TRACING_CONTEXT: typings.grpcGrpcJs.buildSrcConstantsMod.Propagate.CENSUS_TRACING_CONTEXT & Double = js.native
    
    /* 1 */ val DEADLINE: typings.grpcGrpcJs.buildSrcConstantsMod.Propagate.DEADLINE & Double = js.native
    
    /* 65535 */ val DEFAULTS: typings.grpcGrpcJs.buildSrcConstantsMod.Propagate.DEFAULTS & Double = js.native
  }
  
  inline def setLogVerbosity(verbosity: LogVerbosity): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setLogVerbosity")(verbosity.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def setLogger(logger: PartialConsole): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setLogger")(logger.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @JSImport("@grpc/grpc-js", "status")
  @js.native
  object status extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[Status & Double] = js.native
    
    /* 10 */ val ABORTED: typings.grpcGrpcJs.buildSrcConstantsMod.Status.ABORTED & Double = js.native
    
    /* 6 */ val ALREADY_EXISTS: typings.grpcGrpcJs.buildSrcConstantsMod.Status.ALREADY_EXISTS & Double = js.native
    
    /* 1 */ val CANCELLED: typings.grpcGrpcJs.buildSrcConstantsMod.Status.CANCELLED & Double = js.native
    
    /* 15 */ val DATA_LOSS: typings.grpcGrpcJs.buildSrcConstantsMod.Status.DATA_LOSS & Double = js.native
    
    /* 4 */ val DEADLINE_EXCEEDED: typings.grpcGrpcJs.buildSrcConstantsMod.Status.DEADLINE_EXCEEDED & Double = js.native
    
    /* 9 */ val FAILED_PRECONDITION: typings.grpcGrpcJs.buildSrcConstantsMod.Status.FAILED_PRECONDITION & Double = js.native
    
    /* 13 */ val INTERNAL: typings.grpcGrpcJs.buildSrcConstantsMod.Status.INTERNAL & Double = js.native
    
    /* 3 */ val INVALID_ARGUMENT: typings.grpcGrpcJs.buildSrcConstantsMod.Status.INVALID_ARGUMENT & Double = js.native
    
    /* 5 */ val NOT_FOUND: typings.grpcGrpcJs.buildSrcConstantsMod.Status.NOT_FOUND & Double = js.native
    
    /* 0 */ val OK: typings.grpcGrpcJs.buildSrcConstantsMod.Status.OK & Double = js.native
    
    /* 11 */ val OUT_OF_RANGE: typings.grpcGrpcJs.buildSrcConstantsMod.Status.OUT_OF_RANGE & Double = js.native
    
    /* 7 */ val PERMISSION_DENIED: typings.grpcGrpcJs.buildSrcConstantsMod.Status.PERMISSION_DENIED & Double = js.native
    
    /* 8 */ val RESOURCE_EXHAUSTED: typings.grpcGrpcJs.buildSrcConstantsMod.Status.RESOURCE_EXHAUSTED & Double = js.native
    
    /* 16 */ val UNAUTHENTICATED: typings.grpcGrpcJs.buildSrcConstantsMod.Status.UNAUTHENTICATED & Double = js.native
    
    /* 14 */ val UNAVAILABLE: typings.grpcGrpcJs.buildSrcConstantsMod.Status.UNAVAILABLE & Double = js.native
    
    /* 12 */ val UNIMPLEMENTED: typings.grpcGrpcJs.buildSrcConstantsMod.Status.UNIMPLEMENTED & Double = js.native
    
    /* 2 */ val UNKNOWN: typings.grpcGrpcJs.buildSrcConstantsMod.Status.UNKNOWN & Double = js.native
  }
  
  inline def waitForClientReady(
    client: typings.grpcGrpcJs.buildSrcClientMod.Client,
    deadline: js.Date,
    callback: js.Function1[/* error */ js.UndefOr[js.Error], Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("waitForClientReady")(client.asInstanceOf[js.Any], deadline.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def waitForClientReady(
    client: typings.grpcGrpcJs.buildSrcClientMod.Client,
    deadline: Double,
    callback: js.Function1[/* error */ js.UndefOr[js.Error], Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("waitForClientReady")(client.asInstanceOf[js.Any], deadline.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  type Call = ClientUnaryCall | ClientReadableStream[Any] | ClientWritableStream[Any] | (ClientDuplexStream[Any, Any])
}
