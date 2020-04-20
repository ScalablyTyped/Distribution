package typings.koaBasicAuth

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonName extends js.Object {
  var name: String
  var pass: String
}

object AnonName {
  @scala.inline
  def apply(name: String, pass: String): AnonName = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], pass = pass.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonName]
  }
}

