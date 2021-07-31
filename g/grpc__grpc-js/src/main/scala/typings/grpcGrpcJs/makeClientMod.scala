package typings.grpcGrpcJs

import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Instantiable3
import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.TopLevel
import typings.grpcGrpcJs.anon.PartialChannelOptions
import typings.grpcGrpcJs.channelCredentialsMod.ChannelCredentials
import typings.grpcGrpcJs.clientMod.Client
import typings.node.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object makeClientMod {
  
  @JSImport("@grpc/grpc-js/build/src/make-client", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def loadPackageDefinition(packageDef: PackageDefinition): GrpcObject = ^.asInstanceOf[js.Dynamic].applyDynamic("loadPackageDefinition")(packageDef.asInstanceOf[js.Any]).asInstanceOf[GrpcObject]
  
  @scala.inline
  def makeClientConstructor(methods: js.Object, serviceName: String): ServiceClientConstructor = (^.asInstanceOf[js.Dynamic].applyDynamic("makeClientConstructor")(methods.asInstanceOf[js.Any], serviceName.asInstanceOf[js.Any])).asInstanceOf[ServiceClientConstructor]
  @scala.inline
  def makeClientConstructor(methods: js.Object, serviceName: String, classOptions: js.Object): ServiceClientConstructor = (^.asInstanceOf[js.Dynamic].applyDynamic("makeClientConstructor")(methods.asInstanceOf[js.Any], serviceName.asInstanceOf[js.Any], classOptions.asInstanceOf[js.Any])).asInstanceOf[ServiceClientConstructor]
  
  trait ClientMethodDefinition[RequestType, ResponseType] extends StObject {
    
    var originalName: js.UndefOr[String] = js.undefined
    
    var path: String
    
    def requestSerialize(value: RequestType): Buffer
    @JSName("requestSerialize")
    var requestSerialize_Original: Serialize[RequestType]
    
    var requestStream: Boolean
    
    def responseDeserialize(bytes: Buffer): ResponseType
    @JSName("responseDeserialize")
    var responseDeserialize_Original: Deserialize[ResponseType]
    
    var responseStream: Boolean
  }
  object ClientMethodDefinition {
    
    @scala.inline
    def apply[RequestType, ResponseType](
      path: String,
      requestSerialize: RequestType => Buffer,
      requestStream: Boolean,
      responseDeserialize: /* bytes */ Buffer => ResponseType,
      responseStream: Boolean
    ): ClientMethodDefinition[RequestType, ResponseType] = {
      val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], requestSerialize = js.Any.fromFunction1(requestSerialize), requestStream = requestStream.asInstanceOf[js.Any], responseDeserialize = js.Any.fromFunction1(responseDeserialize), responseStream = responseStream.asInstanceOf[js.Any])
      __obj.asInstanceOf[ClientMethodDefinition[RequestType, ResponseType]]
    }
    
    @scala.inline
    implicit class ClientMethodDefinitionMutableBuilder[Self <: ClientMethodDefinition[?, ?], RequestType, ResponseType] (val x: Self & (ClientMethodDefinition[RequestType, ResponseType])) extends AnyVal {
      
      @scala.inline
      def setOriginalName(value: String): Self = StObject.set(x, "originalName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOriginalNameUndefined: Self = StObject.set(x, "originalName", js.undefined)
      
      @scala.inline
      def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRequestSerialize(value: RequestType => Buffer): Self = StObject.set(x, "requestSerialize", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRequestStream(value: Boolean): Self = StObject.set(x, "requestStream", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResponseDeserialize(value: /* bytes */ Buffer => ResponseType): Self = StObject.set(x, "responseDeserialize", js.Any.fromFunction1(value))
      
      @scala.inline
      def setResponseStream(value: Boolean): Self = StObject.set(x, "responseStream", value.asInstanceOf[js.Any])
    }
  }
  
  type Deserialize[T] = js.Function1[/* bytes */ Buffer, T]
  
  trait GrpcObject
    extends StObject
       with /* index */ StringDictionary[GrpcObject | ServiceClientConstructor | ProtobufTypeDefinition]
  object GrpcObject {
    
    @scala.inline
    def apply(): GrpcObject = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GrpcObject]
    }
  }
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.grpcGrpcJs.makeClientMod.ServerMethodDefinition because var conflicts: originalName, path, requestStream, responseStream. Inlined responseSerialize, responseSerialize_Original, requestDeserialize, requestDeserialize_Original */ trait MethodDefinition[RequestType, ResponseType]
    extends StObject
       with ClientMethodDefinition[RequestType, ResponseType] {
    
    def requestDeserialize(bytes: Buffer): RequestType
    @JSName("requestDeserialize")
    var requestDeserialize_Original: Deserialize[RequestType]
    
    def responseSerialize(value: ResponseType): Buffer
    @JSName("responseSerialize")
    var responseSerialize_Original: Serialize[ResponseType]
  }
  object MethodDefinition {
    
    @scala.inline
    def apply[RequestType, ResponseType](
      path: String,
      requestDeserialize: /* bytes */ Buffer => RequestType,
      requestSerialize: RequestType => Buffer,
      requestStream: Boolean,
      responseDeserialize: /* bytes */ Buffer => ResponseType,
      responseSerialize: ResponseType => Buffer,
      responseStream: Boolean
    ): MethodDefinition[RequestType, ResponseType] = {
      val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], requestDeserialize = js.Any.fromFunction1(requestDeserialize), requestSerialize = js.Any.fromFunction1(requestSerialize), requestStream = requestStream.asInstanceOf[js.Any], responseDeserialize = js.Any.fromFunction1(responseDeserialize), responseSerialize = js.Any.fromFunction1(responseSerialize), responseStream = responseStream.asInstanceOf[js.Any])
      __obj.asInstanceOf[MethodDefinition[RequestType, ResponseType]]
    }
    
    @scala.inline
    implicit class MethodDefinitionMutableBuilder[Self <: MethodDefinition[?, ?], RequestType, ResponseType] (val x: Self & (MethodDefinition[RequestType, ResponseType])) extends AnyVal {
      
      @scala.inline
      def setRequestDeserialize(value: /* bytes */ Buffer => RequestType): Self = StObject.set(x, "requestDeserialize", js.Any.fromFunction1(value))
      
      @scala.inline
      def setResponseSerialize(value: ResponseType => Buffer): Self = StObject.set(x, "responseSerialize", js.Any.fromFunction1(value))
    }
  }
  
  type PackageDefinition = StringDictionary[js.Object | ProtobufTypeDefinition]
  
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
  
  trait ServerMethodDefinition[RequestType, ResponseType] extends StObject {
    
    var originalName: js.UndefOr[String] = js.undefined
    
    var path: String
    
    def requestDeserialize(bytes: Buffer): RequestType
    @JSName("requestDeserialize")
    var requestDeserialize_Original: Deserialize[RequestType]
    
    var requestStream: Boolean
    
    def responseSerialize(value: ResponseType): Buffer
    @JSName("responseSerialize")
    var responseSerialize_Original: Serialize[ResponseType]
    
    var responseStream: Boolean
  }
  object ServerMethodDefinition {
    
    @scala.inline
    def apply[RequestType, ResponseType](
      path: String,
      requestDeserialize: /* bytes */ Buffer => RequestType,
      requestStream: Boolean,
      responseSerialize: ResponseType => Buffer,
      responseStream: Boolean
    ): ServerMethodDefinition[RequestType, ResponseType] = {
      val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], requestDeserialize = js.Any.fromFunction1(requestDeserialize), requestStream = requestStream.asInstanceOf[js.Any], responseSerialize = js.Any.fromFunction1(responseSerialize), responseStream = responseStream.asInstanceOf[js.Any])
      __obj.asInstanceOf[ServerMethodDefinition[RequestType, ResponseType]]
    }
    
    @scala.inline
    implicit class ServerMethodDefinitionMutableBuilder[Self <: ServerMethodDefinition[?, ?], RequestType, ResponseType] (val x: Self & (ServerMethodDefinition[RequestType, ResponseType])) extends AnyVal {
      
      @scala.inline
      def setOriginalName(value: String): Self = StObject.set(x, "originalName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOriginalNameUndefined: Self = StObject.set(x, "originalName", js.undefined)
      
      @scala.inline
      def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRequestDeserialize(value: /* bytes */ Buffer => RequestType): Self = StObject.set(x, "requestDeserialize", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRequestStream(value: Boolean): Self = StObject.set(x, "requestStream", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResponseSerialize(value: ResponseType => Buffer): Self = StObject.set(x, "responseSerialize", js.Any.fromFunction1(value))
      
      @scala.inline
      def setResponseStream(value: Boolean): Self = StObject.set(x, "responseStream", value.asInstanceOf[js.Any])
    }
  }
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - scala.Any because Inheritance from two classes. Inlined 
  - scala.AnyRef because Inheritance from two classes. Inlined 
  - scala.Any because Inheritance from two classes. Inlined getClass, hashCode, eq, equals, toString, ne, notify, notifyAll, wait, wait, wait, clone, finalize
  - js.Any because Inheritance from two classes. Inlined 
  - scala.AnyRef because Inheritance from two classes. Inlined 
  - js.Object because Inheritance from two classes. Inlined 
  - js.Any because Inheritance from two classes. Inlined 
  - org.scalablytyped.runtime.StObject because Inheritance from two classes. Inlined 
  - js.Object because Inheritance from two classes. Inlined hasOwnProperty, propertyIsEnumerable, valueOf, toLocaleString, isPrototypeOf
  - org.scalablytyped.runtime.StringDictionary because Inheritance from two classes. Inlined  */ @js.native
  trait ServiceClient extends Client
  
  @js.native
  trait ServiceClientConstructor
    extends StObject
       with Instantiable2[/* address */ String, /* credentials */ ChannelCredentials, ServiceClient]
       with Instantiable3[
          /* address */ String, 
          /* credentials */ ChannelCredentials, 
          /* options */ PartialChannelOptions, 
          ServiceClient
        ]
  
  type ServiceDefinition[ImplementationType] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {readonly [ index in keyof ImplementationType ]: @grpc/grpc-js.@grpc/grpc-js/build/src/make-client.MethodDefinition<any, any>}
    */ typings.grpcGrpcJs.grpcGrpcJsStrings.ServiceDefinition & TopLevel[js.Any]
}
