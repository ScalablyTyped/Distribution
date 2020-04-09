package typings.hoxy.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InterceptOptions extends js.Object {
  /**
    * Body-parsers
    */
  var as: js.UndefOr[BodyParser] = js.undefined
  /**
    * Match the full content-type header of the request or
    * response (depending on the phase)
    */
  var contentType: js.UndefOr[Filter[String]] = js.undefined
  /**
    * Match the full request URL including protocol and hostname.
    * Patterns like /foo/ * are allowed
    */
  var fullUrl: js.UndefOr[Filter[String]] = js.undefined
  /**
    * Match the host, not including :port.
    */
  var hostname: js.UndefOr[Filter[String]] = js.undefined
  /**
    * Match the all-uppercase HTTP request method
    */
  var method: js.UndefOr[Filter[HttpMethod]] = js.undefined
  /**
    * Match just the mime type portion of the content-type header
    * of the request or response (depending on the phase). I.e.,
    * if the entire header is "text/html; charset=utf-8", just
    * match the "text/html" part
    */
  var mimeType: js.UndefOr[Filter[String]] = js.undefined
  /**
    * Request phase to listen to
    */
  var phase: Phase
  /**
    * Match the port number.
    */
  var port: js.UndefOr[Filter[Double | String]] = js.undefined
  /**
    * Match the request protocol
    */
  var protocol: js.UndefOr[Filter[String]] = js.undefined
  /**
    * Same as contentType but only matches request
    */
  var requestContentType: js.UndefOr[Filter[String]] = js.undefined
  /**
    * Same as mimeType but only matches request
    */
  var requestMimeType: js.UndefOr[Filter[String]] = js.undefined
  /**
    * Same as contentType but only matches response
    */
  var responseContentType: js.UndefOr[Filter[String]] = js.undefined
  /**
    * Same as mimeType but only matches response
    */
  var responseMimeType: js.UndefOr[Filter[String]] = js.undefined
  /**
    * Match the request URL. Patterns like /foo/ * are allowed
    */
  var url: js.UndefOr[Filter[String]] = js.undefined
}

object InterceptOptions {
  @scala.inline
  def apply(
    phase: Phase,
    as: BodyParser = null,
    contentType: Filter[String] = null,
    fullUrl: Filter[String] = null,
    hostname: Filter[String] = null,
    method: Filter[HttpMethod] = null,
    mimeType: Filter[String] = null,
    port: Filter[Double | String] = null,
    protocol: Filter[String] = null,
    requestContentType: Filter[String] = null,
    requestMimeType: Filter[String] = null,
    responseContentType: Filter[String] = null,
    responseMimeType: Filter[String] = null,
    url: Filter[String] = null
  ): InterceptOptions = {
    val __obj = js.Dynamic.literal(phase = phase.asInstanceOf[js.Any])
    if (as != null) __obj.updateDynamic("as")(as.asInstanceOf[js.Any])
    if (contentType != null) __obj.updateDynamic("contentType")(contentType.asInstanceOf[js.Any])
    if (fullUrl != null) __obj.updateDynamic("fullUrl")(fullUrl.asInstanceOf[js.Any])
    if (hostname != null) __obj.updateDynamic("hostname")(hostname.asInstanceOf[js.Any])
    if (method != null) __obj.updateDynamic("method")(method.asInstanceOf[js.Any])
    if (mimeType != null) __obj.updateDynamic("mimeType")(mimeType.asInstanceOf[js.Any])
    if (port != null) __obj.updateDynamic("port")(port.asInstanceOf[js.Any])
    if (protocol != null) __obj.updateDynamic("protocol")(protocol.asInstanceOf[js.Any])
    if (requestContentType != null) __obj.updateDynamic("requestContentType")(requestContentType.asInstanceOf[js.Any])
    if (requestMimeType != null) __obj.updateDynamic("requestMimeType")(requestMimeType.asInstanceOf[js.Any])
    if (responseContentType != null) __obj.updateDynamic("responseContentType")(responseContentType.asInstanceOf[js.Any])
    if (responseMimeType != null) __obj.updateDynamic("responseMimeType")(responseMimeType.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    __obj.asInstanceOf[InterceptOptions]
  }
}

