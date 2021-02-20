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
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object makeClientMod {
  
  @JSImport("@grpc/grpc-js/build/src/make-client", "loadPackageDefinition")
  @js.native
  def loadPackageDefinition(packageDef: PackageDefinition): GrpcObject = js.native
  
  @JSImport("@grpc/grpc-js/build/src/make-client", "makeClientConstructor")
  @js.native
  def makeClientConstructor(methods: js.Object, serviceName: String): ServiceClientConstructor = js.native
  @JSImport("@grpc/grpc-js/build/src/make-client", "makeClientConstructor")
  @js.native
  def makeClientConstructor(methods: js.Object, serviceName: String, classOptions: js.Object): ServiceClientConstructor = js.native
  
  @js.native
  trait ClientMethodDefinition[RequestType, ResponseType] extends StObject {
    
    var originalName: js.UndefOr[String] = js.native
    
    var path: String = js.native
    
    def requestSerialize(value: RequestType): Buffer = js.native
    @JSName("requestSerialize")
    var requestSerialize_Original: Serialize[RequestType] = js.native
    
    var requestStream: Boolean = js.native
    
    def responseDeserialize(bytes: Buffer): ResponseType = js.native
    @JSName("responseDeserialize")
    var responseDeserialize_Original: Deserialize[ResponseType] = js.native
    
    var responseStream: Boolean = js.native
  }
  
  type Deserialize[T] = js.Function1[/* bytes */ Buffer, T]
  
  @js.native
  trait GrpcObject extends /* index */ StringDictionary[GrpcObject | ServiceClientConstructor | ProtobufTypeDefinition]
  object GrpcObject {
    
    @scala.inline
    def apply(): GrpcObject = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GrpcObject]
    }
  }
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.grpcGrpcJs.makeClientMod.ServerMethodDefinition because var conflicts: originalName, path, requestStream, responseStream. Inlined responseSerialize, responseSerialize_Original, requestDeserialize, requestDeserialize_Original */ @js.native
  trait MethodDefinition[RequestType, ResponseType] extends ClientMethodDefinition[RequestType, ResponseType] {
    
    def requestDeserialize(bytes: Buffer): RequestType = js.native
    @JSName("requestDeserialize")
    var requestDeserialize_Original: Deserialize[RequestType] = js.native
    
    def responseSerialize(value: ResponseType): Buffer = js.native
    @JSName("responseSerialize")
    var responseSerialize_Original: Serialize[ResponseType] = js.native
  }
  
  type PackageDefinition = StringDictionary[js.Object | ProtobufTypeDefinition]
  
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
  
  @js.native
  trait ServerMethodDefinition[RequestType, ResponseType] extends StObject {
    
    var originalName: js.UndefOr[String] = js.native
    
    var path: String = js.native
    
    def requestDeserialize(bytes: Buffer): RequestType = js.native
    @JSName("requestDeserialize")
    var requestDeserialize_Original: Deserialize[RequestType] = js.native
    
    var requestStream: Boolean = js.native
    
    def responseSerialize(value: ResponseType): Buffer = js.native
    @JSName("responseSerialize")
    var responseSerialize_Original: Serialize[ResponseType] = js.native
    
    var responseStream: Boolean = js.native
  }
  
  @js.native
  trait ServiceClient
    extends Client
       with /* methodName */ StringDictionary[js.Function]
  
  @js.native
  trait ServiceClientConstructor
    extends Instantiable2[/* address */ String, /* credentials */ ChannelCredentials, ServiceClient]
       with Instantiable3[
          /* address */ String, 
          /* credentials */ ChannelCredentials, 
          /* options */ PartialChannelOptions, 
          ServiceClient
        ]
  
  type ServiceDefinition[ImplementationType] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {readonly [ index in keyof ImplementationType ]: @grpc/grpc-js.@grpc/grpc-js/build/src/make-client.MethodDefinition<any, any>}
    */ typings.grpcGrpcJs.grpcGrpcJsStrings.ServiceDefinition with TopLevel[js.Any]
}
