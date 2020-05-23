package typings.kiiCloudSdk.KiiCloud

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represent an anonymous user for setting the ACL of an object. This will include anyone using the application but have not signed up or authenticated as registered user.
  *
  *     When retrieving ACL from an object, test for this class to determine the subject type.
  */
trait KiiAnonymousUser extends KiiACLSubject {
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
}

