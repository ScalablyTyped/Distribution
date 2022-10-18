package typings.matrixAppserviceBridge.mod

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("matrix-appservice-bridge", "RemoteRoom")
@js.native
open class RemoteRoom protected ()
  extends typings.matrixAppserviceBridge.libModelsRoomsRemoteMod.RemoteRoom {
  /**
    * Create a remote room.
    * @param identifier The ID for this room
    * @param data The key-value data object to assign to this room.
    */
  def this(roomId: String) = this()
  def this(roomId: String, data: Record[String, Any]) = this()
}
