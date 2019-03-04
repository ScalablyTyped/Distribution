package typings
package jquerymobileLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParsedPath extends js.Object {
  var authority: java.lang.String
  var directory: java.lang.String
  var domain: java.lang.String
  var doubleSlash: java.lang.String
  var filename: java.lang.String
  var hash: java.lang.String
  var host: java.lang.String
  var hostname: java.lang.String
  var href: java.lang.String
  var hrefNoHash: java.lang.String
  var hrefNoSearch: java.lang.String
  var password: java.lang.String
  var pathname: java.lang.String
  var port: java.lang.String
  var protocol: java.lang.String
  var search: java.lang.String
  var username: java.lang.String
}

object ParsedPath {
  @scala.inline
  def apply(
    authority: java.lang.String,
    directory: java.lang.String,
    domain: java.lang.String,
    doubleSlash: java.lang.String,
    filename: java.lang.String,
    hash: java.lang.String,
    host: java.lang.String,
    hostname: java.lang.String,
    href: java.lang.String,
    hrefNoHash: java.lang.String,
    hrefNoSearch: java.lang.String,
    password: java.lang.String,
    pathname: java.lang.String,
    port: java.lang.String,
    protocol: java.lang.String,
    search: java.lang.String,
    username: java.lang.String
  ): ParsedPath = {
    val __obj = js.Dynamic.literal(authority = authority, directory = directory, domain = domain, doubleSlash = doubleSlash, filename = filename, hash = hash, host = host, hostname = hostname, href = href, hrefNoHash = hrefNoHash, hrefNoSearch = hrefNoSearch, password = password, pathname = pathname, port = port, protocol = protocol, search = search, username = username)
  
    __obj.asInstanceOf[ParsedPath]
  }
}

