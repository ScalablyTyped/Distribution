package typings.jquerymobile

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParsedPath extends js.Object {
  var authority: String
  var directory: String
  var domain: String
  var doubleSlash: String
  var filename: String
  var hash: String
  var host: String
  var hostname: String
  var href: String
  var hrefNoHash: String
  var hrefNoSearch: String
  var password: String
  var pathname: String
  var port: String
  var protocol: String
  var search: String
  var username: String
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
}

