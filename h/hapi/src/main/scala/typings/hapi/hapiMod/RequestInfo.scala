package typings.hapi.hapiMod

import typings.hapi.Anon_IsOriginMatch
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RequestInfo extends js.Object {
  /** the request preferred encoding. */
  var acceptEncoding: String
  /** request processing completion timestamp (0 is still processing). */
  var completed: Double
  /** if CORS is enabled for the route, contains the following: */
  var cors: Anon_IsOriginMatch
  /** content of the HTTP 'Host' header (e.g. 'example.com:8080'). */
  var host: String
  /** the hostname part of the 'Host' header (e.g. 'example.com'). */
  var hostname: String
  /** a unique request identifier (using the format '{now}:{connection.info.id}:{5 digits counter}') */
  var id: String
  /** request reception timestamp. */
  var received: Double
  /** content of the HTTP 'Referrer' (or 'Referer') header. */
  var referrer: String
  /** remote client IP address. */
  var remoteAddress: String
  /** remote client port. */
  var remotePort: String
  /** request response timestamp (0 is not responded yet). */
  var responded: Double
}

object RequestInfo {
  @scala.inline
  def apply(
    acceptEncoding: String,
    completed: Double,
    cors: Anon_IsOriginMatch,
    host: String,
    hostname: String,
    id: String,
    received: Double,
    referrer: String,
    remoteAddress: String,
    remotePort: String,
    responded: Double
  ): RequestInfo = {
    val __obj = js.Dynamic.literal(acceptEncoding = acceptEncoding, completed = completed, cors = cors, host = host, hostname = hostname, id = id, received = received, referrer = referrer, remoteAddress = remoteAddress, remotePort = remotePort, responded = responded)
  
    __obj.asInstanceOf[RequestInfo]
  }
}

