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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("authority")(authority)
    __obj.updateDynamic("directory")(directory)
    __obj.updateDynamic("domain")(domain)
    __obj.updateDynamic("doubleSlash")(doubleSlash)
    __obj.updateDynamic("filename")(filename)
    __obj.updateDynamic("hash")(hash)
    __obj.updateDynamic("host")(host)
    __obj.updateDynamic("hostname")(hostname)
    __obj.updateDynamic("href")(href)
    __obj.updateDynamic("hrefNoHash")(hrefNoHash)
    __obj.updateDynamic("hrefNoSearch")(hrefNoSearch)
    __obj.updateDynamic("password")(password)
    __obj.updateDynamic("pathname")(pathname)
    __obj.updateDynamic("port")(port)
    __obj.updateDynamic("protocol")(protocol)
    __obj.updateDynamic("search")(search)
    __obj.updateDynamic("username")(username)
    __obj.asInstanceOf[ParsedPath]
  }
}

