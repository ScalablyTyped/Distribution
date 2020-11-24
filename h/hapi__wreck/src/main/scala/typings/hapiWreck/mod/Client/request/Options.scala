package typings.hapiWreck.mod.Client.request

import typings.hapiWreck.hapiWreckBooleans.`false`
import typings.hapiWreck.hapiWreckStrings.force
import typings.node.httpMod.Agent
import typings.node.httpMod.ClientRequest
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Options extends js.Object {
  
  /**
    * Node HTTP or HTTPS Agent object (false disables agent pooling).
    */
  val agent: js.UndefOr[Agent | typings.node.httpsMod.Agent | `false`] = js.native
  
  /**
    * Fully qualified URL string used as the base URL.
    */
  val baseUrl: js.UndefOr[String] = js.native
  
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
  ] = js.native
  
  /**
    * TLS list of TLS ciphers to override node's default.
    */
  val ciphers: js.UndefOr[String] = js.native
  
  /**
    * Determines how to handle gzipped payloads.
    * 
    * @default false
    */
  val gunzip: js.UndefOr[Boolean | force] = js.native
  
  /**
    * An object containing the request headers.
    */
  val headers: js.UndefOr[Record[String, String]] = js.native
  
  /**
    * The request body as a string, Buffer, readable stream, or an object that can be serialized using `JSON.stringify()`.
    */
  val payload: js.UndefOr[Payload] = js.native
  
  /**
    * Enables redirects on 303 responses (using GET).
    * 
    * @default false
    */
  val redirect303: js.UndefOr[Boolean] = js.native
  
  /**
    * Overrides the HTTP method used when following 301 and 302 redirections. Defaults to the original method.
    */
  val redirectMethod: js.UndefOr[String] = js.native
  
  /**
    * A function to call when a redirect was triggered.
    * 
    * @param statusCode - HTTP status code of the response that triggered the redirect.
    * @param location - the redirected location string.
    * @param req - the new ClientRequest object which replaces the one initially returned.
    */
  val redirected: js.UndefOr[
    js.Function3[/* statusCode */ Double, /* location */ String, /* req */ ClientRequest, Unit]
  ] = js.native
  
  /**
    * The maximum number of redirects to follow.
    * 
    * @default false
    */
  val redirects: js.UndefOr[Double | `false`] = js.native
  
  /**
    * TLS flag indicating whether the client should reject a response from a server with invalid certificates.
    */
  val rejectUnauthorized: js.UndefOr[Boolean] = js.native
  
  /**
    * TLS flag indicating the SSL method to use, e.g. `SSLv3_method` to force SSL version 3.
    */
  val secureProtocol: js.UndefOr[String] = js.native
  
  /**
    * A UNIX socket path string for direct server connection.
    */
  val socketPath: js.UndefOr[String] = js.native
  
  /**
    * Number of milliseconds to wait without receiving a response before aborting the request.
    * 
    * @default 0
    */
  val timeout: js.UndefOr[Double] = js.native
}
object Options {
  
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAgent(value: Agent | typings.node.httpsMod.Agent | `false`): Self = this.set("agent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAgent: Self = this.set("agent", js.undefined)
    
    @scala.inline
    def setBaseUrl(value: String): Self = this.set("baseUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBaseUrl: Self = this.set("baseUrl", js.undefined)
    
    @scala.inline
    def setBeforeRedirect(
      value: (/* redirectMethod */ String, /* statusCode */ Double, /* location */ String, /* resHeaders */ Record[String, String], Options, /* next */ js.Function0[Unit]) => Unit
    ): Self = this.set("beforeRedirect", js.Any.fromFunction6(value))
    
    @scala.inline
    def deleteBeforeRedirect: Self = this.set("beforeRedirect", js.undefined)
    
    @scala.inline
    def setCiphers(value: String): Self = this.set("ciphers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCiphers: Self = this.set("ciphers", js.undefined)
    
    @scala.inline
    def setGunzip(value: Boolean | force): Self = this.set("gunzip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGunzip: Self = this.set("gunzip", js.undefined)
    
    @scala.inline
    def setHeaders(value: Record[String, String]): Self = this.set("headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeaders: Self = this.set("headers", js.undefined)
    
    @scala.inline
    def setPayload(value: Payload): Self = this.set("payload", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePayload: Self = this.set("payload", js.undefined)
    
    @scala.inline
    def setRedirect303(value: Boolean): Self = this.set("redirect303", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRedirect303: Self = this.set("redirect303", js.undefined)
    
    @scala.inline
    def setRedirectMethod(value: String): Self = this.set("redirectMethod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRedirectMethod: Self = this.set("redirectMethod", js.undefined)
    
    @scala.inline
    def setRedirected(value: (/* statusCode */ Double, /* location */ String, /* req */ ClientRequest) => Unit): Self = this.set("redirected", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteRedirected: Self = this.set("redirected", js.undefined)
    
    @scala.inline
    def setRedirects(value: Double | `false`): Self = this.set("redirects", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRedirects: Self = this.set("redirects", js.undefined)
    
    @scala.inline
    def setRejectUnauthorized(value: Boolean): Self = this.set("rejectUnauthorized", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRejectUnauthorized: Self = this.set("rejectUnauthorized", js.undefined)
    
    @scala.inline
    def setSecureProtocol(value: String): Self = this.set("secureProtocol", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSecureProtocol: Self = this.set("secureProtocol", js.undefined)
    
    @scala.inline
    def setSocketPath(value: String): Self = this.set("socketPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSocketPath: Self = this.set("socketPath", js.undefined)
    
    @scala.inline
    def setTimeout(value: Double): Self = this.set("timeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimeout: Self = this.set("timeout", js.undefined)
  }
}
