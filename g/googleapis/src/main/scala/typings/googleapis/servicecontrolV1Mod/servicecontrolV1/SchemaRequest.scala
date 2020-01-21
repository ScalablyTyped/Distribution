package typings.googleapis.servicecontrolV1Mod.servicecontrolV1

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This message defines attributes for an HTTP request. If the actual request
  * is not an HTTP request, the runtime system should try to map the actual
  * request to an equivalent HTTP request.
  */
@js.native
trait SchemaRequest extends js.Object {
  /**
    * The request authentication. May be absent for unauthenticated requests.
    * Derived from the HTTP request `Authorization` header or equivalent.
    */
  var auth: js.UndefOr[SchemaAuth] = js.native
  /**
    * The HTTP URL fragment. No URL decoding is performed.
    */
  var fragment: js.UndefOr[String] = js.native
  /**
    * The HTTP request headers. If multiple headers share the same key, they
    * must be merged according to the HTTP spec. All header keys must be
    * lowercased, because HTTP header keys are case-insensitive.
    */
  var headers: js.UndefOr[StringDictionary[String]] = js.native
  /**
    * The HTTP request `Host` header value.
    */
  var host: js.UndefOr[String] = js.native
  /**
    * The unique ID for a request, which can be propagated to downstream
    * systems. The ID should have low probability of collision within a single
    * day for a specific service.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * The HTTP request method, such as `GET`, `POST`.
    */
  var method: js.UndefOr[String] = js.native
  /**
    * The HTTP URL path.
    */
  var path: js.UndefOr[String] = js.native
  /**
    * The network protocol used with the request, such as &quot;http/1.1&quot;,
    * &quot;spdy/3&quot;, &quot;h2&quot;, &quot;h2c&quot;, &quot;webrtc&quot;,
    * &quot;tcp&quot;, &quot;udp&quot;, &quot;quic&quot;. See
    * https://www.iana.org/assignments/tls-extensiontype-values/tls-extensiontype-values.xhtml#alpn-protocol-ids
    * for details.
    */
  var protocol: js.UndefOr[String] = js.native
  /**
    * The HTTP URL query in the format of `name1=value`&amp;name2=value2`, as
    * it appears in the first line of the HTTP request. No decoding is
    * performed.
    */
  var query: js.UndefOr[String] = js.native
  /**
    * A special parameter for request reason. It is used by security systems to
    * associate auditing information with a request.
    */
  var reason: js.UndefOr[String] = js.native
  /**
    * The HTTP URL scheme, such as `http` and `https`.
    */
  var scheme: js.UndefOr[String] = js.native
  /**
    * The HTTP request size in bytes. If unknown, it must be -1.
    */
  var size: js.UndefOr[String] = js.native
  /**
    * The timestamp when the `destination` service receives the first byte of
    * the request.
    */
  var time: js.UndefOr[String] = js.native
}

object SchemaRequest {
  @scala.inline
  def apply(
    auth: SchemaAuth = null,
    fragment: String = null,
    headers: StringDictionary[String] = null,
    host: String = null,
    id: String = null,
    method: String = null,
    path: String = null,
    protocol: String = null,
    query: String = null,
    reason: String = null,
    scheme: String = null,
    size: String = null,
    time: String = null
  ): SchemaRequest = {
    val __obj = js.Dynamic.literal()
    if (auth != null) __obj.updateDynamic("auth")(auth.asInstanceOf[js.Any])
    if (fragment != null) __obj.updateDynamic("fragment")(fragment.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (host != null) __obj.updateDynamic("host")(host.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (method != null) __obj.updateDynamic("method")(method.asInstanceOf[js.Any])
    if (path != null) __obj.updateDynamic("path")(path.asInstanceOf[js.Any])
    if (protocol != null) __obj.updateDynamic("protocol")(protocol.asInstanceOf[js.Any])
    if (query != null) __obj.updateDynamic("query")(query.asInstanceOf[js.Any])
    if (reason != null) __obj.updateDynamic("reason")(reason.asInstanceOf[js.Any])
    if (scheme != null) __obj.updateDynamic("scheme")(scheme.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (time != null) __obj.updateDynamic("time")(time.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaRequest]
  }
}

