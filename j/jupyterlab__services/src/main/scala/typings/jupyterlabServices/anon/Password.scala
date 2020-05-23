package typings.jupyterlabServices.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Password extends js.Object {
  /**
    * Whether the request is for a password.
    * If so, the frontend shouldn't echo input.
    */
  var password: Boolean
  /**
    * The text to show at the prompt.
    */
  var prompt: String
}

object Password {
  @scala.inline
  def apply(password: Boolean, prompt: String): Password = {
    val __obj = js.Dynamic.literal(password = password.asInstanceOf[js.Any], prompt = prompt.asInstanceOf[js.Any])
    __obj.asInstanceOf[Password]
  }
}

