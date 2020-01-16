package typings.atHapiWreck.atHapiWreckMod

import typings.atHapiWreck.Anon_Req
import typings.atHapiWreck.atHapiWreckMod.Client.Agents
import typings.atHapiWreck.atHapiWreckMod.Client.Events
import typings.atHapiWreck.atHapiWreckMod.Client.Options
import typings.atHapiWreck.atHapiWreckMod.Client.parseCacheControl.Parameters
import typings.atHapiWreck.atHapiWreckMod.Client.request.Response
import typings.atHapiWreck.atHapiWreckMod.Client.toReadableStream.Payload
import typings.node.httpMod.IncomingMessage
import typings.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An HTTP request client.
  */
@JSName("Client")
@js.native
trait Client_ extends js.Object {
  /**
    * An object containing the node agents used for pooling connections for `http` and `https`.
    */
  var agents: Agents = js.native
  /**
    * An event emitter used to deliver events when the `events` option is set.
    */
  var events: js.UndefOr[Events] = js.native
  /**
    * Creates a new client using the current client options as defaults and the provided options as override.
    * 
    * @param options - the client override options.
    * 
    * @returns a new client.
    */
  def defaults(options: Options): Client = js.native
  /**
    * Performs an HTTP DELETE request.
    *
    * @param uri - the resource URI.
    * @param options - default options override.
    *
    * @returns the received payload Buffer or parsed payload based on the options.
    */
  def delete[T](uri: String): js.Promise[Response[T]] = js.native
  def delete[T](
    uri: String,
    options: typings.atHapiWreck.atHapiWreckMod.Client.request.Options with typings.atHapiWreck.atHapiWreckMod.Client.read.Options
  ): js.Promise[Response[T]] = js.native
  /**
    * Performs an HTTP GET request.
    * 
    * @param uri - the resource URI.
    * @param options - default options override.
    * 
    * @returns the received payload Buffer or parsed payload based on the options.
    */
  def get[T](uri: String): js.Promise[Response[T]] = js.native
  def get[T](
    uri: String,
    options: typings.atHapiWreck.atHapiWreckMod.Client.request.Options with typings.atHapiWreck.atHapiWreckMod.Client.read.Options
  ): js.Promise[Response[T]] = js.native
  /**
    * Parses the HTTP Cache-Control header.
    * 
    * @param field - the header content.
    * 
    * @returns an object with the header parameters or null if invalid.
    */
  def parseCacheControl(field: String): Parameters | Null = js.native
  /**
    * Performs an HTTP PATCH request.
    *
    * @param uri - the resource URI.
    * @param options - default options override.
    *
    * @returns the received payload Buffer or parsed payload based on the options.
    */
  def patch[T](uri: String): js.Promise[Response[T]] = js.native
  def patch[T](
    uri: String,
    options: typings.atHapiWreck.atHapiWreckMod.Client.request.Options with typings.atHapiWreck.atHapiWreckMod.Client.read.Options
  ): js.Promise[Response[T]] = js.native
  /**
    * Performs an HTTP POST request.
    *
    * @param uri - the resource URI.
    * @param options - default options override.
    *
    * @returns the received payload Buffer or parsed payload based on the options.
    */
  def post[T](uri: String): js.Promise[Response[T]] = js.native
  def post[T](
    uri: String,
    options: typings.atHapiWreck.atHapiWreckMod.Client.request.Options with typings.atHapiWreck.atHapiWreckMod.Client.read.Options
  ): js.Promise[Response[T]] = js.native
  /**
    * Performs an HTTP PUT request.
    *
    * @param uri - the resource URI.
    * @param options - default options override.
    *
    * @returns the received payload Buffer or parsed payload based on the options.
    */
  def put[T](uri: String): js.Promise[Response[T]] = js.native
  def put[T](
    uri: String,
    options: typings.atHapiWreck.atHapiWreckMod.Client.request.Options with typings.atHapiWreck.atHapiWreckMod.Client.read.Options
  ): js.Promise[Response[T]] = js.native
  def read[T](res: IncomingMessage): js.Promise[T] = js.native
  def read[T](res: IncomingMessage, options: typings.atHapiWreck.atHapiWreckMod.Client.read.Options): js.Promise[T] = js.native
  /**
    * Reads a readable stream and returns the parsed payload.
    * 
    * @param res - the readable stream.
    * @param options - default options override.
    * 
    * @returns the parsed payload based on the provided options.
    */
  def read[T](res: Readable): js.Promise[T] = js.native
  def read[T](res: Readable, options: typings.atHapiWreck.atHapiWreckMod.Client.read.Options): js.Promise[T] = js.native
  /**
    * Request an HTTP resource.
    * 
    * @param method - a string specifying the HTTP request method. Defaults to 'GET'.
    * @param url - the URI of the requested resource.
    * @param options - default options override.
    * 
    * @returns a promise resolving into an HTTP response object with a 'req' property holding a reference to the HTTP request object.
    */
  def request(method: String, url: String): js.Promise[IncomingMessage] with Anon_Req = js.native
  def request(method: String, url: String, options: typings.atHapiWreck.atHapiWreckMod.Client.request.Options): js.Promise[IncomingMessage] with Anon_Req = js.native
  /**
    * Converts a buffer, string, or an array of them into a readable stream.
    * 
    * @param payload - a string, buffer, or an array of them.
    * @param encoding - the payload encoding.
    * 
    * @returns a readable stream.
    */
  def toReadableStream(payload: Payload): Readable = js.native
  def toReadableStream(payload: Payload, encoding: String): Readable = js.native
}

