package typings.grpcProtoLoader

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.StringDictionary
import typings.grpcProtoLoader.buildSrcUtilMod.Options
import typings.grpcProtoLoader.grpcProtoLoaderStrings.`Protocol Buffer 3 DescriptorProto`
import typings.grpcProtoLoader.grpcProtoLoaderStrings.`Protocol Buffer 3 EnumDescriptorProto`
import typings.long.anon.High
import typings.node.bufferMod.global.Buffer
import typings.protobufjs.extDescriptorMod.IDescriptorProto
import typings.protobufjs.extDescriptorMod.IEnumDescriptorProto
import typings.protobufjs.extDescriptorMod.IFileDescriptorSet
import typings.protobufjs.mod.INamespace
import typings.protobufjs.mod.Message
import typings.protobufjs.mod.Reader
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@grpc/proto-loader", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@grpc/proto-loader", "Long")
  @js.native
  open class Long protected ()
    extends typings.long.mod.^ {
    /**
      * Constructs a 64 bit two's-complement integer, given its low and high 32 bit values as signed integers. See the from* functions below for more convenient ways of constructing Longs.
      */
    def this(low: Double) = this()
    def this(low: Double, high: Double) = this()
    def this(low: Double, high: Double, unsigned: Boolean) = this()
    def this(low: Double, high: Unit, unsigned: Boolean) = this()
  }
  object Long {
    
    @JSImport("@grpc/proto-loader", "Long")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Maximum unsigned value.
      */
    /* static member */
    @JSImport("@grpc/proto-loader", "Long.MAX_UNSIGNED_VALUE")
    @js.native
    def MAX_UNSIGNED_VALUE: typings.long.mod.Long = js.native
    inline def MAX_UNSIGNED_VALUE_=(x: typings.long.mod.Long): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MAX_UNSIGNED_VALUE")(x.asInstanceOf[js.Any])
    
    /**
      * Maximum signed value.
      */
    /* static member */
    @JSImport("@grpc/proto-loader", "Long.MAX_VALUE")
    @js.native
    def MAX_VALUE: typings.long.mod.Long = js.native
    inline def MAX_VALUE_=(x: typings.long.mod.Long): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MAX_VALUE")(x.asInstanceOf[js.Any])
    
    /**
      * Minimum signed value.
      */
    /* static member */
    @JSImport("@grpc/proto-loader", "Long.MIN_VALUE")
    @js.native
    def MIN_VALUE: typings.long.mod.Long = js.native
    inline def MIN_VALUE_=(x: typings.long.mod.Long): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MIN_VALUE")(x.asInstanceOf[js.Any])
    
    /**
      * Signed negative one.
      */
    /* static member */
    @JSImport("@grpc/proto-loader", "Long.NEG_ONE")
    @js.native
    def NEG_ONE: typings.long.mod.Long = js.native
    inline def NEG_ONE_=(x: typings.long.mod.Long): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NEG_ONE")(x.asInstanceOf[js.Any])
    
    /**
      * Signed one.
      */
    /* static member */
    @JSImport("@grpc/proto-loader", "Long.ONE")
    @js.native
    def ONE: typings.long.mod.Long = js.native
    inline def ONE_=(x: typings.long.mod.Long): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ONE")(x.asInstanceOf[js.Any])
    
    /**
      * Unsigned one.
      */
    /* static member */
    @JSImport("@grpc/proto-loader", "Long.UONE")
    @js.native
    def UONE: typings.long.mod.Long = js.native
    inline def UONE_=(x: typings.long.mod.Long): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("UONE")(x.asInstanceOf[js.Any])
    
    /**
      * Unsigned zero.
      */
    /* static member */
    @JSImport("@grpc/proto-loader", "Long.UZERO")
    @js.native
    def UZERO: typings.long.mod.Long = js.native
    inline def UZERO_=(x: typings.long.mod.Long): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("UZERO")(x.asInstanceOf[js.Any])
    
    /**
      * Signed zero
      */
    /* static member */
    @JSImport("@grpc/proto-loader", "Long.ZERO")
    @js.native
    def ZERO: typings.long.mod.Long = js.native
    inline def ZERO_=(x: typings.long.mod.Long): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ZERO")(x.asInstanceOf[js.Any])
    
    /**
      * Returns a Long representing the 64 bit integer that comes by concatenating the given low and high bits. Each is assumed to use 32 bits.
      */
    /* static member */
    inline def fromBits(lowBits: Double, highBits: Double): typings.long.mod.Long = (^.asInstanceOf[js.Dynamic].applyDynamic("fromBits")(lowBits.asInstanceOf[js.Any], highBits.asInstanceOf[js.Any])).asInstanceOf[typings.long.mod.Long]
    inline def fromBits(lowBits: Double, highBits: Double, unsigned: Boolean): typings.long.mod.Long = (^.asInstanceOf[js.Dynamic].applyDynamic("fromBits")(lowBits.asInstanceOf[js.Any], highBits.asInstanceOf[js.Any], unsigned.asInstanceOf[js.Any])).asInstanceOf[typings.long.mod.Long]
    
    /**
      * Creates a Long from its byte representation.
      */
    /* static member */
    inline def fromBytes(bytes: js.Array[Double]): typings.long.mod.Long = ^.asInstanceOf[js.Dynamic].applyDynamic("fromBytes")(bytes.asInstanceOf[js.Any]).asInstanceOf[typings.long.mod.Long]
    inline def fromBytes(bytes: js.Array[Double], unsigned: Boolean): typings.long.mod.Long = (^.asInstanceOf[js.Dynamic].applyDynamic("fromBytes")(bytes.asInstanceOf[js.Any], unsigned.asInstanceOf[js.Any])).asInstanceOf[typings.long.mod.Long]
    inline def fromBytes(bytes: js.Array[Double], unsigned: Boolean, le: Boolean): typings.long.mod.Long = (^.asInstanceOf[js.Dynamic].applyDynamic("fromBytes")(bytes.asInstanceOf[js.Any], unsigned.asInstanceOf[js.Any], le.asInstanceOf[js.Any])).asInstanceOf[typings.long.mod.Long]
    inline def fromBytes(bytes: js.Array[Double], unsigned: Unit, le: Boolean): typings.long.mod.Long = (^.asInstanceOf[js.Dynamic].applyDynamic("fromBytes")(bytes.asInstanceOf[js.Any], unsigned.asInstanceOf[js.Any], le.asInstanceOf[js.Any])).asInstanceOf[typings.long.mod.Long]
    
    /**
      * Creates a Long from its big endian byte representation.
      */
    /* static member */
    inline def fromBytesBE(bytes: js.Array[Double]): typings.long.mod.Long = ^.asInstanceOf[js.Dynamic].applyDynamic("fromBytesBE")(bytes.asInstanceOf[js.Any]).asInstanceOf[typings.long.mod.Long]
    inline def fromBytesBE(bytes: js.Array[Double], unsigned: Boolean): typings.long.mod.Long = (^.asInstanceOf[js.Dynamic].applyDynamic("fromBytesBE")(bytes.asInstanceOf[js.Any], unsigned.asInstanceOf[js.Any])).asInstanceOf[typings.long.mod.Long]
    
    /**
      * Creates a Long from its little endian byte representation.
      */
    /* static member */
    inline def fromBytesLE(bytes: js.Array[Double]): typings.long.mod.Long = ^.asInstanceOf[js.Dynamic].applyDynamic("fromBytesLE")(bytes.asInstanceOf[js.Any]).asInstanceOf[typings.long.mod.Long]
    inline def fromBytesLE(bytes: js.Array[Double], unsigned: Boolean): typings.long.mod.Long = (^.asInstanceOf[js.Dynamic].applyDynamic("fromBytesLE")(bytes.asInstanceOf[js.Any], unsigned.asInstanceOf[js.Any])).asInstanceOf[typings.long.mod.Long]
    
    /**
      * Returns a Long representing the given 32 bit integer value.
      */
    /* static member */
    inline def fromInt(value: Double): typings.long.mod.Long = ^.asInstanceOf[js.Dynamic].applyDynamic("fromInt")(value.asInstanceOf[js.Any]).asInstanceOf[typings.long.mod.Long]
    inline def fromInt(value: Double, unsigned: Boolean): typings.long.mod.Long = (^.asInstanceOf[js.Dynamic].applyDynamic("fromInt")(value.asInstanceOf[js.Any], unsigned.asInstanceOf[js.Any])).asInstanceOf[typings.long.mod.Long]
    
    /**
      * Returns a Long representing the given value, provided that it is a finite number. Otherwise, zero is returned.
      */
    /* static member */
    inline def fromNumber(value: Double): typings.long.mod.Long = ^.asInstanceOf[js.Dynamic].applyDynamic("fromNumber")(value.asInstanceOf[js.Any]).asInstanceOf[typings.long.mod.Long]
    inline def fromNumber(value: Double, unsigned: Boolean): typings.long.mod.Long = (^.asInstanceOf[js.Dynamic].applyDynamic("fromNumber")(value.asInstanceOf[js.Any], unsigned.asInstanceOf[js.Any])).asInstanceOf[typings.long.mod.Long]
    
    /**
      * Returns a Long representation of the given string, written using the specified radix.
      */
    /* static member */
    inline def fromString(str: String): typings.long.mod.Long = ^.asInstanceOf[js.Dynamic].applyDynamic("fromString")(str.asInstanceOf[js.Any]).asInstanceOf[typings.long.mod.Long]
    inline def fromString(str: String, unsigned: Boolean): typings.long.mod.Long = (^.asInstanceOf[js.Dynamic].applyDynamic("fromString")(str.asInstanceOf[js.Any], unsigned.asInstanceOf[js.Any])).asInstanceOf[typings.long.mod.Long]
    inline def fromString(str: String, unsigned: Boolean, radix: Double): typings.long.mod.Long = (^.asInstanceOf[js.Dynamic].applyDynamic("fromString")(str.asInstanceOf[js.Any], unsigned.asInstanceOf[js.Any], radix.asInstanceOf[js.Any])).asInstanceOf[typings.long.mod.Long]
    inline def fromString(str: String, unsigned: Double): typings.long.mod.Long = (^.asInstanceOf[js.Dynamic].applyDynamic("fromString")(str.asInstanceOf[js.Any], unsigned.asInstanceOf[js.Any])).asInstanceOf[typings.long.mod.Long]
    inline def fromString(str: String, unsigned: Double, radix: Double): typings.long.mod.Long = (^.asInstanceOf[js.Dynamic].applyDynamic("fromString")(str.asInstanceOf[js.Any], unsigned.asInstanceOf[js.Any], radix.asInstanceOf[js.Any])).asInstanceOf[typings.long.mod.Long]
    inline def fromString(str: String, unsigned: Unit, radix: Double): typings.long.mod.Long = (^.asInstanceOf[js.Dynamic].applyDynamic("fromString")(str.asInstanceOf[js.Any], unsigned.asInstanceOf[js.Any], radix.asInstanceOf[js.Any])).asInstanceOf[typings.long.mod.Long]
    
    inline def fromValue(`val`: String): typings.long.mod.Long = ^.asInstanceOf[js.Dynamic].applyDynamic("fromValue")(`val`.asInstanceOf[js.Any]).asInstanceOf[typings.long.mod.Long]
    inline def fromValue(`val`: String, unsigned: Boolean): typings.long.mod.Long = (^.asInstanceOf[js.Dynamic].applyDynamic("fromValue")(`val`.asInstanceOf[js.Any], unsigned.asInstanceOf[js.Any])).asInstanceOf[typings.long.mod.Long]
    inline def fromValue(`val`: Double): typings.long.mod.Long = ^.asInstanceOf[js.Dynamic].applyDynamic("fromValue")(`val`.asInstanceOf[js.Any]).asInstanceOf[typings.long.mod.Long]
    inline def fromValue(`val`: Double, unsigned: Boolean): typings.long.mod.Long = (^.asInstanceOf[js.Dynamic].applyDynamic("fromValue")(`val`.asInstanceOf[js.Any], unsigned.asInstanceOf[js.Any])).asInstanceOf[typings.long.mod.Long]
    inline def fromValue(`val`: High): typings.long.mod.Long = ^.asInstanceOf[js.Dynamic].applyDynamic("fromValue")(`val`.asInstanceOf[js.Any]).asInstanceOf[typings.long.mod.Long]
    inline def fromValue(`val`: High, unsigned: Boolean): typings.long.mod.Long = (^.asInstanceOf[js.Dynamic].applyDynamic("fromValue")(`val`.asInstanceOf[js.Any], unsigned.asInstanceOf[js.Any])).asInstanceOf[typings.long.mod.Long]
    /**
      * Converts the specified value to a Long.
      */
    /* static member */
    inline def fromValue(`val`: typings.long.mod.Long): typings.long.mod.Long = ^.asInstanceOf[js.Dynamic].applyDynamic("fromValue")(`val`.asInstanceOf[js.Any]).asInstanceOf[typings.long.mod.Long]
    inline def fromValue(`val`: typings.long.mod.Long, unsigned: Boolean): typings.long.mod.Long = (^.asInstanceOf[js.Dynamic].applyDynamic("fromValue")(`val`.asInstanceOf[js.Any], unsigned.asInstanceOf[js.Any])).asInstanceOf[typings.long.mod.Long]
    
    /**
      * Tests if the specified object is a Long.
      */
    /* static member */
    inline def isLong(obj: Any): /* is long.long.Long */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isLong")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is long.long.Long */ Boolean]
  }
  
  inline def fromJSON(json: INamespace): PackageDefinition = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(json.asInstanceOf[js.Any]).asInstanceOf[PackageDefinition]
  inline def fromJSON(json: INamespace, options: Options): PackageDefinition = (^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(json.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[PackageDefinition]
  
  inline def isAnyExtension(obj: js.Object): /* is @grpc/proto-loader.@grpc/proto-loader.AnyExtension */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isAnyExtension")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @grpc/proto-loader.@grpc/proto-loader.AnyExtension */ Boolean]
  
  inline def load(filename: String): js.Promise[PackageDefinition] = ^.asInstanceOf[js.Dynamic].applyDynamic("load")(filename.asInstanceOf[js.Any]).asInstanceOf[js.Promise[PackageDefinition]]
  inline def load(filename: String, options: Options): js.Promise[PackageDefinition] = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(filename.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[PackageDefinition]]
  inline def load(filename: js.Array[String]): js.Promise[PackageDefinition] = ^.asInstanceOf[js.Dynamic].applyDynamic("load")(filename.asInstanceOf[js.Any]).asInstanceOf[js.Promise[PackageDefinition]]
  inline def load(filename: js.Array[String], options: Options): js.Promise[PackageDefinition] = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(filename.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[PackageDefinition]]
  
  inline def loadFileDescriptorSetFromBuffer(descriptorSet: Buffer): PackageDefinition = ^.asInstanceOf[js.Dynamic].applyDynamic("loadFileDescriptorSetFromBuffer")(descriptorSet.asInstanceOf[js.Any]).asInstanceOf[PackageDefinition]
  inline def loadFileDescriptorSetFromBuffer(descriptorSet: Buffer, options: Options): PackageDefinition = (^.asInstanceOf[js.Dynamic].applyDynamic("loadFileDescriptorSetFromBuffer")(descriptorSet.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[PackageDefinition]
  
  inline def loadFileDescriptorSetFromObject_0(
    descriptorSet: /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<(object : {[k: string] : any}): protobufjs.protobufjs.Message<{}>>[0] */ js.Any
  ): PackageDefinition = ^.asInstanceOf[js.Dynamic].applyDynamic("loadFileDescriptorSetFromObject")(descriptorSet.asInstanceOf[js.Any]).asInstanceOf[PackageDefinition]
  inline def loadFileDescriptorSetFromObject_0(
    descriptorSet: /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<(object : {[k: string] : any}): protobufjs.protobufjs.Message<{}>>[0] */ js.Any,
    options: Options
  ): PackageDefinition = (^.asInstanceOf[js.Dynamic].applyDynamic("loadFileDescriptorSetFromObject")(descriptorSet.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[PackageDefinition]
  
  inline def loadSync(filename: String): PackageDefinition = ^.asInstanceOf[js.Dynamic].applyDynamic("loadSync")(filename.asInstanceOf[js.Any]).asInstanceOf[PackageDefinition]
  inline def loadSync(filename: String, options: Options): PackageDefinition = (^.asInstanceOf[js.Dynamic].applyDynamic("loadSync")(filename.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[PackageDefinition]
  inline def loadSync(filename: js.Array[String]): PackageDefinition = ^.asInstanceOf[js.Dynamic].applyDynamic("loadSync")(filename.asInstanceOf[js.Any]).asInstanceOf[PackageDefinition]
  inline def loadSync(filename: js.Array[String], options: Options): PackageDefinition = (^.asInstanceOf[js.Dynamic].applyDynamic("loadSync")(filename.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[PackageDefinition]
  
  /* Rewritten from type alias, can be one of: 
    - typings.grpcProtoLoader.mod.ServiceDefinition
    - typings.grpcProtoLoader.mod.MessageTypeDefinition
    - typings.grpcProtoLoader.mod.EnumTypeDefinition
  */
  type AnyDefinition = _AnyDefinition | ServiceDefinition
  
  trait AnyExtension extends StObject {
    
    /**
      * The fully qualified name of the message type that this object represents,
      * possibly including a URL prefix.
      */
    var `@type`: String
  }
  object AnyExtension {
    
    inline def apply(`@type`: String): AnyExtension = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("@type")(`@type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[AnyExtension]
    }
    
    extension [Self <: AnyExtension](x: Self) {
      
      inline def `set@type`(value: String): Self = StObject.set(x, "@type", value.asInstanceOf[js.Any])
    }
  }
  
  type Deserialize[T] = js.Function1[/* bytes */ Buffer, T]
  
  trait EnumTypeDefinition
    extends StObject
       with ProtobufTypeDefinition
       with _AnyDefinition {
    
    @JSName("format")
    var format_EnumTypeDefinition: `Protocol Buffer 3 EnumDescriptorProto`
  }
  object EnumTypeDefinition {
    
    inline def apply(fileDescriptorProtos: js.Array[Buffer], `type`: js.Object): EnumTypeDefinition = {
      val __obj = js.Dynamic.literal(fileDescriptorProtos = fileDescriptorProtos.asInstanceOf[js.Any], format = "Protocol Buffer 3 EnumDescriptorProto")
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[EnumTypeDefinition]
    }
    
    extension [Self <: EnumTypeDefinition](x: Self) {
      
      inline def setFormat(value: `Protocol Buffer 3 EnumDescriptorProto`): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    }
  }
  
  trait MessageTypeDefinition
    extends StObject
       with ProtobufTypeDefinition
       with _AnyDefinition {
    
    @JSName("format")
    var format_MessageTypeDefinition: `Protocol Buffer 3 DescriptorProto`
  }
  object MessageTypeDefinition {
    
    inline def apply(fileDescriptorProtos: js.Array[Buffer], `type`: js.Object): MessageTypeDefinition = {
      val __obj = js.Dynamic.literal(fileDescriptorProtos = fileDescriptorProtos.asInstanceOf[js.Any], format = "Protocol Buffer 3 DescriptorProto")
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[MessageTypeDefinition]
    }
    
    extension [Self <: MessageTypeDefinition](x: Self) {
      
      inline def setFormat(value: `Protocol Buffer 3 DescriptorProto`): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    }
  }
  
  trait MethodDefinition[RequestType, ResponseType, OutputRequestType, OutputResponseType] extends StObject {
    
    var originalName: js.UndefOr[String] = js.undefined
    
    var path: String
    
    def requestDeserialize(bytes: Buffer): OutputRequestType
    @JSName("requestDeserialize")
    var requestDeserialize_Original: Deserialize[OutputRequestType]
    
    def requestSerialize(value: RequestType): Buffer
    @JSName("requestSerialize")
    var requestSerialize_Original: Serialize[RequestType]
    
    var requestStream: Boolean
    
    var requestType: MessageTypeDefinition
    
    def responseDeserialize(bytes: Buffer): OutputResponseType
    @JSName("responseDeserialize")
    var responseDeserialize_Original: Deserialize[OutputResponseType]
    
    def responseSerialize(value: ResponseType): Buffer
    @JSName("responseSerialize")
    var responseSerialize_Original: Serialize[ResponseType]
    
    var responseStream: Boolean
    
    var responseType: MessageTypeDefinition
  }
  object MethodDefinition {
    
    inline def apply[RequestType, ResponseType, OutputRequestType, OutputResponseType](
      path: String,
      requestDeserialize: /* bytes */ Buffer => OutputRequestType,
      requestSerialize: RequestType => Buffer,
      requestStream: Boolean,
      requestType: MessageTypeDefinition,
      responseDeserialize: /* bytes */ Buffer => OutputResponseType,
      responseSerialize: ResponseType => Buffer,
      responseStream: Boolean,
      responseType: MessageTypeDefinition
    ): MethodDefinition[RequestType, ResponseType, OutputRequestType, OutputResponseType] = {
      val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], requestDeserialize = js.Any.fromFunction1(requestDeserialize), requestSerialize = js.Any.fromFunction1(requestSerialize), requestStream = requestStream.asInstanceOf[js.Any], requestType = requestType.asInstanceOf[js.Any], responseDeserialize = js.Any.fromFunction1(responseDeserialize), responseSerialize = js.Any.fromFunction1(responseSerialize), responseStream = responseStream.asInstanceOf[js.Any], responseType = responseType.asInstanceOf[js.Any])
      __obj.asInstanceOf[MethodDefinition[RequestType, ResponseType, OutputRequestType, OutputResponseType]]
    }
    
    extension [Self <: MethodDefinition[?, ?, ?, ?], RequestType, ResponseType, OutputRequestType, OutputResponseType](x: Self & (MethodDefinition[RequestType, ResponseType, OutputRequestType, OutputResponseType])) {
      
      inline def setOriginalName(value: String): Self = StObject.set(x, "originalName", value.asInstanceOf[js.Any])
      
      inline def setOriginalNameUndefined: Self = StObject.set(x, "originalName", js.undefined)
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setRequestDeserialize(value: /* bytes */ Buffer => OutputRequestType): Self = StObject.set(x, "requestDeserialize", js.Any.fromFunction1(value))
      
      inline def setRequestSerialize(value: RequestType => Buffer): Self = StObject.set(x, "requestSerialize", js.Any.fromFunction1(value))
      
      inline def setRequestStream(value: Boolean): Self = StObject.set(x, "requestStream", value.asInstanceOf[js.Any])
      
      inline def setRequestType(value: MessageTypeDefinition): Self = StObject.set(x, "requestType", value.asInstanceOf[js.Any])
      
      inline def setResponseDeserialize(value: /* bytes */ Buffer => OutputResponseType): Self = StObject.set(x, "responseDeserialize", js.Any.fromFunction1(value))
      
      inline def setResponseSerialize(value: ResponseType => Buffer): Self = StObject.set(x, "responseSerialize", js.Any.fromFunction1(value))
      
      inline def setResponseStream(value: Boolean): Self = StObject.set(x, "responseStream", value.asInstanceOf[js.Any])
      
      inline def setResponseType(value: MessageTypeDefinition): Self = StObject.set(x, "responseType", value.asInstanceOf[js.Any])
    }
  }
  
  type PackageDefinition = StringDictionary[AnyDefinition]
  
  trait ProtobufTypeDefinition extends StObject {
    
    var fileDescriptorProtos: js.Array[Buffer]
    
    var format: String
    
    var `type`: js.Object
  }
  object ProtobufTypeDefinition {
    
    inline def apply(fileDescriptorProtos: js.Array[Buffer], format: String, `type`: js.Object): ProtobufTypeDefinition = {
      val __obj = js.Dynamic.literal(fileDescriptorProtos = fileDescriptorProtos.asInstanceOf[js.Any], format = format.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[ProtobufTypeDefinition]
    }
    
    extension [Self <: ProtobufTypeDefinition](x: Self) {
      
      inline def setFileDescriptorProtos(value: js.Array[Buffer]): Self = StObject.set(x, "fileDescriptorProtos", value.asInstanceOf[js.Any])
      
      inline def setFileDescriptorProtosVarargs(value: Buffer*): Self = StObject.set(x, "fileDescriptorProtos", js.Array(value*))
      
      inline def setFormat(value: String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      inline def setType(value: js.Object): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  type Serialize[T] = js.Function1[/* value */ T, Buffer]
  
  type ServiceDefinition = StringDictionary[MethodDefinition[js.Object, js.Object, js.Object, js.Object]]
  
  trait _AnyDefinition extends StObject
  object _AnyDefinition {
    
    inline def EnumTypeDefinition(fileDescriptorProtos: js.Array[Buffer], `type`: js.Object): typings.grpcProtoLoader.mod.EnumTypeDefinition = {
      val __obj = js.Dynamic.literal(fileDescriptorProtos = fileDescriptorProtos.asInstanceOf[js.Any], format = "Protocol Buffer 3 EnumDescriptorProto")
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.grpcProtoLoader.mod.EnumTypeDefinition]
    }
    
    inline def MessageTypeDefinition(fileDescriptorProtos: js.Array[Buffer], `type`: js.Object): typings.grpcProtoLoader.mod.MessageTypeDefinition = {
      val __obj = js.Dynamic.literal(fileDescriptorProtos = fileDescriptorProtos.asInstanceOf[js.Any], format = "Protocol Buffer 3 DescriptorProto")
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.grpcProtoLoader.mod.MessageTypeDefinition]
    }
  }
  
  /* augmented module */
  object protobufjsAugmentingMod {
    
    trait Enum extends StObject {
      
      def toDescriptor(protoVersion: String): Message[IEnumDescriptorProto] & IEnumDescriptorProto
    }
    object Enum {
      
      inline def apply(toDescriptor: String => Message[IEnumDescriptorProto] & IEnumDescriptorProto): Enum = {
        val __obj = js.Dynamic.literal(toDescriptor = js.Any.fromFunction1(toDescriptor))
        __obj.asInstanceOf[Enum]
      }
      
      extension [Self <: Enum](x: Self) {
        
        inline def setToDescriptor(value: String => Message[IEnumDescriptorProto] & IEnumDescriptorProto): Self = StObject.set(x, "toDescriptor", js.Any.fromFunction1(value))
      }
    }
    
    trait Root extends StObject {
      
      def toDescriptor(protoVersion: String): Message[IFileDescriptorSet] & IFileDescriptorSet
    }
    object Root {
      
      inline def apply(toDescriptor: String => Message[IFileDescriptorSet] & IFileDescriptorSet): Root = {
        val __obj = js.Dynamic.literal(toDescriptor = js.Any.fromFunction1(toDescriptor))
        __obj.asInstanceOf[Root]
      }
      
      extension [Self <: Root](x: Self) {
        
        inline def setToDescriptor(value: String => Message[IFileDescriptorSet] & IFileDescriptorSet): Self = StObject.set(x, "toDescriptor", js.Any.fromFunction1(value))
      }
    }
    
    @js.native
    trait RootConstructor
      extends StObject
         with Instantiable0[Root]
         with Instantiable1[/* options */ Options, Root] {
      
      def fromDescriptor(descriptorSet: js.typedarray.Uint8Array): Root = js.native
      def fromDescriptor(descriptorSet: IFileDescriptorSet): Root = js.native
      def fromDescriptor(descriptorSet: Reader): Root = js.native
      
      def fromJSON(json: INamespace): Root = js.native
      def fromJSON(json: INamespace, root: Root): Root = js.native
    }
    
    trait Type extends StObject {
      
      def toDescriptor(protoVersion: String): Message[IDescriptorProto] & IDescriptorProto
    }
    object Type {
      
      inline def apply(toDescriptor: String => Message[IDescriptorProto] & IDescriptorProto): Type = {
        val __obj = js.Dynamic.literal(toDescriptor = js.Any.fromFunction1(toDescriptor))
        __obj.asInstanceOf[Type]
      }
      
      extension [Self <: Type](x: Self) {
        
        inline def setToDescriptor(value: String => Message[IDescriptorProto] & IDescriptorProto): Self = StObject.set(x, "toDescriptor", js.Any.fromFunction1(value))
      }
    }
  }
}
