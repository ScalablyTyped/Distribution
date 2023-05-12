package typings.matrixOrgMatrixSdkCryptoNodejs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@matrix-org/matrix-sdk-crypto-nodejs", "RoomId")
@js.native
open class RoomId protected () extends StObject {
  /** Parse/validate and create a new `RoomId`. */
  def this(id: String) = this()
  
  /** Returns the user's localpart. */
  def localpart: String = js.native
  
  /** Returns the server name of the room ID. */
  def serverName: ServerName = js.native
}
