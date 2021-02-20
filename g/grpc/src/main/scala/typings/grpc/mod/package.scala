package typings.grpc

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  /**
    * Any client call type
    */
  type Call = typings.grpc.mod.ClientUnaryCall | typings.grpc.mod.ClientReadableStream[js.Any] | typings.grpc.mod.ClientWritableStream[js.Any] | (typings.grpc.mod.ClientDuplexStream[js.Any, js.Any])
  
  type CancelRequester = js.Function1[/* next */ js.Function, scala.Unit]
  
  type CheckServerIdentityCallback = js.Function2[
    /* hostname */ java.lang.String, 
    /* cert */ typings.grpc.mod.Certificate, 
    js.UndefOr[typings.std.Error]
  ]
  
  type CloseRequester = js.Function1[/* next */ js.Function, scala.Unit]
  
  type Deadline = scala.Double | typings.std.Date
  
  type Filename = java.lang.String | typings.grpc.anon.File
  
  type GetPeerRequester = js.Function1[/* next */ js.Function, java.lang.String]
  
  type MessageListener = js.Function2[/* message */ js.Any, /* next */ js.Function, scala.Unit]
  
  type MessageRequester = js.Function2[/* message */ js.Any, /* next */ js.Function, scala.Unit]
  
  type MetadataListener = js.Function2[/* metadata */ typings.grpc.mod.Metadata, /* next */ js.Function, scala.Unit]
  
  type MetadataRequester = js.Function3[
    /* metadata */ typings.grpc.mod.Metadata, 
    /* listener */ typings.grpc.mod.Listener, 
    /* next */ js.Function, 
    scala.Unit
  ]
  
  type MetadataValue = java.lang.String | typings.node.Buffer
  
  type PackageDefinition = org.scalablytyped.runtime.StringDictionary[
    typings.grpc.mod.ServiceDefinition[js.Any] | typings.grpc.mod.ProtobufTypeDefinition
  ]
  
  type ServerWriteableStream[RequestType, ResponseType] = typings.grpc.mod.ServerWritableStream[RequestType, ResponseType]
  
  type ServiceDefinition[ImplementationType] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {readonly [ I in keyof ImplementationType ]: grpc.grpc.MethodDefinition<any, any>}
    */ typings.grpc.grpcStrings.ServiceDefinition with org.scalablytyped.runtime.TopLevel[js.Any]
  
  type StatusListener = js.Function2[/* status */ typings.grpc.mod.StatusObject, /* next */ js.Function, scala.Unit]
  
  type UntypedServiceImplementation = org.scalablytyped.runtime.StringDictionary[typings.grpc.mod.handleCall[js.Any, js.Any]]
  
  @scala.inline
  def closeClient(clientObj: typings.grpc.mod.Client): scala.Unit = typings.grpc.mod.^.asInstanceOf[js.Dynamic].applyDynamic("closeClient")(clientObj.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
  
  /**
    * A deserialization function
    * @param data The byte sequence to deserialize
    * @return The data deserialized as a value
    */
  type deserialize[T] = js.Function1[/* data */ typings.node.Buffer, T]
  
  @scala.inline
  def getClientChannel(client: typings.grpc.mod.Client): typings.grpc.mod.Channel = typings.grpc.mod.^.asInstanceOf[js.Dynamic].applyDynamic("getClientChannel")(client.asInstanceOf[js.Any]).asInstanceOf[typings.grpc.mod.Channel]
  
  /**
    * User provided method to handle bidirectional streaming calls on the server.
    */
  type handleBidiStreamingCall[RequestType, ResponseType] = js.Function1[
    /* call */ typings.grpc.mod.ServerDuplexStream[RequestType, ResponseType], 
    scala.Unit
  ]
  
  type handleCall[RequestType, ResponseType] = (typings.grpc.mod.handleUnaryCall[RequestType, ResponseType]) | (typings.grpc.mod.handleClientStreamingCall[RequestType, ResponseType]) | (typings.grpc.mod.handleServerStreamingCall[RequestType, ResponseType]) | (typings.grpc.mod.handleBidiStreamingCall[RequestType, ResponseType])
  
  /**
    * User provided method to handle client streaming methods on the server.
    */
  type handleClientStreamingCall[RequestType, ResponseType] = js.Function2[
    /* call */ typings.grpc.mod.ServerReadableStream[RequestType], 
    /* callback */ typings.grpc.mod.sendUnaryData[ResponseType], 
    scala.Unit
  ]
  
  /**
    * User provided method to handle server streaming methods on the server.
    */
  type handleServerStreamingCall[RequestType, ResponseType] = js.Function1[
    /* call */ typings.grpc.mod.ServerWritableStream[RequestType, ResponseType], 
    scala.Unit
  ]
  
  /**
    * User-provided method to handle unary requests on a server
    */
  type handleUnaryCall[RequestType, ResponseType] = js.Function2[
    /* call */ typings.grpc.mod.ServerUnaryCall[RequestType], 
    /* callback */ typings.grpc.mod.sendUnaryData[ResponseType], 
    scala.Unit
  ]
  
  @scala.inline
  def load[T](filename: typings.grpc.mod.Filename): T = typings.grpc.mod.^.asInstanceOf[js.Dynamic].applyDynamic("load")(filename.asInstanceOf[js.Any]).asInstanceOf[T]
  @scala.inline
  def load[T](
    filename: typings.grpc.mod.Filename,
    format: js.UndefOr[scala.Nothing],
    options: typings.grpc.mod.LoadOptions
  ): T = (typings.grpc.mod.^.asInstanceOf[js.Dynamic].applyDynamic("load")(filename.asInstanceOf[js.Any], format.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[T]
  
  @scala.inline
  def loadObject[T](value: js.Object): T = typings.grpc.mod.^.asInstanceOf[js.Dynamic].applyDynamic("loadObject")(value.asInstanceOf[js.Any]).asInstanceOf[T]
  @scala.inline
  def loadObject[T](value: js.Object, options: typings.grpc.mod.LoadObjectOptions): T = (typings.grpc.mod.^.asInstanceOf[js.Dynamic].applyDynamic("loadObject")(value.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[T]
  
  @scala.inline
  def loadPackageDefinition(packageDefinition: typings.grpc.mod.PackageDefinition): typings.grpc.mod.GrpcObject = typings.grpc.mod.^.asInstanceOf[js.Dynamic].applyDynamic("loadPackageDefinition")(packageDefinition.asInstanceOf[js.Any]).asInstanceOf[typings.grpc.mod.GrpcObject]
  
  @scala.inline
  def load_json[T](filename: typings.grpc.mod.Filename, format: typings.grpc.grpcStrings.json): T = (typings.grpc.mod.^.asInstanceOf[js.Dynamic].applyDynamic("load")(filename.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).asInstanceOf[T]
  @scala.inline
  def load_json[T](
    filename: typings.grpc.mod.Filename,
    format: typings.grpc.grpcStrings.json,
    options: typings.grpc.mod.LoadOptions
  ): T = (typings.grpc.mod.^.asInstanceOf[js.Dynamic].applyDynamic("load")(filename.asInstanceOf[js.Any], format.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[T]
  
  @scala.inline
  def load_proto[T](filename: typings.grpc.mod.Filename, format: typings.grpc.grpcStrings.proto): T = (typings.grpc.mod.^.asInstanceOf[js.Dynamic].applyDynamic("load")(filename.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).asInstanceOf[T]
  @scala.inline
  def load_proto[T](
    filename: typings.grpc.mod.Filename,
    format: typings.grpc.grpcStrings.proto,
    options: typings.grpc.mod.LoadOptions
  ): T = (typings.grpc.mod.^.asInstanceOf[js.Dynamic].applyDynamic("load")(filename.asInstanceOf[js.Any], format.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[T]
  
  @scala.inline
  def makeGenericClientConstructor(
    methods: typings.grpc.mod.ServiceDefinition[_],
    serviceName: java.lang.String,
    classOptions: typings.grpc.mod.GenericClientOptions
  ): org.scalablytyped.runtime.Instantiable3[
    /* address */ java.lang.String, 
    /* credentials */ typings.grpc.mod.ChannelCredentials, 
    /* options */ js.UndefOr[js.Object], 
    typings.grpc.mod.Client
  ] = (typings.grpc.mod.^.asInstanceOf[js.Dynamic].applyDynamic("makeGenericClientConstructor")(methods.asInstanceOf[js.Any], serviceName.asInstanceOf[js.Any], classOptions.asInstanceOf[js.Any])).asInstanceOf[org.scalablytyped.runtime.Instantiable3[
    /* address */ java.lang.String, 
    /* credentials */ typings.grpc.mod.ChannelCredentials, 
    /* options */ js.UndefOr[js.Object], 
    typings.grpc.mod.Client
  ]]
  
  type metadataGenerator = js.Function2[
    /* params */ typings.grpc.anon.Serviceurl, 
    /* callback */ js.Function2[
      /* error */ typings.std.Error | scala.Null, 
      /* metadata */ js.UndefOr[typings.grpc.mod.Metadata], 
      scala.Unit
    ], 
    scala.Unit
  ]
  
  type requestCallback[ResponseType] = js.Function2[
    /* error */ typings.grpc.mod.ServiceError | scala.Null, 
    /* value */ js.UndefOr[ResponseType], 
    scala.Unit
  ]
  
  /**
    * Callback function passed to server handlers that handle methods with
    * unary responses.
    */
  type sendUnaryData[ResponseType] = js.Function4[
    /* error */ typings.grpc.mod.ServiceError | scala.Null, 
    /* value */ ResponseType | scala.Null, 
    /* trailer */ js.UndefOr[typings.grpc.mod.Metadata], 
    /* flags */ js.UndefOr[scala.Double], 
    scala.Unit
  ]
  
  /**
    * A serialization function
    * @param value The value to serialize
    * @return The value serialized as a byte sequence
    */
  type serialize[T] = js.Function1[/* value */ T, typings.node.Buffer]
  
  @scala.inline
  def setLogVerbosity(verbosity: typings.grpc.mod.logVerbosity): scala.Unit = typings.grpc.mod.^.asInstanceOf[js.Dynamic].applyDynamic("setLogVerbosity")(verbosity.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
  
  @scala.inline
  def setLogger(logger: typings.std.Console): scala.Unit = typings.grpc.mod.^.asInstanceOf[js.Dynamic].applyDynamic("setLogger")(logger.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
  
  @scala.inline
  def waitForClientReady(
    client: typings.grpc.mod.Client,
    deadline: typings.grpc.mod.Deadline,
    callback: js.Function1[/* error */ typings.std.Error | scala.Null, scala.Unit]
  ): scala.Unit = (typings.grpc.mod.^.asInstanceOf[js.Dynamic].applyDynamic("waitForClientReady")(client.asInstanceOf[js.Any], deadline.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
}
