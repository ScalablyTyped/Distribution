package typings.intercomDashClient.leadMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.intercomDashClient.Anon_Id
  - typings.intercomDashClient.Anon_Userid
*/
trait LeadIdentifier extends js.Object

object LeadIdentifier {
  @scala.inline
  def Anon_Id(id: String): LeadIdentifier = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[LeadIdentifier]
  }
  @scala.inline
  def Anon_Userid(user_id: String): LeadIdentifier = {
    val __obj = js.Dynamic.literal(user_id = user_id.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[LeadIdentifier]
  }
}

