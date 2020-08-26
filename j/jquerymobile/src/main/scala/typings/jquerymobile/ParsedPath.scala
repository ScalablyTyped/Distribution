package typings.jquerymobile

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParsedPath extends js.Object {
  var authority: String = js.native
  var directory: String = js.native
  var domain: String = js.native
  var doubleSlash: String = js.native
  var filename: String = js.native
  var hash: String = js.native
  var host: String = js.native
  var hostname: String = js.native
  var href: String = js.native
  var hrefNoHash: String = js.native
  var hrefNoSearch: String = js.native
  var password: String = js.native
  var pathname: String = js.native
  var port: String = js.native
  var protocol: String = js.native
  var search: String = js.native
  var username: String = js.native
}

object ParsedPath {
  @scala.inline
  def apply(
    authority: String,
    directory: String,
    domain: String,
    doubleSlash: String,
    filename: String,
    hash: String,
    host: String,
    hostname: String,
    href: String,
    hrefNoHash: String,
    hrefNoSearch: String,
    password: String,
    pathname: String,
    port: String,
    protocol: String,
    search: String,
    username: String
  ): ParsedPath = {
    val __obj = js.Dynamic.literal(authority = authority.asInstanceOf[js.Any], directory = directory.asInstanceOf[js.Any], domain = domain.asInstanceOf[js.Any], doubleSlash = doubleSlash.asInstanceOf[js.Any], filename = filename.asInstanceOf[js.Any], hash = hash.asInstanceOf[js.Any], host = host.asInstanceOf[js.Any], hostname = hostname.asInstanceOf[js.Any], href = href.asInstanceOf[js.Any], hrefNoHash = hrefNoHash.asInstanceOf[js.Any], hrefNoSearch = hrefNoSearch.asInstanceOf[js.Any], password = password.asInstanceOf[js.Any], pathname = pathname.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any], protocol = protocol.asInstanceOf[js.Any], search = search.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParsedPath]
  }
  @scala.inline
  implicit class ParsedPathOps[Self <: ParsedPath] (val x: Self) extends AnyVal {
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
    def setAuthority(value: String): Self = this.set("authority", value.asInstanceOf[js.Any])
    @scala.inline
    def setDirectory(value: String): Self = this.set("directory", value.asInstanceOf[js.Any])
    @scala.inline
    def setDomain(value: String): Self = this.set("domain", value.asInstanceOf[js.Any])
    @scala.inline
    def setDoubleSlash(value: String): Self = this.set("doubleSlash", value.asInstanceOf[js.Any])
    @scala.inline
    def setFilename(value: String): Self = this.set("filename", value.asInstanceOf[js.Any])
    @scala.inline
    def setHash(value: String): Self = this.set("hash", value.asInstanceOf[js.Any])
    @scala.inline
    def setHost(value: String): Self = this.set("host", value.asInstanceOf[js.Any])
    @scala.inline
    def setHostname(value: String): Self = this.set("hostname", value.asInstanceOf[js.Any])
    @scala.inline
    def setHref(value: String): Self = this.set("href", value.asInstanceOf[js.Any])
    @scala.inline
    def setHrefNoHash(value: String): Self = this.set("hrefNoHash", value.asInstanceOf[js.Any])
    @scala.inline
    def setHrefNoSearch(value: String): Self = this.set("hrefNoSearch", value.asInstanceOf[js.Any])
    @scala.inline
    def setPassword(value: String): Self = this.set("password", value.asInstanceOf[js.Any])
    @scala.inline
    def setPathname(value: String): Self = this.set("pathname", value.asInstanceOf[js.Any])
    @scala.inline
    def setPort(value: String): Self = this.set("port", value.asInstanceOf[js.Any])
    @scala.inline
    def setProtocol(value: String): Self = this.set("protocol", value.asInstanceOf[js.Any])
    @scala.inline
    def setSearch(value: String): Self = this.set("search", value.asInstanceOf[js.Any])
    @scala.inline
    def setUsername(value: String): Self = this.set("username", value.asInstanceOf[js.Any])
  }
  
}

