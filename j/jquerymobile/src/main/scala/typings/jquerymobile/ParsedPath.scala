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
    val __obj = js.Dynamic.literal(authority = authority, directory = directory, domain = domain, doubleSlash = doubleSlash, filename = filename, hash = hash, host = host, hostname = hostname, href = href, hrefNoHash = hrefNoHash, hrefNoSearch = hrefNoSearch, password = password, pathname = pathname, port = port, protocol = protocol, search = search, username = username)
  
    __obj.asInstanceOf[ParsedPath]
  }
}

