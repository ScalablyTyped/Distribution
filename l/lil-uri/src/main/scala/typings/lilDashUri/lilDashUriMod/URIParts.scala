package typings.lilDashUri.lilDashUriMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * URI parts
  */
trait URIParts extends js.Object {
  var auth: String
  var hash: String
  var host: String
  var hostname: String
  var password: String
  var path: String
  var port: String
  var protocol: String
  var query: QueryString
  var search: String
  var uri: String
  var user: String
}

object URIParts {
  @scala.inline
  def apply(
    auth: String,
    hash: String,
    host: String,
    hostname: String,
    password: String,
    path: String,
    port: String,
    protocol: String,
    query: QueryString,
    search: String,
    uri: String,
    user: String
  ): URIParts = {
    val __obj = js.Dynamic.literal(auth = auth.asInstanceOf[js.Any], hash = hash.asInstanceOf[js.Any], host = host.asInstanceOf[js.Any], hostname = hostname.asInstanceOf[js.Any], password = password.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any], protocol = protocol.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any], search = search.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[URIParts]
  }
}

