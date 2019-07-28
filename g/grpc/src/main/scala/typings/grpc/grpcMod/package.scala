package typings.grpc

import org.scalablytyped.runtime.StringDictionary
import typings.grpc.Anon_File
import typings.grpc.Anon_Serviceurl
import typings.node.Buffer
import typings.std.Date
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object grpcMod {
  /**
    * Any client call type
    */
  type Call = ClientUnaryCall | ClientReadableStream[js.Any] | ClientWritableStream[js.Any] | (ClientDuplexStream[js.Any, js.Any])
  type CancelRequester = js.Function1[/* next */ js.Function, Unit]
  type CheckServerIdentityCallback = js.Function2[/* hostname */ String, /* cert */ Certificate, js.UndefOr[Error]]
  type CloseRequester = js.Function1[/* next */ js.Function, Unit]
  type Deadline = Double | Date
  type Filename = String | Anon_File
  type GetPeerRequester = js.Function1[/* next */ js.Function, String]
  type MessageListener = js.Function2[/* message */ js.Any, /* next */ js.Function, Unit]
  type MessageRequester = js.Function2[/* message */ js.Any, /* next */ js.Function, Unit]
  type MetadataListener = js.Function2[/* metadata */ Metadata, /* next */ js.Function, Unit]
  type MetadataRequester = js.Function3[/* metadata */ Metadata, /* listener */ Listener, /* next */ js.Function, Unit]
  type MetadataValue = String | Buffer
  type PackageDefinition = StringDictionary[ServiceDefinition[js.Any] | ProtobufTypeDefinition]
  type ServiceDefinition[ImplementationType] = /* import warning: ImportType.apply c Unsupported type mapping: 
  {readonly [ I in keyof ImplementationType ]: grpc.grpc.MethodDefinition<any, any>}
    */ typings.grpc.grpcStrings.ServiceDefinition with js.Any
  type StatusListener = js.Function2[/* status */ StatusObject, /* next */ js.Function, Unit]
  type UntypedServiceImplementation = StringDictionary[handleCall[js.Any, js.Any]]
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
    Unit
  ]
  /**
    * User provided method to handle server streaming methods on the server.
    */
  type handleServerStreamingCall[RequestType, ResponseType] = js.Function1[/* call */ ServerWriteableStream[RequestType], Unit]
  /**
    * User-provided method to handle unary requests on a server
    */
  type handleUnaryCall[RequestType, ResponseType] = js.Function2[
    /* call */ ServerUnaryCall[RequestType], 
    /* callback */ sendUnaryData[ResponseType], 
    Unit
  ]
  type metadataGenerator = js.Function2[
    /* params */ Anon_Serviceurl, 
    /* callback */ js.Function2[/* error */ Error | Null, /* metadata */ js.UndefOr[Metadata], Unit], 
    Unit
  ]
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
    Unit
  ]
  /**
    * A serialization function
    * @param value The value to serialize
    * @return The value serialized as a byte sequence
    */
  type serialize[T] = js.Function1[/* value */ T, Buffer]
}
