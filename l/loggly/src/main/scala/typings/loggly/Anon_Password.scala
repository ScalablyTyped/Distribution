package typings.loggly

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Password extends js.Object {
  var password: String
  var username: String
}

object Anon_Password {
  @scala.inline
  def apply(password: String, username: String): Anon_Password = {
    val __obj = js.Dynamic.literal(password = password, username = username)
  
    __obj.asInstanceOf[Anon_Password]
  }
}

