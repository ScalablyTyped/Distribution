package typings
package intercomDashClientLib.eventMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EmailIdId extends EventIdentifier {
  var email: java.lang.String
}

object EmailIdId {
  @scala.inline
  def apply(email: java.lang.String): EmailIdId = {
    val __obj = js.Dynamic.literal(email = email)
  
    __obj.asInstanceOf[EmailIdId]
  }
}

