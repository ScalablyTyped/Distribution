package typings.kiiCloudSdk.KiiCloud

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represent an anonymous user for setting the ACL of an object. This will include anyone using the application but have not signed up or authenticated as registered user.
  *
  *     When retrieving ACL from an object, test for this class to determine the subject type.
  */
@js.native
trait KiiAnonymousUser extends KiiACLSubject {
  
  /**
    * Returns the ID of Anonymous user.
    */
  def getID(): String = js.native
}
object KiiAnonymousUser {
  
  @scala.inline
  def apply(getID: () => String): KiiAnonymousUser = {
    val __obj = js.Dynamic.literal(getID = js.Any.fromFunction0(getID))
    __obj.asInstanceOf[KiiAnonymousUser]
  }
  
  @scala.inline
  implicit class KiiAnonymousUserOps[Self <: KiiAnonymousUser] (val x: Self) extends AnyVal {
    
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
