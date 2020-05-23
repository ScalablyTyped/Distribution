package typings.kiiCloudSdk.KiiCloud

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represent any authenticated user for setting the ACL of an object. This will include anyone using the application who has registered and authenticated in the current session.
  *
  *     When retrieving ACL from an object, test for this class to determine the subject type. Example:
  */
trait KiiAnyAuthenticatedUser extends KiiACLSubject {
  /**
    * Returns the ID of AuthenticatedUser user.
    */
  def getID(): String
}

object KiiAnyAuthenticatedUser {
  @scala.inline
  def apply(getID: () => String): KiiAnyAuthenticatedUser = {
    val __obj = js.Dynamic.literal(getID = js.Any.fromFunction0(getID))
    __obj.asInstanceOf[KiiAnyAuthenticatedUser]
  }
}

