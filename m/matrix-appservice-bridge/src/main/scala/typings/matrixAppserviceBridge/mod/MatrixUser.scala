package typings.matrixAppserviceBridge.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("matrix-appservice-bridge", "MatrixUser")
@js.native
class MatrixUser protected () extends js.Object {
  def this(userId: String) = this()
  def this(userId: String, dataopt: js.Object) = this()
  def this(userId: String, dataopt: js.UndefOr[scala.Nothing], escape: Boolean) = this()
  def this(userId: String, dataopt: js.Object, escape: Boolean) = this()
  val host: String = js.native
  val localpart: String = js.native
  var userId: String = js.native
  def escapeUserId(): Unit = js.native
  def get(key: String): js.Object = js.native
  def getDisplayName(): Null | String = js.native
  def getId(): String = js.native
  def serialize(): js.Object = js.native
  def set(key: String, `val`: js.Any): Unit = js.native
  def setDisplayName(name: String): Unit = js.native
}

