package typings.jpm.FFAddonSDKNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SDKURL extends js.Object {
  var hash: String
  var host: String
  var hostname: String
  var href: String
  var origin: String
  var path: String
  var pathname: String
  var port: String
  var protocol: String
  var scheme: String
  var search: String
  var userPass: String
  def toJSON(): String
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
    toString: () => String,
    userPass: String
  ): SDKURL = {
    val __obj = js.Dynamic.literal(hash = hash, host = host, hostname = hostname, href = href, origin = origin, path = path, pathname = pathname, port = port, protocol = protocol, scheme = scheme, search = search, toJSON = js.Any.fromFunction0(toJSON), toString = js.Any.fromFunction0(toString), userPass = userPass)
  
    __obj.asInstanceOf[SDKURL]
  }
}

