package typings.grpc.mod

import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("grpc", "Server")
@js.native
/**
  * Constructs a server object that stores request handlers and delegates
  * incoming requests to those handlers
  * @param options Options that should be passed to the internal server
  *     implementation
  * ```
  * var server = new grpc.Server();
  * server.addProtoService(protobuf_service_descriptor, service_implementation);
  * server.bind('address:port', server_credential);
  * server.start();
  * ```
  */
class Server () extends StObject {
  def this(options: js.Object) = this()
  
  /**
    * Add a proto service to the server, with a corresponding implementation
    * @deprecated Use `Server#addService` instead
    * @param service The proto service descriptor
    * @param implementation Map of method names to method implementation
    * for the provided service.
    */
  def addProtoService[ImplementationType](service: ServiceDefinition[ImplementationType], implementation: ImplementationType): Unit = js.native
  
  /**
    * Add a service to the server, with a corresponding implementation.
    * @param service The service descriptor
    * @param implementation Map of method names to method implementation
    * for the provided service.
    */
  def addService[ImplementationType](service: ServiceDefinition[ImplementationType], implementation: ImplementationType): Unit = js.native
  
  /**
    * Binds the server to the given port, with SSL disabled if creds is an
    * insecure credentials object
    * @param port The port that the server should bind on, in the format
    * "address:port"
    * @param creds Server credential object to be used for SSL. Pass an
    * insecure credentials object for an insecure port.
    * @return The bound port number or 0 if the operation failed.
    */
  def bind(port: String, creds: ServerCredentials): Double = js.native
  
  /**
    * Binds the server to the given port, with SSL disabled if creds is an
    * insecure credentials object. Provides the result asynchronously.
    * @param port The port that the server should bind on, in the format "address:port"
    * @param creds Server credential object to be used for
    *     SSL. Pass an insecure credentials object for an insecure port.
    * @param callback Called with the result of attempting to bind a port
    *  	- error: If non-null, indicates that binding the port failed.
    *  	- port: The bound port number. If binding the port fails, this will be negative to match the output of bind.
    */
  def bindAsync(
    port: String,
    creds: ServerCredentials,
    callback: js.Function2[/* error */ Error | Null, /* port */ Double, Unit]
  ): Unit = js.native
  
  /**
    * Forcibly shuts down the server. The server will stop receiving new calls
    * and cancel all pending calls. When it returns, the server has shut down.
    * This method is idempotent with itself and tryShutdown, and it will trigger
    * any outstanding tryShutdown callbacks.
    */
  def forceShutdown(): Unit = js.native
  
  /**
    * Registers a handler to handle the named method. Fails if there already is
    * a handler for the given method. Returns true on success
    * @param name The name of the method that the provided function should
    *     handle/respond to.
    * @param handler Function that takes a stream of
    *     request values and returns a stream of response values
    * @param serialize Serialization function for responses
    * @param deserialize Deserialization function for requests
    * @param type The streaming type of method that this handles
    * @return True if the handler was set. False if a handler was already
    *     set for that name.
    */
  def register[RequestType, ResponseType](
    name: String,
    handler: handleCall[RequestType, ResponseType],
    serialize: serialize[ResponseType],
    deserialize: deserialize[RequestType],
    `type`: String
  ): Boolean = js.native
  
  /**
    * Start the server and begin handling requests
    */
  def start(): Unit = js.native
  
  /**
    * Gracefully shuts down the server. The server will stop receiving new calls,
    * and any pending calls will complete. The callback will be called when all
    * pending calls have completed and the server is fully shut down. This method
    * is idempotent with itself and forceShutdown.
    * @param {function()} callback The shutdown complete callback
    */
  def tryShutdown(callback: js.Function0[Unit]): Unit = js.native
}
