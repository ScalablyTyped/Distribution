package typings.matrixOrgMatrixSdkCryptoNodejs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@matrix-org/matrix-sdk-crypto-nodejs", "UserId")
@js.native
open class UserId protected () extends StObject {
  /** Parse/validate and create a new `UserId`. */
  def this(id: String) = this()
  
  /**
    * Whether this user ID is a historical one.
    *
    * A historical user ID is one that doesn't conform to the latest
    * specification of the user ID grammar but is still accepted
    * because it was previously allowed.
    */
  def isHistorical(): Boolean = js.native
  
  /** Returns the user's localpart. */
  def localpart: String = js.native
  
  /** Returns the server name of the user ID. */
  def serverName: ServerName = js.native
}
