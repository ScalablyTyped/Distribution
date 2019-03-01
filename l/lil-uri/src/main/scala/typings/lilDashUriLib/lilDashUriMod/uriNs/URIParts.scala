package typings
package lilDashUriLib.lilDashUriMod.uriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * URI parts
  */
trait URIParts extends js.Object {
  var auth: java.lang.String
  var hash: java.lang.String
  var host: java.lang.String
  var hostname: java.lang.String
  var password: java.lang.String
  var path: java.lang.String
  var port: java.lang.String
  var protocol: java.lang.String
  var query: QueryString
  var search: java.lang.String
  var uri: java.lang.String
  var user: java.lang.String
}

object URIParts {
  @scala.inline
  def apply(
    auth: java.lang.String,
    hash: java.lang.String,
    host: java.lang.String,
    hostname: java.lang.String,
    password: java.lang.String,
    path: java.lang.String,
    port: java.lang.String,
    protocol: java.lang.String,
    query: QueryString,
    search: java.lang.String,
    uri: java.lang.String,
    user: java.lang.String
  ): URIParts = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("auth")(auth)
    __obj.updateDynamic("hash")(hash)
    __obj.updateDynamic("host")(host)
    __obj.updateDynamic("hostname")(hostname)
    __obj.updateDynamic("password")(password)
    __obj.updateDynamic("path")(path)
    __obj.updateDynamic("port")(port)
    __obj.updateDynamic("protocol")(protocol)
    __obj.updateDynamic("query")(query)
    __obj.updateDynamic("search")(search)
    __obj.updateDynamic("uri")(uri)
    __obj.updateDynamic("user")(user)
    __obj.asInstanceOf[URIParts]
  }
}

