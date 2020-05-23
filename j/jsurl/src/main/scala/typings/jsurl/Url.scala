package typings.jsurl

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Url[T] extends js.Object {
  var hash: String
  var host: String
  var href: String
  var pass: String
  var path: String
  var port: String
  var protocol: String
  var query: T
  var user: String
}

object Url {
  @scala.inline
  def apply[T](
    hash: String,
    host: String,
    href: String,
    pass: String,
    path: String,
    port: String,
    protocol: String,
    query: T,
    user: String
  ): Url[T] = {
    val __obj = js.Dynamic.literal(hash = hash.asInstanceOf[js.Any], host = host.asInstanceOf[js.Any], href = href.asInstanceOf[js.Any], pass = pass.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any], protocol = protocol.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
    __obj.asInstanceOf[Url[T]]
  }
}

