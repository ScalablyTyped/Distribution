package typings
package atJupyterlabExtensionmanagerLib.libQueryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPerson extends js.Object {
  /**
    * The email of the person.
    */
  var email: java.lang.String
  /**
    * The username of the person.
    */
  var username: java.lang.String
}

object IPerson {
  @scala.inline
  def apply(email: java.lang.String, username: java.lang.String): IPerson = {
    val __obj = js.Dynamic.literal(email = email, username = username)
  
    __obj.asInstanceOf[IPerson]
  }
}

