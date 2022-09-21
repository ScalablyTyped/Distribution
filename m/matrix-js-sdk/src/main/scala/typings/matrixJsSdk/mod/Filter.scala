package typings.matrixJsSdk.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("matrix-js-sdk", "Filter")
@js.native
open class Filter protected () extends StObject {
  def this(userId: String) = this()
  def this(userId: String, // The user ID for this filter.
  filterId: String) = this()
  
  def filterRoomTimeline(events: MatrixEvent[EventContentTypeMessage, EventType]): js.Array[MatrixEvent[EventContentTypeMessage, EventType]] = js.native
  
  def getDefinition(): js.Object = js.native
  
  def getFilterId(): Null | Double = js.native
  
  def getRoomTimelineFilterComponent(): FilterComponent = js.native
  
  def setDefinition(definition: js.Object): Unit = js.native
  
  def setIncludeLeaveRooms(includeLeave: Boolean): Unit = js.native
  
  def setTimelineLimit(limit: Double): Unit = js.native
}
/* static members */
object Filter {
  
  @JSImport("matrix-js-sdk", "Filter")
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromJson(userId: String, filterId: String, jsonObj: js.Object): Filter = (^.asInstanceOf[js.Dynamic].applyDynamic("fromJson")(userId.asInstanceOf[js.Any], filterId.asInstanceOf[js.Any], jsonObj.asInstanceOf[js.Any])).asInstanceOf[Filter]
}
