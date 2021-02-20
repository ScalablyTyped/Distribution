package typings.intercomClient.anon

import typings.intercomClient.leadMod.LeadIdentifier
import typings.intercomClient.userMod.UserIdIdentifier
import typings.intercomClient.visitorMod.VisitorIdentifier
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Userid
  extends UserIdIdentifier
     with LeadIdentifier
     with VisitorIdentifier {
  
  var user_id: String = js.native
}
object Userid {
  
  @scala.inline
  def apply(user_id: String): Userid = {
    val __obj = js.Dynamic.literal(user_id = user_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[Userid]
  }
  
  @scala.inline
  implicit class UseridMutableBuilder[Self <: Userid] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setUser_id(value: String): Self = StObject.set(x, "user_id", value.asInstanceOf[js.Any])
  }
}
