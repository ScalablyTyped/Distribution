package typings.kiiCloudSdk.KiiCloud

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represent any authenticated user for setting the ACL of an object. This will include anyone using the application who has registered and authenticated in the current session.
  *
  *     When retrieving ACL from an object, test for this class to determine the subject type. Example:
  */
trait KiiAnyAuthenticatedUser
  extends StObject
     with KiiACLSubject {
  
  /**
    * Returns the ID of AuthenticatedUser user.
    */
  def getID(): String
}
object KiiAnyAuthenticatedUser {
  
  inline def apply(getID: () => String): KiiAnyAuthenticatedUser = {
    val __obj = js.Dynamic.literal(getID = js.Any.fromFunction0(getID))
    __obj.asInstanceOf[KiiAnyAuthenticatedUser]
  }
  
  extension [Self <: KiiAnyAuthenticatedUser](x: Self) {
    
    inline def setGetID(value: () => String): Self = StObject.set(x, "getID", js.Any.fromFunction0(value))
  }
}
