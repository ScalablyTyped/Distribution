package typings.matrixJsSdk.mod

import typings.node.eventsMod.EventEmitter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("matrix-js-sdk", "EventTimelineSet")
@js.native
open class EventTimelineSet protected () extends EventEmitter {
  def this(room: Null, opts: typings.matrixJsSdk.anon.Filter) = this()
  def this(room: Room, opts: typings.matrixJsSdk.anon.Filter) = this()
  
  def addEventToTimeline(
    event: MatrixEvent[EventContentTypeMessage, EventType],
    timeline: EventTimeline,
    toStartOfTimeline: Boolean,
    fromCache: Boolean
  ): Unit = js.native
  
  def addEventsToTimeline(
    events: js.Array[MatrixEvent[EventContentTypeMessage, EventType]],
    toStartOfTimeline: Boolean,
    timeline: EventTimeline
  ): Unit = js.native
  def addEventsToTimeline(
    events: js.Array[MatrixEvent[EventContentTypeMessage, EventType]],
    toStartOfTimeline: Boolean,
    timeline: EventTimeline,
    paginationToken: String
  ): Unit = js.native
  
  def addLiveEvent(
    event: MatrixEvent[EventContentTypeMessage, EventType],
    duplicateStrategy: String,
    fromCache: Boolean
  ): Unit = js.native
  def addLiveEvent(
    event: MatrixEvent[EventContentTypeMessage, EventType],
    duplicateStrategy: Null,
    fromCache: Boolean
  ): Unit = js.native
  
  def addTimeline(): EventTimeline = js.native
  
  def aggregateRelations(event: MatrixEvent[EventContentTypeMessage, EventType]): Unit = js.native
  
  def compareEventOrdering(eventId1: String, eventId2: String): Double | Null = js.native
  
  def eventIdToTimeline(eventId: String): EventTimeline = js.native
  
  def findEventById(eventId: String): js.UndefOr[MatrixEvent[EventContentTypeMessage, EventType]] = js.native
  
  def getFilter(): Filter | Null = js.native
  
  def getLiveTimeline(): EventTimeline = js.native
  
  def getPendingEvents(): js.Array[MatrixEvent[EventContentTypeMessage, EventType]] = js.native
  
  def getRelationsForEvent(eventId: String, relationType: String, eventType: String): js.UndefOr[Relations] = js.native
  
  def getTimelineForEvent(eventId: String): EventTimeline = js.native
  
  def getTimelines(): js.Array[EventTimeline] = js.native
  
  def handleRemoteEcho(
    localEvent: MatrixEvent[EventContentTypeMessage, EventType],
    oldEventId: String,
    newEventId: String
  ): Unit = js.native
  
  def removeEvent(eventId: String): (MatrixEvent[EventContentTypeMessage, EventType]) | Null = js.native
  
  def replaceEventId(oldEventId: String, newEventId: String): Unit = js.native
  
  def resetLiveTimeline(): Unit = js.native
  def resetLiveTimeline(backPaginationToken: String): Unit = js.native
  def resetLiveTimeline(backPaginationToken: String, forwardPaginationToken: String): Unit = js.native
  def resetLiveTimeline(backPaginationToken: Unit, forwardPaginationToken: String): Unit = js.native
  
  def setFilter(filter: Filter): Unit = js.native
  
  def setRelationsTarget(event: MatrixEvent[EventContentTypeMessage, EventType]): Unit = js.native
}
