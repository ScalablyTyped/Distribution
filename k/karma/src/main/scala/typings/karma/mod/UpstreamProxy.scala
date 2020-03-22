package typings.karma.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpstreamProxy extends js.Object {
  /**
    * Will be used as the hostname when launching browsers
    * @default 'localhost'
    */
  var hostname: js.UndefOr[String] = js.undefined
  /**
    * Will be prepended to the base url when launching browsers and prepended to internal urls as loaded by the browsers
    * @default '/'
    */
  var path: js.UndefOr[String] = js.undefined
  /**
    * Will be used as the port when launching browsers
    * @default 9875
    */
  var port: js.UndefOr[Double] = js.undefined
  /**
    * Will be used as the protocol when launching browsers
    * @default 'http'
    */
  var protocol: js.UndefOr[String] = js.undefined
}

object UpstreamProxy {
  @scala.inline
  def apply(hostname: String = null, path: String = null, port: Int | Double = null, protocol: String = null): UpstreamProxy = {
    val __obj = js.Dynamic.literal()
    if (hostname != null) __obj.updateDynamic("hostname")(hostname.asInstanceOf[js.Any])
    if (path != null) __obj.updateDynamic("path")(path.asInstanceOf[js.Any])
    if (port != null) __obj.updateDynamic("port")(port.asInstanceOf[js.Any])
    if (protocol != null) __obj.updateDynamic("protocol")(protocol.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpstreamProxy]
  }
}

