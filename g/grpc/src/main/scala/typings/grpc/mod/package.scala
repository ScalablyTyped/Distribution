package typings.grpc

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  type Filename = java.lang.String | typings.grpc.AnonFile
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
  type ServerWriteableStream[RequestType] = typings.grpc.mod.ServerWritableStream[RequestType]
  type ServiceDefinition[ImplementationType] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {readonly [ I in keyof ImplementationType ]: grpc.grpc.MethodDefinition<any, any>}
    */ typings.grpc.grpcStrings.ServiceDefinition with org.scalablytyped.runtime.TopLevel[js.Any]
  type StatusListener = js.Function2[/* status */ typings.grpc.mod.StatusObject, /* next */ js.Function, scala.Unit]
  type UntypedServiceImplementation = org.scalablytyped.runtime.StringDictionary[typings.grpc.mod.handleCall[js.Any, js.Any]]
  /**
    * A deserialization function
    * @param data The byte sequence to deserialize
    * @return The data deserialized as a value
    */
  type deserialize[T] = js.Function1[/* data */ typings.node.Buffer, T]
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
  type handleServerStreamingCall[RequestType, ResponseType] = js.Function1[/* call */ typings.grpc.mod.ServerWritableStream[RequestType], scala.Unit]
  /**
    * User-provided method to handle unary requests on a server
    */
  type handleUnaryCall[RequestType, ResponseType] = js.Function2[
    /* call */ typings.grpc.mod.ServerUnaryCall[RequestType], 
    /* callback */ typings.grpc.mod.sendUnaryData[ResponseType], 
    scala.Unit
  ]
  type metadataGenerator = js.Function2[
    /* params */ typings.grpc.AnonServiceurl, 
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
}
