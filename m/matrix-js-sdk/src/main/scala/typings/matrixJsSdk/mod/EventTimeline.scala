package typings.matrixJsSdk.mod

import typings.matrixJsSdk.matrixJsSdkStrings.b
import typings.matrixJsSdk.matrixJsSdkStrings.f
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("matrix-js-sdk", "EventTimeline")
@js.native
open class EventTimeline protected () extends StObject {
  def this(eventTimelineSet: EventTimelineSet) = this()
  
  def addEvent(event: MatrixEvent[EventContentTypeMessage, EventType], atStart: Boolean): Unit = js.native
  
  def fork(direction: EventTimelineDirection): EventTimeline = js.native
  
  def forkLive(direction: EventTimelineDirection): EventTimeline = js.native
  
  def getBaseIndex(): Double = js.native
  
  def getEvents(): js.Array[MatrixEvent[EventContentTypeMessage, EventType]] = js.native
  
  def getFilter(): Filter = js.native
  
  def getNeighbouringTimeline(direction: EventTimelineDirection): EventTimeline | Null = js.native
  
  def getPaginationToken(direction: EventTimelineDirection): String | Null = js.native
  
  def getRoomId(): String = js.native
  
  def getState(direction: EventTimelineDirection): RoomState = js.native
  
  def getTimelineSet(): EventTimelineSet = js.native
  
  def initialiseState(stateEvents: js.Array[MatrixEvent[EventContentTypeMessage, EventType]]): Unit = js.native
  
  def load(): js.Promise[Unit] = js.native
  def load(initialEventId: String): js.Promise[Unit] = js.native
  def load(initialEventId: String, initialWindowSize: Double): js.Promise[Unit] = js.native
  def load(initialEventId: Unit, initialWindowSize: Double): js.Promise[Unit] = js.native
  
  def removeEvent(eventId: String): (MatrixEvent[EventContentTypeMessage, EventType]) | Null = js.native
  
  def setNeighbouringTimeline(neighbour: EventTimeline, direction: EventTimelineDirection): Unit = js.native
  
  def setPaginationToken(token: String, direction: EventTimelineDirection): Unit = js.native
  def setPaginationToken(token: Null, direction: EventTimelineDirection): Unit = js.native
}
/* static members */
object EventTimeline {
  
  @JSImport("matrix-js-sdk", "EventTimeline")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("matrix-js-sdk", "EventTimeline.BACKWARDS")
  @js.native
  def BACKWARDS: b = js.native
  inline def BACKWARDS_=(x: b): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BACKWARDS")(x.asInstanceOf[js.Any])
  
  @JSImport("matrix-js-sdk", "EventTimeline.FORWARDS")
  @js.native
  def FORWARDS: f = js.native
  inline def FORWARDS_=(x: f): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FORWARDS")(x.asInstanceOf[js.Any])
  
  inline def setEventMetadata(
    event: MatrixEvent[EventContentTypeMessage, EventType],
    stateContext: RoomState,
    toStartOfTimeline: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setEventMetadata")(event.asInstanceOf[js.Any], stateContext.asInstanceOf[js.Any], toStartOfTimeline.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
