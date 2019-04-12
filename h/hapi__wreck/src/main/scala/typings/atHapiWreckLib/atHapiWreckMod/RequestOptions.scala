package typings
package atHapiWreckLib.atHapiWreckMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RequestOptions extends js.Object {
  var agent: js.UndefOr[atHapiWreckLib.Anon_Http | atHapiWreckLib.atHapiWreckLibNumbers.`false`] = js.undefined
  var baseUrl: js.UndefOr[java.lang.String] = js.undefined
  var beforeRedirect: js.UndefOr[
    js.Function6[
      /* redirectMethod */ java.lang.String, 
      /* statusCode */ scala.Double, 
      /* location */ java.lang.String, 
      /* resHeaders */ org.scalablytyped.runtime.StringDictionary[js.Any], 
      /* redirectOptions */ js.Any, 
      /* next */ js.Function0[js.Object], 
      scala.Unit
    ]
  ] = js.undefined
  var ciphers: js.UndefOr[java.lang.String] = js.undefined
  var downstreamRes: js.UndefOr[js.Any] = js.undefined
  var events: js.UndefOr[scala.Boolean] = js.undefined
  var headers: js.UndefOr[org.scalablytyped.runtime.StringDictionary[js.Any]] = js.undefined
  var maxBytes: js.UndefOr[scala.Double] = js.undefined
  var payload: js.UndefOr[js.Any] = js.undefined
  var redirect303: js.UndefOr[scala.Boolean] = js.undefined
  var redirected: js.UndefOr[
    js.Function3[
      /* statusCode */ scala.Double, 
      /* location */ java.lang.String, 
      /* req */ nodeLib.httpMod.ClientRequest, 
      scala.Unit
    ]
  ] = js.undefined
  var redirects: js.UndefOr[scala.Double] = js.undefined
  var rejectUnauthorized: js.UndefOr[scala.Boolean] = js.undefined
  var secureProtocol: js.UndefOr[java.lang.String] = js.undefined
  var socketPath: js.UndefOr[java.lang.String] = js.undefined
  var timeout: js.UndefOr[scala.Double] = js.undefined
}

object RequestOptions {
  @scala.inline
  def apply(
    agent: atHapiWreckLib.Anon_Http | atHapiWreckLib.atHapiWreckLibNumbers.`false` = null,
    baseUrl: java.lang.String = null,
    beforeRedirect: (/* redirectMethod */ java.lang.String, /* statusCode */ scala.Double, /* location */ java.lang.String, /* resHeaders */ org.scalablytyped.runtime.StringDictionary[js.Any], /* redirectOptions */ js.Any, /* next */ js.Function0[js.Object]) => scala.Unit = null,
    ciphers: java.lang.String = null,
    downstreamRes: js.Any = null,
    events: js.UndefOr[scala.Boolean] = js.undefined,
    headers: org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    maxBytes: scala.Int | scala.Double = null,
    payload: js.Any = null,
    redirect303: js.UndefOr[scala.Boolean] = js.undefined,
    redirected: (/* statusCode */ scala.Double, /* location */ java.lang.String, /* req */ nodeLib.httpMod.ClientRequest) => scala.Unit = null,
    redirects: scala.Int | scala.Double = null,
    rejectUnauthorized: js.UndefOr[scala.Boolean] = js.undefined,
    secureProtocol: java.lang.String = null,
    socketPath: java.lang.String = null,
    timeout: scala.Int | scala.Double = null
  ): RequestOptions = {
    val __obj = js.Dynamic.literal()
    if (agent != null) __obj.updateDynamic("agent")(agent.asInstanceOf[js.Any])
    if (baseUrl != null) __obj.updateDynamic("baseUrl")(baseUrl)
    if (beforeRedirect != null) __obj.updateDynamic("beforeRedirect")(js.Any.fromFunction6(beforeRedirect))
    if (ciphers != null) __obj.updateDynamic("ciphers")(ciphers)
    if (downstreamRes != null) __obj.updateDynamic("downstreamRes")(downstreamRes)
    if (!js.isUndefined(events)) __obj.updateDynamic("events")(events)
    if (headers != null) __obj.updateDynamic("headers")(headers)
    if (maxBytes != null) __obj.updateDynamic("maxBytes")(maxBytes.asInstanceOf[js.Any])
    if (payload != null) __obj.updateDynamic("payload")(payload)
    if (!js.isUndefined(redirect303)) __obj.updateDynamic("redirect303")(redirect303)
    if (redirected != null) __obj.updateDynamic("redirected")(js.Any.fromFunction3(redirected))
    if (redirects != null) __obj.updateDynamic("redirects")(redirects.asInstanceOf[js.Any])
    if (!js.isUndefined(rejectUnauthorized)) __obj.updateDynamic("rejectUnauthorized")(rejectUnauthorized)
    if (secureProtocol != null) __obj.updateDynamic("secureProtocol")(secureProtocol)
    if (socketPath != null) __obj.updateDynamic("socketPath")(socketPath)
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestOptions]
  }
}

