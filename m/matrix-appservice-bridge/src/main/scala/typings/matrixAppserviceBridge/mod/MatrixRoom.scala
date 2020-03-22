package typings.matrixAppserviceBridge.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("matrix-appservice-bridge", "MatrixRoom")
@js.native
class MatrixRoom protected () extends js.Object {
  def this(roomId: String) = this()
  var roomId: String = js.native
  def deserialize(data: js.Object): Unit = js.native
  def get(key: String): js.Object = js.native
  def getId(): String = js.native
  def serialize(): js.Object = js.native
  def set(key: String, `val`: js.Any): Unit = js.native
}

