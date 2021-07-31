package typings.grpcProtoLoader

import org.scalablytyped.runtime.StringDictionary
import typings.grpcProtoLoader.grpcProtoLoaderStrings.`Protocol Buffer 3 DescriptorProto`
import typings.grpcProtoLoader.grpcProtoLoaderStrings.`Protocol Buffer 3 EnumDescriptorProto`
import typings.node.Buffer
import typings.protobufjs.descriptorMod.IDescriptorProto
import typings.protobufjs.descriptorMod.IEnumDescriptorProto
import typings.protobufjs.descriptorMod.IFileDescriptorSet
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.IParseOptions
import typings.protobufjs.mod.Message
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@grpc/proto-loader", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def load(filename: String): js.Promise[PackageDefinition] = ^.asInstanceOf[js.Dynamic].applyDynamic("load")(filename.asInstanceOf[js.Any]).asInstanceOf[js.Promise[PackageDefinition]]
  @scala.inline
  def load(filename: String, options: Options): js.Promise[PackageDefinition] = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(filename.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[PackageDefinition]]
  @scala.inline
  def load(filename: js.Array[String]): js.Promise[PackageDefinition] = ^.asInstanceOf[js.Dynamic].applyDynamic("load")(filename.asInstanceOf[js.Any]).asInstanceOf[js.Promise[PackageDefinition]]
  @scala.inline
  def load(filename: js.Array[String], options: Options): js.Promise[PackageDefinition] = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(filename.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[PackageDefinition]]
  
  @scala.inline
  def loadSync(filename: String): PackageDefinition = ^.asInstanceOf[js.Dynamic].applyDynamic("loadSync")(filename.asInstanceOf[js.Any]).asInstanceOf[PackageDefinition]
  @scala.inline
  def loadSync(filename: String, options: Options): PackageDefinition = (^.asInstanceOf[js.Dynamic].applyDynamic("loadSync")(filename.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[PackageDefinition]
  @scala.inline
  def loadSync(filename: js.Array[String]): PackageDefinition = ^.asInstanceOf[js.Dynamic].applyDynamic("loadSync")(filename.asInstanceOf[js.Any]).asInstanceOf[PackageDefinition]
  @scala.inline
  def loadSync(filename: js.Array[String], options: Options): PackageDefinition = (^.asInstanceOf[js.Dynamic].applyDynamic("loadSync")(filename.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[PackageDefinition]
  
  /* Rewritten from type alias, can be one of: 
    - typings.grpcProtoLoader.mod.ServiceDefinition
    - typings.grpcProtoLoader.mod.MessageTypeDefinition
    - typings.grpcProtoLoader.mod.EnumTypeDefinition
  */
  type AnyDefinition = _AnyDefinition | ServiceDefinition
  
  type Deserialize[T] = js.Function1[/* bytes */ Buffer, T]
  
  trait EnumTypeDefinition
    extends StObject
       with ProtobufTypeDefinition
       with _AnyDefinition {
    
    @JSName("format")
    var format_EnumTypeDefinition: `Protocol Buffer 3 EnumDescriptorProto`
  }
  object EnumTypeDefinition {
    
    @scala.inline
    def apply(fileDescriptorProtos: js.Array[Buffer], `type`: js.Object): EnumTypeDefinition = {
      val __obj = js.Dynamic.literal(fileDescriptorProtos = fileDescriptorProtos.asInstanceOf[js.Any], format = "Protocol Buffer 3 EnumDescriptorProto")
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[EnumTypeDefinition]
    }
    
    @scala.inline
    implicit class EnumTypeDefinitionMutableBuilder[Self <: EnumTypeDefinition] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFormat(value: `Protocol Buffer 3 EnumDescriptorProto`): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
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
    
    @scala.inline
    def apply(fileDescriptorProtos: js.Array[Buffer], `type`: js.Object): MessageTypeDefinition = {
      val __obj = js.Dynamic.literal(fileDescriptorProtos = fileDescriptorProtos.asInstanceOf[js.Any], format = "Protocol Buffer 3 DescriptorProto")
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[MessageTypeDefinition]
    }
    
    @scala.inline
    implicit class MessageTypeDefinitionMutableBuilder[Self <: MessageTypeDefinition] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFormat(value: `Protocol Buffer 3 DescriptorProto`): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    }
  }
  
  trait MethodDefinition[RequestType, ResponseType] extends StObject {
    
    var originalName: js.UndefOr[String] = js.undefined
    
    var path: String
    
    def requestDeserialize(bytes: Buffer): RequestType
    @JSName("requestDeserialize")
    var requestDeserialize_Original: Deserialize[RequestType]
    
    def requestSerialize(value: RequestType): Buffer
    @JSName("requestSerialize")
    var requestSerialize_Original: Serialize[RequestType]
    
    var requestStream: Boolean
    
    var requestType: MessageTypeDefinition
    
    def responseDeserialize(bytes: Buffer): ResponseType
    @JSName("responseDeserialize")
    var responseDeserialize_Original: Deserialize[ResponseType]
    
    def responseSerialize(value: ResponseType): Buffer
    @JSName("responseSerialize")
    var responseSerialize_Original: Serialize[ResponseType]
    
    var responseStream: Boolean
    
    var responseType: MessageTypeDefinition
  }
  object MethodDefinition {
    
    @scala.inline
    def apply[RequestType, ResponseType](
      path: String,
      requestDeserialize: /* bytes */ Buffer => RequestType,
      requestSerialize: RequestType => Buffer,
      requestStream: Boolean,
      requestType: MessageTypeDefinition,
      responseDeserialize: /* bytes */ Buffer => ResponseType,
      responseSerialize: ResponseType => Buffer,
      responseStream: Boolean,
      responseType: MessageTypeDefinition
    ): MethodDefinition[RequestType, ResponseType] = {
      val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], requestDeserialize = js.Any.fromFunction1(requestDeserialize), requestSerialize = js.Any.fromFunction1(requestSerialize), requestStream = requestStream.asInstanceOf[js.Any], requestType = requestType.asInstanceOf[js.Any], responseDeserialize = js.Any.fromFunction1(responseDeserialize), responseSerialize = js.Any.fromFunction1(responseSerialize), responseStream = responseStream.asInstanceOf[js.Any], responseType = responseType.asInstanceOf[js.Any])
      __obj.asInstanceOf[MethodDefinition[RequestType, ResponseType]]
    }
    
    @scala.inline
    implicit class MethodDefinitionMutableBuilder[Self <: MethodDefinition[?, ?], RequestType, ResponseType] (val x: Self & (MethodDefinition[RequestType, ResponseType])) extends AnyVal {
      
      @scala.inline
      def setOriginalName(value: String): Self = StObject.set(x, "originalName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOriginalNameUndefined: Self = StObject.set(x, "originalName", js.undefined)
      
      @scala.inline
      def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRequestDeserialize(value: /* bytes */ Buffer => RequestType): Self = StObject.set(x, "requestDeserialize", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRequestSerialize(value: RequestType => Buffer): Self = StObject.set(x, "requestSerialize", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRequestStream(value: Boolean): Self = StObject.set(x, "requestStream", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRequestType(value: MessageTypeDefinition): Self = StObject.set(x, "requestType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResponseDeserialize(value: /* bytes */ Buffer => ResponseType): Self = StObject.set(x, "responseDeserialize", js.Any.fromFunction1(value))
      
      @scala.inline
      def setResponseSerialize(value: ResponseType => Buffer): Self = StObject.set(x, "responseSerialize", js.Any.fromFunction1(value))
      
      @scala.inline
      def setResponseStream(value: Boolean): Self = StObject.set(x, "responseStream", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResponseType(value: MessageTypeDefinition): Self = StObject.set(x, "responseType", value.asInstanceOf[js.Any])
    }
  }
  
  trait Options
    extends StObject
       with IParseOptions
       with IConversionOptions {
    
    var includeDirs: js.UndefOr[js.Array[String]] = js.undefined
  }
  object Options {
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIncludeDirs(value: js.Array[String]): Self = StObject.set(x, "includeDirs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIncludeDirsUndefined: Self = StObject.set(x, "includeDirs", js.undefined)
      
      @scala.inline
      def setIncludeDirsVarargs(value: String*): Self = StObject.set(x, "includeDirs", js.Array(value :_*))
    }
  }
  
  type PackageDefinition = StringDictionary[AnyDefinition]
  
  trait ProtobufTypeDefinition extends StObject {
    
    var fileDescriptorProtos: js.Array[Buffer]
    
    var format: String
    
    var `type`: js.Object
  }
  object ProtobufTypeDefinition {
    
    @scala.inline
    def apply(fileDescriptorProtos: js.Array[Buffer], format: String, `type`: js.Object): ProtobufTypeDefinition = {
      val __obj = js.Dynamic.literal(fileDescriptorProtos = fileDescriptorProtos.asInstanceOf[js.Any], format = format.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[ProtobufTypeDefinition]
    }
    
    @scala.inline
    implicit class ProtobufTypeDefinitionMutableBuilder[Self <: ProtobufTypeDefinition] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFileDescriptorProtos(value: js.Array[Buffer]): Self = StObject.set(x, "fileDescriptorProtos", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFileDescriptorProtosVarargs(value: Buffer*): Self = StObject.set(x, "fileDescriptorProtos", js.Array(value :_*))
      
      @scala.inline
      def setFormat(value: String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: js.Object): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  type Serialize[T] = js.Function1[/* value */ T, Buffer]
  
  type ServiceDefinition = StringDictionary[MethodDefinition[js.Object, js.Object]]
  
  trait _AnyDefinition extends StObject
  object _AnyDefinition {
    
    @scala.inline
    def EnumTypeDefinition(fileDescriptorProtos: js.Array[Buffer], `type`: js.Object): typings.grpcProtoLoader.mod.EnumTypeDefinition = {
      val __obj = js.Dynamic.literal(fileDescriptorProtos = fileDescriptorProtos.asInstanceOf[js.Any], format = "Protocol Buffer 3 EnumDescriptorProto")
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.grpcProtoLoader.mod.EnumTypeDefinition]
    }
    
    @scala.inline
    def MessageTypeDefinition(fileDescriptorProtos: js.Array[Buffer], `type`: js.Object): typings.grpcProtoLoader.mod.MessageTypeDefinition = {
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
      
      @scala.inline
      def apply(toDescriptor: String => Message[IEnumDescriptorProto] & IEnumDescriptorProto): Enum = {
        val __obj = js.Dynamic.literal(toDescriptor = js.Any.fromFunction1(toDescriptor))
        __obj.asInstanceOf[Enum]
      }
      
      @scala.inline
      implicit class EnumMutableBuilder[Self <: Enum] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setToDescriptor(value: String => Message[IEnumDescriptorProto] & IEnumDescriptorProto): Self = StObject.set(x, "toDescriptor", js.Any.fromFunction1(value))
      }
    }
    
    trait Root extends StObject {
      
      def toDescriptor(protoVersion: String): Message[IFileDescriptorSet] & IFileDescriptorSet
    }
    object Root {
      
      @scala.inline
      def apply(toDescriptor: String => Message[IFileDescriptorSet] & IFileDescriptorSet): Root = {
        val __obj = js.Dynamic.literal(toDescriptor = js.Any.fromFunction1(toDescriptor))
        __obj.asInstanceOf[Root]
      }
      
      @scala.inline
      implicit class RootMutableBuilder[Self <: Root] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setToDescriptor(value: String => Message[IFileDescriptorSet] & IFileDescriptorSet): Self = StObject.set(x, "toDescriptor", js.Any.fromFunction1(value))
      }
    }
    
    trait Type extends StObject {
      
      def toDescriptor(protoVersion: String): Message[IDescriptorProto] & IDescriptorProto
    }
    object Type {
      
      @scala.inline
      def apply(toDescriptor: String => Message[IDescriptorProto] & IDescriptorProto): Type = {
        val __obj = js.Dynamic.literal(toDescriptor = js.Any.fromFunction1(toDescriptor))
        __obj.asInstanceOf[Type]
      }
      
      @scala.inline
      implicit class TypeMutableBuilder[Self <: Type] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setToDescriptor(value: String => Message[IDescriptorProto] & IDescriptorProto): Self = StObject.set(x, "toDescriptor", js.Any.fromFunction1(value))
      }
    }
  }
}
