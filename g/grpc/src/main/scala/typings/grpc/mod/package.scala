package typings.grpc.mod

import org.scalablytyped.runtime.Instantiable3
import org.scalablytyped.runtime.StringDictionary
import typings.grpc.anon.File
import typings.grpc.anon.Serviceurl
import typings.grpc.grpcStrings.json
import typings.grpc.grpcStrings.proto
import typings.grpc.mod.^
import typings.node.bufferMod.global.Buffer
import typings.std.Console
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def closeClient(clientObj: Client): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("closeClient")(clientObj.asInstanceOf[js.Any]).asInstanceOf[Unit]

inline def getClientChannel(client: Client): Channel = ^.asInstanceOf[js.Dynamic].applyDynamic("getClientChannel")(client.asInstanceOf[js.Any]).asInstanceOf[Channel]

inline def load[T](filename: Filename): T = ^.asInstanceOf[js.Dynamic].applyDynamic("load")(filename.asInstanceOf[js.Any]).asInstanceOf[T]
inline def load[T](filename: Filename, format: proto | json): T = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(filename.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).asInstanceOf[T]
inline def load[T](filename: Filename, format: proto | json, options: LoadOptions): T = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(filename.asInstanceOf[js.Any], format.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[T]
inline def load[T](filename: Filename, format: Unit, options: LoadOptions): T = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(filename.asInstanceOf[js.Any], format.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[T]

inline def loadObject[T](value: js.Object): T = ^.asInstanceOf[js.Dynamic].applyDynamic("loadObject")(value.asInstanceOf[js.Any]).asInstanceOf[T]
inline def loadObject[T](value: js.Object, options: LoadObjectOptions): T = (^.asInstanceOf[js.Dynamic].applyDynamic("loadObject")(value.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[T]

inline def loadPackageDefinition(packageDefinition: PackageDefinition): GrpcObject = ^.asInstanceOf[js.Dynamic].applyDynamic("loadPackageDefinition")(packageDefinition.asInstanceOf[js.Any]).asInstanceOf[GrpcObject]

inline def makeGenericClientConstructor(methods: ServiceDefinition[Any], serviceName: String, classOptions: GenericClientOptions): Instantiable3[
/* address */ String, 
/* credentials */ ChannelCredentials, 
/* options */ js.UndefOr[js.Object], 
Client] = (^.asInstanceOf[js.Dynamic].applyDynamic("makeGenericClientConstructor")(methods.asInstanceOf[js.Any], serviceName.asInstanceOf[js.Any], classOptions.asInstanceOf[js.Any])).asInstanceOf[Instantiable3[
/* address */ String, 
/* credentials */ ChannelCredentials, 
/* options */ js.UndefOr[js.Object], 
Client]]

inline def setLogVerbosity(verbosity: logVerbosity): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setLogVerbosity")(verbosity.asInstanceOf[js.Any]).asInstanceOf[Unit]

inline def setLogger(logger: Console): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setLogger")(logger.asInstanceOf[js.Any]).asInstanceOf[Unit]

inline def waitForClientReady(client: Client, deadline: Deadline, callback: js.Function1[/* error */ js.Error | Null, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("waitForClientReady")(client.asInstanceOf[js.Any], deadline.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]

/**
  * Any client call type
  */
type Call = ClientUnaryCall | ClientReadableStream[Any] | ClientWritableStream[Any] | (ClientDuplexStream[Any, Any])

type CancelRequester = js.Function1[/* next */ js.Function, Unit]

type CheckServerIdentityCallback = js.Function2[/* hostname */ String, /* cert */ Certificate, js.UndefOr[js.Error]]

type CloseRequester = js.Function1[/* next */ js.Function, Unit]

type Deadline = Double | js.Date

type Filename = String | File

type GetPeerRequester = js.Function1[/* next */ js.Function, String]

type MessageListener = js.Function2[/* message */ Any, /* next */ js.Function, Unit]

type MessageRequester = js.Function2[/* message */ Any, /* next */ js.Function, Unit]

type MetadataListener = js.Function2[/* metadata */ Metadata, /* next */ js.Function, Unit]

type MetadataRequester = js.Function3[/* metadata */ Metadata, /* listener */ Listener, /* next */ js.Function, Unit]

type MetadataValue = String | Buffer

type PackageDefinition = StringDictionary[ServiceDefinition[Any] | ProtobufTypeDefinition]

type ServerWriteableStream[RequestType, ResponseType] = ServerWritableStream[RequestType, ResponseType]

type StatusListener = js.Function2[/* status */ StatusObject, /* next */ js.Function, Unit]

type UntypedServiceImplementation = StringDictionary[handleCall[Any, Any]]

/**
  * A deserialization function
  * @param data The byte sequence to deserialize
  * @return The data deserialized as a value
  */
type deserialize[T] = js.Function1[/* data */ Buffer, T]

/**
  * User provided method to handle bidirectional streaming calls on the server.
  */
type handleBidiStreamingCall[RequestType, ResponseType] = js.Function1[/* call */ ServerDuplexStream[RequestType, ResponseType], Unit]

type handleCall[RequestType, ResponseType] = (handleUnaryCall[RequestType, ResponseType]) | (handleClientStreamingCall[RequestType, ResponseType]) | (handleServerStreamingCall[RequestType, ResponseType]) | (handleBidiStreamingCall[RequestType, ResponseType])

/**
  * User provided method to handle client streaming methods on the server.
  */
type handleClientStreamingCall[RequestType, ResponseType] = js.Function2[
/* call */ ServerReadableStream[RequestType], 
/* callback */ sendUnaryData[ResponseType], 
Unit]

/**
  * User provided method to handle server streaming methods on the server.
  */
type handleServerStreamingCall[RequestType, ResponseType] = js.Function1[/* call */ ServerWritableStream[RequestType, ResponseType], Unit]

/**
  * User-provided method to handle unary requests on a server
  */
type handleUnaryCall[RequestType, ResponseType] = js.Function2[
/* call */ ServerUnaryCall[RequestType], 
/* callback */ sendUnaryData[ResponseType], 
Unit]

type metadataGenerator = js.Function2[
/* params */ Serviceurl, 
/* callback */ js.Function2[/* error */ js.Error | Null, /* metadata */ js.UndefOr[Metadata], Unit], 
Unit]

type requestCallback[ResponseType] = js.Function2[/* error */ ServiceError | Null, /* value */ js.UndefOr[ResponseType], Unit]

/**
  * Callback function passed to server handlers that handle methods with
  * unary responses.
  */
type sendUnaryData[ResponseType] = js.Function4[
/* error */ ServiceError | Null, 
/* value */ ResponseType | Null, 
/* trailer */ js.UndefOr[Metadata], 
/* flags */ js.UndefOr[Double], 
Unit]

/**
  * A serialization function
  * @param value The value to serialize
  * @return The value serialized as a byte sequence
  */
type serialize[T] = js.Function1[/* value */ T, Buffer]
