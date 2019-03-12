package typings
package grpcLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object grpcMod {
  /**
    * Any client call type
    */
  type Call = ClientUnaryCall | ClientReadableStream[js.Any] | ClientWritableStream[js.Any] | (ClientDuplexStream[js.Any, js.Any])
  type CancelRequester = js.Function1[/* next */ js.Function, scala.Unit]
  type CheckServerIdentityCallback = js.Function2[/* hostname */ java.lang.String, /* cert */ Certificate, js.UndefOr[stdLib.Error]]
  type CloseRequester = js.Function1[/* next */ js.Function, scala.Unit]
  type Deadline = scala.Double | stdLib.Date
  type Filename = java.lang.String | grpcLib.Anon_File
  type GetPeerRequester = js.Function1[/* next */ js.Function, java.lang.String]
  type MessageListener = js.Function2[/* message */ js.Any, /* next */ js.Function, scala.Unit]
  type MessageRequester = js.Function2[/* message */ js.Any, /* next */ js.Function, scala.Unit]
  type MetadataListener = js.Function2[/* metadata */ Metadata, /* next */ js.Function, scala.Unit]
  type MetadataRequester = js.Function3[/* metadata */ Metadata, /* listener */ Listener, /* next */ js.Function, scala.Unit]
  type MetadataValue = java.lang.String | nodeLib.Buffer
  type ServiceDefinition[ImplementationType] = /* import warning: ImportType.apply c Unsupported type mapping: 
  {readonly [ I in keyof ImplementationType ]: grpc.grpc.MethodDefinition<any, any>}
    */ grpcLib.grpcLibStrings.ServiceDefinition with js.Any
  type StatusListener = js.Function2[/* status */ StatusObject, /* next */ js.Function, scala.Unit]
  /**
    * A deserialization function
    * @param data The byte sequence to deserialize
    * @return The data deserialized as a value
    */
  type deserialize[T] = js.Function1[/* data */ nodeLib.Buffer, T]
  /**
    * User provided method to handle bidirectional streaming calls on the server.
    */
  type handleBidiStreamingCall[RequestType, ResponseType] = js.Function1[/* call */ ServerDuplexStream[RequestType, ResponseType], scala.Unit]
  type handleCall[RequestType, ResponseType] = (handleUnaryCall[RequestType, ResponseType]) | (handleClientStreamingCall[RequestType, ResponseType]) | (handleServerStreamingCall[RequestType, ResponseType]) | (handleBidiStreamingCall[RequestType, ResponseType])
  /**
    * User provided method to handle client streaming methods on the server.
    */
  type handleClientStreamingCall[RequestType, ResponseType] = js.Function2[
    /* call */ ServerReadableStream[RequestType], 
    /* callback */ sendUnaryData[ResponseType], 
    scala.Unit
  ]
  /**
    * User provided method to handle server streaming methods on the server.
    */
  type handleServerStreamingCall[RequestType, ResponseType] = js.Function1[/* call */ ServerWriteableStream[RequestType], scala.Unit]
  /**
    * User-provided method to handle unary requests on a server
    */
  type handleUnaryCall[RequestType, ResponseType] = js.Function2[
    /* call */ ServerUnaryCall[RequestType], 
    /* callback */ sendUnaryData[ResponseType], 
    scala.Unit
  ]
  type metadataGenerator = js.Function2[
    /* params */ grpcLib.Anon_Serviceurl, 
    /* callback */ js.Function2[
      /* error */ stdLib.Error | scala.Null, 
      /* metadata */ js.UndefOr[Metadata], 
      scala.Unit
    ], 
    scala.Unit
  ]
  type requestCallback[ResponseType] = js.Function2[
    /* error */ ServiceError | scala.Null, 
    /* value */ js.UndefOr[ResponseType], 
    scala.Unit
  ]
  /**
    * Callback function passed to server handlers that handle methods with
    * unary responses.
    */
  type sendUnaryData[ResponseType] = js.Function4[
    /* error */ ServiceError | scala.Null, 
    /* value */ ResponseType | scala.Null, 
    /* trailer */ js.UndefOr[Metadata], 
    /* flags */ js.UndefOr[scala.Double], 
    scala.Unit
  ]
  /**
    * A serialization function
    * @param value The value to serialize
    * @return The value serialized as a byte sequence
    */
  type serialize[T] = js.Function1[/* value */ T, nodeLib.Buffer]
}
