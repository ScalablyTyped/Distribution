package typings.kiiCloudSdk.global.KiiCloud

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represent an anonymous user for setting the ACL of an object. This will include anyone using the application but have not signed up or authenticated as registered user.
  *
  *     When retrieving ACL from an object, test for this class to determine the subject type.
  */
@JSGlobal("KiiCloud.KiiAnonymousUser")
@js.native
open class KiiAnonymousUser ()
  extends StObject
     with typings.kiiCloudSdk.KiiCloud.KiiAnonymousUser {
  
  /**
    * Returns the ID of Anonymous user.
    */
  /* CompleteClass */
  override def getID(): String = js.native
}
