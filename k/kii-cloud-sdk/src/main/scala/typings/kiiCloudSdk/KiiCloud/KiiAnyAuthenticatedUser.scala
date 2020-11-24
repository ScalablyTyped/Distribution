package typings.kiiCloudSdk.KiiCloud

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represent any authenticated user for setting the ACL of an object. This will include anyone using the application who has registered and authenticated in the current session.
  *
  *     When retrieving ACL from an object, test for this class to determine the subject type. Example:
  */
@js.native
trait KiiAnyAuthenticatedUser extends KiiACLSubject {
  
  /**
    * Returns the ID of AuthenticatedUser user.
    */
  def getID(): String = js.native
}
object KiiAnyAuthenticatedUser {
  
  @scala.inline
  def apply(getID: () => String): KiiAnyAuthenticatedUser = {
    val __obj = js.Dynamic.literal(getID = js.Any.fromFunction0(getID))
    __obj.asInstanceOf[KiiAnyAuthenticatedUser]
  }
  
  @scala.inline
  implicit class KiiAnyAuthenticatedUserOps[Self <: KiiAnyAuthenticatedUser] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setGetID(value: () => String): Self = this.set("getID", js.Any.fromFunction0(value))
  }
}
