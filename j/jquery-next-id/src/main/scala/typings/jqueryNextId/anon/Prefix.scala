package typings.jqueryNextId.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Prefix extends js.Object {
  var prefix: String
  var separator: String
}

object Prefix {
  @scala.inline
  def apply(prefix: String, separator: String): Prefix = {
    val __obj = js.Dynamic.literal(prefix = prefix.asInstanceOf[js.Any], separator = separator.asInstanceOf[js.Any])
    __obj.asInstanceOf[Prefix]
  }
}

