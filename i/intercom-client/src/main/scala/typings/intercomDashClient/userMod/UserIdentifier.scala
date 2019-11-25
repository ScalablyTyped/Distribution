package typings.intercomDashClient.userMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.intercomDashClient.Anon_Id
  - typings.intercomDashClient.Anon_Userid
  - typings.intercomDashClient.Anon_Email
*/
trait UserIdentifier extends js.Object

object UserIdentifier {
  @scala.inline
  def Anon_Id(id: String): UserIdentifier = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[UserIdentifier]
  }
  @scala.inline
  def Anon_Userid(user_id: String): UserIdentifier = {
    val __obj = js.Dynamic.literal(user_id = user_id.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[UserIdentifier]
  }
  @scala.inline
  def Anon_Email(email: String): UserIdentifier = {
    val __obj = js.Dynamic.literal(email = email.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[UserIdentifier]
  }
}

