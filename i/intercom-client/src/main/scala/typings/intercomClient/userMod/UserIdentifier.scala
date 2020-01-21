package typings.intercomClient.userMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.intercomClient.AnonId
  - typings.intercomClient.AnonUserid
  - typings.intercomClient.AnonEmail
*/
trait UserIdentifier extends js.Object

object UserIdentifier {
  @scala.inline
  def AnonId(id: String): UserIdentifier = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[UserIdentifier]
  }
  @scala.inline
  def AnonUserid(user_id: String): UserIdentifier = {
    val __obj = js.Dynamic.literal(user_id = user_id.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[UserIdentifier]
  }
  @scala.inline
  def AnonEmail(email: String): UserIdentifier = {
    val __obj = js.Dynamic.literal(email = email.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[UserIdentifier]
  }
}

