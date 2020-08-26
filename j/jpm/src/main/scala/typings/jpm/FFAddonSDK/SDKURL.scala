package typings.jpm.FFAddonSDK

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SDKURL extends js.Object {
  var hash: String = js.native
  var host: String = js.native
  var hostname: String = js.native
  var href: String = js.native
  var origin: String = js.native
  var path: String = js.native
  var pathname: String = js.native
  var port: String = js.native
  var protocol: String = js.native
  var scheme: String = js.native
  var search: String = js.native
  var userPass: String = js.native
  def toJSON(): String = js.native
}

object SDKURL {
  @scala.inline
  def apply(
    hash: String,
    host: String,
    hostname: String,
    href: String,
    origin: String,
    path: String,
    pathname: String,
    port: String,
    protocol: String,
    scheme: String,
    search: String,
    toJSON: () => String,
    userPass: String
  ): SDKURL = {
    val __obj = js.Dynamic.literal(hash = hash.asInstanceOf[js.Any], host = host.asInstanceOf[js.Any], hostname = hostname.asInstanceOf[js.Any], href = href.asInstanceOf[js.Any], origin = origin.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], pathname = pathname.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any], protocol = protocol.asInstanceOf[js.Any], scheme = scheme.asInstanceOf[js.Any], search = search.asInstanceOf[js.Any], toJSON = js.Any.fromFunction0(toJSON), userPass = userPass.asInstanceOf[js.Any])
    __obj.asInstanceOf[SDKURL]
  }
  @scala.inline
  implicit class SDKURLOps[Self <: SDKURL] (val x: Self) extends AnyVal {
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
    def setHash(value: String): Self = this.set("hash", value.asInstanceOf[js.Any])
    @scala.inline
    def setHost(value: String): Self = this.set("host", value.asInstanceOf[js.Any])
    @scala.inline
    def setHostname(value: String): Self = this.set("hostname", value.asInstanceOf[js.Any])
    @scala.inline
    def setHref(value: String): Self = this.set("href", value.asInstanceOf[js.Any])
    @scala.inline
    def setOrigin(value: String): Self = this.set("origin", value.asInstanceOf[js.Any])
    @scala.inline
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
    @scala.inline
    def setPathname(value: String): Self = this.set("pathname", value.asInstanceOf[js.Any])
    @scala.inline
    def setPort(value: String): Self = this.set("port", value.asInstanceOf[js.Any])
    @scala.inline
    def setProtocol(value: String): Self = this.set("protocol", value.asInstanceOf[js.Any])
    @scala.inline
    def setScheme(value: String): Self = this.set("scheme", value.asInstanceOf[js.Any])
    @scala.inline
    def setSearch(value: String): Self = this.set("search", value.asInstanceOf[js.Any])
    @scala.inline
    def setToJSON(value: () => String): Self = this.set("toJSON", js.Any.fromFunction0(value))
    @scala.inline
    def setUserPass(value: String): Self = this.set("userPass", value.asInstanceOf[js.Any])
  }
  
}

