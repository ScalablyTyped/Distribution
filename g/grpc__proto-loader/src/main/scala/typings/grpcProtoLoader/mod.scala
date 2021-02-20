package typings.grpcProtoLoader

import org.scalablytyped.runtime.StringDictionary
import typings.grpcProtoLoader.grpcProtoLoaderStrings.`Protocol Buffer 3 DescriptorProto`
import typings.grpcProtoLoader.grpcProtoLoaderStrings.`Protocol Buffer 3 EnumDescriptorProto`
import typings.node.Buffer
import typings.protobufjs.descriptorMod.IDescriptorProto
import typings.protobufjs.descriptorMod.IEnumDescriptorProto
import typings.protobufjs.descriptorMod.IFileDescriptorSet
import typings.protobufjs.mod.Message
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@grpc/proto-loader", "load")
  @js.native
  def load(filename: String): js.Promise[PackageDefinition] = js.native
  @JSImport("@grpc/proto-loader", "load")
  @js.native
  def load(filename: String, options: Options): js.Promise[PackageDefinition] = js.native
  @JSImport("@grpc/proto-loader", "load")
  @js.native
  def load(filename: js.Array[String]): js.Promise[PackageDefinition] = js.native
  @JSImport("@grpc/proto-loader", "load")
  @js.native
  def load(filename: js.Array[String], options: Options): js.Promise[PackageDefinition] = js.native
  
  @JSImport("@grpc/proto-loader", "loadSync")
  @js.native
  def loadSync(filename: String): PackageDefinition = js.native
  @JSImport("@grpc/proto-loader", "loadSync")
  @js.native
  def loadSync(filename: String, options: Options): PackageDefinition = js.native
  @JSImport("@grpc/proto-loader", "loadSync")
  @js.native
  def loadSync(filename: js.Array[String]): PackageDefinition = js.native
  @JSImport("@grpc/proto-loader", "loadSync")
  @js.native
  def loadSync(filename: js.Array[String], options: Options): PackageDefinition = js.native
  
  /* Rewritten from type alias, can be one of: 
    - typings.grpcProtoLoader.mod.ServiceDefinition
    - typings.grpcProtoLoader.mod.MessageTypeDefinition
    - typings.grpcProtoLoader.mod.EnumTypeDefinition
  */
  type AnyDefinition = _AnyDefinition | ServiceDefinition
  
  type Deserialize[T] = js.Function1[/* bytes */ Buffer, T]
  
  @js.native
  trait EnumTypeDefinition
    extends ProtobufTypeDefinition
       with _AnyDefinition {
    
    @JSName("format")
    var format_EnumTypeDefinition: `Protocol Buffer 3 EnumDescriptorProto` = js.native
  }
  object EnumTypeDefinition {
    
    @scala.inline
    def apply(
      fileDescriptorProtos: js.Array[Buffer],
      format: `Protocol Buffer 3 EnumDescriptorProto`,
      `type`: js.Object
    ): EnumTypeDefinition = {
      val __obj = js.Dynamic.literal(fileDescriptorProtos = fileDescriptorProtos.asInstanceOf[js.Any], format = format.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[EnumTypeDefinition]
    }
    
    @scala.inline
    implicit class EnumTypeDefinitionMutableBuilder[Self <: EnumTypeDefinition] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFormat(value: `Protocol Buffer 3 EnumDescriptorProto`): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait MessageTypeDefinition
    extends ProtobufTypeDefinition
       with _AnyDefinition {
    
    @JSName("format")
    var format_MessageTypeDefinition: `Protocol Buffer 3 DescriptorProto` = js.native
  }
  object MessageTypeDefinition {
    
    @scala.inline
    def apply(
      fileDescriptorProtos: js.Array[Buffer],
      format: `Protocol Buffer 3 DescriptorProto`,
      `type`: js.Object
    ): MessageTypeDefinition = {
      val __obj = js.Dynamic.literal(fileDescriptorProtos = fileDescriptorProtos.asInstanceOf[js.Any], format = format.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[MessageTypeDefinition]
    }
    
    @scala.inline
    implicit class MessageTypeDefinitionMutableBuilder[Self <: MessageTypeDefinition] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFormat(value: `Protocol Buffer 3 DescriptorProto`): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait MethodDefinition[RequestType, ResponseType] extends StObject {
    
    var originalName: js.UndefOr[String] = js.native
    
    var path: String = js.native
    
    def requestDeserialize(bytes: Buffer): RequestType = js.native
    @JSName("requestDeserialize")
    var requestDeserialize_Original: Deserialize[RequestType] = js.native
    
    def requestSerialize(value: RequestType): Buffer = js.native
    @JSName("requestSerialize")
    var requestSerialize_Original: Serialize[RequestType] = js.native
    
    var requestStream: Boolean = js.native
    
    var requestType: MessageTypeDefinition = js.native
    
    def responseDeserialize(bytes: Buffer): ResponseType = js.native
    @JSName("responseDeserialize")
    var responseDeserialize_Original: Deserialize[ResponseType] = js.native
    
    def responseSerialize(value: ResponseType): Buffer = js.native
    @JSName("responseSerialize")
    var responseSerialize_Original: Serialize[ResponseType] = js.native
    
    var responseStream: Boolean = js.native
    
    var responseType: MessageTypeDefinition = js.native
  }
  
  /* Inlined protobufjs.protobufjs.IParseOptions & protobufjs.protobufjs.IConversionOptions & {  includeDirs :std.Array<string> | undefined} */
  @js.native
  trait Options extends StObject {
    
    /** Recognize double-slash comments in addition to doc-block comments. */
    var alternateCommentMode: js.UndefOr[Boolean] = js.native
    
    /** Sets empty arrays for missing repeated fields even if `defaults=false` */
    var arrays: js.UndefOr[Boolean] = js.native
    
    /**
      * Bytes value conversion type.
      * Valid values are `Array` and (a base64 encoded) `String` (the global types).
      * Defaults to copy the present value, which usually is a Buffer under node and an Uint8Array in the browser.
      */
    var bytes: js.UndefOr[js.Function] = js.native
    
    /** Also sets default values on the resulting object */
    var defaults: js.UndefOr[Boolean] = js.native
    
    /**
      * Enum value conversion type.
      * Only valid value is `String` (the global type).
      * Defaults to copy the present value, which is the numeric id.
      */
    var enums: js.UndefOr[js.Function] = js.native
    
    var includeDirs: js.UndefOr[js.Array[String]] = js.native
    
    /** Performs additional JSON compatibility conversions, i.e. NaN and Infinity to strings */
    var json: js.UndefOr[Boolean] = js.native
    
    /** Keeps field casing instead of converting to camel case */
    var keepCase: js.UndefOr[Boolean] = js.native
    
    /**
      * Long conversion type.
      * Valid values are `String` and `Number` (the global types).
      * Defaults to copy the present value, which is a possibly unsafe number without and a {@link Long} with a long library.
      */
    var longs: js.UndefOr[js.Function] = js.native
    
    /** Sets empty objects for missing map fields even if `defaults=false` */
    var objects: js.UndefOr[Boolean] = js.native
    
    /** Includes virtual oneof properties set to the present field's name, if any */
    var oneofs: js.UndefOr[Boolean] = js.native
    
    /** Use trailing comment when both leading comment and trailing comment exist. */
    var preferTrailingComment: js.UndefOr[Boolean] = js.native
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
      def setAlternateCommentMode(value: Boolean): Self = StObject.set(x, "alternateCommentMode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAlternateCommentModeUndefined: Self = StObject.set(x, "alternateCommentMode", js.undefined)
      
      @scala.inline
      def setArrays(value: Boolean): Self = StObject.set(x, "arrays", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArraysUndefined: Self = StObject.set(x, "arrays", js.undefined)
      
      @scala.inline
      def setBytes(value: js.Function): Self = StObject.set(x, "bytes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBytesUndefined: Self = StObject.set(x, "bytes", js.undefined)
      
      @scala.inline
      def setDefaults(value: Boolean): Self = StObject.set(x, "defaults", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultsUndefined: Self = StObject.set(x, "defaults", js.undefined)
      
      @scala.inline
      def setEnums(value: js.Function): Self = StObject.set(x, "enums", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnumsUndefined: Self = StObject.set(x, "enums", js.undefined)
      
      @scala.inline
      def setIncludeDirs(value: js.Array[String]): Self = StObject.set(x, "includeDirs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIncludeDirsUndefined: Self = StObject.set(x, "includeDirs", js.undefined)
      
      @scala.inline
      def setIncludeDirsVarargs(value: String*): Self = StObject.set(x, "includeDirs", js.Array(value :_*))
      
      @scala.inline
      def setJson(value: Boolean): Self = StObject.set(x, "json", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setJsonUndefined: Self = StObject.set(x, "json", js.undefined)
      
      @scala.inline
      def setKeepCase(value: Boolean): Self = StObject.set(x, "keepCase", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeepCaseUndefined: Self = StObject.set(x, "keepCase", js.undefined)
      
      @scala.inline
      def setLongs(value: js.Function): Self = StObject.set(x, "longs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLongsUndefined: Self = StObject.set(x, "longs", js.undefined)
      
      @scala.inline
      def setObjects(value: Boolean): Self = StObject.set(x, "objects", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setObjectsUndefined: Self = StObject.set(x, "objects", js.undefined)
      
      @scala.inline
      def setOneofs(value: Boolean): Self = StObject.set(x, "oneofs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOneofsUndefined: Self = StObject.set(x, "oneofs", js.undefined)
      
      @scala.inline
      def setPreferTrailingComment(value: Boolean): Self = StObject.set(x, "preferTrailingComment", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreferTrailingCommentUndefined: Self = StObject.set(x, "preferTrailingComment", js.undefined)
    }
  }
  
  type PackageDefinition = StringDictionary[AnyDefinition]
  
  @js.native
  trait ProtobufTypeDefinition extends StObject {
    
    var fileDescriptorProtos: js.Array[Buffer] = js.native
    
    var format: String = js.native
    
    var `type`: js.Object = js.native
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
    def EnumTypeDefinition(
      fileDescriptorProtos: js.Array[Buffer],
      format: `Protocol Buffer 3 EnumDescriptorProto`,
      `type`: js.Object
    ): typings.grpcProtoLoader.mod.EnumTypeDefinition = {
      val __obj = js.Dynamic.literal(fileDescriptorProtos = fileDescriptorProtos.asInstanceOf[js.Any], format = format.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.grpcProtoLoader.mod.EnumTypeDefinition]
    }
    
    @scala.inline
    def MessageTypeDefinition(
      fileDescriptorProtos: js.Array[Buffer],
      format: `Protocol Buffer 3 DescriptorProto`,
      `type`: js.Object
    ): typings.grpcProtoLoader.mod.MessageTypeDefinition = {
      val __obj = js.Dynamic.literal(fileDescriptorProtos = fileDescriptorProtos.asInstanceOf[js.Any], format = format.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.grpcProtoLoader.mod.MessageTypeDefinition]
    }
  }
  
  /* augmented module */
  object protobufjsAugmentingMod {
    
    @js.native
    trait Enum extends StObject {
      
      def toDescriptor(protoVersion: String): Message[IEnumDescriptorProto] with IEnumDescriptorProto = js.native
    }
    object Enum {
      
      @scala.inline
      def apply(toDescriptor: String => Message[IEnumDescriptorProto] with IEnumDescriptorProto): Enum = {
        val __obj = js.Dynamic.literal(toDescriptor = js.Any.fromFunction1(toDescriptor))
        __obj.asInstanceOf[Enum]
      }
      
      @scala.inline
      implicit class EnumMutableBuilder[Self <: Enum] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setToDescriptor(value: String => Message[IEnumDescriptorProto] with IEnumDescriptorProto): Self = StObject.set(x, "toDescriptor", js.Any.fromFunction1(value))
      }
    }
    
    @js.native
    trait Root extends StObject {
      
      def toDescriptor(protoVersion: String): Message[IFileDescriptorSet] with IFileDescriptorSet = js.native
    }
    object Root {
      
      @scala.inline
      def apply(toDescriptor: String => Message[IFileDescriptorSet] with IFileDescriptorSet): Root = {
        val __obj = js.Dynamic.literal(toDescriptor = js.Any.fromFunction1(toDescriptor))
        __obj.asInstanceOf[Root]
      }
      
      @scala.inline
      implicit class RootMutableBuilder[Self <: Root] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setToDescriptor(value: String => Message[IFileDescriptorSet] with IFileDescriptorSet): Self = StObject.set(x, "toDescriptor", js.Any.fromFunction1(value))
      }
    }
    
    @js.native
    trait Type extends StObject {
      
      def toDescriptor(protoVersion: String): Message[IDescriptorProto] with IDescriptorProto = js.native
    }
    object Type {
      
      @scala.inline
      def apply(toDescriptor: String => Message[IDescriptorProto] with IDescriptorProto): Type = {
        val __obj = js.Dynamic.literal(toDescriptor = js.Any.fromFunction1(toDescriptor))
        __obj.asInstanceOf[Type]
      }
      
      @scala.inline
      implicit class TypeMutableBuilder[Self <: Type] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setToDescriptor(value: String => Message[IDescriptorProto] with IDescriptorProto): Self = StObject.set(x, "toDescriptor", js.Any.fromFunction1(value))
      }
    }
  }
}
