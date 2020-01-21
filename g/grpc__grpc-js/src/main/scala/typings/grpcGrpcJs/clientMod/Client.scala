package typings.grpcGrpcJs.clientMod

import typings.grpcGrpcJs.callMod.ClientDuplexStream
import typings.grpcGrpcJs.callMod.ClientReadableStream
import typings.grpcGrpcJs.callMod.ClientUnaryCall
import typings.grpcGrpcJs.callMod.ClientWritableStream
import typings.grpcGrpcJs.callStreamMod.Deadline
import typings.grpcGrpcJs.channelCredentialsMod.ChannelCredentials
import typings.grpcGrpcJs.channelMod.Channel
import typings.grpcGrpcJs.metadataMod.Metadata
import typings.node.Buffer
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@grpc/grpc-js/build/src/client", "Client")
@js.native
class Client protected () extends js.Object {
  def this(address: String, credentials: ChannelCredentials) = this()
  def this(address: String, credentials: ChannelCredentials, options: ClientOptions) = this()
  var checkMetadataAndOptions: js.Any = js.native
  var checkOptionalUnaryResponseArguments: js.Any = js.native
  var handleUnaryResponse: js.Any = js.native
  def close(): Unit = js.native
  def getChannel(): Channel = js.native
  def makeBidiStreamRequest[RequestType, ResponseType](
    method: String,
    serialize: js.Function1[/* value */ RequestType, Buffer],
    deserialize: js.Function1[/* value */ Buffer, ResponseType]
  ): ClientDuplexStream[RequestType, ResponseType] = js.native
  def makeBidiStreamRequest[RequestType, ResponseType](
    method: String,
    serialize: js.Function1[/* value */ RequestType, Buffer],
    deserialize: js.Function1[/* value */ Buffer, ResponseType],
    metadata: Metadata
  ): ClientDuplexStream[RequestType, ResponseType] = js.native
  def makeBidiStreamRequest[RequestType, ResponseType](
    method: String,
    serialize: js.Function1[/* value */ RequestType, Buffer],
    deserialize: js.Function1[/* value */ Buffer, ResponseType],
    metadata: Metadata,
    options: CallOptions
  ): ClientDuplexStream[RequestType, ResponseType] = js.native
  def makeBidiStreamRequest[RequestType, ResponseType](
    method: String,
    serialize: js.Function1[/* value */ RequestType, Buffer],
    deserialize: js.Function1[/* value */ Buffer, ResponseType],
    options: CallOptions
  ): ClientDuplexStream[RequestType, ResponseType] = js.native
  def makeClientStreamRequest[RequestType, ResponseType](
    method: String,
    serialize: js.Function1[/* value */ RequestType, Buffer],
    deserialize: js.Function1[/* value */ Buffer, ResponseType],
    callback: UnaryCallback[ResponseType]
  ): ClientWritableStream[RequestType] = js.native
  def makeClientStreamRequest[RequestType, ResponseType](
    method: String,
    serialize: js.Function1[/* value */ RequestType, Buffer],
    deserialize: js.Function1[/* value */ Buffer, ResponseType],
    metadata: Metadata,
    callback: UnaryCallback[ResponseType]
  ): ClientWritableStream[RequestType] = js.native
  def makeClientStreamRequest[RequestType, ResponseType](
    method: String,
    serialize: js.Function1[/* value */ RequestType, Buffer],
    deserialize: js.Function1[/* value */ Buffer, ResponseType],
    metadata: Metadata,
    options: CallOptions,
    callback: UnaryCallback[ResponseType]
  ): ClientWritableStream[RequestType] = js.native
  def makeClientStreamRequest[RequestType, ResponseType](
    method: String,
    serialize: js.Function1[/* value */ RequestType, Buffer],
    deserialize: js.Function1[/* value */ Buffer, ResponseType],
    options: CallOptions,
    callback: UnaryCallback[ResponseType]
  ): ClientWritableStream[RequestType] = js.native
  def makeServerStreamRequest[RequestType, ResponseType](
    method: String,
    serialize: js.Function1[/* value */ RequestType, Buffer],
    deserialize: js.Function1[/* value */ Buffer, ResponseType],
    argument: RequestType
  ): ClientReadableStream[ResponseType] = js.native
  def makeServerStreamRequest[RequestType, ResponseType](
    method: String,
    serialize: js.Function1[/* value */ RequestType, Buffer],
    deserialize: js.Function1[/* value */ Buffer, ResponseType],
    argument: RequestType,
    metadata: Metadata
  ): ClientReadableStream[ResponseType] = js.native
  def makeServerStreamRequest[RequestType, ResponseType](
    method: String,
    serialize: js.Function1[/* value */ RequestType, Buffer],
    deserialize: js.Function1[/* value */ Buffer, ResponseType],
    argument: RequestType,
    metadata: Metadata,
    options: CallOptions
  ): ClientReadableStream[ResponseType] = js.native
  def makeServerStreamRequest[RequestType, ResponseType](
    method: String,
    serialize: js.Function1[/* value */ RequestType, Buffer],
    deserialize: js.Function1[/* value */ Buffer, ResponseType],
    argument: RequestType,
    options: CallOptions
  ): ClientReadableStream[ResponseType] = js.native
  def makeUnaryRequest[RequestType, ResponseType](
    method: String,
    serialize: js.Function1[/* value */ RequestType, Buffer],
    deserialize: js.Function1[/* value */ Buffer, ResponseType],
    argument: RequestType,
    callback: UnaryCallback[ResponseType]
  ): ClientUnaryCall = js.native
  def makeUnaryRequest[RequestType, ResponseType](
    method: String,
    serialize: js.Function1[/* value */ RequestType, Buffer],
    deserialize: js.Function1[/* value */ Buffer, ResponseType],
    argument: RequestType,
    metadata: Metadata,
    callback: UnaryCallback[ResponseType]
  ): ClientUnaryCall = js.native
  def makeUnaryRequest[RequestType, ResponseType](
    method: String,
    serialize: js.Function1[/* value */ RequestType, Buffer],
    deserialize: js.Function1[/* value */ Buffer, ResponseType],
    argument: RequestType,
    metadata: Metadata,
    options: CallOptions,
    callback: UnaryCallback[ResponseType]
  ): ClientUnaryCall = js.native
  def makeUnaryRequest[RequestType, ResponseType](
    method: String,
    serialize: js.Function1[/* value */ RequestType, Buffer],
    deserialize: js.Function1[/* value */ Buffer, ResponseType],
    argument: RequestType,
    options: CallOptions,
    callback: UnaryCallback[ResponseType]
  ): ClientUnaryCall = js.native
  def waitForReady(deadline: Deadline, callback: js.Function1[/* error */ js.UndefOr[Error], Unit]): Unit = js.native
}

