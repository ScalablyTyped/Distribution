package typings.libraCore.eventsPbMod

import typings.googleProtobuf.mod.Message
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("libra-core/lib/@/generated/events_pb", "EventsList")
@js.native
class EventsList_ () extends Message {
  def addEvents(): Event = js.native
  def addEvents(value: js.UndefOr[scala.Nothing], index: Double): Event = js.native
  def addEvents(value: Event): Event = js.native
  def addEvents(value: Event, index: Double): Event = js.native
  def clearEventsList(): Unit = js.native
  def getEventsList(): js.Array[Event] = js.native
  def setEventsList(value: js.Array[Event]): Unit = js.native
}

