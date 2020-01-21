package typings.intercomClient.leadMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.intercomClient.AnonId
  - typings.intercomClient.AnonUserid
*/
trait LeadIdentifier extends js.Object

object LeadIdentifier {
  @scala.inline
  def AnonId(id: String): LeadIdentifier = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[LeadIdentifier]
  }
  @scala.inline
  def AnonUserid(user_id: String): LeadIdentifier = {
    val __obj = js.Dynamic.literal(user_id = user_id.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[LeadIdentifier]
  }
}

