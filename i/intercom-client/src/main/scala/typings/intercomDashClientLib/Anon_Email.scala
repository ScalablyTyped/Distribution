package typings
package intercomDashClientLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Email
  extends intercomDashClientLib.userMod.UserIdentifier {
  var email: java.lang.String
}

object Anon_Email {
  @scala.inline
  def apply(email: java.lang.String): Anon_Email = {
    val __obj = js.Dynamic.literal(email = email)
  
    __obj.asInstanceOf[Anon_Email]
  }
}

