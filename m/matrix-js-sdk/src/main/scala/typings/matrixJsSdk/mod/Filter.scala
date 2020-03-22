package typings.matrixJsSdk.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("matrix-js-sdk", "Filter")
@js.native
class Filter protected () extends js.Object {
  def this(  // The user ID for this filter.
  userId: String) = this()
  def this(  // The user ID for this filter.
  userId: String, filterId: String) = this()
  def filterRoomTimeline(events: MatrixEvent): js.Array[MatrixEvent] = js.native
  def getDefinition(): js.Object = js.native
  def getFilterId(): Null | Double = js.native
  def getRoomTimelineFilterComponent(): FilterComponent = js.native
  def setDefinition(definition: js.Object): Unit = js.native
  def setIncludeLeaveRooms(includeLeave: Boolean): Unit = js.native
  def setTimelineLimit(limit: Double): Unit = js.native
}

/* static members */
@JSImport("matrix-js-sdk", "Filter")
@js.native
object Filter extends js.Object {
  def fromJson(userId: String, filterId: String, jsonObj: js.Object): Filter = js.native
}

