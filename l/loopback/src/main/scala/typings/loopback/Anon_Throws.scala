package typings.loopback

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Throws extends js.Object {
  var throws: Boolean
  var validate: Boolean
}

object Anon_Throws {
  @scala.inline
  def apply(throws: Boolean, validate: Boolean): Anon_Throws = {
    val __obj = js.Dynamic.literal(throws = throws, validate = validate)
  
    __obj.asInstanceOf[Anon_Throws]
  }
}

