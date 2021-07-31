package typings.matrixAppserviceBridge.mod

import typings.matrixAppserviceBridge.matrixMod.MatrixRoomData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("matrix-appservice-bridge", "MatrixRoom")
@js.native
class MatrixRoom protected ()
  extends typings.matrixAppserviceBridge.matrixMod.MatrixRoom {
  /**
    * Create a matrix room.
    * @param roomId The room ID
    * @param data The room ID
    */
  def this(roomId: String) = this()
  def this(roomId: String, data: MatrixRoomData) = this()
}
