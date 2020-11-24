package typings.intercomClient.userMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.intercomClient.anon.Id
  - typings.intercomClient.anon.Userid
*/
trait UserIdIdentifier extends UserIdentifier
object UserIdIdentifier {
  
  @scala.inline
  def Id(id: String): UserIdIdentifier = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserIdIdentifier]
  }
  
  @scala.inline
  def Userid(user_id: String): UserIdIdentifier = {
    val __obj = js.Dynamic.literal(user_id = user_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserIdIdentifier]
  }
}
