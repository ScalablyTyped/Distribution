package typings.koaBasicAuth.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Name extends js.Object {
  var name: String
  var pass: String
}

object Name {
  @scala.inline
  def apply(name: String, pass: String): Name = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], pass = pass.asInstanceOf[js.Any])
    __obj.asInstanceOf[Name]
  }
}

