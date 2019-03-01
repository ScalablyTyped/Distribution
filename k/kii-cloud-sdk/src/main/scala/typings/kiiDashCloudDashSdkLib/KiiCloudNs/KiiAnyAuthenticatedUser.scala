package typings
package kiiDashCloudDashSdkLib.KiiCloudNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represent any authenticated user for setting the ACL of an object. This will include anyone using the application who has registered and authenticated in the current session.
  *
  * 	When retrieving ACL from an object, test for this class to determine the subject type. Example:
  */
@JSGlobal("KiiCloud.KiiAnyAuthenticatedUser")
@js.native
class KiiAnyAuthenticatedUser () extends KiiACLSubject {
  /**
    * Returns the ID of AuthenticatedUser user.
    */
  def getID(): java.lang.String = js.native
}

