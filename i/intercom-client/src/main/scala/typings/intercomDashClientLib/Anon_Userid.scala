package typings
package intercomDashClientLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Userid
  extends intercomDashClientLib.leadMod.LeadIdentifier
     with intercomDashClientLib.userMod.UserIdentifier {
  var user_id: java.lang.String
}

object Anon_Userid {
  @scala.inline
  def apply(user_id: java.lang.String): Anon_Userid = {
    val __obj = js.Dynamic.literal(user_id = user_id)
  
    __obj.asInstanceOf[Anon_Userid]
  }
}

