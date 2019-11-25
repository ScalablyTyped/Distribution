package typings.atGrpcGrpcDashJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object buildSrcServerDashCallMod {
  import typings.atGrpcGrpcDashJs.Anon_Cancelled
  import typings.atGrpcGrpcDashJs.Anon_Request
  import typings.atGrpcGrpcDashJs.buildSrcCallDashStreamMod.StatusObject
  import typings.atGrpcGrpcDashJs.buildSrcMetadataMod.Metadata
  import typings.atGrpcGrpcDashJs.buildSrcObjectDashStreamMod.ObjectReadable
  import typings.atGrpcGrpcDashJs.buildSrcObjectDashStreamMod.ObjectWritable
  import typings.node.eventsMod.EventEmitter
  import typings.std.Error
  import typings.std.Partial

  type HandleCall[RequestType, ResponseType] = (handleUnaryCall[RequestType, ResponseType]) | (handleClientStreamingCall[RequestType, ResponseType]) | (handleServerStreamingCall[RequestType, ResponseType]) | (handleBidiStreamingCall[RequestType, ResponseType])
  type ServerDuplexStream[RequestType, ResponseType] = ServerSurfaceCall with ObjectReadable[RequestType] with ObjectWritable[ResponseType]
  type ServerErrorResponse = ServerStatusResponse with Error
  type ServerReadableStream[RequestType, ResponseType] = ServerSurfaceCall with ObjectReadable[RequestType]
  type ServerStatusResponse = Partial[StatusObject]
  type ServerSurfaceCall = Anon_Cancelled with EventEmitter
  type ServerUnaryCall[RequestType, ResponseType] = ServerSurfaceCall with Anon_Request[RequestType]
  type ServerWritableStream[RequestType, ResponseType] = ServerSurfaceCall with ObjectWritable[ResponseType] with Anon_Request[RequestType]
  type handleBidiStreamingCall[RequestType, ResponseType] = js.Function1[/* call */ ServerDuplexStream[RequestType, ResponseType], Unit]
  type handleClientStreamingCall[RequestType, ResponseType] = js.Function2[
    /* call */ ServerReadableStream[RequestType, ResponseType], 
    /* callback */ sendUnaryData[ResponseType], 
    Unit
  ]
  type handleServerStreamingCall[RequestType, ResponseType] = js.Function1[/* call */ ServerWritableStream[RequestType, ResponseType], Unit]
  type handleUnaryCall[RequestType, ResponseType] = js.Function2[
    /* call */ ServerUnaryCall[RequestType, ResponseType], 
    /* callback */ sendUnaryData[ResponseType], 
    Unit
  ]
  type sendUnaryData[ResponseType] = js.Function4[
    /* error */ ServerErrorResponse | ServerStatusResponse | Null, 
    /* value */ ResponseType | Null, 
    /* trailer */ js.UndefOr[Metadata], 
    /* flags */ js.UndefOr[Double], 
    Unit
  ]
}
