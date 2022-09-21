package typings.knuddelsUserappsApi.mod.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @see https://developer.knuddels.de/docs/classes/OwnAppInstance.html
  */
@JSGlobal("OwnAppInstance")
@js.native
open class OwnAppInstance () extends StObject {
  
  /**
    * @see https://developer.knuddels.de/docs/classes/OwnAppInstance.html#method_getOnlineUsers
    * @since AppServer 82560
    */
  def getOnlineUsers(otherAppInstance: AppInstance, userType: UserType*): js.Array[User] = js.native
}
