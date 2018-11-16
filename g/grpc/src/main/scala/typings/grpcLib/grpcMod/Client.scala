package typings
package grpcLib.grpcMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("grpc", "Client")
@js.native
class Client protected () extends js.Object {
  /**
       * A generic gRPC client. Primarily useful as a base class for generated clients
       * @param address Server address to connect to
       * @param credentials Credentials to use to connect to the server
       * @param options Options to apply to channel creation
       */
  def this(address: java.lang.String, credentials: ChannelCredentials) = this()
  /**
       * A generic gRPC client. Primarily useful as a base class for generated clients
       * @param address Server address to connect to
       * @param credentials Credentials to use to connect to the server
       * @param options Options to apply to channel creation
       */
  def this(address: java.lang.String, credentials: ChannelCredentials, options: js.Object) = this()
  /**
       * Close this client.
       */
  def close(): scala.Unit = js.native
  /**
       * Return the underlying channel object for the specified client
       * @return The channel
       */
  def getChannel(): Channel = js.native
  /**
       * Make a bidirectional stream request with this method on the given channel.
       * @param method The name of the method to request
       * @param serialize The serialization function for inputs
       * @param deserialize The deserialization
       *     function for outputs
       * @param metadata Array of metadata key/value
       *     pairs to add to the call
       * @param options Options map
       * @return An event emitter for stream related events
       */
  def makeBidiStreamRequest[RequestType, ResponseType](
    method: java.lang.String,
    serialize: serialize[RequestType],
    deserialize: deserialize[ResponseType]
  ): ClientDuplexStream[RequestType, ResponseType] = js.native
  /**
       * Make a bidirectional stream request with this method on the given channel.
       * @param method The name of the method to request
       * @param serialize The serialization function for inputs
       * @param deserialize The deserialization
       *     function for outputs
       * @param metadata Array of metadata key/value
       *     pairs to add to the call
       * @param options Options map
       * @return An event emitter for stream related events
       */
  def makeBidiStreamRequest[RequestType, ResponseType](
    method: java.lang.String,
    serialize: serialize[RequestType],
    deserialize: deserialize[ResponseType],
    metadata: Metadata
  ): ClientDuplexStream[RequestType, ResponseType] = js.native
  /**
       * Make a bidirectional stream request with this method on the given channel.
       * @param method The name of the method to request
       * @param serialize The serialization function for inputs
       * @param deserialize The deserialization
       *     function for outputs
       * @param metadata Array of metadata key/value
       *     pairs to add to the call
       * @param options Options map
       * @return An event emitter for stream related events
       */
  def makeBidiStreamRequest[RequestType, ResponseType](
    method: java.lang.String,
    serialize: serialize[RequestType],
    deserialize: deserialize[ResponseType],
    metadata: Metadata,
    options: CallOptions
  ): ClientDuplexStream[RequestType, ResponseType] = js.native
  /**
       * Make a bidirectional stream request with this method on the given channel.
       * @param method The name of the method to request
       * @param serialize The serialization function for inputs
       * @param deserialize The deserialization
       *     function for outputs
       * @param metadata Array of metadata key/value
       *     pairs to add to the call
       * @param options Options map
       * @return An event emitter for stream related events
       */
  def makeBidiStreamRequest[RequestType, ResponseType](
    method: java.lang.String,
    serialize: serialize[RequestType],
    deserialize: deserialize[ResponseType],
    metadata: scala.Null,
    options: CallOptions
  ): ClientDuplexStream[RequestType, ResponseType] = js.native
  /**
       * Make a client stream request to the given method, using the given serialize
       * and deserialize functions, with the given argument.
       * @param method The name of the method to request
       * @param serialize The serialization function for inputs
       * @param deserialize The deserialization function for outputs
       * @param metadata Array of metadata key/value pairs to add to the call
       * @param options Options map
       * @param callback The callback to for when the response is received
       * @return An event emitter for stream related events
       */
  def makeClientStreamRequest[RequestType, ResponseType](
    method: java.lang.String,
    serialize: serialize[RequestType],
    deserialize: deserialize[ResponseType],
    metadata: Metadata,
    options: CallOptions,
    callback: requestCallback[ResponseType]
  ): ClientWritableStream[RequestType] = js.native
  /**
       * Make a client stream request to the given method, using the given serialize
       * and deserialize functions, with the given argument.
       * @param method The name of the method to request
       * @param serialize The serialization function for inputs
       * @param deserialize The deserialization function for outputs
       * @param metadata Array of metadata key/value pairs to add to the call
       * @param options Options map
       * @param callback The callback to for when the response is received
       * @return An event emitter for stream related events
       */
  def makeClientStreamRequest[RequestType, ResponseType](
    method: java.lang.String,
    serialize: serialize[RequestType],
    deserialize: deserialize[ResponseType],
    metadata: Metadata,
    options: scala.Null,
    callback: requestCallback[ResponseType]
  ): ClientWritableStream[RequestType] = js.native
  /**
       * Make a client stream request to the given method, using the given serialize
       * and deserialize functions, with the given argument.
       * @param method The name of the method to request
       * @param serialize The serialization function for inputs
       * @param deserialize The deserialization function for outputs
       * @param metadata Array of metadata key/value pairs to add to the call
       * @param options Options map
       * @param callback The callback to for when the response is received
       * @return An event emitter for stream related events
       */
  def makeClientStreamRequest[RequestType, ResponseType](
    method: java.lang.String,
    serialize: serialize[RequestType],
    deserialize: deserialize[ResponseType],
    metadata: scala.Null,
    options: CallOptions,
    callback: requestCallback[ResponseType]
  ): ClientWritableStream[RequestType] = js.native
  /**
       * Make a client stream request to the given method, using the given serialize
       * and deserialize functions, with the given argument.
       * @param method The name of the method to request
       * @param serialize The serialization function for inputs
       * @param deserialize The deserialization function for outputs
       * @param metadata Array of metadata key/value pairs to add to the call
       * @param options Options map
       * @param callback The callback to for when the response is received
       * @return An event emitter for stream related events
       */
  def makeClientStreamRequest[RequestType, ResponseType](
    method: java.lang.String,
    serialize: serialize[RequestType],
    deserialize: deserialize[ResponseType],
    metadata: scala.Null,
    options: scala.Null,
    callback: requestCallback[ResponseType]
  ): ClientWritableStream[RequestType] = js.native
  /**
       * Make a server stream request to the given method, with the given serialize
       * and deserialize function, using the given argument
       * @param method The name of the method to request
       * @param serialize The serialization function for inputs
       * @param deserialize The deserialization function for outputs
       * @param argument The argument to the call. Should be serializable with
       *     serialize
       * @param metadata Array of metadata key/value pairs to add to the call
       * @param options Options map
       * @return An event emitter for stream related events
       */
  def makeServerStreamRequest[RequestType, ResponseType](
    method: java.lang.String,
    serialize: serialize[RequestType],
    deserialize: deserialize[ResponseType],
    argument: RequestType
  ): ClientReadableStream[RequestType] = js.native
  /**
       * Make a server stream request to the given method, with the given serialize
       * and deserialize function, using the given argument
       * @param method The name of the method to request
       * @param serialize The serialization function for inputs
       * @param deserialize The deserialization function for outputs
       * @param argument The argument to the call. Should be serializable with
       *     serialize
       * @param metadata Array of metadata key/value pairs to add to the call
       * @param options Options map
       * @return An event emitter for stream related events
       */
  def makeServerStreamRequest[RequestType, ResponseType](
    method: java.lang.String,
    serialize: serialize[RequestType],
    deserialize: deserialize[ResponseType],
    argument: RequestType,
    metadata: Metadata
  ): ClientReadableStream[RequestType] = js.native
  /**
       * Make a server stream request to the given method, with the given serialize
       * and deserialize function, using the given argument
       * @param method The name of the method to request
       * @param serialize The serialization function for inputs
       * @param deserialize The deserialization function for outputs
       * @param argument The argument to the call. Should be serializable with
       *     serialize
       * @param metadata Array of metadata key/value pairs to add to the call
       * @param options Options map
       * @return An event emitter for stream related events
       */
  def makeServerStreamRequest[RequestType, ResponseType](
    method: java.lang.String,
    serialize: serialize[RequestType],
    deserialize: deserialize[ResponseType],
    argument: RequestType,
    metadata: Metadata,
    options: CallOptions
  ): ClientReadableStream[RequestType] = js.native
  /**
       * Make a server stream request to the given method, with the given serialize
       * and deserialize function, using the given argument
       * @param method The name of the method to request
       * @param serialize The serialization function for inputs
       * @param deserialize The deserialization function for outputs
       * @param argument The argument to the call. Should be serializable with
       *     serialize
       * @param metadata Array of metadata key/value pairs to add to the call
       * @param options Options map
       * @return An event emitter for stream related events
       */
  def makeServerStreamRequest[RequestType, ResponseType](
    method: java.lang.String,
    serialize: serialize[RequestType],
    deserialize: deserialize[ResponseType],
    argument: RequestType,
    metadata: scala.Null,
    options: CallOptions
  ): ClientReadableStream[RequestType] = js.native
  /**
       * Make a unary request to the given method, using the given serialize
       * and deserialize functions, with the given argument.
       * @param method The name of the method to request
       * @param serialize The serialization function for inputs
       * @param deserialize The deserialization function for outputs
       * @param argument The argument to the call. Should be serializable with
       *     serialize
       * @param metadata Metadata to add to the call
       * @param options Options map
       * @param callback The callback to for when the response is received
       * @return An event emitter for stream related events
       */
  def makeUnaryRequest[RequestType, ResponseType](
    method: java.lang.String,
    serialize: serialize[RequestType],
    deserialize: deserialize[ResponseType],
    argument: RequestType,
    metadata: Metadata,
    options: CallOptions,
    callback: requestCallback[ResponseType]
  ): ClientUnaryCall = js.native
  /**
       * Make a unary request to the given method, using the given serialize
       * and deserialize functions, with the given argument.
       * @param method The name of the method to request
       * @param serialize The serialization function for inputs
       * @param deserialize The deserialization function for outputs
       * @param argument The argument to the call. Should be serializable with
       *     serialize
       * @param metadata Metadata to add to the call
       * @param options Options map
       * @param callback The callback to for when the response is received
       * @return An event emitter for stream related events
       */
  def makeUnaryRequest[RequestType, ResponseType](
    method: java.lang.String,
    serialize: serialize[RequestType],
    deserialize: deserialize[ResponseType],
    argument: RequestType,
    metadata: Metadata,
    options: scala.Null,
    callback: requestCallback[ResponseType]
  ): ClientUnaryCall = js.native
  /**
       * Make a unary request to the given method, using the given serialize
       * and deserialize functions, with the given argument.
       * @param method The name of the method to request
       * @param serialize The serialization function for inputs
       * @param deserialize The deserialization function for outputs
       * @param argument The argument to the call. Should be serializable with
       *     serialize
       * @param metadata Metadata to add to the call
       * @param options Options map
       * @param callback The callback to for when the response is received
       * @return An event emitter for stream related events
       */
  def makeUnaryRequest[RequestType, ResponseType](
    method: java.lang.String,
    serialize: serialize[RequestType],
    deserialize: deserialize[ResponseType],
    argument: RequestType,
    metadata: scala.Null,
    options: CallOptions,
    callback: requestCallback[ResponseType]
  ): ClientUnaryCall = js.native
  /**
       * Make a unary request to the given method, using the given serialize
       * and deserialize functions, with the given argument.
       * @param method The name of the method to request
       * @param serialize The serialization function for inputs
       * @param deserialize The deserialization function for outputs
       * @param argument The argument to the call. Should be serializable with
       *     serialize
       * @param metadata Metadata to add to the call
       * @param options Options map
       * @param callback The callback to for when the response is received
       * @return An event emitter for stream related events
       */
  def makeUnaryRequest[RequestType, ResponseType](
    method: java.lang.String,
    serialize: serialize[RequestType],
    deserialize: deserialize[ResponseType],
    argument: RequestType,
    metadata: scala.Null,
    options: scala.Null,
    callback: requestCallback[ResponseType]
  ): ClientUnaryCall = js.native
  /**
       * Make a unary request to the given method, using the given serialize
       * and deserialize functions, with the given argument.
       * @param method The name of the method to request
       * @param serialize The serialization function for inputs
       * @param deserialize The deserialization function for outputs
       * @param argument The argument to the call. Should be serializable with
       *     serialize
       * @param metadata Metadata to add to the call
       * @param options Options map
       * @param callback The callback to for when the response is received
       * @return An event emitter for stream related events
       */
  def makeUnaryRequest[RequestType, ResponseType](
    method: java.lang.String,
    serialize: serialize[RequestType],
    deserialize: deserialize[ResponseType],
    argument: scala.Null,
    metadata: Metadata,
    options: CallOptions,
    callback: requestCallback[ResponseType]
  ): ClientUnaryCall = js.native
  /**
       * Make a unary request to the given method, using the given serialize
       * and deserialize functions, with the given argument.
       * @param method The name of the method to request
       * @param serialize The serialization function for inputs
       * @param deserialize The deserialization function for outputs
       * @param argument The argument to the call. Should be serializable with
       *     serialize
       * @param metadata Metadata to add to the call
       * @param options Options map
       * @param callback The callback to for when the response is received
       * @return An event emitter for stream related events
       */
  def makeUnaryRequest[RequestType, ResponseType](
    method: java.lang.String,
    serialize: serialize[RequestType],
    deserialize: deserialize[ResponseType],
    argument: scala.Null,
    metadata: Metadata,
    options: scala.Null,
    callback: requestCallback[ResponseType]
  ): ClientUnaryCall = js.native
  /**
       * Make a unary request to the given method, using the given serialize
       * and deserialize functions, with the given argument.
       * @param method The name of the method to request
       * @param serialize The serialization function for inputs
       * @param deserialize The deserialization function for outputs
       * @param argument The argument to the call. Should be serializable with
       *     serialize
       * @param metadata Metadata to add to the call
       * @param options Options map
       * @param callback The callback to for when the response is received
       * @return An event emitter for stream related events
       */
  def makeUnaryRequest[RequestType, ResponseType](
    method: java.lang.String,
    serialize: serialize[RequestType],
    deserialize: deserialize[ResponseType],
    argument: scala.Null,
    metadata: scala.Null,
    options: CallOptions,
    callback: requestCallback[ResponseType]
  ): ClientUnaryCall = js.native
  /**
       * Make a unary request to the given method, using the given serialize
       * and deserialize functions, with the given argument.
       * @param method The name of the method to request
       * @param serialize The serialization function for inputs
       * @param deserialize The deserialization function for outputs
       * @param argument The argument to the call. Should be serializable with
       *     serialize
       * @param metadata Metadata to add to the call
       * @param options Options map
       * @param callback The callback to for when the response is received
       * @return An event emitter for stream related events
       */
  def makeUnaryRequest[RequestType, ResponseType](
    method: java.lang.String,
    serialize: serialize[RequestType],
    deserialize: deserialize[ResponseType],
    argument: scala.Null,
    metadata: scala.Null,
    options: scala.Null,
    callback: requestCallback[ResponseType]
  ): ClientUnaryCall = js.native
  /**
       * Wait for the client to be ready. The callback will be called when the
       * client has successfully connected to the server, and it will be called
       * with an error if the attempt to connect to the server has unrecoverablly
       * failed or if the deadline expires. This function will make the channel
       * start connecting if it has not already done so.
       * @param deadline When to stop waiting for a connection.
       * @param callback The callback to call when done attempting to connect.
       */
  def waitForReady(deadline: Deadline, callback: js.Function1[/* error */ nodeLib.Error | scala.Null, scala.Unit]): scala.Unit = js.native
}

