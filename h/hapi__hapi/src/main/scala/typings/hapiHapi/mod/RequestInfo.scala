package typings.hapiHapi.mod

import typings.hapiHapi.anon.IsOriginMatch
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RequestInfo extends js.Object {
  /** the request preferred encoding. */
  var acceptEncoding: String = js.native
  /** request processing completion timestamp (0 is still processing). */
  var completed: Double = js.native
  /** if CORS is enabled for the route, contains the following: */
  var cors: IsOriginMatch = js.native
  /** content of the HTTP 'Host' header (e.g. 'example.com:8080'). */
  var host: String = js.native
  /** the hostname part of the 'Host' header (e.g. 'example.com'). */
  var hostname: String = js.native
  /** a unique request identifier (using the format '{now}:{connection.info.id}:{5 digits counter}') */
  var id: String = js.native
  /** request reception timestamp. */
  var received: Double = js.native
  /** content of the HTTP 'Referrer' (or 'Referer') header. */
  var referrer: String = js.native
  /** remote client IP address. */
  var remoteAddress: String = js.native
  /** remote client port. */
  var remotePort: String = js.native
  /** request response timestamp (0 is not responded yet). */
  var responded: Double = js.native
}

object RequestInfo {
  @scala.inline
  def apply(
    acceptEncoding: String,
    completed: Double,
    cors: IsOriginMatch,
    host: String,
    hostname: String,
    id: String,
    received: Double,
    referrer: String,
    remoteAddress: String,
    remotePort: String,
    responded: Double
  ): RequestInfo = {
    val __obj = js.Dynamic.literal(acceptEncoding = acceptEncoding.asInstanceOf[js.Any], completed = completed.asInstanceOf[js.Any], cors = cors.asInstanceOf[js.Any], host = host.asInstanceOf[js.Any], hostname = hostname.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], received = received.asInstanceOf[js.Any], referrer = referrer.asInstanceOf[js.Any], remoteAddress = remoteAddress.asInstanceOf[js.Any], remotePort = remotePort.asInstanceOf[js.Any], responded = responded.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestInfo]
  }
  @scala.inline
  implicit class RequestInfoOps[Self <: RequestInfo] (val x: Self) extends AnyVal {
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
    def setAcceptEncoding(value: String): Self = this.set("acceptEncoding", value.asInstanceOf[js.Any])
    @scala.inline
    def setCompleted(value: Double): Self = this.set("completed", value.asInstanceOf[js.Any])
    @scala.inline
    def setCors(value: IsOriginMatch): Self = this.set("cors", value.asInstanceOf[js.Any])
    @scala.inline
    def setHost(value: String): Self = this.set("host", value.asInstanceOf[js.Any])
    @scala.inline
    def setHostname(value: String): Self = this.set("hostname", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setReceived(value: Double): Self = this.set("received", value.asInstanceOf[js.Any])
    @scala.inline
    def setReferrer(value: String): Self = this.set("referrer", value.asInstanceOf[js.Any])
    @scala.inline
    def setRemoteAddress(value: String): Self = this.set("remoteAddress", value.asInstanceOf[js.Any])
    @scala.inline
    def setRemotePort(value: String): Self = this.set("remotePort", value.asInstanceOf[js.Any])
    @scala.inline
    def setResponded(value: Double): Self = this.set("responded", value.asInstanceOf[js.Any])
  }
  
}

