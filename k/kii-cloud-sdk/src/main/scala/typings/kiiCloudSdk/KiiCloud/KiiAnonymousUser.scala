package typings.kiiCloudSdk.KiiCloud

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represent an anonymous user for setting the ACL of an object. This will include anyone using the application but have not signed up or authenticated as registered user.
  *
  *     When retrieving ACL from an object, test for this class to determine the subject type.
  */
trait KiiAnonymousUser
  extends StObject
     with KiiACLSubject {
  
  /**
    * Returns the ID of Anonymous user.
    */
  def getID(): String
}
object KiiAnonymousUser {
  
  @scala.inline
  def apply(getID: () => String): KiiAnonymousUser = {
    val __obj = js.Dynamic.literal(getID = js.Any.fromFunction0(getID))
    __obj.asInstanceOf[KiiAnonymousUser]
  }
  
  @scala.inline
  implicit class KiiAnonymousUserMutableBuilder[Self <: KiiAnonymousUser] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetID(value: () => String): Self = StObject.set(x, "getID", js.Any.fromFunction0(value))
  }
}
