package typings.kiiCloudSdk.global.KiiCloud

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represent any authenticated user for setting the ACL of an object. This will include anyone using the application who has registered and authenticated in the current session.
  *
  *     When retrieving ACL from an object, test for this class to determine the subject type. Example:
  */
@JSGlobal("KiiCloud.KiiAnyAuthenticatedUser")
@js.native
class KiiAnyAuthenticatedUser ()
  extends StObject
     with typings.kiiCloudSdk.KiiCloud.KiiAnyAuthenticatedUser {
  
  /**
    * Returns the ID of AuthenticatedUser user.
    */
  /* CompleteClass */
  override def getID(): String = js.native
}
