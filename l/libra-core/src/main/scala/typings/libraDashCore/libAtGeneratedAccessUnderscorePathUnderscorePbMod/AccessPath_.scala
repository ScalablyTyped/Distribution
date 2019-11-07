package typings.libraDashCore.libAtGeneratedAccessUnderscorePathUnderscorePbMod

import typings.googleDashProtobuf.googleDashProtobufMod.Message
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("libra-core/lib/@/generated/access_path_pb", "AccessPath")
@js.native
class AccessPath_ () extends Message {
  def getAddress(): Uint8Array | String = js.native
  def getAddress_asB64(): String = js.native
  def getAddress_asU8(): Uint8Array = js.native
  def getPath(): Uint8Array | String = js.native
  def getPath_asB64(): String = js.native
  def getPath_asU8(): Uint8Array = js.native
  def setAddress(value: String): Unit = js.native
  def setAddress(value: Uint8Array): Unit = js.native
  def setPath(value: String): Unit = js.native
  def setPath(value: Uint8Array): Unit = js.native
}

