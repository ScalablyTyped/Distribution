package typings
package jpmLib.FFAddonSDKNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SDKURL extends js.Object {
  var hash: java.lang.String
  var host: java.lang.String
  var hostname: java.lang.String
  var href: java.lang.String
  var origin: java.lang.String
  var path: java.lang.String
  var pathname: java.lang.String
  var port: java.lang.String
  var protocol: java.lang.String
  var scheme: java.lang.String
  var search: java.lang.String
  var userPass: java.lang.String
  def toJSON(): java.lang.String
}

object SDKURL {
  @scala.inline
  def apply(
    hash: java.lang.String,
    host: java.lang.String,
    hostname: java.lang.String,
    href: java.lang.String,
    origin: java.lang.String,
    path: java.lang.String,
    pathname: java.lang.String,
    port: java.lang.String,
    protocol: java.lang.String,
    scheme: java.lang.String,
    search: java.lang.String,
    toJSON: js.Function0[java.lang.String],
    toString: js.Function0[java.lang.String],
    userPass: java.lang.String
  ): SDKURL = {
    val __obj = js.Dynamic.literal(hash = hash, host = host, hostname = hostname, href = href, origin = origin, path = path, pathname = pathname, port = port, protocol = protocol, scheme = scheme, search = search, toJSON = toJSON, toString = toString, userPass = userPass)
  
    __obj.asInstanceOf[SDKURL]
  }
}

