package typings.jsurl

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Url")
@js.native
class Url[T] () extends js.Object {
  def this(url: String) = this()
  var hash: String = js.native
  var host: String = js.native
  var href: String = js.native
  var pass: String = js.native
  var path: String = js.native
  var port: String = js.native
  var protocol: String = js.native
  var query: T = js.native
  var user: String = js.native
}

