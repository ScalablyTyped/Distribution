package typings.grpcGrpcJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object serverCallMod {
  
  type HandleCall[RequestType, ResponseType] = (typings.grpcGrpcJs.serverCallMod.handleUnaryCall[RequestType, ResponseType]) | (typings.grpcGrpcJs.serverCallMod.handleClientStreamingCall[RequestType, ResponseType]) | (typings.grpcGrpcJs.serverCallMod.handleServerStreamingCall[RequestType, ResponseType]) | (typings.grpcGrpcJs.serverCallMod.handleBidiStreamingCall[RequestType, ResponseType])
  
  type handleBidiStreamingCall[RequestType, ResponseType] = js.Function1[
    /* call */ typings.grpcGrpcJs.serverCallMod.ServerDuplexStream[RequestType, ResponseType], 
    scala.Unit
  ]
  
  type handleClientStreamingCall[RequestType, ResponseType] = js.Function2[
    /* call */ typings.grpcGrpcJs.serverCallMod.ServerReadableStream[RequestType, ResponseType], 
    /* callback */ typings.grpcGrpcJs.serverCallMod.sendUnaryData[ResponseType], 
    scala.Unit
  ]
  
  type handleServerStreamingCall[RequestType, ResponseType] = js.Function1[
    /* call */ typings.grpcGrpcJs.serverCallMod.ServerWritableStream[RequestType, ResponseType], 
    scala.Unit
  ]
  
  type handleUnaryCall[RequestType, ResponseType] = js.Function2[
    /* call */ typings.grpcGrpcJs.serverCallMod.ServerUnaryCall[RequestType, ResponseType], 
    /* callback */ typings.grpcGrpcJs.serverCallMod.sendUnaryData[ResponseType], 
    scala.Unit
  ]
  
  type sendUnaryData[ResponseType] = js.Function4[
    /* error */ typings.grpcGrpcJs.serverCallMod.ServerErrorResponse | typings.grpcGrpcJs.serverCallMod.ServerStatusResponse | scala.Null, 
    /* value */ ResponseType | scala.Null, 
    /* trailer */ js.UndefOr[typings.grpcGrpcJs.metadataMod.Metadata], 
    /* flags */ js.UndefOr[scala.Double], 
    scala.Unit
  ]
}
