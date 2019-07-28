package typings.atJupyterlabExtensionmanager.libQueryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPerson extends js.Object {
  /**
    * The email of the person.
    */
  var email: String
  /**
    * The username of the person.
    */
  var username: String
}

object IPerson {
  @scala.inline
  def apply(email: String, username: String): IPerson = {
    val __obj = js.Dynamic.literal(email = email, username = username)
  
    __obj.asInstanceOf[IPerson]
  }
}

