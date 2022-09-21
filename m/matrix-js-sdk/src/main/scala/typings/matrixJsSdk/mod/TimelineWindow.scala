package typings.matrixJsSdk.mod

import typings.matrixJsSdk.anon.WindowLimit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("matrix-js-sdk", "TimelineWindow")
@js.native
open class TimelineWindow protected () extends StObject {
  def this(client: MatrixClient, timelineSet: EventTimelineSet) = this()
  def this(client: MatrixClient, timelineSet: EventTimelineSet, opts: WindowLimit) = this()
  
  def canPaginate(direction: EventTimelineDirection): Boolean = js.native
  
  def extend(direction: EventTimelineDirection, size: Double): Boolean = js.native
  
  def getEvents(): js.Array[MatrixEvent[EventContentTypeMessage, EventType]] = js.native
  
  def getTimelineIndex(direction: EventTimelineDirection): TimelineIndex | Null = js.native
  
  def load(): js.Promise[Unit] = js.native
  def load(initialEventId: String): js.Promise[Unit] = js.native
  def load(initialEventId: String, initialWindowSize: Double): js.Promise[Unit] = js.native
  def load(initialEventId: Unit, initialWindowSize: Double): js.Promise[Unit] = js.native
  
  def paginate(direction: EventTimelineDirection, size: Double): js.Promise[Boolean] = js.native
  def paginate(direction: EventTimelineDirection, size: Double, makeRequest: Boolean): js.Promise[Boolean] = js.native
  def paginate(direction: EventTimelineDirection, size: Double, makeRequest: Boolean, requestLimit: Double): js.Promise[Boolean] = js.native
  def paginate(direction: EventTimelineDirection, size: Double, makeRequest: Unit, requestLimit: Double): js.Promise[Boolean] = js.native
  
  def unpaginate(delta: Double, startOfTimeline: Boolean): Unit = js.native
}
