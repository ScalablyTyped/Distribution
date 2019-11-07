package typings.libraDashCore.libAtGeneratedEventsUnderscorePbMod

import typings.googleDashProtobuf.googleDashProtobufMod.Message
import typings.libraDashCore.libAtGeneratedAccessUnderscorePathUnderscorePbMod.AccessPath
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("libra-core/lib/@/generated/events_pb", "Event")
@js.native
class Event_ () extends Message {
  def clearAccessPath(): Unit = js.native
  def getAccessPath(): js.UndefOr[AccessPath] = js.native
  def getEventData(): Uint8Array | String = js.native
  def getEventData_asB64(): String = js.native
  def getEventData_asU8(): Uint8Array = js.native
  def getSequenceNumber(): String = js.native
  def hasAccessPath(): Boolean = js.native
  def setAccessPath(): Unit = js.native
  def setAccessPath(value: AccessPath): Unit = js.native
  def setEventData(value: String): Unit = js.native
  def setEventData(value: Uint8Array): Unit = js.native
  def setSequenceNumber(value: String): Unit = js.native
}

