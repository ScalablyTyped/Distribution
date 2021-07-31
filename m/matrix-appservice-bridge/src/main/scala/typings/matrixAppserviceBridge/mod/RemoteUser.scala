package typings.matrixAppserviceBridge.mod

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("matrix-appservice-bridge", "RemoteUser")
@js.native
class RemoteUser protected ()
  extends typings.matrixAppserviceBridge.usersRemoteMod.RemoteUser {
  /**
    * @param identifier The unique ID for this user.
    * @param data The serialized key-value data object to assign to this user.
    * @throws If identifier is not supplied.
    */
  def this(id: String) = this()
  def this(id: String, data: Record[String, js.Any]) = this()
}
