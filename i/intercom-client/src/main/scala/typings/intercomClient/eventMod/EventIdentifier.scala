package typings.intercomClient.eventMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.intercomClient.eventMod.IntercomUserIdId
  - typings.intercomClient.eventMod.UserIdId
  - typings.intercomClient.eventMod.EmailIdId
*/
trait EventIdentifier extends js.Object

object EventIdentifier {
  @scala.inline
  def IntercomUserIdId(intercom_user_id: String): EventIdentifier = {
    val __obj = js.Dynamic.literal(intercom_user_id = intercom_user_id.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[EventIdentifier]
  }
  @scala.inline
  def UserIdId(user_id: String): EventIdentifier = {
    val __obj = js.Dynamic.literal(user_id = user_id.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[EventIdentifier]
  }
  @scala.inline
  def EmailIdId(email: String): EventIdentifier = {
    val __obj = js.Dynamic.literal(email = email.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[EventIdentifier]
  }
}

