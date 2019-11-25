package typings.intercomDashClient.visitorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.intercomDashClient.Anon_Id
  - typings.intercomDashClient.Anon_Userid
*/
trait VisitorIdentifier extends js.Object

object VisitorIdentifier {
  @scala.inline
  def Anon_Id(id: String): VisitorIdentifier = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[VisitorIdentifier]
  }
  @scala.inline
  def Anon_Userid(user_id: String): VisitorIdentifier = {
    val __obj = js.Dynamic.literal(user_id = user_id.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[VisitorIdentifier]
  }
}

