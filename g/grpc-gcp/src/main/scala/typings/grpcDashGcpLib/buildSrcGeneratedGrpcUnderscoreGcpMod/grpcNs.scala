package typings
package grpcDashGcpLib.buildSrcGeneratedGrpcUnderscoreGcpMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("grpc-gcp/build/src/generated/grpc_gcp", "grpc")
@js.native
object grpcNs extends js.Object {
  /** Namespace gcp. */
  @JSName("gcp")
  @js.native
  object gcpNs extends js.Object {
    /** Represents an AffinityConfig. */
    @js.native
    /**
      * Constructs a new AffinityConfig.
      * @param [properties] Properties to set
      */
    class AffinityConfig () extends IAffinityConfig {
      def this(properties: IAffinityConfig) = this()
      /** AffinityConfig affinityKey. */
      @JSName("affinityKey")
      var affinityKey_AffinityConfig: java.lang.String = js.native
      /** AffinityConfig command. */
      @JSName("command")
      var command_AffinityConfig: grpcDashGcpLib.buildSrcGeneratedGrpcUnderscoreGcpMod.grpcNs.gcpNs.AffinityConfigNs.Command = js.native
      /**
        * Converts this AffinityConfig to JSON.
        * @returns JSON object
        */
      def toJSON(): org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
    }
    
    /** Represents an ApiConfig. */
    @js.native
    /**
      * Constructs a new ApiConfig.
      * @param [properties] Properties to set
      */
    class ApiConfig () extends IApiConfig {
      def this(properties: IApiConfig) = this()
      /** ApiConfig method. */
      @JSName("method")
      var method_ApiConfig: js.Array[IMethodConfig] = js.native
      /**
        * Converts this ApiConfig to JSON.
        * @returns JSON object
        */
      def toJSON(): org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
    }
    
    /** Represents a ChannelPoolConfig. */
    @js.native
    /**
      * Constructs a new ChannelPoolConfig.
      * @param [properties] Properties to set
      */
    class ChannelPoolConfig () extends IChannelPoolConfig {
      def this(properties: IChannelPoolConfig) = this()
      /** ChannelPoolConfig idleTimeout. */
      @JSName("idleTimeout")
      var idleTimeout_ChannelPoolConfig: scala.Double | (/* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Long */ js.Any) = js.native
      /** ChannelPoolConfig maxConcurrentStreamsLowWatermark. */
      @JSName("maxConcurrentStreamsLowWatermark")
      var maxConcurrentStreamsLowWatermark_ChannelPoolConfig: scala.Double = js.native
      /** ChannelPoolConfig maxSize. */
      @JSName("maxSize")
      var maxSize_ChannelPoolConfig: scala.Double = js.native
      /**
        * Converts this ChannelPoolConfig to JSON.
        * @returns JSON object
        */
      def toJSON(): org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
    }
    
    /** Properties of an AffinityConfig. */
    trait IAffinityConfig extends js.Object {
      /** AffinityConfig affinityKey */
      var affinityKey: js.UndefOr[java.lang.String | scala.Null] = js.undefined
      /** AffinityConfig command */
      var command: js.UndefOr[
            grpcDashGcpLib.buildSrcGeneratedGrpcUnderscoreGcpMod.grpcNs.gcpNs.AffinityConfigNs.Command | scala.Null
          ] = js.undefined
    }
    
    /** Properties of an ApiConfig. */
    trait IApiConfig extends js.Object {
      /** ApiConfig channelPool */
      var channelPool: js.UndefOr[IChannelPoolConfig | scala.Null] = js.undefined
      /** ApiConfig method */
      var method: js.UndefOr[js.Array[IMethodConfig] | scala.Null] = js.undefined
    }
    
    /** Properties of a ChannelPoolConfig. */
    trait IChannelPoolConfig extends js.Object {
      /** ChannelPoolConfig idleTimeout */
      var idleTimeout: js.UndefOr[
            scala.Double | (/* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Long */ js.Any) | scala.Null
          ] = js.undefined
      /** ChannelPoolConfig maxConcurrentStreamsLowWatermark */
      var maxConcurrentStreamsLowWatermark: js.UndefOr[scala.Double | scala.Null] = js.undefined
      /** ChannelPoolConfig maxSize */
      var maxSize: js.UndefOr[scala.Double | scala.Null] = js.undefined
    }
    
    /** Properties of a MethodConfig. */
    trait IMethodConfig extends js.Object {
      /** MethodConfig affinity */
      var affinity: js.UndefOr[IAffinityConfig | scala.Null] = js.undefined
      /** MethodConfig name */
      var name: js.UndefOr[js.Array[java.lang.String] | scala.Null] = js.undefined
    }
    
    /** Represents a MethodConfig. */
    @js.native
    /**
      * Constructs a new MethodConfig.
      * @param [properties] Properties to set
      */
    class MethodConfig () extends IMethodConfig {
      def this(properties: IMethodConfig) = this()
      /** MethodConfig name. */
      @JSName("name")
      var name_MethodConfig: js.Array[java.lang.String] = js.native
      /**
        * Converts this MethodConfig to JSON.
        * @returns JSON object
        */
      def toJSON(): org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
    }
    
    /* static members */
    @js.native
    object AffinityConfig extends js.Object {
      /**
        * Creates a new AffinityConfig instance using the specified properties.
        * @param [properties] Properties to set
        * @returns AffinityConfig instance
        */
      def create(): grpcDashGcpLib.buildSrcGeneratedGrpcUnderscoreGcpMod.grpcNs.gcpNs.AffinityConfig = js.native
      def create(properties: grpcDashGcpLib.buildSrcGeneratedGrpcUnderscoreGcpMod.grpcNs.gcpNs.IAffinityConfig): grpcDashGcpLib.buildSrcGeneratedGrpcUnderscoreGcpMod.grpcNs.gcpNs.AffinityConfig = js.native
      /**
        * Decodes an AffinityConfig message from the specified reader or buffer.
        * @param reader Reader or buffer to decode from
        * @param [length] Message length if known beforehand
        * @returns AffinityConfig
        * @throws {Error} If the payload is not a reader or valid buffer
        * @throws {$protobuf.util.ProtocolError} If required fields are missing
        */
      def decode(reader: protobufjsLib.protobufjsMod.Reader): grpcDashGcpLib.buildSrcGeneratedGrpcUnderscoreGcpMod.grpcNs.gcpNs.AffinityConfig = js.native
      def decode(reader: protobufjsLib.protobufjsMod.Reader, length: scala.Double): grpcDashGcpLib.buildSrcGeneratedGrpcUnderscoreGcpMod.grpcNs.gcpNs.AffinityConfig = js.native
      def decode(reader: stdLib.Uint8Array): grpcDashGcpLib.buildSrcGeneratedGrpcUnderscoreGcpMod.grpcNs.gcpNs.AffinityConfig = js.native
      def decode(reader: stdLib.Uint8Array, length: scala.Double): grpcDashGcpLib.buildSrcGeneratedGrpcUnderscoreGcpMod.grpcNs.gcpNs.AffinityConfig = js.native
      /**
        * Decodes an AffinityConfig message from the specified reader or buffer, length delimited.
        * @param reader Reader or buffer to decode from
        * @returns AffinityConfig
        * @throws {Error} If the payload is not a reader or valid buffer
        * @throws {$protobuf.util.ProtocolError} If required fields are missing
        */
      def decodeDelimited(reader: protobufjsLib.protobufjsMod.Reader): grpcDashGcpLib.buildSrcGeneratedGrpcUnderscoreGcpMod.grpcNs.gcpNs.AffinityConfig = js.native
      def decodeDelimited(reader: stdLib.Uint8Array): grpcDashGcpLib.buildSrcGeneratedGrpcUnderscoreGcpMod.grpcNs.gcpNs.AffinityConfig = js.native
      /**
        * Encodes the specified AffinityConfig message. Does not implicitly {@link grpc.gcp.AffinityConfig.verify|verify} messages.
        * @param message AffinityConfig message or plain object to encode
        * @param [writer] Writer to encode to
        * @returns Writer
        */
      def encode(message: grpcDashGcpLib.buildSrcGeneratedGrpcUnderscoreGcpMod.grpcNs.gcpNs.IAffinityConfig): protobufjsLib.protobufjsMod.Writer = js.native
      def encode(
        message: grpcDashGcpLib.buildSrcGeneratedGrpcUnderscoreGcpMod.grpcNs.gcpNs.IAffinityConfig,
        writer: protobufjsLib.protobufjsMod.Writer
      ): protobufjsLib.protobufjsMod.Writer = js.native
      /**
        * Encodes the specified AffinityConfig message, length delimited. Does not implicitly {@link grpc.gcp.AffinityConfig.verify|verify} messages.
        * @param message AffinityConfig message or plain object to encode
        * @param [writer] Writer to encode to
        * @returns Writer
        */
      def encodeDelimited(message: grpcDashGcpLib.buildSrcGeneratedGrpcUnderscoreGcpMod.grpcNs.gcpNs.IAffinityConfig): protobufjsLib.protobufjsMod.Writer = js.native
      def encodeDelimited(
        message: grpcDashGcpLib.buildSrcGeneratedGrpcUnderscoreGcpMod.grpcNs.gcpNs.IAffinityConfig,
        writer: protobufjsLib.protobufjsMod.Writer
      ): protobufjsLib.protobufjsMod.Writer = js.native
      /**
        * Creates an AffinityConfig message from a plain object. Also converts values to their respective internal types.
        * @param object Plain object
        * @returns AffinityConfig
        */
      def fromObject(`object`: org.scalablytyped.runtime.StringDictionary[js.Any]): grpcDashGcpLib.buildSrcGeneratedGrpcUnderscoreGcpMod.grpcNs.gcpNs.AffinityConfig = js.native
      /**
        * Creates a plain object from an AffinityConfig message. Also converts values to other types if specified.
        * @param message AffinityConfig
        * @param [options] Conversion options
        * @returns Plain object
        */
      def toObject(message: grpcDashGcpLib.buildSrcGeneratedGrpcUnderscoreGcpMod.grpcNs.gcpNs.AffinityConfig): org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
      def toObject(
        message: grpcDashGcpLib.buildSrcGeneratedGrpcUnderscoreGcpMod.grpcNs.gcpNs.AffinityConfig,
        options: protobufjsLib.protobufjsMod.IConversionOptions
      ): org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
      /**
        * Verifies an AffinityConfig message.
        * @param message Plain object to verify
        * @returns `null` if valid, otherwise the reason why it is not
        */
      def verify(message: org.scalablytyped.runtime.StringDictionary[js.Any]): java.lang.String | scala.Null = js.native
    }
    
    @JSName("AffinityConfig")
    @js.native
    object AffinityConfigNs extends js.Object {
      @js.native
      sealed trait Command extends js.Object
      
      /** Command enum. */
      @js.native
      object Command extends js.Object {
        @js.native
        sealed trait BIND
          extends grpcDashGcpLib.buildSrcGeneratedGrpcUnderscoreGcpMod.grpcNs.gcpNs.AffinityConfigNs.Command
        
        @js.native
        sealed trait BOUND
          extends grpcDashGcpLib.buildSrcGeneratedGrpcUnderscoreGcpMod.grpcNs.gcpNs.AffinityConfigNs.Command
        
        @js.native
        sealed trait UNBIND
          extends grpcDashGcpLib.buildSrcGeneratedGrpcUnderscoreGcpMod.grpcNs.gcpNs.AffinityConfigNs.Command
        
        /* 1 */ val BIND: BIND with scala.Double = js.native
        /* 0 */ val BOUND: BOUND with scala.Double = js.native
        /* 2 */ val UNBIND: UNBIND with scala.Double = js.native
        @JSBracketAccess
        def apply(value: scala.Double): js.UndefOr[
                grpcDashGcpLib.buildSrcGeneratedGrpcUnderscoreGcpMod.grpcNs.gcpNs.AffinityConfigNs.Command with scala.Double
              ] = js.native
      }
      
    }
    
    /* static members */
    @js.native
    object ApiConfig extends js.Object {
      /**
        * Creates a new ApiConfig instance using the specified properties.
        * @param [properties] Properties to set
        * @returns ApiConfig instance
        */
      def create(): grpcDashGcpLib.buildSrcGeneratedGrpcUnderscoreGcpMod.grpcNs.gcpNs.ApiConfig = js.native
      def create(properties: grpcDashGcpLib.buildSrcGeneratedGrpcUnderscoreGcpMod.grpcNs.gcpNs.IApiConfig): grpcDashGcpLib.buildSrcGeneratedGrpcUnderscoreGcpMod.grpcNs.gcpNs.ApiConfig = js.native
      /**
        * Decodes an ApiConfig message from the specified reader or buffer.
        * @param reader Reader or buffer to decode from
        * @param [length] Message length if known beforehand
        * @returns ApiConfig
        * @throws {Error} If the payload is not a reader or valid buffer
        * @throws {$protobuf.util.ProtocolError} If required fields are missing
        */
      def decode(reader: protobufjsLib.protobufjsMod.Reader): grpcDashGcpLib.buildSrcGeneratedGrpcUnderscoreGcpMod.grpcNs.gcpNs.ApiConfig = js.native
      def decode(reader: protobufjsLib.protobufjsMod.Reader, length: scala.Double): grpcDashGcpLib.buildSrcGeneratedGrpcUnderscoreGcpMod.grpcNs.gcpNs.ApiConfig = js.native
      def decode(reader: stdLib.Uint8Array): grpcDashGcpLib.buildSrcGeneratedGrpcUnderscoreGcpMod.grpcNs.gcpNs.ApiConfig = js.native
      def decode(reader: stdLib.Uint8Array, length: scala.Double): grpcDashGcpLib.buildSrcGeneratedGrpcUnderscoreGcpMod.grpcNs.gcpNs.ApiConfig = js.native
      /**
        * Decodes an ApiConfig message from the specified reader or buffer, length delimited.
        * @param reader Reader or buffer to decode from
        * @returns ApiConfig
        * @throws {Error} If the payload is not a reader or valid buffer
        * @throws {$protobuf.util.ProtocolError} If required fields are missing
        */
      def decodeDelimited(reader: protobufjsLib.protobufjsMod.Reader): grpcDashGcpLib.buildSrcGeneratedGrpcUnderscoreGcpMod.grpcNs.gcpNs.ApiConfig = js.native
      def decodeDelimited(reader: stdLib.Uint8Array): grpcDashGcpLib.buildSrcGeneratedGrpcUnderscoreGcpMod.grpcNs.gcpNs.ApiConfig = js.native
      /**
        * Encodes the specified ApiConfig message. Does not implicitly {@link grpc.gcp.ApiConfig.verify|verify} messages.
        * @param message ApiConfig message or plain object to encode
        * @param [writer] Writer to encode to
        * @returns Writer
        */
      def encode(message: grpcDashGcpLib.buildSrcGeneratedGrpcUnderscoreGcpMod.grpcNs.gcpNs.IApiConfig): protobufjsLib.protobufjsMod.Writer = js.native
      def encode(
        message: grpcDashGcpLib.buildSrcGeneratedGrpcUnderscoreGcpMod.grpcNs.gcpNs.IApiConfig,
        writer: protobufjsLib.protobufjsMod.Writer
      ): protobufjsLib.protobufjsMod.Writer = js.native
      /**
        * Encodes the specified ApiConfig message, length delimited. Does not implicitly {@link grpc.gcp.ApiConfig.verify|verify} messages.
        * @param message ApiConfig message or plain object to encode
        * @param [writer] Writer to encode to
        * @returns Writer
        */
      def encodeDelimited(message: grpcDashGcpLib.buildSrcGeneratedGrpcUnderscoreGcpMod.grpcNs.gcpNs.IApiConfig): protobufjsLib.protobufjsMod.Writer = js.native
      def encodeDelimited(
        message: grpcDashGcpLib.buildSrcGeneratedGrpcUnderscoreGcpMod.grpcNs.gcpNs.IApiConfig,
        writer: protobufjsLib.protobufjsMod.Writer
      ): protobufjsLib.protobufjsMod.Writer = js.native
      /**
        * Creates an ApiConfig message from a plain object. Also converts values to their respective internal types.
        * @param object Plain object
        * @returns ApiConfig
        */
      def fromObject(`object`: org.scalablytyped.runtime.StringDictionary[js.Any]): grpcDashGcpLib.buildSrcGeneratedGrpcUnderscoreGcpMod.grpcNs.gcpNs.ApiConfig = js.native
      /**
        * Creates a plain object from an ApiConfig message. Also converts values to other types if specified.
        * @param message ApiConfig
        * @param [options] Conversion options
        * @returns Plain object
        */
      def toObject(message: grpcDashGcpLib.buildSrcGeneratedGrpcUnderscoreGcpMod.grpcNs.gcpNs.ApiConfig): org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
      def toObject(
        message: grpcDashGcpLib.buildSrcGeneratedGrpcUnderscoreGcpMod.grpcNs.gcpNs.ApiConfig,
        options: protobufjsLib.protobufjsMod.IConversionOptions
      ): org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
      /**
        * Verifies an ApiConfig message.
        * @param message Plain object to verify
        * @returns `null` if valid, otherwise the reason why it is not
        */
      def verify(message: org.scalablytyped.runtime.StringDictionary[js.Any]): java.lang.String | scala.Null = js.native
    }
    
    /* static members */
    @js.native
    object ChannelPoolConfig extends js.Object {
      /**
        * Creates a new ChannelPoolConfig instance using the specified properties.
        * @param [properties] Properties to set
        * @returns ChannelPoolConfig instance
        */
      def create(): grpcDashGcpLib.buildSrcGeneratedGrpcUnderscoreGcpMod.grpcNs.gcpNs.ChannelPoolConfig = js.native
      def create(properties: grpcDashGcpLib.buildSrcGeneratedGrpcUnderscoreGcpMod.grpcNs.gcpNs.IChannelPoolConfig): grpcDashGcpLib.buildSrcGeneratedGrpcUnderscoreGcpMod.grpcNs.gcpNs.ChannelPoolConfig = js.native
      /**
        * Decodes a ChannelPoolConfig message from the specified reader or buffer.
        * @param reader Reader or buffer to decode from
        * @param [length] Message length if known beforehand
        * @returns ChannelPoolConfig
        * @throws {Error} If the payload is not a reader or valid buffer
        * @throws {$protobuf.util.ProtocolError} If required fields are missing
        */
      def decode(reader: protobufjsLib.protobufjsMod.Reader): grpcDashGcpLib.buildSrcGeneratedGrpcUnderscoreGcpMod.grpcNs.gcpNs.ChannelPoolConfig = js.native
      def decode(reader: protobufjsLib.protobufjsMod.Reader, length: scala.Double): grpcDashGcpLib.buildSrcGeneratedGrpcUnderscoreGcpMod.grpcNs.gcpNs.ChannelPoolConfig = js.native
      def decode(reader: stdLib.Uint8Array): grpcDashGcpLib.buildSrcGeneratedGrpcUnderscoreGcpMod.grpcNs.gcpNs.ChannelPoolConfig = js.native
      def decode(reader: stdLib.Uint8Array, length: scala.Double): grpcDashGcpLib.buildSrcGeneratedGrpcUnderscoreGcpMod.grpcNs.gcpNs.ChannelPoolConfig = js.native
      /**
        * Decodes a ChannelPoolConfig message from the specified reader or buffer, length delimited.
        * @param reader Reader or buffer to decode from
        * @returns ChannelPoolConfig
        * @throws {Error} If the payload is not a reader or valid buffer
        * @throws {$protobuf.util.ProtocolError} If required fields are missing
        */
      def decodeDelimited(reader: protobufjsLib.protobufjsMod.Reader): grpcDashGcpLib.buildSrcGeneratedGrpcUnderscoreGcpMod.grpcNs.gcpNs.ChannelPoolConfig = js.native
      def decodeDelimited(reader: stdLib.Uint8Array): grpcDashGcpLib.buildSrcGeneratedGrpcUnderscoreGcpMod.grpcNs.gcpNs.ChannelPoolConfig = js.native
      /**
        * Encodes the specified ChannelPoolConfig message. Does not implicitly {@link grpc.gcp.ChannelPoolConfig.verify|verify} messages.
        * @param message ChannelPoolConfig message or plain object to encode
        * @param [writer] Writer to encode to
        * @returns Writer
        */
      def encode(message: grpcDashGcpLib.buildSrcGeneratedGrpcUnderscoreGcpMod.grpcNs.gcpNs.IChannelPoolConfig): protobufjsLib.protobufjsMod.Writer = js.native
      def encode(
        message: grpcDashGcpLib.buildSrcGeneratedGrpcUnderscoreGcpMod.grpcNs.gcpNs.IChannelPoolConfig,
        writer: protobufjsLib.protobufjsMod.Writer
      ): protobufjsLib.protobufjsMod.Writer = js.native
      /**
        * Encodes the specified ChannelPoolConfig message, length delimited. Does not implicitly {@link grpc.gcp.ChannelPoolConfig.verify|verify} messages.
        * @param message ChannelPoolConfig message or plain object to encode
        * @param [writer] Writer to encode to
        * @returns Writer
        */
      def encodeDelimited(message: grpcDashGcpLib.buildSrcGeneratedGrpcUnderscoreGcpMod.grpcNs.gcpNs.IChannelPoolConfig): protobufjsLib.protobufjsMod.Writer = js.native
      def encodeDelimited(
        message: grpcDashGcpLib.buildSrcGeneratedGrpcUnderscoreGcpMod.grpcNs.gcpNs.IChannelPoolConfig,
        writer: protobufjsLib.protobufjsMod.Writer
      ): protobufjsLib.protobufjsMod.Writer = js.native
      /**
        * Creates a ChannelPoolConfig message from a plain object. Also converts values to their respective internal types.
        * @param object Plain object
        * @returns ChannelPoolConfig
        */
      def fromObject(`object`: org.scalablytyped.runtime.StringDictionary[js.Any]): grpcDashGcpLib.buildSrcGeneratedGrpcUnderscoreGcpMod.grpcNs.gcpNs.ChannelPoolConfig = js.native
      /**
        * Creates a plain object from a ChannelPoolConfig message. Also converts values to other types if specified.
        * @param message ChannelPoolConfig
        * @param [options] Conversion options
        * @returns Plain object
        */
      def toObject(message: grpcDashGcpLib.buildSrcGeneratedGrpcUnderscoreGcpMod.grpcNs.gcpNs.ChannelPoolConfig): org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
      def toObject(
        message: grpcDashGcpLib.buildSrcGeneratedGrpcUnderscoreGcpMod.grpcNs.gcpNs.ChannelPoolConfig,
        options: protobufjsLib.protobufjsMod.IConversionOptions
      ): org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
      /**
        * Verifies a ChannelPoolConfig message.
        * @param message Plain object to verify
        * @returns `null` if valid, otherwise the reason why it is not
        */
      def verify(message: org.scalablytyped.runtime.StringDictionary[js.Any]): java.lang.String | scala.Null = js.native
    }
    
    /* static members */
    @js.native
    object MethodConfig extends js.Object {
      /**
        * Creates a new MethodConfig instance using the specified properties.
        * @param [properties] Properties to set
        * @returns MethodConfig instance
        */
      def create(): grpcDashGcpLib.buildSrcGeneratedGrpcUnderscoreGcpMod.grpcNs.gcpNs.MethodConfig = js.native
      def create(properties: grpcDashGcpLib.buildSrcGeneratedGrpcUnderscoreGcpMod.grpcNs.gcpNs.IMethodConfig): grpcDashGcpLib.buildSrcGeneratedGrpcUnderscoreGcpMod.grpcNs.gcpNs.MethodConfig = js.native
      /**
        * Decodes a MethodConfig message from the specified reader or buffer.
        * @param reader Reader or buffer to decode from
        * @param [length] Message length if known beforehand
        * @returns MethodConfig
        * @throws {Error} If the payload is not a reader or valid buffer
        * @throws {$protobuf.util.ProtocolError} If required fields are missing
        */
      def decode(reader: protobufjsLib.protobufjsMod.Reader): grpcDashGcpLib.buildSrcGeneratedGrpcUnderscoreGcpMod.grpcNs.gcpNs.MethodConfig = js.native
      def decode(reader: protobufjsLib.protobufjsMod.Reader, length: scala.Double): grpcDashGcpLib.buildSrcGeneratedGrpcUnderscoreGcpMod.grpcNs.gcpNs.MethodConfig = js.native
      def decode(reader: stdLib.Uint8Array): grpcDashGcpLib.buildSrcGeneratedGrpcUnderscoreGcpMod.grpcNs.gcpNs.MethodConfig = js.native
      def decode(reader: stdLib.Uint8Array, length: scala.Double): grpcDashGcpLib.buildSrcGeneratedGrpcUnderscoreGcpMod.grpcNs.gcpNs.MethodConfig = js.native
      /**
        * Decodes a MethodConfig message from the specified reader or buffer, length delimited.
        * @param reader Reader or buffer to decode from
        * @returns MethodConfig
        * @throws {Error} If the payload is not a reader or valid buffer
        * @throws {$protobuf.util.ProtocolError} If required fields are missing
        */
      def decodeDelimited(reader: protobufjsLib.protobufjsMod.Reader): grpcDashGcpLib.buildSrcGeneratedGrpcUnderscoreGcpMod.grpcNs.gcpNs.MethodConfig = js.native
      def decodeDelimited(reader: stdLib.Uint8Array): grpcDashGcpLib.buildSrcGeneratedGrpcUnderscoreGcpMod.grpcNs.gcpNs.MethodConfig = js.native
      /**
        * Encodes the specified MethodConfig message. Does not implicitly {@link grpc.gcp.MethodConfig.verify|verify} messages.
        * @param message MethodConfig message or plain object to encode
        * @param [writer] Writer to encode to
        * @returns Writer
        */
      def encode(message: grpcDashGcpLib.buildSrcGeneratedGrpcUnderscoreGcpMod.grpcNs.gcpNs.IMethodConfig): protobufjsLib.protobufjsMod.Writer = js.native
      def encode(
        message: grpcDashGcpLib.buildSrcGeneratedGrpcUnderscoreGcpMod.grpcNs.gcpNs.IMethodConfig,
        writer: protobufjsLib.protobufjsMod.Writer
      ): protobufjsLib.protobufjsMod.Writer = js.native
      /**
        * Encodes the specified MethodConfig message, length delimited. Does not implicitly {@link grpc.gcp.MethodConfig.verify|verify} messages.
        * @param message MethodConfig message or plain object to encode
        * @param [writer] Writer to encode to
        * @returns Writer
        */
      def encodeDelimited(message: grpcDashGcpLib.buildSrcGeneratedGrpcUnderscoreGcpMod.grpcNs.gcpNs.IMethodConfig): protobufjsLib.protobufjsMod.Writer = js.native
      def encodeDelimited(
        message: grpcDashGcpLib.buildSrcGeneratedGrpcUnderscoreGcpMod.grpcNs.gcpNs.IMethodConfig,
        writer: protobufjsLib.protobufjsMod.Writer
      ): protobufjsLib.protobufjsMod.Writer = js.native
      /**
        * Creates a MethodConfig message from a plain object. Also converts values to their respective internal types.
        * @param object Plain object
        * @returns MethodConfig
        */
      def fromObject(`object`: org.scalablytyped.runtime.StringDictionary[js.Any]): grpcDashGcpLib.buildSrcGeneratedGrpcUnderscoreGcpMod.grpcNs.gcpNs.MethodConfig = js.native
      /**
        * Creates a plain object from a MethodConfig message. Also converts values to other types if specified.
        * @param message MethodConfig
        * @param [options] Conversion options
        * @returns Plain object
        */
      def toObject(message: grpcDashGcpLib.buildSrcGeneratedGrpcUnderscoreGcpMod.grpcNs.gcpNs.MethodConfig): org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
      def toObject(
        message: grpcDashGcpLib.buildSrcGeneratedGrpcUnderscoreGcpMod.grpcNs.gcpNs.MethodConfig,
        options: protobufjsLib.protobufjsMod.IConversionOptions
      ): org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
      /**
        * Verifies a MethodConfig message.
        * @param message Plain object to verify
        * @returns `null` if valid, otherwise the reason why it is not
        */
      def verify(message: org.scalablytyped.runtime.StringDictionary[js.Any]): java.lang.String | scala.Null = js.native
    }
    
  }
  
}

