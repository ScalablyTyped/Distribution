package typings.hapiWreck

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StringDictionary
import typings.hapiBoom.mod.Boom
import typings.hapiWreck.anon.PromiseIncomingMessagereq
import typings.hapiWreck.anon.Req
import typings.hapiWreck.hapiWreckBooleans.`false`
import typings.hapiWreck.hapiWreckStrings.force
import typings.hapiWreck.hapiWreckStrings.preRequest
import typings.hapiWreck.hapiWreckStrings.request
import typings.hapiWreck.hapiWreckStrings.response
import typings.hapiWreck.hapiWreckStrings.strict
import typings.hapiWreck.mod.Client.Agents
import typings.hapiWreck.mod.Client.Events
import typings.hapiWreck.mod.Client.Options
import typings.hapiWreck.mod.Client.parseCacheControl.Parameters
import typings.hapiWreck.mod.Client.request.Response
import typings.hapiWreck.mod.Client.toReadableStream.Payload
import typings.node.bufferMod.global.Buffer
import typings.node.eventsMod.EventEmitter
import typings.node.httpMod.Agent
import typings.node.httpMod.ClientRequest
import typings.node.httpMod.IncomingMessage
import typings.node.streamMod.Readable
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("@hapi/wreck", JSImport.Namespace)
  @js.native
  val ^ : Client = js.native
  
  /**
    * An HTTP request client.
    */
  @js.native
  trait Client extends StObject {
    
    /**
      * An object containing the node agents used for pooling connections for `http` and `https`.
      */
    var agents: Agents = js.native
    
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
      options: typings.hapiWreck.mod.Client.request.Options & typings.hapiWreck.mod.Client.read.Options
    ): js.Promise[Response[T]] = js.native
    
    /**
      * An event emitter used to deliver events when the `events` option is set.
      */
    var events: js.UndefOr[Events] = js.native
    
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
      options: typings.hapiWreck.mod.Client.request.Options & typings.hapiWreck.mod.Client.read.Options
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
      options: typings.hapiWreck.mod.Client.request.Options & typings.hapiWreck.mod.Client.read.Options
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
      options: typings.hapiWreck.mod.Client.request.Options & typings.hapiWreck.mod.Client.read.Options
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
      options: typings.hapiWreck.mod.Client.request.Options & typings.hapiWreck.mod.Client.read.Options
    ): js.Promise[Response[T]] = js.native
    
    def read[T](res: IncomingMessage): js.Promise[T] = js.native
    def read[T](res: IncomingMessage, options: typings.hapiWreck.mod.Client.read.Options): js.Promise[T] = js.native
    /**
      * Reads a readable stream and returns the parsed payload.
      * 
      * @param res - the readable stream.
      * @param options - default options override.
      * 
      * @returns the parsed payload based on the provided options.
      */
    def read[T](res: Readable): js.Promise[T] = js.native
    def read[T](res: Readable, options: typings.hapiWreck.mod.Client.read.Options): js.Promise[T] = js.native
    
    /**
      * Request an HTTP resource.
      * 
      * @param method - a string specifying the HTTP request method. Defaults to 'GET'.
      * @param url - the URI of the requested resource.
      * @param options - default options override.
      * 
      * @returns a promise resolving into an HTTP response object with a 'req' property holding a reference to the HTTP request object.
      */
    def request(method: String, url: String): PromiseIncomingMessagereq = js.native
    def request(method: String, url: String, options: typings.hapiWreck.mod.Client.request.Options): PromiseIncomingMessagereq = js.native
    
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
  object Client {
    
    trait Agents extends StObject {
      
      /**
        * The agent used for HTTP requests.
        */
      val http: Agent
      
      /**
        * The agent used for HTTPS requests.
        */
      val https: typings.node.httpsMod.Agent
      
      /**
        * The agent used for HTTPS requests which ignores unauthorized requests.
        */
      val httpsAllowUnauthorized: typings.node.httpsMod.Agent
    }
    object Agents {
      
      inline def apply(
        http: Agent,
        https: typings.node.httpsMod.Agent,
        httpsAllowUnauthorized: typings.node.httpsMod.Agent
      ): Agents = {
        val __obj = js.Dynamic.literal(http = http.asInstanceOf[js.Any], https = https.asInstanceOf[js.Any], httpsAllowUnauthorized = httpsAllowUnauthorized.asInstanceOf[js.Any])
        __obj.asInstanceOf[Agents]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: Agents] (val x: Self) extends AnyVal {
        
        inline def setHttp(value: Agent): Self = StObject.set(x, "http", value.asInstanceOf[js.Any])
        
        inline def setHttps(value: typings.node.httpsMod.Agent): Self = StObject.set(x, "https", value.asInstanceOf[js.Any])
        
        inline def setHttpsAllowUnauthorized(value: typings.node.httpsMod.Agent): Self = StObject.set(x, "httpsAllowUnauthorized", value.asInstanceOf[js.Any])
      }
    }
    
    @js.native
    trait Events extends EventEmitter {
      
      @JSName("addListener")
      def addListener_preRequest(event: preRequest, litener: typings.hapiWreck.mod.Client.Events.preRequest): this.type = js.native
      @JSName("addListener")
      def addListener_request(event: request, listener: typings.hapiWreck.mod.Client.Events.request): this.type = js.native
      @JSName("addListener")
      def addListener_response(event: response, listener: typings.hapiWreck.mod.Client.Events.response): this.type = js.native
      
      @JSName("on")
      def on_preRequest(event: preRequest, litener: typings.hapiWreck.mod.Client.Events.preRequest): this.type = js.native
      @JSName("on")
      def on_request(event: request, listener: typings.hapiWreck.mod.Client.Events.request): this.type = js.native
      @JSName("on")
      def on_response(event: response, listener: typings.hapiWreck.mod.Client.Events.response): this.type = js.native
      
      @JSName("once")
      def once_preRequest(event: preRequest, litener: typings.hapiWreck.mod.Client.Events.preRequest): this.type = js.native
      @JSName("once")
      def once_request(event: request, listener: typings.hapiWreck.mod.Client.Events.request): this.type = js.native
      @JSName("once")
      def once_response(event: response, listener: typings.hapiWreck.mod.Client.Events.response): this.type = js.native
    }
    object Events {
      
      type preRequest = js.Function2[/* uri */ String, /* options */ Options, Unit]
      
      type request = js.Function1[/* req */ ClientRequest, Unit]
      
      type response = js.Function2[/* err */ js.UndefOr[Boom[Any]], /* details */ Req, Unit]
    }
    
    trait Options
      extends StObject
         with typings.hapiWreck.mod.Client.request.Options
         with typings.hapiWreck.mod.Client.read.Options {
      
      /**
        * An object containing the node agents used for pooling connections for `http` and `https`.
        */
      val agents: js.UndefOr[Agents] = js.undefined
      
      /**
        * Enables events.
        * 
        * @default false
        */
      val events: js.UndefOr[Boolean] = js.undefined
      
      /**
        * Determines how to handle gzipped payloads.
        *
        * @default false
        */
      /* InferMemberOverrides */
      override val gunzip: js.UndefOr[Boolean | force] = js.undefined
      
      /**
        * The number of milliseconds to wait while reading data before aborting handling of the response.
        * 
        * @default 0
        */
      /* InferMemberOverrides */
      override val timeout: js.UndefOr[Double] = js.undefined
    }
    object Options {
      
      inline def apply(): Options = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Options]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
        
        inline def setAgents(value: Agents): Self = StObject.set(x, "agents", value.asInstanceOf[js.Any])
        
        inline def setAgentsUndefined: Self = StObject.set(x, "agents", js.undefined)
        
        inline def setEvents(value: Boolean): Self = StObject.set(x, "events", value.asInstanceOf[js.Any])
        
        inline def setEventsUndefined: Self = StObject.set(x, "events", js.undefined)
        
        inline def setGunzip(value: Boolean | force): Self = StObject.set(x, "gunzip", value.asInstanceOf[js.Any])
        
        inline def setGunzipUndefined: Self = StObject.set(x, "gunzip", js.undefined)
        
        inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
        
        inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
      }
    }
    
    object parseCacheControl {
      
      trait Parameters
        extends StObject
           with /* key */ StringDictionary[js.UndefOr[String | Double]] {
        
        var `max-age`: js.UndefOr[Double] = js.undefined
      }
      object Parameters {
        
        inline def apply(): Parameters = {
          val __obj = js.Dynamic.literal()
          __obj.asInstanceOf[Parameters]
        }
        
        @scala.inline
        implicit open class MutableBuilder[Self <: Parameters] (val x: Self) extends AnyVal {
          
          inline def `setMax-age`(value: Double): Self = StObject.set(x, "max-age", value.asInstanceOf[js.Any])
          
          inline def `setMax-ageUndefined`: Self = StObject.set(x, "max-age", js.undefined)
        }
      }
    }
    
    object read {
      
      trait Options extends StObject {
        
        /**
          * Determines how to handle gzipped payloads.
          *
          * @default false
          */
        val gunzip: js.UndefOr[Boolean | force] = js.undefined
        
        /**
          * Determines how to parse the payload as JSON.
          */
        val json: js.UndefOr[Boolean | strict | force] = js.undefined
        
        /**
          * The maximum allowed response payload size.
          * 
          * @default 0
          */
        val maxBytes: js.UndefOr[Double] = js.undefined
        
        /**
          * The number of milliseconds to wait while reading data before aborting handling of the response.
          * 
          * @default 0
          */
        val timeout: js.UndefOr[Double] = js.undefined
      }
      object Options {
        
        inline def apply(): typings.hapiWreck.mod.Client.read.Options = {
          val __obj = js.Dynamic.literal()
          __obj.asInstanceOf[typings.hapiWreck.mod.Client.read.Options]
        }
        
        @scala.inline
        implicit open class MutableBuilder[Self <: typings.hapiWreck.mod.Client.read.Options] (val x: Self) extends AnyVal {
          
          inline def setGunzip(value: Boolean | force): Self = StObject.set(x, "gunzip", value.asInstanceOf[js.Any])
          
          inline def setGunzipUndefined: Self = StObject.set(x, "gunzip", js.undefined)
          
          inline def setJson(value: Boolean | strict | force): Self = StObject.set(x, "json", value.asInstanceOf[js.Any])
          
          inline def setJsonUndefined: Self = StObject.set(x, "json", js.undefined)
          
          inline def setMaxBytes(value: Double): Self = StObject.set(x, "maxBytes", value.asInstanceOf[js.Any])
          
          inline def setMaxBytesUndefined: Self = StObject.set(x, "maxBytes", js.undefined)
          
          inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
          
          inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
        }
      }
    }
    
    object request {
      
      trait Options extends StObject {
        
        /**
          * Node HTTP or HTTPS Agent object (false disables agent pooling).
          */
        val agent: js.UndefOr[Agent | typings.node.httpsMod.Agent | `false`] = js.undefined
        
        /**
          * Fully qualified URL string used as the base URL.
          */
        val baseUrl: js.UndefOr[String] = js.undefined
        
        /**
          * A function to call before a redirect is triggered.
          * 
          * @param redirectMethod - a string specifying the redirect method.
          * @param statusCode - HTTP status code of the response that triggered the redirect.
          * @param location - The redirect location string.
          * @param resHeaders - An object with the headers received as part of the redirection response.
          * @param redirectOptions - Options that will be applied to the redirect request. Changes to this object are applied to the redirection request.
          * @param next - the callback function called to perform the redirection.
          */
        val beforeRedirect: js.UndefOr[
                js.Function6[
                  /* redirectMethod */ String, 
                  /* statusCode */ Double, 
                  /* location */ String, 
                  /* resHeaders */ Record[String, String], 
                  /* redirectOptions */ this.type, 
                  /* next */ js.Function0[Unit], 
                  Unit
                ]
              ] = js.undefined
        
        /**
          * TLS list of TLS ciphers to override node's default.
          */
        val ciphers: js.UndefOr[String] = js.undefined
        
        /**
          * Determines how to handle gzipped payloads.
          * 
          * @default false
          */
        val gunzip: js.UndefOr[Boolean | force] = js.undefined
        
        /**
          * An object containing the request headers.
          */
        val headers: js.UndefOr[Record[String, String]] = js.undefined
        
        /**
          * The request body as a string, Buffer, readable stream, or an object that can be serialized using `JSON.stringify()`.
          */
        val payload: js.UndefOr[typings.hapiWreck.mod.Client.request.Payload] = js.undefined
        
        /**
          * Enables redirects on 303 responses (using GET).
          * 
          * @default false
          */
        val redirect303: js.UndefOr[Boolean] = js.undefined
        
        /**
          * Overrides the HTTP method used when following 301 and 302 redirections. Defaults to the original method.
          */
        val redirectMethod: js.UndefOr[String] = js.undefined
        
        /**
          * A function to call when a redirect was triggered.
          * 
          * @param statusCode - HTTP status code of the response that triggered the redirect.
          * @param location - the redirected location string.
          * @param req - the new ClientRequest object which replaces the one initially returned.
          */
        val redirected: js.UndefOr[
                js.Function3[/* statusCode */ Double, /* location */ String, /* req */ ClientRequest, Unit]
              ] = js.undefined
        
        /**
          * The maximum number of redirects to follow.
          * 
          * @default false
          */
        val redirects: js.UndefOr[Double | `false`] = js.undefined
        
        /**
          * TLS flag indicating whether the client should reject a response from a server with invalid certificates.
          */
        val rejectUnauthorized: js.UndefOr[Boolean] = js.undefined
        
        /**
          * TLS flag indicating the SSL method to use, e.g. `SSLv3_method` to force SSL version 3.
          */
        val secureProtocol: js.UndefOr[String] = js.undefined
        
        /**
          * A UNIX socket path string for direct server connection.
          */
        val socketPath: js.UndefOr[String] = js.undefined
        
        /**
          * Number of milliseconds to wait without receiving a response before aborting the request.
          * 
          * @default 0
          */
        val timeout: js.UndefOr[Double] = js.undefined
      }
      object Options {
        
        inline def apply(): typings.hapiWreck.mod.Client.request.Options = {
          val __obj = js.Dynamic.literal()
          __obj.asInstanceOf[typings.hapiWreck.mod.Client.request.Options]
        }
        
        @scala.inline
        implicit open class MutableBuilder[Self <: typings.hapiWreck.mod.Client.request.Options] (val x: Self) extends AnyVal {
          
          inline def setAgent(value: Agent | typings.node.httpsMod.Agent | `false`): Self = StObject.set(x, "agent", value.asInstanceOf[js.Any])
          
          inline def setAgentUndefined: Self = StObject.set(x, "agent", js.undefined)
          
          inline def setBaseUrl(value: String): Self = StObject.set(x, "baseUrl", value.asInstanceOf[js.Any])
          
          inline def setBaseUrlUndefined: Self = StObject.set(x, "baseUrl", js.undefined)
          
          inline def setBeforeRedirect(
            value: (/* redirectMethod */ String, /* statusCode */ Double, /* location */ String, /* resHeaders */ Record[String, String], typings.hapiWreck.mod.Client.request.Options, /* next */ js.Function0[Unit]) => Unit
          ): Self = StObject.set(x, "beforeRedirect", js.Any.fromFunction6(value))
          
          inline def setBeforeRedirectUndefined: Self = StObject.set(x, "beforeRedirect", js.undefined)
          
          inline def setCiphers(value: String): Self = StObject.set(x, "ciphers", value.asInstanceOf[js.Any])
          
          inline def setCiphersUndefined: Self = StObject.set(x, "ciphers", js.undefined)
          
          inline def setGunzip(value: Boolean | force): Self = StObject.set(x, "gunzip", value.asInstanceOf[js.Any])
          
          inline def setGunzipUndefined: Self = StObject.set(x, "gunzip", js.undefined)
          
          inline def setHeaders(value: Record[String, String]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
          
          inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
          
          inline def setPayload(value: typings.hapiWreck.mod.Client.request.Payload): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
          
          inline def setPayloadUndefined: Self = StObject.set(x, "payload", js.undefined)
          
          inline def setRedirect303(value: Boolean): Self = StObject.set(x, "redirect303", value.asInstanceOf[js.Any])
          
          inline def setRedirect303Undefined: Self = StObject.set(x, "redirect303", js.undefined)
          
          inline def setRedirectMethod(value: String): Self = StObject.set(x, "redirectMethod", value.asInstanceOf[js.Any])
          
          inline def setRedirectMethodUndefined: Self = StObject.set(x, "redirectMethod", js.undefined)
          
          inline def setRedirected(value: (/* statusCode */ Double, /* location */ String, /* req */ ClientRequest) => Unit): Self = StObject.set(x, "redirected", js.Any.fromFunction3(value))
          
          inline def setRedirectedUndefined: Self = StObject.set(x, "redirected", js.undefined)
          
          inline def setRedirects(value: Double | `false`): Self = StObject.set(x, "redirects", value.asInstanceOf[js.Any])
          
          inline def setRedirectsUndefined: Self = StObject.set(x, "redirects", js.undefined)
          
          inline def setRejectUnauthorized(value: Boolean): Self = StObject.set(x, "rejectUnauthorized", value.asInstanceOf[js.Any])
          
          inline def setRejectUnauthorizedUndefined: Self = StObject.set(x, "rejectUnauthorized", js.undefined)
          
          inline def setSecureProtocol(value: String): Self = StObject.set(x, "secureProtocol", value.asInstanceOf[js.Any])
          
          inline def setSecureProtocolUndefined: Self = StObject.set(x, "secureProtocol", js.undefined)
          
          inline def setSocketPath(value: String): Self = StObject.set(x, "socketPath", value.asInstanceOf[js.Any])
          
          inline def setSocketPathUndefined: Self = StObject.set(x, "socketPath", js.undefined)
          
          inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
          
          inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
        }
      }
      
      type Payload = String | Buffer | Readable | js.Object
      
      trait Response[T] extends StObject {
        
        var payload: T
        
        var res: IncomingMessage
      }
      object Response {
        
        inline def apply[T](payload: T, res: IncomingMessage): Response[T] = {
          val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any], res = res.asInstanceOf[js.Any])
          __obj.asInstanceOf[Response[T]]
        }
        
        @scala.inline
        implicit open class MutableBuilder[Self <: Response[?], T] (val x: Self & Response[T]) extends AnyVal {
          
          inline def setPayload(value: T): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
          
          inline def setRes(value: IncomingMessage): Self = StObject.set(x, "res", value.asInstanceOf[js.Any])
        }
      }
    }
    
    object toReadableStream {
      
      type Item = String | Buffer
      
      type Payload = Item | js.Array[Item]
    }
  }
  
  type _To = Client
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: Client = ^
}
