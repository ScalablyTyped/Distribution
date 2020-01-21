package typings.hapiWreck.mod.Client.request

import typings.hapiWreck.hapiWreckBooleans.`false`
import typings.hapiWreck.hapiWreckStrings.force
import typings.node.httpMod.Agent
import typings.node.httpMod.ClientRequest
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
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
      /* redirectOptions */ Options, 
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
  val payload: js.UndefOr[Payload] = js.undefined
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
  @scala.inline
  def apply(
    agent: Agent | typings.node.httpsMod.Agent | `false` = null,
    baseUrl: String = null,
    beforeRedirect: (/* redirectMethod */ String, /* statusCode */ Double, /* location */ String, /* resHeaders */ Record[String, String], /* redirectOptions */ Options, /* next */ js.Function0[Unit]) => Unit = null,
    ciphers: String = null,
    gunzip: Boolean | force = null,
    headers: Record[String, String] = null,
    payload: Payload = null,
    redirect303: js.UndefOr[Boolean] = js.undefined,
    redirectMethod: String = null,
    redirected: (/* statusCode */ Double, /* location */ String, /* req */ ClientRequest) => Unit = null,
    redirects: Double | `false` = null,
    rejectUnauthorized: js.UndefOr[Boolean] = js.undefined,
    secureProtocol: String = null,
    socketPath: String = null,
    timeout: Int | Double = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (agent != null) __obj.updateDynamic("agent")(agent.asInstanceOf[js.Any])
    if (baseUrl != null) __obj.updateDynamic("baseUrl")(baseUrl.asInstanceOf[js.Any])
    if (beforeRedirect != null) __obj.updateDynamic("beforeRedirect")(js.Any.fromFunction6(beforeRedirect))
    if (ciphers != null) __obj.updateDynamic("ciphers")(ciphers.asInstanceOf[js.Any])
    if (gunzip != null) __obj.updateDynamic("gunzip")(gunzip.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (payload != null) __obj.updateDynamic("payload")(payload.asInstanceOf[js.Any])
    if (!js.isUndefined(redirect303)) __obj.updateDynamic("redirect303")(redirect303.asInstanceOf[js.Any])
    if (redirectMethod != null) __obj.updateDynamic("redirectMethod")(redirectMethod.asInstanceOf[js.Any])
    if (redirected != null) __obj.updateDynamic("redirected")(js.Any.fromFunction3(redirected))
    if (redirects != null) __obj.updateDynamic("redirects")(redirects.asInstanceOf[js.Any])
    if (!js.isUndefined(rejectUnauthorized)) __obj.updateDynamic("rejectUnauthorized")(rejectUnauthorized.asInstanceOf[js.Any])
    if (secureProtocol != null) __obj.updateDynamic("secureProtocol")(secureProtocol.asInstanceOf[js.Any])
    if (socketPath != null) __obj.updateDynamic("socketPath")(socketPath.asInstanceOf[js.Any])
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

