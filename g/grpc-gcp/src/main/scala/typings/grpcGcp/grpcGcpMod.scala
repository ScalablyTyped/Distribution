package typings.grpcGcp

import org.scalablytyped.runtime.StringDictionary
import typings.grpcGcp.grpcGcpMod.grpc.gcp.AffinityConfig.Command
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object grpcGcpMod {
  
  object grpc {
    
    /** Namespace gcp. */
    object gcp {
      
      /** Represents an AffinityConfig. */
      @JSImport("grpc-gcp/build/src/generated/grpc_gcp", "grpc.gcp.AffinityConfig")
      @js.native
      /**
        * Constructs a new AffinityConfig.
        * @param [properties] Properties to set
        */
      open class AffinityConfig ()
        extends StObject
           with IAffinityConfig {
        def this(properties: IAffinityConfig) = this()
        
        /** AffinityConfig affinityKey. */
        @JSName("affinityKey")
        var affinityKey_AffinityConfig: String = js.native
        
        /** AffinityConfig command. */
        @JSName("command")
        var command_AffinityConfig: Command = js.native
        
        /**
          * Converts this AffinityConfig to JSON.
          * @returns JSON object
          */
        def toJSON(): StringDictionary[Any] = js.native
      }
      object AffinityConfig {
        
        @JSImport("grpc-gcp/build/src/generated/grpc_gcp", "grpc.gcp.AffinityConfig")
        @js.native
        val ^ : js.Any = js.native
        
        @js.native
        sealed trait Command extends StObject
        /** Command enum. */
        @JSImport("grpc-gcp/build/src/generated/grpc_gcp", "grpc.gcp.AffinityConfig.Command")
        @js.native
        object Command extends StObject {
          
          @JSBracketAccess
          def apply(value: Double): js.UndefOr[Command & Double] = js.native
          
          @js.native
          sealed trait BIND
            extends StObject
               with Command
          /* 1 */ val BIND: typings.grpcGcp.grpcGcpMod.grpc.gcp.AffinityConfig.Command.BIND & Double = js.native
          
          @js.native
          sealed trait BOUND
            extends StObject
               with Command
          /* 0 */ val BOUND: typings.grpcGcp.grpcGcpMod.grpc.gcp.AffinityConfig.Command.BOUND & Double = js.native
          
          @js.native
          sealed trait UNBIND
            extends StObject
               with Command
          /* 2 */ val UNBIND: typings.grpcGcp.grpcGcpMod.grpc.gcp.AffinityConfig.Command.UNBIND & Double = js.native
        }
        
        /**
          * Creates a new AffinityConfig instance using the specified properties.
          * @param [properties] Properties to set
          * @returns AffinityConfig instance
          */
        /* static member */
        inline def create(): AffinityConfig = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[AffinityConfig]
        inline def create(properties: IAffinityConfig): AffinityConfig = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[AffinityConfig]
        
        inline def decode(reader: js.typedarray.Uint8Array): AffinityConfig = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[AffinityConfig]
        inline def decode(reader: js.typedarray.Uint8Array, length: Double): AffinityConfig = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[AffinityConfig]
        /**
          * Decodes an AffinityConfig message from the specified reader or buffer.
          * @param reader Reader or buffer to decode from
          * @param [length] Message length if known beforehand
          * @returns AffinityConfig
          * @throws {Error} If the payload is not a reader or valid buffer
          * @throws {$protobuf.util.ProtocolError} If required fields are missing
          */
        /* static member */
        inline def decode(reader: Reader): AffinityConfig = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[AffinityConfig]
        inline def decode(reader: Reader, length: Double): AffinityConfig = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[AffinityConfig]
        
        inline def decodeDelimited(reader: js.typedarray.Uint8Array): AffinityConfig = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[AffinityConfig]
        /**
          * Decodes an AffinityConfig message from the specified reader or buffer, length delimited.
          * @param reader Reader or buffer to decode from
          * @returns AffinityConfig
          * @throws {Error} If the payload is not a reader or valid buffer
          * @throws {$protobuf.util.ProtocolError} If required fields are missing
          */
        /* static member */
        inline def decodeDelimited(reader: Reader): AffinityConfig = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[AffinityConfig]
        
        /**
          * Encodes the specified AffinityConfig message. Does not implicitly {@link grpc.gcp.AffinityConfig.verify|verify} messages.
          * @param message AffinityConfig message or plain object to encode
          * @param [writer] Writer to encode to
          * @returns Writer
          */
        /* static member */
        inline def encode(message: IAffinityConfig): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
        inline def encode(message: IAffinityConfig, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
        
        /**
          * Encodes the specified AffinityConfig message, length delimited. Does not implicitly {@link grpc.gcp.AffinityConfig.verify|verify} messages.
          * @param message AffinityConfig message or plain object to encode
          * @param [writer] Writer to encode to
          * @returns Writer
          */
        /* static member */
        inline def encodeDelimited(message: IAffinityConfig): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
        inline def encodeDelimited(message: IAffinityConfig, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
        
        /**
          * Creates an AffinityConfig message from a plain object. Also converts values to their respective internal types.
          * @param object Plain object
          * @returns AffinityConfig
          */
        /* static member */
        inline def fromObject(`object`: StringDictionary[Any]): AffinityConfig = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[AffinityConfig]
        
        /**
          * Creates a plain object from an AffinityConfig message. Also converts values to other types if specified.
          * @param message AffinityConfig
          * @param [options] Conversion options
          * @returns Plain object
          */
        /* static member */
        inline def toObject(message: AffinityConfig): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
        inline def toObject(message: AffinityConfig, options: IConversionOptions): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
        
        /**
          * Verifies an AffinityConfig message.
          * @param message Plain object to verify
          * @returns `null` if valid, otherwise the reason why it is not
          */
        /* static member */
        inline def verify(message: StringDictionary[Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
      }
      
      /** Represents an ApiConfig. */
      @JSImport("grpc-gcp/build/src/generated/grpc_gcp", "grpc.gcp.ApiConfig")
      @js.native
      /**
        * Constructs a new ApiConfig.
        * @param [properties] Properties to set
        */
      open class ApiConfig ()
        extends StObject
           with IApiConfig {
        def this(properties: IApiConfig) = this()
        
        /** ApiConfig method. */
        @JSName("method")
        var method_ApiConfig: js.Array[IMethodConfig] = js.native
        
        /**
          * Converts this ApiConfig to JSON.
          * @returns JSON object
          */
        def toJSON(): StringDictionary[Any] = js.native
      }
      object ApiConfig {
        
        @JSImport("grpc-gcp/build/src/generated/grpc_gcp", "grpc.gcp.ApiConfig")
        @js.native
        val ^ : js.Any = js.native
        
        /**
          * Creates a new ApiConfig instance using the specified properties.
          * @param [properties] Properties to set
          * @returns ApiConfig instance
          */
        /* static member */
        inline def create(): ApiConfig = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[ApiConfig]
        inline def create(properties: IApiConfig): ApiConfig = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[ApiConfig]
        
        inline def decode(reader: js.typedarray.Uint8Array): ApiConfig = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[ApiConfig]
        inline def decode(reader: js.typedarray.Uint8Array, length: Double): ApiConfig = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[ApiConfig]
        /**
          * Decodes an ApiConfig message from the specified reader or buffer.
          * @param reader Reader or buffer to decode from
          * @param [length] Message length if known beforehand
          * @returns ApiConfig
          * @throws {Error} If the payload is not a reader or valid buffer
          * @throws {$protobuf.util.ProtocolError} If required fields are missing
          */
        /* static member */
        inline def decode(reader: Reader): ApiConfig = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[ApiConfig]
        inline def decode(reader: Reader, length: Double): ApiConfig = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[ApiConfig]
        
        inline def decodeDelimited(reader: js.typedarray.Uint8Array): ApiConfig = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[ApiConfig]
        /**
          * Decodes an ApiConfig message from the specified reader or buffer, length delimited.
          * @param reader Reader or buffer to decode from
          * @returns ApiConfig
          * @throws {Error} If the payload is not a reader or valid buffer
          * @throws {$protobuf.util.ProtocolError} If required fields are missing
          */
        /* static member */
        inline def decodeDelimited(reader: Reader): ApiConfig = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[ApiConfig]
        
        /**
          * Encodes the specified ApiConfig message. Does not implicitly {@link grpc.gcp.ApiConfig.verify|verify} messages.
          * @param message ApiConfig message or plain object to encode
          * @param [writer] Writer to encode to
          * @returns Writer
          */
        /* static member */
        inline def encode(message: IApiConfig): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
        inline def encode(message: IApiConfig, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
        
        /**
          * Encodes the specified ApiConfig message, length delimited. Does not implicitly {@link grpc.gcp.ApiConfig.verify|verify} messages.
          * @param message ApiConfig message or plain object to encode
          * @param [writer] Writer to encode to
          * @returns Writer
          */
        /* static member */
        inline def encodeDelimited(message: IApiConfig): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
        inline def encodeDelimited(message: IApiConfig, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
        
        /**
          * Creates an ApiConfig message from a plain object. Also converts values to their respective internal types.
          * @param object Plain object
          * @returns ApiConfig
          */
        /* static member */
        inline def fromObject(`object`: StringDictionary[Any]): ApiConfig = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[ApiConfig]
        
        /**
          * Creates a plain object from an ApiConfig message. Also converts values to other types if specified.
          * @param message ApiConfig
          * @param [options] Conversion options
          * @returns Plain object
          */
        /* static member */
        inline def toObject(message: ApiConfig): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
        inline def toObject(message: ApiConfig, options: IConversionOptions): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
        
        /**
          * Verifies an ApiConfig message.
          * @param message Plain object to verify
          * @returns `null` if valid, otherwise the reason why it is not
          */
        /* static member */
        inline def verify(message: StringDictionary[Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
      }
      
      /** Represents a ChannelPoolConfig. */
      @JSImport("grpc-gcp/build/src/generated/grpc_gcp", "grpc.gcp.ChannelPoolConfig")
      @js.native
      /**
        * Constructs a new ChannelPoolConfig.
        * @param [properties] Properties to set
        */
      open class ChannelPoolConfig ()
        extends StObject
           with IChannelPoolConfig {
        def this(properties: IChannelPoolConfig) = this()
        
        /** ChannelPoolConfig debugHeaderIntervalSecs. */
        @JSName("debugHeaderIntervalSecs")
        var debugHeaderIntervalSecs_ChannelPoolConfig: Double = js.native
        
        /** ChannelPoolConfig idleTimeout. */
        @JSName("idleTimeout")
        var idleTimeout_ChannelPoolConfig: Double | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Long */ Any) = js.native
        
        /** ChannelPoolConfig maxConcurrentStreamsLowWatermark. */
        @JSName("maxConcurrentStreamsLowWatermark")
        var maxConcurrentStreamsLowWatermark_ChannelPoolConfig: Double = js.native
        
        /** ChannelPoolConfig maxSize. */
        @JSName("maxSize")
        var maxSize_ChannelPoolConfig: Double = js.native
        
        /** ChannelPoolConfig minSize. */
        @JSName("minSize")
        var minSize_ChannelPoolConfig: Double = js.native
        
        /**
          * Converts this ChannelPoolConfig to JSON.
          * @returns JSON object
          */
        def toJSON(): StringDictionary[Any] = js.native
      }
      object ChannelPoolConfig {
        
        @JSImport("grpc-gcp/build/src/generated/grpc_gcp", "grpc.gcp.ChannelPoolConfig")
        @js.native
        val ^ : js.Any = js.native
        
        /**
          * Creates a new ChannelPoolConfig instance using the specified properties.
          * @param [properties] Properties to set
          * @returns ChannelPoolConfig instance
          */
        /* static member */
        inline def create(): ChannelPoolConfig = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[ChannelPoolConfig]
        inline def create(properties: IChannelPoolConfig): ChannelPoolConfig = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[ChannelPoolConfig]
        
        inline def decode(reader: js.typedarray.Uint8Array): ChannelPoolConfig = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[ChannelPoolConfig]
        inline def decode(reader: js.typedarray.Uint8Array, length: Double): ChannelPoolConfig = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[ChannelPoolConfig]
        /**
          * Decodes a ChannelPoolConfig message from the specified reader or buffer.
          * @param reader Reader or buffer to decode from
          * @param [length] Message length if known beforehand
          * @returns ChannelPoolConfig
          * @throws {Error} If the payload is not a reader or valid buffer
          * @throws {$protobuf.util.ProtocolError} If required fields are missing
          */
        /* static member */
        inline def decode(reader: Reader): ChannelPoolConfig = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[ChannelPoolConfig]
        inline def decode(reader: Reader, length: Double): ChannelPoolConfig = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[ChannelPoolConfig]
        
        inline def decodeDelimited(reader: js.typedarray.Uint8Array): ChannelPoolConfig = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[ChannelPoolConfig]
        /**
          * Decodes a ChannelPoolConfig message from the specified reader or buffer, length delimited.
          * @param reader Reader or buffer to decode from
          * @returns ChannelPoolConfig
          * @throws {Error} If the payload is not a reader or valid buffer
          * @throws {$protobuf.util.ProtocolError} If required fields are missing
          */
        /* static member */
        inline def decodeDelimited(reader: Reader): ChannelPoolConfig = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[ChannelPoolConfig]
        
        /**
          * Encodes the specified ChannelPoolConfig message. Does not implicitly {@link grpc.gcp.ChannelPoolConfig.verify|verify} messages.
          * @param message ChannelPoolConfig message or plain object to encode
          * @param [writer] Writer to encode to
          * @returns Writer
          */
        /* static member */
        inline def encode(message: IChannelPoolConfig): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
        inline def encode(message: IChannelPoolConfig, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
        
        /**
          * Encodes the specified ChannelPoolConfig message, length delimited. Does not implicitly {@link grpc.gcp.ChannelPoolConfig.verify|verify} messages.
          * @param message ChannelPoolConfig message or plain object to encode
          * @param [writer] Writer to encode to
          * @returns Writer
          */
        /* static member */
        inline def encodeDelimited(message: IChannelPoolConfig): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
        inline def encodeDelimited(message: IChannelPoolConfig, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
        
        /**
          * Creates a ChannelPoolConfig message from a plain object. Also converts values to their respective internal types.
          * @param object Plain object
          * @returns ChannelPoolConfig
          */
        /* static member */
        inline def fromObject(`object`: StringDictionary[Any]): ChannelPoolConfig = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[ChannelPoolConfig]
        
        /**
          * Creates a plain object from a ChannelPoolConfig message. Also converts values to other types if specified.
          * @param message ChannelPoolConfig
          * @param [options] Conversion options
          * @returns Plain object
          */
        /* static member */
        inline def toObject(message: ChannelPoolConfig): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
        inline def toObject(message: ChannelPoolConfig, options: IConversionOptions): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
        
        /**
          * Verifies a ChannelPoolConfig message.
          * @param message Plain object to verify
          * @returns `null` if valid, otherwise the reason why it is not
          */
        /* static member */
        inline def verify(message: StringDictionary[Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
      }
      
      /** Represents a MethodConfig. */
      @JSImport("grpc-gcp/build/src/generated/grpc_gcp", "grpc.gcp.MethodConfig")
      @js.native
      /**
        * Constructs a new MethodConfig.
        * @param [properties] Properties to set
        */
      open class MethodConfig ()
        extends StObject
           with IMethodConfig {
        def this(properties: IMethodConfig) = this()
        
        /** MethodConfig name. */
        @JSName("name")
        var name_MethodConfig: js.Array[String] = js.native
        
        /**
          * Converts this MethodConfig to JSON.
          * @returns JSON object
          */
        def toJSON(): StringDictionary[Any] = js.native
      }
      object MethodConfig {
        
        @JSImport("grpc-gcp/build/src/generated/grpc_gcp", "grpc.gcp.MethodConfig")
        @js.native
        val ^ : js.Any = js.native
        
        /**
          * Creates a new MethodConfig instance using the specified properties.
          * @param [properties] Properties to set
          * @returns MethodConfig instance
          */
        /* static member */
        inline def create(): MethodConfig = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[MethodConfig]
        inline def create(properties: IMethodConfig): MethodConfig = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[MethodConfig]
        
        inline def decode(reader: js.typedarray.Uint8Array): MethodConfig = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[MethodConfig]
        inline def decode(reader: js.typedarray.Uint8Array, length: Double): MethodConfig = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[MethodConfig]
        /**
          * Decodes a MethodConfig message from the specified reader or buffer.
          * @param reader Reader or buffer to decode from
          * @param [length] Message length if known beforehand
          * @returns MethodConfig
          * @throws {Error} If the payload is not a reader or valid buffer
          * @throws {$protobuf.util.ProtocolError} If required fields are missing
          */
        /* static member */
        inline def decode(reader: Reader): MethodConfig = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[MethodConfig]
        inline def decode(reader: Reader, length: Double): MethodConfig = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[MethodConfig]
        
        inline def decodeDelimited(reader: js.typedarray.Uint8Array): MethodConfig = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[MethodConfig]
        /**
          * Decodes a MethodConfig message from the specified reader or buffer, length delimited.
          * @param reader Reader or buffer to decode from
          * @returns MethodConfig
          * @throws {Error} If the payload is not a reader or valid buffer
          * @throws {$protobuf.util.ProtocolError} If required fields are missing
          */
        /* static member */
        inline def decodeDelimited(reader: Reader): MethodConfig = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[MethodConfig]
        
        /**
          * Encodes the specified MethodConfig message. Does not implicitly {@link grpc.gcp.MethodConfig.verify|verify} messages.
          * @param message MethodConfig message or plain object to encode
          * @param [writer] Writer to encode to
          * @returns Writer
          */
        /* static member */
        inline def encode(message: IMethodConfig): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
        inline def encode(message: IMethodConfig, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
        
        /**
          * Encodes the specified MethodConfig message, length delimited. Does not implicitly {@link grpc.gcp.MethodConfig.verify|verify} messages.
          * @param message MethodConfig message or plain object to encode
          * @param [writer] Writer to encode to
          * @returns Writer
          */
        /* static member */
        inline def encodeDelimited(message: IMethodConfig): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
        inline def encodeDelimited(message: IMethodConfig, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
        
        /**
          * Creates a MethodConfig message from a plain object. Also converts values to their respective internal types.
          * @param object Plain object
          * @returns MethodConfig
          */
        /* static member */
        inline def fromObject(`object`: StringDictionary[Any]): MethodConfig = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[MethodConfig]
        
        /**
          * Creates a plain object from a MethodConfig message. Also converts values to other types if specified.
          * @param message MethodConfig
          * @param [options] Conversion options
          * @returns Plain object
          */
        /* static member */
        inline def toObject(message: MethodConfig): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
        inline def toObject(message: MethodConfig, options: IConversionOptions): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
        
        /**
          * Verifies a MethodConfig message.
          * @param message Plain object to verify
          * @returns `null` if valid, otherwise the reason why it is not
          */
        /* static member */
        inline def verify(message: StringDictionary[Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
      }
      
      /** Properties of an AffinityConfig. */
      trait IAffinityConfig extends StObject {
        
        /** AffinityConfig affinityKey */
        var affinityKey: js.UndefOr[String | Null] = js.undefined
        
        /** AffinityConfig command */
        var command: js.UndefOr[Command | Null] = js.undefined
      }
      object IAffinityConfig {
        
        inline def apply(): IAffinityConfig = {
          val __obj = js.Dynamic.literal()
          __obj.asInstanceOf[IAffinityConfig]
        }
        
        extension [Self <: IAffinityConfig](x: Self) {
          
          inline def setAffinityKey(value: String): Self = StObject.set(x, "affinityKey", value.asInstanceOf[js.Any])
          
          inline def setAffinityKeyNull: Self = StObject.set(x, "affinityKey", null)
          
          inline def setAffinityKeyUndefined: Self = StObject.set(x, "affinityKey", js.undefined)
          
          inline def setCommand(value: Command): Self = StObject.set(x, "command", value.asInstanceOf[js.Any])
          
          inline def setCommandNull: Self = StObject.set(x, "command", null)
          
          inline def setCommandUndefined: Self = StObject.set(x, "command", js.undefined)
        }
      }
      
      /** Properties of an ApiConfig. */
      trait IApiConfig extends StObject {
        
        /** ApiConfig channelPool */
        var channelPool: js.UndefOr[IChannelPoolConfig | Null] = js.undefined
        
        /** ApiConfig method */
        var method: js.UndefOr[js.Array[IMethodConfig] | Null] = js.undefined
      }
      object IApiConfig {
        
        inline def apply(): IApiConfig = {
          val __obj = js.Dynamic.literal()
          __obj.asInstanceOf[IApiConfig]
        }
        
        extension [Self <: IApiConfig](x: Self) {
          
          inline def setChannelPool(value: IChannelPoolConfig): Self = StObject.set(x, "channelPool", value.asInstanceOf[js.Any])
          
          inline def setChannelPoolNull: Self = StObject.set(x, "channelPool", null)
          
          inline def setChannelPoolUndefined: Self = StObject.set(x, "channelPool", js.undefined)
          
          inline def setMethod(value: js.Array[IMethodConfig]): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
          
          inline def setMethodNull: Self = StObject.set(x, "method", null)
          
          inline def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
          
          inline def setMethodVarargs(value: IMethodConfig*): Self = StObject.set(x, "method", js.Array(value*))
        }
      }
      
      /** Properties of a ChannelPoolConfig. */
      trait IChannelPoolConfig extends StObject {
        
        /** ChannelPoolConfig debugHeaderIntervalSecs */
        var debugHeaderIntervalSecs: js.UndefOr[Double | Null] = js.undefined
        
        /** ChannelPoolConfig idleTimeout */
        var idleTimeout: js.UndefOr[
                Double | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Long */ Any) | Null
              ] = js.undefined
        
        /** ChannelPoolConfig maxConcurrentStreamsLowWatermark */
        var maxConcurrentStreamsLowWatermark: js.UndefOr[Double | Null] = js.undefined
        
        /** ChannelPoolConfig maxSize */
        var maxSize: js.UndefOr[Double | Null] = js.undefined
        
        /** ChannelPoolConfig minSize */
        var minSize: js.UndefOr[Double | Null] = js.undefined
      }
      object IChannelPoolConfig {
        
        inline def apply(): IChannelPoolConfig = {
          val __obj = js.Dynamic.literal()
          __obj.asInstanceOf[IChannelPoolConfig]
        }
        
        extension [Self <: IChannelPoolConfig](x: Self) {
          
          inline def setDebugHeaderIntervalSecs(value: Double): Self = StObject.set(x, "debugHeaderIntervalSecs", value.asInstanceOf[js.Any])
          
          inline def setDebugHeaderIntervalSecsNull: Self = StObject.set(x, "debugHeaderIntervalSecs", null)
          
          inline def setDebugHeaderIntervalSecsUndefined: Self = StObject.set(x, "debugHeaderIntervalSecs", js.undefined)
          
          inline def setIdleTimeout(
            value: Double | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Long */ Any)
          ): Self = StObject.set(x, "idleTimeout", value.asInstanceOf[js.Any])
          
          inline def setIdleTimeoutNull: Self = StObject.set(x, "idleTimeout", null)
          
          inline def setIdleTimeoutUndefined: Self = StObject.set(x, "idleTimeout", js.undefined)
          
          inline def setMaxConcurrentStreamsLowWatermark(value: Double): Self = StObject.set(x, "maxConcurrentStreamsLowWatermark", value.asInstanceOf[js.Any])
          
          inline def setMaxConcurrentStreamsLowWatermarkNull: Self = StObject.set(x, "maxConcurrentStreamsLowWatermark", null)
          
          inline def setMaxConcurrentStreamsLowWatermarkUndefined: Self = StObject.set(x, "maxConcurrentStreamsLowWatermark", js.undefined)
          
          inline def setMaxSize(value: Double): Self = StObject.set(x, "maxSize", value.asInstanceOf[js.Any])
          
          inline def setMaxSizeNull: Self = StObject.set(x, "maxSize", null)
          
          inline def setMaxSizeUndefined: Self = StObject.set(x, "maxSize", js.undefined)
          
          inline def setMinSize(value: Double): Self = StObject.set(x, "minSize", value.asInstanceOf[js.Any])
          
          inline def setMinSizeNull: Self = StObject.set(x, "minSize", null)
          
          inline def setMinSizeUndefined: Self = StObject.set(x, "minSize", js.undefined)
        }
      }
      
      /** Properties of a MethodConfig. */
      trait IMethodConfig extends StObject {
        
        /** MethodConfig affinity */
        var affinity: js.UndefOr[IAffinityConfig | Null] = js.undefined
        
        /** MethodConfig name */
        var name: js.UndefOr[js.Array[String] | Null] = js.undefined
      }
      object IMethodConfig {
        
        inline def apply(): IMethodConfig = {
          val __obj = js.Dynamic.literal()
          __obj.asInstanceOf[IMethodConfig]
        }
        
        extension [Self <: IMethodConfig](x: Self) {
          
          inline def setAffinity(value: IAffinityConfig): Self = StObject.set(x, "affinity", value.asInstanceOf[js.Any])
          
          inline def setAffinityNull: Self = StObject.set(x, "affinity", null)
          
          inline def setAffinityUndefined: Self = StObject.set(x, "affinity", js.undefined)
          
          inline def setName(value: js.Array[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
          
          inline def setNameNull: Self = StObject.set(x, "name", null)
          
          inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
          
          inline def setNameVarargs(value: String*): Self = StObject.set(x, "name", js.Array(value*))
        }
      }
    }
  }
}
